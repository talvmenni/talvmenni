package org.forritan.talvmenni.strategy;

import java.util.List;

import org.forritan.talvmenni.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.search.NegaMaxSearch;


public class NegaMaxStrategy extends AbstractStrategy {

   public NegaMaxStrategy(
         int ply,
         TheoryBook book) {
      super(
            ply,
            book);
      this.search= new NegaMaxSearch(
            ply);
      this.evaluation= new SimpleMaterialAndPositionalEvaluation();
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