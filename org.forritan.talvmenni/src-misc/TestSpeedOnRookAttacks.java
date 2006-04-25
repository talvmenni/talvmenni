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

import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.attacks.Rook;
import org.forritan.talvmenni.knowledge.Position;

public class TestSpeedOnRookAttacks {

   public static void main(
         String[] args) {

      int howMany= 1000000;

      System.out.println(" Asking for rook attacks "
            + howMany
            + " times...");

      long time= -System.currentTimeMillis();
      Position p= Position.Factory.create(
            false, 
            false,
            Position.AuxiliaryState.NO_AUXILIARY_STATE,
            Square._E1, // whiteKings
            Square._G4, // whiteQueens
            Square._A1
                  | Square._H1, // whiteRooks
            Square._B4
                  | Square._F1, // whiteBishops
            Square._C3
                  | Square._G1, // whiteKnights
            Square._A3
                  | Square._B2
                  | Square._C2
                  | Square._D4
                  | Square._E3
                  | Square._F4
                  | Square._G2
                  | Square._H2, // whitePawns
            Square._EMPTY_BOARD, // whiteCastling
            Square._EMPTY_BOARD, // whiteEnpassant
            Square._E8, // blackKings
            Square._D8, // blackQueens
            Square._A5
                  | Square._H8, // blackRooks
            Square._C8
                  | Square._F8, // blackBishops
            Square._D1
                  | Square._F6, // blackKnights
            Square._B7
                  | Square._C7
                  | Square._D5
                  | Square._E6
                  | Square._F7
                  | Square._G7
                  | Square._H7, // blackPawns
            Square._EMPTY_BOARD, // blackCastling
            Square._EMPTY_BOARD // blackEnpassant
            );

      long[] from= {Square._A1, Square._H1, Square._A5, Square._H8};
      
      for (int i= 0; i < howMany; i++) {
         @SuppressWarnings("unused")
         long attacks= Rook.attacksFrom(from[i % 4], p);
      }

      time+= System.currentTimeMillis();

      System.out.println("...in "
            + time
            + " milliseconds.");

      System.out.println("i.e. " + 1L * howMany * 1000 / time + " pr. second.");
   }
}
