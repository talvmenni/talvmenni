package org.forritan.talvmenni.bitboard;

public interface BackSlashDiagonal {

   public static final long _A1A1 = Square._A1;
   public static final long _A2B1 = Square._A2
                                        | Square._B1;
   public static final long _A3C1 = Square._A3
                                        | Square._B2
                                        | Square._C1;
   public static final long _A4D1 = Square._A4
                                        | Square._B3
                                        | Square._C2
                                        | Square._D1;
   public static final long _A5E1 = Square._A5
                                        | Square._B4
                                        | Square._C3
                                        | Square._D2
                                        | Square._E1;
   public static final long _A6F1 = Square._A6
                                        | Square._B5
                                        | Square._C4
                                        | Square._D3
                                        | Square._E2
                                        | Square._F1;
   public static final long _A7G1 = Square._A7
                                        | Square._B6
                                        | Square._C5
                                        | Square._D4
                                        | Square._E3
                                        | Square._F2
                                        | Square._G1;
   public static final long _A8H1 = Square._A8
                                        | Square._B7
                                        | Square._C6
                                        | Square._D5
                                        | Square._E4
                                        | Square._F3
                                        | Square._G2
                                        | Square._H1;
   public static final long _B8H2 = Square._B8
                                        | Square._C7
                                        | Square._D6
                                        | Square._E5
                                        | Square._F4
                                        | Square._G3
                                        | Square._H2;
   public static final long _C8H3 = Square._C8
                                        | Square._D7
                                        | Square._E6
                                        | Square._F5
                                        | Square._G4
                                        | Square._H3;
   public static final long _D8H4 = Square._D8
                                        | Square._E7
                                        | Square._F6
                                        | Square._G5
                                        | Square._H4;
   public static final long _E8H5 = Square._E8
                                        | Square._F7
                                        | Square._G6
                                        | Square._H5;
   public static final long _F8H6 = Square._F8
                                        | Square._G7
                                        | Square._H6;
   public static final long _G8H7 = Square._G8
                                        | Square._H7;
   public static final long _H8H8 = Square._H8;

}