package org.forritan.talvmenni.knowledge;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.forritan.talvmenni.knowledge.Position.Move;

public class Draw implements Serializable {

   public static final long serialVersionUID = 1L;

   private static Draw instance;
   
   private Map   positionRepetitions;
   private Stack moveStack;

   public static Draw getInstance() {
      if(Draw.instance == null) {
         Draw.instance= new Draw();
      }
      return Draw.instance;
   }
   
   
   public Draw() {
      this.positionRepetitions= new HashMap();
      this.moveStack= new Stack();
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
         int repetitions= ((Integer) this.positionRepetitions.get(position)).intValue();
         this.positionRepetitions.put(
               position,
               new Integer(
                     repetitions + 1));
      }

   }

   public void pop() {
      Position position= (Position) this.moveStack.pop();
      if (this.positionRepetitions.containsKey(position)) {
         int repetitions= ((Integer) this.positionRepetitions.get(position)).intValue();
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
            && (((Integer) this.positionRepetitions.get(position)).intValue() >= 3);
   }


   public boolean by50MoveRule() {
      //TODO: Implement
      return false;
   }


}