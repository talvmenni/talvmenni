package org.forritan.talvmenni.bitboard.paths;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.forritan.talvmenni.bitboard.Square;


public class WhiteEnpassantTest extends TestCase {

   private final String[] zeroPrefix = new String[64];

   public WhiteEnpassantTest() {
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

   public void testWhiteEnpassantPathsFromA1() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._A1)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._A1))));
   }

   public void testWhiteEnpassantPathsFromB1() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._B1)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._B1))));
   }

   public void testWhiteEnpassantPathsFromC1() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._C1)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._C1))));
   }

   public void testWhiteEnpassantPathsFromD1() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._D1)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._D1))));
   }

   public void testWhiteEnpassantPathsFromE1() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._E1)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._E1))));
   }

   public void testWhiteEnpassantPathsFromF1() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._F1)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._F1))));
   }

   public void testWhiteEnpassantPathsFromG1() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._G1)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._G1))));
   }

   public void testWhiteEnpassantPathsFromH1() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._H1)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._H1))));
   }

   public void testWhiteEnpassantPathsFromA2() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "10000000"
                  + // A4-H4
                  "10000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._A2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._A2))));
   }

   public void testWhiteEnpassantPathsFromB2() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "01000000"
                  + // A4-H4
                  "01000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._B2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._B2))));
   }

   public void testWhiteEnpassantPathsFromC2() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00100000"
                  + // A4-H4
                  "00100000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._C2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._C2))));
   }

   public void testWhiteEnpassantPathsFromD2() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00010000"
                  + // A4-H4
                  "00010000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._D2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._D2))));
   }

   public void testWhiteEnpassantPathsFromE2() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00001000"
                  + // A4-H4
                  "00001000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._E2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._E2))));
   }

   public void testWhiteEnpassantPathsFromF2() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000100"
                  + // A4-H4
                  "00000100"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._F2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._F2))));
   }

   public void testWhiteEnpassantPathsFromG2() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000010"
                  + // A4-H4
                  "00000010"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._G2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._G2))));
   }

   public void testWhiteEnpassantPathsFromH2() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000001"
                  + // A4-H4
                  "00000001"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._H2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._H2))));
   }

   public void testWhiteEnpassantPathsFromA3() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._A3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._A3))));
   }

   public void testWhiteEnpassantPathsFromB3() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._B3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._B3))));
   }

   public void testWhiteEnpassantPathsFromC3() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._C3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._C3))));
   }

   public void testWhiteEnpassantPathsFromD3() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._D3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._D3))));
   }

   public void testWhiteEnpassantPathsFromE3() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._E3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._E3))));
   }

   public void testWhiteEnpassantPathsFromF3() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._F3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._F3))));
   }

   public void testWhiteEnpassantPathsFromG3() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._G3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._G3))));
   }

   public void testWhiteEnpassantPathsFromH3() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._H3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._H3))));
   }

   public void testWhiteEnpassantPathsFromA4() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._A4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._A4))));
   }

   public void testWhiteEnpassantPathsFromB4() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._B4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._B4))));
   }

   public void testWhiteEnpassantPathsFromC4() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._C4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._C4))));
   }

   public void testWhiteEnpassantPathsFromD4() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._D4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._D4))));
   }

   public void testWhiteEnpassantPathsFromE4() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._E4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._E4))));
   }

   public void testWhiteEnpassantPathsFromF4() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._F4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._F4))));
   }

   public void testWhiteEnpassantPathsFromG4() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._G4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._G4))));
   }

   public void testWhiteEnpassantPathsFromH4() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._H4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._H4))));
   }

   public void testWhiteEnpassantPathsFromA5() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._A5)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._A5))));
   }

   public void testWhiteEnpassantPathsFromB5() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._B5)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._B5))));
   }

   public void testWhiteEnpassantPathsFromC5() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._C5)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._C5))));
   }

   public void testWhiteEnpassantPathsFromD5() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._D5)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._D5))));
   }

   public void testWhiteEnpassantPathsFromE5() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._E5)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._E5))));
   }

   public void testWhiteEnpassantPathsFromF5() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._F5)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._F5))));
   }

   public void testWhiteEnpassantPathsFromG5() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._G5)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._G5))));
   }

   public void testWhiteEnpassantPathsFromH5() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._H5)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._H5))));
   }

   public void testWhiteEnpassantPathsFromA6() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._A6)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._A6))));
   }

   public void testWhiteEnpassantPathsFromB6() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._B6)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._B6))));
   }

   public void testWhiteEnpassantPathsFromC6() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._C6)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._C6))));
   }

   public void testWhiteEnpassantPathsFromD6() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._D6)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._D6))));
   }

   public void testWhiteEnpassantPathsFromE6() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._E6)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._E6))));
   }

   public void testWhiteEnpassantPathsFromF6() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._F6)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._F6))));
   }

   public void testWhiteEnpassantPathsFromG6() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._G6)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._G6))));
   }

   public void testWhiteEnpassantPathsFromH6() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._H6)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._H6))));
   }

   public void testWhiteEnpassantPathsFromA7() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._A7)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._A7))));
   }

   public void testWhiteEnpassantPathsFromB7() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._B7)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._B7))));
   }

   public void testWhiteEnpassantPathsFromC7() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._C7)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._C7))));
   }

   public void testWhiteEnpassantPathsFromD7() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._D7)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._D7))));
   }

   public void testWhiteEnpassantPathsFromE7() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._E7)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._E7))));
   }

   public void testWhiteEnpassantPathsFromF7() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._F7)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._F7))));
   }

   public void testWhiteEnpassantPathsFromG7() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._G7)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._G7))));
   }

   public void testWhiteEnpassantPathsFromH7() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._H7)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._H7))));
   }

   public void testWhiteEnpassantPathsFromA8() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._A8)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._A8))));
   }

   public void testWhiteEnpassantPathsFromB8() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._B8)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._B8))));
   }

   public void testWhiteEnpassantPathsFromC8() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._C8)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._C8))));
   }

   public void testWhiteEnpassantPathsFromD8() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._D8)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._D8))));
   }

   public void testWhiteEnpassantPathsFromE8() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._E8)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._E8))));
   }

   public void testWhiteEnpassantPathsFromF8() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._F8)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._F8))));
   }

   public void testWhiteEnpassantPathsFromG8() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._G8)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._G8))));
   }

   public void testWhiteEnpassantPathsFromH8() {
      Enpassant pawn= WhiteEnpassants.create();
      Assert.assertEquals(
            ""
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._H8)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._H8))));
   }

}