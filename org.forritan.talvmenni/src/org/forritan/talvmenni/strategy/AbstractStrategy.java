package org.forritan.talvmenni.strategy;

import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Random;

import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.TheoryBook;
import org.forritan.talvmenni.knowledge.Position.Move;
import org.forritan.talvmenni.knowledge.TheoryBook.TupleMoveWeight;
import org.forritan.talvmenni.knowledge.evaluation.Evaluation;
import org.forritan.talvmenni.search.PrincipalVariation;
import org.forritan.talvmenni.search.Search;
import org.forritan.talvmenni.search.PrincipalVariation.Thinking;


public abstract class AbstractStrategy implements Strategy {

   protected DebugInfo          debugInfo;
   protected TheoryBook         book;
   protected Search             search;
   protected PrincipalVariation pv;
   protected Evaluation         evaluation;
   protected int                ply;

   public AbstractStrategy(
         int ply,
         TheoryBook book,
         PrincipalVariation pv,
         Search search,
         Evaluation evaluation) {
      this.debugInfo= new DebugInfo();
      this.pv= pv;
      this.ply= ply;
      this.book= book;
      this.search= search;
      this.evaluation= evaluation;
   }

   protected abstract List search(
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

         List moves= this.book.get(
               position,
               whiteToMove);

         if (moves != null) {

            int totalWeight= 0;

            for (Iterator it= moves.iterator(); it.hasNext();) {
               TupleMoveWeight tuple= (TupleMoveWeight) it.next();
               totalWeight+= tuple.weight.intValue();
            }

            if (totalWeight > 0) {

               int weight= new Random().nextInt(totalWeight);

               for (Iterator it= moves.iterator(); it.hasNext();) {
                  TupleMoveWeight tuple= (TupleMoveWeight) it.next();
                  weight-= tuple.weight.intValue();
                  if (weight < 0) {
                     result= tuple.move;
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

   public PrincipalVariation getPrincipalVariation() {
      return this.pv;
   }

   public DebugInfo getDebugInfo() {
      return this.debugInfo;
   }

   public Thinking getThinking() {
      return this.search.getThinking();
   }

   public TheoryBook getTheoryBook() {
      return this.book;
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

      List moves;
      if (whiteToMove) {
         moves= position.getWhite().getPossibleMoves();
      } else {
         moves= position.getBlack().getPossibleMoves();
      }

      List bestMoves;
      if (moves.size() == 1) {
         bestMoves= moves;
      } else {
         this.getPrincipalVariation().clearBestLine();
         bestMoves= this.search(
               position,
               whiteToMove);
      }

      if (!bestMoves.isEmpty()) {
         int chosenMoveIndex= new Random().nextInt(bestMoves.size());
         return (Move) bestMoves.get(chosenMoveIndex);
      } else {
         return null;
      }
   }

}