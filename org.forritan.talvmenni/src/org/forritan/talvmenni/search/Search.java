package org.forritan.talvmenni.search;

import java.util.List;
import java.util.Observable;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.Position.Move;

public interface Search {
   
   public List<Position.Move> getBestMoves(Position p, Evaluation e, boolean whiteMove);
   
   public Thinking getThinking();
   public DebugInfo getDebugInfo();
   
   public class Thinking extends Observable {
      public void postThinking(int ply, int score, long time, int nodes, String pv) {
         this.setChanged();
         this.notifyObservers(ply + " " + score + " " + (time / 10) + " " + nodes + " " + pv);
      }
   }

   public class DebugInfo extends Observable {
      
      public void postNodesPerSecond(long time, int nodes) {
         this.setChanged();
         this.notifyObservers(
               "Finished search of " 
               + nodes 
               + " positions in " 
               + time 
               + " milliseconds...\ni.e: " 
               + 1L * nodes * 1000 / (time + 1) + " pr. second.");
         // Hmmm... tricky one... add one
         // millisecond to the time to make sure that
         // we don't get division by zero
         // in notifyObservers call :-)
      }

      public void postBestMoves(List<Move> moves) {
         this.setChanged();
         this.notifyObservers(
               "Best moves: " 
               + moves.toString());
      }

      public void postCurrentBestMove(Move move, int score, int nodes) {
         this.setChanged();
         this.notifyObservers(
               "[" 
               + move.toString() 
               + "] " 
               + score 
               + " and there are " 
               + nodes 
               + " positions searched...");
      }
      
   }

}
