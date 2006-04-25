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

import org.forritan.talvmenni.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.search.ReducedAlphaBetaSearch;


public class IterativeDeepeningAndReductionAlphaBetaStrategy extends
      AbstractStrategy {

   private int reductionFromPly;

   public IterativeDeepeningAndReductionAlphaBetaStrategy(
         int ply,
         int reductionFromPly,
         TheoryBook book) {
      super(
            ply,
            book);
      this.reductionFromPly= reductionFromPly;
      this.search= new ReducedAlphaBetaSearch();
      this.evaluation= new SimpleMaterialAndPositionalEvaluation();
   }

   protected List<Position.Move> search(
         Position position,
         boolean whiteToMove) {

      List<Position.Move> result= null;
      Position mutablePosition= position.getMutable();
      int numberOfMoves;
      if (whiteToMove) {
         numberOfMoves= mutablePosition.getWhite().getPossibleMoves().size();
      } else {
         numberOfMoves= mutablePosition.getBlack().getPossibleMoves().size();
      }
      for (int i= 1; i <= this.ply; i++) {
         this.search.setPly(i);
         
         if (i >= this.reductionFromPly) {
            int offset= numberOfMoves;
            for (int j= this.reductionFromPly; j <= i; j++) {
               offset /= 2;
            }
            if(offset < 2) {
               offset= 2;               
            }
            ((ReducedAlphaBetaSearch) this.search).setMoveListOffset(offset);
         }

         result= this.search.getBestMoves(
               mutablePosition,
               this.evaluation,
               whiteToMove);
      }

      return result;
   }
}