package org.forritan.talvmenni.strategy;

import java.util.List;
import java.util.Random;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.talvmenni.search.NewAlphaBetaSearch;
import org.forritan.talvmenni.search.Search;
import org.forritan.util.Tuple;


public class NewAlphaBetaStrategy
      implements Strategy {

   private DebugInfo  debugInfo;

   private Search     search;
   private Evaluation evaluation;

   public NewAlphaBetaStrategy(
         int ply) {
      this.debugInfo= new DebugInfo();
      this.search= new NewAlphaBetaSearch(
            ply);
      this.evaluation= new SimpleMaterialAndPositionalEvaluation();
   }

   public Position.Move getNextMove(
         Position position,
         boolean whiteToMove) {

      List<Position.Move> bestMoves= this.search.getBestMoves(
            position.getMutable(),
            this.evaluation,
            whiteToMove);

      if (!bestMoves.isEmpty()) {
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

   public DebugInfo getDebugInfo() {
      return this.debugInfo;
   }

   /* (non-Javadoc)
    * @see org.forritan.talvmenni.strategy.Strategy#getTheoryBook()
    */
   public TheoryBook getTheoryBook() {
      // TODO Auto-generated method stub
      return null;
   }
}