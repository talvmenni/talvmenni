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

package org.forritan.talvmenni.bitboard;

import java.util.HashMap;
import java.util.Map;

public class Squares implements Square {

   private static final long       serialVersionUID     = 1L;

   private static Squares          instance;
   private final long[]            bitmaps              = new long[64];
   private final int[]             bitmapsDeBruijnIndex = new int[64];
   private final String[]          squareNames          = new String[64];
   private final Map<String, Long> bitmapsMap;

   // private final Map<Long, String> squareNameMap;

   private Squares() {
      for (int i= 0; i < this.bitmaps.length; i++) {
         this.bitmapsDeBruijnIndex[i]= Square.Util.index(1L << (63 - i));
      }
     
      this.bitmaps[Square.Util.index(Square._A1)]= Square._A1;
      this.bitmaps[Square.Util.index(Square._A2)]= Square._A2;
      this.bitmaps[Square.Util.index(Square._A3)]= Square._A3;
      this.bitmaps[Square.Util.index(Square._A4)]= Square._A4;
      this.bitmaps[Square.Util.index(Square._A5)]= Square._A5;
      this.bitmaps[Square.Util.index(Square._A6)]= Square._A6;
      this.bitmaps[Square.Util.index(Square._A7)]= Square._A7;
      this.bitmaps[Square.Util.index(Square._A8)]= Square._A8;

      this.bitmaps[Square.Util.index(Square._B1)]= Square._B1;
      this.bitmaps[Square.Util.index(Square._B2)]= Square._B2;
      this.bitmaps[Square.Util.index(Square._B3)]= Square._B3;
      this.bitmaps[Square.Util.index(Square._B4)]= Square._B4;
      this.bitmaps[Square.Util.index(Square._B5)]= Square._B5;
      this.bitmaps[Square.Util.index(Square._B6)]= Square._B6;
      this.bitmaps[Square.Util.index(Square._B7)]= Square._B7;
      this.bitmaps[Square.Util.index(Square._B8)]= Square._B8;

      this.bitmaps[Square.Util.index(Square._C1)]= Square._C1;
      this.bitmaps[Square.Util.index(Square._C2)]= Square._C2;
      this.bitmaps[Square.Util.index(Square._C3)]= Square._C3;
      this.bitmaps[Square.Util.index(Square._C4)]= Square._C4;
      this.bitmaps[Square.Util.index(Square._C5)]= Square._C5;
      this.bitmaps[Square.Util.index(Square._C6)]= Square._C6;
      this.bitmaps[Square.Util.index(Square._C7)]= Square._C7;
      this.bitmaps[Square.Util.index(Square._C8)]= Square._C8;

      this.bitmaps[Square.Util.index(Square._D1)]= Square._D1;
      this.bitmaps[Square.Util.index(Square._D2)]= Square._D2;
      this.bitmaps[Square.Util.index(Square._D3)]= Square._D3;
      this.bitmaps[Square.Util.index(Square._D4)]= Square._D4;
      this.bitmaps[Square.Util.index(Square._D5)]= Square._D5;
      this.bitmaps[Square.Util.index(Square._D6)]= Square._D6;
      this.bitmaps[Square.Util.index(Square._D7)]= Square._D7;
      this.bitmaps[Square.Util.index(Square._D8)]= Square._D8;

      this.bitmaps[Square.Util.index(Square._E1)]= Square._E1;
      this.bitmaps[Square.Util.index(Square._E2)]= Square._E2;
      this.bitmaps[Square.Util.index(Square._E3)]= Square._E3;
      this.bitmaps[Square.Util.index(Square._E4)]= Square._E4;
      this.bitmaps[Square.Util.index(Square._E5)]= Square._E5;
      this.bitmaps[Square.Util.index(Square._E6)]= Square._E6;
      this.bitmaps[Square.Util.index(Square._E7)]= Square._E7;
      this.bitmaps[Square.Util.index(Square._E8)]= Square._E8;

      this.bitmaps[Square.Util.index(Square._F1)]= Square._F1;
      this.bitmaps[Square.Util.index(Square._F2)]= Square._F2;
      this.bitmaps[Square.Util.index(Square._F3)]= Square._F3;
      this.bitmaps[Square.Util.index(Square._F4)]= Square._F4;
      this.bitmaps[Square.Util.index(Square._F5)]= Square._F5;
      this.bitmaps[Square.Util.index(Square._F6)]= Square._F6;
      this.bitmaps[Square.Util.index(Square._F7)]= Square._F7;
      this.bitmaps[Square.Util.index(Square._F8)]= Square._F8;

      this.bitmaps[Square.Util.index(Square._G1)]= Square._G1;
      this.bitmaps[Square.Util.index(Square._G2)]= Square._G2;
      this.bitmaps[Square.Util.index(Square._G3)]= Square._G3;
      this.bitmaps[Square.Util.index(Square._G4)]= Square._G4;
      this.bitmaps[Square.Util.index(Square._G5)]= Square._G5;
      this.bitmaps[Square.Util.index(Square._G6)]= Square._G6;
      this.bitmaps[Square.Util.index(Square._G7)]= Square._G7;
      this.bitmaps[Square.Util.index(Square._G8)]= Square._G8;

      this.bitmaps[Square.Util.index(Square._H1)]= Square._H1;
      this.bitmaps[Square.Util.index(Square._H2)]= Square._H2;
      this.bitmaps[Square.Util.index(Square._H3)]= Square._H3;
      this.bitmaps[Square.Util.index(Square._H4)]= Square._H4;
      this.bitmaps[Square.Util.index(Square._H5)]= Square._H5;
      this.bitmaps[Square.Util.index(Square._H6)]= Square._H6;
      this.bitmaps[Square.Util.index(Square._H7)]= Square._H7;
      this.bitmaps[Square.Util.index(Square._H8)]= Square._H8;

      
      
      this.squareNames[Square.Util.index(Square._A1)]= "a1";
      this.squareNames[Square.Util.index(Square._A2)]= "a2";
      this.squareNames[Square.Util.index(Square._A3)]= "a3";
      this.squareNames[Square.Util.index(Square._A4)]= "a4";
      this.squareNames[Square.Util.index(Square._A5)]= "a5";
      this.squareNames[Square.Util.index(Square._A6)]= "a6";
      this.squareNames[Square.Util.index(Square._A7)]= "a7";
      this.squareNames[Square.Util.index(Square._A8)]= "a8";
      
      this.squareNames[Square.Util.index(Square._B1)]= "b1";
      this.squareNames[Square.Util.index(Square._B2)]= "b2";
      this.squareNames[Square.Util.index(Square._B3)]= "b3";
      this.squareNames[Square.Util.index(Square._B4)]= "b4";
      this.squareNames[Square.Util.index(Square._B5)]= "b5";
      this.squareNames[Square.Util.index(Square._B6)]= "b6";
      this.squareNames[Square.Util.index(Square._B7)]= "b7";
      this.squareNames[Square.Util.index(Square._B8)]= "b8";
      
      this.squareNames[Square.Util.index(Square._C1)]= "c1";
      this.squareNames[Square.Util.index(Square._C2)]= "c2";
      this.squareNames[Square.Util.index(Square._C3)]= "c3";
      this.squareNames[Square.Util.index(Square._C4)]= "c4";
      this.squareNames[Square.Util.index(Square._C5)]= "c5";
      this.squareNames[Square.Util.index(Square._C6)]= "c6";
      this.squareNames[Square.Util.index(Square._C7)]= "c7";
      this.squareNames[Square.Util.index(Square._C8)]= "c8";
     
      this.squareNames[Square.Util.index(Square._D1)]= "d1";
      this.squareNames[Square.Util.index(Square._D2)]= "d2";
      this.squareNames[Square.Util.index(Square._D3)]= "d3";
      this.squareNames[Square.Util.index(Square._D4)]= "d4";
      this.squareNames[Square.Util.index(Square._D5)]= "d5";
      this.squareNames[Square.Util.index(Square._D6)]= "d6";
      this.squareNames[Square.Util.index(Square._D7)]= "d7";
      this.squareNames[Square.Util.index(Square._D8)]= "d8";
      
      this.squareNames[Square.Util.index(Square._E1)]= "e1";
      this.squareNames[Square.Util.index(Square._E2)]= "e2";
      this.squareNames[Square.Util.index(Square._E3)]= "e3";
      this.squareNames[Square.Util.index(Square._E4)]= "e4";
      this.squareNames[Square.Util.index(Square._E5)]= "e5";
      this.squareNames[Square.Util.index(Square._E6)]= "e6";
      this.squareNames[Square.Util.index(Square._E7)]= "e7";
      this.squareNames[Square.Util.index(Square._E8)]= "e8";
      
      this.squareNames[Square.Util.index(Square._F1)]= "f1";
      this.squareNames[Square.Util.index(Square._F2)]= "f2";
      this.squareNames[Square.Util.index(Square._F3)]= "f3";
      this.squareNames[Square.Util.index(Square._F4)]= "f4";
      this.squareNames[Square.Util.index(Square._F5)]= "f5";
      this.squareNames[Square.Util.index(Square._F6)]= "f6";
      this.squareNames[Square.Util.index(Square._F7)]= "f7";
      this.squareNames[Square.Util.index(Square._F8)]= "f8";
      
      this.squareNames[Square.Util.index(Square._G1)]= "g1";
      this.squareNames[Square.Util.index(Square._G2)]= "g2";
      this.squareNames[Square.Util.index(Square._G3)]= "g3";
      this.squareNames[Square.Util.index(Square._G4)]= "g4";
      this.squareNames[Square.Util.index(Square._G5)]= "g5";
      this.squareNames[Square.Util.index(Square._G6)]= "g6";
      this.squareNames[Square.Util.index(Square._G7)]= "g7";
      this.squareNames[Square.Util.index(Square._G8)]= "g8";
      
      this.squareNames[Square.Util.index(Square._H1)]= "h1";
      this.squareNames[Square.Util.index(Square._H2)]= "h2";
      this.squareNames[Square.Util.index(Square._H3)]= "h3";
      this.squareNames[Square.Util.index(Square._H4)]= "h4";
      this.squareNames[Square.Util.index(Square._H5)]= "h5";
      this.squareNames[Square.Util.index(Square._H6)]= "h6";
      this.squareNames[Square.Util.index(Square._H7)]= "h7";
      this.squareNames[Square.Util.index(Square._H8)]= "h8";
      
      
      
      this.bitmapsMap= new HashMap<String, Long>();
      this.bitmapsMap.put("A1", new Long(Square._A1));
      this.bitmapsMap.put("A2", new Long(Square._A2));
      this.bitmapsMap.put("A3", new Long(Square._A3));
      this.bitmapsMap.put("A4", new Long(Square._A4));
      this.bitmapsMap.put("A5", new Long(Square._A5));
      this.bitmapsMap.put("A6", new Long(Square._A6));
      this.bitmapsMap.put("A7", new Long(Square._A7));
      this.bitmapsMap.put("A8", new Long(Square._A8));

      this.bitmapsMap.put("B1", new Long(Square._B1));
      this.bitmapsMap.put("B2", new Long(Square._B2));
      this.bitmapsMap.put("B3", new Long(Square._B3));
      this.bitmapsMap.put("B4", new Long(Square._B4));
      this.bitmapsMap.put("B5", new Long(Square._B5));
      this.bitmapsMap.put("B6", new Long(Square._B6));
      this.bitmapsMap.put("B7", new Long(Square._B7));
      this.bitmapsMap.put("B8", new Long(Square._B8));

      this.bitmapsMap.put("C1", new Long(Square._C1));
      this.bitmapsMap.put("C2", new Long(Square._C2));
      this.bitmapsMap.put("C3", new Long(Square._C3));
      this.bitmapsMap.put("C4", new Long(Square._C4));
      this.bitmapsMap.put("C5", new Long(Square._C5));
      this.bitmapsMap.put("C6", new Long(Square._C6));
      this.bitmapsMap.put("C7", new Long(Square._C7));
      this.bitmapsMap.put("C8", new Long(Square._C8));

      this.bitmapsMap.put("D1", new Long(Square._D1));
      this.bitmapsMap.put("D2", new Long(Square._D2));
      this.bitmapsMap.put("D3", new Long(Square._D3));
      this.bitmapsMap.put("D4", new Long(Square._D4));
      this.bitmapsMap.put("D5", new Long(Square._D5));
      this.bitmapsMap.put("D6", new Long(Square._D6));
      this.bitmapsMap.put("D7", new Long(Square._D7));
      this.bitmapsMap.put("D8", new Long(Square._D8));

      this.bitmapsMap.put("E1", new Long(Square._E1));
      this.bitmapsMap.put("E2", new Long(Square._E2));
      this.bitmapsMap.put("E3", new Long(Square._E3));
      this.bitmapsMap.put("E4", new Long(Square._E4));
      this.bitmapsMap.put("E5", new Long(Square._E5));
      this.bitmapsMap.put("E6", new Long(Square._E6));
      this.bitmapsMap.put("E7", new Long(Square._E7));
      this.bitmapsMap.put("E8", new Long(Square._E8));

      this.bitmapsMap.put("F1", new Long(Square._F1));
      this.bitmapsMap.put("F2", new Long(Square._F2));
      this.bitmapsMap.put("F3", new Long(Square._F3));
      this.bitmapsMap.put("F4", new Long(Square._F4));
      this.bitmapsMap.put("F5", new Long(Square._F5));
      this.bitmapsMap.put("F6", new Long(Square._F6));
      this.bitmapsMap.put("F7", new Long(Square._F7));
      this.bitmapsMap.put("F8", new Long(Square._F8));

      this.bitmapsMap.put("G1", new Long(Square._G1));
      this.bitmapsMap.put("G2", new Long(Square._G2));
      this.bitmapsMap.put("G3", new Long(Square._G3));
      this.bitmapsMap.put("G4", new Long(Square._G4));
      this.bitmapsMap.put("G5", new Long(Square._G5));
      this.bitmapsMap.put("G6", new Long(Square._G6));
      this.bitmapsMap.put("G7", new Long(Square._G7));
      this.bitmapsMap.put("G8", new Long(Square._G8));

      this.bitmapsMap.put("H1", new Long(Square._H1));
      this.bitmapsMap.put("H2", new Long(Square._H2));
      this.bitmapsMap.put("H3", new Long(Square._H3));
      this.bitmapsMap.put("H4", new Long(Square._H4));
      this.bitmapsMap.put("H5", new Long(Square._H5));
      this.bitmapsMap.put("H6", new Long(Square._H6));
      this.bitmapsMap.put("H7", new Long(Square._H7));
      this.bitmapsMap.put("H8", new Long(Square._H8));
   }

   public static Square create() {
      if (Squares.instance == null) {
         Squares.instance= new Squares();
      }
      return Squares.instance;
   }

   public long getSquare(
         int squareNumber) {
      if(squareNumber < 0 || squareNumber > 63) {
         return Square._EMPTY_BOARD;
      } else {
         return this.bitmaps[squareNumber];
      }
   }

   public long getSquareNormalizedIndex(
         int normalizedSquareNumber) {
      if(normalizedSquareNumber < 0 || normalizedSquareNumber > 63) {
         return Square._EMPTY_BOARD;
      } else {
         return this.bitmaps[this.bitmapsDeBruijnIndex[normalizedSquareNumber]];
      }
   }

   public long getSquare(
         String squareNumber) {
      return this.bitmapsMap.get(squareNumber).longValue();
   }

   public String getSquareName(
         long square) {
      return this.squareNames[Square.Util.index(square)];
   }

}