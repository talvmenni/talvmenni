package org.forritan.talvmenni.knowledge.evaluation;

import java.util.Iterator;
import java.util.List;

import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Transposition;
import org.forritan.talvmenni.knowledge.Position.Bitboard;
import org.forritan.talvmenni.knowledge.Position.Move;
import org.forritan.talvmenni.search.PrincipalVariation;


public class Quiescent {

   private int maxDepth;

   public Quiescent(
         int maxDepth) {
      this.maxDepth= maxDepth;
   }

   public int search(
         Position p,
         Evaluation e,
         boolean whiteMove,
         int ply,
         int alpha,
         int beta) {

      int score= (e.getScore(p) * (whiteMove ? 1 : -1));

      if ((this.maxDepth + ply) > 0) {

         if (score >= beta) { return beta; }

         if (score > alpha) {
            alpha= score;
         }

         List moves= (whiteMove ? p.getWhite().getPossibleCaptureMoves() : p
               .getBlack().getPossibleCaptureMoves());

         if (moves.size() > 0) {
            for (Iterator it= moves.iterator(); it.hasNext();) {
               Move move= (Move) it.next();

               p= p.move(
                     move.from,
                     move.to);

               score= -search(
                     p,
                     e,
                     !whiteMove,
                     ply - 1,
                     -beta,
                     -alpha);

               p.popMove();

               if (score >= beta) { return beta; }

               if (score > alpha) {
                  alpha= score;
               }
            }
         }
         return alpha;
      } else {
         return score;
      }
   }
}