package org.forritan.talvmenni.strategy;

import java.util.List;
import java.util.Random;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.game.Transposition;
import org.forritan.talvmenni.search.AlphaBetaUsingKillerMoveOrderingAndTranspositionTableSearch;
import org.forritan.talvmenni.search.Search;
import org.forritan.talvmenni.strategy.Strategy.DebugInfo;


public class IterativeDeepeningAlphaBetaSearchUsingKillerMoveOrderingAndTranpositionTableSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy
      implements Strategy {

   private DebugInfo debugInfo;
   
   private Search     search;
   private Evaluation evaluation;
   private int        ply;

   public IterativeDeepeningAlphaBetaSearchUsingKillerMoveOrderingAndTranpositionTableSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy(
         int ply,
         Transposition transposition) {
      this.debugInfo= new DebugInfo();
      this.search= new AlphaBetaUsingKillerMoveOrderingAndTranspositionTableSearch(
            transposition);
      this.evaluation= new SimpleMaterialAndPositionalEvaluation();
      this.ply= ply;
   }

   public Position.Move getNextMove(
         Position position,
         boolean whiteToMove) {
      List<Position.Move> bestMoves= this.getNextBestMoves(position, whiteToMove, 0, this.ply);
      if (bestMoves != null
            && !bestMoves.isEmpty()) {
         int chosenMoveIndex= new Random().nextInt(bestMoves.size());
         return bestMoves.get(chosenMoveIndex);
      } else {
         return null;
      }
   }

   private List<Position.Move> getNextBestMoves(
         Position position,
         boolean whiteToMove,
         int startPly,
         int endPly) {
      
      List<Position.Move> bestMoves= null;
      for (int i= startPly; i <= endPly; i++) {
         this.search.setPly(i);
         bestMoves= this.search.getBestMoves(
               position.getMutable(),
               this.evaluation,
               whiteToMove);
      }      
      return bestMoves;
   }

   public int getPromotionPiece() {
      return Position.PromotionPiece.DEFAULT;
   }

   public Search getSearch() {
      return this.search;
   }
   
   public TheoryBook getTheoryBook() {
      return null;
   }

   public DebugInfo getDebugInfo() {
      return this.debugInfo;
   }
   
}