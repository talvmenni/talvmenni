package org.forritan.talvmenni.strategy;

import java.util.List;

import org.forritan.talvmenni.evaluation.MaterialAndPositionalEvaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.search.AlphaBetaSearch;
import org.forritan.talvmenni.search.PrincipalVariation;


public class AlphaBetaStrategy extends AbstractStrategy {

   public AlphaBetaStrategy(
         int ply,
         TheoryBook book,
         PrincipalVariation pv) {
      super(
            ply,
            book,
            pv,
            new AlphaBetaSearch(ply),
            new MaterialAndPositionalEvaluation());
   }

   protected List search(
         Position position,
         boolean whiteToMove) {
      return this.search.getBestMoves(
            position.getMutable(),
            this.evaluation,
            whiteToMove);
   }
}