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


public class IterativeDeepeningAlphaBetaWithTranspositionTableStrategy extends AbstractStrategy {

   public IterativeDeepeningAlphaBetaWithTranspositionTableStrategy(
         int ply,
         Transposition transposition,
         TheoryBook book) {
      super(ply, book);
      this.search= new AlphaBetaWithTranspositionTableSearch(
            transposition);
      this.evaluation= new SimpleMaterialAndPositionalEvaluation();
   }

   protected List<Position.Move> search(
         Position position,
         boolean whiteToMove) {

      List<Position.Move> result= null;
      Position mutablePosition= position.getMutable();
      for (int i= 1; i <= this.ply; i++) {
         this.search.setPly(i);
         result= this.search.getBestMoves(mutablePosition, this.evaluation, whiteToMove);            
      }

      return result;
   }
}