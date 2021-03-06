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

package org.forritan.talvmenni.search;

import java.util.Iterator;
import java.util.List;

import org.forritan.talvmenni.knowledge.HistoryHeuristic;
import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Transposition;
import org.forritan.talvmenni.knowledge.Position.Move;
import org.forritan.talvmenni.knowledge.evaluation.Evaluation;
import org.forritan.talvmenni.search.PrincipalVariation.DebugInfo;
import org.forritan.talvmenni.search.PrincipalVariation.Thinking;


public class NegaMaxSearch implements Search {
   
   private static final long serialVersionUID = 1L;

   private int lastScore;

   public int getLastScore() {
      return this.lastScore;
   }

   private PrincipalVariation pv;
   private int                ply;

   private int                movesSearched;

   public NegaMaxSearch(PrincipalVariation pv) {
      this(
            0,
            pv);
   }

   public NegaMaxSearch(
         int ply,
         PrincipalVariation pv) {
      this.ply= ply;
      this.pv= pv;
   }

   public void setPly(
         int ply) {
      this.ply= ply;
   }

   public PrincipalVariation getPrincipalVariation() {
      return this.pv;
   }

   public Thinking getThinking() {
      return this.pv.getThinking();
   }

   public DebugInfo getDebugInfo() {
      return this.pv.getDebugInfo();
   }

   public List<Move> getBestMoves(
         Position p,
         Evaluation e,
         boolean whiteMove) {

      long time= -System.currentTimeMillis();
      this.movesSearched= 0;
      
      this.pv.clearPrincipalVariation();

      int result= this.negaMax(
            p,
            e,
            whiteMove,
            this.ply);
      
      this.lastScore= result;

      time+= System.currentTimeMillis();

      System.err.println("*** at ply = " + ply + " : best result = " + result + " NegaMaxSearch ***");

      this.pv.getDebugInfo().postNodesPerSecond(
            time,
            this.movesSearched);
      this.pv.getDebugInfo().postBestMoves(pv.getCurrentBestLine());
      return (pv.getBestMoveAsList());
   }

   public int negaMax(
         Position p,
         Evaluation e,
         boolean whiteMove,
         int ply) {

      int result;
      if (ply == 0) {
         this.pv.updateLastExaminedLine();
         result= (e.getScore(p, whiteMove) * (whiteMove ? 1 : -1));
      } else {
         List moves;
         int best= Integer.MIN_VALUE + 1;

         if (whiteMove) {
            moves= p.getWhite().getPossibleMoves();
         } else {
            moves= p.getBlack().getPossibleMoves();
         }

         if (moves.size() > 0) {
            for (Iterator it= moves.iterator(); it.hasNext();) {
               Move move= (Move) it.next();

               this.movesSearched++;

               int movesSearchedBefore= this.movesSearched;
               long moveTime= -System.currentTimeMillis();
               p= p.move(move);

               this.pv.push(move);

               int score= -negaMax(
                     p,
                     e,
                     !whiteMove,
                     ply - 1);
       
               this.pv.pop();

               p.popMove();

               moveTime+= System.currentTimeMillis();

               if (score > best) {
                  best= score;
                  this.pv.updatePV(
                        ply,
                        moveTime,
                        (this.movesSearched - movesSearchedBefore),
                        (best * (whiteMove ? 1 : -1)));
               }
            }
            result= best;
         } else {
            if (whiteMove ? p.getWhite().isInCheck() : p.getBlack().isInCheck()) {
               // Checkmate...
               result= -(Evaluation.CHECKMATE_SCORE + ply);
            } else {
               // Stalemate...
               result= 0;
            }
            this.pv.updateLastExaminedLine();
         }
      }
      return result;
   }

   public HistoryHeuristic getHistoryHeuristic() {
      throw new UnsupportedOperationException();
   }

   public void setHistoryHeuristic(
         HistoryHeuristic historyHeuristic) {
      throw new UnsupportedOperationException();
   }
   
   
   public Transposition getTransposition() {
      throw new UnsupportedOperationException();
   }
   
   public void setTransposition(
         Transposition transposition) {
      throw new UnsupportedOperationException();
   }
}