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

   public Object next() {
      long result= Long.lowestOneBit(this.bitboard);
      this.bitboard= this.bitboard
            ^ result;
      return Long.valueOf(result);
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }

}