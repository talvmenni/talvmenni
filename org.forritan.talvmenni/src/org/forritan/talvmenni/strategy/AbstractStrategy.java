package org.forritan.talvmenni.strategy;

import java.util.List;
import java.util.Observable;
import java.util.Random;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.talvmenni.search.Search;
import org.forritan.util.Tuple;


public abstract class AbstractStrategy implements Strategy {

   protected DebugInfo  debugInfo;
   protected TheoryBook book;
   protected Search     search;
   protected Evaluation evaluation;
   protected int        ply;

   public AbstractStrategy(
         int ply,
         TheoryBook book) {
      this.debugInfo= new DebugInfo();
      this.ply= ply;
      this.book= book;

   }

   protected abstract List<Position.Move> search(
         Position position,
         boolean whiteToMove);

   protected Move getPossibleBookMove(
         Position position,
         boolean whiteToMove) {

      Move result= null;

      if (this.book == null) { return null; }

      if (this.book.containsKey(
            position,
            whiteToMove)) {
         this.getDebugInfo().postText(
               "Position found in "
                     + (whiteToMove ? "white" : "black")
                     + "book... [searched through "
                     + this.book.size(whiteToMove)
                     + " entries]...");

         List<Tuple<Move, Integer>> moves= this.book.get(
               position,
               whiteToMove);

         if (moves != null) {

            int totalWeight= 0;

            for (Tuple<Move, Integer> tuple : moves) {
               totalWeight+= tuple.b.intValue();
            }

            if (totalWeight > 0) {

               int weight= new Random().nextInt(totalWeight);

               for (Tuple<Move, Integer> tuple : moves) {
                  weight-= tuple.b.intValue();
                  if (weight < 0) {
                     result= tuple.a;
                     break;
                  }
               }
            }

         }
      }
      return result;
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

   public int getPromotionPiece() {
      return Position.PromotionPiece.DEFAULT;
   }

   public class DebugInfo extends Observable {
      public void postText(
            String text) {
         this.setChanged();
         this.notifyObservers(text);
      }
   }

   public Position.Move getNextMove(
         Position position,
         boolean whiteToMove) {

      Move result= getPossibleBookMove(
            position,
            whiteToMove);

      if (result != null) { return result; }

      List<Position.Move> moves;
      if (whiteToMove) {
         moves= position.getWhite().getPossibleMoves();
      } else {
         moves= position.getBlack().getPossibleMoves();
      }

      List<Position.Move> bestMoves;
      if (moves.size() == 1) {
         bestMoves= moves;
      } else {
         bestMoves= this.search(
               position,
               whiteToMove);
      }

      if (!bestMoves.isEmpty()) {
         int chosenMoveIndex= new Random().nextInt(bestMoves.size());
         return bestMoves.get(chosenMoveIndex);
      } else {
         return null;
      }
   }

}