package org.forritan.talvmenni.bitboard;

public class Squares implements Square {

   private static Squares      instance;
   private static final long[] bitmaps = new long[64];

   static {
      for (int i= 0; i < Squares.bitmaps.length; i++) {
         Squares.bitmaps[i]= (1L << (63 - i));
      }
   }

   public static Square create() {
      if (Squares.instance == null) {
         Squares.instance= new Squares();
      }
      return Squares.instance;
   }

   private Squares() {
   }

   public long getSquare(
         int squareNumber) {
      return Squares.bitmaps[squareNumber];
   }

}