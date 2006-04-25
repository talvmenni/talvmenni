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
import java.util.List;
import java.util.Random;

import org.forritan.talvmenni.knowledge.ImmutablePosition;
import org.forritan.talvmenni.knowledge.MutablePosition;
import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Position.Move;


public class TestSpeedOnMakeRandomMove {
   public static void main(
         String[] args) throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
           
      
      System.err.println("Warmup... ");

      int warmup= 100000;      
      
//      ___resetObjectCreationStats();
     
      Random rnd= new Random();
      
      Position p= Position.Factory.createInitial(ImmutablePosition.class);
      boolean whiteToMove= true;
      for (int i= 0; i < warmup; i++) {
         List moves= (whiteToMove ? p.getWhite().getPossibleMoves() : p.getBlack().getPossibleMoves());
         if(!moves.isEmpty()) {
            Move move= (Move) moves.get(rnd.nextInt(moves.size()));
            p= p.move(move);
         } else {
            p= Position.Factory.createInitial(ImmutablePosition.class);
         }
         whiteToMove= !whiteToMove;
      }
      System.err.println("... created " + warmup + " immutable positions");
//      ___printObjectCreationStats(System.err);
//
//      ___resetObjectCreationStats();

      p= Position.Factory.createInitial(MutablePosition.class);
      whiteToMove= true;
      for (int i= 0; i < warmup; i++) {
         List moves= (whiteToMove ? p.getWhite().getPossibleMoves() : p.getBlack().getPossibleMoves());
         if(!moves.isEmpty()) {
            Move move= (Move) moves.get(rnd.nextInt(moves.size()));
            p= p.move(move);
         } else {
            p= Position.Factory.createInitial(MutablePosition.class);
         }
         whiteToMove= !whiteToMove;
      }

      System.err.println("... created " + warmup + " mutable positions");
//      ___printObjectCreationStats(System.err);

      
      
      p= Position.Factory.createInitial(ImmutablePosition.class);
      whiteToMove= true;
      int howMany= 100000;
      System.out.println("Making "
            + howMany
            + " random immutable moves...");
            

      long time= -System.currentTimeMillis();
      for (int i= 0; i < howMany; i++) {
         List moves= (whiteToMove ? p.getWhite().getPossibleMoves() : p.getBlack().getPossibleMoves());
         if(!moves.isEmpty()) {
            Move move= (Move) moves.get(new Random().nextInt(moves.size()));
            p= p.move(move);
         } else {
            p= Position.Factory.createInitial(ImmutablePosition.class);
            System.out.print(".");
         }
         whiteToMove= !whiteToMove;
      }

      time+= System.currentTimeMillis();

      System.out.println("...in "
            + time
            + " milliseconds.");
      System.out.println("i.e. " + 1L * howMany * 1000 / time + " pr. second.");

 
   
      p= Position.Factory.createInitial(MutablePosition.class);
      whiteToMove= true;
      System.out.println("Making "
            + howMany
            + " random mutable moves...");
            

      time= -System.currentTimeMillis();
      for (int i= 0; i < howMany; i++) {
         List moves= (whiteToMove ? p.getWhite().getPossibleMoves() : p.getBlack().getPossibleMoves());
         if(!moves.isEmpty()) {
            Move move= (Move) moves.get(new Random().nextInt(moves.size()));
            p= p.move(move);
            p.popMove();
         } else {
            p= Position.Factory.createInitial(MutablePosition.class);
            System.out.print(".");
         }
         whiteToMove= !whiteToMove;
      }

      time+= System.currentTimeMillis();

      System.out.println("...in "
            + time
            + " milliseconds.");
      System.out.println("i.e. " + 1L * howMany * 1000 / time + " pr. second.");
   }
}