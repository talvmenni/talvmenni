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

import java.lang.reflect.InvocationTargetException;

import org.forritan.talvmenni.knowledge.ImmutablePosition;
import org.forritan.talvmenni.knowledge.MutablePosition;
import org.forritan.talvmenni.knowledge.Position;


public class TestSpeedOnPositionCreation {
   public static void main(
         String[] args) throws IllegalArgumentException, SecurityException,
         InstantiationException, IllegalAccessException,
         InvocationTargetException, NoSuchMethodException {

      int howMany= 1000000;

      System.out.println("Creating "
            + howMany
            + " mutable positions...");

      long time= -System.currentTimeMillis();
      Position initialPosition= Position.Factory
            .createInitial(MutablePosition.class);

      for (int i= 0; i < howMany; i++) {
         long from= 1L << (i % 32);
         long to= 1L << ((i % 32) + 16);
         initialPosition.move(new Position.Move(
               from,
               to,
               Position.PromotionPiece.NONE));
         initialPosition.popMove();
         //         Move m= new Move(
         //               initialPosition,
         //               from,
         //               to,
         //               PositionFactory.PromotionPiece.DEFAULT);
         //         if (howMany < 1001) {
         //            MoveHistory.getInstance().add(
         //                  m);
         //         }
      }

      time+= System.currentTimeMillis();

      System.out.println("...in "
            + time
            + " milliseconds.");
      System.out.println("i.e. "
            + 1L
            * howMany
            * 1000
            / time
            + " pr. second.");

      //      System.out.println(MoveHistory.getInstance().getHistory());

      System.out.println("Creating "
            + howMany
            + " immutable positions...");

      time= -System.currentTimeMillis();
      initialPosition= Position.Factory.createInitial(ImmutablePosition.class);

      for (int i= 0; i < howMany; i++) {
         long from= 1L << (i % 32);
         long to= 1L << ((i % 32) + 16);

         initialPosition.move(new Position.Move(
               from,
               to,
               Position.PromotionPiece.NONE));
         initialPosition.popMove();

         //         Move m= new Move(
         //               initialPosition,
         //               from,
         //               to,
         //               PositionFactory.PromotionPiece.DEFAULT);
         //         if (howMany < 1001) {
         //            MoveHistory.getInstance().add(
         //                  m);
         //         }
      }

      time+= System.currentTimeMillis();

      System.out.println("...in "
            + time
            + " milliseconds.");
      System.out.println("i.e. "
            + 1L
            * howMany
            * 1000
            / time
            + " pr. second.");

      //      System.out.println(MoveHistory.getInstance().getHistory());

   }
}