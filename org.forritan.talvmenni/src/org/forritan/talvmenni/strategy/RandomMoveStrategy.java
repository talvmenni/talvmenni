package org.forritan.talvmenni.strategy;

import java.util.List;
import java.util.Random;

import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Position.Move;
import org.forritan.talvmenni.search.PrincipalVariation;

public class RandomMoveStrategy extends AbstractStrategy {
   
   public RandomMoveStrategy(PrincipalVariation pv) {
      super(0, null, pv, null, null);
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
