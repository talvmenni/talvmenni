package org.forritan.talvmenni.strategy;

import java.util.List;

import org.forritan.talvmenni.evaluation.MaterialAndPositionalEvaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.game.Transposition;
import org.forritan.talvmenni.search.AlphaBetaWithTranspositionTableSearch;
import org.forritan.talvmenni.search.PrincipalVariation;


public class AlphaBetaWithTranspositionTableStrategy extends AbstractStrategy {

   public AlphaBetaWithTranspositionTableStrategy(
         int ply,
         Transposition transposition,
         boolean useMoveOrdering,
         TheoryBook book,
         PrincipalVariation pv) {
      super(
            ply,
            book,
            pv);
      this.search= new AlphaBetaWithTranspositionTableSearch(
            ply,
            transposition,
            useMoveOrdering,
            pv);
      this.evaluation= new MaterialAndPositionalEvaluation();
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