package org.forritan.talvmenni.knowledge.evaluation;

import java.util.Iterator;
import java.util.List;

import org.forritan.talvmenni.TalvMenni;
import org.forritan.talvmenni.knowledge.HistoryHeuristic;
import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Position.Move;
import org.forritan.talvmenni.search.AlphaBetaSearch;
import org.forritan.talvmenni.search.PrincipalVariation;


public class QuiescentWithNullMove {

   private HistoryHeuristic historyHeuristic;
   private int              maxDepth;
   private AlphaBetaSearch  search;

   private int              movesSearched;
   private int              transpositionHits;

   public QuiescentWithNullMove(
         int maxDepth) {
      this.maxDepth= maxDepth;
      this.search= new AlphaBetaSearch();
      this.historyHeuristic= HistoryHeuristic.getInstance();
   }

   public int search(
         Position p,
         Evaluation e,
         boolean whiteMove,
         int ply,
         int alpha,
         int beta) {

      if ((whiteMove ? p.getWhite().isInCheck() : p.getBlack().isInCheck()))
            return this.search.alphaBeta(
                  p,
                  e,
                  whiteMove,
                  1,
                  alpha,
                  beta);

      int score= (e.getScore(p) * (whiteMove ? 1 : -1));

      if ((ply - 1 - TalvMenni.NULL_MOVE_REDUCTION) >= 0) {
         int nullMoveScore= -this.search.alphaBeta(
               p,
               e,
               !whiteMove,
               ply
                     - 1
                     - TalvMenni.NULL_MOVE_REDUCTION,
               -beta,
               -beta + 1);
         if (nullMoveScore >= beta) return beta;
      }

      if ((this.maxDepth + ply) > 0) {

         if (score >= beta) { return beta; }

         if (score > alpha) {
            alpha= score;
         }

         List moves;

         if (whiteMove) {
            //            this.historyHeuristic.sortMoveList(p.getWhite());
            moves= p.getWhite().getPossibleCaptureMoves();
         } else {
            //            this.historyHeuristic.sortMoveList(p.getBlack());
            moves= p.getBlack().getPossibleCaptureMoves();
         }

         if (moves.size() > 0) {
            for (Iterator it= moves.iterator(); it.hasNext();) {
               Move move= (Move) it.next();
               //               this.movesSearched++;
               //               this.pv.push(move);

               p= p.move(move);

               int movesSearchedBefore= this.movesSearched;
               long moveTime= -System.currentTimeMillis();
               score= -search(
                     p,
                     e,
                     !whiteMove,
                     ply - 1,
                     -beta,
                     -alpha);

               //               this.pv.pop();

               p.popMove();

               if (score >= beta) { return beta; }

               moveTime+= System.currentTimeMillis();

               if (score > alpha) {
                  alpha= score;

                  //                  this.pv.updatePV(
                  //                        this.pv.getDepth() + (-ply),
                  //                        moveTime,
                  //                        (this.movesSearched - movesSearchedBefore),
                  //                        (alpha * (whiteMove ? 1 : -1)));

                  //                  this.historyHeuristic.updateWithSufficient(
                  //                        move,
                  //                        0); // i.e.: add only 1 to this move
               }
            }
         } else {
            alpha= score; //TODO: ????? Skal tað vera so???
         }
         return alpha;
      } else {
         return score;
      }
   }
}