package org.forritan.talvmenni.strategy;

import java.util.List;

import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.TheoryBook;
import org.forritan.talvmenni.knowledge.evaluation.SimpleMaterialAndPositionalEvaluation;
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
            new SimpleMaterialAndPositionalEvaluation());
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