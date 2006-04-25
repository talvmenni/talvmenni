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

package org.forritan.talvmenni.knowledge;

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
