package org.forritan.talvmenni.strategy;

import java.util.List;
import java.util.Random;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.talvmenni.search.NewAlphaBetaSearch;
import org.forritan.talvmenni.search.Search;
import org.forritan.util.Tuple;


public class NewAlphaBetaStrategy
      implements Strategy {

   private DebugInfo  debugInfo;

   private TheoryBook book;
   private Search     search;
   private Evaluation evaluation;

   public NewAlphaBetaStrategy(
         int ply,
         TheoryBook book) {
      this.debugInfo= new DebugInfo();
      this.search= new NewAlphaBetaSearch(
            ply);
      this.evaluation= new SimpleMaterialAndPositionalEvaluation();
      this.book= book;
   }

   public Position.Move getNextMove(
         Position position,
         boolean whiteToMove) {
      
      if (this.book.containsKey(position, whiteToMove)) {
         this.getDebugInfo().postText(
               "Position found in " + (whiteToMove?"white":"black") + "book... [searched through "
                     + this.book.size(whiteToMove)
                     + " entries]...");

         List<Tuple<Move, Integer>> moves= this.book.get(position, whiteToMove);

         if (moves != null) {

            int totalWeight= 0;

            for (Tuple<Move, Integer> tuple : moves) {
               totalWeight+= tuple.b.intValue();
            }

            if (totalWeight > 0) {

               int weight= new Random().nextInt(totalWeight);

               for (Tuple<Move, Integer> tuple : moves) {
                  weight-= tuple.b.intValue();
                  if (weight < 0) { return tuple.a; }
               }
            }

         }
      }


      List<Position.Move> bestMoves= this.search.getBestMoves(
            position.getMutable(),
            this.evaluation,
            whiteToMove);

      if (!bestMoves.isEmpty()) {
         int chosenMoveIndex= new Random().nextInt(bestMoves.size());
         return bestMoves.get(chosenMoveIndex);
      } else {
         return null;
      }
   }

   public int getPromotionPiece() {
      return Position.PromotionPiece.DEFAULT;
   }

   public Search getSearch() {
      return this.search;
   }

   public DebugInfo getDebugInfo() {
      return this.debugInfo;
   }

   public TheoryBook getTheoryBook() {
      return this.book;
   }
}