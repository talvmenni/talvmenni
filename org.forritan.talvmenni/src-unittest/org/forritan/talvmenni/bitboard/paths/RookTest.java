/*
 * Created on 04-04-2004
 * 
 * TODO To change the template for this generated file go to Window -
 * Preferences - Java - Code Generation - Code and Comments
 */
package org.forritan.talvmenni.bitboard.paths;

import junit.framework.Assert;
import junit.framework.TestCase;


public class RookTest extends TestCase {
   private final String[] zeroPrefix = new String[64];

   public RookTest() {
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

   public void testRookPathsFromA1() {
      Assert
            .assertEquals("" + //
                  "10000000" + // A8-H8
                  "10000000" + // A7-H7
                  "10000000" + // A6-H6
                  "10000000" + // A5-H5
                  "10000000" + // A4-H4
                  "10000000" + // A3-H3
                  "10000000" + // A2-H2
                  "01111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_A1)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_A1)));
   }

   public void testRookPathsFromB1() {
      Assert
            .assertEquals("" + //
                  "01000000" + // A8-H8
                  "01000000" + // A7-H7
                  "01000000" + // A6-H6
                  "01000000" + // A5-H5
                  "01000000" + // A4-H4
                  "01000000" + // A3-H3
                  "01000000" + // A2-H2
                  "10111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_B1)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_B1)));
   }

   public void testRookPathsFromC1() {
      Assert
            .assertEquals("" + //
                  "00100000" + // A8-H8
                  "00100000" + // A7-H7
                  "00100000" + // A6-H6
                  "00100000" + // A5-H5
                  "00100000" + // A4-H4
                  "00100000" + // A3-H3
                  "00100000" + // A2-H2
                  "11011111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_C1)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_C1)));
   }

   public void testRookPathsFromD1() {
      Assert
            .assertEquals("" + //
                  "00010000" + // A8-H8
                  "00010000" + // A7-H7
                  "00010000" + // A6-H6
                  "00010000" + // A5-H5
                  "00010000" + // A4-H4
                  "00010000" + // A3-H3
                  "00010000" + // A2-H2
                  "11101111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_D1)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_D1)));
   }

   public void testRookPathsFromE1() {
      Assert
            .assertEquals("" + //
                  "00001000" + // A8-H8
                  "00001000" + // A7-H7
                  "00001000" + // A6-H6
                  "00001000" + // A5-H5
                  "00001000" + // A4-H4
                  "00001000" + // A3-H3
                  "00001000" + // A2-H2
                  "11110111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_E1)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_E1)));
   }

   public void testRookPathsFromF1() {
      Assert
            .assertEquals("" + //
                  "00000100" + // A8-H8
                  "00000100" + // A7-H7
                  "00000100" + // A6-H6
                  "00000100" + // A5-H5
                  "00000100" + // A4-H4
                  "00000100" + // A3-H3
                  "00000100" + // A2-H2
                  "11111011", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_F1)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_F1)));
   }

   public void testRookPathsFromG1() {
      Assert
            .assertEquals("" + //
                  "00000010" + // A8-H8
                  "00000010" + // A7-H7
                  "00000010" + // A6-H6
                  "00000010" + // A5-H5
                  "00000010" + // A4-H4
                  "00000010" + // A3-H3
                  "00000010" + // A2-H2
                  "11111101", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_G1)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_G1)));
   }

   public void testRookPathsFromH1() {
      Assert
            .assertEquals("" + //
                  "00000001" + // A8-H8
                  "00000001" + // A7-H7
                  "00000001" + // A6-H6
                  "00000001" + // A5-H5
                  "00000001" + // A4-H4
                  "00000001" + // A3-H3
                  "00000001" + // A2-H2
                  "11111110", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_H1)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_H1)));
   }

   public void testRookPathsFromA2() {
      Assert
            .assertEquals("" + //
                  "10000000" + // A8-H8
                  "10000000" + // A7-H7
                  "10000000" + // A6-H6
                  "10000000" + // A5-H5
                  "10000000" + // A4-H4
                  "10000000" + // A3-H3
                  "01111111" + // A2-H2
                  "10000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_A2)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_A2)));
   }

   public void testRookPathsFromB2() {
      Assert
            .assertEquals("" + //
                  "01000000" + // A8-H8
                  "01000000" + // A7-H7
                  "01000000" + // A6-H6
                  "01000000" + // A5-H5
                  "01000000" + // A4-H4
                  "01000000" + // A3-H3
                  "10111111" + // A2-H2
                  "01000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_B2)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_B2)));
   }

   public void testRookPathsFromC2() {
      Assert
            .assertEquals("" + //
                  "00100000" + // A8-H8
                  "00100000" + // A7-H7
                  "00100000" + // A6-H6
                  "00100000" + // A5-H5
                  "00100000" + // A4-H4
                  "00100000" + // A3-H3
                  "11011111" + // A2-H2
                  "00100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_C2)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_C2)));
   }

   public void testRookPathsFromD2() {
      Assert
            .assertEquals("" + //
                  "00010000" + // A8-H8
                  "00010000" + // A7-H7
                  "00010000" + // A6-H6
                  "00010000" + // A5-H5
                  "00010000" + // A4-H4
                  "00010000" + // A3-H3
                  "11101111" + // A2-H2
                  "00010000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_D2)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_D2)));
   }

   public void testRookPathsFromE2() {
      Assert
            .assertEquals("" + //
                  "00001000" + // A8-H8
                  "00001000" + // A7-H7
                  "00001000" + // A6-H6
                  "00001000" + // A5-H5
                  "00001000" + // A4-H4
                  "00001000" + // A3-H3
                  "11110111" + // A2-H2
                  "00001000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_E2)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_E2)));
   }

   public void testRookPathsFromF2() {
      Assert
            .assertEquals("" + //
                  "00000100" + // A8-H8
                  "00000100" + // A7-H7
                  "00000100" + // A6-H6
                  "00000100" + // A5-H5
                  "00000100" + // A4-H4
                  "00000100" + // A3-H3
                  "11111011" + // A2-H2
                  "00000100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_F2)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_F2)));
   }

   public void testRookPathsFromG2() {
      Assert
            .assertEquals("" + //
                  "00000010" + // A8-H8
                  "00000010" + // A7-H7
                  "00000010" + // A6-H6
                  "00000010" + // A5-H5
                  "00000010" + // A4-H4
                  "00000010" + // A3-H3
                  "11111101" + // A2-H2
                  "00000010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_G2)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_G2)));
   }

   public void testRookPathsFromH2() {
      Assert
            .assertEquals("" + //
                  "00000001" + // A8-H8
                  "00000001" + // A7-H7
                  "00000001" + // A6-H6
                  "00000001" + // A5-H5
                  "00000001" + // A4-H4
                  "00000001" + // A3-H3
                  "11111110" + // A2-H2
                  "00000001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_H2)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_H2)));
   }

   public void testRookPathsFromA3() {
      Assert
            .assertEquals("" + //
                  "10000000" + // A8-H8
                  "10000000" + // A7-H7
                  "10000000" + // A6-H6
                  "10000000" + // A5-H5
                  "10000000" + // A4-H4
                  "01111111" + // A3-H3
                  "10000000" + // A2-H2
                  "10000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_A3)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_A3)));
   }

   public void testRookPathsFromB3() {
      Assert
            .assertEquals("" + //
                  "01000000" + // A8-H8
                  "01000000" + // A7-H7
                  "01000000" + // A6-H6
                  "01000000" + // A5-H5
                  "01000000" + // A4-H4
                  "10111111" + // A3-H3
                  "01000000" + // A2-H2
                  "01000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_B3)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_B3)));
   }

   public void testRookPathsFromC3() {
      Assert
            .assertEquals("" + //
                  "00100000" + // A8-H8
                  "00100000" + // A7-H7
                  "00100000" + // A6-H6
                  "00100000" + // A5-H5
                  "00100000" + // A4-H4
                  "11011111" + // A3-H3
                  "00100000" + // A2-H2
                  "00100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_C3)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_C3)));
   }

   public void testRookPathsFromD3() {
      Assert
            .assertEquals("" + //
                  "00010000" + // A8-H8
                  "00010000" + // A7-H7
                  "00010000" + // A6-H6
                  "00010000" + // A5-H5
                  "00010000" + // A4-H4
                  "11101111" + // A3-H3
                  "00010000" + // A2-H2
                  "00010000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_D3)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_D3)));
   }

   public void testRookPathsFromE3() {
      Assert
            .assertEquals("" + //
                  "00001000" + // A8-H8
                  "00001000" + // A7-H7
                  "00001000" + // A6-H6
                  "00001000" + // A5-H5
                  "00001000" + // A4-H4
                  "11110111" + // A3-H3
                  "00001000" + // A2-H2
                  "00001000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_E3)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_E3)));
   }

   public void testRookPathsFromF3() {
      Assert
            .assertEquals("" + //
                  "00000100" + // A8-H8
                  "00000100" + // A7-H7
                  "00000100" + // A6-H6
                  "00000100" + // A5-H5
                  "00000100" + // A4-H4
                  "11111011" + // A3-H3
                  "00000100" + // A2-H2
                  "00000100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_F3)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_F3)));
   }

   public void testRookPathsFromG3() {
      Assert
            .assertEquals("" + //
                  "00000010" + // A8-H8
                  "00000010" + // A7-H7
                  "00000010" + // A6-H6
                  "00000010" + // A5-H5
                  "00000010" + // A4-H4
                  "11111101" + // A3-H3
                  "00000010" + // A2-H2
                  "00000010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_G3)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_G3)));
   }

   public void testRookPathsFromH3() {
      Assert
            .assertEquals("" + //
                  "00000001" + // A8-H8
                  "00000001" + // A7-H7
                  "00000001" + // A6-H6
                  "00000001" + // A5-H5
                  "00000001" + // A4-H4
                  "11111110" + // A3-H3
                  "00000001" + // A2-H2
                  "00000001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_H3)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_H3)));
   }

   public void testRookPathsFromA4() {
      Assert
            .assertEquals("" + //
                  "10000000" + // A8-H8
                  "10000000" + // A7-H7
                  "10000000" + // A6-H6
                  "10000000" + // A5-H5
                  "01111111" + // A4-H4
                  "10000000" + // A3-H3
                  "10000000" + // A2-H2
                  "10000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_A4)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_A4)));
   }

   public void testRookPathsFromB4() {
      Assert
            .assertEquals("" + //
                  "01000000" + // A8-H8
                  "01000000" + // A7-H7
                  "01000000" + // A6-H6
                  "01000000" + // A5-H5
                  "10111111" + // A4-H4
                  "01000000" + // A3-H3
                  "01000000" + // A2-H2
                  "01000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_B4)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_B4)));
   }

   public void testRookPathsFromC4() {
      Assert
            .assertEquals("" + //
                  "00100000" + // A8-H8
                  "00100000" + // A7-H7
                  "00100000" + // A6-H6
                  "00100000" + // A5-H5
                  "11011111" + // A4-H4
                  "00100000" + // A3-H3
                  "00100000" + // A2-H2
                  "00100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_C4)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_C4)));
   }

   public void testRookPathsFromD4() {
      Assert
            .assertEquals("" + //
                  "00010000" + // A8-H8
                  "00010000" + // A7-H7
                  "00010000" + // A6-H6
                  "00010000" + // A5-H5
                  "11101111" + // A4-H4
                  "00010000" + // A3-H3
                  "00010000" + // A2-H2
                  "00010000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_D4)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_D4)));
   }

   public void testRookPathsFromE4() {
      Assert
            .assertEquals("" + //
                  "00001000" + // A8-H8
                  "00001000" + // A7-H7
                  "00001000" + // A6-H6
                  "00001000" + // A5-H5
                  "11110111" + // A4-H4
                  "00001000" + // A3-H3
                  "00001000" + // A2-H2
                  "00001000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_E4)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_E4)));
   }

   public void testRookPathsFromF4() {
      Assert
            .assertEquals("" + //
                  "00000100" + // A8-H8
                  "00000100" + // A7-H7
                  "00000100" + // A6-H6
                  "00000100" + // A5-H5
                  "11111011" + // A4-H4
                  "00000100" + // A3-H3
                  "00000100" + // A2-H2
                  "00000100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_F4)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_F4)));
   }

   public void testRookPathsFromG4() {
      Assert
            .assertEquals("" + //
                  "00000010" + // A8-H8
                  "00000010" + // A7-H7
                  "00000010" + // A6-H6
                  "00000010" + // A5-H5
                  "11111101" + // A4-H4
                  "00000010" + // A3-H3
                  "00000010" + // A2-H2
                  "00000010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_G4)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_G4)));
   }

   public void testRookPathsFromH4() {
      Assert
            .assertEquals("" + //
                  "00000001" + // A8-H8
                  "00000001" + // A7-H7
                  "00000001" + // A6-H6
                  "00000001" + // A5-H5
                  "11111110" + // A4-H4
                  "00000001" + // A3-H3
                  "00000001" + // A2-H2
                  "00000001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_H4)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_H4)));
   }

   public void testRookPathsFromA5() {
      Assert
            .assertEquals("" + //
                  "10000000" + // A8-H8
                  "10000000" + // A7-H7
                  "10000000" + // A6-H6
                  "01111111" + // A5-H5
                  "10000000" + // A4-H4
                  "10000000" + // A3-H3
                  "10000000" + // A2-H2
                  "10000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_A5)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_A5)));
   }

   public void testRookPathsFromB5() {
      Assert
            .assertEquals("" + //
                  "01000000" + // A8-H8
                  "01000000" + // A7-H7
                  "01000000" + // A6-H6
                  "10111111" + // A5-H5
                  "01000000" + // A4-H4
                  "01000000" + // A3-H3
                  "01000000" + // A2-H2
                  "01000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_B5)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_B5)));
   }

   public void testRookPathsFromC5() {
      Assert
            .assertEquals("" + //
                  "00100000" + // A8-H8
                  "00100000" + // A7-H7
                  "00100000" + // A6-H6
                  "11011111" + // A5-H5
                  "00100000" + // A4-H4
                  "00100000" + // A3-H3
                  "00100000" + // A2-H2
                  "00100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_C5)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_C5)));
   }

   public void testRookPathsFromD5() {
      Assert
            .assertEquals("" + //
                  "00010000" + // A8-H8
                  "00010000" + // A7-H7
                  "00010000" + // A6-H6
                  "11101111" + // A5-H5
                  "00010000" + // A4-H4
                  "00010000" + // A3-H3
                  "00010000" + // A2-H2
                  "00010000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_D5)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_D5)));
   }

   public void testRookPathsFromE5() {
      Assert
            .assertEquals("" + //
                  "00001000" + // A8-H8
                  "00001000" + // A7-H7
                  "00001000" + // A6-H6
                  "11110111" + // A5-H5
                  "00001000" + // A4-H4
                  "00001000" + // A3-H3
                  "00001000" + // A2-H2
                  "00001000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_E5)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_E5)));
   }

   public void testRookPathsFromF5() {
      Assert
            .assertEquals("" + //
                  "00000100" + // A8-H8
                  "00000100" + // A7-H7
                  "00000100" + // A6-H6
                  "11111011" + // A5-H5
                  "00000100" + // A4-H4
                  "00000100" + // A3-H3
                  "00000100" + // A2-H2
                  "00000100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_F5)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_F5)));
   }

   public void testRookPathsFromG5() {
      Assert
            .assertEquals("" + //
                  "00000010" + // A8-H8
                  "00000010" + // A7-H7
                  "00000010" + // A6-H6
                  "11111101" + // A5-H5
                  "00000010" + // A4-H4
                  "00000010" + // A3-H3
                  "00000010" + // A2-H2
                  "00000010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_G5)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_G5)));
   }

   public void testRookPathsFromH5() {
      Assert
            .assertEquals("" + //
                  "00000001" + // A8-H8
                  "00000001" + // A7-H7
                  "00000001" + // A6-H6
                  "11111110" + // A5-H5
                  "00000001" + // A4-H4
                  "00000001" + // A3-H3
                  "00000001" + // A2-H2
                  "00000001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_H5)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_H5)));
   }

   public void testRookPathsFromA6() {
      Assert
            .assertEquals("" + //
                  "10000000" + // A8-H8
                  "10000000" + // A7-H7
                  "01111111" + // A6-H6
                  "10000000" + // A5-H5
                  "10000000" + // A4-H4
                  "10000000" + // A3-H3
                  "10000000" + // A2-H2
                  "10000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_A6)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_A6)));
   }

   public void testRookPathsFromB6() {
      Assert
            .assertEquals("" + //
                  "01000000" + // A8-H8
                  "01000000" + // A7-H7
                  "10111111" + // A6-H6
                  "01000000" + // A5-H5
                  "01000000" + // A4-H4
                  "01000000" + // A3-H3
                  "01000000" + // A2-H2
                  "01000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_B6)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_B6)));
   }

   public void testRookPathsFromC6() {
      Assert
            .assertEquals("" + //
                  "00100000" + // A8-H8
                  "00100000" + // A7-H7
                  "11011111" + // A6-H6
                  "00100000" + // A5-H5
                  "00100000" + // A4-H4
                  "00100000" + // A3-H3
                  "00100000" + // A2-H2
                  "00100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_C6)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_C6)));
   }

   public void testRookPathsFromD6() {
      Assert
            .assertEquals("" + //
                  "00010000" + // A8-H8
                  "00010000" + // A7-H7
                  "11101111" + // A6-H6
                  "00010000" + // A5-H5
                  "00010000" + // A4-H4
                  "00010000" + // A3-H3
                  "00010000" + // A2-H2
                  "00010000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_D6)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_D6)));
   }

   public void testRookPathsFromE6() {
      Assert
            .assertEquals("" + //
                  "00001000" + // A8-H8
                  "00001000" + // A7-H7
                  "11110111" + // A6-H6
                  "00001000" + // A5-H5
                  "00001000" + // A4-H4
                  "00001000" + // A3-H3
                  "00001000" + // A2-H2
                  "00001000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_E6)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_E6)));
   }

   public void testRookPathsFromF6() {
      Assert
            .assertEquals("" + //
                  "00000100" + // A8-H8
                  "00000100" + // A7-H7
                  "11111011" + // A6-H6
                  "00000100" + // A5-H5
                  "00000100" + // A4-H4
                  "00000100" + // A3-H3
                  "00000100" + // A2-H2
                  "00000100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_F6)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_F6)));
   }

   public void testRookPathsFromG6() {
      Assert
            .assertEquals("" + //
                  "00000010" + // A8-H8
                  "00000010" + // A7-H7
                  "11111101" + // A6-H6
                  "00000010" + // A5-H5
                  "00000010" + // A4-H4
                  "00000010" + // A3-H3
                  "00000010" + // A2-H2
                  "00000010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_G6)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_G6)));
   }

   public void testRookPathsFromH6() {
      Assert
            .assertEquals("" + //
                  "00000001" + // A8-H8
                  "00000001" + // A7-H7
                  "11111110" + // A6-H6
                  "00000001" + // A5-H5
                  "00000001" + // A4-H4
                  "00000001" + // A3-H3
                  "00000001" + // A2-H2
                  "00000001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_H6)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_H6)));
   }

   public void testRookPathsFromA7() {
      Assert
            .assertEquals("" + //
                  "10000000" + // A8-H8
                  "01111111" + // A7-H7
                  "10000000" + // A6-H6
                  "10000000" + // A5-H5
                  "10000000" + // A4-H4
                  "10000000" + // A3-H3
                  "10000000" + // A2-H2
                  "10000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_A7)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_A7)));
   }

   public void testRookPathsFromB7() {
      Assert
            .assertEquals("" + //
                  "01000000" + // A8-H8
                  "10111111" + // A7-H7
                  "01000000" + // A6-H6
                  "01000000" + // A5-H5
                  "01000000" + // A4-H4
                  "01000000" + // A3-H3
                  "01000000" + // A2-H2
                  "01000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_B7)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_B7)));
   }

   public void testRookPathsFromC7() {
      Assert
            .assertEquals("" + //
                  "00100000" + // A8-H8
                  "11011111" + // A7-H7
                  "00100000" + // A6-H6
                  "00100000" + // A5-H5
                  "00100000" + // A4-H4
                  "00100000" + // A3-H3
                  "00100000" + // A2-H2
                  "00100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_C7)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_C7)));
   }

   public void testRookPathsFromD7() {
      Assert
            .assertEquals("" + //
                  "00010000" + // A8-H8
                  "11101111" + // A7-H7
                  "00010000" + // A6-H6
                  "00010000" + // A5-H5
                  "00010000" + // A4-H4
                  "00010000" + // A3-H3
                  "00010000" + // A2-H2
                  "00010000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_D7)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_D7)));
   }

   public void testRookPathsFromE7() {
      Assert
            .assertEquals("" + //
                  "00001000" + // A8-H8
                  "11110111" + // A7-H7
                  "00001000" + // A6-H6
                  "00001000" + // A5-H5
                  "00001000" + // A4-H4
                  "00001000" + // A3-H3
                  "00001000" + // A2-H2
                  "00001000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_E7)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_E7)));
   }

   public void testRookPathsFromF7() {
      Assert
            .assertEquals("" + //
                  "00000100" + // A8-H8
                  "11111011" + // A7-H7
                  "00000100" + // A6-H6
                  "00000100" + // A5-H5
                  "00000100" + // A4-H4
                  "00000100" + // A3-H3
                  "00000100" + // A2-H2
                  "00000100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_F7)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_F7)));
   }

   public void testRookPathsFromG7() {
      Assert
            .assertEquals("" + //
                  "00000010" + // A8-H8
                  "11111101" + // A7-H7
                  "00000010" + // A6-H6
                  "00000010" + // A5-H5
                  "00000010" + // A4-H4
                  "00000010" + // A3-H3
                  "00000010" + // A2-H2
                  "00000010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_G7)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_G7)));
   }

   public void testRookPathsFromH7() {
      Assert
            .assertEquals("" + //
                  "00000001" + // A8-H8
                  "11111110" + // A7-H7
                  "00000001" + // A6-H6
                  "00000001" + // A5-H5
                  "00000001" + // A4-H4
                  "00000001" + // A3-H3
                  "00000001" + // A2-H2
                  "00000001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_H7)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_H7)));
   }

   public void testRookPathsFromA8() {
      Assert
            .assertEquals("" + //
                  "01111111" + // A8-H8
                  "10000000" + // A7-H7
                  "10000000" + // A6-H6
                  "10000000" + // A5-H5
                  "10000000" + // A4-H4
                  "10000000" + // A3-H3
                  "10000000" + // A2-H2
                  "10000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_A8)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_A8)));
   }

   public void testRookPathsFromB8() {
      Assert
            .assertEquals("" + //
                  "10111111" + // A8-H8
                  "01000000" + // A7-H7
                  "01000000" + // A6-H6
                  "01000000" + // A5-H5
                  "01000000" + // A4-H4
                  "01000000" + // A3-H3
                  "01000000" + // A2-H2
                  "01000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_B8)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_B8)));
   }

   public void testRookPathsFromC8() {
      Assert
            .assertEquals("" + //
                  "11011111" + // A8-H8
                  "00100000" + // A7-H7
                  "00100000" + // A6-H6
                  "00100000" + // A5-H5
                  "00100000" + // A4-H4
                  "00100000" + // A3-H3
                  "00100000" + // A2-H2
                  "00100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_C8)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_C8)));
   }

   public void testRookPathsFromD8() {
      Assert
            .assertEquals("" + //
                  "11101111" + // A8-H8
                  "00010000" + // A7-H7
                  "00010000" + // A6-H6
                  "00010000" + // A5-H5
                  "00010000" + // A4-H4
                  "00010000" + // A3-H3
                  "00010000" + // A2-H2
                  "00010000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_D8)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_D8)));
   }

   public void testRookPathsFromE8() {
      Assert
            .assertEquals("" + //
                  "11110111" + // A8-H8
                  "00001000" + // A7-H7
                  "00001000" + // A6-H6
                  "00001000" + // A5-H5
                  "00001000" + // A4-H4
                  "00001000" + // A3-H3
                  "00001000" + // A2-H2
                  "00001000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_E8)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_E8)));
   }

   public void testRookPathsFromF8() {
      Assert
            .assertEquals("" + //
                  "11111011" + // A8-H8
                  "00000100" + // A7-H7
                  "00000100" + // A6-H6
                  "00000100" + // A5-H5
                  "00000100" + // A4-H4
                  "00000100" + // A3-H3
                  "00000100" + // A2-H2
                  "00000100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_F8)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_F8)));
   }

   public void testRookPathsFromG8() {
      Assert
            .assertEquals("" + //
                  "11111101" + // A8-H8
                  "00000010" + // A7-H7
                  "00000010" + // A6-H6
                  "00000010" + // A5-H5
                  "00000010" + // A4-H4
                  "00000010" + // A3-H3
                  "00000010" + // A2-H2
                  "00000010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_G8)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_G8)));
   }

   public void testRookPathsFromH8() {
      Assert
            .assertEquals("" + //
                  "11111110" + // A8-H8
                  "00000001" + // A7-H7
                  "00000001" + // A6-H6
                  "00000001" + // A5-H5
                  "00000001" + // A4-H4
                  "00000001" + // A3-H3
                  "00000001" + // A2-H2
                  "00000001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_H8)
                        .length() - 1] + Long
                        .toBinaryString(Rook._PATHS_FROM_H8)));
   }
}