package org.forritan.talvmenni.bitboard;

public interface Square {

   public long getSquare(
         int squareNumber);

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
      public static int index(long square) {
         return Long.numberOfLeadingZeros(square);
//         return this.debruijn64(square);
      }
   }

}