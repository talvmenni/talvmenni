package org.forritan.talvmenni.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Stack;

import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.Position.Move;


public interface PrincipalVariation {

   public void setDepth(
         int ply);

   public List getCurrentBestLine();

   public List getBestMoveAsList();

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

      public static PrincipalVariation create(
            int depth) {
         return new Factory(
               depth);
      }

      private int       depth;
      private Stack     pv;
      private int       currentBestLineAtPly;
      private List      currentBestLine;
      private List      lastExaminedLine;
      private DebugInfo debugInfo;
      private Thinking  thinking;

      private Factory(
            int depth) {
         this.pv= new Stack();
         this.lastExaminedLine= new ArrayList(
               depth);
         this.currentBestLine= new ArrayList(
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

      public List getCurrentBestLine() {
         return this.currentBestLine;
      }

      public List getBestMoveAsList() {
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

   public static class Thinking extends Observable {
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

   public static class DebugInfo extends Observable {

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