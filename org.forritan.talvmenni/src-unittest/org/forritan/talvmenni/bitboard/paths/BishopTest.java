package org.forritan.talvmenni.bitboard.paths;

import junit.framework.Assert;
import junit.framework.TestCase;

public class BishopTest extends TestCase {

   
   private final String[] zeroPrefix = new String[64];
   public BishopTest() {
      for (int i = 0, j = 64; i < zeroPrefix.length; i++, j--) {
         StringBuffer zeroes = new StringBuffer();
         for (int k = 1; k < j; k++) {
            zeroes.append('0');
         }
         zeroPrefix[i] = zeroes.toString();
      }
   }

   protected void setUp() throws Exception {
      super.setUp();
   }

   protected void tearDown() throws Exception {
      super.tearDown();
   }

   public void testBishopPathsFromA1() {
      Assert.assertEquals(
            "00000001" + // A8-H8
            "00000010" + // A7-H7
            "00000100" + // A6-H6
            "00001000" + // A5-H5
            "00010000" + // A4-H4
            "00100000" + // A3-H3
            "01000000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_A1)
                  .length() - 1] + Long
                  .toBinaryString(Bishop._PATHS_FROM_A1)));
   }

   public void testBishopPathsFromB1() {
      Assert.assertEquals(
            "00000000" + // A8-H8
            "00000001" + // A7-H7
            "00000010" + // A6-H6
            "00000100" + // A5-H5
            "00001000" + // A4-H4
            "00010000" + // A3-H3
            "10100000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_B1)
                  .length() - 1] + Long
                  .toBinaryString(Bishop._PATHS_FROM_B1)));
   }
   public void testBishopPathsFromC1() {
      Assert.assertEquals(
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000001" + // A6-H6
            "00000010" + // A5-H5
            "00000100" + // A4-H4
            "10001000" + // A3-H3
            "01010000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_C1)
                  .length() - 1] + Long
                  .toBinaryString(Bishop._PATHS_FROM_C1)));
   }
   public void testBishopPathsFromD1() {
      Assert.assertEquals(
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000001" + // A5-H5
            "10000010" + // A4-H4
            "01000100" + // A3-H3
            "00101000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_D1)
                  .length() - 1] + Long
                  .toBinaryString(Bishop._PATHS_FROM_D1)));
   }
   public void testBishopPathsFromE1() {
      Assert.assertEquals(
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "10000000" + // A5-H5
            "01000001" + // A4-H4
            "00100010" + // A3-H3
            "00010100" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_E1)
                  .length() - 1] + Long
                  .toBinaryString(Bishop._PATHS_FROM_E1)));
   }
   public void testBishopPathsFromF1() {
      Assert.assertEquals(
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "10000000" + // A6-H6
            "01000000" + // A5-H5
            "00100000" + // A4-H4
            "00010001" + // A3-H3
            "00001010" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_F1)
                  .length() - 1] + Long
                  .toBinaryString(Bishop._PATHS_FROM_F1)));
   }
   public void testBishopPathsFromG1() {
      Assert.assertEquals(
            "00000000" + // A8-H8
            "10000000" + // A7-H7
            "01000000" + // A6-H6
            "00100000" + // A5-H5
            "00010000" + // A4-H4
            "00001000" + // A3-H3
            "00000101" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_G1)
                  .length() - 1] + Long
                  .toBinaryString(Bishop._PATHS_FROM_G1)));
   }
   public void testBishopPathsFromH1() {
      Assert.assertEquals(
            "10000000" + // A8-H8
            "01000000" + // A7-H7
            "00100000" + // A6-H6
            "00010000" + // A5-H5
            "00001000" + // A4-H4
            "00000100" + // A3-H3
            "00000010" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_H1)
                  .length() - 1] + Long
                  .toBinaryString(Bishop._PATHS_FROM_H1)));
   }
   public void testBishopPathsFromA2() {
      Assert.assertEquals(
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_A1)
                  .length() - 1] + Long
                  .toBinaryString(Bishop._PATHS_FROM_A1)));
   }
   public void testBishopPathsFromB2() {
      Assert.assertEquals(
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_A1)
                  .length() - 1] + Long
                  .toBinaryString(Bishop._PATHS_FROM_A1)));
   }
   public void testBishopPathsFromC2() {
      Assert.assertEquals(
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_A1)
                  .length() - 1] + Long
                  .toBinaryString(Bishop._PATHS_FROM_A1)));
   }
   public void testBishopPathsFromD2() {
      Assert.assertEquals(
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_A1)
                  .length() - 1] + Long
                  .toBinaryString(Bishop._PATHS_FROM_A1)));
   }
   public void testBishopPathsFromE2() {
      Assert.assertEquals(
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_A1)
                  .length() - 1] + Long
                  .toBinaryString(Bishop._PATHS_FROM_A1)));
   }
   public void testBishopPathsFromF2() {
      Assert.assertEquals(
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_A1)
                  .length() - 1] + Long
                  .toBinaryString(Bishop._PATHS_FROM_A1)));
   }
   public void testBishopPathsFromG2() {
      Assert.assertEquals(
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_A1)
                  .length() - 1] + Long
                  .toBinaryString(Bishop._PATHS_FROM_A1)));
   }
   public void testBishopPathsFromH2() {
      Assert.assertEquals(
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_A1)
                  .length() - 1] + Long
                  .toBinaryString(Bishop._PATHS_FROM_A1)));
   }
   public void testBishopPathsFrom() {
      Assert.assertEquals(
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Bishop._PATHS_FROM_A1)
                  .length() - 1] + Long
                  .toBinaryString(Bishop._PATHS_FROM_A1)));
   }

}
