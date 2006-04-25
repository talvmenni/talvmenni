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
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.forritan.talvmenni.knowledge.ImmutablePosition;
import org.forritan.talvmenni.knowledge.MutablePosition;
import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Position.Move;


public class TestSpeedOnMakeRandomMoveUsingTransposition {
   public static void main(
         String[] args) throws IllegalArgumentException, SecurityException,
         InstantiationException, IllegalAccessException,
         InvocationTargetException, NoSuchMethodException {

      System.err.println("Warmup... ");

      int warmup= 100000;

      //      ___resetObjectCreationStats();

      Random rnd= new Random();

      int positionCollisions= 0;
      int collisions= 0;
      int total= 0;

      Set<Integer> hashCodes= new HashSet<Integer>();
      Set<Position> positions= new HashSet<Position>();

      Position p= Position.Factory.createInitial(ImmutablePosition.class);
      boolean whiteToMove= true;
      for (int i= 0; i < warmup; i++) {
         List<Move> moves= (whiteToMove ? p.getWhite().getPossibleMoves() : p
               .getBlack().getPossibleMoves());
         if (!moves.isEmpty()) {
            Move move= moves.get(rnd.nextInt(moves.size()));
            total++;
            p= p.move(move);
            if (hashCodes.contains(new Integer(
                  p.hashCode()))) {
               collisions++;
            }
            if (positions.contains(p)) {
               positionCollisions++;
            }
            hashCodes.add(new Integer(
                  p.hashCode()));
            positions.add(p);
         } else {
            p= Position.Factory.createInitial(ImmutablePosition.class);
            hashCodes.clear();
            positions.clear();
            System.err.println("There where "
                  + collisions
                  + " hashcode collisions in "
                  + total
                  + " positions...");
            System.err.println("There where "
                  + positionCollisions
                  + " position collisions in "
                  + total
                  + " positions...");
            positionCollisions= 0;
            collisions= 0;
            total= 0;
         }
         whiteToMove= !whiteToMove;
      }
      System.err.println("... created "
            + warmup
            + " immutable positions");
      //      ___printObjectCreationStats(System.err);
      //
      //      ___resetObjectCreationStats();

      hashCodes.clear();
      positions.clear();
      System.err.println("There where "
            + collisions
            + " hashcode collisions in "
            + total
            + " positions...");
      System.err.println("There where "
            + positionCollisions
            + " position collisions in "
            + total
            + " positions...");
      positionCollisions= 0;
      collisions= 0;
      total= 0;

      p= Position.Factory.createInitial(MutablePosition.class);
      whiteToMove= true;
      for (int i= 0; i < warmup; i++) {
         List<Move> moves= (whiteToMove ? p.getWhite().getPossibleMoves() : p
               .getBlack().getPossibleMoves());
         if (!moves.isEmpty()) {
            Move move= moves.get(rnd.nextInt(moves.size()));
            p= p.move(move);
            total++;
            if (hashCodes.contains(new Integer(
                  p.hashCode()))) {
               collisions++;
            }
            if (positions.contains(p)) {
               positionCollisions++;
            }
            hashCodes.add(new Integer(
                  p.hashCode()));
            positions.add(p);
         } else {
            p= Position.Factory.createInitial(MutablePosition.class);
            hashCodes.clear();
            positions.clear();
            System.err.println("There where "
                  + collisions
                  + " hashcode collisions in "
                  + total
                  + " positions...");
            System.err.println("There where "
                  + positionCollisions
                  + " position collisions in "
                  + total
                  + " positions...");
            positionCollisions= 0;
            collisions= 0;
            total= 0;
         }
         whiteToMove= !whiteToMove;
      }

      hashCodes.clear();
      positions.clear();
      System.err.println("There where "
            + collisions
            + " hashcode collisions in "
            + total
            + " positions...");
      System.err.println("There where "
            + positionCollisions
            + " position collisions in "
            + total
            + " positions...");
      positionCollisions= 0;
      collisions= 0;
      total= 0;

      System.err.println("... created "
            + warmup
            + " mutable positions");
      //      ___printObjectCreationStats(System.err);

      p= Position.Factory.createInitial(ImmutablePosition.class);
      whiteToMove= true;
      int howMany= 100000;
      System.out.println("Making "
            + howMany
            + " random immutable moves...");

      long time= -System.currentTimeMillis();
      for (int i= 0; i < howMany; i++) {
         List<Move> moves= (whiteToMove ? p.getWhite().getPossibleMoves() : p
               .getBlack().getPossibleMoves());
         if (!moves.isEmpty()) {
            Move move= moves.get(new Random().nextInt(moves.size()));
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
      System.out.println("i.e. "
            + 1L
            * howMany
            * 1000
            / time
            + " pr. second.");

      p= Position.Factory.createInitial(MutablePosition.class);
      whiteToMove= true;
      System.out.println("Making "
            + howMany
            + " random mutable moves...");

      time= -System.currentTimeMillis();
      for (int i= 0; i < howMany; i++) {
         List<Move> moves= (whiteToMove ? p.getWhite().getPossibleMoves() : p
               .getBlack().getPossibleMoves());
         if (!moves.isEmpty()) {
            Move move= moves.get(new Random().nextInt(moves.size()));
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
      System.out.println("i.e. "
            + 1L
            * howMany
            * 1000
            / time
            + " pr. second.");
   }
}