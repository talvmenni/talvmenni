package org.forritan.talvmenni.strategy;

import java.util.List;

import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.TheoryBook;
import org.forritan.talvmenni.knowledge.Transposition;
import org.forritan.talvmenni.knowledge.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.search.MTDfSearch;
import org.forritan.talvmenni.search.PrincipalVariation;


public class MTDfStrategy extends AbstractStrategy {

   public MTDfStrategy(
         int ply,
         Transposition transposition,
         boolean useMoveOrdering,
         TheoryBook book,
         PrincipalVariation pv) {
      super(
            ply,
            book,
            pv,
            new MTDfSearch(
                  ply,
                  transposition,
                  useMoveOrdering,
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