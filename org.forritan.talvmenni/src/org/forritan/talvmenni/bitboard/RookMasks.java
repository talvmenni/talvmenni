package org.forritan.talvmenni.bitboard;

public class RookMasks implements RookMask {

   private static RookMasks    instance;
   private static final long[] east2WestBitmaps   = new long[64];
   private static final long[] west2EastBitmaps   = new long[64];
   private static final long[] north2SouthBitmaps = new long[64];
   private static final long[] south2NorthBitmaps = new long[64];

   public static RookMask create() {
      if (RookMasks.instance == null) {
         RookMasks.instance= new RookMasks();
      }
      return RookMasks.instance;
   }

   private RookMasks() {
   }

   public long getEast2WestMaskFrom(
         long square) {
      return RookMasks.east2WestBitmaps[Long.numberOfLeadingZeros(square)];
   }

   public long getWest2EastMaskFrom(
         long square) {
      return RookMasks.west2EastBitmaps[Long.numberOfLeadingZeros(square)];
   }

   public long getNorth2SouthMaskFrom(
         long square) {
      return RookMasks.north2SouthBitmaps[Long.numberOfLeadingZeros(square)];
   }

   public long getSouth2NorthMaskFrom(
         long square) {
      return RookMasks.south2NorthBitmaps[Long.numberOfLeadingZeros(square)];
   }

   static {
      east2WestBitmaps[0]= _EAST2WEST_FROM_FILE_A;
      east2WestBitmaps[1]= _EAST2WEST_FROM_FILE_B;
      east2WestBitmaps[2]= _EAST2WEST_FROM_FILE_C;
      east2WestBitmaps[3]= _EAST2WEST_FROM_FILE_D;
      east2WestBitmaps[4]= _EAST2WEST_FROM_FILE_E;
      east2WestBitmaps[5]= _EAST2WEST_FROM_FILE_F;
      east2WestBitmaps[6]= _EAST2WEST_FROM_FILE_G;
      east2WestBitmaps[7]= _EAST2WEST_FROM_FILE_H;
      east2WestBitmaps[8]= _EAST2WEST_FROM_FILE_A;
      east2WestBitmaps[9]= _EAST2WEST_FROM_FILE_B;
      east2WestBitmaps[10]= _EAST2WEST_FROM_FILE_C;
      east2WestBitmaps[11]= _EAST2WEST_FROM_FILE_D;
      east2WestBitmaps[12]= _EAST2WEST_FROM_FILE_E;
      east2WestBitmaps[13]= _EAST2WEST_FROM_FILE_F;
      east2WestBitmaps[14]= _EAST2WEST_FROM_FILE_G;
      east2WestBitmaps[15]= _EAST2WEST_FROM_FILE_H;
      east2WestBitmaps[16]= _EAST2WEST_FROM_FILE_A;
      east2WestBitmaps[17]= _EAST2WEST_FROM_FILE_B;
      east2WestBitmaps[18]= _EAST2WEST_FROM_FILE_C;
      east2WestBitmaps[19]= _EAST2WEST_FROM_FILE_D;
      east2WestBitmaps[20]= _EAST2WEST_FROM_FILE_E;
      east2WestBitmaps[21]= _EAST2WEST_FROM_FILE_F;
      east2WestBitmaps[22]= _EAST2WEST_FROM_FILE_G;
      east2WestBitmaps[23]= _EAST2WEST_FROM_FILE_H;
      east2WestBitmaps[24]= _EAST2WEST_FROM_FILE_A;
      east2WestBitmaps[25]= _EAST2WEST_FROM_FILE_B;
      east2WestBitmaps[26]= _EAST2WEST_FROM_FILE_C;
      east2WestBitmaps[27]= _EAST2WEST_FROM_FILE_D;
      east2WestBitmaps[28]= _EAST2WEST_FROM_FILE_E;
      east2WestBitmaps[29]= _EAST2WEST_FROM_FILE_F;
      east2WestBitmaps[30]= _EAST2WEST_FROM_FILE_G;
      east2WestBitmaps[31]= _EAST2WEST_FROM_FILE_H;
      east2WestBitmaps[32]= _EAST2WEST_FROM_FILE_A;
      east2WestBitmaps[33]= _EAST2WEST_FROM_FILE_B;
      east2WestBitmaps[34]= _EAST2WEST_FROM_FILE_C;
      east2WestBitmaps[35]= _EAST2WEST_FROM_FILE_D;
      east2WestBitmaps[36]= _EAST2WEST_FROM_FILE_E;
      east2WestBitmaps[37]= _EAST2WEST_FROM_FILE_F;
      east2WestBitmaps[38]= _EAST2WEST_FROM_FILE_G;
      east2WestBitmaps[39]= _EAST2WEST_FROM_FILE_H;
      east2WestBitmaps[40]= _EAST2WEST_FROM_FILE_A;
      east2WestBitmaps[41]= _EAST2WEST_FROM_FILE_B;
      east2WestBitmaps[42]= _EAST2WEST_FROM_FILE_C;
      east2WestBitmaps[43]= _EAST2WEST_FROM_FILE_D;
      east2WestBitmaps[44]= _EAST2WEST_FROM_FILE_E;
      east2WestBitmaps[45]= _EAST2WEST_FROM_FILE_F;
      east2WestBitmaps[46]= _EAST2WEST_FROM_FILE_G;
      east2WestBitmaps[47]= _EAST2WEST_FROM_FILE_H;
      east2WestBitmaps[48]= _EAST2WEST_FROM_FILE_A;
      east2WestBitmaps[49]= _EAST2WEST_FROM_FILE_B;
      east2WestBitmaps[50]= _EAST2WEST_FROM_FILE_C;
      east2WestBitmaps[51]= _EAST2WEST_FROM_FILE_D;
      east2WestBitmaps[52]= _EAST2WEST_FROM_FILE_E;
      east2WestBitmaps[53]= _EAST2WEST_FROM_FILE_F;
      east2WestBitmaps[54]= _EAST2WEST_FROM_FILE_G;
      east2WestBitmaps[55]= _EAST2WEST_FROM_FILE_H;
      east2WestBitmaps[56]= _EAST2WEST_FROM_FILE_A;
      east2WestBitmaps[57]= _EAST2WEST_FROM_FILE_B;
      east2WestBitmaps[58]= _EAST2WEST_FROM_FILE_C;
      east2WestBitmaps[59]= _EAST2WEST_FROM_FILE_D;
      east2WestBitmaps[60]= _EAST2WEST_FROM_FILE_E;
      east2WestBitmaps[61]= _EAST2WEST_FROM_FILE_F;
      east2WestBitmaps[62]= _EAST2WEST_FROM_FILE_G;
      east2WestBitmaps[63]= _EAST2WEST_FROM_FILE_H;

      west2EastBitmaps[0]= _WEST2EAST_FROM_FILE_A;
      west2EastBitmaps[1]= _WEST2EAST_FROM_FILE_B;
      west2EastBitmaps[2]= _WEST2EAST_FROM_FILE_C;
      west2EastBitmaps[3]= _WEST2EAST_FROM_FILE_D;
      west2EastBitmaps[4]= _WEST2EAST_FROM_FILE_E;
      west2EastBitmaps[5]= _WEST2EAST_FROM_FILE_F;
      west2EastBitmaps[6]= _WEST2EAST_FROM_FILE_G;
      west2EastBitmaps[7]= _WEST2EAST_FROM_FILE_H;
      west2EastBitmaps[8]= _WEST2EAST_FROM_FILE_A;
      west2EastBitmaps[9]= _WEST2EAST_FROM_FILE_B;
      west2EastBitmaps[10]= _WEST2EAST_FROM_FILE_C;
      west2EastBitmaps[11]= _WEST2EAST_FROM_FILE_D;
      west2EastBitmaps[12]= _WEST2EAST_FROM_FILE_E;
      west2EastBitmaps[13]= _WEST2EAST_FROM_FILE_F;
      west2EastBitmaps[14]= _WEST2EAST_FROM_FILE_G;
      west2EastBitmaps[15]= _WEST2EAST_FROM_FILE_H;
      west2EastBitmaps[16]= _WEST2EAST_FROM_FILE_A;
      west2EastBitmaps[17]= _WEST2EAST_FROM_FILE_B;
      west2EastBitmaps[18]= _WEST2EAST_FROM_FILE_C;
      west2EastBitmaps[19]= _WEST2EAST_FROM_FILE_D;
      west2EastBitmaps[20]= _WEST2EAST_FROM_FILE_E;
      west2EastBitmaps[21]= _WEST2EAST_FROM_FILE_F;
      west2EastBitmaps[22]= _WEST2EAST_FROM_FILE_G;
      west2EastBitmaps[23]= _WEST2EAST_FROM_FILE_H;
      west2EastBitmaps[24]= _WEST2EAST_FROM_FILE_A;
      west2EastBitmaps[25]= _WEST2EAST_FROM_FILE_B;
      west2EastBitmaps[26]= _WEST2EAST_FROM_FILE_C;
      west2EastBitmaps[27]= _WEST2EAST_FROM_FILE_D;
      west2EastBitmaps[28]= _WEST2EAST_FROM_FILE_E;
      west2EastBitmaps[29]= _WEST2EAST_FROM_FILE_F;
      west2EastBitmaps[30]= _WEST2EAST_FROM_FILE_G;
      west2EastBitmaps[31]= _WEST2EAST_FROM_FILE_H;
      west2EastBitmaps[32]= _WEST2EAST_FROM_FILE_A;
      west2EastBitmaps[33]= _WEST2EAST_FROM_FILE_B;
      west2EastBitmaps[34]= _WEST2EAST_FROM_FILE_C;
      west2EastBitmaps[35]= _WEST2EAST_FROM_FILE_D;
      west2EastBitmaps[36]= _WEST2EAST_FROM_FILE_E;
      west2EastBitmaps[37]= _WEST2EAST_FROM_FILE_F;
      west2EastBitmaps[38]= _WEST2EAST_FROM_FILE_G;
      west2EastBitmaps[39]= _WEST2EAST_FROM_FILE_H;
      west2EastBitmaps[40]= _WEST2EAST_FROM_FILE_A;
      west2EastBitmaps[41]= _WEST2EAST_FROM_FILE_B;
      west2EastBitmaps[42]= _WEST2EAST_FROM_FILE_C;
      west2EastBitmaps[43]= _WEST2EAST_FROM_FILE_D;
      west2EastBitmaps[44]= _WEST2EAST_FROM_FILE_E;
      west2EastBitmaps[45]= _WEST2EAST_FROM_FILE_F;
      west2EastBitmaps[46]= _WEST2EAST_FROM_FILE_G;
      west2EastBitmaps[47]= _WEST2EAST_FROM_FILE_H;
      west2EastBitmaps[48]= _WEST2EAST_FROM_FILE_A;
      west2EastBitmaps[49]= _WEST2EAST_FROM_FILE_B;
      west2EastBitmaps[50]= _WEST2EAST_FROM_FILE_C;
      west2EastBitmaps[51]= _WEST2EAST_FROM_FILE_D;
      west2EastBitmaps[52]= _WEST2EAST_FROM_FILE_E;
      west2EastBitmaps[53]= _WEST2EAST_FROM_FILE_F;
      west2EastBitmaps[54]= _WEST2EAST_FROM_FILE_G;
      west2EastBitmaps[55]= _WEST2EAST_FROM_FILE_H;
      west2EastBitmaps[56]= _WEST2EAST_FROM_FILE_A;
      west2EastBitmaps[57]= _WEST2EAST_FROM_FILE_B;
      west2EastBitmaps[58]= _WEST2EAST_FROM_FILE_C;
      west2EastBitmaps[59]= _WEST2EAST_FROM_FILE_D;
      west2EastBitmaps[60]= _WEST2EAST_FROM_FILE_E;
      west2EastBitmaps[61]= _WEST2EAST_FROM_FILE_F;
      west2EastBitmaps[62]= _WEST2EAST_FROM_FILE_G;
      west2EastBitmaps[63]= _WEST2EAST_FROM_FILE_H;

      north2SouthBitmaps[0]= _NORTH2SOUTH_FROM_RANK_8;
      north2SouthBitmaps[1]= _NORTH2SOUTH_FROM_RANK_8;
      north2SouthBitmaps[2]= _NORTH2SOUTH_FROM_RANK_8;
      north2SouthBitmaps[3]= _NORTH2SOUTH_FROM_RANK_8;
      north2SouthBitmaps[4]= _NORTH2SOUTH_FROM_RANK_8;
      north2SouthBitmaps[5]= _NORTH2SOUTH_FROM_RANK_8;
      north2SouthBitmaps[6]= _NORTH2SOUTH_FROM_RANK_8;
      north2SouthBitmaps[7]= _NORTH2SOUTH_FROM_RANK_8;
      north2SouthBitmaps[8]= _NORTH2SOUTH_FROM_RANK_7;
      north2SouthBitmaps[9]= _NORTH2SOUTH_FROM_RANK_7;
      north2SouthBitmaps[10]= _NORTH2SOUTH_FROM_RANK_7;
      north2SouthBitmaps[11]= _NORTH2SOUTH_FROM_RANK_7;
      north2SouthBitmaps[12]= _NORTH2SOUTH_FROM_RANK_7;
      north2SouthBitmaps[13]= _NORTH2SOUTH_FROM_RANK_7;
      north2SouthBitmaps[14]= _NORTH2SOUTH_FROM_RANK_7;
      north2SouthBitmaps[15]= _NORTH2SOUTH_FROM_RANK_7;
      north2SouthBitmaps[16]= _NORTH2SOUTH_FROM_RANK_6;
      north2SouthBitmaps[17]= _NORTH2SOUTH_FROM_RANK_6;
      north2SouthBitmaps[18]= _NORTH2SOUTH_FROM_RANK_6;
      north2SouthBitmaps[19]= _NORTH2SOUTH_FROM_RANK_6;
      north2SouthBitmaps[20]= _NORTH2SOUTH_FROM_RANK_6;
      north2SouthBitmaps[21]= _NORTH2SOUTH_FROM_RANK_6;
      north2SouthBitmaps[22]= _NORTH2SOUTH_FROM_RANK_6;
      north2SouthBitmaps[23]= _NORTH2SOUTH_FROM_RANK_6;
      north2SouthBitmaps[24]= _NORTH2SOUTH_FROM_RANK_5;
      north2SouthBitmaps[25]= _NORTH2SOUTH_FROM_RANK_5;
      north2SouthBitmaps[26]= _NORTH2SOUTH_FROM_RANK_5;
      north2SouthBitmaps[27]= _NORTH2SOUTH_FROM_RANK_5;
      north2SouthBitmaps[28]= _NORTH2SOUTH_FROM_RANK_5;
      north2SouthBitmaps[29]= _NORTH2SOUTH_FROM_RANK_5;
      north2SouthBitmaps[30]= _NORTH2SOUTH_FROM_RANK_5;
      north2SouthBitmaps[31]= _NORTH2SOUTH_FROM_RANK_5;
      north2SouthBitmaps[32]= _NORTH2SOUTH_FROM_RANK_4;
      north2SouthBitmaps[33]= _NORTH2SOUTH_FROM_RANK_4;
      north2SouthBitmaps[34]= _NORTH2SOUTH_FROM_RANK_4;
      north2SouthBitmaps[35]= _NORTH2SOUTH_FROM_RANK_4;
      north2SouthBitmaps[36]= _NORTH2SOUTH_FROM_RANK_4;
      north2SouthBitmaps[37]= _NORTH2SOUTH_FROM_RANK_4;
      north2SouthBitmaps[38]= _NORTH2SOUTH_FROM_RANK_4;
      north2SouthBitmaps[39]= _NORTH2SOUTH_FROM_RANK_4;
      north2SouthBitmaps[40]= _NORTH2SOUTH_FROM_RANK_3;
      north2SouthBitmaps[41]= _NORTH2SOUTH_FROM_RANK_3;
      north2SouthBitmaps[42]= _NORTH2SOUTH_FROM_RANK_3;
      north2SouthBitmaps[43]= _NORTH2SOUTH_FROM_RANK_3;
      north2SouthBitmaps[44]= _NORTH2SOUTH_FROM_RANK_3;
      north2SouthBitmaps[45]= _NORTH2SOUTH_FROM_RANK_3;
      north2SouthBitmaps[46]= _NORTH2SOUTH_FROM_RANK_3;
      north2SouthBitmaps[47]= _NORTH2SOUTH_FROM_RANK_3;
      north2SouthBitmaps[48]= _NORTH2SOUTH_FROM_RANK_2;
      north2SouthBitmaps[49]= _NORTH2SOUTH_FROM_RANK_2;
      north2SouthBitmaps[50]= _NORTH2SOUTH_FROM_RANK_2;
      north2SouthBitmaps[51]= _NORTH2SOUTH_FROM_RANK_2;
      north2SouthBitmaps[52]= _NORTH2SOUTH_FROM_RANK_2;
      north2SouthBitmaps[53]= _NORTH2SOUTH_FROM_RANK_2;
      north2SouthBitmaps[54]= _NORTH2SOUTH_FROM_RANK_2;
      north2SouthBitmaps[55]= _NORTH2SOUTH_FROM_RANK_2;
      north2SouthBitmaps[56]= _NORTH2SOUTH_FROM_RANK_1;
      north2SouthBitmaps[57]= _NORTH2SOUTH_FROM_RANK_1;
      north2SouthBitmaps[58]= _NORTH2SOUTH_FROM_RANK_1;
      north2SouthBitmaps[59]= _NORTH2SOUTH_FROM_RANK_1;
      north2SouthBitmaps[60]= _NORTH2SOUTH_FROM_RANK_1;
      north2SouthBitmaps[61]= _NORTH2SOUTH_FROM_RANK_1;
      north2SouthBitmaps[62]= _NORTH2SOUTH_FROM_RANK_1;
      north2SouthBitmaps[63]= _NORTH2SOUTH_FROM_RANK_1;

      south2NorthBitmaps[0]= _SOUTH2NORTH_FROM_RANK_8;
      south2NorthBitmaps[1]= _SOUTH2NORTH_FROM_RANK_8;
      south2NorthBitmaps[2]= _SOUTH2NORTH_FROM_RANK_8;
      south2NorthBitmaps[3]= _SOUTH2NORTH_FROM_RANK_8;
      south2NorthBitmaps[4]= _SOUTH2NORTH_FROM_RANK_8;
      south2NorthBitmaps[5]= _SOUTH2NORTH_FROM_RANK_8;
      south2NorthBitmaps[6]= _SOUTH2NORTH_FROM_RANK_8;
      south2NorthBitmaps[7]= _SOUTH2NORTH_FROM_RANK_8;
      south2NorthBitmaps[8]= _SOUTH2NORTH_FROM_RANK_7;
      south2NorthBitmaps[9]= _SOUTH2NORTH_FROM_RANK_7;
      south2NorthBitmaps[10]= _SOUTH2NORTH_FROM_RANK_7;
      south2NorthBitmaps[11]= _SOUTH2NORTH_FROM_RANK_7;
      south2NorthBitmaps[12]= _SOUTH2NORTH_FROM_RANK_7;
      south2NorthBitmaps[13]= _SOUTH2NORTH_FROM_RANK_7;
      south2NorthBitmaps[14]= _SOUTH2NORTH_FROM_RANK_7;
      south2NorthBitmaps[15]= _SOUTH2NORTH_FROM_RANK_7;
      south2NorthBitmaps[16]= _SOUTH2NORTH_FROM_RANK_6;
      south2NorthBitmaps[17]= _SOUTH2NORTH_FROM_RANK_6;
      south2NorthBitmaps[18]= _SOUTH2NORTH_FROM_RANK_6;
      south2NorthBitmaps[19]= _SOUTH2NORTH_FROM_RANK_6;
      south2NorthBitmaps[20]= _SOUTH2NORTH_FROM_RANK_6;
      south2NorthBitmaps[21]= _SOUTH2NORTH_FROM_RANK_6;
      south2NorthBitmaps[22]= _SOUTH2NORTH_FROM_RANK_6;
      south2NorthBitmaps[23]= _SOUTH2NORTH_FROM_RANK_6;
      south2NorthBitmaps[24]= _SOUTH2NORTH_FROM_RANK_5;
      south2NorthBitmaps[25]= _SOUTH2NORTH_FROM_RANK_5;
      south2NorthBitmaps[26]= _SOUTH2NORTH_FROM_RANK_5;
      south2NorthBitmaps[27]= _SOUTH2NORTH_FROM_RANK_5;
      south2NorthBitmaps[28]= _SOUTH2NORTH_FROM_RANK_5;
      south2NorthBitmaps[29]= _SOUTH2NORTH_FROM_RANK_5;
      south2NorthBitmaps[30]= _SOUTH2NORTH_FROM_RANK_5;
      south2NorthBitmaps[31]= _SOUTH2NORTH_FROM_RANK_5;
      south2NorthBitmaps[32]= _SOUTH2NORTH_FROM_RANK_4;
      south2NorthBitmaps[33]= _SOUTH2NORTH_FROM_RANK_4;
      south2NorthBitmaps[34]= _SOUTH2NORTH_FROM_RANK_4;
      south2NorthBitmaps[35]= _SOUTH2NORTH_FROM_RANK_4;
      south2NorthBitmaps[36]= _SOUTH2NORTH_FROM_RANK_4;
      south2NorthBitmaps[37]= _SOUTH2NORTH_FROM_RANK_4;
      south2NorthBitmaps[38]= _SOUTH2NORTH_FROM_RANK_4;
      south2NorthBitmaps[39]= _SOUTH2NORTH_FROM_RANK_4;
      south2NorthBitmaps[40]= _SOUTH2NORTH_FROM_RANK_3;
      south2NorthBitmaps[41]= _SOUTH2NORTH_FROM_RANK_3;
      south2NorthBitmaps[42]= _SOUTH2NORTH_FROM_RANK_3;
      south2NorthBitmaps[43]= _SOUTH2NORTH_FROM_RANK_3;
      south2NorthBitmaps[44]= _SOUTH2NORTH_FROM_RANK_3;
      south2NorthBitmaps[45]= _SOUTH2NORTH_FROM_RANK_3;
      south2NorthBitmaps[46]= _SOUTH2NORTH_FROM_RANK_3;
      south2NorthBitmaps[47]= _SOUTH2NORTH_FROM_RANK_3;
      south2NorthBitmaps[48]= _SOUTH2NORTH_FROM_RANK_2;
      south2NorthBitmaps[49]= _SOUTH2NORTH_FROM_RANK_2;
      south2NorthBitmaps[50]= _SOUTH2NORTH_FROM_RANK_2;
      south2NorthBitmaps[51]= _SOUTH2NORTH_FROM_RANK_2;
      south2NorthBitmaps[52]= _SOUTH2NORTH_FROM_RANK_2;
      south2NorthBitmaps[53]= _SOUTH2NORTH_FROM_RANK_2;
      south2NorthBitmaps[54]= _SOUTH2NORTH_FROM_RANK_2;
      south2NorthBitmaps[55]= _SOUTH2NORTH_FROM_RANK_2;
      south2NorthBitmaps[56]= _SOUTH2NORTH_FROM_RANK_1;
      south2NorthBitmaps[57]= _SOUTH2NORTH_FROM_RANK_1;
      south2NorthBitmaps[58]= _SOUTH2NORTH_FROM_RANK_1;
      south2NorthBitmaps[59]= _SOUTH2NORTH_FROM_RANK_1;
      south2NorthBitmaps[60]= _SOUTH2NORTH_FROM_RANK_1;
      south2NorthBitmaps[61]= _SOUTH2NORTH_FROM_RANK_1;
      south2NorthBitmaps[62]= _SOUTH2NORTH_FROM_RANK_1;
      south2NorthBitmaps[63]= _SOUTH2NORTH_FROM_RANK_1;
   }
}