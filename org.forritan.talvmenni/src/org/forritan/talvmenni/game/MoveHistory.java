package org.forritan.talvmenni.game;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MoveHistory {

      private static MoveHistory instance;
      private List<Move> history;
      
      public static MoveHistory getInstance() {
         if (MoveHistory.instance == null) {
            MoveHistory.instance= new MoveHistory();
         }
         return MoveHistory.instance;
      }
      
      private MoveHistory() {
         this.history= new LinkedList<Move>();
      }
      
      public void add(Move move) {
         this.history.add(move);         
      }

      public void reset() {
         this.history.clear();         
      }
      
      public List<Move> getHistory(){
         return Collections.unmodifiableList(this.history);
      }
      
      public String toString() {
        return this.history.toString();
      }
      
      

}
