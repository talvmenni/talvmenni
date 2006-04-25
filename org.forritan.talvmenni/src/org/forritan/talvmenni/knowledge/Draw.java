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

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Draw implements Serializable {

   public static final long serialVersionUID = 1L;

   private Map<Position, Integer>   positionRepetitions;
   private Stack<Position> moveStack;

   
   public Draw() {
      this.positionRepetitions= new HashMap<Position, Integer>();
      this.moveStack= new Stack<Position>();
   }
   
   public void clear() {
      this.positionRepetitions.clear();
      this.moveStack.clear();
   }

   public void push(
         Position position) {
      this.moveStack.push(position);
      if (!this.positionRepetitions.containsKey(position)) {
         this.positionRepetitions.put(
               position,
               new Integer(
                     1));
      } else {
         int repetitions= this.positionRepetitions.get(position).intValue();
         this.positionRepetitions.put(
               position,
               new Integer(
                     repetitions + 1));
      }

   }

   public void pop() {
      Position position= this.moveStack.pop();
      if (this.positionRepetitions.containsKey(position)) {
         int repetitions= this.positionRepetitions.get(position).intValue();
         if (repetitions <= 1) {
            this.positionRepetitions.remove(position);
         } else {
            this.positionRepetitions.put(
                  position,
                  new Integer(
                        repetitions--));
         }
      }
   }

   public boolean by3Repetitions(
         Position position) {
      return this.positionRepetitions.containsKey(position)
            && (this.positionRepetitions.get(position).intValue() >= 3);
   }


   public boolean by50MoveRule() {
      //TODO: Implement
      return false;
   }


}