package org.forritan.talvmenni.bitboard.paths;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.forritan.talvmenni.bitboard.Square;


public class WhitePawnMoveTest extends TestCase {

   private final String[] zeroPrefix = new String[64];

   public WhitePawnMoveTest() {
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

   public void testWhitePawnPathsFromA1() {
      Pawn pawnMove= WhitePawnMoves.create();
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
                  pawnMove.getPathsFrom(Square._A1)).length() - 1] + Long
                  .toBinaryString(pawnMove.getPathsFrom(Square._A1))));
   }

   public void testWhitePawnPathsFromB1() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromC1() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromD1() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromE1() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromF1() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromG1() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromH1() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromA2() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromB2() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromC2() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromD2() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromE2() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromF2() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromG2() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromH2() {
      Pawn pawn= WhitePawnMoves.create();
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
   
   public void testWhitePawnPathsFromA3() {
      Pawn pawn= WhitePawnMoves.create();
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
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._A3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._A3))));
   }

   public void testWhitePawnPathsFromB3() {
      Pawn pawn= WhitePawnMoves.create();
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
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._B3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._B3))));
   }

   public void testWhitePawnPathsFromC3() {
      Pawn pawn= WhitePawnMoves.create();
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
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._C3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._C3))));
   }

   public void testWhitePawnPathsFromD3() {
      Pawn pawn= WhitePawnMoves.create();
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
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._D3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._D3))));
   }

   public void testWhitePawnPathsFromE3() {
      Pawn pawn= WhitePawnMoves.create();
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
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._E3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._E3))));
   }

   public void testWhitePawnPathsFromF3() {
      Pawn pawn= WhitePawnMoves.create();
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
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._F3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._F3))));
   }

   public void testWhitePawnPathsFromG3() {
      Pawn pawn= WhitePawnMoves.create();
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
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._G3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._G3))));
   }

   public void testWhitePawnPathsFromH3() {
      Pawn pawn= WhitePawnMoves.create();
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
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._H3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._H3))));
   }

   public void testWhitePawnPathsFromA4() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromB4() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
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
                  pawn.getPathsFrom(Square._B4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._B4))));
   }

   public void testWhitePawnPathsFromC4() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
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
                  pawn.getPathsFrom(Square._C4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._C4))));
   }

   public void testWhitePawnPathsFromD4() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
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
                  pawn.getPathsFrom(Square._D4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._D4))));
   }

   public void testWhitePawnPathsFromE4() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
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
                  pawn.getPathsFrom(Square._E4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._E4))));
   }

   public void testWhitePawnPathsFromF4() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
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
                  pawn.getPathsFrom(Square._F4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._F4))));
   }

   public void testWhitePawnPathsFromG4() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
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
                  pawn.getPathsFrom(Square._G4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._G4))));
   }

   public void testWhitePawnPathsFromH4() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromA5() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "10000000"
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

   public void testWhitePawnPathsFromB5() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "01000000"
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

   public void testWhitePawnPathsFromC5() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00100000"
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

   public void testWhitePawnPathsFromD5() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00010000"
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

   public void testWhitePawnPathsFromE5() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00001000"
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

   public void testWhitePawnPathsFromF5() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000100"
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

   public void testWhitePawnPathsFromG5() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000010"
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

   public void testWhitePawnPathsFromH5() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000001"
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

   public void testWhitePawnPathsFromA6() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "10000000"
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

   public void testWhitePawnPathsFromB6() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "01000000"
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

   public void testWhitePawnPathsFromC6() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00100000"
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

   public void testWhitePawnPathsFromD6() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00010000"
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

   public void testWhitePawnPathsFromE6() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00001000"
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

   public void testWhitePawnPathsFromF6() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000100"
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

   public void testWhitePawnPathsFromG6() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000010"
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

   public void testWhitePawnPathsFromH6() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000001"
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

   public void testWhitePawnPathsFromA7() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "10000000"
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

   public void testWhitePawnPathsFromB7() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "01000000"
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

   public void testWhitePawnPathsFromC7() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00100000"
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

   public void testWhitePawnPathsFromD7() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00010000"
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

   public void testWhitePawnPathsFromE7() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00001000"
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

   public void testWhitePawnPathsFromF7() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000100"
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

   public void testWhitePawnPathsFromG7() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000010"
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

   public void testWhitePawnPathsFromH7() {
      Pawn pawn= WhitePawnMoves.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000001"
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

   public void testWhitePawnPathsFromA8() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromB8() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromC8() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromD8() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromE8() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromF8() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromG8() {
      Pawn pawn= WhitePawnMoves.create();
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

   public void testWhitePawnPathsFromH8() {
      Pawn pawn= WhitePawnMoves.create();
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