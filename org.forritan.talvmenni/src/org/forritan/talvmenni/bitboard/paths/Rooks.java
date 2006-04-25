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

package org.forritan.talvmenni.bitboard.paths;

import org.forritan.talvmenni.bitboard.Square;

public class Rooks implements Rook {

   private static final long   serialVersionUID = 1L;
   private static Rooks        instance;
   private static final long[] bitmaps          = new long[64];

   public static Rook create() {
      if (Rooks.instance == null) {
         Rooks.instance= new Rooks();
      }
      return Rooks.instance;
   }

   private Rooks() {
   }

   public long getPathsFrom(
         long square) {
      return Rooks.bitmaps[Square.Util.index(square)];
   }

   static {
      bitmaps[Square.Util.index(Square._A8)]= _PATHS_FROM_A8;
      bitmaps[Square.Util.index(Square._B8)]= _PATHS_FROM_B8;
      bitmaps[Square.Util.index(Square._C8)]= _PATHS_FROM_C8;
      bitmaps[Square.Util.index(Square._D8)]= _PATHS_FROM_D8;
      bitmaps[Square.Util.index(Square._E8)]= _PATHS_FROM_E8;
      bitmaps[Square.Util.index(Square._F8)]= _PATHS_FROM_F8;
      bitmaps[Square.Util.index(Square._G8)]= _PATHS_FROM_G8;
      bitmaps[Square.Util.index(Square._H8)]= _PATHS_FROM_H8;
      bitmaps[Square.Util.index(Square._A7)]= _PATHS_FROM_A7;
      bitmaps[Square.Util.index(Square._B7)]= _PATHS_FROM_B7;
      bitmaps[Square.Util.index(Square._C7)]= _PATHS_FROM_C7;
      bitmaps[Square.Util.index(Square._D7)]= _PATHS_FROM_D7;
      bitmaps[Square.Util.index(Square._E7)]= _PATHS_FROM_E7;
      bitmaps[Square.Util.index(Square._F7)]= _PATHS_FROM_F7;
      bitmaps[Square.Util.index(Square._G7)]= _PATHS_FROM_G7;
      bitmaps[Square.Util.index(Square._H7)]= _PATHS_FROM_H7;
      bitmaps[Square.Util.index(Square._A6)]= _PATHS_FROM_A6;
      bitmaps[Square.Util.index(Square._B6)]= _PATHS_FROM_B6;
      bitmaps[Square.Util.index(Square._C6)]= _PATHS_FROM_C6;
      bitmaps[Square.Util.index(Square._D6)]= _PATHS_FROM_D6;
      bitmaps[Square.Util.index(Square._E6)]= _PATHS_FROM_E6;
      bitmaps[Square.Util.index(Square._F6)]= _PATHS_FROM_F6;
      bitmaps[Square.Util.index(Square._G6)]= _PATHS_FROM_G6;
      bitmaps[Square.Util.index(Square._H6)]= _PATHS_FROM_H6;
      bitmaps[Square.Util.index(Square._A5)]= _PATHS_FROM_A5;
      bitmaps[Square.Util.index(Square._B5)]= _PATHS_FROM_B5;
      bitmaps[Square.Util.index(Square._C5)]= _PATHS_FROM_C5;
      bitmaps[Square.Util.index(Square._D5)]= _PATHS_FROM_D5;
      bitmaps[Square.Util.index(Square._E5)]= _PATHS_FROM_E5;
      bitmaps[Square.Util.index(Square._F5)]= _PATHS_FROM_F5;
      bitmaps[Square.Util.index(Square._G5)]= _PATHS_FROM_G5;
      bitmaps[Square.Util.index(Square._H5)]= _PATHS_FROM_H5;
      bitmaps[Square.Util.index(Square._A4)]= _PATHS_FROM_A4;
      bitmaps[Square.Util.index(Square._B4)]= _PATHS_FROM_B4;
      bitmaps[Square.Util.index(Square._C4)]= _PATHS_FROM_C4;
      bitmaps[Square.Util.index(Square._D4)]= _PATHS_FROM_D4;
      bitmaps[Square.Util.index(Square._E4)]= _PATHS_FROM_E4;
      bitmaps[Square.Util.index(Square._F4)]= _PATHS_FROM_F4;
      bitmaps[Square.Util.index(Square._G4)]= _PATHS_FROM_G4;
      bitmaps[Square.Util.index(Square._H4)]= _PATHS_FROM_H4;
      bitmaps[Square.Util.index(Square._A3)]= _PATHS_FROM_A3;
      bitmaps[Square.Util.index(Square._B3)]= _PATHS_FROM_B3;
      bitmaps[Square.Util.index(Square._C3)]= _PATHS_FROM_C3;
      bitmaps[Square.Util.index(Square._D3)]= _PATHS_FROM_D3;
      bitmaps[Square.Util.index(Square._E3)]= _PATHS_FROM_E3;
      bitmaps[Square.Util.index(Square._F3)]= _PATHS_FROM_F3;
      bitmaps[Square.Util.index(Square._G3)]= _PATHS_FROM_G3;
      bitmaps[Square.Util.index(Square._H3)]= _PATHS_FROM_H3;
      bitmaps[Square.Util.index(Square._A2)]= _PATHS_FROM_A2;
      bitmaps[Square.Util.index(Square._B2)]= _PATHS_FROM_B2;
      bitmaps[Square.Util.index(Square._C2)]= _PATHS_FROM_C2;
      bitmaps[Square.Util.index(Square._D2)]= _PATHS_FROM_D2;
      bitmaps[Square.Util.index(Square._E2)]= _PATHS_FROM_E2;
      bitmaps[Square.Util.index(Square._F2)]= _PATHS_FROM_F2;
      bitmaps[Square.Util.index(Square._G2)]= _PATHS_FROM_G2;
      bitmaps[Square.Util.index(Square._H2)]= _PATHS_FROM_H2;
      bitmaps[Square.Util.index(Square._A1)]= _PATHS_FROM_A1;
      bitmaps[Square.Util.index(Square._B1)]= _PATHS_FROM_B1;
      bitmaps[Square.Util.index(Square._C1)]= _PATHS_FROM_C1;
      bitmaps[Square.Util.index(Square._D1)]= _PATHS_FROM_D1;
      bitmaps[Square.Util.index(Square._E1)]= _PATHS_FROM_E1;
      bitmaps[Square.Util.index(Square._F1)]= _PATHS_FROM_F1;
      bitmaps[Square.Util.index(Square._G1)]= _PATHS_FROM_G1;
      bitmaps[Square.Util.index(Square._H1)]= _PATHS_FROM_H1;
   }
}