/**
 * talvmenni - A distributed chess-engine implemented in Java(TM)
 * and against Sun Microsystems Jini/JavaSpaces(TM).
 *  
 * Copyright (C) 2004-2006 Ey?un Lamhauge and Ey?un Nielsen
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

package org.forritan.talvmenni.strategy;

import java.util.List;
import java.util.Random;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.game.Transposition;
import org.forritan.talvmenni.search.AlphaBetaUsingKillerMoveOrderingAndTranspositionTableSearch;
import org.forritan.talvmenni.search.Search;
import org.forritan.talvmenni.strategy.Strategy.DebugInfo;


public class IterativeDeepeningAlphaBetaSearchUsingKillerMoveOrderingAndTranpositionTableSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy
      implements Strategy {

   private DebugInfo debugInfo;
   
   private Search     search;
   private Evaluation evaluation;
   private int        ply;

   public IterativeDeepeningAlphaBetaSearchUsingKillerMoveOrderingAndTranpositionTableSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy(
         int ply,
         Transposition transposition) {
      this.debugInfo= new DebugInfo();
      this.search= new AlphaBetaUsingKillerMoveOrderingAndTranspositionTableSearch(
            transposition);
      this.evaluation= new SimpleMaterialAndPositionalEvaluation();
      this.ply= ply;
   }

   public Position.Move getNextMove(
         Position position,
         boolean whiteToMove) {
      List<Position.Move> bestMoves= this.getNextBestMoves(position, whiteToMove, 0, this.ply);
      if (bestMoves != null
            && !bestMoves.isEmpty()) {
         int chosenMoveIndex= new Random().nextInt(bestMoves.size());
         return bestMoves.get(chosenMoveIndex);
      } else {
         return null;
      }
   }

   private List<Position.Move> getNextBestMoves(
         Position position,
         boolean whiteToMove,
         int startPly,
         int endPly) {
      
      List<Position.Move> bestMoves= null;
      for (int i= startPly; i <= endPly; i++) {
         this.search.setPly(i);
         bestMoves= this.search.getBestMoves(
               position.getMutable(),
               this.evaluation,
               whiteToMove);
      }      
      return bestMoves;
   }

   public int getPromotionPiece() {
      return Position.PromotionPiece.DEFAULT;
   }

   public Search getSearch() {
      return this.search;
   }
   
   public TheoryBook getTheoryBook() {
      return null;
   }

   public DebugInfo getDebugInfo() {
      return this.debugInfo;
   }
   
}