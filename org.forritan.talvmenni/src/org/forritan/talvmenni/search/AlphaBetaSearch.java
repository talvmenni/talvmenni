package org.forritan.talvmenni.search;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.forritan.talvmenni.knowledge.HistoryHeuristic;
import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Position.Move;
import org.forritan.talvmenni.knowledge.evaluation.Evaluation;
import org.forritan.talvmenni.search.PrincipalVariation.DebugInfo;
import org.forritan.talvmenni.search.PrincipalVariation.Thinking;


public class AlphaBetaSearch implements Search {

   private int lastScore;

   public int getLastScore() {
      return this.lastScore;
   }

   private PrincipalVariation pv;
   private HistoryHeuristic   historyHeuristic;
   private int                ply;
   private int                movesSearched;

   public AlphaBetaSearch() {
      this(
            0);
   }

   public AlphaBetaSearch(
         int ply) {
      this.ply= ply;
      this.pv= PrincipalVariation.Factory.create(ply);
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

      int alpha= Integer.MIN_VALUE + 1;
      // Very important!!! Can't be
      // Integer.MIN_VALUE, because
      // Integer.MIN_VALUE ==
      // -Integer.MIN_VALUE

      // int beta= Integer.MAX_VALUE;
      // If checkmate there is no need to search further...
      int beta= Evaluation.CHECKMATE_SCORE;

      int result= this.alphaBeta(
            p,
            e,
            whiteMove,
            this.ply,
            alpha,
            beta);

      this.lastScore= result;

      time+= System.currentTimeMillis();

      System.err.println("*** at ply = "
            + ply
            + " : best result = "
            + result
            + " : AlphaBetaSearch ***");

      this.pv.getDebugInfo().postNodesPerSecond(
            time,
            this.movesSearched);
      this.pv.getDebugInfo().postBestMoves(
            this.pv.getCurrentBestLine());

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
                  if (whiteMove) {
                     p.getWhite().betterMove(
                           move);
                  } else {
                     p.getBlack().betterMove(
                           move);
                  }
                  this.historyHeuristic.updateWithSufficient(
                        move,
                        ply);
               }
            }

            p.getWhite().updatePossibleMovesOrdering();
            p.getBlack().updatePossibleMovesOrdering();

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

      return result;
   }
   public HistoryHeuristic getHistoryHeuristic() {
      return historyHeuristic;
   }
   public void setHistoryHeuristic(
         HistoryHeuristic historyHeuristic) {
      this.historyHeuristic= historyHeuristic;
   }
}