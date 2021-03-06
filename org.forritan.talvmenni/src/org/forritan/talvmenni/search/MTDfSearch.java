/**
 * talvmenni - A distributed chess-engine implemented in Java(TM)
 * and against Sun Microsystems Jini/JavaSpaces(TM).
 *  
 * Copyright (C) 2004-2006 Ey?un Lamhauge and Ey?un Nielsen
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License. 
 */

package org.forritan.talvmenni.search;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.forritan.talvmenni.knowledge.HistoryHeuristic;
import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Transposition;
import org.forritan.talvmenni.knowledge.Position.Move;
import org.forritan.talvmenni.knowledge.Transposition.Entry;
import org.forritan.talvmenni.knowledge.evaluation.Evaluation;
import org.forritan.talvmenni.knowledge.evaluation.QuiescentWithNullMove;
import org.forritan.talvmenni.search.PrincipalVariation.DebugInfo;
import org.forritan.talvmenni.search.PrincipalVariation.Thinking;


public class MTDfSearch implements Search {

   private static final long serialVersionUID = 1L;

   private int lastScore;

   public int getLastScore() {
      return this.lastScore;
   }

   private PrincipalVariation    pv;
   private HistoryHeuristic      historyHeuristic;
   private Transposition         transposition;
   private int                   ply;
   private final boolean         useMoveOrdering;
   private QuiescentWithNullMove quiescent;

   private int                   movesSearched;
   private int                   transpositionHits;
   private int                   firstGuess;
   private int                   lastResult;

   public MTDfSearch(
         Transposition transposition,
         boolean useMoveOrdering,
         PrincipalVariation pv,
         int quiescentMaxDepth) {
      this(
            0,
            transposition,
            useMoveOrdering,
            pv,
            quiescentMaxDepth);
   }

   public MTDfSearch(
         int ply,
         Transposition transposition,
         boolean useMoveOrdering,
         PrincipalVariation pv,
         int quiescentMaxDepth) {
      this.ply= ply;
      this.useMoveOrdering= useMoveOrdering;
      this.transposition= transposition;
      this.pv= pv;
      this.historyHeuristic= new HistoryHeuristic();
      this.quiescent= new QuiescentWithNullMove(
            quiescentMaxDepth);
   }

   public void setPly(
         int ply) {
      this.ply= ply;
      this.pv.setDepth(ply);
   }

   public void setFirstGuess(
         int firstGuess) {
      this.firstGuess= firstGuess;
   }

   public int getLastResult() {
      return this.lastResult;
   }

   public PrincipalVariation getPrincipalVariation() {
      return this.pv;
   }

   public Thinking getThinking() {
      return this.pv.getThinking();
   }

   public DebugInfo getDebugInfo() {
      return this.pv.getDebugInfo();
   }

   public List<Move> getBestMoves(
         Position p,
         Evaluation e,
         boolean whiteMove) {

      long time= -System.currentTimeMillis();
      this.movesSearched= 0;
      this.transpositionHits= 0;

      this.pv.clearPrincipalVariation();

      //      System.err.println("Possible moves: "
      //            + (whiteMove ? p.getWhite().getPossibleMoves().toString() : p
      //                  .getBlack().getPossibleMoves().toString()));

      int result= this.mtdf(
            p,
            e,
            whiteMove,
            this.firstGuess,
            ply);

      this.lastScore= result;

      //      System.err.println("*** at ply = "
      //            + ply
      //            + " : best result = "
      //            + result
      //            + " MTDfSearch ***");
      //
      //      System.err.println("White transposition: "
      //            + this.transposition.size(true));
      //      System.err.println("Black transposition: "
      //            + this.transposition.size(false));
      //
      //      System.err.println();

      time+= System.currentTimeMillis();

      this.pv.getDebugInfo().postNodesPerSecond(
            time,
            this.movesSearched);

      this.pv.getDebugInfo().postBestMoves(
            this.pv.getCurrentBestLine());

      this.pv.getDebugInfo().postTranspositionHits(
            this.transpositionHits);

      this.lastResult= result;

      List<Move> moves= (whiteMove ? p.getWhite().getPossibleMoves() : p.getBlack()
            .getPossibleMoves());

      List<Move> bestMoves= new ArrayList<Move>();

      if (moves.size() > 1) {
         bestMoves.addAll(moves.subList(
               0,
               1));
         //         bestMoves.addAll(moves.subList(0, 1));
         //         bestMoves.addAll(moves.subList(0, 1));
         //         bestMoves.addAll(moves.subList(0, 1));
         //         bestMoves.addAll(moves.subList(0, 2));
      } else {
         bestMoves.addAll(moves);
      }

      return bestMoves;

      //      return (pv.getBestMoveAsList());

   }

   public int mtdf(
         Position p,
         Evaluation e,
         boolean whiteMove,
         int f,
         int d) {
      int score= f;

      //      int upperbound= Integer.MAX_VALUE;
      //      int lowerbound= Integer.MIN_VALUE + 1;
      // Very important!!! Can't be
      // Integer.MIN_VALUE, because
      // Integer.MIN_VALUE ==
      // -Integer.MIN_VALUE

      int upperbound= 2 * Evaluation.CHECKMATE_SCORE;
      int lowerbound= -2
            * Evaluation.CHECKMATE_SCORE;

      //      int movesSearchedBefore= this.movesSearched;
      //      long moveTime= -System.currentTimeMillis();

      //      int alphaBetaCalls= 0;
      //      List nullWindowValues= new ArrayList();

      do {
         int beta;
         if (score == lowerbound) {
            beta= score + 1;
         } else {
            beta= score;
         }

         //         alphaBetaCalls++;
         //         nullWindowValues.add(("["
         //               + (beta - 1)
         //               + " - "
         //               + beta + "]"));

         score= this.alphaBetaWithMemory(
               p,
               e,
               whiteMove,
               beta - 1,
               beta,
               d);

         if (score < beta) {
            upperbound= score;
         } else {
            lowerbound= score;
         }
      } while (lowerbound < upperbound);

      //      moveTime+= System.currentTimeMillis();
      //      this.pv.updatePV(
      //            d,
      //            moveTime,
      //            (this.movesSearched - movesSearchedBefore),
      //            score);

      //      System.err.println("Best move: "
      //            + ((Move) this.pv.getBestMoveAsList().get(
      //                  0)));
      //      System.err.println("PV: bestLine: "
      //            + this.pv.getCurrentBestLine().toString());
      //      System.err.println("AlphaBetaCalls: "
      //            + alphaBetaCalls);
      //      System.err.println("Nullwindows called: "
      //            + nullWindowValues.toString());

      //      if (this.useMoveOrdering) {
      //         if (whiteMove) {
      //            p.getWhite().betterMove(
      //                  (Move) this.pv.getBestMoveAsList().get(
      //                        0));
      //         } else {
      //            p.getBlack().betterMove(
      //                  (Move) this.pv.getBestMoveAsList().get(
      //                        0));
      //         }
      //      }

      return score;
   }

   public int alphaBetaWithMemory(
         Position p,
         Evaluation e,
         boolean whiteMove,
         int alpha,
         int beta,
         int d) {

      int g;
      Entry entry;

      if (d < this.ply) {
         if (this.transposition.contains(
               p,
               whiteMove)) {
            entry= this.transposition.get(
                  p,
                  whiteMove);
            if (entry.depthToLeaf >= ply) {
               this.transpositionHits++;
               this.pv.updateLastExaminedLine();

               if ((entry.type & Transposition.Entry.Type.LOWER_BOUND) != 0) {
                  if (entry.lowerBound >= beta) { return entry.lowerBound; }
               }
               if ((entry.type & Transposition.Entry.Type.UPPER_BOUND) != 0) {
                  if (entry.upperBound <= alpha) { return entry.upperBound; }
               }
               if ((entry.type & Transposition.Entry.Type.LOWER_BOUND) != 0) {
                  alpha= Math.max(
                        alpha,
                        entry.lowerBound);
               }
               if ((entry.type & Transposition.Entry.Type.UPPER_BOUND) != 0) {
                  beta= Math.min(
                        beta,
                        entry.upperBound);
               }
            }
         }
      }

      if (d == 0) { // leaf node
      //         g= e.getScore(p);
         g= this.quiescent.search(
               p,
               e,
               whiteMove,
               ply,
               alpha,
               beta);
         this.pv.updateLastExaminedLine();
      } else {
         List moves;
         int whiteBest= Integer.MIN_VALUE + 1;
         int blackBest= Integer.MAX_VALUE;

         if (whiteMove) {
            this.historyHeuristic.sortMoveList(p.getWhite());
            moves= p.getWhite().getPossibleMoves();
         } else {
            this.historyHeuristic.sortMoveList(p.getBlack());
            moves= p.getBlack().getPossibleMoves();
         }

         if (moves.size() > 0) {

            if (whiteMove) { // MAX_NODE

               // g= -2 * Evaluation.CHECKMATE_SCORE;
               g= Integer.MIN_VALUE + 1;
               int a= alpha; // save original alpha value

               Iterator it= moves.iterator();
               while (g < beta
                     && it.hasNext()) {
                  Move move= (Move) it.next();
                  this.movesSearched++;

                  int movesSearchedBefore= this.movesSearched;
                  long moveTime= -System.currentTimeMillis();
                  p= p.move(move);
                  this.pv.push(move);

                  g= Math.max(
                        g,
                        this.alphaBetaWithMemory(
                              p,
                              e,
                              !whiteMove,
                              a,
                              beta,
                              d - 1));
                  a= Math.max(
                        a,
                        g);

                  this.pv.pop();
                  p.popMove();

                  moveTime+= System.currentTimeMillis();

                  if (g > whiteBest) {
                     whiteBest= g;
                     if (ply == this.ply) {
                        this.pv.updatePV(
                              d,
                              moveTime,
                              (this.movesSearched - movesSearchedBefore),
                              g);
                     }
                     if (this.useMoveOrdering) {
                        p.getWhite().betterMove(
                              move);
                     }
                     historyHeuristic.updateWithSufficient(
                           move,
                           ply);
                  }
               }

            } else { // MIN_NODE

               // g= 2 * Evaluation.CHECKMATE_SCORE;
               g= Integer.MAX_VALUE;
//               int best= g;
               int b= beta; // save original alpha value

               Iterator it= moves.iterator();
               while (g > alpha
                     && it.hasNext()) {
                  Move move= (Move) it.next();
                  this.movesSearched++;

                  int movesSearchedBefore= this.movesSearched;
                  long moveTime= -System.currentTimeMillis();
                  p= p.move(move);
                  this.pv.push(move);

                  g= Math.min(
                        g,
                        this.alphaBetaWithMemory(
                              p,
                              e,
                              !whiteMove,
                              alpha,
                              b,
                              d - 1));
                  b= Math.min(
                        b,
                        g);

                  this.pv.pop();

                  p.popMove();

                  moveTime+= System.currentTimeMillis();

                  if (g < blackBest) {
                     blackBest= g;
                     if (ply == this.ply) {
                        this.pv.updatePV(
                              d,
                              moveTime,
                              (this.movesSearched - movesSearchedBefore),
                              g);
                     }
                     if (this.useMoveOrdering) {
                        p.getBlack().betterMove(
                              move);
                     }
                  }
               }
            }

            if (this.useMoveOrdering) {
               p.getWhite().updatePossibleMovesOrdering();
               p.getBlack().updatePossibleMovesOrdering();
            }

            if (g <= alpha) { // Fail low implies an upper bound
               this.transposition.update(
                     p,
                     whiteMove,
                     g,
                     d,
                     Transposition.Entry.Type.UPPER_BOUND);
            }
            if (g > alpha
                  && g < beta) { // Found an accurate minimax value - will not
               // occur if called with zero window
               this.transposition.update(
                     p,
                     whiteMove,
                     g,
                     d,
                     Transposition.Entry.Type.EXACT);
            }
            if (g >= beta) { // Fail high result implies a lower bound
               this.transposition.update(
                     p,
                     whiteMove,
                     g,
                     d,
                     Transposition.Entry.Type.LOWER_BOUND);
            }
         } else {
            if ((whiteMove ? p.getWhite().isInCheck() : p.getBlack()
                  .isInCheck())) {
               // Checkmate...
               g= (Evaluation.CHECKMATE_SCORE + d)
                     * (whiteMove ? -1 : 1);
            } else {
               // Stalemate...
               g= 0;
            }
            this.pv.updateLastExaminedLine();
         }
      }
      return g;
   }
   
   public HistoryHeuristic getHistoryHeuristic() {
      return this.historyHeuristic;
   }
   
   public void setHistoryHeuristic(
         HistoryHeuristic historyHeuristic) {
      this.historyHeuristic= historyHeuristic;
   }
   
   public Transposition getTransposition() {
      return this.transposition;
   }
   
   public void setTransposition(
         Transposition transposition) {
      this.transposition= transposition;
   }

}