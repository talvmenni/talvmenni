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
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.evaluation.SimpleMaterialEvaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.PositionFactory;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.talvmenni.game.Position.PromotionPiece;
import org.forritan.talvmenni.search.MiniMaxSearch;
import org.forritan.talvmenni.search.Search;
import org.forritan.talvmenni.strategy.Strategy.DebugInfo;

public class MiniMaxSearchSimpleMaterialEvaluationChooseRandomlyBetweenBestMovesStrategy implements Strategy {

   private DebugInfo debugInfo;
   
   private Search search;
   private Evaluation evaluation;
   
   public MiniMaxSearchSimpleMaterialEvaluationChooseRandomlyBetweenBestMovesStrategy(int ply) {
      this.debugInfo= new DebugInfo();
      this.search= new MiniMaxSearch(ply);
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
      return PositionFactory.PromotionPiece.DEFAULT;
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
