/**
 * talvmenni - A distributed chess-engine implemented in Java(TM)
 * and against Sun Microsystems Jini/JavaSpaces(TM).
 *  
 * Copyright (C) 2004-2006 Eyðun Lamhauge and Eyðun Nielsen
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License. 
 */

package org.forritan.talvmenni.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.game.ImmutablePosition;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.PositionFactory;
import org.forritan.talvmenni.game.Transposition;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.util.ThreeTuple;


public class MiniMaxWithTranspositionSearch implements Search {

   private Thinking      thinking;
   private DebugInfo     debugInfo;

   private Transposition transposition;
   private int           ply;

   private int           movesSearched;

   public MiniMaxWithTranspositionSearch(
         int ply,
         Transposition transposition) {
      this.thinking= new Thinking();
      this.debugInfo= new DebugInfo();
      this.ply= ply;
      this.transposition= transposition;
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

      PositionFactory.nodes++;

      long time= -System.currentTimeMillis();
      this.movesSearched= 0;

      List<Move> result= new ArrayList<Move>();
      MoveScoreTuple bestScore= null;

      List<Move> moves;
      if (whiteMove) {
         moves= p.getWhite().getPossibleMoves();
      } else {
         moves= p.getBlack().getPossibleMoves();
      }

      for (Move move : moves) {
         long moveTime= -System.currentTimeMillis();
         int movesSearchedBeforeMove= this.movesSearched++;
         Position childPosition= p.move(
               move.from,
               move.to);
         MoveScoreTuple score= this.getBestMove(
               childPosition,
               e,
               !whiteMove,
               this.ply - 1);
         score.add(
               move,
               score.score
                     + e.getScore(childPosition));
         this.debugInfo.postCurrentBestMove(
               move,
               score.getScore(),
               (this.movesSearched - movesSearchedBeforeMove));
         if (bestScore == null
               || (whiteMove ? score.getScore() > bestScore.getScore() : score
                     .getScore() < bestScore.getScore())) {
            bestScore= score;
            result.clear();
            result.add(move);
            moveTime+= System.currentTimeMillis();
            this.thinking.postThinking(
                  this.ply,
                  bestScore.getScore(),
                  moveTime,
                  this.movesSearched,
                  bestScore.getMoveList().toString());
         } else if (bestScore != null
               && score.getScore() == bestScore.getScore()) {
            bestScore= score;
            result.add(move);
            this.thinking.postThinking(
                  this.ply,
                  bestScore.getScore(),
                  moveTime,
                  this.movesSearched,
                  bestScore.getMoveList().toString());
         }
         p.popMove();
      }

      time+= System.currentTimeMillis();

      this.debugInfo.postNodesPerSecond(
            time,
            this.movesSearched);
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

      MoveScoreTuple result= new MoveScoreTuple(
            null,
            0);
      
      if (ply > 1) {
         if(this.transposition.contains(p, whiteMove)) {
            ThreeTuple<Integer, Integer, List<Move>> entry= this.transposition.get(p, whiteMove);
            if(entry.a.intValue() >= ply) {
               result.update(entry.c, entry.b.intValue());
               return result;
            }            
         }
         
         List<Move> moves;
         MoveScoreTuple bestScore= null;

         if (whiteMove) {
            moves= p.getWhite().getPossibleMoves();
         } else {
            moves= p.getBlack().getPossibleMoves();
         }

         if (moves.size() > 0) {
            Move currentBestMove= null;
            for (Move move : moves) {
               this.movesSearched++;
               Position childPosition= p.move(
                     move.from,
                     move.to);
               MoveScoreTuple score= this.getBestMove(
                     childPosition,
                     e,
                     !whiteMove,
                     ply - 1);
               score.score+= e.getScore(childPosition);
               p.popMove();
               if (bestScore == null
                     || (whiteMove ? score.getScore() > bestScore.getScore()
                           : score.getScore() < bestScore.getScore())) {
                  bestScore= score;
                  currentBestMove= move;
               }
            }
            result= bestScore;
            result.add(
                  currentBestMove,
                  bestScore.score);

         } else {
            if (whiteMove) {
               if (p.getWhite().isChecked()) {
                  result= new MoveScoreTuple(
                        null,
                        -20000
                              + ply); // Checkmate
               } else {
                  result= new MoveScoreTuple(
                        null,
                        0); // Stalemate
               }
            } else {
               if (p.getBlack().isChecked()) {
                  result= new MoveScoreTuple(
                        null,
                        20000 - ply); // Checkmate
               } else {
                  result= new MoveScoreTuple(
                        null,
                        0); // Stalemate
               }
            }
         }
      } else {
         List<Move> moves;
         int bestScore;
         if (whiteMove) {
            moves= p.getWhite().getPossibleMoves();
            bestScore= Integer.MIN_VALUE;
         } else {
            moves= p.getBlack().getPossibleMoves();
            bestScore= Integer.MAX_VALUE;
         }

         if (moves.size() > 0) {

            for (Move move : moves) {
               this.movesSearched++;
               int score= e.getScore(p.move(
                     move.from,
                     move.to));
               if ((whiteMove ? score > bestScore : score < bestScore)) {
                  bestScore= score;
                  result= new MoveScoreTuple(
                        move,
                        score);
               }
               p.popMove();
            }
         } else {
            if (whiteMove) {
               if (p.getWhite().isChecked()) {
                  result= new MoveScoreTuple(
                        null,
                        -20000
                              + ply); // Black
                  // wins by
                  // checkmate
               } else {
                  result= new MoveScoreTuple(
                        null,
                        0); // Stalemate
               }
            } else {
               if (p.getBlack().isChecked()) {
                  result= new MoveScoreTuple(
                        null,
                        20000 - ply); // White
                  // wins
                  // by
                  // checkmate
               } else {
                  result= new MoveScoreTuple(
                        null,
                        0); // Stalemate
               }
            }
         }
      }
      
      this.transposition.update(p, whiteMove, result.moves, result.score, ply);

      return result;
   }

   private static class MoveScoreTuple {
      private List<Move> moves;
      private int        score = 0;

      public MoveScoreTuple(
            Move move,
            int score) {
         this.moves= new ArrayList<Move>();
         if (move != null) {
            this.moves.add(move);
         }
         this.score= score;
      }

      public void add(
            Move move,
            int score) {
         if (move != null) {
            this.moves.add(
                  0,
                  move);
         }
         this.score= score;
      }
      
      public void update(List<Move> moves, int score) {
         if(moves != null) {
            this.moves.clear();
            this.moves.addAll(moves);
         }
         this.score += score;
      }


      public List<Move> getMoveList() {
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