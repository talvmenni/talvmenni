package org.forritan.talvmenni.knowledge;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MoveHistory {

      private static MoveHistory instance;
      private List history;
      
      public static MoveHistory getInstance() {
         if (MoveHistory.instance == null) {
            MoveHistory.instance= new MoveHistory();
         }
         return MoveHistory.instance;
      }
      
      private MoveHistory() {
         this.history= new LinkedList();
      }
      
      public void add(Move move) {
         this.history.add(move);         
         //XXX: Remember to remove this crap...
         if (this.history.size() > 998) {
            System.out.println("offer draw"); // Stops WinBoard from crashing...
         }
      }

      public void reset() {
         this.history.clear();         
      }
      
      public List getHistory(){
         return Collections.unmodifiableList(this.history);
      }
      
      public String toString() {
        return this.history.toString();
      }
      
      

}
