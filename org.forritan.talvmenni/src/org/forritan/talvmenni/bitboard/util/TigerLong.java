package org.forritan.talvmenni.bitboard.util;

// /**
// * @deprecated When switching to J2SE 1.5.0 (5.0?) a.k.a. Tiger use the bit
// *             twiddling methods in Long instead...
// */
public final class TigerLong {

   public static Long valueOf(
         long l) {
      return new Long(
            l);
   }

   public static long highestOneBit(
         long i) {
      i|= (i >> 1);
      i|= (i >> 2);
      i|= (i >> 4);
      i|= (i >> 8);
      i|= (i >> 16);
      i|= (i >> 32);
      return i
            - (i >>> 1);
   }

   public static long lowestOneBit(
         long i) {
      return i
            & -i;
   }

   public static int numberOfLeadingZeros(
         long i) {
      if (i == 0) return 64;
      int n= 1;
      int x= (int) (i >>> 32);
      if (x == 0) {
         n+= 32;
         x= (int) i;
      }
      if (x >>> 16 == 0) {
         n+= 16;
         x<<= 16;
      }
      if (x >>> 24 == 0) {
         n+= 8;
         x<<= 8;
      }
      if (x >>> 28 == 0) {
         n+= 4;
         x<<= 4;
      }
      if (x >>> 30 == 0) {
         n+= 2;
         x<<= 2;
      }
      n-= x >>> 31;
      return n;
   }

   public static int numberOfTrailingZeros(
         long i) {
      int x, y;
      if (i == 0) return 64;
      int n= 63;
      y= (int) i;
      if (y != 0) {
         n= n - 32;
         x= y;
      } else
         x= (int) (i >>> 32);
      y= x << 16;
      if (y != 0) {
         n= n - 16;
         x= y;
      }
      y= x << 8;
      if (y != 0) {
         n= n - 8;
         x= y;
      }
      y= x << 4;
      if (y != 0) {
         n= n - 4;
         x= y;
      }
      y= x << 2;
      if (y != 0) {
         n= n - 2;
         x= y;
      }
      return n
            - ((x << 1) >>> 31);
   }

   public static int bitCount(
         long i) {
      i= i
            - ((i >>> 1) & 0x5555555555555555L);
      i= (i & 0x3333333333333333L)
            + ((i >>> 2) & 0x3333333333333333L);
      i= (i + (i >>> 4)) & 0x0f0f0f0f0f0f0f0fL;
      i= i
            + (i >>> 8);
      i= i
            + (i >>> 16);
      i= i
            + (i >>> 32);
      return (int) i & 0x7f;
   }

   public static long rotateLeft(
         long i,
         int distance) {
      return (i << distance)
            | (i >>> -distance);
   }

   public static long rotateRight(
         long i,
         int distance) {
      return (i >>> distance)
            | (i << -distance);
   }

   public static long reverse(
         long i) {
      i= (i & 0x5555555555555555L) << 1
            | (i >>> 1)
            & 0x5555555555555555L;
      i= (i & 0x3333333333333333L) << 2
            | (i >>> 2)
            & 0x3333333333333333L;
      i= (i & 0x0f0f0f0f0f0f0f0fL) << 4
            | (i >>> 4)
            & 0x0f0f0f0f0f0f0f0fL;
      i= (i & 0x00ff00ff00ff00ffL) << 8
            | (i >>> 8)
            & 0x00ff00ff00ff00ffL;
      i= (i << 48)
            | ((i & 0xffff0000L) << 16)
            | ((i >>> 16) & 0xffff0000L)
            | (i >>> 48);
      return i;
   }

   public static int signum(
         long i) {
      return (int) ((i >> 63) | (-i >>> 63));
   }

   public static long reverseBytes(
         long i) {
      i= (i & 0x00ff00ff00ff00ffL) << 8
            | (i >>> 8)
            & 0x00ff00ff00ff00ffL;
      return (i << 48)
            | ((i & 0xffff0000L) << 16)
            | ((i >>> 16) & 0xffff0000L)
            | (i >>> 48);
   }
}