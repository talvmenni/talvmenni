package org.forritan.talvmenni.game;

import java.util.List;
import java.util.Random;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.search.AlphaBetaSearch;
import org.forritan.talvmenni.search.Search;

public class AlphaBetaSearchSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy implements Strategy {

   private Search search;
   private Evaluation evaluation;
   
   public AlphaBetaSearchSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy(int searchDepth) {
      this.search= new AlphaBetaSearch(searchDepth);
      this.evaluation= new SimpleMaterialAndPositionalEvaluation();
   }
   
   public Position.Move getNextMove(Position position, boolean whiteToMove) {
         List<Position.Move> bestMoves= this.search.getBestMoves(position, this.evaluation, whiteToMove);

         if(!bestMoves.isEmpty()) {
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
