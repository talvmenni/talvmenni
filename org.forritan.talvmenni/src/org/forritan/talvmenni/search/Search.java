package org.forritan.talvmenni.search;

import java.util.List;
import java.util.Observable;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.game.Position;

public interface Search {
   
   public List<Position.Move> getBestMoves(Position p, Evaluation e, boolean whiteMove);
   
   public Observable getObservable();
   
   public Thinking getThinking();
   
   public class Thinking extends Observable {
      public void postThinking(int ply, int score, long time, int nodes, String pv) {
         this.setChanged();
         this.notifyObservers(ply + " " + score + " " + (time / 10) + " " + nodes + " " + pv);
      }
   }

}
