package org.forritan.talvmenni.bitboard;

public interface Square {
   
   public long getSquare(int squareNumber);

   public static final int    A8      = 0;
   public static final int    B8      = 1;
   public static final int    C8      = 2;
   public static final int    D8      = 3;
   public static final int    E8      = 4;
   public static final int    F8      = 5;
   public static final int    G8      = 6;
   public static final int    H8      = 7;

   public static final int    A7      = 8;
   public static final int    B7      = 9;
   public static final int    C7      = 10;
   public static final int    D7      = 11;
   public static final int    E7      = 12;
   public static final int    F7      = 13;
   public static final int    G7      = 14;
   public static final int    H7      = 15;

   public static final int    A6      = 16;
   public static final int    B6      = 17;
   public static final int    C6      = 18;
   public static final int    D6      = 19;
   public static final int    E6      = 20;
   public static final int    F6      = 21;
   public static final int    G6      = 22;
   public static final int    H6      = 23;

   public static final int    A5      = 24;
   public static final int    B5      = 25;
   public static final int    C5      = 26;
   public static final int    D5      = 27;
   public static final int    E5      = 28;
   public static final int    F5      = 29;
   public static final int    G5      = 30;
   public static final int    H5      = 31;

   public static final int    A4      = 32;
   public static final int    B4      = 33;
   public static final int    C4      = 34;
   public static final int    D4      = 35;
   public static final int    E4      = 36;
   public static final int    F4      = 37;
   public static final int    G4      = 38;
   public static final int    H4      = 39;

   public static final int    A3      = 40;
   public static final int    B3      = 41;
   public static final int    C3      = 42;
   public static final int    D3      = 43;
   public static final int    E3      = 44;
   public static final int    F3      = 45;
   public static final int    G3      = 46;
   public static final int    H3      = 47;

   public static final int    A2      = 48;
   public static final int    B2      = 49;
   public static final int    C2      = 50;
   public static final int    D2      = 51;
   public static final int    E2      = 52;
   public static final int    F2      = 53;
   public static final int    G2      = 54;
   public static final int    H2      = 55;

   public static final int    A1      = 56;
   public static final int    B1      = 57;
   public static final int    C1      = 58;
   public static final int    D1      = 59;
   public static final int    E1      = 60;
   public static final int    F1      = 61;
   public static final int    G1      = 62;
   public static final int    H1      = 63;

   public static final long   _A8     = 1L << 63;
   public static final long   _B8     = 1L << 62;
   public static final long   _C8     = 1L << 61;
   public static final long   _D8     = 1L << 60;
   public static final long   _E8     = 1L << 59;
   public static final long   _F8     = 1L << 58;
   public static final long   _G8     = 1L << 57;
   public static final long   _H8     = 1L << 56;

   public static final long   _A7     = 1L << 55;
   public static final long   _B7     = 1L << 54;
   public static final long   _C7     = 1L << 53;
   public static final long   _D7     = 1L << 52;
   public static final long   _E7     = 1L << 51;
   public static final long   _F7     = 1L << 50;
   public static final long   _G7     = 1L << 49;
   public static final long   _H7     = 1L << 48;

   public static final long   _A6     = 1L << 47;
   public static final long   _B6     = 1L << 46;
   public static final long   _C6     = 1L << 45;
   public static final long   _D6     = 1L << 44;
   public static final long   _E6     = 1L << 43;
   public static final long   _F6     = 1L << 42;
   public static final long   _G6     = 1L << 41;
   public static final long   _H6     = 1L << 40;

   public static final long   _A5     = 1L << 39;
   public static final long   _B5     = 1L << 38;
   public static final long   _C5     = 1L << 37;
   public static final long   _D5     = 1L << 36;
   public static final long   _E5     = 1L << 35;
   public static final long   _F5     = 1L << 34;
   public static final long   _G5     = 1L << 33;
   public static final long   _H5     = 1L << 32;

   public static final long   _A4     = 1L << 31;
   public static final long   _B4     = 1L << 30;
   public static final long   _C4     = 1L << 29;
   public static final long   _D4     = 1L << 28;
   public static final long   _E4     = 1L << 27;
   public static final long   _F4     = 1L << 26;
   public static final long   _G4     = 1L << 25;
   public static final long   _H4     = 1L << 24;

   public static final long   _A3     = 1L << 23;
   public static final long   _B3     = 1L << 22;
   public static final long   _C3     = 1L << 21;
   public static final long   _D3     = 1L << 20;
   public static final long   _E3     = 1L << 19;
   public static final long   _F3     = 1L << 18;
   public static final long   _G3     = 1L << 17;
   public static final long   _H3     = 1L << 16;

   public static final long   _A2     = 1L << 15;
   public static final long   _B2     = 1L << 14;
   public static final long   _C2     = 1L << 13;
   public static final long   _D2     = 1L << 12;
   public static final long   _E2     = 1L << 11;
   public static final long   _F2     = 1L << 10;
   public static final long   _G2     = 1L << 9;
   public static final long   _H2     = 1L << 8;

   public static final long   _A1     = 1L << 7;
   public static final long   _B1     = 1L << 6;
   public static final long   _C1     = 1L << 5;
   public static final long   _D1     = 1L << 4;
   public static final long   _E1     = 1L << 3;
   public static final long   _F1     = 1L << 2;
   public static final long   _G1     = 1L << 1;
   public static final long   _H1     = 1L << 0;
   
}