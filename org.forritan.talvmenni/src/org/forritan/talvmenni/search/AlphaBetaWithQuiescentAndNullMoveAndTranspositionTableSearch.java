package org.forritan.talvmenni.search;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.forritan.talvmenni.TalvMenni;
import org.forritan.talvmenni.knowledge.HistoryHeuristic;
import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Transposition;
import org.forritan.talvmenni.knowledge.Position.Move;
import org.forritan.talvmenni.knowledge.Transposition.Entry;
import org.forritan.talvmenni.knowledge.evaluation.Evaluation;
import org.forritan.talvmenni.knowledge.evaluation.QuiescentWithNullMove;
import org.forritan.talvmenni.search.PrincipalVariation.DebugInfo;
import org.forritan.talvmenni.search.PrincipalVariation.Thinking;


public class AlphaBetaWithQuiescentAndNullMoveAndTranspositionTableSearch
      implements Search {

   private int lastScore;

   public int getLastScore() {
      return this.lastScore;
   }

   private PrincipalVariation    pv;
   private HistoryHeuristic      historyHeuristic;
   private Transposition         transposition;
   private int                   ply;
   private boolean               useMoveOrdering;
   private QuiescentWithNullMove quiescent;

   private int                   movesSearched;
   private int                   transpositionHits;

   public AlphaBetaWithQuiescentAndNullMoveAndTranspositionTableSearch(
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

   public AlphaBetaWithQuiescentAndNullMoveAndTranspositionTableSearch(
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

   public PrincipalVariation getPrincipalVariation() {
      return this.pv;
   }

   public Thinking getThinking() {
      return this.pv.getThinking();
   }

   public DebugInfo getDebugInfo() {
      return this.pv.getDebugInfo();
   }

public List getBestMoves(
         Position p,
         Evaluation e,
         boolean whiteMove) {

      long time= -System.currentTimeMillis();
      this.movesSearched= 0;
      this.transpositionHits= 0;

      int alpha= Integer.MIN_VALUE + 1;
      // Very important!!! Can't be
      // Integer.MIN_VALUE, because
      // Integer.MIN_VALUE ==
      // -Integer.MIN_VALUE

      //      int beta= Integer.MAX_VALUE;
      // If checkmate there is no need to search further...
      int beta= Evaluation.CHECKMATE_SCORE;

      this.pv.clearPrincipalVariation();

      //      System.err.println("Possible moves: " + (whiteMove ?
      // p.getWhite().getPossibleMoves().toString() :
      // p.getBlack().getPossibleMoves().toString()));

      int result= this.alphaBeta(
            p,
            e,
            whiteMove,
            this.ply,
            alpha,
            beta);

      this.lastScore= result;

      time+= System.currentTimeMillis();

      //      System.err.println("*** at ply = "
      //            + ply
      //            + " : best result = "
      //            + result
      //            + " : AlphaBetaWithTranspositionTableSearch ***");
      //
      //      System.err.println("White transposition: " +
      // this.transposition.size(true));
      //      System.err.println("Black transposition: " +
      // this.transposition.size(false));
      //      
      //      System.err.println();

      this.pv.getDebugInfo().postNodesPerSecond(
            time,
            this.movesSearched);

      this.pv.getDebugInfo().postBestMoves(
            this.pv.getCurrentBestLine());

      this.pv.getDebugInfo().postText(
            "Moveordering in position:"
                  + (whiteMove ? p.getWhite().getPossibleMoves().toString() : p
                        .getBlack().getPossibleMoves().toString()));

      this.pv.getDebugInfo().postTranspositionHits(
            this.transpositionHits);
      
      List moves=  (whiteMove ? p.getWhite().getPossibleMoves() : p
            .getBlack().getPossibleMoves());
      
      List bestMoves= new ArrayList();
      
      if(moves.size() > 1) {
         bestMoves.addAll(moves.subList(0, 1));
         bestMoves.addAll(moves.subList(0, 1));
         bestMoves.addAll(moves.subList(0, 1));
         bestMoves.addAll(moves.subList(0, 1));
         bestMoves.addAll(moves.subList(0, 2));
      } else {
         bestMoves.addAll(moves);
      }

      return bestMoves;

//      return (pv.getBestMoveAsList());

   }   public int alphaBeta(
         Position p,
         Evaluation e,
         boolean whiteMove,
         int ply,
         int alpha,
         int beta) {

      int result;

      if (ply < this.ply) {
         if (this.transposition.contains(
               p,
               whiteMove)) {
            Entry entry= this.transposition.get(
                  p,
                  whiteMove);
            if (entry.depthToLeaf >= ply) {
               this.transpositionHits++;
               this.pv.updateLastExaminedLine();
               if ((entry.type & Transposition.Entry.Type.EXACT) != 0) { return entry.exactScore; }
               if ((entry.type & Transposition.Entry.Type.LOWER_BOUND) != 0) {
                  if (entry.lowerBound >= beta) { return beta; }
               }
               if ((entry.type & Transposition.Entry.Type.UPPER_BOUND) != 0) {
                  if (entry.upperBound <= alpha) { return alpha; }
               }
            }
         }
      }

      if (ply == 0) {
         result= this.quiescent.search(
               p,
               e,
               whiteMove,
               ply,
               alpha,
               beta);
         this.pv.updateLastExaminedLine();
      } else {

         if ((ply - 1 - TalvMenni.NULL_MOVE_REDUCTION) >= 0) {
            int nullMoveScore= -this.alphaBeta(
                  p,
                  e,
                  !whiteMove,
                  ply
                        - 1
                        - TalvMenni.NULL_MOVE_REDUCTION,
                  -beta,
                  -beta + 1);
            if (nullMoveScore >= beta) { return beta; }
         }

         List moves;
         int best= Integer.MIN_VALUE + 1;

         if (whiteMove) {
            this.historyHeuristic.sortMoveList(p.getWhite());
            p.getWhite().updateMoveOrderingCapturesFirst();
            moves= p.getWhite().getPossibleMoves();
         } else {
            this.historyHeuristic.sortMoveList(p.getBlack());
            p.getBlack().updateMoveOrderingCapturesFirst();
            moves= p.getBlack().getPossibleMoves();
         }

         if (moves.size() > 0) {
            for (Iterator it= moves.iterator(); it.hasNext();) {
               Move move= (Move) it.next();
               if (best >= beta) {
                  break;
               }
               this.movesSearched++;

               int movesSearchedBefore= this.movesSearched;
               long moveTime= -System.currentTimeMillis();
               p= p.move(move);
               if (best > alpha) {
                  alpha= best;
               }

               this.pv.push(move);
               //               Draw.getInstance().push(p);

               int score= -alphaBeta(
                     p,
                     e,
                     !whiteMove,
                     ply - 1,
                     -beta,
                     -alpha);

               //               Draw.getInstance().pop();
               this.pv.pop();
               p.popMove();

               moveTime+= System.currentTimeMillis();

               if (score > best) {
                  best= score;
                  this.pv.updatePV(
                        ply,
                        moveTime,
                        (this.movesSearched - movesSearchedBefore),
                        (best * (whiteMove ? 1 : -1)));

                  if (this.useMoveOrdering) {
                     if (whiteMove) {
                        p.getWhite().betterMove(
                              move);
                     } else {
                        p.getBlack().betterMove(
                              move);
                     }
                  }
                  this.historyHeuristic.updateWithSufficient(
                        move,
                        ply);
               }
            }

            if (this.useMoveOrdering) {
               p.getWhite().updatePossibleMovesOrdering();
               p.getBlack().updatePossibleMovesOrdering();
            }

            result= best;
         } else {
            if (whiteMove ? p.getWhite().isInCheck() : p.getBlack().isInCheck()) {
               // Checkmate...
               result= -(Evaluation.CHECKMATE_SCORE + ply);
            } else {
               // Stalemate...
               result= 0;
            }
            this.pv.updateLastExaminedLine();
         }
      }

      this.transposition.update(
            p,
            whiteMove,
            result,
            ply,
            Transposition.Entry.Type.EXACT);

      return result;
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