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
      this.squareNameMap.put(Long.valueOf(Square._A1), "A1");
      this.squareNameMap.put(Long.valueOf(Square._A2), "A2");
      this.squareNameMap.put(Long.valueOf(Square._A3), "A3");
      this.squareNameMap.put(Long.valueOf(Square._A4), "A4");
      this.squareNameMap.put(Long.valueOf(Square._A5), "A5");
      this.squareNameMap.put(Long.valueOf(Square._A6), "A6");
      this.squareNameMap.put(Long.valueOf(Square._A7), "A7");
      this.squareNameMap.put(Long.valueOf(Square._A8), "A8");

      this.squareNameMap.put(Long.valueOf(Square._B1), "B1");
      this.squareNameMap.put(Long.valueOf(Square._B2), "B2");
      this.squareNameMap.put(Long.valueOf(Square._B3), "B3");
      this.squareNameMap.put(Long.valueOf(Square._B4), "B4");
      this.squareNameMap.put(Long.valueOf(Square._B5), "B5");
      this.squareNameMap.put(Long.valueOf(Square._B6), "B6");
      this.squareNameMap.put(Long.valueOf(Square._B7), "B7");
      this.squareNameMap.put(Long.valueOf(Square._B8), "B8");

      this.squareNameMap.put(Long.valueOf(Square._C1), "C1");
      this.squareNameMap.put(Long.valueOf(Square._C2), "C2");
      this.squareNameMap.put(Long.valueOf(Square._C3), "C3");
      this.squareNameMap.put(Long.valueOf(Square._C4), "C4");
      this.squareNameMap.put(Long.valueOf(Square._C5), "C5");
      this.squareNameMap.put(Long.valueOf(Square._C6), "C6");
      this.squareNameMap.put(Long.valueOf(Square._C7), "C7");
      this.squareNameMap.put(Long.valueOf(Square._C8), "C8");

      this.squareNameMap.put(Long.valueOf(Square._D1), "D1");
      this.squareNameMap.put(Long.valueOf(Square._D2), "D2");
      this.squareNameMap.put(Long.valueOf(Square._D3), "D3");
      this.squareNameMap.put(Long.valueOf(Square._D4), "D4");
      this.squareNameMap.put(Long.valueOf(Square._D5), "D5");
      this.squareNameMap.put(Long.valueOf(Square._D6), "D6");
      this.squareNameMap.put(Long.valueOf(Square._D7), "D7");
      this.squareNameMap.put(Long.valueOf(Square._D8), "D8");

      this.squareNameMap.put(Long.valueOf(Square._E1), "E1");
      this.squareNameMap.put(Long.valueOf(Square._E2), "E2");
      this.squareNameMap.put(Long.valueOf(Square._E3), "E3");
      this.squareNameMap.put(Long.valueOf(Square._E4), "E4");
      this.squareNameMap.put(Long.valueOf(Square._E5), "E5");
      this.squareNameMap.put(Long.valueOf(Square._E6), "E6");
      this.squareNameMap.put(Long.valueOf(Square._E7), "E7");
      this.squareNameMap.put(Long.valueOf(Square._E8), "E8");

      this.squareNameMap.put(Long.valueOf(Square._F1), "F1");
      this.squareNameMap.put(Long.valueOf(Square._F2), "F2");
      this.squareNameMap.put(Long.valueOf(Square._F3), "F3");
      this.squareNameMap.put(Long.valueOf(Square._F4), "F4");
      this.squareNameMap.put(Long.valueOf(Square._F5), "F5");
      this.squareNameMap.put(Long.valueOf(Square._F6), "F6");
      this.squareNameMap.put(Long.valueOf(Square._F7), "F7");
      this.squareNameMap.put(Long.valueOf(Square._F8), "F8");

      this.squareNameMap.put(Long.valueOf(Square._G1), "G1");
      this.squareNameMap.put(Long.valueOf(Square._G2), "G2");
      this.squareNameMap.put(Long.valueOf(Square._G3), "G3");
      this.squareNameMap.put(Long.valueOf(Square._G4), "G4");
      this.squareNameMap.put(Long.valueOf(Square._G5), "G5");
      this.squareNameMap.put(Long.valueOf(Square._G6), "G6");
      this.squareNameMap.put(Long.valueOf(Square._G7), "G7");
      this.squareNameMap.put(Long.valueOf(Square._G8), "G8");

      this.squareNameMap.put(Long.valueOf(Square._H1), "H1");
      this.squareNameMap.put(Long.valueOf(Square._H2), "H2");
      this.squareNameMap.put(Long.valueOf(Square._H3), "H3");
      this.squareNameMap.put(Long.valueOf(Square._H4), "H4");
      this.squareNameMap.put(Long.valueOf(Square._H5), "H5");
      this.squareNameMap.put(Long.valueOf(Square._H6), "H6");
      this.squareNameMap.put(Long.valueOf(Square._H7), "H7");
      this.squareNameMap.put(Long.valueOf(Square._H8), "H8");

   }

   public static Square create() {
      if (Squares.instance == null) {
         Squares.instance= new Squares();
      }
      return Squares.instance;
   }

   public long getSquare(
         int squareNumber) {
      return this.bitmaps[squareNumber];
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