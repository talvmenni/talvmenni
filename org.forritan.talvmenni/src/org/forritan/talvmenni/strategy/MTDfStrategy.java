package org.forritan.talvmenni.strategy;

import java.util.List;
import java.util.Random;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.game.MTDfTransposition;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.talvmenni.search.MTDfSearch;
import org.forritan.talvmenni.search.Search;
import org.forritan.util.Tuple;


public class MTDfStrategy extends AbstractStrategy {

   public MTDfStrategy(
         int ply,
         MTDfTransposition transposition,
         TheoryBook book) {
      super(
            ply,
            book);
      this.search= new MTDfSearch(
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