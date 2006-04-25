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

import java.util.Random;

import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.Squares;

public class TestSpeedOnDebruijnIndexVsLongNumberOfLeadingZeroesVsLongNumberOfTrailingZeroes {
   
   public static void main(
         String[] args) {
      
      int howMany= 1000000;
      
      Square sq= Squares.create();
      
      //VM warmup...
      @SuppressWarnings("unused")
      int index;

      for (int i= 0; i < howMany; i++) {
         index= Square.Util.deBruijn64Index(sq.getSquare(new Random().nextInt(64))); 
      }
      for (int i= 0; i < howMany; i++) {
         index= Square.Util.numberOfLeadingZeros(sq.getSquare(new Random().nextInt(64))); 
      }
      for (int i= 0; i < howMany; i++) {
         index= Square.Util.numberOfTrailingZeros(sq.getSquare(new Random().nextInt(64))); 
      }

      // Square.Util.deBruijn64Index
      long time= -System.currentTimeMillis();
      for (int i= 0; i < howMany; i++) {
         index= Square.Util.deBruijn64Index(sq.getSquare(new Random().nextInt(64))); 
      }      
      time += System.currentTimeMillis();      
      System.out.println("Getting the index " + howMany + " times using deBruijn64Index: " + time + " milliseconds...");
      
      // Long.numberOfLeadingZeros
      time= -System.currentTimeMillis();
      for (int i= 0; i < howMany; i++) {
         index= Square.Util.numberOfLeadingZeros(sq.getSquare(new Random().nextInt(64))); 
      }      
      time += System.currentTimeMillis();      
      System.out.println("Getting the index " + howMany + " times using Long.numberOfLeadingZeros: " + time + " milliseconds...");
      
      // Long.numberOfTrailingZeros
      time= -System.currentTimeMillis();
      for (int i= 0; i < howMany; i++) {
         index= Square.Util.numberOfTrailingZeros(sq.getSquare(new Random().nextInt(64))); 
      }      
      time += System.currentTimeMillis();      
      System.out.println("Getting the index " + howMany + " times using Long.numberOfTrailingZeros: " + time + " milliseconds...");
      
      
   }

}
