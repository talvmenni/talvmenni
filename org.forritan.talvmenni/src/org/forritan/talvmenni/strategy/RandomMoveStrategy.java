package org.forritan.talvmenni.strategy;

import java.util.List;
import java.util.Random;

import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.Position.Move;

public class RandomMoveStrategy extends AbstractStrategy {
   
   public RandomMoveStrategy() {
      super(0, null);
   }
   
   protected List<Position.Move> search(
         Position position,
         boolean whiteToMove) {
      if(whiteToMove) {
         return position.getWhite().getPossibleMoves();
      } else {
         return position.getBlack().getPossibleMoves();
      }
   }
}
