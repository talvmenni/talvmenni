package org.forritan.talvmenni.strategy;

import java.util.List;

import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.TheoryBook;
import org.forritan.talvmenni.knowledge.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.search.NegaMaxSearch;
import org.forritan.talvmenni.search.PrincipalVariation;


public class NegaMaxStrategy extends AbstractStrategy {

   public NegaMaxStrategy(
         int ply,
         TheoryBook book,
         PrincipalVariation pv) {
      super(
            ply,
            book,
            pv,
            new NegaMaxSearch(
                  ply,
                  pv),
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