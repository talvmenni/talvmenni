package org.forritan.talvmenni.bitboard;

import java.util.Iterator;


public class BitboardIterator implements Iterator {

   private long bitboard;

   public BitboardIterator(
         long bitboard) {
      this.bitboard= bitboard;
   }

   public boolean hasNext() {
      return this.bitboard != 0L;
   }
   
   /**
    * @deprecated Use nextBitboard() instead...
    */
   public Object next() {
      return Long.valueOf(this.nextBitboard());
   }

   public long nextBitboard() {
      long result= this.bitboard & -this.bitboard;
      this.bitboard= this.bitboard
            ^ result;
      return result;
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }

}