package org.forritan.talvmenni.game;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.evaluation.SimpleMaterialEvaluation;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.talvmenni.search.MiniMaxSearch;
import org.forritan.talvmenni.search.Search;

public class MiniMaxSearchSimpleMaterialEvaluationChooseRandomlyBetweenBestMovesStrategy implements Strategy {

   private Search search;
   private Evaluation evaluation;
   
   public MiniMaxSearchSimpleMaterialEvaluationChooseRandomlyBetweenBestMovesStrategy(int searchDepth) {
      this.search= new MiniMaxSearch(searchDepth * 2);
      this.evaluation= new SimpleMaterialEvaluation();
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
      return ImmutablePosition.PromotionPiece.DEFAULT;
   }
   
   public Search getSearch() {
      return this.search;
   }
}
