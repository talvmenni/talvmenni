package org.forritan.talvmenni.strategy;

import java.util.List;

import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.TheoryBook;
import org.forritan.talvmenni.knowledge.Transposition;
import org.forritan.talvmenni.knowledge.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.search.AlphaBetaWithTranspositionTableSearch;
import org.forritan.talvmenni.search.MTDfSearch;
import org.forritan.talvmenni.search.PrincipalVariation;


public class IterativeDeepeningMTDfWithTranspositionTableStrategy extends
      AbstractStrategy {

   public IterativeDeepeningMTDfWithTranspositionTableStrategy(
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
                  transposition,
                  useMoveOrdering,
                  pv),
            new SimpleMaterialAndPositionalEvaluation());
   }

   protected List search(
         Position position,
         boolean whiteToMove) {

      List result= null;
      Position mutablePosition= position.getMutable();
      int lastResult= 0;
      int secondToLastResult= 0;
      for (int i= 1; i <= this.ply; i++) {
         this.search.setPly(i);
         ((MTDfSearch) this.search).setFirstGuess(secondToLastResult);
         result= this.search.getBestMoves(
               mutablePosition,
               this.evaluation,
               whiteToMove);
         secondToLastResult= lastResult;
         lastResult= ((MTDfSearch) this.search).getLastResult();
      }

      return result;
   }
}