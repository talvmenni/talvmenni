package org.forritan.talvmenni.bitboard.paths;

import junit.framework.Assert;
import junit.framework.TestCase;


public class KingTest extends TestCase {

   private final String[] zeroPrefix = new String[64];

   public KingTest() {
      for (int i= 0, j= 64; i < zeroPrefix.length; i++, j--) {
         StringBuffer zeroes= new StringBuffer();
         for (int k= 1; k < j; k++) {
            zeroes.append('0');
         }
         zeroPrefix[i]= zeroes.toString();
      }
   }

   protected void setUp() throws Exception {
      super.setUp();
   }

   protected void tearDown() throws Exception {
      super.tearDown();
   }

   public void testKingPathsFromA1() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "11000000"
                  + // A2-H2
                  "01000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_A1)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_A1)));
   }

   public void testKingPathsFromB1() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "11100000"
                  + // A2-H2
                  "10100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_B1)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_B1)));
   }

   public void testKingPathsFromC1() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "01110000"
                  + // A2-H2
                  "01010000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_C1)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_C1)));
   }

   public void testKingPathsFromD1() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00111000"
                  + // A2-H2
                  "00101000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_D1)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_D1)));
   }

   public void testKingPathsFromE1() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00011100"
                  + // A2-H2
                  "00010100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_E1)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_E1)));
   }

   public void testKingPathsFromF1() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00001110"
                  + // A2-H2
                  "00001010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_F1)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_F1)));
   }

   public void testKingPathsFromG1() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000111"
                  + // A2-H2
                  "00000101", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_G1)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_G1)));
   }

   public void testKingPathsFromH1() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000011"
                  + // A2-H2
                  "00000010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_H1)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_H1)));
   }

   public void testKingPathsFromA2() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "11000000"
                  + // A3-H3
                  "01000000"
                  + // A2-H2
                  "11000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_A2)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_A2)));
   }

   public void testKingPathsFromB2() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "11100000"
                  + // A3-H3
                  "10100000"
                  + // A2-H2
                  "11100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_B2)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_B2)));
   }

   public void testKingPathsFromC2() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "01110000"
                  + // A3-H3
                  "01010000"
                  + // A2-H2
                  "01110000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_C2)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_C2)));
   }

   public void testKingPathsFromD2() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00111000"
                  + // A3-H3
                  "00101000"
                  + // A2-H2
                  "00111000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_D2)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_D2)));
   }

   public void testKingPathsFromE2() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00011100"
                  + // A3-H3
                  "00010100"
                  + // A2-H2
                  "00011100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_E2)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_E2)));
   }

   public void testKingPathsFromF2() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00001110"
                  + // A3-H3
                  "00001010"
                  + // A2-H2
                  "00001110", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_F2)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_F2)));
   }

   public void testKingPathsFromG2() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000111"
                  + // A3-H3
                  "00000101"
                  + // A2-H2
                  "00000111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_G2)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_G2)));
   }

   public void testKingPathsFromH2() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000011"
                  + // A3-H3
                  "00000010"
                  + // A2-H2
                  "00000011", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_H2)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_H2)));
   }

   public void testKingPathsFromA3() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "11000000"
                  + // A4-H4
                  "01000000"
                  + // A3-H3
                  "11000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_A3)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_A3)));
   }

   public void testKingPathsFromB3() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "11100000"
                  + // A4-H4
                  "10100000"
                  + // A3-H3
                  "11100000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_B3)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_B3)));
   }

   public void testKingPathsFromC3() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "01110000"
                  + // A4-H4
                  "01010000"
                  + // A3-H3
                  "01110000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_C3)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_C3)));
   }

   public void testKingPathsFromD3() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00111000"
                  + // A4-H4
                  "00101000"
                  + // A3-H3
                  "00111000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_D3)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_D3)));
   }

   public void testKingPathsFromE3() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00011100"
                  + // A4-H4
                  "00010100"
                  + // A3-H3
                  "00011100"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_E3)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_E3)));
   }

   public void testKingPathsFromF3() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00001110"
                  + // A4-H4
                  "00001010"
                  + // A3-H3
                  "00001110"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_F3)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_F3)));
   }

   public void testKingPathsFromG3() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000111"
                  + // A4-H4
                  "00000101"
                  + // A3-H3
                  "00000111"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_G3)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_G3)));
   }

   public void testKingPathsFromH3() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000011"
                  + // A4-H4
                  "00000010"
                  + // A3-H3
                  "00000011"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_H3)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_H3)));
   }

   public void testKingPathsFromA4() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "11000000"
                  + // A5-H5
                  "01000000"
                  + // A4-H4
                  "11000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_A4)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_A4)));
   }

   public void testKingPathsFromB4() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "11100000"
                  + // A5-H5
                  "10100000"
                  + // A4-H4
                  "11100000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_B4)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_B4)));
   }

   public void testKingPathsFromC4() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "01110000"
                  + // A5-H5
                  "01010000"
                  + // A4-H4
                  "01110000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_C4)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_C4)));
   }

   public void testKingPathsFromD4() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00111000"
                  + // A5-H5
                  "00101000"
                  + // A4-H4
                  "00111000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_D4)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_D4)));
   }

   public void testKingPathsFromE4() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00011100"
                  + // A5-H5
                  "00010100"
                  + // A4-H4
                  "00011100"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_E4)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_E4)));
   }

   public void testKingPathsFromF4() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00001110"
                  + // A5-H5
                  "00001010"
                  + // A4-H4
                  "00001110"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_F4)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_F4)));
   }

   public void testKingPathsFromG4() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000111"
                  + // A5-H5
                  "00000101"
                  + // A4-H4
                  "00000111"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_G4)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_G4)));
   }

   public void testKingPathsFromH4() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000011"
                  + // A5-H5
                  "00000010"
                  + // A4-H4
                  "00000011"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_H4)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_H4)));
   }

   public void testKingPathsFromA5() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "11000000"
                  + // A6-H6
                  "01000000"
                  + // A5-H5
                  "11000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_A5)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_A5)));
   }

   public void testKingPathsFromB5() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "11100000"
                  + // A6-H6
                  "10100000"
                  + // A5-H5
                  "11100000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_B5)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_B5)));
   }

   public void testKingPathsFromC5() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "01110000"
                  + // A6-H6
                  "01010000"
                  + // A5-H5
                  "01110000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_C5)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_C5)));
   }

   public void testKingPathsFromD5() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00111000"
                  + // A6-H6
                  "00101000"
                  + // A5-H5
                  "00111000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_D5)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_D5)));
   }

   public void testKingPathsFromE5() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00011100"
                  + // A6-H6
                  "00010100"
                  + // A5-H5
                  "00011100"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_E5)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_E5)));
   }

   public void testKingPathsFromF5() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00001110"
                  + // A6-H6
                  "00001010"
                  + // A5-H5
                  "00001110"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_F5)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_F5)));
   }

   public void testKingPathsFromG5() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000111"
                  + // A6-H6
                  "00000101"
                  + // A5-H5
                  "00000111"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_G5)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_G5)));
   }

   public void testKingPathsFromH5() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000011"
                  + // A6-H6
                  "00000010"
                  + // A5-H5
                  "00000011"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_H5)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_H5)));
   }

   public void testKingPathsFromA6() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "11000000"
                  + // A7-H7
                  "01000000"
                  + // A6-H6
                  "11000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_A6)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_A6)));
   }

   public void testKingPathsFromB6() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "11100000"
                  + // A7-H7
                  "10100000"
                  + // A6-H6
                  "11100000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_B6)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_B6)));
   }

   public void testKingPathsFromC6() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "01110000"
                  + // A7-H7
                  "01010000"
                  + // A6-H6
                  "01110000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_C6)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_C6)));
   }

   public void testKingPathsFromD6() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00111000"
                  + // A7-H7
                  "00101000"
                  + // A6-H6
                  "00111000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_D6)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_D6)));
   }

   public void testKingPathsFromE6() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00011100"
                  + // A7-H7
                  "00010100"
                  + // A6-H6
                  "00011100"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_E6)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_E6)));
   }

   public void testKingPathsFromF6() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00001110"
                  + // A7-H7
                  "00001010"
                  + // A6-H6
                  "00001110"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_F6)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_F6)));
   }

   public void testKingPathsFromG6() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000111"
                  + // A7-H7
                  "00000101"
                  + // A6-H6
                  "00000111"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_G6)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_G6)));
   }

   public void testKingPathsFromH6() {
      Assert
            .assertEquals(""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000011"
                  + // A7-H7
                  "00000010"
                  + // A6-H6
                  "00000011"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_H6)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_H6)));
   }

   public void testKingPathsFromA7() {
      Assert
            .assertEquals(""
                  + //
                  "11000000"
                  + // A8-H8
                  "01000000"
                  + // A7-H7
                  "11000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_A7)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_A7)));
   }

   public void testKingPathsFromB7() {
      Assert
            .assertEquals(""
                  + //
                  "11100000"
                  + // A8-H8
                  "10100000"
                  + // A7-H7
                  "11100000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_B7)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_B7)));
   }

   public void testKingPathsFromC7() {
      Assert
            .assertEquals(""
                  + //
                  "01110000"
                  + // A8-H8
                  "01010000"
                  + // A7-H7
                  "01110000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_C7)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_C7)));
   }

   public void testKingPathsFromD7() {
      Assert
            .assertEquals(""
                  + //
                  "00111000"
                  + // A8-H8
                  "00101000"
                  + // A7-H7
                  "00111000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_D7)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_D7)));
   }

   public void testKingPathsFromE7() {
      Assert
            .assertEquals(""
                  + //
                  "00011100"
                  + // A8-H8
                  "00010100"
                  + // A7-H7
                  "00011100"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_E7)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_E7)));
   }

   public void testKingPathsFromF7() {
      Assert
            .assertEquals(""
                  + //
                  "00001110"
                  + // A8-H8
                  "00001010"
                  + // A7-H7
                  "00001110"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_F7)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_F7)));
   }

   public void testKingPathsFromG7() {
      Assert
            .assertEquals(""
                  + //
                  "00000111"
                  + // A8-H8
                  "00000101"
                  + // A7-H7
                  "00000111"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_G7)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_G7)));
   }

   public void testKingPathsFromH7() {
      Assert
            .assertEquals(""
                  + //
                  "00000011"
                  + // A8-H8
                  "00000010"
                  + // A7-H7
                  "00000011"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_H7)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_H7)));
   }

   public void testKingPathsFromA8() {
      Assert
            .assertEquals(""
                  + // 
                  "01000000"
                  + // A8-H8
                  "11000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_A8)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_A8)));
   }

   public void testKingPathsFromB8() {
      Assert
            .assertEquals(""
                  + //
                  "10100000"
                  + // A8-H8
                  "11100000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_B8)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_B8)));
   }

   public void testKingPathsFromC8() {
      Assert
            .assertEquals(""
                  + //
                  "01010000"
                  + // A8-H8
                  "01110000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_C8)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_C8)));
   }

   public void testKingPathsFromD8() {
      Assert
            .assertEquals(""
                  + //
                  "00101000"
                  + // A8-H8
                  "00111000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_D8)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_D8)));
   }

   public void testKingPathsFromE8() {
      Assert
            .assertEquals(""
                  + //
                  "00010100"
                  + // A8-H8
                  "00011100"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_E8)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_E8)));
   }

   public void testKingPathsFromF8() {
      Assert
            .assertEquals(""
                  + //
                  "00001010"
                  + // A8-H8
                  "00001110"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_F8)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_F8)));
   }

   public void testKingPathsFromG8() {
      Assert
            .assertEquals(""
                  + //
                  "00000101"
                  + // A8-H8
                  "00000111"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_G8)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_G8)));
   }

   public void testKingPathsFromH8() {
      Assert
            .assertEquals(""
                  + //
                  "00000010"
                  + // A8-H8
                  "00000011"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(King._PATHS_FROM_H8)
                        .length() - 1] + Long
                        .toBinaryString(King._PATHS_FROM_H8)));
   }

}