package org.forritan.talvmenni.strategy;

import java.util.List;

import org.forritan.talvmenni.evaluation.MaterialAndPositionalEvaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.TheoryBook;
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
            pv);
      this.search= new NegaMaxSearch(
            ply,
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