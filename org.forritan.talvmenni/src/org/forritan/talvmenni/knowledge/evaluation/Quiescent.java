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

   private int                maxDepth;
   private AlphaBetaSearch    search;

   private int                movesSearched;
   private int                transpositionHits;

   public Quiescent(
         PrincipalVariation pv,
         int maxDepth) {
      this.maxDepth= maxDepth;
      this.search= new AlphaBetaSearch();
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

      int score= (e.getScore(p, whiteMove) * (whiteMove ? 1 : -1));

      if ((this.maxDepth + ply) > 0) {

         if (score >= beta) { return beta; }

         if (score > alpha) {
            alpha= score;
         }

         List moves;

         if (whiteMove) {
            moves= p.getWhite().getPossibleCaptureMoves();
         } else {
            moves= p.getBlack().getPossibleCaptureMoves();
         }

         if (moves.size() > 0) {
            for (Iterator it= moves.iterator(); it.hasNext();) {
               Move move= (Move) it.next();

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

               p.popMove();

               if (score >= beta) { return beta; }

               moveTime+= System.currentTimeMillis();

               if (score > alpha) {
                  alpha= score;
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