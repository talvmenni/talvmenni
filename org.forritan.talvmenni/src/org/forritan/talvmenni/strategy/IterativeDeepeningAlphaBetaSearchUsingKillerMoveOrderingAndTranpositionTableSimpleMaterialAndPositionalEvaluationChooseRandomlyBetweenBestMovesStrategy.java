package org.forritan.talvmenni.strategy;

import java.util.List;
import java.util.Random;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.Transposition;
import org.forritan.talvmenni.search.AlphaBetaUsingKillerMoveOrderingAndTranspositionTableSearch;
import org.forritan.talvmenni.search.Search;

public class IterativeDeepeningAlphaBetaSearchUsingKillerMoveOrderingAndTranpositionTableSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy implements Strategy {

   private Search search;
   private Evaluation evaluation;
   private int ply;
   
   public IterativeDeepeningAlphaBetaSearchUsingKillerMoveOrderingAndTranpositionTableSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy(int ply, Transposition transposition) {
      this.search= new AlphaBetaUsingKillerMoveOrderingAndTranspositionTableSearch(transposition);
      this.evaluation= new SimpleMaterialAndPositionalEvaluation();
      this.ply= ply;
   }
   
   public Position.Move getNextMove(Position position, boolean whiteToMove) {
            
      List<Position.Move> bestMoves= null;
         for (int i= 0; i <= this.ply; i += 2) {
            this.search.setPly(i);
            bestMoves= this.search.getBestMoves(position.getMutable(), this.evaluation, whiteToMove);            
         }
         if(bestMoves != null && !bestMoves.isEmpty()) {
            int chosenMoveIndex= new Random().nextInt(bestMoves.size());
            return bestMoves.get(chosenMoveIndex);             
         } else {
            return null;
         }      
   }

   public int getPromotionPiece() {
      return Position.PromotionPiece.DEFAULT;
   }
   
   public Search getSearch() {
      return this.search;
   }
}
