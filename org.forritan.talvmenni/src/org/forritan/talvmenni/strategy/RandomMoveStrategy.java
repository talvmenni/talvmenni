package org.forritan.talvmenni.strategy;

import java.util.List;
import java.util.Observable;
import java.util.Random;

import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.talvmenni.game.Position.PromotionPiece;
import org.forritan.talvmenni.search.Search;
import org.forritan.talvmenni.strategy.Strategy.DebugInfo;

public class RandomMoveStrategy extends Observable implements Strategy {
   
   private DebugInfo debugInfo;

   public RandomMoveStrategy() {
      this.debugInfo= new DebugInfo();
   }
   
   public Position.Move getNextMove(Position position, boolean whiteToMove) {
         List<Position.Move> possibleMoves;
         if(whiteToMove) {
            possibleMoves= position.getWhite().getPossibleMoves();
         } else {
            possibleMoves= position.getBlack().getPossibleMoves();
         }
         if(!possibleMoves.isEmpty()) {
            int chosenMoveIndex= new Random().nextInt(possibleMoves.size());
            return possibleMoves.get(chosenMoveIndex);
             
         } else {
            return null;
         }      
   }

   public int getPromotionPiece() {
      return Position.PromotionPiece.KNIGHT;
   }

   public Observable getObservable() {
      return this;
   }

   public Search getSearch() {
      return null;
   }
   
   public TheoryBook getTheoryBook() {
      return null;
   }

   public DebugInfo getDebugInfo() {
      return this.debugInfo;
   }


}
