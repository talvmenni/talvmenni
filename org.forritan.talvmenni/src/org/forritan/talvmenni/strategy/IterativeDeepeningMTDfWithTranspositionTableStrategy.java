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

   private int lastWhiteResult;
   private int lastBlackResult;

   public IterativeDeepeningMTDfWithTranspositionTableStrategy(
         int ply,
         Transposition transposition,
         boolean useMoveOrdering,
         TheoryBook book,
         PrincipalVariation pv,
         int quiescentMaxDepth) {
      super(
            ply,
            book,
            pv,
            new MTDfSearch(
                  transposition,
                  useMoveOrdering,
                  pv,
                  quiescentMaxDepth),
            new SimpleMaterialAndPositionalEvaluation());
      this.lastWhiteResult= 0;
      this.lastBlackResult= 0;
   }

   protected List search(
         Position position,
         boolean whiteToMove) {

      List result= null;
      Position mutablePosition= position.getMutable();
      int lastResult;
      int secondToLastResult;

      if (whiteToMove) {
         lastResult= this.lastBlackResult;
         secondToLastResult= this.lastWhiteResult;
      } else {
         lastResult= this.lastWhiteResult;
         secondToLastResult= this.lastBlackResult;
      }

      boolean lastColorToMove= !whiteToMove;
      for (int i= 1; i <= this.ply; i++) {
         this.search.setPly(i);
         ((MTDfSearch) this.search).setFirstGuess(secondToLastResult);
         result= this.search.getBestMoves(
               mutablePosition,
               this.evaluation,
               whiteToMove);
         lastColorToMove= !lastColorToMove;
         secondToLastResult= lastResult;
         lastResult= ((MTDfSearch) this.search).getLastResult();
      }

      if (lastColorToMove) {
         this.lastBlackResult= secondToLastResult;
         this.lastWhiteResult= lastResult;
      } else {
         this.lastBlackResult= lastResult;
         this.lastWhiteResult= secondToLastResult;
      }

      return result;
   }
}