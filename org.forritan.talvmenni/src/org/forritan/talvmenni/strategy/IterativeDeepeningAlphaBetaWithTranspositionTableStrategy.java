package org.forritan.talvmenni.strategy;

import java.util.List;
import java.util.Random;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.game.Transposition;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.talvmenni.search.AlphaBetaWithTranspositionTableSearch;
import org.forritan.talvmenni.search.Search;
import org.forritan.util.Tuple;


public class IterativeDeepeningAlphaBetaWithTranspositionTableStrategy
      implements Strategy {

   private DebugInfo  debugInfo;

   private TheoryBook book;
   private Search     search;
   private Evaluation evaluation;
   private int ply;

   public IterativeDeepeningAlphaBetaWithTranspositionTableStrategy(
         int ply,
         Transposition transposition,
         TheoryBook book) {
      this.debugInfo= new DebugInfo();
      this.search= new AlphaBetaWithTranspositionTableSearch(
            transposition);
      this.evaluation= new SimpleMaterialAndPositionalEvaluation();
      this.book= book;
      this.ply= ply;
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
      
      List<Position.Move> bestMoves= null;
      Position mutablePosition= position.getMutable();
      for (int i= 1; i <= this.ply; i++) {
         this.search.setPly(i);
         bestMoves= this.search.getBestMoves(mutablePosition, this.evaluation, whiteToMove);            
      }
      
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