package org.forritan.talvmenni.bitboard.paths;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.forritan.talvmenni.bitboard.Square;


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
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000001"
                  + // A8-H8
                  "00000010"
                  + // A7-H7
                  "00000100"
                  + // A6-H6
                  "00001000"
                  + // A5-H5
                  "00010000"
                  + // A4-H4
                  "00100000"
                  + // A3-H3
                  "01000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._A1)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._A1))));
   }

   public void testBishopPathsFromB1() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000001"
                  + // A7-H7
                  "00000010"
                  + // A6-H6
                  "00000100"
                  + // A5-H5
                  "00001000"
                  + // A4-H4
                  "00010000"
                  + // A3-H3
                  "10100000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._B1)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._B1))));
   }

   public void testBishopPathsFromC1() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000001"
                  + // A6-H6
                  "00000010"
                  + // A5-H5
                  "00000100"
                  + // A4-H4
                  "10001000"
                  + // A3-H3
                  "01010000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._C1)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._C1))));
   }

   public void testBishopPathsFromD1() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000001"
                  + // A5-H5
                  "10000010"
                  + // A4-H4
                  "01000100"
                  + // A3-H3
                  "00101000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._D1)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._D1))));
   }

   public void testBishopPathsFromE1() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "10000000"
                  + // A5-H5
                  "01000001"
                  + // A4-H4
                  "00100010"
                  + // A3-H3
                  "00010100"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._E1)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._E1))));
   }

   public void testBishopPathsFromF1() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "10000000"
                  + // A6-H6
                  "01000000"
                  + // A5-H5
                  "00100000"
                  + // A4-H4
                  "00010001"
                  + // A3-H3
                  "00001010"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._F1)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._F1))));
   }

   public void testBishopPathsFromG1() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "10000000"
                  + // A7-H7
                  "01000000"
                  + // A6-H6
                  "00100000"
                  + // A5-H5
                  "00010000"
                  + // A4-H4
                  "00001000"
                  + // A3-H3
                  "00000101"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._G1)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._G1))));
   }

   public void testBishopPathsFromH1() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "10000000"
                  + // A8-H8
                  "01000000"
                  + // A7-H7
                  "00100000"
                  + // A6-H6
                  "00010000"
                  + // A5-H5
                  "00001000"
                  + // A4-H4
                  "00000100"
                  + // A3-H3
                  "00000010"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._H1)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._H1))));
   }

   public void testBishopPathsFromA2() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000010"
                  + // A8-H8
                  "00000100"
                  + // A7-H7
                  "00001000"
                  + // A6-H6
                  "00010000"
                  + // A5-H5
                  "00100000"
                  + // A4-H4
                  "01000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "01000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._A2)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._A2))));
   }

   public void testBishopPathsFromB2() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000001"
                  + // A8-H8
                  "00000010"
                  + // A7-H7
                  "00000100"
                  + // A6-H6
                  "00001000"
                  + // A5-H5
                  "00010000"
                  + // A4-H4
                  "10100000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "10100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._B2)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._B2))));
   }

   public void testBishopPathsFromC2() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000001"
                  + // A7-H7
                  "00000010"
                  + // A6-H6
                  "00000100"
                  + // A5-H5
                  "10001000"
                  + // A4-H4
                  "01010000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "01010000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._C2)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._C2))));
   }

   public void testBishopPathsFromD2() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000001"
                  + // A6-H6
                  "10000010"
                  + // A5-H5
                  "01000100"
                  + // A4-H4
                  "00101000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00101000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._D2)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._D2))));
   }

   public void testBishopPathsFromE2() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "10000000"
                  + // A6-H6
                  "01000001"
                  + // A5-H5
                  "00100010"
                  + // A4-H4
                  "00010100"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00010100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._E2)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._E2))));
   }

   public void testBishopPathsFromF2() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "10000000"
                  + // A7-H7
                  "01000000"
                  + // A6-H6
                  "00100000"
                  + // A5-H5
                  "00010001"
                  + // A4-H4
                  "00001010"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00001010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._F2)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._F2))));
   }

   public void testBishopPathsFromG2() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "10000000"
                  + // A8-H8
                  "01000000"
                  + // A7-H7
                  "00100000"
                  + // A6-H6
                  "00010000"
                  + // A5-H5
                  "00001000"
                  + // A4-H4
                  "00000101"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000101", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._G2)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._G2))));
   }

   public void testBishopPathsFromH2() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "01000000"
                  + // A8-H8
                  "00100000"
                  + // A7-H7
                  "00010000"
                  + // A6-H6
                  "00001000"
                  + // A5-H5
                  "00000100"
                  + // A4-H4
                  "00000010"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._H2)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._H2))));
   }

   public void testBishopPathsFromA3() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000100"
                  + // A8-H8
                  "00001000"
                  + // A7-H7
                  "00010000"
                  + // A6-H6
                  "00100000"
                  + // A5-H5
                  "01000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "01000000"
                  + // A2-H2
                  "00100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._A3)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._A3))));
   }

   public void testBishopPathsFromB3() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000010"
                  + // A8-H8
                  "00000100"
                  + // A7-H7
                  "00001000"
                  + // A6-H6
                  "00010000"
                  + // A5-H5
                  "10100000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "10100000"
                  + // A2-H2
                  "00010000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._B3)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._B3))));
   }

   public void testBishopPathsFromC3() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000001"
                  + // A8-H8
                  "00000010"
                  + // A7-H7
                  "00000100"
                  + // A6-H6
                  "10001000"
                  + // A5-H5
                  "01010000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "01010000"
                  + // A2-H2
                  "10001000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._C3)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._C3))));
   }

   public void testBishopPathsFromD3() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000001"
                  + // A7-H7
                  "10000010"
                  + // A6-H6
                  "01000100"
                  + // A5-H5
                  "00101000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00101000"
                  + // A2-H2
                  "01000100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._D3)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._D3))));
   }

   public void testBishopPathsFromE3() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "10000000"
                  + // A7-H7
                  "01000001"
                  + // A6-H6
                  "00100010"
                  + // A5-H5
                  "00010100"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00010100"
                  + // A2-H2
                  "00100010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._E3)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._E3))));
   }

   public void testBishopPathsFromF3() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "10000000"
                  + // A8-H8
                  "01000000"
                  + // A7-H7
                  "00100000"
                  + // A6-H6
                  "00010001"
                  + // A5-H5
                  "00001010"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00001010"
                  + // A2-H2
                  "00010001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._F3)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._F3))));
   }

   public void testBishopPathsFromG3() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "01000000"
                  + // A8-H8
                  "00100000"
                  + // A7-H7
                  "00010000"
                  + // A6-H6
                  "00001000"
                  + // A5-H5
                  "00000101"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000101"
                  + // A2-H2
                  "00001000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._G3)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._G3))));
   }

   public void testBishopPathsFromH3() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00100000"
                  + // A8-H8
                  "00010000"
                  + // A7-H7
                  "00001000"
                  + // A6-H6
                  "00000100"
                  + // A5-H5
                  "00000010"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000010"
                  + // A2-H2
                  "00000100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._H3)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._H3))));
   }

   public void testBishopPathsFromA4() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00001000"
                  + // A8-H8
                  "00010000"
                  + // A7-H7
                  "00100000"
                  + // A6-H6
                  "01000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "01000000"
                  + // A3-H3
                  "00100000"
                  + // A2-H2
                  "00010000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._A4)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._A4))));
   }

   public void testBishopPathsFromB4() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000100"
                  + // A8-H8
                  "00001000"
                  + // A7-H7
                  "00010000"
                  + // A6-H6
                  "10100000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "10100000"
                  + // A3-H3
                  "00010000"
                  + // A2-H2
                  "00001000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._B4)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._B4))));
   }

   public void testBishopPathsFromC4() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000010"
                  + // A8-H8
                  "00000100"
                  + // A7-H7
                  "10001000"
                  + // A6-H6
                  "01010000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "01010000"
                  + // A3-H3
                  "10001000"
                  + // A2-H2
                  "00000100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._C4)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._C4))));
   }

   public void testBishopPathsFromD4() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000001"
                  + // A8-H8
                  "10000010"
                  + // A7-H7
                  "01000100"
                  + // A6-H6
                  "00101000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00101000"
                  + // A3-H3
                  "01000100"
                  + // A2-H2
                  "10000010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._D4)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._D4))));
   }

   public void testBishopPathsFromE4() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "10000000"
                  + // A8-H8
                  "01000001"
                  + // A7-H7
                  "00100010"
                  + // A6-H6
                  "00010100"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00010100"
                  + // A3-H3
                  "00100010"
                  + // A2-H2
                  "01000001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._E4)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._E4))));
   }

   public void testBishopPathsFromF4() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "01000000"
                  + // A8-H8
                  "00100000"
                  + // A7-H7
                  "00010001"
                  + // A6-H6
                  "00001010"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00001010"
                  + // A3-H3
                  "00010001"
                  + // A2-H2
                  "00100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._F4)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._F4))));
   }

   public void testBishopPathsFromG4() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00100000"
                  + // A8-H8
                  "00010000"
                  + // A7-H7
                  "00001000"
                  + // A6-H6
                  "00000101"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000101"
                  + // A3-H3
                  "00001000"
                  + // A2-H2
                  "00010000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._G4)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._G4))));
   }

   public void testBishopPathsFromH4() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00010000"
                  + // A8-H8
                  "00001000"
                  + // A7-H7
                  "00000100"
                  + // A6-H6
                  "00000010"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000010"
                  + // A3-H3
                  "00000100"
                  + // A2-H2
                  "00001000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._H4)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._H4))));
   }

   public void testBishopPathsFromA5() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00010000"
                  + // A8-H8
                  "00100000"
                  + // A7-H7
                  "01000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "01000000"
                  + // A4-H4
                  "00100000"
                  + // A3-H3
                  "00010000"
                  + // A2-H2
                  "00001000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._A5)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._A5))));
   }

   public void testBishopPathsFromB5() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00001000"
                  + // A8-H8
                  "00010000"
                  + // A7-H7
                  "10100000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "10100000"
                  + // A4-H4
                  "00010000"
                  + // A3-H3
                  "00001000"
                  + // A2-H2
                  "00000100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._B5)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._B5))));
   }

   public void testBishopPathsFromC5() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000100"
                  + // A8-H8
                  "10001000"
                  + // A7-H7
                  "01010000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "01010000"
                  + // A4-H4
                  "10001000"
                  + // A3-H3
                  "00000100"
                  + // A2-H2
                  "00000010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._C5)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._C5))));
   }

   public void testBishopPathsFromD5() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "10000010"
                  + // A8-H8
                  "01000100"
                  + // A7-H7
                  "00101000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00101000"
                  + // A4-H4
                  "01000100"
                  + // A3-H3
                  "10000010"
                  + // A2-H2
                  "00000001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._D5)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._D5))));
   }

   public void testBishopPathsFromE5() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "01000001"
                  + // A8-H8
                  "00100010"
                  + // A7-H7
                  "00010100"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00010100"
                  + // A4-H4
                  "00100010"
                  + // A3-H3
                  "01000001"
                  + // A2-H2
                  "10000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._E5)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._E5))));
   }

   public void testBishopPathsFromF5() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00100000"
                  + // A8-H8
                  "00010001"
                  + // A7-H7
                  "00001010"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00001010"
                  + // A4-H4
                  "00010001"
                  + // A3-H3
                  "00100000"
                  + // A2-H2
                  "01000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._F5)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._F5))));
   }

   public void testBishopPathsFromG5() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00010000"
                  + // A8-H8
                  "00001000"
                  + // A7-H7
                  "00000101"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000101"
                  + // A4-H4
                  "00001000"
                  + // A3-H3
                  "00010000"
                  + // A2-H2
                  "00100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._G5)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._G5))));
   }

   public void testBishopPathsFromH5() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00001000"
                  + // A8-H8
                  "00000100"
                  + // A7-H7
                  "00000010"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000010"
                  + // A4-H4
                  "00000100"
                  + // A3-H3
                  "00001000"
                  + // A2-H2
                  "00010000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._H5)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._H5))));
   }

   public void testBishopPathsFromA6() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00100000"
                  + // A8-H8
                  "01000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "01000000"
                  + // A5-H5
                  "00100000"
                  + // A4-H4
                  "00010000"
                  + // A3-H3
                  "00001000"
                  + // A2-H2
                  "00000100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._A6)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._A6))));
   }

   public void testBishopPathsFromB6() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00010000"
                  + // A8-H8
                  "10100000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "10100000"
                  + // A5-H5
                  "00010000"
                  + // A4-H4
                  "00001000"
                  + // A3-H3
                  "00000100"
                  + // A2-H2
                  "00000010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._B6)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._B6))));
   }

   public void testBishopPathsFromC6() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "10001000"
                  + // A8-H8
                  "01010000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "01010000"
                  + // A5-H5
                  "10001000"
                  + // A4-H4
                  "00000100"
                  + // A3-H3
                  "00000010"
                  + // A2-H2
                  "00000001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._C6)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._C6))));
   }

   public void testBishopPathsFromD6() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "01000100"
                  + // A8-H8
                  "00101000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00101000"
                  + // A5-H5
                  "01000100"
                  + // A4-H4
                  "10000010"
                  + // A3-H3
                  "00000001"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._D6)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._D6))));
   }

   public void testBishopPathsFromE6() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00100010"
                  + // A8-H8
                  "00010100"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00010100"
                  + // A5-H5
                  "00100010"
                  + // A4-H4
                  "01000001"
                  + // A3-H3
                  "10000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._E6)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._E6))));
   }

   public void testBishopPathsFromF6() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00010001"
                  + // A8-H8
                  "00001010"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00001010"
                  + // A5-H5
                  "00010001"
                  + // A4-H4
                  "00100000"
                  + // A3-H3
                  "01000000"
                  + // A2-H2
                  "10000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._F6)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._F6))));
   }

   public void testBishopPathsFromG6() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00001000"
                  + // A8-H8
                  "00000101"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000101"
                  + // A5-H5
                  "00001000"
                  + // A4-H4
                  "00010000"
                  + // A3-H3
                  "00100000"
                  + // A2-H2
                  "01000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._G6)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._G6))));
   }

   public void testBishopPathsFromH6() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000100"
                  + // A8-H8
                  "00000010"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000010"
                  + // A5-H5
                  "00000100"
                  + // A4-H4
                  "00001000"
                  + // A3-H3
                  "00010000"
                  + // A2-H2
                  "00100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._H6)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._H6))));
   }

   public void testBishopPathsFromA7() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "01000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "01000000"
                  + // A6-H6
                  "00100000"
                  + // A5-H5
                  "00010000"
                  + // A4-H4
                  "00001000"
                  + // A3-H3
                  "00000100"
                  + // A2-H2
                  "00000010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._A7)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._A7))));
   }

   public void testBishopPathsFromB7() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "10100000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "10100000"
                  + // A6-H6
                  "00010000"
                  + // A5-H5
                  "00001000"
                  + // A4-H4
                  "00000100"
                  + // A3-H3
                  "00000010"
                  + // A2-H2
                  "00000001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._B7)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._B7))));
   }

   public void testBishopPathsFromC7() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "01010000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "01010000"
                  + // A6-H6
                  "10001000"
                  + // A5-H5
                  "00000100"
                  + // A4-H4
                  "00000010"
                  + // A3-H3
                  "00000001"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._C7)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._C7))));
   }

   public void testBishopPathsFromD7() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00101000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00101000"
                  + // A6-H6
                  "01000100"
                  + // A5-H5
                  "10000010"
                  + // A4-H4
                  "00000001"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._D7)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._D7))));
   }

   public void testBishopPathsFromE7() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00010100"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00010100"
                  + // A6-H6
                  "00100010"
                  + // A5-H5
                  "01000001"
                  + // A4-H4
                  "10000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._E7)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._E7))));
   }

   public void testBishopPathsFromF7() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00001010"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00001010"
                  + // A6-H6
                  "00010001"
                  + // A5-H5
                  "00100000"
                  + // A4-H4
                  "01000000"
                  + // A3-H3
                  "10000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._F7)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._F7))));
   }

   public void testBishopPathsFromG7() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000101"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000101"
                  + // A6-H6
                  "00001000"
                  + // A5-H5
                  "00010000"
                  + // A4-H4
                  "00100000"
                  + // A3-H3
                  "01000000"
                  + // A2-H2
                  "10000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._G7)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._G7))));
   }

   public void testBishopPathsFromH7() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000010"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000010"
                  + // A6-H6
                  "00000100"
                  + // A5-H5
                  "00001000"
                  + // A4-H4
                  "00010000"
                  + // A3-H3
                  "00100000"
                  + // A2-H2
                  "01000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._H7)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._H7))));
   }

   public void testBishopPathsFromA8() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "01000000"
                  + // A7-H7
                  "00100000"
                  + // A6-H6
                  "00010000"
                  + // A5-H5
                  "00001000"
                  + // A4-H4
                  "00000100"
                  + // A3-H3
                  "00000010"
                  + // A2-H2
                  "00000001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._A8)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._A8))));
   }

   public void testBishopPathsFromB8() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "10100000"
                  + // A7-H7
                  "00010000"
                  + // A6-H6
                  "00001000"
                  + // A5-H5
                  "00000100"
                  + // A4-H4
                  "00000010"
                  + // A3-H3
                  "00000001"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._B8)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._B8))));
   }

   public void testBishopPathsFromC8() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "01010000"
                  + // A7-H7
                  "10001000"
                  + // A6-H6
                  "00000100"
                  + // A5-H5
                  "00000010"
                  + // A4-H4
                  "00000001"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._C8)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._C8))));
   }

   public void testBishopPathsFromD8() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00101000"
                  + // A7-H7
                  "01000100"
                  + // A6-H6
                  "10000010"
                  + // A5-H5
                  "00000001"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._D8)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._D8))));
   }

   public void testBishopPathsFromE8() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00010100"
                  + // A7-H7
                  "00100010"
                  + // A6-H6
                  "01000001"
                  + // A5-H5
                  "10000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._E8)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._E8))));
   }

   public void testBishopPathsFromF8() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00001010"
                  + // A7-H7
                  "00010001"
                  + // A6-H6
                  "00100000"
                  + // A5-H5
                  "01000000"
                  + // A4-H4
                  "10000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._F8)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._F8))));
   }

   public void testBishopPathsFromG8() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000101"
                  + // A7-H7
                  "00001000"
                  + // A6-H6
                  "00010000"
                  + // A5-H5
                  "00100000"
                  + // A4-H4
                  "01000000"
                  + // A3-H3
                  "10000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._G8)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._G8))));
   }

   public void testBishopPathsFromH8() {
      Bishop bishop= Bishops.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000010"
                  + // A7-H7
                  "00000100"
                  + // A6-H6
                  "00001000"
                  + // A5-H5
                  "00010000"
                  + // A4-H4
                  "00100000"
                  + // A3-H3
                  "01000000"
                  + // A2-H2
                  "10000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishop.getPathsFrom(Square._H8)).length() - 1] + Long
                  .toBinaryString(bishop.getPathsFrom(Square._H8))));
   }

}