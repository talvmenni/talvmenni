package org.forritan.talvmenni.bitboard.paths;

public class Knights implements Knight {

   private static Knights      instance;
   private static final long[] bitmaps = new long[64];

   public static Knight create() {
      if (Knights.instance == null) {
         Knights.instance= new Knights();
      }
      return Knights.instance;
   }

   private Knights() {
   }

   public long getPathsFrom(
         long square) {
      return Knights.bitmaps[Long.numberOfLeadingZeros(square)];
   }

   static {
      bitmaps[0]= _PATHS_FROM_A8;
      bitmaps[1]= _PATHS_FROM_B8;
      bitmaps[2]= _PATHS_FROM_C8;
      bitmaps[3]= _PATHS_FROM_D8;
      bitmaps[4]= _PATHS_FROM_E8;
      bitmaps[5]= _PATHS_FROM_F8;
      bitmaps[6]= _PATHS_FROM_G8;
      bitmaps[7]= _PATHS_FROM_H8;
      bitmaps[8]= _PATHS_FROM_A7;
      bitmaps[9]= _PATHS_FROM_B7;
      bitmaps[10]= _PATHS_FROM_C7;
      bitmaps[11]= _PATHS_FROM_D7;
      bitmaps[12]= _PATHS_FROM_E7;
      bitmaps[13]= _PATHS_FROM_F7;
      bitmaps[14]= _PATHS_FROM_G7;
      bitmaps[15]= _PATHS_FROM_H7;
      bitmaps[16]= _PATHS_FROM_A6;
      bitmaps[17]= _PATHS_FROM_B6;
      bitmaps[18]= _PATHS_FROM_C6;
      bitmaps[19]= _PATHS_FROM_D6;
      bitmaps[20]= _PATHS_FROM_E6;
      bitmaps[21]= _PATHS_FROM_F6;
      bitmaps[22]= _PATHS_FROM_G6;
      bitmaps[23]= _PATHS_FROM_H6;
      bitmaps[24]= _PATHS_FROM_A5;
      bitmaps[25]= _PATHS_FROM_B5;
      bitmaps[26]= _PATHS_FROM_C5;
      bitmaps[27]= _PATHS_FROM_D5;
      bitmaps[28]= _PATHS_FROM_E5;
      bitmaps[29]= _PATHS_FROM_F5;
      bitmaps[30]= _PATHS_FROM_G5;
      bitmaps[31]= _PATHS_FROM_H5;
      bitmaps[32]= _PATHS_FROM_A4;
      bitmaps[33]= _PATHS_FROM_B4;
      bitmaps[34]= _PATHS_FROM_C4;
      bitmaps[35]= _PATHS_FROM_D4;
      bitmaps[36]= _PATHS_FROM_E4;
      bitmaps[37]= _PATHS_FROM_F4;
      bitmaps[38]= _PATHS_FROM_G4;
      bitmaps[39]= _PATHS_FROM_H4;
      bitmaps[40]= _PATHS_FROM_A3;
      bitmaps[41]= _PATHS_FROM_B3;
      bitmaps[42]= _PATHS_FROM_C3;
      bitmaps[43]= _PATHS_FROM_D3;
      bitmaps[44]= _PATHS_FROM_E3;
      bitmaps[45]= _PATHS_FROM_F3;
      bitmaps[46]= _PATHS_FROM_G3;
      bitmaps[47]= _PATHS_FROM_H3;
      bitmaps[48]= _PATHS_FROM_A2;
      bitmaps[49]= _PATHS_FROM_B2;
      bitmaps[50]= _PATHS_FROM_C2;
      bitmaps[51]= _PATHS_FROM_D2;
      bitmaps[52]= _PATHS_FROM_E2;
      bitmaps[53]= _PATHS_FROM_F2;
      bitmaps[54]= _PATHS_FROM_G2;
      bitmaps[55]= _PATHS_FROM_H2;
      bitmaps[56]= _PATHS_FROM_A1;
      bitmaps[57]= _PATHS_FROM_B1;
      bitmaps[58]= _PATHS_FROM_C1;
      bitmaps[59]= _PATHS_FROM_D1;
      bitmaps[60]= _PATHS_FROM_E1;
      bitmaps[61]= _PATHS_FROM_F1;
      bitmaps[62]= _PATHS_FROM_G1;
      bitmaps[63]= _PATHS_FROM_H1;
   }
}