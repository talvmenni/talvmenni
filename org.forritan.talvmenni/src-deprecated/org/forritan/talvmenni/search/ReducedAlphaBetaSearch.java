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
import java.util.List;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.AbstractPosition;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.util.Tuple;


public class ReducedAlphaBetaSearch implements Search {

   private Thinking  thinking;
   private DebugInfo debugInfo;
   private int       ply;
   private Integer   moveListOffset = null;

   private int       movesSearched;

   public ReducedAlphaBetaSearch() {
      this(
            0);
   }

   public ReducedAlphaBetaSearch(
         int ply) {
      this.ply= ply;
      this.thinking= new Thinking();
      this.debugInfo= new DebugInfo();
   }

   public void setPly(
         int ply) {
      this.ply= ply;
   }

   public void setMoveListOffset(
         int moveListOffset) {
      this.moveListOffset= Integer.valueOf(moveListOffset);
      this.debugInfo.postText("moveListOffset= "
            + moveListOffset);
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

      long time= -System.currentTimeMillis();
      this.movesSearched= 0;

      int alpha= Integer.MIN_VALUE + 1;
      // Very important!!! Can't be
      // Integer.MIN_VALUE, because
      // Integer.MIN_VALUE ==
      // -Integer.MIN_VALUE
      // int beta= Integer.MAX_VALUE;
      // If checkmate there is no need to search further...
      int beta= Evaluation.CHECKMATE_SCORE;

      Tuple<Integer, List<Move>> result= this.alphaBeta(
            p,
            e,
            whiteMove,
            this.ply,
            alpha,
            beta);

      time+= System.currentTimeMillis();

      this.debugInfo.postNodesPerSecond(
            time,
            this.movesSearched);
      this.debugInfo.postBestMoves(result.b);

      return (result.b.size() > 0 ? result.b.subList(
            0,
            1) : result.b);
   }

   private Tuple<Integer, List<Move>> alphaBeta(
         Position p,
         Evaluation e,
         boolean whiteMove,
         int ply,
         int alpha,
         int beta) {

      Tuple<Integer, List<Move>> result= null;

      if (ply == 0) {
         result= new Tuple<Integer, List<Move>>(
               Integer.valueOf((e.getScore(p) * (whiteMove ? 1 : -1))),
               new ArrayList<Move>());
      } else {
         List<Move> moves;
         Tuple<Integer, List<Move>> best= new Tuple<Integer, List<Move>>(
               Integer.valueOf(Integer.MIN_VALUE + 1),
               new ArrayList<Move>());

         if (whiteMove) {
            moves= p.getWhite().getPossibleMoves();
         } else {
            moves= p.getBlack().getPossibleMoves();
         }

         if (this.moveListOffset != null
               && ply == this.ply
               && moves.size() > moveListOffset.intValue()) {
            moves= moves.subList(
                  0,
                  moveListOffset.intValue());
         }

         if (moves.size() > 0) {
            for (Move move : moves) {
               if (best.a.intValue() >= beta) {
                  //                  this.debugInfo.postText("***break***");
                  break;
               }
               this.movesSearched++;

               int movesSearchedBefore= this.movesSearched;
               long moveTime= -System.currentTimeMillis();
               p= p.move(
                     move.from,
                     move.to);
               if (best.a.intValue() > alpha) {
                  alpha= best.a.intValue();
               }
               Tuple<Integer, List<Move>> value= alphaBeta(
                     p,
                     e,
                     !whiteMove,
                     ply - 1,
                     -beta,
                     -alpha);
               p.popMove();
               value.a= Integer.valueOf(value.a.intValue()
                     * -1);
               value.b.add(
                     0,
                     move);
               moveTime+= System.currentTimeMillis();

               if (value.a.intValue() > best.a.intValue()) {
                  best= value;
                  if (whiteMove) {
                     p.getWhite().killerMove(
                           move);
                  } else {
                     p.getBlack().killerMove(
                           move);
                  }
                  if (ply == this.ply) {
                     this.debugInfo.postCurrentBestMove(
                           move,
                           best.a.intValue(),
                           (this.movesSearched - movesSearchedBefore));
                     this.thinking.postThinking(
                           ply,
                           (best.a.intValue() * (whiteMove ? 1 : -1)),
                           moveTime + 1,
                           (this.movesSearched - movesSearchedBefore),
                           best.b.toString());
                  }
               }
            }

            p.getWhite().updatePossibleMovesOrdering();
            p.getBlack().updatePossibleMovesOrdering();

            result= best;
         } else {
            if (whiteMove ? p.getWhite().isChecked() : p.getBlack().isChecked()) {
               // Checkmate...
               result= new Tuple<Integer, List<Move>>(
                     Integer.valueOf(((-Evaluation.CHECKMATE_SCORE - ply))),
                     new ArrayList<Move>());
            } else {
               // Stalemate...
               result= new Tuple<Integer, List<Move>>(
                     Integer.valueOf(0),
                     new ArrayList<Move>());
            }
         }
      }

      return result;
   }
}