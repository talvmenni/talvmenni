package org.forritan.talvmenni.strategy;

import java.util.List;

import org.forritan.talvmenni.knowledge.Draw;
import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.TheoryBook;
import org.forritan.talvmenni.knowledge.Transposition;
import org.forritan.talvmenni.knowledge.evaluation.Evaluation;
import org.forritan.talvmenni.knowledge.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.search.AlphaBetaWithQuiescentAndNullMoveAndTranspositionTableSearch;
import org.forritan.talvmenni.search.AlphaBetaWithQuiescentAndTranspositionTableSearch;
import org.forritan.talvmenni.search.PrincipalVariation;


public class IterativeDeepeningAlphaBetaWithQuiescentAndNullMoveAndTranspositionTableStrategy
      extends AbstractStrategy {

   public IterativeDeepeningAlphaBetaWithQuiescentAndNullMoveAndTranspositionTableStrategy(
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
            new AlphaBetaWithQuiescentAndNullMoveAndTranspositionTableSearch(
                  transposition,
                  useMoveOrdering,
                  pv,
                  quiescentMaxDepth),
            new SimpleMaterialAndPositionalEvaluation());
   }

   protected List search(
         Position position,
         boolean whiteToMove) {

      List result= null;
      Position mutablePosition= position.getMutable();
      for (int i= 1; i <= this.ply; i++) {
         this.search.setPly(i);
         result= this.search.getBestMoves(
               mutablePosition,
               this.evaluation,
               whiteToMove);
//         if (this.search.getLastScore() >= Evaluation.CHECKMATE_SCORE) {
//            break;
//         }
      }

      return result;
   }
}