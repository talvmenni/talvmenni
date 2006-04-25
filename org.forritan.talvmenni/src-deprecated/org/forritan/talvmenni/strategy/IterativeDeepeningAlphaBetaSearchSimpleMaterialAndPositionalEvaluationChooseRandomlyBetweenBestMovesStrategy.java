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

package org.forritan.talvmenni.strategy;

import java.util.List;
import java.util.Random;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.talvmenni.game.Position.PromotionPiece;
import org.forritan.talvmenni.search.AlphaBetaSearch;
import org.forritan.talvmenni.search.Search;
import org.forritan.talvmenni.strategy.Strategy.DebugInfo;

public class IterativeDeepeningAlphaBetaSearchSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy implements Strategy {

   private DebugInfo debugInfo;
   
   private Search search;
   private Evaluation evaluation;
   private int ply;
   
   public IterativeDeepeningAlphaBetaSearchSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy(int ply) {
      this.debugInfo= new DebugInfo();
      this.search= new AlphaBetaSearch();
      this.evaluation= new SimpleMaterialAndPositionalEvaluation();
      this.ply= ply;
   }
   
   public Position.Move getNextMove(Position position, boolean whiteToMove) {
            
      List<Position.Move> bestMoves= null;
         for (int i= 0; i <= this.ply; i++) {
            this.search.setPly(i);
            bestMoves= this.search.getBestMoves(position.getMutable(), this.evaluation, whiteToMove);            
         }
         if(bestMoves != null && !bestMoves.isEmpty()) {
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
      return null;
   }

   public DebugInfo getDebugInfo() {
      return this.debugInfo;
   }

}
