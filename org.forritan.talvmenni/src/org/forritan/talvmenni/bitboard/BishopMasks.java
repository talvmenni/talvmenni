package org.forritan.talvmenni.bitboard;

public class BishopMasks implements BishopMask {

   private static BishopMasks  instance;
   private static final long[] northWest2SouthEastBitmaps = new long[64];
   private static final long[] northEast2SouthWestBitmaps = new long[64];
   private static final long[] southEast2NorthWestBitmaps = new long[64];
   private static final long[] southWest2NorthEastBitmaps = new long[64];

   public static BishopMask create() {
      if (BishopMasks.instance == null) {
         BishopMasks.instance= new BishopMasks();
      }
      return BishopMasks.instance;
   }

   private BishopMasks() {
   }

   public long getNorthWest2SouthEastMaskFrom(long square) {
      return BishopMasks.northWest2SouthEastBitmaps[Long
            .numberOfLeadingZeros(square)];
   }

   public long getNorthEast2SouthWestMaskFrom(long square) {
      return BishopMasks.northEast2SouthWestBitmaps[Long
            .numberOfLeadingZeros(square)];
   }

   public long getSouthEast2NorthWestMaskFrom(long square) {
      return BishopMasks.southEast2NorthWestBitmaps[Long
            .numberOfLeadingZeros(square)];
   }

   public long getSouthWest2NorthEastMaskFrom(long square) {
      return BishopMasks.southWest2NorthEastBitmaps[Long
            .numberOfLeadingZeros(square)];
   }

   static {
      
      northWest2SouthEastBitmaps[0]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A8A8; //A8
      northWest2SouthEastBitmaps[1]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A7B8; //B8
      northWest2SouthEastBitmaps[2]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A6C8; //C8
      northWest2SouthEastBitmaps[3]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A5D8; //D8
      northWest2SouthEastBitmaps[4]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A4E8; //E8
      northWest2SouthEastBitmaps[5]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A3F8; //F8
      northWest2SouthEastBitmaps[6]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A2G8; //G8
      northWest2SouthEastBitmaps[7]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A1H8; //H8
      northWest2SouthEastBitmaps[8]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A7B8; //A7
      northWest2SouthEastBitmaps[9]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A6C8; //B7
      northWest2SouthEastBitmaps[10]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A5D8; //C7
      northWest2SouthEastBitmaps[11]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A4E8; //D7
      northWest2SouthEastBitmaps[12]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A3F8; //E7
      northWest2SouthEastBitmaps[13]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A2G8; //F7
      northWest2SouthEastBitmaps[14]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A1H8; //G7
      northWest2SouthEastBitmaps[15]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_B1H7; //H7
      northWest2SouthEastBitmaps[16]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A6C8; //A6
      northWest2SouthEastBitmaps[17]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A5D8; //B6
      northWest2SouthEastBitmaps[18]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A4E8; //C6
      northWest2SouthEastBitmaps[19]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A3F8; //D6
      northWest2SouthEastBitmaps[20]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A2G8; //E6
      northWest2SouthEastBitmaps[21]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A1H8; //F6
      northWest2SouthEastBitmaps[22]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_B1H7; //G6
      northWest2SouthEastBitmaps[23]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_C1H6; //H6
      northWest2SouthEastBitmaps[24]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A5D8; //A5
      northWest2SouthEastBitmaps[25]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A4E8; //B5
      northWest2SouthEastBitmaps[26]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A3F8; //C5
      northWest2SouthEastBitmaps[27]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A2G8; //D5
      northWest2SouthEastBitmaps[28]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A1H8; //E5
      northWest2SouthEastBitmaps[29]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_B1H7; //F5
      northWest2SouthEastBitmaps[30]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_C1H6; //G5
      northWest2SouthEastBitmaps[31]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_D1H5; //H5
      northWest2SouthEastBitmaps[32]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A4E8; //A4
      northWest2SouthEastBitmaps[33]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A3F8; //B4
      northWest2SouthEastBitmaps[34]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A2G8; //C4
      northWest2SouthEastBitmaps[35]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A1H8; //D4
      northWest2SouthEastBitmaps[36]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_B1H7; //E4
      northWest2SouthEastBitmaps[37]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_C1H6; //F4
      northWest2SouthEastBitmaps[38]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_D1H5; //G4
      northWest2SouthEastBitmaps[39]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_E1H4; //H4
      northWest2SouthEastBitmaps[40]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A3F8; //A3
      northWest2SouthEastBitmaps[41]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A2G8; //B3
      northWest2SouthEastBitmaps[42]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A1H8; //C3
      northWest2SouthEastBitmaps[43]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_B1H7; //D3
      northWest2SouthEastBitmaps[44]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_C1H6; //E3
      northWest2SouthEastBitmaps[45]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_D1H5; //F3
      northWest2SouthEastBitmaps[46]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_E1H4; //G3
      northWest2SouthEastBitmaps[47]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_F1H3; //H3
      northWest2SouthEastBitmaps[48]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A2G8; //A2
      northWest2SouthEastBitmaps[49]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A1H8; //B2
      northWest2SouthEastBitmaps[50]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_B1H7; //C2
      northWest2SouthEastBitmaps[51]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_C1H6; //D2
      northWest2SouthEastBitmaps[52]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_D1H5; //E2
      northWest2SouthEastBitmaps[53]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_E1H4; //F2
      northWest2SouthEastBitmaps[54]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_F1H3; //G2
      northWest2SouthEastBitmaps[55]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_G1H2; //H2
      northWest2SouthEastBitmaps[56]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A1H8; //A1
      northWest2SouthEastBitmaps[57]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_B1H7; //B1
      northWest2SouthEastBitmaps[58]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_C1H6; //C1
      northWest2SouthEastBitmaps[59]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_D1H5; //D1
      northWest2SouthEastBitmaps[60]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_E1H4; //E1
      northWest2SouthEastBitmaps[61]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_F1H3; //F1
      northWest2SouthEastBitmaps[62]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_G1H2; //G1
      northWest2SouthEastBitmaps[63]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_H1H1; //H1

      northEast2SouthWestBitmaps[0]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A8H1; //A8
      northEast2SouthWestBitmaps[1]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_B8H2; //B8
      northEast2SouthWestBitmaps[2]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_C8H3; //C8
      northEast2SouthWestBitmaps[3]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_D8H4; //D8
      northEast2SouthWestBitmaps[4]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_E8H5; //E8
      northEast2SouthWestBitmaps[5]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_F8H6; //F8
      northEast2SouthWestBitmaps[6]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_G8H7; //G8
      northEast2SouthWestBitmaps[7]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_H8H8; //H8
      northEast2SouthWestBitmaps[8]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A7G1; //A7
      northEast2SouthWestBitmaps[9]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A8H1; //B7
      northEast2SouthWestBitmaps[10]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_B8H2; //C7
      northEast2SouthWestBitmaps[11]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_C8H3; //D7
      northEast2SouthWestBitmaps[12]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_D8H4; //E7
      northEast2SouthWestBitmaps[13]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_E8H5; //F7
      northEast2SouthWestBitmaps[14]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_F8H6; //G7
      northEast2SouthWestBitmaps[15]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_G8H7; //H7
      northEast2SouthWestBitmaps[16]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A6F1; //A6
      northEast2SouthWestBitmaps[17]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A7G1; //B6
      northEast2SouthWestBitmaps[18]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A8H1; //C6
      northEast2SouthWestBitmaps[19]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_B8H2; //D6
      northEast2SouthWestBitmaps[20]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_C8H3; //E6
      northEast2SouthWestBitmaps[21]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_D8H4; //F6
      northEast2SouthWestBitmaps[22]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_E8H5; //G6
      northEast2SouthWestBitmaps[23]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_F8H6; //H6
      northEast2SouthWestBitmaps[24]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A5E1; //A5
      northEast2SouthWestBitmaps[25]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A6F1; //B5
      northEast2SouthWestBitmaps[26]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A7G1; //C5
      northEast2SouthWestBitmaps[27]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A8H1; //D5
      northEast2SouthWestBitmaps[28]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_B8H2; //E5
      northEast2SouthWestBitmaps[29]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_C8H3; //F5
      northEast2SouthWestBitmaps[30]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_D8H4; //G5
      northEast2SouthWestBitmaps[31]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_E8H5; //H5
      northEast2SouthWestBitmaps[32]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A4D1; //A4
      northEast2SouthWestBitmaps[33]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A5E1; //B4
      northEast2SouthWestBitmaps[34]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A6F1; //C4
      northEast2SouthWestBitmaps[35]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A7G1; //D4
      northEast2SouthWestBitmaps[36]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A8H1; //E4
      northEast2SouthWestBitmaps[37]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_B8H2; //F4
      northEast2SouthWestBitmaps[38]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_C8H3; //G4
      northEast2SouthWestBitmaps[39]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_D8H4; //H4
      northEast2SouthWestBitmaps[40]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A3C1; //A3
      northEast2SouthWestBitmaps[41]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A4D1; //B3
      northEast2SouthWestBitmaps[42]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A5E1; //C3
      northEast2SouthWestBitmaps[43]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A6F1; //D3
      northEast2SouthWestBitmaps[44]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A7G1; //E3
      northEast2SouthWestBitmaps[45]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A8H1; //F3
      northEast2SouthWestBitmaps[46]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_B8H2; //G3
      northEast2SouthWestBitmaps[47]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_C8H3; //H3
      northEast2SouthWestBitmaps[48]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A2B1; //A2
      northEast2SouthWestBitmaps[49]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A3C1; //B2
      northEast2SouthWestBitmaps[50]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A4D1; //C2
      northEast2SouthWestBitmaps[51]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A5E1; //D2
      northEast2SouthWestBitmaps[52]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A6F1; //E2
      northEast2SouthWestBitmaps[53]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A7G1; //F2
      northEast2SouthWestBitmaps[54]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A8H1; //G2
      northEast2SouthWestBitmaps[55]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_B8H2; //H2
      northEast2SouthWestBitmaps[56]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A1A1; //A1
      northEast2SouthWestBitmaps[57]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A2B1; //B1
      northEast2SouthWestBitmaps[58]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A3C1; //C1
      northEast2SouthWestBitmaps[59]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A4D1; //D1
      northEast2SouthWestBitmaps[60]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A5E1; //E1
      northEast2SouthWestBitmaps[61]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A6F1; //F1
      northEast2SouthWestBitmaps[62]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A7G1; //G1
      northEast2SouthWestBitmaps[63]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A8H1; //H1

      southWest2NorthEastBitmaps[0]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A8H1; //A8
      southWest2NorthEastBitmaps[1]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_B8H2; //B8
      southWest2NorthEastBitmaps[2]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_C8H3; //C8
      southWest2NorthEastBitmaps[3]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_D8H4; //D8
      southWest2NorthEastBitmaps[4]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_E8H5; //E8
      southWest2NorthEastBitmaps[5]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_F8H6; //F8
      southWest2NorthEastBitmaps[6]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_G8H7; //G8
      southWest2NorthEastBitmaps[7]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_H8H8; //H8
      southWest2NorthEastBitmaps[8]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A7G1; //A7
      southWest2NorthEastBitmaps[9]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A8H1; //B7
      southWest2NorthEastBitmaps[10]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_B8H2; //C7
      southWest2NorthEastBitmaps[11]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_C8H3; //D7
      southWest2NorthEastBitmaps[12]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_D8H4; //E7
      southWest2NorthEastBitmaps[13]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_E8H5; //F7
      southWest2NorthEastBitmaps[14]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_F8H6; //G7
      southWest2NorthEastBitmaps[15]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_G8H7; //H7
      southWest2NorthEastBitmaps[16]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A6F1; //A6
      southWest2NorthEastBitmaps[17]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A7G1; //B6
      southWest2NorthEastBitmaps[18]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A8H1; //C6
      southWest2NorthEastBitmaps[19]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_B8H2; //D6
      southWest2NorthEastBitmaps[20]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_C8H3; //E6
      southWest2NorthEastBitmaps[21]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_D8H4; //F6
      southWest2NorthEastBitmaps[22]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_E8H5; //G6
      southWest2NorthEastBitmaps[23]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_F8H6; //H6
      southWest2NorthEastBitmaps[24]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A5E1; //A5
      southWest2NorthEastBitmaps[25]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A6F1; //B5
      southWest2NorthEastBitmaps[26]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A7G1; //C5
      southWest2NorthEastBitmaps[27]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A8H1; //D5
      southWest2NorthEastBitmaps[28]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_B8H2; //E5
      southWest2NorthEastBitmaps[29]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_C8H3; //F5
      southWest2NorthEastBitmaps[30]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_D8H4; //G5
      southWest2NorthEastBitmaps[31]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_E8H5; //H5
      southWest2NorthEastBitmaps[32]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A4D1; //A4
      southWest2NorthEastBitmaps[33]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A5E1; //B4
      southWest2NorthEastBitmaps[34]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A6F1; //C4
      southWest2NorthEastBitmaps[35]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A7G1; //D4
      southWest2NorthEastBitmaps[36]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A8H1; //E4
      southWest2NorthEastBitmaps[37]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_B8H2; //F4
      southWest2NorthEastBitmaps[38]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_C8H3; //G4
      southWest2NorthEastBitmaps[39]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_D8H4; //H4
      southWest2NorthEastBitmaps[40]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A3C1; //A3
      southWest2NorthEastBitmaps[41]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A4D1; //B3
      southWest2NorthEastBitmaps[42]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A5E1; //C3
      southWest2NorthEastBitmaps[43]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A6F1; //D3
      southWest2NorthEastBitmaps[44]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A7G1; //E3
      southWest2NorthEastBitmaps[45]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A8H1; //F3
      southWest2NorthEastBitmaps[46]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_B8H2; //G3
      southWest2NorthEastBitmaps[47]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_C8H3; //H3
      southWest2NorthEastBitmaps[48]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A2B1; //A2
      southWest2NorthEastBitmaps[49]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A3C1; //B2
      southWest2NorthEastBitmaps[50]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A4D1; //C2
      southWest2NorthEastBitmaps[51]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A5E1; //D2
      southWest2NorthEastBitmaps[52]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A6F1; //E2
      southWest2NorthEastBitmaps[53]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A7G1; //F2
      southWest2NorthEastBitmaps[54]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A8H1; //G2
      southWest2NorthEastBitmaps[55]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_B8H2; //H2
      southWest2NorthEastBitmaps[56]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A1A1; //A1
      southWest2NorthEastBitmaps[57]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A2B1; //B1
      southWest2NorthEastBitmaps[58]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A3C1; //C1
      southWest2NorthEastBitmaps[59]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A4D1; //D1
      southWest2NorthEastBitmaps[60]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A5E1; //E1
      southWest2NorthEastBitmaps[61]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A6F1; //F1
      southWest2NorthEastBitmaps[62]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A7G1; //G1
      southWest2NorthEastBitmaps[63]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A8H1; //H1
      
      southEast2NorthWestBitmaps[0]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A8A8; //A8
      southEast2NorthWestBitmaps[1]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A7B8; //B8
      southEast2NorthWestBitmaps[2]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A6C8; //C8
      southEast2NorthWestBitmaps[3]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A5D8; //D8
      southEast2NorthWestBitmaps[4]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A4E8; //E8
      southEast2NorthWestBitmaps[5]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A3F8; //F8
      southEast2NorthWestBitmaps[6]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A2G8; //G8
      southEast2NorthWestBitmaps[7]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A1H8; //H8
      southEast2NorthWestBitmaps[8]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A7B8; //A7
      southEast2NorthWestBitmaps[9]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A6C8; //B7
      southEast2NorthWestBitmaps[10]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A5D8; //C7
      southEast2NorthWestBitmaps[11]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A4E8; //D7
      southEast2NorthWestBitmaps[12]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A3F8; //E7
      southEast2NorthWestBitmaps[13]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A2G8; //F7
      southEast2NorthWestBitmaps[14]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A1H8; //G7
      southEast2NorthWestBitmaps[15]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_B1H7; //H7
      southEast2NorthWestBitmaps[16]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A6C8; //A6
      southEast2NorthWestBitmaps[17]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A5D8; //B6
      southEast2NorthWestBitmaps[18]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A4E8; //C6
      southEast2NorthWestBitmaps[19]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A3F8; //D6
      southEast2NorthWestBitmaps[20]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A2G8; //E6
      southEast2NorthWestBitmaps[21]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A1H8; //F6
      southEast2NorthWestBitmaps[22]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_B1H7; //G6
      southEast2NorthWestBitmaps[23]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_C1H6; //H6
      southEast2NorthWestBitmaps[24]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A5D8; //A5
      southEast2NorthWestBitmaps[25]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A4E8; //B5
      southEast2NorthWestBitmaps[26]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A3F8; //C5
      southEast2NorthWestBitmaps[27]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A2G8; //D5
      southEast2NorthWestBitmaps[28]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A1H8; //E5
      southEast2NorthWestBitmaps[29]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_B1H7; //F5
      southEast2NorthWestBitmaps[30]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_C1H6; //G5
      southEast2NorthWestBitmaps[31]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_D1H5; //H5
      southEast2NorthWestBitmaps[32]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A4E8; //A4
      southEast2NorthWestBitmaps[33]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A3F8; //B4
      southEast2NorthWestBitmaps[34]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A2G8; //C4
      southEast2NorthWestBitmaps[35]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A1H8; //D4
      southEast2NorthWestBitmaps[36]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_B1H7; //E4
      southEast2NorthWestBitmaps[37]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_C1H6; //F4
      southEast2NorthWestBitmaps[38]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_D1H5; //G4
      southEast2NorthWestBitmaps[39]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_E1H4; //H4
      southEast2NorthWestBitmaps[40]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A3F8; //A3
      southEast2NorthWestBitmaps[41]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A2G8; //B3
      southEast2NorthWestBitmaps[42]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A1H8; //C3
      southEast2NorthWestBitmaps[43]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_B1H7; //D3
      southEast2NorthWestBitmaps[44]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_C1H6; //E3
      southEast2NorthWestBitmaps[45]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_D1H5; //F3
      southEast2NorthWestBitmaps[46]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_E1H4; //G3
      southEast2NorthWestBitmaps[47]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_F1H3; //H3
      southEast2NorthWestBitmaps[48]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A2G8; //A2
      southEast2NorthWestBitmaps[49]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A1H8; //B2
      southEast2NorthWestBitmaps[50]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_B1H7; //C2
      southEast2NorthWestBitmaps[51]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_C1H6; //D2
      southEast2NorthWestBitmaps[52]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_D1H5; //E2
      southEast2NorthWestBitmaps[53]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_E1H4; //F2
      southEast2NorthWestBitmaps[54]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_F1H3; //G2
      southEast2NorthWestBitmaps[55]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_G1H2; //H2
      southEast2NorthWestBitmaps[56]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A1H8; //A1
      southEast2NorthWestBitmaps[57]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_B1H7; //B1
      southEast2NorthWestBitmaps[58]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_C1H6; //C1
      southEast2NorthWestBitmaps[59]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_D1H5; //D1
      southEast2NorthWestBitmaps[60]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_E1H4; //E1
      southEast2NorthWestBitmaps[61]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_F1H3; //F1
      southEast2NorthWestBitmaps[62]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_G1H2; //G1
      southEast2NorthWestBitmaps[63]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_H1H1; //H1
      
   }
}