package org.forritan.talvmenni.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.game.ImmutablePosition;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.PositionFactory;
import org.forritan.talvmenni.game.Position.Move;

public class MiniMaxSearch implements Search {
   
   private Thinking thinking;
   private DebugInfo debugInfo;
   private int ply;
   
   private int movesSearched;
   
   public MiniMaxSearch(int depth) {
      this.ply= depth;
      this.thinking= new Thinking();
      this.debugInfo= new DebugInfo();
   }
   
   public void setPly(
         int ply) {
      this.ply= ply;
   }

   public Thinking getThinking() {
      return this.thinking;
   }

   public DebugInfo getDebugInfo() {
      return this.debugInfo;
   }

   public List<Move> getBestMoves(
         Position p,
         Evaluation e,
         boolean whiteMove) {
      
      ImmutablePosition.nodes++;
      
      long time= -System.currentTimeMillis();
      this.movesSearched= 0;
      
      List<Move> result= new ArrayList<Move>();
      MoveScoreTuple bestScore= null;
      
      List<Move> moves;
      if(whiteMove) {
         moves= p.getWhite().getPossibleMoves();         
      } else {
         moves= p.getBlack().getPossibleMoves();         
      }
      
      for(Move move : moves) {
         long moveTime= -System.currentTimeMillis();
         int movesSearchedBeforeMove= this.movesSearched++;
         MoveScoreTuple score= this.getBestMove(p.move(move.from, move.to), e, !whiteMove, ply - 1);
         score.add(move, e.getScore(p));
//         score.add(move, 0);
         this.debugInfo.postCurrentBestMove(move, score.getScore(), (this.movesSearched - movesSearchedBeforeMove));
         if(bestScore == null || (whiteMove ? score.getScore() > bestScore.getScore() : score.getScore() < bestScore.getScore())) {
            bestScore= score;
            result.clear();
            result.add(move);
            moveTime += System.currentTimeMillis();
            this.thinking.postThinking(ply, bestScore.getScore(), moveTime, this.movesSearched, bestScore.getMoveList().toString());
         }else if(bestScore != null && score.getScore() == bestScore.getScore()) {
            bestScore= score;
            result.add(move);
            this.thinking.postThinking(ply, bestScore.getScore(), moveTime, this.movesSearched, bestScore.getMoveList().toString());
         }
         p.popMove();
      }
      
      time += System.currentTimeMillis(); 
      
      this.debugInfo.postNodesPerSecond(time, this.movesSearched);
      this.debugInfo.postBestMoves(result);
      this.debugInfo.postPositionStatiscs();
      
      return result;
   }

   private MoveScoreTuple getBestMove(
         Position p,
         Evaluation e,
         boolean whiteMove,
         int ply) {

      PositionFactory.nodes++;
      
      MoveScoreTuple result= new MoveScoreTuple(null, 0);
      if(ply > 1) {
          List<Move> moves;
         MoveScoreTuple bestScore= null;
         
         if(whiteMove) {
            moves= p.getWhite().getPossibleMoves();         
         } else {
            moves= p.getBlack().getPossibleMoves();         
         }
         
         if(moves.size() > 0) {
            Move currentBestMove= null;
            for(Move move : moves) {
               this.movesSearched++;
               MoveScoreTuple score= this.getBestMove(p.move(move.from, move.to), e, !whiteMove, ply - 1);
               if(bestScore == null || (whiteMove ? score.getScore() > bestScore.getScore() : score.getScore() < bestScore.getScore())) {
                  bestScore= score;
                  currentBestMove= move;
               }
               p.popMove();
            }         
            result= bestScore;
            result.add(currentBestMove, e.getScore(p));
//            result.add(currentBestMove, 0);
            
         } else {
            if(whiteMove){
               if(p.getWhite().isChecked()) {
                  result= new MoveScoreTuple(null, -20000 + ply); // Checkmate
               } else {
                  result= new MoveScoreTuple(null, 0);  // Stalemate
               }
             } else {
               if(p.getBlack().isChecked()) {
                  result= new MoveScoreTuple(null, 20000 - ply); // Checkmate
               } else {
                  result= new MoveScoreTuple(null, 0);  // Stalemate
               }
            }
         }
      } else {
         List<Move> moves;
         int bestScore= 0;
         if(whiteMove) {
            moves= p.getWhite().getPossibleMoves();
         } else {
            moves= p.getBlack().getPossibleMoves();         
         }
         
         if(moves.size() > 0) {

            for(Move move : moves) {
               this.movesSearched++;
               int score= e.getScore(p.move(move.from, move.to));
               if((whiteMove ? score >= bestScore : score <= bestScore)) {
                  bestScore= score;
                  result= new MoveScoreTuple(move, score);
               }
               p.popMove();
            }
         } else {
            if(whiteMove){
               if(p.getWhite().isChecked()) {
                  result= new MoveScoreTuple(null, -20000 + ply); // Black
                                                                      // wins by
                                                                      // checkmate
               } else {
                  result= new MoveScoreTuple(null,  0);  // Stalemate
               }
             } else {
               if(p.getBlack().isChecked()) {
                  result= new MoveScoreTuple(null,  20000 - ply); // White
                                                                       // wins
                                                                       // by
                                                                       // checkmate
               } else {
                  result= new MoveScoreTuple(null,  0);  // Stalemate
               }
            }
         }
      }
      
      return result;
   }
      
   private static class MoveScoreTuple {
      private List<Move> moves;
      private int score = 0;
      
      public MoveScoreTuple(Move move, int score) {
         this.moves= new ArrayList<Move>();
         if(move != null) {
            this.moves.add(move);
         }
         this.score= score;
      }
      
      public void add(Move move, int score) {
         if(move != null) {
            this.moves.add(0, move);
         }
         this.score += score;
      }
      
      public List<Move> getMoveList(){
         return Collections.unmodifiableList(this.moves);
      }
      
      public Move getMove() {
         return this.moves.get(0);
      }
      
      public int getScore() {
         return this.score;
      }
      
   }
}
