package org.forritan.talvmenni.strategy;

import java.util.List;

import org.forritan.talvmenni.evaluation.MaterialAndPositionalEvaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.search.AlphaBetaSearch;
import org.forritan.talvmenni.search.PrincipalVariation;


public class IterativeDeepeningAlphaBetaStrategy extends AbstractStrategy {

   public IterativeDeepeningAlphaBetaStrategy(
         int ply,
         TheoryBook book,
         PrincipalVariation pv) {
      super(
            ply,
            book,
            pv,
            new AlphaBetaSearch(),
            new MaterialAndPositionalEvaluation());
   }

   protected List search(
         Position position,
         boolean whiteToMove) {

      List result= null;
      Position mutablePosition= position.getMutable();
      for (int i= 1; i <= this.ply; i++) {
         this.search.setPly(i);
         result= this.search.getBestMoves(
               mutablePosition,
               this.evaluation,
               whiteToMove);
      }

      return result;
   }
}