package org.forritan.talvmenni.bitboard.paths;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.forritan.talvmenni.bitboard.Square;


public class BlackEnpassantTest extends TestCase {

   private final String[] zeroPrefix = new String[64];

   public BlackEnpassantTest() {
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

   public void testBlackEnpassantPathsFromA1() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromB1() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromC1() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromD1() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromE1() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromF1() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromG1() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromH1() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromA2() {
      Enpassant pawn= BlackEnpassants.create();
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
                  pawn.getPathsFrom(Square._A2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._A2))));
   }

   public void testBlackEnpassantPathsFromB2() {
      Enpassant pawn= BlackEnpassants.create();
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
                  pawn.getPathsFrom(Square._B2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._B2))));
   }

   public void testBlackEnpassantPathsFromC2() {
      Enpassant pawn= BlackEnpassants.create();
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
                  pawn.getPathsFrom(Square._C2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._C2))));
   }

   public void testBlackEnpassantPathsFromD2() {
      Enpassant pawn= BlackEnpassants.create();
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
                  pawn.getPathsFrom(Square._D2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._D2))));
   }

   public void testBlackEnpassantPathsFromE2() {
      Enpassant pawn= BlackEnpassants.create();
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
                  pawn.getPathsFrom(Square._E2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._E2))));
   }

   public void testBlackEnpassantPathsFromF2() {
      Enpassant pawn= BlackEnpassants.create();
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
                  pawn.getPathsFrom(Square._F2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._F2))));
   }

   public void testBlackEnpassantPathsFromG2() {
      Enpassant pawn= BlackEnpassants.create();
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
                  pawn.getPathsFrom(Square._G2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._G2))));
   }

   public void testBlackEnpassantPathsFromH2() {
      Enpassant pawn= BlackEnpassants.create();
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
                  pawn.getPathsFrom(Square._H2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._H2))));
   }

   public void testBlackEnpassantPathsFromA3() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromB3() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromC3() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromD3() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromE3() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromF3() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromG3() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromH3() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromA4() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromB4() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromC4() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromD4() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromE4() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromF4() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromG4() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromH4() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromA5() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromB5() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromC5() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromD5() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromE5() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromF5() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromG5() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromH5() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromA6() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromB6() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromC6() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromD6() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromE6() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromF6() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromG6() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromH6() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromA7() {
      Enpassant pawn= BlackEnpassants.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "10000000"
                  + // A6-H6
                  "10000000"
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

   public void testBlackEnpassantPathsFromB7() {
      Enpassant pawn= BlackEnpassants.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "01000000"
                  + // A6-H6
                  "01000000"
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

   public void testBlackEnpassantPathsFromC7() {
      Enpassant pawn= BlackEnpassants.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00100000"
                  + // A6-H6
                  "00100000"
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

   public void testBlackEnpassantPathsFromD7() {
      Enpassant pawn= BlackEnpassants.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00010000"
                  + // A6-H6
                  "00010000"
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

   public void testBlackEnpassantPathsFromE7() {
      Enpassant pawn= BlackEnpassants.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00001000"
                  + // A6-H6
                  "00001000"
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

   public void testBlackEnpassantPathsFromF7() {
      Enpassant pawn= BlackEnpassants.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000100"
                  + // A6-H6
                  "00000100"
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

   public void testBlackEnpassantPathsFromG7() {
      Enpassant pawn= BlackEnpassants.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000010"
                  + // A6-H6
                  "00000010"
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

   public void testBlackEnpassantPathsFromH7() {
      Enpassant pawn= BlackEnpassants.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000001"
                  + // A6-H6
                  "00000001"
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

   public void testBlackEnpassantPathsFromA8() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromB8() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromC8() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromD8() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromE8() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromF8() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromG8() {
      Enpassant pawn= BlackEnpassants.create();
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

   public void testBlackEnpassantPathsFromH8() {
      Enpassant pawn= BlackEnpassants.create();
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