package org.forritan.talvmenni.strategy;

import java.util.List;
import java.util.Random;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.game.Transposition;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.talvmenni.search.AlphaBetaWithTranspositionTableSearch;
import org.forritan.talvmenni.search.Search;
import org.forritan.util.Tuple;


public class AlphaBetaWithTranspositionTableStrategy extends AbstractStrategy {

   public AlphaBetaWithTranspositionTableStrategy(
         int ply,
         Transposition transposition,
         TheoryBook book) {
      super(
            ply,
            book);
      this.search= new AlphaBetaWithTranspositionTableSearch(
            ply,
            transposition);
      this.evaluation= new SimpleMaterialAndPositionalEvaluation();
   }

   protected List<Position.Move> search(
         Position position,
         boolean whiteToMove) {
      return this.search.getBestMoves(
            position.getMutable(),
            this.evaluation,
            whiteToMove);
   }
}