package org.forritan.talvmenni.bitboard.paths;

import org.forritan.talvmenni.bitboard.Square;


public interface BlackBishop {

   public static final long _PATHS_FROM_A1 = Square._B2
                                                 | Square._C3
                                                 | Square._D4
                                                 | Square._E5
                                                 | Square._F6
                                                 | Square._G7
                                                 | Square._H8;

   public static final long _PATHS_FROM_C1 = Square._A3
                                                 | Square._B2
                                                 | Square._D2
                                                 | Square._E3
                                                 | Square._F4
                                                 | Square._G5
                                                 | Square._H6;

   public static final long _PATHS_FROM_E1 = Square._A5
                                                 | Square._B4
                                                 | Square._C3
                                                 | Square._D2
                                                 | Square._F2
                                                 | Square._G3
                                                 | Square._H4;

   public static final long _PATHS_FROM_G1 = Square._A7
                                                 | Square._B6
                                                 | Square._C5
                                                 | Square._D4
                                                 | Square._E3
                                                 | Square._F2
                                                 | Square._H2;

   public static final long _PATHS_FROM_B2 = Square._A1
                                                 | Square._A3
                                                 | Square._C1
                                                 | Square._C3
                                                 | Square._D4
                                                 | Square._E5
                                                 | Square._F6
                                                 | Square._G7
                                                 | Square._H8;

   public static final long _PATHS_FROM_D2 = Square._A5
                                                 | Square._B4
                                                 | Square._C3
                                                 | Square._C1
                                                 | Square._E1
                                                 | Square._E3
                                                 | Square._F4
                                                 | Square._G5
                                                 | Square._H6;

   public static final long _PATHS_FROM_F2 = Square._A7
                                                 | Square._B6
                                                 | Square._C5
                                                 | Square._D4
                                                 | Square._E1
                                                 | Square._E3
                                                 | Square._G1
                                                 | Square._G3
                                                 | Square._H4;

   public static final long _PATHS_FROM_H2 = Square._B8
                                                 | Square._C7
                                                 | Square._D6
                                                 | Square._E5
                                                 | Square._F4
                                                 | Square._G3
                                                 | Square._G1;

   public static final long _PATHS_FROM_A3 = Square._B2
                                                 | Square._B4
                                                 | Square._C1
                                                 | Square._C5
                                                 | Square._D6
                                                 | Square._E7
                                                 | Square._F8;

   public static final long _PATHS_FROM_C3 = Square._A1
                                                 | Square._A5
                                                 | Square._B2
                                                 | Square._B4
                                                 | Square._D2
                                                 | Square._D4
                                                 | Square._E1
                                                 | Square._E5
                                                 | Square._F6
                                                 | Square._G7
                                                 | Square._H8;

   public static final long _PATHS_FROM_E3 = Square._A7
                                                 | Square._B6
                                                 | Square._C1
                                                 | Square._C5
                                                 | Square._D2
                                                 | Square._D4
                                                 | Square._F2
                                                 | Square._F4
                                                 | Square._G1
                                                 | Square._G5
                                                 | Square._H6;

   public static final long _PATHS_FROM_G3 = Square._B8
                                                 | Square._C7
                                                 | Square._D6
                                                 | Square._E5
                                                 | Square._F4
                                                 | Square._F2
                                                 | Square._H2
                                                 | Square._H4
                                                 | Square._E1;

   public static final long _PATHS_FROM_B4 = Square._A3
                                                 | Square._A5
                                                 | Square._C3
                                                 | Square._C5
                                                 | Square._D2
                                                 | Square._D6
                                                 | Square._E1
                                                 | Square._E7
                                                 | Square._F8;

   public static final long _PATHS_FROM_D4 = Square._A7
                                                 | Square._A1
                                                 | Square._B6
                                                 | Square._B2
                                                 | Square._C5
                                                 | Square._C3
                                                 | Square._E3
                                                 | Square._E5
                                                 | Square._F6
                                                 | Square._F2
                                                 | Square._G1
                                                 | Square._G7
                                                 | Square._H8;

   public static final long _PATHS_FROM_F4 = Square._B8
                                                 | Square._C7
                                                 | Square._D6
                                                 | Square._E5
                                                 | Square._E3
                                                 | Square._D2
                                                 | Square._C1
                                                 | Square._G3
                                                 | Square._H2
                                                 | Square._G5
                                                 | Square._H6;

   public static final long _PATHS_FROM_H4 = Square._D8
                                                 | Square._E7
                                                 | Square._E1
                                                 | Square._F6
                                                 | Square._F2
                                                 | Square._G5
                                                 | Square._G3;

   public static final long _PATHS_FROM_A5 = Square._B6
                                                 | Square._B4
                                                 | Square._C3
                                                 | Square._C7
                                                 | Square._D2
                                                 | Square._D8
                                                 | Square._E1;

   public static final long _PATHS_FROM_C5 = Square._A3
                                                 | Square._A7
                                                 | Square._B4
                                                 | Square._B6
                                                 | Square._D4
                                                 | Square._D6
                                                 | Square._E3
                                                 | Square._E7
                                                 | Square._F2
                                                 | Square._F8
                                                 | Square._G1;

   public static final long _PATHS_FROM_E5 = Square._A1
                                                 | Square._B2
                                                 | Square._B8
                                                 | Square._C3
                                                 | Square._C7
                                                 | Square._D4
                                                 | Square._D6
                                                 | Square._F4
                                                 | Square._F6
                                                 | Square._G3
                                                 | Square._G7
                                                 | Square._H2
                                                 | Square._H8;

   public static final long _PATHS_FROM_G5 = Square._C1
                                                 | Square._D2
                                                 | Square._D8
                                                 | Square._E3
                                                 | Square._E7
                                                 | Square._F4
                                                 | Square._F6
                                                 | Square._H4
                                                 | Square._H6;

   public static final long _PATHS_FROM_B6 = Square._A5
                                                 | Square._A7
                                                 | Square._C5
                                                 | Square._C7
                                                 | Square._D4
                                                 | Square._D8
                                                 | Square._E3
                                                 | Square._F2
                                                 | Square._G1;

   public static final long _PATHS_FROM_D6 = Square._A3
                                                 | Square._B4
                                                 | Square._B8
                                                 | Square._C5
                                                 | Square._C7
                                                 | Square._E5
                                                 | Square._E7
                                                 | Square._F4
                                                 | Square._F8
                                                 | Square._G3
                                                 | Square._H2;

   public static final long _PATHS_FROM_F6 = Square._A1
                                                 | Square._B2
                                                 | Square._C3
                                                 | Square._D4
                                                 | Square._D8
                                                 | Square._E5
                                                 | Square._E7
                                                 | Square._G5
                                                 | Square._G7
                                                 | Square._H4
                                                 | Square._H8;

   public static final long _PATHS_FROM_H6 = Square._C1
                                                 | Square._D2
                                                 | Square._E3
                                                 | Square._F4
                                                 | Square._G5
                                                 | Square._G7
                                                 | Square._F8;

   public static final long _PATHS_FROM_A7 = Square._B6
                                                 | Square._B8
                                                 | Square._C5
                                                 | Square._D4
                                                 | Square._E3
                                                 | Square._F2
                                                 | Square._G1;

   public static final long _PATHS_FROM_C7 = Square._A5
                                                 | Square._B6
                                                 | Square._B8
                                                 | Square._D8
                                                 | Square._D6
                                                 | Square._E5
                                                 | Square._F4
                                                 | Square._G3
                                                 | Square._H2;

   public static final long _PATHS_FROM_E7 = Square._A3
                                                 | Square._B4
                                                 | Square._C5
                                                 | Square._D6
                                                 | Square._D8
                                                 | Square._F6
                                                 | Square._F8
                                                 | Square._G5
                                                 | Square._H4;

   public static final long _PATHS_FROM_G7 = Square._A1
                                                 | Square._B2
                                                 | Square._C3
                                                 | Square._D4
                                                 | Square._E5
                                                 | Square._F6
                                                 | Square._F8
                                                 | Square._H6
                                                 | Square._H8;

   public static final long _PATHS_FROM_B8 = Square._A7
                                                 | Square._C7
                                                 | Square._D6
                                                 | Square._E5
                                                 | Square._F4
                                                 | Square._G3
                                                 | Square._H2;

   public static final long _PATHS_FROM_D8 = Square._A5
                                                 | Square._B6
                                                 | Square._C7
                                                 | Square._E7
                                                 | Square._F6
                                                 | Square._G5
                                                 | Square._H4;

   public static final long _PATHS_FROM_F8 = Square._A3
                                                 | Square._B4
                                                 | Square._C5
                                                 | Square._D6
                                                 | Square._E7
                                                 | Square._G7
                                                 | Square._H6;

   public static final long _PATHS_FROM_H8 = Square._A1
                                                 | Square._B2
                                                 | Square._C3
                                                 | Square._D4
                                                 | Square._E5
                                                 | Square._F6
                                                 | Square._G7;

}