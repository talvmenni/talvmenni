package org.forritan.talvmenni.search;

import java.util.Iterator;
import java.util.List;

import org.forritan.talvmenni.knowledge.HistoryHeuristic;
import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Transposition;
import org.forritan.talvmenni.knowledge.Position.Move;
import org.forritan.talvmenni.knowledge.Transposition.Entry;
import org.forritan.talvmenni.knowledge.evaluation.Evaluation;
import org.forritan.talvmenni.search.PrincipalVariation.DebugInfo;
import org.forritan.talvmenni.search.PrincipalVariation.Thinking;


public class AlphaBetaWithTranspositionTableSearch implements Search {

   private int lastScore;
   private int finalAlpha;
   private int finalBeta;

   public int getLastScore() {
      return this.lastScore;
   }

   private PrincipalVariation         pv;
   private transient HistoryHeuristic historyHeuristic;
   private transient Transposition    transposition;
   private int                        ply;
   private final boolean              useMoveOrdering;

   private int                        movesSearched;
   private int                        transpositionHits;

   public AlphaBetaWithTranspositionTableSearch(
         Transposition transposition,
         boolean useMoveOrdering,
         PrincipalVariation pv) {
      this(
            0,
            transposition,
            useMoveOrdering,
            pv);
   }

   public AlphaBetaWithTranspositionTableSearch(
         int ply,
         Transposition transposition,
         boolean useMoveOrdering,
         PrincipalVariation pv) {
      this.ply= ply;
      this.useMoveOrdering= useMoveOrdering;
      this.transposition= transposition;
      this.pv= pv;
      this.historyHeuristic= new HistoryHeuristic();
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

      // If checkmate there is no need to search further...
      int alpha= -Evaluation.CHECKMATE_SCORE;      
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

      this.pv.getDebugInfo().postTranspositionHits(
            this.transpositionHits);

      return (pv.getBestMoveAsList());

   }

   public int alphaBeta(
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
         result= (e.getScore(
               p,
               whiteMove) * (whiteMove ? 1 : -1));
         this.pv.updateLastExaminedLine();
      } else {
         List moves;
         int best= Integer.MIN_VALUE + 1;

         if (whiteMove) {
            this.historyHeuristic.sortMoveList(p.getWhite());
            moves= p.getWhite().getPossibleMoves();
         } else {
            this.historyHeuristic.sortMoveList(p.getBlack());
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

               int score= -alphaBeta(
                     p,
                     e,
                     !whiteMove,
                     ply - 1,
                     -beta,
                     -alpha);

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

      this.finalAlpha= alpha;
      this.finalBeta= beta;

      return result;
   }

   public Transposition getTransposition() {
      return this.transposition;
   }
   
   public void setTransposition(
         Transposition transposition) {
      this.transposition= transposition;
   }
   
   public HistoryHeuristic getHistoryHeuristic() {
      return this.historyHeuristic;
   }
   
   public void setHistoryHeuristic(
         HistoryHeuristic historyHeuristic) {
      this.historyHeuristic= historyHeuristic;
   }

   public int getFinalAlpha() {
      return this.finalAlpha;
   }

   public int getFinalBeta() {
      return this.finalBeta;
   }

}