package org.forritan.talvmenni.bitboard.paths;

import junit.framework.Assert;
import junit.framework.TestCase;


public class BishopTest extends TestCase {

   private final String[] zeroPrefix = new String[64];

   public BishopTest() {
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

   public void testBishopPathsFromA1() {
      Assert.assertEquals("00000001" + // A8-H8
            "00000010" + // A7-H7
            "00000100" + // A6-H6
            "00001000" + // A5-H5
            "00010000" + // A4-H4
            "00100000" + // A3-H3
            "01000000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_A1)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_A1)));
   }

   public void testBishopPathsFromB1() {
      Assert.assertEquals("00000000" + // A8-H8
            "00000001" + // A7-H7
            "00000010" + // A6-H6
            "00000100" + // A5-H5
            "00001000" + // A4-H4
            "00010000" + // A3-H3
            "10100000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_B1)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_B1)));
   }

   public void testBishopPathsFromC1() {
      Assert.assertEquals("00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000001" + // A6-H6
            "00000010" + // A5-H5
            "00000100" + // A4-H4
            "10001000" + // A3-H3
            "01010000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_C1)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_C1)));
   }

   public void testBishopPathsFromD1() {
      Assert.assertEquals("00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000001" + // A5-H5
            "10000010" + // A4-H4
            "01000100" + // A3-H3
            "00101000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_D1)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_D1)));
   }

   public void testBishopPathsFromE1() {
      Assert.assertEquals("00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "10000000" + // A5-H5
            "01000001" + // A4-H4
            "00100010" + // A3-H3
            "00010100" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_E1)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_E1)));
   }

   public void testBishopPathsFromF1() {
      Assert.assertEquals("00000000" + // A8-H8
            "00000000" + // A7-H7
            "10000000" + // A6-H6
            "01000000" + // A5-H5
            "00100000" + // A4-H4
            "00010001" + // A3-H3
            "00001010" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_F1)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_F1)));
   }

   public void testBishopPathsFromG1() {
      Assert.assertEquals("00000000" + // A8-H8
            "10000000" + // A7-H7
            "01000000" + // A6-H6
            "00100000" + // A5-H5
            "00010000" + // A4-H4
            "00001000" + // A3-H3
            "00000101" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_G1)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_G1)));
   }

   public void testBishopPathsFromH1() {
      Assert.assertEquals("10000000" + // A8-H8
            "01000000" + // A7-H7
            "00100000" + // A6-H6
            "00010000" + // A5-H5
            "00001000" + // A4-H4
            "00000100" + // A3-H3
            "00000010" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_H1)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_H1)));
   }

   public void testBishopPathsFromA2() {
      Assert.assertEquals("00000010" + // A8-H8
            "00000100" + // A7-H7
            "00001000" + // A6-H6
            "00010000" + // A5-H5
            "00100000" + // A4-H4
            "01000000" + // A3-H3
            "00000000" + // A2-H2
            "01000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_A2)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_A2)));
   }

   public void testBishopPathsFromB2() {
      Assert.assertEquals("00000001" + // A8-H8
            "00000010" + // A7-H7
            "00000100" + // A6-H6
            "00001000" + // A5-H5
            "00010000" + // A4-H4
            "10100000" + // A3-H3
            "00000000" + // A2-H2
            "10100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_B2)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_B2)));
   }

   public void testBishopPathsFromC2() {
      Assert.assertEquals("00000000" + // A8-H8
            "00000001" + // A7-H7
            "00000010" + // A6-H6
            "00000100" + // A5-H5
            "10001000" + // A4-H4
            "01010000" + // A3-H3
            "00000000" + // A2-H2
            "01010000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_C2)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_C2)));
   }

   public void testBishopPathsFromD2() {
      Assert.assertEquals("00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000001" + // A6-H6
            "10000010" + // A5-H5
            "01000100" + // A4-H4
            "00101000" + // A3-H3
            "00000000" + // A2-H2
            "00101000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_D2)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_D2)));
   }

   public void testBishopPathsFromE2() {
      Assert.assertEquals("00000000" + // A8-H8
            "00000000" + // A7-H7
            "10000000" + // A6-H6
            "01000001" + // A5-H5
            "00100010" + // A4-H4
            "00010100" + // A3-H3
            "00000000" + // A2-H2
            "00010100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_E2)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_E2)));
   }

   public void testBishopPathsFromF2() {
      Assert.assertEquals("00000000" + // A8-H8
            "10000000" + // A7-H7
            "01000000" + // A6-H6
            "00100000" + // A5-H5
            "00010001" + // A4-H4
            "00001010" + // A3-H3
            "00000000" + // A2-H2
            "00001010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_F2)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_F2)));
   }

   public void testBishopPathsFromG2() {
      Assert.assertEquals("10000000" + // A8-H8
            "01000000" + // A7-H7
            "00100000" + // A6-H6
            "00010000" + // A5-H5
            "00001000" + // A4-H4
            "00000101" + // A3-H3
            "00000000" + // A2-H2
            "00000101", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_G2)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_G2)));
   }

   public void testBishopPathsFromH2() {
      Assert.assertEquals("01000000" + // A8-H8
            "00100000" + // A7-H7
            "00010000" + // A6-H6
            "00001000" + // A5-H5
            "00000100" + // A4-H4
            "00000010" + // A3-H3
            "00000000" + // A2-H2
            "00000010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_H2)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_H2)));
   }

   public void testBishopPathsFromA3() {
      Assert.assertEquals("00000100" + // A8-H8
            "00001000" + // A7-H7
            "00010000" + // A6-H6
            "00100000" + // A5-H5
            "01000000" + // A4-H4
            "00000000" + // A3-H3
            "01000000" + // A2-H2
            "00100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_A3)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_A3)));
   }

   public void testBishopPathsFromB3() {
      Assert.assertEquals("00000010" + // A8-H8
            "00000100" + // A7-H7
            "00001000" + // A6-H6
            "00010000" + // A5-H5
            "10100000" + // A4-H4
            "00000000" + // A3-H3
            "10100000" + // A2-H2
            "00010000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_B3)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_B3)));
   }

   public void testBishopPathsFromC3() {
      Assert.assertEquals("00000001" + // A8-H8
            "00000010" + // A7-H7
            "00000100" + // A6-H6
            "10001000" + // A5-H5
            "01010000" + // A4-H4
            "00000000" + // A3-H3
            "01010000" + // A2-H2
            "10001000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_C3)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_C3)));
   }

   public void testBishopPathsFromD3() {
      Assert.assertEquals("00000000" + // A8-H8
            "00000001" + // A7-H7
            "10000010" + // A6-H6
            "01000100" + // A5-H5
            "00101000" + // A4-H4
            "00000000" + // A3-H3
            "00101000" + // A2-H2
            "01000100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_D3)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_D3)));
   }

   public void testBishopPathsFromE3() {
      Assert.assertEquals("00000000" + // A8-H8
            "10000000" + // A7-H7
            "01000001" + // A6-H6
            "00100010" + // A5-H5
            "00010100" + // A4-H4
            "00000000" + // A3-H3
            "00010100" + // A2-H2
            "00100010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_E3)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_E3)));
   }

   public void testBishopPathsFromF3() {
      Assert.assertEquals("10000000" + // A8-H8
            "01000000" + // A7-H7
            "00100000" + // A6-H6
            "00010001" + // A5-H5
            "00001010" + // A4-H4
            "00000000" + // A3-H3
            "00001010" + // A2-H2
            "00010001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_F3)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_F3)));
   }

   public void testBishopPathsFromG3() {
      Assert.assertEquals("01000000" + // A8-H8
            "00100000" + // A7-H7
            "00010000" + // A6-H6
            "00001000" + // A5-H5
            "00000101" + // A4-H4
            "00000000" + // A3-H3
            "00000101" + // A2-H2
            "00001000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_G3)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_G3)));
   }

   public void testBishopPathsFromH3() {
      Assert.assertEquals("00100000" + // A8-H8
            "00010000" + // A7-H7
            "00001000" + // A6-H6
            "00000100" + // A5-H5
            "00000010" + // A4-H4
            "00000000" + // A3-H3
            "00000010" + // A2-H2
            "00000100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_H3)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_H3)));
   }

   public void testBishopPathsFromA4() {
      Assert.assertEquals("00001000" + // A8-H8
            "00010000" + // A7-H7
            "00100000" + // A6-H6
            "01000000" + // A5-H5
            "00000000" + // A4-H4
            "01000000" + // A3-H3
            "00100000" + // A2-H2
            "00010000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_A4)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_A4)));
   }

   public void testBishopPathsFromB4() {
      Assert.assertEquals("00000100" + // A8-H8
            "00001000" + // A7-H7
            "00010000" + // A6-H6
            "10100000" + // A5-H5
            "00000000" + // A4-H4
            "10100000" + // A3-H3
            "00010000" + // A2-H2
            "00001000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_B4)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_B4)));
   }

   public void testBishopPathsFromC4() {
      Assert.assertEquals("00000010" + // A8-H8
            "00000100" + // A7-H7
            "10001000" + // A6-H6
            "01010000" + // A5-H5
            "00000000" + // A4-H4
            "01010000" + // A3-H3
            "10001000" + // A2-H2
            "00000100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_C4)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_C4)));
   }

   public void testBishopPathsFromD4() {
      Assert.assertEquals("00000001" + // A8-H8
            "10000010" + // A7-H7
            "01000100" + // A6-H6
            "00101000" + // A5-H5
            "00000000" + // A4-H4
            "00101000" + // A3-H3
            "01000100" + // A2-H2
            "10000010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_D4)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_D4)));
   }

   public void testBishopPathsFromE4() {
      Assert.assertEquals("10000000" + // A8-H8
            "01000001" + // A7-H7
            "00100010" + // A6-H6
            "00010100" + // A5-H5
            "00000000" + // A4-H4
            "00010100" + // A3-H3
            "00100010" + // A2-H2
            "01000001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_E4)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_E4)));
   }

   public void testBishopPathsFromF4() {
      Assert.assertEquals("01000000" + // A8-H8
            "00100000" + // A7-H7
            "00010001" + // A6-H6
            "00001010" + // A5-H5
            "00000000" + // A4-H4
            "00001010" + // A3-H3
            "00010001" + // A2-H2
            "00100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_F4)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_F4)));
   }

   public void testBishopPathsFromG4() {
      Assert.assertEquals("00100000" + // A8-H8
            "00010000" + // A7-H7
            "00001000" + // A6-H6
            "00000101" + // A5-H5
            "00000000" + // A4-H4
            "00000101" + // A3-H3
            "00001000" + // A2-H2
            "00010000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_G4)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_G4)));
   }

   public void testBishopPathsFromH4() {
      Assert.assertEquals("00010000" + // A8-H8
            "00001000" + // A7-H7
            "00000100" + // A6-H6
            "00000010" + // A5-H5
            "00000000" + // A4-H4
            "00000010" + // A3-H3
            "00000100" + // A2-H2
            "00001000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_H4)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_H4)));
   }

   public void testBishopPathsFromA5() {
      Assert.assertEquals("00010000" + // A8-H8
            "00100000" + // A7-H7
            "01000000" + // A6-H6
            "00000000" + // A5-H5
            "01000000" + // A4-H4
            "00100000" + // A3-H3
            "00010000" + // A2-H2
            "00001000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_A5)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_A5)));
   }

   public void testBishopPathsFromB5() {
      Assert.assertEquals("00001000" + // A8-H8
            "00010000" + // A7-H7
            "10100000" + // A6-H6
            "00000000" + // A5-H5
            "10100000" + // A4-H4
            "00010000" + // A3-H3
            "00001000" + // A2-H2
            "00000100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_B5)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_B5)));
   }

   public void testBishopPathsFromC5() {
      Assert.assertEquals("00000100" + // A8-H8
            "10001000" + // A7-H7
            "01010000" + // A6-H6
            "00000000" + // A5-H5
            "01010000" + // A4-H4
            "10001000" + // A3-H3
            "00000100" + // A2-H2
            "00000010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_C5)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_C5)));
   }

   public void testBishopPathsFromD5() {
      Assert.assertEquals("10000010" + // A8-H8
            "01000100" + // A7-H7
            "00101000" + // A6-H6
            "00000000" + // A5-H5
            "00101000" + // A4-H4
            "01000100" + // A3-H3
            "10000010" + // A2-H2
            "00000001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_D5)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_D5)));
   }

   public void testBishopPathsFromE5() {
      Assert.assertEquals("01000001" + // A8-H8
            "00100010" + // A7-H7
            "00010100" + // A6-H6
            "00000000" + // A5-H5
            "00010100" + // A4-H4
            "00100010" + // A3-H3
            "01000001" + // A2-H2
            "10000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_E5)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_E5)));
   }

   public void testBishopPathsFromF5() {
      Assert.assertEquals("00100000" + // A8-H8
            "00010001" + // A7-H7
            "00001010" + // A6-H6
            "00000000" + // A5-H5
            "00001010" + // A4-H4
            "00010001" + // A3-H3
            "00100000" + // A2-H2
            "01000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_F5)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_F5)));
   }

   public void testBishopPathsFromG5() {
      Assert.assertEquals("00010000" + // A8-H8
            "00001000" + // A7-H7
            "00000101" + // A6-H6
            "00000000" + // A5-H5
            "00000101" + // A4-H4
            "00001000" + // A3-H3
            "00010000" + // A2-H2
            "00100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_G5)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_G5)));
   }

   public void testBishopPathsFromH5() {
      Assert.assertEquals("00001000" + // A8-H8
            "00000100" + // A7-H7
            "00000010" + // A6-H6
            "00000000" + // A5-H5
            "00000010" + // A4-H4
            "00000100" + // A3-H3
            "00001000" + // A2-H2
            "00010000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_H5)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_H5)));
   }

   public void testBishopPathsFromA6() {
      Assert.assertEquals("00100000" + // A8-H8
            "01000000" + // A7-H7
            "00000000" + // A6-H6
            "01000000" + // A5-H5
            "00100000" + // A4-H4
            "00010000" + // A3-H3
            "00001000" + // A2-H2
            "00000100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_A6)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_A6)));
   }

   public void testBishopPathsFromB6() {
      Assert.assertEquals("00010000" + // A8-H8
            "10100000" + // A7-H7
            "00000000" + // A6-H6
            "10100000" + // A5-H5
            "00010000" + // A4-H4
            "00001000" + // A3-H3
            "00000100" + // A2-H2
            "00000010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_B6)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_B6)));
   }

   public void testBishopPathsFromC6() {
      Assert.assertEquals("10001000" + // A8-H8
            "01010000" + // A7-H7
            "00000000" + // A6-H6
            "01010000" + // A5-H5
            "10001000" + // A4-H4
            "00000100" + // A3-H3
            "00000010" + // A2-H2
            "00000001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_C6)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_C6)));
   }

   public void testBishopPathsFromD6() {
      Assert.assertEquals("01000100" + // A8-H8
            "00101000" + // A7-H7
            "00000000" + // A6-H6
            "00101000" + // A5-H5
            "01000100" + // A4-H4
            "10000010" + // A3-H3
            "00000001" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_D6)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_D6)));
   }

   public void testBishopPathsFromE6() {
      Assert.assertEquals("00100010" + // A8-H8
            "00010100" + // A7-H7
            "00000000" + // A6-H6
            "00010100" + // A5-H5
            "00100010" + // A4-H4
            "01000001" + // A3-H3
            "10000000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_E6)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_E6)));
   }

   public void testBishopPathsFromF6() {
      Assert.assertEquals("00010001" + // A8-H8
            "00001010" + // A7-H7
            "00000000" + // A6-H6
            "00001010" + // A5-H5
            "00010001" + // A4-H4
            "00100000" + // A3-H3
            "01000000" + // A2-H2
            "10000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_F6)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_F6)));
   }

   public void testBishopPathsFromG6() {
      Assert.assertEquals("00001000" + // A8-H8
            "00000101" + // A7-H7
            "00000000" + // A6-H6
            "00000101" + // A5-H5
            "00001000" + // A4-H4
            "00010000" + // A3-H3
            "00100000" + // A2-H2
            "01000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_G6)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_G6)));
   }

   public void testBishopPathsFromH6() {
      Assert.assertEquals("00000100" + // A8-H8
            "00000010" + // A7-H7
            "00000000" + // A6-H6
            "00000010" + // A5-H5
            "00000100" + // A4-H4
            "00001000" + // A3-H3
            "00010000" + // A2-H2
            "00100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_H6)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_H6)));
   }

   public void testBishopPathsFromA7() {
      Assert.assertEquals("01000000" + // A8-H8
            "00000000" + // A7-H7
            "01000000" + // A6-H6
            "00100000" + // A5-H5
            "00010000" + // A4-H4
            "00001000" + // A3-H3
            "00000100" + // A2-H2
            "00000010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_A7)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_A7)));
   }

   public void testBishopPathsFromB7() {
      Assert.assertEquals("10100000" + // A8-H8
            "00000000" + // A7-H7
            "10100000" + // A6-H6
            "00010000" + // A5-H5
            "00001000" + // A4-H4
            "00000100" + // A3-H3
            "00000010" + // A2-H2
            "00000001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_B7)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_B7)));
   }

   public void testBishopPathsFromC7() {
      Assert.assertEquals("01010000" + // A8-H8
            "00000000" + // A7-H7
            "01010000" + // A6-H6
            "10001000" + // A5-H5
            "00000100" + // A4-H4
            "00000010" + // A3-H3
            "00000001" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_C7)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_C7)));
   }

   public void testBishopPathsFromD7() {
      Assert.assertEquals("00101000" + // A8-H8
            "00000000" + // A7-H7
            "00101000" + // A6-H6
            "01000100" + // A5-H5
            "10000010" + // A4-H4
            "00000001" + // A3-H3
            "00000000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_D7)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_D7)));
   }

   public void testBishopPathsFromE7() {
      Assert.assertEquals("00010100" + // A8-H8
            "00000000" + // A7-H7
            "00010100" + // A6-H6
            "00100010" + // A5-H5
            "01000001" + // A4-H4
            "10000000" + // A3-H3
            "00000000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_E7)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_E7)));
   }

   public void testBishopPathsFromF7() {
      Assert.assertEquals("00001010" + // A8-H8
            "00000000" + // A7-H7
            "00001010" + // A6-H6
            "00010001" + // A5-H5
            "00100000" + // A4-H4
            "01000000" + // A3-H3
            "10000000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_F7)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_F7)));
   }

   public void testBishopPathsFromG7() {
      Assert.assertEquals("00000101" + // A8-H8
            "00000000" + // A7-H7
            "00000101" + // A6-H6
            "00001000" + // A5-H5
            "00010000" + // A4-H4
            "00100000" + // A3-H3
            "01000000" + // A2-H2
            "10000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_G7)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_G7)));
   }

   public void testBishopPathsFromH7() {
      Assert.assertEquals("00000010" + // A8-H8
            "00000000" + // A7-H7
            "00000010" + // A6-H6
            "00000100" + // A5-H5
            "00001000" + // A4-H4
            "00010000" + // A3-H3
            "00100000" + // A2-H2
            "01000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_H7)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_H7)));
   }

   public void testBishopPathsFromA8() {
      Assert.assertEquals("00000000" + // A8-H8
            "01000000" + // A7-H7
            "00100000" + // A6-H6
            "00010000" + // A5-H5
            "00001000" + // A4-H4
            "00000100" + // A3-H3
            "00000010" + // A2-H2
            "00000001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_A8)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_A8)));
   }

   public void testBishopPathsFromB8() {
      Assert.assertEquals("00000000" + // A8-H8
            "10100000" + // A7-H7
            "00010000" + // A6-H6
            "00001000" + // A5-H5
            "00000100" + // A4-H4
            "00000010" + // A3-H3
            "00000001" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_B8)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_B8)));
   }

   public void testBishopPathsFromC8() {
      Assert.assertEquals("00000000" + // A8-H8
            "01010000" + // A7-H7
            "10001000" + // A6-H6
            "00000100" + // A5-H5
            "00000010" + // A4-H4
            "00000001" + // A3-H3
            "00000000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_C8)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_C8)));
   }

   public void testBishopPathsFromD8() {
      Assert.assertEquals("00000000" + // A8-H8
            "00101000" + // A7-H7
            "01000100" + // A6-H6
            "10000010" + // A5-H5
            "00000001" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_D8)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_D8)));
   }

   public void testBishopPathsFromE8() {
      Assert.assertEquals("00000000" + // A8-H8
            "00010100" + // A7-H7
            "00100010" + // A6-H6
            "01000001" + // A5-H5
            "10000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_E8)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_E8)));
   }

   public void testBishopPathsFromF8() {
      Assert.assertEquals("00000000" + // A8-H8
            "00001010" + // A7-H7
            "00010001" + // A6-H6
            "00100000" + // A5-H5
            "01000000" + // A4-H4
            "10000000" + // A3-H3
            "00000000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_F8)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_F8)));
   }

   public void testBishopPathsFromG8() {
      Assert.assertEquals("00000000" + // A8-H8
            "00000101" + // A7-H7
            "00001000" + // A6-H6
            "00010000" + // A5-H5
            "00100000" + // A4-H4
            "01000000" + // A3-H3
            "10000000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_G8)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_G8)));
   }

   public void testBishopPathsFromH8() {
      Assert.assertEquals("00000000" + // A8-H8
            "00000010" + // A7-H7
            "00000100" + // A6-H6
            "00001000" + // A5-H5
            "00010000" + // A4-H4
            "00100000" + // A3-H3
            "01000000" + // A2-H2
            "10000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_H8)
                  .length() - 1] + Long.toBinaryString(Bishop._PATHS_FROM_H8)));
   }

}