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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Stack;

import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Position.Move;


public interface PrincipalVariation extends Serializable {

   public static final long serialVersionUID = 1L;

   public void setDepth(
         int ply);
   
   public int getDepth();

   public List<Move> getCurrentBestLine();

   public List<Move> getBestMoveAsList();

   public void clearPrincipalVariation();

   public void clearBestLine();

   public void pop();

   public void push(
         Position.Move move);

   public void updateLastExaminedLine();

   public void updatePV(
         int ply,
         long moveTime,
         int movesSearched,
         int score);

   public Thinking getThinking();

   public DebugInfo getDebugInfo();

   public static class Factory implements PrincipalVariation {

      private static final long serialVersionUID = 1L;

      public static PrincipalVariation create(
            int depth) {
         return new Factory(
               depth);
      }

      private int       depth;
      private Stack<Move>     pv;
      private int       currentBestLineAtPly;
      private List<Move>      currentBestLine;
      private List<Move>      lastExaminedLine;
      private DebugInfo debugInfo;
      private Thinking  thinking;

      private Factory(
            int depth) {
         this.pv= new Stack<Move>();
         this.lastExaminedLine= new ArrayList<Move>(
               depth);
         this.currentBestLine= new ArrayList<Move>(
               depth);
         this.currentBestLineAtPly= 0;
         this.debugInfo= new DebugInfo();
         this.thinking= new Thinking();
      }

      public Thinking getThinking() {
         return this.thinking;
      }

      public DebugInfo getDebugInfo() {
         return this.debugInfo;
      }

      public List<Move> getCurrentBestLine() {
         return this.currentBestLine;
      }

      public List<Move> getBestMoveAsList() {
         return (this.currentBestLine.size() > 1 ? this.currentBestLine
               .subList(
                     0,
                     1) : this.currentBestLine);
      }

      public void updateLastExaminedLine() {
         this.lastExaminedLine.clear();
         this.lastExaminedLine.addAll(this.pv);
      }

      public void updatePV(
            int ply,
            long moveTime,
            int movesSearched,
            int score) {

         if (ply >= this.currentBestLineAtPly) {
            this.currentBestLineAtPly= ply;
            if (!this.lastExaminedLine.isEmpty()) {
               this.currentBestLine.clear();
               this.currentBestLine.addAll(this.lastExaminedLine);
            }
            this.thinking.postThinking(
                  ply,
                  score,
                  moveTime + 1,
                  movesSearched,
                  this.currentBestLine.toString());
         }
      }

      public void pop() {
         this.pv.pop();
      }

      public void push(
            Move move) {
         this.pv.push(move);
      }

      public int getDepth() {
         return this.depth;
      }

     public void setDepth(
            int depth) {
         this.depth= depth;
         this.clearPrincipalVariation();
      }

      public void clearPrincipalVariation() {
         this.pv.clear();
         this.currentBestLineAtPly= 0;
         this.lastExaminedLine.clear();
      }

      public void clearBestLine() {
         this.currentBestLine.clear();
      }

   }

   public static class Thinking extends Observable implements Serializable {

      public static final long serialVersionUID = 1L;

      public void postThinking(
            int ply,
            int score,
            long time,
            int nodes,
            String pv) {
         this.setChanged();
         this.notifyObservers(ply
               + " "
               + score
               + " "
               + (time / 10)
               + " "
               + nodes
               + " "
               + pv);
      }
   }

   public static class DebugInfo extends Observable implements Serializable {

      public static final long serialVersionUID = 1L;

      public void postNodesPerSecond(
            long time,
            int nodes) {
         this.setChanged();
         this.notifyObservers("Finished search of "
               + nodes
               + " positions in "
               + time
               + " milliseconds...\ni.e: "
               + 1L
               * nodes
               * 1000
               / (time + 1)
               + " pr. second.");
         // Hmmm... tricky one... add one
         // millisecond to the time to make sure that
         // we don't get division by zero
         // in notifyObservers call :-)
      }

      public void postBestMoves(
            List moves) {
         this.setChanged();
         this.notifyObservers("Best moves: "
               + moves.toString());
      }

      public void postCurrentBestMove(
            Move move,
            int score,
            int nodes) {
         this.setChanged();
         this.notifyObservers("["
               + move.toString()
               + "] "
               + score
               + " and there are "
               + nodes
               + " positions searched...");
      }

      public void postText(
            String text) {
         this.setChanged();
         this.notifyObservers(text);
      }

      public void postPossibleMoves(
            List moves) {
         this.setChanged();
         this.notifyObservers(moves.size()
               + " possible moves: "
               + moves.toString());
      }

      public void postTranspositionHits(
            int hits) {
         this.setChanged();
         this.notifyObservers("There where "
               + hits
               + " transposition hits...");
      }

   }
}