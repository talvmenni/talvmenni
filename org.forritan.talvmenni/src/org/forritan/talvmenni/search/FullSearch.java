package org.forritan.talvmenni.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.Position.Move;

public class FullSearch extends Observable implements Search {
   
   private int depth;
   
   private int movesSearched;
   
   public FullSearch(int depth) {
      this.depth= depth;
   }

   public List<Move> getBestMoves(
         Position p,
         Evaluation e,
         boolean whiteMove) {
      
      long time= -System.currentTimeMillis();
      
      List<Move> result= new ArrayList<Move>();
      MoveScoreTuple bestScore= null;
      
      List<Move> moves;
      if(whiteMove) {
         moves= p.white.getPossibleMoves();         
      } else {
         moves= p.black.getPossibleMoves();         
      }
      
     
      
      for(Move move : moves) {
         this.movesSearched++;
         MoveScoreTuple score= this.getBestMove(p.move(move.from, move.to), e, !whiteMove, depth - 1);
         if(bestScore == null || (whiteMove ? score.score > bestScore.score : score.score < bestScore.score)) {
            bestScore= score;
            result.clear();
            result.add(move);
         }else if(bestScore != null && score.score == bestScore.score) {
            result.add(move);
         }
      }
      
      time += System.currentTimeMillis();
      
      this.setChanged();
      this.notifyObservers("Searched " + this.movesSearched + " in just " + time + " milliseconds... i.e: " + 1L * this.movesSearched * 1000 / time + " pr. second.");
      
      return result;
   }

   private MoveScoreTuple getBestMove(
         Position p,
         Evaluation e,
         boolean whiteMove,
         int depth) {
      MoveScoreTuple result= new MoveScoreTuple(null, 0);
      if(depth > 0) {
         List<Move> moves;
         MoveScoreTuple bestScore= null;
         
         if(whiteMove) {
            moves= p.white.getPossibleMoves();         
         } else {
            moves= p.black.getPossibleMoves();         
         }
    
         for(Move move : moves) {
            this.movesSearched++;
            MoveScoreTuple score= this.getBestMove(p.move(move.from, move.to), e, !whiteMove, depth - 1);
            if(bestScore == null || (whiteMove ? score.score > bestScore.score : score.score < bestScore.score)) {
               bestScore= score;
            }
         }         
         result= new MoveScoreTuple(bestScore.move, bestScore.score + e.getScore(p));
      } else {
         
         List<Move> moves;
         int bestScore= 0;
         if(whiteMove) {
            moves= p.white.getPossibleMoves();
         } else {
            moves= p.black.getPossibleMoves();         
         }

         for(Move move : moves) {
            this.movesSearched++;
            int score= e.getScore(p.move(move.from, move.to));
            if((whiteMove ? score >= bestScore : score <= bestScore)) {
               bestScore= score;
               result= new MoveScoreTuple(move, score);
            }
         }         
      }
      
      return result;
   }
   
   public Observable getObservable() {
      return this;
   }

   
   private static class MoveScoreTuple {
      public final Move move;
      public final int score;
      
      public MoveScoreTuple(Move move, int score) {
         this.move= move;
         this.score= score;
      }
      
   }
}
