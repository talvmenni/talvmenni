package org.forritan.talvmenni.bitboard;

public interface Square {

   public long getSquare(
         int squareNumber);

   public long getSquareNormalizedIndex(
         int NormalizedSquareNumber);

   public long getSquare(
         String squareNumber);

   public String getSquareName(
         long square);

   public static final int  A8           = Square.Util.index(Square._A8);
   public static final int  B8           = Square.Util.index(Square._B8);
   public static final int  C8           = Square.Util.index(Square._C8);
   public static final int  D8           = Square.Util.index(Square._D8);
   public static final int  E8           = Square.Util.index(Square._E8);
   public static final int  F8           = Square.Util.index(Square._F8);
   public static final int  G8           = Square.Util.index(Square._G8);
   public static final int  H8           = Square.Util.index(Square._H8);

   public static final int  A7           = Square.Util.index(Square._A7);
   public static final int  B7           = Square.Util.index(Square._B7);
   public static final int  C7           = Square.Util.index(Square._C7);
   public static final int  D7           = Square.Util.index(Square._D7);
   public static final int  E7           = Square.Util.index(Square._E7);
   public static final int  F7           = Square.Util.index(Square._F7);
   public static final int  G7           = Square.Util.index(Square._G7);
   public static final int  H7           = Square.Util.index(Square._H7);

   public static final int  A6           = Square.Util.index(Square._A6);
   public static final int  B6           = Square.Util.index(Square._B6);
   public static final int  C6           = Square.Util.index(Square._C6);
   public static final int  D6           = Square.Util.index(Square._D6);
   public static final int  E6           = Square.Util.index(Square._E6);
   public static final int  F6           = Square.Util.index(Square._F6);
   public static final int  G6           = Square.Util.index(Square._G6);
   public static final int  H6           = Square.Util.index(Square._H6);

   public static final int  A5           = Square.Util.index(Square._A5);
   public static final int  B5           = Square.Util.index(Square._B5);
   public static final int  C5           = Square.Util.index(Square._C5);
   public static final int  D5           = Square.Util.index(Square._D5);
   public static final int  E5           = Square.Util.index(Square._E5);
   public static final int  F5           = Square.Util.index(Square._F5);
   public static final int  G5           = Square.Util.index(Square._G5);
   public static final int  H5           = Square.Util.index(Square._H5);

   public static final int  A4           = Square.Util.index(Square._A4);
   public static final int  B4           = Square.Util.index(Square._B4);
   public static final int  C4           = Square.Util.index(Square._C4);
   public static final int  D4           = Square.Util.index(Square._D4);
   public static final int  E4           = Square.Util.index(Square._E4);
   public static final int  F4           = Square.Util.index(Square._F4);
   public static final int  G4           = Square.Util.index(Square._G4);
   public static final int  H4           = Square.Util.index(Square._H4);

   public static final int  A3           = Square.Util.index(Square._A3);
   public static final int  B3           = Square.Util.index(Square._B3);
   public static final int  C3           = Square.Util.index(Square._C3);
   public static final int  D3           = Square.Util.index(Square._D3);
   public static final int  E3           = Square.Util.index(Square._E3);
   public static final int  F3           = Square.Util.index(Square._F3);
   public static final int  G3           = Square.Util.index(Square._G3);
   public static final int  H3           = Square.Util.index(Square._H3);

   public static final int  A2           = Square.Util.index(Square._A2);
   public static final int  B2           = Square.Util.index(Square._B2);
   public static final int  C2           = Square.Util.index(Square._C2);
   public static final int  D2           = Square.Util.index(Square._D2);
   public static final int  E2           = Square.Util.index(Square._E2);
   public static final int  F2           = Square.Util.index(Square._F2);
   public static final int  G2           = Square.Util.index(Square._G2);
   public static final int  H2           = Square.Util.index(Square._H2);

   public static final int  A1           = Square.Util.index(Square._A1);
   public static final int  B1           = Square.Util.index(Square._B1);
   public static final int  C1           = Square.Util.index(Square._C1);
   public static final int  D1           = Square.Util.index(Square._D1);
   public static final int  E1           = Square.Util.index(Square._E1);
   public static final int  F1           = Square.Util.index(Square._F1);
   public static final int  G1           = Square.Util.index(Square._G1);
   public static final int  H1           = Square.Util.index(Square._H1);

   public static final long _A8          = 1L << 63;
   public static final long _B8          = 1L << 62;
   public static final long _C8          = 1L << 61;
   public static final long _D8          = 1L << 60;
   public static final long _E8          = 1L << 59;
   public static final long _F8          = 1L << 58;
   public static final long _G8          = 1L << 57;
   public static final long _H8          = 1L << 56;

   public static final long _A7          = 1L << 55;
   public static final long _B7          = 1L << 54;
   public static final long _C7          = 1L << 53;
   public static final long _D7          = 1L << 52;
   public static final long _E7          = 1L << 51;
   public static final long _F7          = 1L << 50;
   public static final long _G7          = 1L << 49;
   public static final long _H7          = 1L << 48;

   public static final long _A6          = 1L << 47;
   public static final long _B6          = 1L << 46;
   public static final long _C6          = 1L << 45;
   public static final long _D6          = 1L << 44;
   public static final long _E6          = 1L << 43;
   public static final long _F6          = 1L << 42;
   public static final long _G6          = 1L << 41;
   public static final long _H6          = 1L << 40;

   public static final long _A5          = 1L << 39;
   public static final long _B5          = 1L << 38;
   public static final long _C5          = 1L << 37;
   public static final long _D5          = 1L << 36;
   public static final long _E5          = 1L << 35;
   public static final long _F5          = 1L << 34;
   public static final long _G5          = 1L << 33;
   public static final long _H5          = 1L << 32;

   public static final long _A4          = 1L << 31;
   public static final long _B4          = 1L << 30;
   public static final long _C4          = 1L << 29;
   public static final long _D4          = 1L << 28;
   public static final long _E4          = 1L << 27;
   public static final long _F4          = 1L << 26;
   public static final long _G4          = 1L << 25;
   public static final long _H4          = 1L << 24;

   public static final long _A3          = 1L << 23;
   public static final long _B3          = 1L << 22;
   public static final long _C3          = 1L << 21;
   public static final long _D3          = 1L << 20;
   public static final long _E3          = 1L << 19;
   public static final long _F3          = 1L << 18;
   public static final long _G3          = 1L << 17;
   public static final long _H3          = 1L << 16;

   public static final long _A2          = 1L << 15;
   public static final long _B2          = 1L << 14;
   public static final long _C2          = 1L << 13;
   public static final long _D2          = 1L << 12;
   public static final long _E2          = 1L << 11;
   public static final long _F2          = 1L << 10;
   public static final long _G2          = 1L << 9;
   public static final long _H2          = 1L << 8;

   public static final long _A1          = 1L << 7;
   public static final long _B1          = 1L << 6;
   public static final long _C1          = 1L << 5;
   public static final long _D1          = 1L << 4;
   public static final long _E1          = 1L << 3;
   public static final long _F1          = 1L << 2;
   public static final long _G1          = 1L << 1;
   public static final long _H1          = 1L << 0;

   public static final long _EMPTY_BOARD = 0L;
   public static final long _FULL_BOARD  = -1L;

   public static class Util {

      /**
       * de Bruijn sequence 0000 0011 1111 0111 1001 1101 0111 0001 1011 0100
       * 1100 1011 0000 1010 1000 1001 or in hex 3F79D71B4CB0A89
       * 
       * @see http://supertech.csail.mit.edu/papers/debruijn.ps
       * @see http://www.cs.princeton.edu/introcs/31datatype/DeBruijn.java.html
       */
      public final static long DEBRUIJN64 = 0x3f79d71b4cb0a89L;

      public static int index(
            long square) {
         //         return Long.numberOfLeadingZeros(square);
         return Util.deBruijn64Index(square);
      }

      /**
       * @param square
       * @return a unique index between 0 and 63
       */
      public static int deBruijn64Index(
            long square) {
         square*= Util.DEBRUIJN64;
         return ((int) (square >>> 58));
      }

      // Bit Twiddling from J2SE 5.0 java.lang.Long... and as soon as Jini will
      // with J2SE 5.0 this will be removed...

      /**
       * The number of bits used to represent a <tt>long</tt> value in two's
       * complement binary form.
       * 
       * @since 1.5
       */
      public static final int SIZE = 64;

      /**
       * Returns an <tt>long</tt> value with at most a single one-bit, in the
       * position of the highest-order ("leftmost") one-bit in the specified
       * <tt>long</tt> value. Returns zero if the specified value has no
       * one-bits in its two's complement binary representation, that is, if it
       * is equal to zero.
       * 
       * @return an <tt>long</tt> value with a single one-bit, in the position
       *         of the highest-order one-bit in the specified value, or zero if
       *         the specified value is itself equal to zero.
       * @since 1.5
       */
      public static long highestOneBit(
            long i) {
         // HD, Figure 3-1
         i|= (i >> 1);
         i|= (i >> 2);
         i|= (i >> 4);
         i|= (i >> 8);
         i|= (i >> 16);
         i|= (i >> 32);
         return i
               - (i >>> 1);
      }

      /**
       * Returns an <tt>long</tt> value with at most a single one-bit, in the
       * position of the lowest-order ("rightmost") one-bit in the specified
       * <tt>long</tt> value. Returns zero if the specified value has no
       * one-bits in its two's complement binary representation, that is, if it
       * is equal to zero.
       * 
       * @return an <tt>long</tt> value with a single one-bit, in the position
       *         of the lowest-order one-bit in the specified value, or zero if
       *         the specified value is itself equal to zero.
       * @since 1.5
       */
      public static long lowestOneBit(
            long i) {
         // HD, Section 2-1
         return i
               & -i;
      }

      /**
       * Returns the number of zero bits preceding the highest-order
       * ("leftmost") one-bit in the two's complement binary representation of
       * the specified <tt>long</tt> value. Returns 64 if the specified value
       * has no one-bits in its two's complement representation, in other words
       * if it is equal to zero.
       * 
       * <p>
       * Note that this method is closely related to the logarithm base 2. For
       * all positive <tt>long</tt> values x:
       * <ul>
       * <li>floor(log <sub>2 </sub>(x)) =
       * <tt>63 - numberOfLeadingZeros(x)</tt>
       * <li>ceil(log <sub>2 </sub>(x)) =
       * <tt>64 - numberOfLeadingZeros(x - 1)</tt>
       * </ul>
       * 
       * @return the number of zero bits preceding the highest-order
       *         ("leftmost") one-bit in the two's complement binary
       *         representation of the specified <tt>long</tt> value, or 64 if
       *         the value is equal to zero.
       * @since 1.5
       */
      public static int numberOfLeadingZeros(
            long i) {
         // HD, Figure 5-6
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

      /**
       * Returns the number of zero bits following the lowest-order
       * ("rightmost") one-bit in the two's complement binary representation of
       * the specified <tt>long</tt> value. Returns 64 if the specified value
       * has no one-bits in its two's complement representation, in other words
       * if it is equal to zero.
       * 
       * @return the number of zero bits following the lowest-order
       *         ("rightmost") one-bit in the two's complement binary
       *         representation of the specified <tt>long</tt> value, or 64 if
       *         the value is equal to zero.
       * @since 1.5
       */
      public static int numberOfTrailingZeros(
            long i) {
         // HD, Figure 5-14
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

      /**
       * Returns the number of one-bits in the two's complement binary
       * representation of the specified <tt>long</tt> value. This function is
       * sometimes referred to as the <i>population count </i>.
       * 
       * @return the number of one-bits in the two's complement binary
       *         representation of the specified <tt>long</tt> value.
       * @since 1.5
       */
      public static int bitCount(
            long i) {
         // HD, Figure 5-14
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

      /**
       * Returns the value obtained by rotating the two's complement binary
       * representation of the specified <tt>long</tt> value left by the
       * specified number of bits. (Bits shifted out of the left hand, or
       * high-order, side reenter on the right, or low-order.)
       * 
       * <p>
       * Note that left rotation with a negative distance is equivalent to right
       * rotation: <tt>rotateLeft(val, -distance) == rotateRight(val,
       * distance)</tt>.
       * Note also that rotation by any multiple of 64 is a no-op, so all but
       * the last six bits of the rotation distance can be ignored, even if the
       * distance is negative: <tt>rotateLeft(val,
       * distance) == rotateLeft(val, distance & 0x3F)</tt>.
       * 
       * @return the value obtained by rotating the two's complement binary
       *         representation of the specified <tt>long</tt> value left by
       *         the specified number of bits.
       * @since 1.5
       */
      public static long rotateLeft(
            long i,
            int distance) {
         return (i << distance)
               | (i >>> -distance);
      }

      /**
       * Returns the value obtained by rotating the two's complement binary
       * representation of the specified <tt>long</tt> value right by the
       * specified number of bits. (Bits shifted out of the right hand, or
       * low-order, side reenter on the left, or high-order.)
       * 
       * <p>
       * Note that right rotation with a negative distance is equivalent to left
       * rotation: <tt>rotateRight(val, -distance) == rotateLeft(val,
       * distance)</tt>.
       * Note also that rotation by any multiple of 64 is a no-op, so all but
       * the last six bits of the rotation distance can be ignored, even if the
       * distance is negative: <tt>rotateRight(val,
       * distance) == rotateRight(val, distance & 0x3F)</tt>.
       * 
       * @return the value obtained by rotating the two's complement binary
       *         representation of the specified <tt>long</tt> value right by
       *         the specified number of bits.
       * @since 1.5
       */
      public static long rotateRight(
            long i,
            int distance) {
         return (i >>> distance)
               | (i << -distance);
      }

      /**
       * Returns the value obtained by reversing the order of the bits in the
       * two's complement binary representation of the specified <tt>long</tt>
       * value.
       * 
       * @return the value obtained by reversing order of the bits in the
       *         specified <tt>long</tt> value.
       * @since 1.5
       */
      public static long reverse(
            long i) {
         // HD, Figure 7-1
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

      /**
       * Returns the signum function of the specified <tt>long</tt> value.
       * (The return value is -1 if the specified value is negative; 0 if the
       * specified value is zero; and 1 if the specified value is positive.)
       * 
       * @return the signum function of the specified <tt>long</tt> value.
       * @since 1.5
       */
      public static int signum(
            long i) {
         // HD, Section 2-7
         return (int) ((i >> 63) | (-i >>> 63));
      }

      /**
       * Returns the value obtained by reversing the order of the bytes in the
       * two's complement representation of the specified <tt>long</tt> value.
       * 
       * @return the value obtained by reversing the bytes in the specified
       *         <tt>long</tt> value.
       * @since 1.5
       */
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

}