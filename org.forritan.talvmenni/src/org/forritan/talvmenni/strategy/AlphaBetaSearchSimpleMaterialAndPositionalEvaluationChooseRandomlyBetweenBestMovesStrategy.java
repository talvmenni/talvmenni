package org.forritan.talvmenni.strategy;

import java.util.List;
import java.util.Random;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.talvmenni.search.AlphaBetaSearch;
import org.forritan.talvmenni.search.Search;
import org.forritan.util.Tuple;


public class AlphaBetaSearchSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy
      implements Strategy {

   private TheoryBook book;
   private Search     search;
   private Evaluation evaluation;

   public AlphaBetaSearchSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy(
         int ply,
         TheoryBook book) {
      this.search= new AlphaBetaSearch(
            ply);
      this.evaluation= new SimpleMaterialAndPositionalEvaluation();
      this.book= book;
   }

   public Position.Move getNextMove(
         Position position,
         boolean whiteToMove) {

      System.err.println("this.book.size(): "
            + this.book.size());
      System.err.println(this.book.containsKey(position));

      Position bookPosition= this.book.get(position);

      if (bookPosition != null) {
         Position.Bitboard board;
         if (whiteToMove) {
            board= bookPosition.getWhite();
         } else {
            board= bookPosition.getBlack();
         }

         List<Tuple<Move, Integer>> moves= board.getBookMoves();

         int totalWeight= 0;

         for (Tuple<Move, Integer> tuple : moves) {
            totalWeight+= tuple.b.intValue();
         }

         if (totalWeight > 0) {

            int weight= new Random().nextInt(totalWeight);

            for (Tuple<Move, Integer> tuple : moves) {
               weight-= tuple.b.intValue();
               if (weight < 0) { return tuple.a; }
            }
         }

      }

      List<Position.Move> bestMoves= this.search.getBestMoves(
            position.getImmutable(),
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

   public TheoryBook getTheoryBook() {
      return this.book;
   }
}