package org.forritan.talvmenni.bitboard.paths;

public interface Queen {
   public static final long _PATHS_FROM_A1 = Rook._PATHS_FROM_A1
                                                 | BlackBishop._PATHS_FROM_A1;
   public static final long _PATHS_FROM_A2 = Rook._PATHS_FROM_A2
                                                 | WhiteBishop._PATHS_FROM_A2;
   public static final long _PATHS_FROM_A3 = Rook._PATHS_FROM_A3
                                                 | BlackBishop._PATHS_FROM_A3;
   public static final long _PATHS_FROM_A4 = Rook._PATHS_FROM_A4
                                                 | WhiteBishop._PATHS_FROM_A4;
   public static final long _PATHS_FROM_A5 = Rook._PATHS_FROM_A5
                                                 | BlackBishop._PATHS_FROM_A5;
   public static final long _PATHS_FROM_A6 = Rook._PATHS_FROM_A6
                                                 | WhiteBishop._PATHS_FROM_A6;
   public static final long _PATHS_FROM_A7 = Rook._PATHS_FROM_A7
                                                 | BlackBishop._PATHS_FROM_A7;
   public static final long _PATHS_FROM_A8 = Rook._PATHS_FROM_A8
                                                 | WhiteBishop._PATHS_FROM_A8;

   public static final long _PATHS_FROM_B1 = Rook._PATHS_FROM_B1
                                                 | WhiteBishop._PATHS_FROM_B1;
   public static final long _PATHS_FROM_B2 = Rook._PATHS_FROM_B2
                                                 | BlackBishop._PATHS_FROM_B2;
   public static final long _PATHS_FROM_B3 = Rook._PATHS_FROM_B3
                                                 | WhiteBishop._PATHS_FROM_B3;
   public static final long _PATHS_FROM_B4 = Rook._PATHS_FROM_B4
                                                 | BlackBishop._PATHS_FROM_B4;
   public static final long _PATHS_FROM_B5 = Rook._PATHS_FROM_B5
                                                 | WhiteBishop._PATHS_FROM_B5;
   public static final long _PATHS_FROM_B6 = Rook._PATHS_FROM_B6
                                                 | BlackBishop._PATHS_FROM_B6;
   public static final long _PATHS_FROM_B7 = Rook._PATHS_FROM_B7
                                                 | WhiteBishop._PATHS_FROM_B7;
   public static final long _PATHS_FROM_B8 = Rook._PATHS_FROM_B8
                                                 | BlackBishop._PATHS_FROM_B8;

   public static final long _PATHS_FROM_C1 = Rook._PATHS_FROM_C1
                                                 | BlackBishop._PATHS_FROM_C1;
   public static final long _PATHS_FROM_C2 = Rook._PATHS_FROM_C2
                                                 | WhiteBishop._PATHS_FROM_C2;
   public static final long _PATHS_FROM_C3 = Rook._PATHS_FROM_C3
                                                 | BlackBishop._PATHS_FROM_C3;
   public static final long _PATHS_FROM_C4 = Rook._PATHS_FROM_C4
                                                 | WhiteBishop._PATHS_FROM_C4;
   public static final long _PATHS_FROM_C5 = Rook._PATHS_FROM_C5
                                                 | BlackBishop._PATHS_FROM_C5;
   public static final long _PATHS_FROM_C6 = Rook._PATHS_FROM_C6
                                                 | WhiteBishop._PATHS_FROM_C6;
   public static final long _PATHS_FROM_C7 = Rook._PATHS_FROM_C7
                                                 | BlackBishop._PATHS_FROM_C7;
   public static final long _PATHS_FROM_C8 = Rook._PATHS_FROM_C8
                                                 | WhiteBishop._PATHS_FROM_C8;

   public static final long _PATHS_FROM_D1 = Rook._PATHS_FROM_D1
                                                 | WhiteBishop._PATHS_FROM_D1;
   public static final long _PATHS_FROM_D2 = Rook._PATHS_FROM_D2
                                                 | BlackBishop._PATHS_FROM_D2;
   public static final long _PATHS_FROM_D3 = Rook._PATHS_FROM_D3
                                                 | WhiteBishop._PATHS_FROM_D3;
   public static final long _PATHS_FROM_D4 = Rook._PATHS_FROM_D4
                                                 | BlackBishop._PATHS_FROM_D4;
   public static final long _PATHS_FROM_D5 = Rook._PATHS_FROM_D5
                                                 | WhiteBishop._PATHS_FROM_D5;
   public static final long _PATHS_FROM_D6 = Rook._PATHS_FROM_D6
                                                 | BlackBishop._PATHS_FROM_D6;
   public static final long _PATHS_FROM_D7 = Rook._PATHS_FROM_D7
                                                 | WhiteBishop._PATHS_FROM_D7;
   public static final long _PATHS_FROM_D8 = Rook._PATHS_FROM_D8
                                                 | BlackBishop._PATHS_FROM_D8;

   public static final long _PATHS_FROM_E1 = Rook._PATHS_FROM_E1
                                                 | BlackBishop._PATHS_FROM_E1;
   public static final long _PATHS_FROM_E2 = Rook._PATHS_FROM_E2
                                                 | WhiteBishop._PATHS_FROM_E2;
   public static final long _PATHS_FROM_E3 = Rook._PATHS_FROM_E3
                                                 | BlackBishop._PATHS_FROM_E3;
   public static final long _PATHS_FROM_E4 = Rook._PATHS_FROM_E4
                                                 | WhiteBishop._PATHS_FROM_E4;
   public static final long _PATHS_FROM_E5 = Rook._PATHS_FROM_E5
                                                 | BlackBishop._PATHS_FROM_E5;
   public static final long _PATHS_FROM_E6 = Rook._PATHS_FROM_E6
                                                 | WhiteBishop._PATHS_FROM_E6;
   public static final long _PATHS_FROM_E7 = Rook._PATHS_FROM_E7
                                                 | BlackBishop._PATHS_FROM_E7;
   public static final long _PATHS_FROM_E8 = Rook._PATHS_FROM_E8
                                                 | WhiteBishop._PATHS_FROM_E8;

   public static final long _PATHS_FROM_F1 = Rook._PATHS_FROM_F1
                                                 | WhiteBishop._PATHS_FROM_F1;
   public static final long _PATHS_FROM_F2 = Rook._PATHS_FROM_F2
                                                 | BlackBishop._PATHS_FROM_F2;
   public static final long _PATHS_FROM_F3 = Rook._PATHS_FROM_F3
                                                 | WhiteBishop._PATHS_FROM_F3;
   public static final long _PATHS_FROM_F4 = Rook._PATHS_FROM_F4
                                                 | BlackBishop._PATHS_FROM_F4;
   public static final long _PATHS_FROM_F5 = Rook._PATHS_FROM_F5
                                                 | WhiteBishop._PATHS_FROM_F5;
   public static final long _PATHS_FROM_F6 = Rook._PATHS_FROM_F6
                                                 | BlackBishop._PATHS_FROM_F6;
   public static final long _PATHS_FROM_F7 = Rook._PATHS_FROM_F7
                                                 | WhiteBishop._PATHS_FROM_F7;
   public static final long _PATHS_FROM_F8 = Rook._PATHS_FROM_F8
                                                 | BlackBishop._PATHS_FROM_F8;

   public static final long _PATHS_FROM_G1 = Rook._PATHS_FROM_G1
                                                 | BlackBishop._PATHS_FROM_G1;
   public static final long _PATHS_FROM_G2 = Rook._PATHS_FROM_G2
                                                 | WhiteBishop._PATHS_FROM_G2;
   public static final long _PATHS_FROM_G3 = Rook._PATHS_FROM_G3
                                                 | BlackBishop._PATHS_FROM_G3;
   public static final long _PATHS_FROM_G4 = Rook._PATHS_FROM_G4
                                                 | WhiteBishop._PATHS_FROM_G4;
   public static final long _PATHS_FROM_G5 = Rook._PATHS_FROM_G5
                                                 | BlackBishop._PATHS_FROM_G5;
   public static final long _PATHS_FROM_G6 = Rook._PATHS_FROM_G6
                                                 | WhiteBishop._PATHS_FROM_G6;
   public static final long _PATHS_FROM_G7 = Rook._PATHS_FROM_G7
                                                 | BlackBishop._PATHS_FROM_G7;
   public static final long _PATHS_FROM_G8 = Rook._PATHS_FROM_G8
                                                 | WhiteBishop._PATHS_FROM_G8;

   public static final long _PATHS_FROM_H1 = Rook._PATHS_FROM_H1
                                                 | WhiteBishop._PATHS_FROM_H1;
   public static final long _PATHS_FROM_H2 = Rook._PATHS_FROM_H2
                                                 | BlackBishop._PATHS_FROM_H2;
   public static final long _PATHS_FROM_H3 = Rook._PATHS_FROM_H3
                                                 | WhiteBishop._PATHS_FROM_H3;
   public static final long _PATHS_FROM_H4 = Rook._PATHS_FROM_H4
                                                 | BlackBishop._PATHS_FROM_H4;
   public static final long _PATHS_FROM_H5 = Rook._PATHS_FROM_H5
                                                 | WhiteBishop._PATHS_FROM_H5;
   public static final long _PATHS_FROM_H6 = Rook._PATHS_FROM_H6
                                                 | BlackBishop._PATHS_FROM_H6;
   public static final long _PATHS_FROM_H7 = Rook._PATHS_FROM_H7
                                                 | WhiteBishop._PATHS_FROM_H7;
   public static final long _PATHS_FROM_H8 = Rook._PATHS_FROM_H8
                                                 | BlackBishop._PATHS_FROM_H8;

}