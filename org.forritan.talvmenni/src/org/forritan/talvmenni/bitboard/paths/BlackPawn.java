package org.forritan.talvmenni.bitboard.paths;

import org.forritan.talvmenni.bitboard.Square;


public interface BlackPawn extends Pawn {

   public static final long _PATHS_FROM_A8 = 0L;
   public static final long _PATHS_FROM_B8 = 0L;
   public static final long _PATHS_FROM_C8 = 0L;
   public static final long _PATHS_FROM_D8 = 0L;
   public static final long _PATHS_FROM_E8 = 0L;
   public static final long _PATHS_FROM_F8 = 0L;
   public static final long _PATHS_FROM_G8 = 0L;
   public static final long _PATHS_FROM_H8 = 0L;
   public static final long _PATHS_FROM_A7 = Square._A6
                                                 | Square._B6
                                                 | Square._A5;
   public static final long _PATHS_FROM_B7 = Square._B6
                                                 | Square._A6
                                                 | Square._C6
                                                 | Square._B5;
   public static final long _PATHS_FROM_C7 = Square._C6
                                                 | Square._B6
                                                 | Square._D6
                                                 | Square._C5;
   public static final long _PATHS_FROM_D7 = Square._D6
                                                 | Square._C6
                                                 | Square._E6
                                                 | Square._D5;
   public static final long _PATHS_FROM_E7 = Square._E6
                                                 | Square._D6
                                                 | Square._F6
                                                 | Square._E5;
   public static final long _PATHS_FROM_F7 = Square._F6
                                                 | Square._E6
                                                 | Square._G6
                                                 | Square._F5;
   public static final long _PATHS_FROM_G7 = Square._G6
                                                 | Square._F6
                                                 | Square._H6
                                                 | Square._G5;
   public static final long _PATHS_FROM_H7 = Square._H6
                                                 | Square._G6
                                                 | Square._H5;
   public static final long _PATHS_FROM_A6 = Square._A5
                                                 | Square._B5;
   public static final long _PATHS_FROM_B6 = Square._B5
                                                 | Square._A5
                                                 | Square._C5;
   public static final long _PATHS_FROM_C6 = Square._C5
                                                 | Square._B5
                                                 | Square._D5;
   public static final long _PATHS_FROM_D6 = Square._D5
                                                 | Square._C5
                                                 | Square._E5;
   public static final long _PATHS_FROM_E6 = Square._E5
                                                 | Square._D5
                                                 | Square._F5;
   public static final long _PATHS_FROM_F6 = Square._F5
                                                 | Square._E5
                                                 | Square._G5;
   public static final long _PATHS_FROM_G6 = Square._G5
                                                 | Square._F5
                                                 | Square._H5;
   public static final long _PATHS_FROM_H6 = Square._H5
                                                 | Square._G5;
   public static final long _PATHS_FROM_A5 = Square._A4
                                                 | Square._B4;
   public static final long _PATHS_FROM_B5 = Square._B4
                                                 | Square._A4
                                                 | Square._C4;
   public static final long _PATHS_FROM_C5 = Square._C4
                                                 | Square._B4
                                                 | Square._D4;
   public static final long _PATHS_FROM_D5 = Square._D4
                                                 | Square._C4
                                                 | Square._E4;
   public static final long _PATHS_FROM_E5 = Square._E4
                                                 | Square._D4
                                                 | Square._F4;
   public static final long _PATHS_FROM_F5 = Square._F4
                                                 | Square._E4
                                                 | Square._G4;
   public static final long _PATHS_FROM_G5 = Square._G4
                                                 | Square._F4
                                                 | Square._H4;
   public static final long _PATHS_FROM_H5 = Square._H4
                                                 | Square._G4;
   public static final long _PATHS_FROM_A4 = Square._A3
                                                 | Square._B3;
   public static final long _PATHS_FROM_B4 = Square._B3
                                                 | Square._A3
                                                 | Square._C3;
   public static final long _PATHS_FROM_C4 = Square._C3
                                                 | Square._B3
                                                 | Square._D3;
   public static final long _PATHS_FROM_D4 = Square._D3
                                                 | Square._C3
                                                 | Square._E3;
   public static final long _PATHS_FROM_E4 = Square._E3
                                                 | Square._D3
                                                 | Square._F3;
   public static final long _PATHS_FROM_F4 = Square._F3
                                                 | Square._E3
                                                 | Square._G3;
   public static final long _PATHS_FROM_G4 = Square._G3
                                                 | Square._F3
                                                 | Square._H3;
   public static final long _PATHS_FROM_H4 = Square._H3
                                                 | Square._G3;
   public static final long _PATHS_FROM_A3 = Square._A2
                                                 | Square._B2;
   public static final long _PATHS_FROM_B3 = Square._B2
                                                 | Square._A2
                                                 | Square._C2;
   public static final long _PATHS_FROM_C3 = Square._C2
                                                 | Square._B2
                                                 | Square._D2;
   public static final long _PATHS_FROM_D3 = Square._D2
                                                 | Square._C2
                                                 | Square._E2;
   public static final long _PATHS_FROM_E3 = Square._E2
                                                 | Square._D2
                                                 | Square._F2;
   public static final long _PATHS_FROM_F3 = Square._F2
                                                 | Square._E2
                                                 | Square._G2;
   public static final long _PATHS_FROM_G3 = Square._G2
                                                 | Square._F2
                                                 | Square._H2;
   public static final long _PATHS_FROM_H3 = Square._H2
                                                 | Square._G2;
   public static final long _PATHS_FROM_A2 = Square._A1
                                                 | Square._B1;
   public static final long _PATHS_FROM_B2 = Square._B1
                                                 | Square._A1
                                                 | Square._C1;
   public static final long _PATHS_FROM_C2 = Square._C1
                                                 | Square._B1
                                                 | Square._D1;
   public static final long _PATHS_FROM_D2 = Square._D1
                                                 | Square._C1
                                                 | Square._E1;
   public static final long _PATHS_FROM_E2 = Square._E1
                                                 | Square._D1
                                                 | Square._F1;
   public static final long _PATHS_FROM_F2 = Square._F1
                                                 | Square._E1
                                                 | Square._G1;
   public static final long _PATHS_FROM_G2 = Square._G1
                                                 | Square._F1
                                                 | Square._H1;
   public static final long _PATHS_FROM_H2 = Square._H1
                                                 | Square._G1;

   public static final long _PATHS_FROM_A1 = 0L;
   public static final long _PATHS_FROM_B1 = 0L;
   public static final long _PATHS_FROM_C1 = 0L;
   public static final long _PATHS_FROM_D1 = 0L;
   public static final long _PATHS_FROM_E1 = 0L;
   public static final long _PATHS_FROM_F1 = 0L;
   public static final long _PATHS_FROM_G1 = 0L;
   public static final long _PATHS_FROM_H1 = 0L;

}