package org.forritan.talvmenni.bitboard;

import junit.framework.Assert;
import junit.framework.TestCase;


public class SquareTest extends TestCase {

   private final String[] zeroPrefix = new String[64];

   public SquareTest() {
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

   public void testA1() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "10000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._A1).length() - 1] + Long
                        .toBinaryString(Square._A1)));
      Assert.assertEquals(Square._A1, Square.bitmaps[Square.A1]);
   }

   public void testA2() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "10000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._A2).length() - 1] + Long
                        .toBinaryString(Square._A2)));
      Assert.assertEquals(Square._A2, Square.bitmaps[Square.A2]);
   }

   public void testA3() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "10000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._A3).length() - 1] + Long
                        .toBinaryString(Square._A3)));
      Assert.assertEquals(Square._A3, Square.bitmaps[Square.A3]);
   }

   public void testA4() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "10000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._A4).length() - 1] + Long
                        .toBinaryString(Square._A4)));
      Assert.assertEquals(Square._A4, Square.bitmaps[Square.A4]);
   }

   public void testA5() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "10000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._A5).length() - 1] + Long
                        .toBinaryString(Square._A5)));
      Assert.assertEquals(Square._A5, Square.bitmaps[Square.A5]);
   }

   public void testA6() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "10000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._A6).length() - 1] + Long
                        .toBinaryString(Square._A6)));
      Assert.assertEquals(Square._A6, Square.bitmaps[Square.A6]);
   }

   public void testA7() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "10000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._A7).length() - 1] + Long
                        .toBinaryString(Square._A7)));
      Assert.assertEquals(Square._A7, Square.bitmaps[Square.A7]);
   }

   public void testA8() {
      Assert
            .assertEquals(
                  "" + //
                        "10000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._A8).length() - 1] + Long
                        .toBinaryString(Square._A8)));
      Assert.assertEquals(Square._A8, Square.bitmaps[Square.A8]);
   }

   public void testB1() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "01000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._B1).length() - 1] + Long
                        .toBinaryString(Square._B1)));
      Assert.assertEquals(Square._B1, Square.bitmaps[Square.B1]);
   }

   public void testB2() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "01000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._B2).length() - 1] + Long
                        .toBinaryString(Square._B2)));
      Assert.assertEquals(Square._B2, Square.bitmaps[Square.B2]);
   }

   public void testB3() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "01000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._B3).length() - 1] + Long
                        .toBinaryString(Square._B3)));
      Assert.assertEquals(Square._B3, Square.bitmaps[Square.B3]);
   }

   public void testB4() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "01000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._B4).length() - 1] + Long
                        .toBinaryString(Square._B4)));
      Assert.assertEquals(Square._B4, Square.bitmaps[Square.B4]);
   }

   public void testB5() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "01000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._B5).length() - 1] + Long
                        .toBinaryString(Square._B5)));
      Assert.assertEquals(Square._B5, Square.bitmaps[Square.B5]);
   }

   public void testB6() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "01000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._B6).length() - 1] + Long
                        .toBinaryString(Square._B6)));
      Assert.assertEquals(Square._B6, Square.bitmaps[Square.B6]);
   }

   public void testB7() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "01000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._B7).length() - 1] + Long
                        .toBinaryString(Square._B7)));
      Assert.assertEquals(Square._B7, Square.bitmaps[Square.B7]);
   }

   public void testB8() {
      Assert
            .assertEquals(
                  "" + //
                        "01000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._B8).length() - 1] + Long
                        .toBinaryString(Square._B8)));
      Assert.assertEquals(Square._B8, Square.bitmaps[Square.B8]);
   }

   public void testC1() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._C1).length() - 1] + Long
                        .toBinaryString(Square._C1)));
      Assert.assertEquals(Square._C1, Square.bitmaps[Square.C1]);
   }

   public void testC2() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00100000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._C2).length() - 1] + Long
                        .toBinaryString(Square._C2)));
      Assert.assertEquals(Square._C2, Square.bitmaps[Square.C2]);
   }

   public void testC3() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00100000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._C3).length() - 1] + Long
                        .toBinaryString(Square._C3)));
      Assert.assertEquals(Square._C3, Square.bitmaps[Square.C3]);
   }

   public void testC4() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00100000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._C4).length() - 1] + Long
                        .toBinaryString(Square._C4)));
      Assert.assertEquals(Square._C4, Square.bitmaps[Square.C4]);
   }

   public void testC5() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00100000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._C5).length() - 1] + Long
                        .toBinaryString(Square._C5)));
      Assert.assertEquals(Square._C5, Square.bitmaps[Square.C5]);
   }

   public void testC6() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00100000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._C6).length() - 1] + Long
                        .toBinaryString(Square._C6)));
      Assert.assertEquals(Square._C6, Square.bitmaps[Square.C6]);
   }

   public void testC7() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00100000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._C7).length() - 1] + Long
                        .toBinaryString(Square._C7)));
      Assert.assertEquals(Square._C7, Square.bitmaps[Square.C7]);
   }

   public void testC8() {
      Assert
            .assertEquals(
                  "" + //
                        "00100000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._C8).length() - 1] + Long
                        .toBinaryString(Square._C8)));
      Assert.assertEquals(Square._C8, Square.bitmaps[Square.C8]);
   }

   public void testD1() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00010000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._D1).length() - 1] + Long
                        .toBinaryString(Square._D1)));
      Assert.assertEquals(Square._D1, Square.bitmaps[Square.D1]);
   }

   public void testD2() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00010000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._D2).length() - 1] + Long
                        .toBinaryString(Square._D2)));
      Assert.assertEquals(Square._D2, Square.bitmaps[Square.D2]);
   }

   public void testD3() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00010000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._D3).length() - 1] + Long
                        .toBinaryString(Square._D3)));
      Assert.assertEquals(Square._D3, Square.bitmaps[Square.D3]);
   }

   public void testD4() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00010000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._D4).length() - 1] + Long
                        .toBinaryString(Square._D4)));
      Assert.assertEquals(Square._D4, Square.bitmaps[Square.D4]);
   }

   public void testD5() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00010000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._D5).length() - 1] + Long
                        .toBinaryString(Square._D5)));
      Assert.assertEquals(Square._D5, Square.bitmaps[Square.D5]);
   }

   public void testD6() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00010000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._D6).length() - 1] + Long
                        .toBinaryString(Square._D6)));
      Assert.assertEquals(Square._D6, Square.bitmaps[Square.D6]);
   }

   public void testD7() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00010000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._D7).length() - 1] + Long
                        .toBinaryString(Square._D7)));
      Assert.assertEquals(Square._D7, Square.bitmaps[Square.D7]);
   }

   public void testD8() {
      Assert
            .assertEquals(
                  "" + //
                        "00010000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._D8).length() - 1] + Long
                        .toBinaryString(Square._D8)));
      Assert.assertEquals(Square._D8, Square.bitmaps[Square.D8]);
   }

   public void testE1() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00001000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._E1).length() - 1] + Long
                        .toBinaryString(Square._E1)));
      Assert.assertEquals(Square._E1, Square.bitmaps[Square.E1]);
   }

   public void testE2() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00001000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._E2).length() - 1] + Long
                        .toBinaryString(Square._E2)));
      Assert.assertEquals(Square._E2, Square.bitmaps[Square.E2]);
   }

   public void testE3() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00001000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._E3).length() - 1] + Long
                        .toBinaryString(Square._E3)));
      Assert.assertEquals(Square._E3, Square.bitmaps[Square.E3]);
   }

   public void testE4() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00001000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._E4).length() - 1] + Long
                        .toBinaryString(Square._E4)));
      Assert.assertEquals(Square._E4, Square.bitmaps[Square.E4]);
   }

   public void testE5() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00001000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._E5).length() - 1] + Long
                        .toBinaryString(Square._E5)));
      Assert.assertEquals(Square._E5, Square.bitmaps[Square.E5]);
   }

   public void testE6() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00001000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._E6).length() - 1] + Long
                        .toBinaryString(Square._E6)));
      Assert.assertEquals(Square._E6, Square.bitmaps[Square.E6]);
   }

   public void testE7() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00001000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._E7).length() - 1] + Long
                        .toBinaryString(Square._E7)));
      Assert.assertEquals(Square._E7, Square.bitmaps[Square.E7]);
   }

   public void testE8() {
      Assert
            .assertEquals(
                  "" + //
                        "00001000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._E8).length() - 1] + Long
                        .toBinaryString(Square._E8)));
      Assert.assertEquals(Square._E8, Square.bitmaps[Square.E8]);
   }

   public void testF1() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._F1).length() - 1] + Long
                        .toBinaryString(Square._F1)));
      Assert.assertEquals(Square._F1, Square.bitmaps[Square.F1]);
   }

   public void testF2() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000100" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._F2).length() - 1] + Long
                        .toBinaryString(Square._F2)));
      Assert.assertEquals(Square._F2, Square.bitmaps[Square.F2]);
   }

   public void testF3() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000100" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._F3).length() - 1] + Long
                        .toBinaryString(Square._F3)));
      Assert.assertEquals(Square._F3, Square.bitmaps[Square.F3]);
   }

   public void testF4() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000100" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._F4).length() - 1] + Long
                        .toBinaryString(Square._F4)));
      Assert.assertEquals(Square._F4, Square.bitmaps[Square.F4]);
   }

   public void testF5() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000100" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._F5).length() - 1] + Long
                        .toBinaryString(Square._F5)));
      Assert.assertEquals(Square._F5, Square.bitmaps[Square.F5]);
   }

   public void testF6() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000100" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._F6).length() - 1] + Long
                        .toBinaryString(Square._F6)));
      Assert.assertEquals(Square._F6, Square.bitmaps[Square.F6]);
   }

   public void testF7() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000100" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._F7).length() - 1] + Long
                        .toBinaryString(Square._F7)));
      Assert.assertEquals(Square._F7, Square.bitmaps[Square.F7]);
   }

   public void testF8() {
      Assert
            .assertEquals(
                  "" + //
                        "00000100" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._F8).length() - 1] + Long
                        .toBinaryString(Square._F8)));
      Assert.assertEquals(Square._F8, Square.bitmaps[Square.F8]);
   }

   public void testG1() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._G1).length() - 1] + Long
                        .toBinaryString(Square._G1)));
      Assert.assertEquals(Square._G1, Square.bitmaps[Square.G1]);
   }

   public void testG2() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000010" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._G2).length() - 1] + Long
                        .toBinaryString(Square._G2)));
      Assert.assertEquals(Square._G2, Square.bitmaps[Square.G2]);
   }

   public void testG3() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000010" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._G3).length() - 1] + Long
                        .toBinaryString(Square._G3)));
      Assert.assertEquals(Square._G3, Square.bitmaps[Square.G3]);
   }

   public void testG4() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000010" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._G4).length() - 1] + Long
                        .toBinaryString(Square._G4)));
      Assert.assertEquals(Square._G4, Square.bitmaps[Square.G4]);
   }

   public void testG5() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000010" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._G5).length() - 1] + Long
                        .toBinaryString(Square._G5)));
      Assert.assertEquals(Square._G5, Square.bitmaps[Square.G5]);
   }

   public void testG6() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000010" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._G6).length() - 1] + Long
                        .toBinaryString(Square._G6)));
      Assert.assertEquals(Square._G6, Square.bitmaps[Square.G6]);
   }

   public void testG7() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000010" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._G7).length() - 1] + Long
                        .toBinaryString(Square._G7)));
      Assert.assertEquals(Square._G7, Square.bitmaps[Square.G7]);
   }

   public void testG8() {
      Assert
            .assertEquals(
                  "" + //
                        "00000010" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._G8).length() - 1] + Long
                        .toBinaryString(Square._G8)));
      Assert.assertEquals(Square._G8, Square.bitmaps[Square.G8]);
   }

   public void testH1() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._H1).length() - 1] + Long
                        .toBinaryString(Square._H1)));
      Assert.assertEquals(Square._H1, Square.bitmaps[Square.H1]);
   }

   public void testH2() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000001" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._H2).length() - 1] + Long
                        .toBinaryString(Square._H2)));
      Assert.assertEquals(Square._H2, Square.bitmaps[Square.H2]);
   }

   public void testH3() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000001" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._H3).length() - 1] + Long
                        .toBinaryString(Square._H3)));
      Assert.assertEquals(Square._H3, Square.bitmaps[Square.H3]);
   }

   public void testH4() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000001" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._H4).length() - 1] + Long
                        .toBinaryString(Square._H4)));
      Assert.assertEquals(Square._H4, Square.bitmaps[Square.H4]);
   }

   public void testH5() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000001" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._H5).length() - 1] + Long
                        .toBinaryString(Square._H5)));
      Assert.assertEquals(Square._H5, Square.bitmaps[Square.H5]);
   }

   public void testH6() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000000" + // A7-H7
                        "00000001" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._H6).length() - 1] + Long
                        .toBinaryString(Square._H6)));
      Assert.assertEquals(Square._H6, Square.bitmaps[Square.H6]);
   }

   public void testH7() {
      Assert
            .assertEquals(
                  "" + //
                        "00000000" + // A8-H8
                        "00000001" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._H7).length() - 1] + Long
                        .toBinaryString(Square._H7)));
      Assert.assertEquals(Square._H7, Square.bitmaps[Square.H7]);
   }

   public void testH8() {
      Assert
            .assertEquals(
                  "" + //
                        "00000001" + // A8-H8
                        "00000000" + // A7-H7
                        "00000000" + // A6-H6
                        "00000000" + // A5-H5
                        "00000000" + // A4-H4
                        "00000000" + // A3-H3
                        "00000000" + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Square._H8).length() - 1] + Long
                        .toBinaryString(Square._H8)));
      Assert.assertEquals(Square._H8, Square.bitmaps[Square.H8]);
   }
}