package org.forritan.talvmenni.game;

import java.util.List;
import java.util.Random;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.talvmenni.search.FullSearch;
import org.forritan.talvmenni.search.Search;

public class FullSearchSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy implements Strategy {

   private Search search;
   private Evaluation evaluation;
   
   public FullSearchSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy(int searchDepth) {
      this.search= new FullSearch(searchDepth);
      this.evaluation= new SimpleMaterialAndPositionalEvaluation();
   }
   
   public Move getNextMove(Position position, boolean whiteToMove) {
         List<Move> bestMoves= this.search.getBestMoves(position, this.evaluation, whiteToMove);

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
