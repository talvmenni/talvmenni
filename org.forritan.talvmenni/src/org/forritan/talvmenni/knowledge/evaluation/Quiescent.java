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

package org.forritan.talvmenni.knowledge.evaluation;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Position.Move;
import org.forritan.talvmenni.search.AlphaBetaSearch;
import org.forritan.talvmenni.search.PrincipalVariation;


public class Quiescent implements Serializable {

   public static final long serialVersionUID = 1L;

   private int              maxDepth;
   private AlphaBetaSearch  search;

   public Quiescent(
         PrincipalVariation pv,
         int maxDepth) {
      this.maxDepth= maxDepth;
      this.search= new AlphaBetaSearch();
   }

   public int search(
         Position p,
         Evaluation e,
         boolean whiteMove,
         int ply,
         int alpha,
         int beta) {

      if ((whiteMove ? p.getWhite().isInCheck() : p.getBlack().isInCheck()))
            return this.search.alphaBeta(
                  p,
                  e,
                  whiteMove,
                  1,
                  alpha,
                  beta);

      int score= (e.getScore(
            p,
            whiteMove) * (whiteMove ? 1 : -1));

      if ((this.maxDepth + ply) > 0) {

         if (score >= beta) { return beta; }

         if (score > alpha) {
            alpha= score;
         }

         List moves;

         if (whiteMove) {
            moves= p.getWhite().getPossibleCaptureMoves();
         } else {
            moves= p.getBlack().getPossibleCaptureMoves();
         }

         if (moves.size() > 0) {
            for (Iterator it= moves.iterator(); it.hasNext();) {
               Move move= (Move) it.next();

               p= p.move(move);

               long moveTime= -System.currentTimeMillis();
               score= -search(
                     p,
                     e,
                     !whiteMove,
                     ply - 1,
                     -beta,
                     -alpha);

               p.popMove();

               if (score >= beta) { return beta; }

               moveTime+= System.currentTimeMillis();

               if (score > alpha) {
                  alpha= score;
               }
            }
         } else {
            alpha= score; //TODO: ????? Skal tað vera so???
         }
         return alpha;
      } else {
         return score;
      }
   }
}