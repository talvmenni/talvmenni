package org.forritan.talvmenni.bitboard;

import java.util.HashMap;
import java.util.Map;

public class Squares implements Square {

   private static Squares      instance;
   private final long[] bitmaps = new long[64];
   private final Map<String, Long> bitmapsMap;
   private final Map<Long, String> squareNameMap;

   private Squares() {     
      for (int i= 0; i < this.bitmaps.length; i++) {
         this.bitmaps[i]= (1L << (63 - i));
      }      
      this.bitmapsMap= new HashMap<String, Long>();
      this.bitmapsMap.put("A1", Long.valueOf(Square._A1));
      this.bitmapsMap.put("A2", Long.valueOf(Square._A2));
      this.bitmapsMap.put("A3", Long.valueOf(Square._A3));
      this.bitmapsMap.put("A4", Long.valueOf(Square._A4));
      this.bitmapsMap.put("A5", Long.valueOf(Square._A5));
      this.bitmapsMap.put("A6", Long.valueOf(Square._A6));
      this.bitmapsMap.put("A7", Long.valueOf(Square._A7));
      this.bitmapsMap.put("A8", Long.valueOf(Square._A8));

      this.bitmapsMap.put("B1", Long.valueOf(Square._B1));
      this.bitmapsMap.put("B2", Long.valueOf(Square._B2));
      this.bitmapsMap.put("B3", Long.valueOf(Square._B3));
      this.bitmapsMap.put("B4", Long.valueOf(Square._B4));
      this.bitmapsMap.put("B5", Long.valueOf(Square._B5));
      this.bitmapsMap.put("B6", Long.valueOf(Square._B6));
      this.bitmapsMap.put("B7", Long.valueOf(Square._B7));
      this.bitmapsMap.put("B8", Long.valueOf(Square._B8));

      this.bitmapsMap.put("C1", Long.valueOf(Square._C1));
      this.bitmapsMap.put("C2", Long.valueOf(Square._C2));
      this.bitmapsMap.put("C3", Long.valueOf(Square._C3));
      this.bitmapsMap.put("C4", Long.valueOf(Square._C4));
      this.bitmapsMap.put("C5", Long.valueOf(Square._C5));
      this.bitmapsMap.put("C6", Long.valueOf(Square._C6));
      this.bitmapsMap.put("C7", Long.valueOf(Square._C7));
      this.bitmapsMap.put("C8", Long.valueOf(Square._C8));

      this.bitmapsMap.put("D1", Long.valueOf(Square._D1));
      this.bitmapsMap.put("D2", Long.valueOf(Square._D2));
      this.bitmapsMap.put("D3", Long.valueOf(Square._D3));
      this.bitmapsMap.put("D4", Long.valueOf(Square._D4));
      this.bitmapsMap.put("D5", Long.valueOf(Square._D5));
      this.bitmapsMap.put("D6", Long.valueOf(Square._D6));
      this.bitmapsMap.put("D7", Long.valueOf(Square._D7));
      this.bitmapsMap.put("D8", Long.valueOf(Square._D8));

      this.bitmapsMap.put("E1", Long.valueOf(Square._E1));
      this.bitmapsMap.put("E2", Long.valueOf(Square._E2));
      this.bitmapsMap.put("E3", Long.valueOf(Square._E3));
      this.bitmapsMap.put("E4", Long.valueOf(Square._E4));
      this.bitmapsMap.put("E5", Long.valueOf(Square._E5));
      this.bitmapsMap.put("E6", Long.valueOf(Square._E6));
      this.bitmapsMap.put("E7", Long.valueOf(Square._E7));
      this.bitmapsMap.put("E8", Long.valueOf(Square._E8));

      this.bitmapsMap.put("F1", Long.valueOf(Square._F1));
      this.bitmapsMap.put("F2", Long.valueOf(Square._F2));
      this.bitmapsMap.put("F3", Long.valueOf(Square._F3));
      this.bitmapsMap.put("F4", Long.valueOf(Square._F4));
      this.bitmapsMap.put("F5", Long.valueOf(Square._F5));
      this.bitmapsMap.put("F6", Long.valueOf(Square._F6));
      this.bitmapsMap.put("F7", Long.valueOf(Square._F7));
      this.bitmapsMap.put("F8", Long.valueOf(Square._F8));

      this.bitmapsMap.put("G1", Long.valueOf(Square._G1));
      this.bitmapsMap.put("G2", Long.valueOf(Square._G2));
      this.bitmapsMap.put("G3", Long.valueOf(Square._G3));
      this.bitmapsMap.put("G4", Long.valueOf(Square._G4));
      this.bitmapsMap.put("G5", Long.valueOf(Square._G5));
      this.bitmapsMap.put("G6", Long.valueOf(Square._G6));
      this.bitmapsMap.put("G7", Long.valueOf(Square._G7));
      this.bitmapsMap.put("G8", Long.valueOf(Square._G8));

      this.bitmapsMap.put("H1", Long.valueOf(Square._H1));
      this.bitmapsMap.put("H2", Long.valueOf(Square._H2));
      this.bitmapsMap.put("H3", Long.valueOf(Square._H3));
      this.bitmapsMap.put("H4", Long.valueOf(Square._H4));
      this.bitmapsMap.put("H5", Long.valueOf(Square._H5));
      this.bitmapsMap.put("H6", Long.valueOf(Square._H6));
      this.bitmapsMap.put("H7", Long.valueOf(Square._H7));
      this.bitmapsMap.put("H8", Long.valueOf(Square._H8));

      this.squareNameMap= new HashMap<Long, String>();
      this.squareNameMap.put(Long.valueOf(Square._A1), "a1");
      this.squareNameMap.put(Long.valueOf(Square._A2), "a2");
      this.squareNameMap.put(Long.valueOf(Square._A3), "a3");
      this.squareNameMap.put(Long.valueOf(Square._A4), "a4");
      this.squareNameMap.put(Long.valueOf(Square._A5), "a5");
      this.squareNameMap.put(Long.valueOf(Square._A6), "a6");
      this.squareNameMap.put(Long.valueOf(Square._A7), "a7");
      this.squareNameMap.put(Long.valueOf(Square._A8), "a8");

      this.squareNameMap.put(Long.valueOf(Square._B1), "b1");
      this.squareNameMap.put(Long.valueOf(Square._B2), "b2");
      this.squareNameMap.put(Long.valueOf(Square._B3), "b3");
      this.squareNameMap.put(Long.valueOf(Square._B4), "b4");
      this.squareNameMap.put(Long.valueOf(Square._B5), "b5");
      this.squareNameMap.put(Long.valueOf(Square._B6), "b6");
      this.squareNameMap.put(Long.valueOf(Square._B7), "b7");
      this.squareNameMap.put(Long.valueOf(Square._B8), "b8");

      this.squareNameMap.put(Long.valueOf(Square._C1), "c1");
      this.squareNameMap.put(Long.valueOf(Square._C2), "c2");
      this.squareNameMap.put(Long.valueOf(Square._C3), "c3");
      this.squareNameMap.put(Long.valueOf(Square._C4), "c4");
      this.squareNameMap.put(Long.valueOf(Square._C5), "c5");
      this.squareNameMap.put(Long.valueOf(Square._C6), "c6");
      this.squareNameMap.put(Long.valueOf(Square._C7), "c7");
      this.squareNameMap.put(Long.valueOf(Square._C8), "c8");

      this.squareNameMap.put(Long.valueOf(Square._D1), "d1");
      this.squareNameMap.put(Long.valueOf(Square._D2), "d2");
      this.squareNameMap.put(Long.valueOf(Square._D3), "d3");
      this.squareNameMap.put(Long.valueOf(Square._D4), "d4");
      this.squareNameMap.put(Long.valueOf(Square._D5), "d5");
      this.squareNameMap.put(Long.valueOf(Square._D6), "d6");
      this.squareNameMap.put(Long.valueOf(Square._D7), "d7");
      this.squareNameMap.put(Long.valueOf(Square._D8), "d8");

      this.squareNameMap.put(Long.valueOf(Square._E1), "e1");
      this.squareNameMap.put(Long.valueOf(Square._E2), "e2");
      this.squareNameMap.put(Long.valueOf(Square._E3), "e3");
      this.squareNameMap.put(Long.valueOf(Square._E4), "e4");
      this.squareNameMap.put(Long.valueOf(Square._E5), "e5");
      this.squareNameMap.put(Long.valueOf(Square._E6), "e6");
      this.squareNameMap.put(Long.valueOf(Square._E7), "e7");
      this.squareNameMap.put(Long.valueOf(Square._E8), "e8");
      
      this.squareNameMap.put(Long.valueOf(Square._F1), "f1");
      this.squareNameMap.put(Long.valueOf(Square._F2), "f2");
      this.squareNameMap.put(Long.valueOf(Square._F3), "f3");
      this.squareNameMap.put(Long.valueOf(Square._F4), "f4");
      this.squareNameMap.put(Long.valueOf(Square._F5), "f5");
      this.squareNameMap.put(Long.valueOf(Square._F6), "f6");
      this.squareNameMap.put(Long.valueOf(Square._F7), "f7");
      this.squareNameMap.put(Long.valueOf(Square._F8), "f8");

      this.squareNameMap.put(Long.valueOf(Square._G1), "g1");
      this.squareNameMap.put(Long.valueOf(Square._G2), "g2");
      this.squareNameMap.put(Long.valueOf(Square._G3), "g3");
      this.squareNameMap.put(Long.valueOf(Square._G4), "g4");
      this.squareNameMap.put(Long.valueOf(Square._G5), "g5");
      this.squareNameMap.put(Long.valueOf(Square._G6), "g6");
      this.squareNameMap.put(Long.valueOf(Square._G7), "g7");
      this.squareNameMap.put(Long.valueOf(Square._G8), "g8");

      this.squareNameMap.put(Long.valueOf(Square._H1), "h1");
      this.squareNameMap.put(Long.valueOf(Square._H2), "h2");
      this.squareNameMap.put(Long.valueOf(Square._H3), "h3");
      this.squareNameMap.put(Long.valueOf(Square._H4), "h4");
      this.squareNameMap.put(Long.valueOf(Square._H5), "h5");
      this.squareNameMap.put(Long.valueOf(Square._H6), "h6");
      this.squareNameMap.put(Long.valueOf(Square._H7), "h7");
      this.squareNameMap.put(Long.valueOf(Square._H8), "h8");

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
         return 0L;
      } else {
         return this.bitmaps[squareNumber];
      }
   }

   public long getSquare(
         String squareNumber) {
      return ((Long)this.bitmapsMap.get(squareNumber)).longValue();
   }

   public String getSquareName(
         long square) {
      return (String)this.squareNameMap.get(Long.valueOf(square));
   }

}