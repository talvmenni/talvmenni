package org.forritan.talvmenni.knowledge.evaluation;

import java.util.Iterator;
import java.util.List;

import org.forritan.talvmenni.knowledge.HistoryHeuristic;
import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Position.Bitboard;
import org.forritan.talvmenni.knowledge.Position.Move;
import org.forritan.talvmenni.knowledge.Transposition.Entry;
import org.forritan.talvmenni.search.AlphaBetaSearch;
import org.forritan.talvmenni.search.PrincipalVariation;


public class Quiescent {

//   private PrincipalVariation pv;
   private HistoryHeuristic   historyHeuristic;
   private int                maxDepth;
   private AlphaBetaSearch    search;

   private int                movesSearched;
   private int                transpositionHits;

   public Quiescent(
         PrincipalVariation pv,
         int maxDepth) {
      this.maxDepth= maxDepth;
      this.search= new AlphaBetaSearch();
//      this.pv= pv;
      this.historyHeuristic= HistoryHeuristic.getInstance();
   }

   public int search(
         Position p,
         Evaluation e,
         boolean whiteMove,
         int ply,
         int alpha,
         int beta) {

//      if (this.transposition.contains(
//            p,
//            whiteMove)) {
//         Entry entry= this.transposition.get(
//               p,
//               whiteMove);
//         if (entry.depthToLeaf >= ply) {
//            this.transpositionHits++;
//            this.pv.updateLastExaminedLine();
//            if ((entry.type & Transposition.Entry.Type.EXACT) != 0) { return entry.exactScore; }
//            if ((entry.type & Transposition.Entry.Type.LOWER_BOUND) != 0) {
//               if (entry.lowerBound >= beta) { return beta; }
//            }
//            if ((entry.type & Transposition.Entry.Type.UPPER_BOUND) != 0) {
//               if (entry.upperBound <= alpha) { return alpha; }
//            }
//         }
//      }

      if ((whiteMove ? p.getWhite().isInCheck() : p.getBlack().isInCheck()))
            return this.search.alphaBeta(
                  p,
                  e,
                  whiteMove,
                  1,
                  alpha,
                  beta);

      int score= (e.getScore(p, whiteMove) * (whiteMove ? 1 : -1));
//      this.pv.updateLastExaminedLine();

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