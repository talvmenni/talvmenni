package org.forritan.talvmenni.strategy;

import java.util.List;
import java.util.Random;

import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.talvmenni.search.PrincipalVariation;

public class RandomMoveStrategy extends AbstractStrategy {
   
   public RandomMoveStrategy(PrincipalVariation pv) {
      super(0, null, pv);
   }
   
   protected List search(
         Position position,
         boolean whiteToMove) {
      if(whiteToMove) {
         return position.getWhite().getPossibleMoves();
      } else {
         return position.getBlack().getPossibleMoves();
      }
   }
}
