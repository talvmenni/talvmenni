package org.forritan.talvmenni.game;

import java.util.List;
import java.util.Random;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.search.AlphaBetaSearch;
import org.forritan.talvmenni.search.Search;

public class IterativeDeepeningAlphaBetaSearchSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy implements Strategy {

   private Search search;
   private Evaluation evaluation;
   private int ply;
   
   public IterativeDeepeningAlphaBetaSearchSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy(int ply) {
      this.search= new AlphaBetaSearch();
      this.evaluation= new SimpleMaterialAndPositionalEvaluation();
      this.ply= ply;
   }
   
   public Position.Move getNextMove(Position position, boolean whiteToMove) {
            
      List<Position.Move> bestMoves= null;
         for (int i= 0; i <= this.ply; i++) {
            this.search.setPly(i);
            bestMoves= this.search.getBestMoves(position, this.evaluation, whiteToMove);            
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
