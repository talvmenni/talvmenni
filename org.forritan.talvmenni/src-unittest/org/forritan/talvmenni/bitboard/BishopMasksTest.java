package org.forritan.talvmenni.bitboard;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.forritan.talvmenni.bitboard.Square;


public class BishopMasksTest extends TestCase {

   private final String[] zeroPrefix = new String[64];

   public BishopMasksTest() {
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

   public void testNorthWest2SouthEastMaskFromA8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._A8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._A8))));
   }

   public void testNorthWest2SouthEastMaskFromA7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "01111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._A7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._A7))));
   }

   public void testNorthWest2SouthEastMaskFromB8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "01111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._B8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._B8))));
   }

   public void testNorthWest2SouthEastMaskFromA6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00111111"
            + // A8-H8
            "01111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._A6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._A6))));
   }

   public void testNorthWest2SouthEastMaskFromB7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00111111"
            + // A8-H8
            "01111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._B7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._B7))));
   }

   public void testNorthWest2SouthEastMaskFromC8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00111111"
            + // A8-H8
            "01111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._C8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._C8))));
   }

   public void testNorthWest2SouthEastMaskFromA5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00011111"
            + // A8-H8
            "00111111"
            + // A7-H7
            "01111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._A5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._A5))));
   }

   public void testNorthWest2SouthEastMaskFromB6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00011111"
            + // A8-H8
            "00111111"
            + // A7-H7
            "01111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._B6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._B6))));
   }

   public void testNorthWest2SouthEastMaskFromC7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00011111"
            + // A8-H8
            "00111111"
            + // A7-H7
            "01111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._C7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._C7))));
   }

   public void testNorthWest2SouthEastMaskFromD8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00011111"
            + // A8-H8
            "00111111"
            + // A7-H7
            "01111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._D8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._D8))));
   }

   public void testNorthWest2SouthEastMaskFromA4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00001111"
            + // A8-H8
            "00011111"
            + // A7-H7
            "00111111"
            + // A6-H6
            "01111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._A4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._A4))));
   }

   public void testNorthWest2SouthEastMaskFromB5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00001111"
            + // A8-H8
            "00011111"
            + // A7-H7
            "00111111"
            + // A6-H6
            "01111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._B5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._B5))));
   }

   public void testNorthWest2SouthEastMaskFromC6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00001111"
            + // A8-H8
            "00011111"
            + // A7-H7
            "00111111"
            + // A6-H6
            "01111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._C6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._C6))));
   }

   public void testNorthWest2SouthEastMaskFromD7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00001111"
            + // A8-H8
            "00011111"
            + // A7-H7
            "00111111"
            + // A6-H6
            "01111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._D7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._D7))));
   }

   public void testNorthWest2SouthEastMaskFromE8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00001111"
            + // A8-H8
            "00011111"
            + // A7-H7
            "00111111"
            + // A6-H6
            "01111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._E8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._E8))));
   }

   public void testNorthWest2SouthEastMaskFromA3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000111"
            + // A8-H8
            "00001111"
            + // A7-H7
            "00011111"
            + // A6-H6
            "00111111"
            + // A5-H5
            "01111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._A3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._A3))));
   }

   public void testNorthWest2SouthEastMaskFromB4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000111"
            + // A8-H8
            "00001111"
            + // A7-H7
            "00011111"
            + // A6-H6
            "00111111"
            + // A5-H5
            "01111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._B4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._B4))));
   }

   public void testNorthWest2SouthEastMaskFromC5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000111"
            + // A8-H8
            "00001111"
            + // A7-H7
            "00011111"
            + // A6-H6
            "00111111"
            + // A5-H5
            "01111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._C5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._C5))));
   }

   public void testNorthWest2SouthEastMaskFromD6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000111"
            + // A8-H8
            "00001111"
            + // A7-H7
            "00011111"
            + // A6-H6
            "00111111"
            + // A5-H5
            "01111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._D6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._D6))));
   }

   public void testNorthWest2SouthEastMaskFromE7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000111"
            + // A8-H8
            "00001111"
            + // A7-H7
            "00011111"
            + // A6-H6
            "00111111"
            + // A5-H5
            "01111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._E7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._E7))));
   }

   public void testNorthWest2SouthEastMaskFromF8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000111"
            + // A8-H8
            "00001111"
            + // A7-H7
            "00011111"
            + // A6-H6
            "00111111"
            + // A5-H5
            "01111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._F8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._F8))));
   }
   public void testNorthWest2SouthEastMaskFromA2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000011"
            + // A8-H8
            "00000111"
            + // A7-H7
            "00001111"
            + // A6-H6
            "00011111"
            + // A5-H5
            "00111111"
            + // A4-H4
            "01111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._A2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._A2))));
   }
   public void testNorthWest2SouthEastMaskFromB3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000011"
            + // A8-H8
            "00000111"
            + // A7-H7
            "00001111"
            + // A6-H6
            "00011111"
            + // A5-H5
            "00111111"
            + // A4-H4
            "01111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._B3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._B3))));
   }
   public void testNorthWest2SouthEastMaskFromC4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000011"
            + // A8-H8
            "00000111"
            + // A7-H7
            "00001111"
            + // A6-H6
            "00011111"
            + // A5-H5
            "00111111"
            + // A4-H4
            "01111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._C4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._C4))));
   }
   public void testNorthWest2SouthEastMaskFromD5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000011"
            + // A8-H8
            "00000111"
            + // A7-H7
            "00001111"
            + // A6-H6
            "00011111"
            + // A5-H5
            "00111111"
            + // A4-H4
            "01111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._D5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._D5))));
   }
   public void testNorthWest2SouthEastMaskFromE6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000011"
            + // A8-H8
            "00000111"
            + // A7-H7
            "00001111"
            + // A6-H6
            "00011111"
            + // A5-H5
            "00111111"
            + // A4-H4
            "01111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._E6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._E6))));
   }
   public void testNorthWest2SouthEastMaskFromF7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000011"
            + // A8-H8
            "00000111"
            + // A7-H7
            "00001111"
            + // A6-H6
            "00011111"
            + // A5-H5
            "00111111"
            + // A4-H4
            "01111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._F7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._F7))));
   }
   public void testNorthWest2SouthEastMaskFromG8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000011"
            + // A8-H8
            "00000111"
            + // A7-H7
            "00001111"
            + // A6-H6
            "00011111"
            + // A5-H5
            "00111111"
            + // A4-H4
            "01111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._G8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._G8))));
   }
   public void testNorthWest2SouthEastMaskFromA1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000001"
            + // A8-H8
            "00000011"
            + // A7-H7
            "00000111"
            + // A6-H6
            "00001111"
            + // A5-H5
            "00011111"
            + // A4-H4
            "00111111"
            + // A3-H3
            "01111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._A1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._A1))));
   }
   public void testNorthWest2SouthEastMaskFromB2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000001"
            + // A8-H8
            "00000011"
            + // A7-H7
            "00000111"
            + // A6-H6
            "00001111"
            + // A5-H5
            "00011111"
            + // A4-H4
            "00111111"
            + // A3-H3
            "01111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._B2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._B2))));
   }
   public void testNorthWest2SouthEastMaskFromC3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000001"
            + // A8-H8
            "00000011"
            + // A7-H7
            "00000111"
            + // A6-H6
            "00001111"
            + // A5-H5
            "00011111"
            + // A4-H4
            "00111111"
            + // A3-H3
            "01111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._C3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._C3))));
   }
   public void testNorthWest2SouthEastMaskFromD4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000001"
            + // A8-H8
            "00000011"
            + // A7-H7
            "00000111"
            + // A6-H6
            "00001111"
            + // A5-H5
            "00011111"
            + // A4-H4
            "00111111"
            + // A3-H3
            "01111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._D4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._D4))));
   }
   public void testNorthWest2SouthEastMaskFromE5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000001"
            + // A8-H8
            "00000011"
            + // A7-H7
            "00000111"
            + // A6-H6
            "00001111"
            + // A5-H5
            "00011111"
            + // A4-H4
            "00111111"
            + // A3-H3
            "01111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._E5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._E5))));
   }
   public void testNorthWest2SouthEastMaskFromF6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000001"
            + // A8-H8
            "00000011"
            + // A7-H7
            "00000111"
            + // A6-H6
            "00001111"
            + // A5-H5
            "00011111"
            + // A4-H4
            "00111111"
            + // A3-H3
            "01111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._F6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._F6))));
   }
   public void testNorthWest2SouthEastMaskFromG7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000001"
            + // A8-H8
            "00000011"
            + // A7-H7
            "00000111"
            + // A6-H6
            "00001111"
            + // A5-H5
            "00011111"
            + // A4-H4
            "00111111"
            + // A3-H3
            "01111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._G7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._G7))));
   }
   public void testNorthWest2SouthEastMaskFromH8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000001"
            + // A8-H8
            "00000011"
            + // A7-H7
            "00000111"
            + // A6-H6
            "00001111"
            + // A5-H5
            "00011111"
            + // A4-H4
            "00111111"
            + // A3-H3
            "01111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._H8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._H8))));
   }
   public void testNorthWest2SouthEastMaskFromB1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000001"
            + // A7-H7
            "00000011"
            + // A6-H6
            "00000111"
            + // A5-H5
            "00001111"
            + // A4-H4
            "00011111"
            + // A3-H3
            "00111111"
            + // A2-H2
            "01111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._B1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._B1))));
   }
   public void testNorthWest2SouthEastMaskFromC2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000001"
            + // A7-H7
            "00000011"
            + // A6-H6
            "00000111"
            + // A5-H5
            "00001111"
            + // A4-H4
            "00011111"
            + // A3-H3
            "00111111"
            + // A2-H2
            "01111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._C2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._C2))));
   }
   public void testNorthWest2SouthEastMaskFromD3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000001"
            + // A7-H7
            "00000011"
            + // A6-H6
            "00000111"
            + // A5-H5
            "00001111"
            + // A4-H4
            "00011111"
            + // A3-H3
            "00111111"
            + // A2-H2
            "01111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._D3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._D3))));
   }
   public void testNorthWest2SouthEastMaskFromE4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000001"
            + // A7-H7
            "00000011"
            + // A6-H6
            "00000111"
            + // A5-H5
            "00001111"
            + // A4-H4
            "00011111"
            + // A3-H3
            "00111111"
            + // A2-H2
            "01111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._E4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._E4))));
   }
   public void testNorthWest2SouthEastMaskFromF5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000001"
            + // A7-H7
            "00000011"
            + // A6-H6
            "00000111"
            + // A5-H5
            "00001111"
            + // A4-H4
            "00011111"
            + // A3-H3
            "00111111"
            + // A2-H2
            "01111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._F5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._F5))));
   }
   public void testNorthWest2SouthEastMaskFromG6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000001"
            + // A7-H7
            "00000011"
            + // A6-H6
            "00000111"
            + // A5-H5
            "00001111"
            + // A4-H4
            "00011111"
            + // A3-H3
            "00111111"
            + // A2-H2
            "01111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._G6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._G6))));
   }
   public void testNorthWest2SouthEastMaskFromH7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000001"
            + // A7-H7
            "00000011"
            + // A6-H6
            "00000111"
            + // A5-H5
            "00001111"
            + // A4-H4
            "00011111"
            + // A3-H3
            "00111111"
            + // A2-H2
            "01111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._H7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._H7))));
   }
   public void testNorthWest2SouthEastMaskFromC1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000001"
            + // A6-H6
            "00000011"
            + // A5-H5
            "00000111"
            + // A4-H4
            "00001111"
            + // A3-H3
            "00011111"
            + // A2-H2
            "00111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._C1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._C1))));
   }
   public void testNorthWest2SouthEastMaskFromD2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000001"
            + // A6-H6
            "00000011"
            + // A5-H5
            "00000111"
            + // A4-H4
            "00001111"
            + // A3-H3
            "00011111"
            + // A2-H2
            "00111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._D2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._D2))));
   }
   public void testNorthWest2SouthEastMaskFromE3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000001"
            + // A6-H6
            "00000011"
            + // A5-H5
            "00000111"
            + // A4-H4
            "00001111"
            + // A3-H3
            "00011111"
            + // A2-H2
            "00111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._E3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._E3))));
   }
   public void testNorthWest2SouthEastMaskFromF4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000001"
            + // A6-H6
            "00000011"
            + // A5-H5
            "00000111"
            + // A4-H4
            "00001111"
            + // A3-H3
            "00011111"
            + // A2-H2
            "00111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._F4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._F4))));
   }
   public void testNorthWest2SouthEastMaskFromG5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000001"
            + // A6-H6
            "00000011"
            + // A5-H5
            "00000111"
            + // A4-H4
            "00001111"
            + // A3-H3
            "00011111"
            + // A2-H2
            "00111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._G5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._G5))));
   }
   public void testNorthWest2SouthEastMaskFromH6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000001"
            + // A6-H6
            "00000011"
            + // A5-H5
            "00000111"
            + // A4-H4
            "00001111"
            + // A3-H3
            "00011111"
            + // A2-H2
            "00111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._H6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._H6))));
   }
   public void testNorthWest2SouthEastMaskFromD1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00000001"
            + // A5-H5
            "00000011"
            + // A4-H4
            "00000111"
            + // A3-H3
            "00001111"
            + // A2-H2
            "00011111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._D1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._D1))));
   }
   public void testNorthWest2SouthEastMaskFromE2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00000001"
            + // A5-H5
            "00000011"
            + // A4-H4
            "00000111"
            + // A3-H3
            "00001111"
            + // A2-H2
            "00011111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._E2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._E2))));
   }
   public void testNorthWest2SouthEastMaskFromF3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00000001"
            + // A5-H5
            "00000011"
            + // A4-H4
            "00000111"
            + // A3-H3
            "00001111"
            + // A2-H2
            "00011111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._F3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._F3))));
   }
   public void testNorthWest2SouthEastMaskFromG4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00000001"
            + // A5-H5
            "00000011"
            + // A4-H4
            "00000111"
            + // A3-H3
            "00001111"
            + // A2-H2
            "00011111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._G4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._G4))));
   }
   public void testNorthWest2SouthEastMaskFromH5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00000001"
            + // A5-H5
            "00000011"
            + // A4-H4
            "00000111"
            + // A3-H3
            "00001111"
            + // A2-H2
            "00011111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._H5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._H5))));
   }
   public void testNorthWest2SouthEastMaskFromE1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
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
            "00000011"
            + // A3-H3
            "00000111"
            + // A2-H2
            "00001111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._E1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._E1))));
   }
   public void testNorthWest2SouthEastMaskFromF2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
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
            "00000011"
            + // A3-H3
            "00000111"
            + // A2-H2
            "00001111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._F2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._F2))));
   }
   public void testNorthWest2SouthEastMaskFromG3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
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
            "00000011"
            + // A3-H3
            "00000111"
            + // A2-H2
            "00001111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._G3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._G3))));
   }
   public void testNorthWest2SouthEastMaskFromH4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
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
            "00000011"
            + // A3-H3
            "00000111"
            + // A2-H2
            "00001111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._H4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._H4))));
   }
   public void testNorthWest2SouthEastMaskFromF1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
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
            "00000001"
            + // A3-H3
            "00000011"
            + // A2-H2
            "00000111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._F1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._F1))));
   }   
   public void testNorthWest2SouthEastMaskFromG2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
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
            "00000001"
            + // A3-H3
            "00000011"
            + // A2-H2
            "00000111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._G2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._G2))));
   }
   public void testNorthWest2SouthEastMaskFromH3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
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
            "00000001"
            + // A3-H3
            "00000011"
            + // A2-H2
            "00000111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._H3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._H3))));
   }   
   
   public void testNorthWest2SouthEastMaskFromG1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
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
            "00000001"
            + // A2-H2
            "00000011", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._G1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._G1))));
   }
   public void testNorthWest2SouthEastMaskFromH2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
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
            "00000001"
            + // A2-H2
            "00000011", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._H2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._H2))));
   }
   public void testNorthWest2SouthEastMaskFromH1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
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
            "00000001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthWest2SouthEastMaskFrom(Square._H1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthWest2SouthEastMaskFrom(Square._H1))));
   }
   public void testSouthEast2NorthWestMaskFromH1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._H1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._H1))));
   }

   public void testSouthEast2NorthWestMaskFromH2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111110", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._H2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._H2))));
   }

   public void testSouthEast2NorthWestMaskFromG1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111110", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._G1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._G1))));
   }

   public void testSouthEast2NorthWestMaskFromH3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111110"
            + // A2-H2
            "11111100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._H3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._H3))));
   }

   public void testSouthEast2NorthWestMaskFromG2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111110"
            + // A2-H2
            "11111100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._G2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._G2))));
   }

   public void testSouthEast2NorthWestMaskFromC8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11100000"
            + // H1-H8
            "11000000"
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
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._C8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._C8))));
   }

   public void testSouthEast2NorthWestMaskFromA5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11110000"
            + // H1-H8
            "11100000"
            + // A7-H7
            "11000000"
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
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._A5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._A5))));
   }

   public void testSouthEast2NorthWestMaskFromB6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11110000"
            + // H1-H8
            "11100000"
            + // A7-H7
            "11000000"
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
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._B6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._B6))));
   }

   public void testSouthEast2NorthWestMaskFromC7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11110000"
            + // H1-H8
            "11100000"
            + // A7-H7
            "11000000"
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
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._C7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._C7))));
   }

   public void testSouthEast2NorthWestMaskFromD8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11110000"
            + // H1-H8
            "11100000"
            + // A7-H7
            "11000000"
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
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._D8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._D8))));
   }

   public void testSouthEast2NorthWestMaskFromA4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111000"
            + // H1-H8
            "11110000"
            + // A7-H7
            "11100000"
            + // A6-H6
            "11000000"
            + // A5-H5
            "10000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._A4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._A4))));
   }

   public void testSouthEast2NorthWestMaskFromB5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111000"
            + // H1-H8
            "11110000"
            + // A7-H7
            "11100000"
            + // A6-H6
            "11000000"
            + // A5-H5
            "10000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._B5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._B5))));
   }

   public void testSouthEast2NorthWestMaskFromC6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111000"
            + // H1-H8
            "11110000"
            + // A7-H7
            "11100000"
            + // A6-H6
            "11000000"
            + // A5-H5
            "10000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._C6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._C6))));
   }

   public void testSouthEast2NorthWestMaskFromD7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111000"
            + // H1-H8
            "11110000"
            + // A7-H7
            "11100000"
            + // A6-H6
            "11000000"
            + // A5-H5
            "10000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._D7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._D7))));
   }

   public void testSouthEast2NorthWestMaskFromE8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111000"
            + // H1-H8
            "11110000"
            + // A7-H7
            "11100000"
            + // A6-H6
            "11000000"
            + // A5-H5
            "10000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._E8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._E8))));
   }

   public void testSouthEast2NorthWestMaskFromA3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111100"
            + // H1-H8
            "11111000"
            + // A7-H7
            "11110000"
            + // A6-H6
            "11100000"
            + // A5-H5
            "11000000"
            + // A4-H4
            "10000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._A3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._A3))));
   }

   public void testSouthEast2NorthWestMaskFromB4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111100"
            + // H1-H8
            "11111000"
            + // A7-H7
            "11110000"
            + // A6-H6
            "11100000"
            + // A5-H5
            "11000000"
            + // A4-H4
            "10000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._B4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._B4))));
   }

   public void testSouthEast2NorthWestMaskFromC5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111100"
            + // H1-H8
            "11111000"
            + // A7-H7
            "11110000"
            + // A6-H6
            "11100000"
            + // A5-H5
            "11000000"
            + // A4-H4
            "10000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._C5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._C5))));
   }

   public void testSouthEast2NorthWestMaskFromD6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111100"
            + // H1-H8
            "11111000"
            + // A7-H7
            "11110000"
            + // A6-H6
            "11100000"
            + // A5-H5
            "11000000"
            + // A4-H4
            "10000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._D6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._D6))));
   }

   public void testSouthEast2NorthWestMaskFromE7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111100"
            + // H1-H8
            "11111000"
            + // A7-H7
            "11110000"
            + // A6-H6
            "11100000"
            + // A5-H5
            "11000000"
            + // A4-H4
            "10000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._E7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._E7))));
   }

   public void testSouthEast2NorthWestMaskFromF8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111100"
            + // H1-H8
            "11111000"
            + // A7-H7
            "11110000"
            + // A6-H6
            "11100000"
            + // A5-H5
            "11000000"
            + // A4-H4
            "10000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._F8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._F8))));
   }
   public void testSouthEast2NorthWestMaskFromA2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111110"
            + // H1-H8
            "11111100"
            + // A7-H7
            "11111000"
            + // A6-H6
            "11110000"
            + // A5-H5
            "11100000"
            + // A4-H4
            "11000000"
            + // A3-H3
            "10000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._A2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._A2))));
   }
   public void testSouthEast2NorthWestMaskFromB3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111110"
            + // H1-H8
            "11111100"
            + // A7-H7
            "11111000"
            + // A6-H6
            "11110000"
            + // A5-H5
            "11100000"
            + // A4-H4
            "11000000"
            + // A3-H3
            "10000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._B3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._B3))));
   }
   public void testSouthEast2NorthWestMaskFromC4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111110"
            + // H1-H8
            "11111100"
            + // A7-H7
            "11111000"
            + // A6-H6
            "11110000"
            + // A5-H5
            "11100000"
            + // A4-H4
            "11000000"
            + // A3-H3
            "10000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._C4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._C4))));
   }
   public void testSouthEast2NorthWestMaskFromD5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111110"
            + // H1-H8
            "11111100"
            + // A7-H7
            "11111000"
            + // A6-H6
            "11110000"
            + // A5-H5
            "11100000"
            + // A4-H4
            "11000000"
            + // A3-H3
            "10000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._D5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._D5))));
   }
   public void testSouthEast2NorthWestMaskFromE6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111110"
            + // H1-H8
            "11111100"
            + // A7-H7
            "11111000"
            + // A6-H6
            "11110000"
            + // A5-H5
            "11100000"
            + // A4-H4
            "11000000"
            + // A3-H3
            "10000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._E6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._E6))));
   }
   public void testSouthEast2NorthWestMaskFromF7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111110"
            + // H1-H8
            "11111100"
            + // A7-H7
            "11111000"
            + // A6-H6
            "11110000"
            + // A5-H5
            "11100000"
            + // A4-H4
            "11000000"
            + // A3-H3
            "10000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._F7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._F7))));
   }
   public void testSouthEast2NorthWestMaskFromG8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111110"
            + // H1-H8
            "11111100"
            + // A7-H7
            "11111000"
            + // A6-H6
            "11110000"
            + // A5-H5
            "11100000"
            + // A4-H4
            "11000000"
            + // A3-H3
            "10000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._G8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._G8))));
   }
   public void testSouthEast2NorthWestMaskFromA1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111110"
            + // A7-H7
            "11111100"
            + // A6-H6
            "11111000"
            + // A5-H5
            "11110000"
            + // A4-H4
            "11100000"
            + // A3-H3
            "11000000"
            + // A2-H2
            "10000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._A1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._A1))));
   }
   public void testSouthEast2NorthWestMaskFromB2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111110"
            + // A7-H7
            "11111100"
            + // A6-H6
            "11111000"
            + // A5-H5
            "11110000"
            + // A4-H4
            "11100000"
            + // A3-H3
            "11000000"
            + // A2-H2
            "10000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._B2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._B2))));
   }
   public void testSouthEast2NorthWestMaskFromC3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111110"
            + // A7-H7
            "11111100"
            + // A6-H6
            "11111000"
            + // A5-H5
            "11110000"
            + // A4-H4
            "11100000"
            + // A3-H3
            "11000000"
            + // A2-H2
            "10000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._C3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._C3))));
   }
   public void testSouthEast2NorthWestMaskFromD4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111110"
            + // A7-H7
            "11111100"
            + // A6-H6
            "11111000"
            + // A5-H5
            "11110000"
            + // A4-H4
            "11100000"
            + // A3-H3
            "11000000"
            + // A2-H2
            "10000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._D4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._D4))));
   }
   public void testSouthEast2NorthWestMaskFromE5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111110"
            + // A7-H7
            "11111100"
            + // A6-H6
            "11111000"
            + // A5-H5
            "11110000"
            + // A4-H4
            "11100000"
            + // A3-H3
            "11000000"
            + // A2-H2
            "10000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._E5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._E5))));
   }
   public void testSouthEast2NorthWestMaskFromF6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111110"
            + // A7-H7
            "11111100"
            + // A6-H6
            "11111000"
            + // A5-H5
            "11110000"
            + // A4-H4
            "11100000"
            + // A3-H3
            "11000000"
            + // A2-H2
            "10000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._F6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._F6))));
   }
   public void testSouthEast2NorthWestMaskFromG7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111110"
            + // A7-H7
            "11111100"
            + // A6-H6
            "11111000"
            + // A5-H5
            "11110000"
            + // A4-H4
            "11100000"
            + // A3-H3
            "11000000"
            + // A2-H2
            "10000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._G7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._G7))));
   }
   public void testSouthEast2NorthWestMaskFromH8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111110"
            + // A7-H7
            "11111100"
            + // A6-H6
            "11111000"
            + // A5-H5
            "11110000"
            + // A4-H4
            "11100000"
            + // A3-H3
            "11000000"
            + // A2-H2
            "10000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._H8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._H8))));
   }
   public void testSouthEast2NorthWestMaskFromB1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111110"
            + // A6-H6
            "11111100"
            + // A5-H5
            "11111000"
            + // A4-H4
            "11110000"
            + // A3-H3
            "11100000"
            + // A2-H2
            "11000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._B1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._B1))));
   }
   public void testSouthEast2NorthWestMaskFromC2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111110"
            + // A6-H6
            "11111100"
            + // A5-H5
            "11111000"
            + // A4-H4
            "11110000"
            + // A3-H3
            "11100000"
            + // A2-H2
            "11000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._C2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._C2))));
   }
   public void testSouthEast2NorthWestMaskFromD3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111110"
            + // A6-H6
            "11111100"
            + // A5-H5
            "11111000"
            + // A4-H4
            "11110000"
            + // A3-H3
            "11100000"
            + // A2-H2
            "11000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._D3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._D3))));
   }
   public void testSouthEast2NorthWestMaskFromE4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111110"
            + // A6-H6
            "11111100"
            + // A5-H5
            "11111000"
            + // A4-H4
            "11110000"
            + // A3-H3
            "11100000"
            + // A2-H2
            "11000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._E4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._E4))));
   }
   public void testSouthEast2NorthWestMaskFromF5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111110"
            + // A6-H6
            "11111100"
            + // A5-H5
            "11111000"
            + // A4-H4
            "11110000"
            + // A3-H3
            "11100000"
            + // A2-H2
            "11000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._F5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._F5))));
   }
   public void testSouthEast2NorthWestMaskFromG6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111110"
            + // A6-H6
            "11111100"
            + // A5-H5
            "11111000"
            + // A4-H4
            "11110000"
            + // A3-H3
            "11100000"
            + // A2-H2
            "11000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._G6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._G6))));
   }
   public void testSouthEast2NorthWestMaskFromH7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111110"
            + // A6-H6
            "11111100"
            + // A5-H5
            "11111000"
            + // A4-H4
            "11110000"
            + // A3-H3
            "11100000"
            + // A2-H2
            "11000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._H7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._H7))));
   }
   public void testSouthEast2NorthWestMaskFromC1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111110"
            + // A5-H5
            "11111100"
            + // A4-H4
            "11111000"
            + // A3-H3
            "11110000"
            + // A2-H2
            "11100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._C1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._C1))));
   }
   public void testSouthEast2NorthWestMaskFromD2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111110"
            + // A5-H5
            "11111100"
            + // A4-H4
            "11111000"
            + // A3-H3
            "11110000"
            + // A2-H2
            "11100000", // A1-H1            
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._D2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._D2))));
   }
   public void testSouthEast2NorthWestMaskFromE3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111110"
            + // A5-H5
            "11111100"
            + // A4-H4
            "11111000"
            + // A3-H3
            "11110000"
            + // A2-H2
            "11100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._E3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._E3))));
   }
   public void testSouthEast2NorthWestMaskFromF4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111110"
            + // A5-H5
            "11111100"
            + // A4-H4
            "11111000"
            + // A3-H3
            "11110000"
            + // A2-H2
            "11100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._F4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._F4))));
   }
   public void testSouthEast2NorthWestMaskFromG5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111110"
            + // A5-H5
            "11111100"
            + // A4-H4
            "11111000"
            + // A3-H3
            "11110000"
            + // A2-H2
            "11100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._G5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._G5))));
   }
   public void testSouthEast2NorthWestMaskFromH6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111110"
            + // A5-H5
            "11111100"
            + // A4-H4
            "11111000"
            + // A3-H3
            "11110000"
            + // A2-H2
            "11100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._H6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._H6))));
   }
   public void testSouthEast2NorthWestMaskFromD1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111110"
            + // A4-H4
            "11111100"
            + // A3-H3
            "11111000"
            + // A2-H2
            "11110000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._D1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._D1))));
   }
   public void testSouthEast2NorthWestMaskFromE2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111110"
            + // A4-H4
            "11111100"
            + // A3-H3
            "11111000"
            + // A2-H2
            "11110000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._E2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._E2))));
   }
   public void testSouthEast2NorthWestMaskFromF3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111110"
            + // A4-H4
            "11111100"
            + // A3-H3
            "11111000"
            + // A2-H2
            "11110000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._F3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._F3))));
   }
   public void testSouthEast2NorthWestMaskFromG4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111110"
            + // A4-H4
            "11111100"
            + // A3-H3
            "11111000"
            + // A2-H2
            "11110000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._G4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._G4))));
   }
   public void testSouthEast2NorthWestMaskFromH5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111110"
            + // A4-H4
            "11111100"
            + // A3-H3
            "11111000"
            + // A2-H2
            "11110000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._H5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._H5))));
   }
   public void testSouthEast2NorthWestMaskFromE1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111110"
            + // A3-H3
            "11111100"
            + // A2-H2
            "11111000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._E1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._E1))));
   }
   public void testSouthEast2NorthWestMaskFromF2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111110"
            + // A3-H3
            "11111100"
            + // A2-H2
            "11111000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._F2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._F2))));
   }
   public void testSouthEast2NorthWestMaskFromG3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111110"
            + // A3-H3
            "11111100"
            + // A2-H2
            "11111000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._G3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._G3))));
   }
   public void testSouthEast2NorthWestMaskFromH4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111110"
            + // A3-H3
            "11111100"
            + // A2-H2
            "11111000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._H4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._H4))));
   }
   public void testSouthEast2NorthWestMaskFromF1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11111111"
            + // H1-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111110"
            + // A2-H2
            "11111100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._F1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._F1))));
   }   
   public void testSouthEast2NorthWestMaskFromB7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11100000"
            + // H1-H8
            "11000000"
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
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._B7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._B7))));
   }
   public void testSouthEast2NorthWestMaskFromA6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11100000"
            + // H1-H8
            "11000000"
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
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._A6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._A6))));
   }   
   
   public void testSouthEast2NorthWestMaskFromB8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11000000"
            + // H1-H8
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
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._B8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._B8))));
   }
   public void testSouthEast2NorthWestMaskFromA7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "11000000"
            + // H1-H8
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
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._A7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._A7))));
   }
   public void testSouthEast2NorthWestMaskFromA8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //            
            "10000000"
            + // H1-H8
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
                  bishopMask.getSouthEast2NorthWestMaskFrom(Square._A8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthEast2NorthWestMaskFrom(Square._A8))));
   }
   public void testNorthEast2SouthWestMaskFromA8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "10000000"
            + // A8-H8
            "11000000"
            + // A7-H7
            "11100000"
            + // A6-H6
            "11110000"
            + // A5-H5
            "11111000"
            + // A4-H4
            "11111100"
            + // A3-H3
            "11111110"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._A8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._A8))));
   }

   public void testNorthEast2SouthWestMaskFromA7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "10000000"
            + // A7-H7
            "11000000"
            + // A6-H6
            "11100000"
            + // A5-H5
            "11110000"
            + // A4-H4
            "11111000"
            + // A3-H3
            "11111100"
            + // A2-H2
            "11111110", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._A7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._A7))));
   }

   public void testNorthEast2SouthWestMaskFromB8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11000000"
            + // A8-H8
            "11100000"
            + // A7-H7
            "11110000"
            + // A6-H6
            "11111000"
            + // A5-H5
            "11111100"
            + // A4-H4
            "11111110"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._B8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._B8))));
   }

   public void testNorthEast2SouthWestMaskFromA6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "10000000"
            + // A6-H6
            "11000000"
            + // A5-H5
            "11100000"
            + // A4-H4
            "11110000"
            + // A3-H3
            "11111000"
            + // A2-H2
            "11111100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._A6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._A6))));
   }

   public void testNorthEast2SouthWestMaskFromB7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "10000000"
            + // A8-H8
            "11000000"
            + // A7-H7
            "11100000"
            + // A6-H6
            "11110000"
            + // A5-H5
            "11111000"
            + // A4-H4
            "11111100"
            + // A3-H3
            "11111110"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._B7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._B7))));
   }

   public void testNorthEast2SouthWestMaskFromC8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11100000"
            + // A8-H8
            "11110000"
            + // A7-H7
            "11111000"
            + // A6-H6
            "11111100"
            + // A5-H5
            "11111110"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._C8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._C8))));
   }

   public void testNorthEast2SouthWestMaskFromA5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "10000000"
            + // A5-H5
            "11000000"
            + // A4-H4
            "11100000"
            + // A3-H3
            "11110000"
            + // A2-H2
            "11111000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._A5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._A5))));
   }

   public void testNorthEast2SouthWestMaskFromB6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "10000000"
            + // A7-H7
            "11000000"
            + // A6-H6
            "11100000"
            + // A5-H5
            "11110000"
            + // A4-H4
            "11111000"
            + // A3-H3
            "11111100"
            + // A2-H2
            "11111110", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._B6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._B6))));
   }

   public void testNorthEast2SouthWestMaskFromC7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11000000"
            + // A8-H8
            "11100000"
            + // A7-H7
            "11110000"
            + // A6-H6
            "11111000"
            + // A5-H5
            "11111100"
            + // A4-H4
            "11111110"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._C7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._C7))));
   }

   public void testNorthEast2SouthWestMaskFromD8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11110000"
            + // A8-H8
            "11111000"
            + // A7-H7
            "11111100"
            + // A6-H6
            "11111110"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._D8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._D8))));
   }

   public void testNorthEast2SouthWestMaskFromA4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
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
            "11000000"
            + // A3-H3
            "11100000"
            + // A2-H2
            "11110000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._A4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._A4))));
   }

   public void testNorthEast2SouthWestMaskFromB5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "10000000"
            + // A6-H6
            "11000000"
            + // A5-H5
            "11100000"
            + // A4-H4
            "11110000"
            + // A3-H3
            "11111000"
            + // A2-H2
            "11111100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._B5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._B5))));
   }

   public void testNorthEast2SouthWestMaskFromC6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "10000000"
            + // A8-H8
            "11000000"
            + // A7-H7
            "11100000"
            + // A6-H6
            "11110000"
            + // A5-H5
            "11111000"
            + // A4-H4
            "11111100"
            + // A3-H3
            "11111110"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._C6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._C6))));
   }

   public void testNorthEast2SouthWestMaskFromD7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11100000"
            + // A8-H8
            "11110000"
            + // A7-H7
            "11111000"
            + // A6-H6
            "11111100"
            + // A5-H5
            "11111110"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._D7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._D7))));
   }

   public void testNorthEast2SouthWestMaskFromE8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111000"
            + // A8-H8
            "11111100"
            + // A7-H7
            "11111110"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._E8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._E8))));
   }

   public void testNorthEast2SouthWestMaskFromA3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
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
            "10000000"
            + // A3-H3
            "11000000"
            + // A2-H2
            "11100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._A3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._A3))));
   }

   public void testNorthEast2SouthWestMaskFromB4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "10000000"
            + // A5-H5
            "11000000"
            + // A4-H4
            "11100000"
            + // A3-H3
            "11110000"
            + // A2-H2
            "11111000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._B4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._B4))));
   }

   public void testNorthEast2SouthWestMaskFromC5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "10000000"
            + // A7-H7
            "11000000"
            + // A6-H6
            "11100000"
            + // A5-H5
            "11110000"
            + // A4-H4
            "11111000"
            + // A3-H3
            "11111100"
            + // A2-H2
            "11111110", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._C5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._C5))));
   }

   public void testNorthEast2SouthWestMaskFromD6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11000000"
            + // A8-H8
            "11100000"
            + // A7-H7
            "11110000"
            + // A6-H6
            "11111000"
            + // A5-H5
            "11111100"
            + // A4-H4
            "11111110"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._D6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._D6))));
   }

   public void testNorthEast2SouthWestMaskFromE7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11110000"
            + // A8-H8
            "11111000"
            + // A7-H7
            "11111100"
            + // A6-H6
            "11111110"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._E7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._E7))));
   }

   public void testNorthEast2SouthWestMaskFromF8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111100"
            + // A8-H8
            "11111110"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._F8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._F8))));
   }
   public void testNorthEast2SouthWestMaskFromA2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
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
            "10000000"
            + // A2-H2
            "11000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._A2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._A2))));
   }
   public void testNorthEast2SouthWestMaskFromB3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
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
            "11000000"
            + // A3-H3
            "11100000"
            + // A2-H2
            "11110000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._B3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._B3))));
   }
   public void testNorthEast2SouthWestMaskFromC4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "10000000"
            + // A6-H6
            "11000000"
            + // A5-H5
            "11100000"
            + // A4-H4
            "11110000"
            + // A3-H3
            "11111000"
            + // A2-H2
            "11111100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._C4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._C4))));
   }
   public void testNorthEast2SouthWestMaskFromD5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "10000000"
            + // A8-H8
            "11000000"
            + // A7-H7
            "11100000"
            + // A6-H6
            "11110000"
            + // A5-H5
            "11111000"
            + // A4-H4
            "11111100"
            + // A3-H3
            "11111110"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._D5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._D5))));
   }
   public void testNorthEast2SouthWestMaskFromE6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11100000"
            + // A8-H8
            "11110000"
            + // A7-H7
            "11111000"
            + // A6-H6
            "11111100"
            + // A5-H5
            "11111110"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._E6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._E6))));
   }
   public void testNorthEast2SouthWestMaskFromF7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111000"
            + // A8-H8
            "11111100"
            + // A7-H7
            "11111110"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._F7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._F7))));
   }
   public void testNorthEast2SouthWestMaskFromG8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111110"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._G8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._G8))));
   }
   public void testNorthEast2SouthWestMaskFromA1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
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
            "10000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._A1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._A1))));
   }
   public void testNorthEast2SouthWestMaskFromB2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
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
            "10000000"
            + // A3-H3
            "11000000"
            + // A2-H2
            "11100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._B2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._B2))));
   }
   public void testNorthEast2SouthWestMaskFromC3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "10000000"
            + // A5-H5
            "11000000"
            + // A4-H4
            "11100000"
            + // A3-H3
            "11110000"
            + // A2-H2
            "11111000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._C3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._C3))));
   }
   public void testNorthEast2SouthWestMaskFromD4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "10000000"
            + // A7-H7
            "11000000"
            + // A6-H6
            "11100000"
            + // A5-H5
            "11110000"
            + // A4-H4
            "11111000"
            + // A3-H3
            "11111100"
            + // A2-H2
            "11111110", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._D4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._D4))));
   }
   public void testNorthEast2SouthWestMaskFromE5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11000000"
            + // A8-H8
            "11100000"
            + // A7-H7
            "11110000"
            + // A6-H6
            "11111000"
            + // A5-H5
            "11111100"
            + // A4-H4
            "11111110"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._E5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._E5))));
   }
   public void testNorthEast2SouthWestMaskFromF6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11110000"
            + // A8-H8
            "11111000"
            + // A7-H7
            "11111100"
            + // A6-H6
            "11111110"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._F6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._F6))));
   }
   public void testNorthEast2SouthWestMaskFromG7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111100"
            + // A8-H8
            "11111110"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._G7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._G7))));
   }
   public void testNorthEast2SouthWestMaskFromH8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._H8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._H8))));
   }
   public void testNorthEast2SouthWestMaskFromB1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
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
            "10000000"
            + // A2-H2
            "11000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._B1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._B1))));
   }
   public void testNorthEast2SouthWestMaskFromC2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
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
            "11000000"
            + // A3-H3
            "11100000"
            + // A2-H2
            "11110000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._C2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._C2))));
   }
   public void testNorthEast2SouthWestMaskFromD3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "10000000"
            + // A6-H6
            "11000000"
            + // A5-H5
            "11100000"
            + // A4-H4
            "11110000"
            + // A3-H3
            "11111000"
            + // A2-H2
            "11111100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._D3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._D3))));
   }
   public void testNorthEast2SouthWestMaskFromE4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "10000000"
            + // A8-H8
            "11000000"
            + // A7-H7
            "11100000"
            + // A6-H6
            "11110000"
            + // A5-H5
            "11111000"
            + // A4-H4
            "11111100"
            + // A3-H3
            "11111110"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._E4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._E4))));
   }
   public void testNorthEast2SouthWestMaskFromF5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11100000"
            + // A8-H8
            "11110000"
            + // A7-H7
            "11111000"
            + // A6-H6
            "11111100"
            + // A5-H5
            "11111110"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._F5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._F5))));
   }
   public void testNorthEast2SouthWestMaskFromG6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111000"
            + // A8-H8
            "11111100"
            + // A7-H7
            "11111110"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._G6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._G6))));
   }
   public void testNorthEast2SouthWestMaskFromH7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111110"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._H7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._H7))));
   }
   public void testNorthEast2SouthWestMaskFromC1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
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
            "10000000"
            + // A3-H3
            "11000000"
            + // A2-H2
            "11100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._C1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._C1))));
   }
   public void testNorthEast2SouthWestMaskFromD2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "10000000"
            + // A5-H5
            "11000000"
            + // A4-H4
            "11100000"
            + // A3-H3
            "11110000"
            + // A2-H2
            "11111000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._D2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._D2))));
   }
   public void testNorthEast2SouthWestMaskFromE3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "10000000"
            + // A7-H7
            "11000000"
            + // A6-H6
            "11100000"
            + // A5-H5
            "11110000"
            + // A4-H4
            "11111000"
            + // A3-H3
            "11111100"
            + // A2-H2
            "11111110", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._E3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._E3))));
   }
   public void testNorthEast2SouthWestMaskFromF4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11000000"
            + // A8-H8
            "11100000"
            + // A7-H7
            "11110000"
            + // A6-H6
            "11111000"
            + // A5-H5
            "11111100"
            + // A4-H4
            "11111110"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._F4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._F4))));
   }
   public void testNorthEast2SouthWestMaskFromG5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11110000"
            + // A8-H8
            "11111000"
            + // A7-H7
            "11111100"
            + // A6-H6
            "11111110"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._G5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._G5))));
   }
   public void testNorthEast2SouthWestMaskFromH6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111100"
            + // A8-H8
            "11111110"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._H6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._H6))));
   }
   public void testNorthEast2SouthWestMaskFromD1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
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
            "11000000"
            + // A3-H3
            "11100000"
            + // A2-H2
            "11110000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._D1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._D1))));
   }
   public void testNorthEast2SouthWestMaskFromE2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "10000000"
            + // A6-H6
            "11000000"
            + // A5-H5
            "11100000"
            + // A4-H4
            "11110000"
            + // A3-H3
            "11111000"
            + // A2-H2
            "11111100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._E2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._E2))));
   }
   public void testNorthEast2SouthWestMaskFromF3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "10000000"
            + // A8-H8
            "11000000"
            + // A7-H7
            "11100000"
            + // A6-H6
            "11110000"
            + // A5-H5
            "11111000"
            + // A4-H4
            "11111100"
            + // A3-H3
            "11111110"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._F3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._F3))));
   }
   public void testNorthEast2SouthWestMaskFromG4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11100000"
            + // A8-H8
            "11110000"
            + // A7-H7
            "11111000"
            + // A6-H6
            "11111100"
            + // A5-H5
            "11111110"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._G4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._G4))));
   }
   public void testNorthEast2SouthWestMaskFromH5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111000"
            + // A8-H8
            "11111100"
            + // A7-H7
            "11111110"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._H5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._H5))));
   }
   public void testNorthEast2SouthWestMaskFromE1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "10000000"
            + // A5-H5
            "11000000"
            + // A4-H4
            "11100000"
            + // A3-H3
            "11110000"
            + // A2-H2
            "11111000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._E1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._E1))));
   }
   public void testNorthEast2SouthWestMaskFromF2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "10000000"
            + // A7-H7
            "11000000"
            + // A6-H6
            "11100000"
            + // A5-H5
            "11110000"
            + // A4-H4
            "11111000"
            + // A3-H3
            "11111100"
            + // A2-H2
            "11111110", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._F2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._F2))));
   }
   public void testNorthEast2SouthWestMaskFromG3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11000000"
            + // A8-H8
            "11100000"
            + // A7-H7
            "11110000"
            + // A6-H6
            "11111000"
            + // A5-H5
            "11111100"
            + // A4-H4
            "11111110"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._G3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._G3))));
   }
   public void testNorthEast2SouthWestMaskFromH4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11110000"
            + // A8-H8
            "11111000"
            + // A7-H7
            "11111100"
            + // A6-H6
            "11111110"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._H4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._H4))));
   }
   public void testNorthEast2SouthWestMaskFromF1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "10000000"
            + // A6-H6
            "11000000"
            + // A5-H5
            "11100000"
            + // A4-H4
            "11110000"
            + // A3-H3
            "11111000"
            + // A2-H2
            "11111100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._F1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._F1))));
   }   
   public void testNorthEast2SouthWestMaskFromG2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "10000000"
            + // A8-H8
            "11000000"
            + // A7-H7
            "11100000"
            + // A6-H6
            "11110000"
            + // A5-H5
            "11111000"
            + // A4-H4
            "11111100"
            + // A3-H3
            "11111110"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._G2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._G2))));
   }
   public void testNorthEast2SouthWestMaskFromH3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11100000"
            + // A8-H8
            "11110000"
            + // A7-H7
            "11111000"
            + // A6-H6
            "11111100"
            + // A5-H5
            "11111110"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._H3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._H3))));
   }   
   
   public void testNorthEast2SouthWestMaskFromG1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "10000000"
            + // A7-H7
            "11000000"
            + // A6-H6
            "11100000"
            + // A5-H5
            "11110000"
            + // A4-H4
            "11111000"
            + // A3-H3
            "11111100"
            + // A2-H2
            "11111110", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._G1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._G1))));
   }
   public void testNorthEast2SouthWestMaskFromH2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11000000"
            + // A8-H8
            "11100000"
            + // A7-H7
            "11110000"
            + // A6-H6
            "11111000"
            + // A5-H5
            "11111100"
            + // A4-H4
            "11111110"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._H2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._H2))));
   }
   public void testNorthEast2SouthWestMaskFromH1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "10000000"
            + // A8-H8
            "11000000"
            + // A7-H7
            "11100000"
            + // A6-H6
            "11110000"
            + // A5-H5
            "11111000"
            + // A4-H4
            "11111100"
            + // A3-H3
            "11111110"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getNorthEast2SouthWestMaskFrom(Square._H1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getNorthEast2SouthWestMaskFrom(Square._H1))));
   }
   public void testSouthWest2NorthEastMaskFromA8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "01111111"
            + // A7-H7
            "00111111"
            + // A6-H6
            "00011111"
            + // A5-H5
            "00001111"
            + // A4-H4
            "00000111"
            + // A3-H3
            "00000011"
            + // A2-H2
            "00000001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._A8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._A8))));
   }

   public void testSouthWest2NorthEastMaskFromA7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "01111111"
            + // A6-H6
            "00111111"
            + // A5-H5
            "00011111"
            + // A4-H4
            "00001111"
            + // A3-H3
            "00000111"
            + // A2-H2
            "00000011", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._A7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._A7))));
   }

   public void testSouthWest2NorthEastMaskFromB8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "01111111"
            + // A8-H8
            "00111111"
            + // A7-H7
            "00011111"
            + // A6-H6
            "00001111"
            + // A5-H5
            "00000111"
            + // A4-H4
            "00000011"
            + // A3-H3
            "00000001"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._B8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._B8))));
   }

   public void testSouthWest2NorthEastMaskFromA6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "01111111"
            + // A5-H5
            "00111111"
            + // A4-H4
            "00011111"
            + // A3-H3
            "00001111"
            + // A2-H2
            "00000111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._A6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._A6))));
   }

   public void testSouthWest2NorthEastMaskFromB7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "01111111"
            + // A7-H7
            "00111111"
            + // A6-H6
            "00011111"
            + // A5-H5
            "00001111"
            + // A4-H4
            "00000111"
            + // A3-H3
            "00000011"
            + // A2-H2
            "00000001", // A1-H1

            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._B7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._B7))));
   }

   public void testSouthWest2NorthEastMaskFromC8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00111111"
            + // A8-H8
            "00011111"
            + // A7-H7
            "00001111"
            + // A6-H6
            "00000111"
            + // A5-H5
            "00000011"
            + // A4-H4
            "00000001"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._C8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._C8))));
   }

   public void testSouthWest2NorthEastMaskFromA5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "01111111"
            + // A4-H4
            "00111111"
            + // A3-H3
            "00011111"
            + // A2-H2
            "00001111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._A5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._A5))));
   }

   public void testSouthWest2NorthEastMaskFromB6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "01111111"
            + // A6-H6
            "00111111"
            + // A5-H5
            "00011111"
            + // A4-H4
            "00001111"
            + // A3-H3
            "00000111"
            + // A2-H2
            "00000011", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._B6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._B6))));
   }

   public void testSouthWest2NorthEastMaskFromC7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "01111111"
            + // A8-H8
            "00111111"
            + // A7-H7
            "00011111"
            + // A6-H6
            "00001111"
            + // A5-H5
            "00000111"
            + // A4-H4
            "00000011"
            + // A3-H3
            "00000001"
            + // A2-H2
            "00000000", // A1-H1

            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._C7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._C7))));
   }

   public void testSouthWest2NorthEastMaskFromD8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00011111"
            + // A8-H8
            "00001111"
            + // A7-H7
            "00000111"
            + // A6-H6
            "00000011"
            + // A5-H5
            "00000001"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._D8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._D8))));
   }

   public void testSouthWest2NorthEastMaskFromA4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "01111111"
            + // A3-H3
            "00111111"
            + // A2-H2
            "00011111", // A1-H1 
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._A4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._A4))));
   }

   public void testSouthWest2NorthEastMaskFromB5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "01111111"
            + // A5-H5
            "00111111"
            + // A4-H4
            "00011111"
            + // A3-H3
            "00001111"
            + // A2-H2
            "00000111", // A1-H1 
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._B5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._B5))));
   }

   public void testSouthWest2NorthEastMaskFromC6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "01111111"
            + // A7-H7
            "00111111"
            + // A6-H6
            "00011111"
            + // A5-H5
            "00001111"
            + // A4-H4
            "00000111"
            + // A3-H3
            "00000011"
            + // A2-H2
            "00000001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._C6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._C6))));
   }

   public void testSouthWest2NorthEastMaskFromD7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00111111"
            + // A8-H8
            "00011111"
            + // A7-H7
            "00001111"
            + // A6-H6
            "00000111"
            + // A5-H5
            "00000011"
            + // A4-H4
            "00000001"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._D7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._D7))));
   }

   public void testSouthWest2NorthEastMaskFromE8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00001111"
            + // A8-H8
            "00000111"
            + // A7-H7
            "00000011"
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
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._E8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._E8))));
   }

   public void testSouthWest2NorthEastMaskFromA3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "01111111"
            + // A2-H2
            "00111111", // A1-H1

            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._A3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._A3))));
   }

   public void testSouthWest2NorthEastMaskFromB4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "01111111"
            + // A4-H4
            "00111111"
            + // A3-H3
            "00011111"
            + // A2-H2
            "00001111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._B4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._B4))));
   }

   public void testSouthWest2NorthEastMaskFromC5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "01111111"
            + // A6-H6
            "00111111"
            + // A5-H5
            "00011111"
            + // A4-H4
            "00001111"
            + // A3-H3
            "00000111"
            + // A2-H2
            "00000011", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._C5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._C5))));
   }

   public void testSouthWest2NorthEastMaskFromD6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "01111111"
            + // A8-H8
            "00111111"
            + // A7-H7
            "00011111"
            + // A6-H6
            "00001111"
            + // A5-H5
            "00000111"
            + // A4-H4
            "00000011"
            + // A3-H3
            "00000001"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._D6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._D6))));
   }

   public void testSouthWest2NorthEastMaskFromE7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00011111"
            + // A8-H8
            "00001111"
            + // A7-H7
            "00000111"
            + // A6-H6
            "00000011"
            + // A5-H5
            "00000001"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1

            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._E7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._E7))));
   }

   public void testSouthWest2NorthEastMaskFromF8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000111"
            + // A8-H8
            "00000011"
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
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._F8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._F8))));
   }
   public void testSouthWest2NorthEastMaskFromA2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "01111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._A2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._A2))));
   }
   public void testSouthWest2NorthEastMaskFromB3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "01111111"
            + // A3-H3
            "00111111"
            + // A2-H2
            "00011111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._B3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._B3))));
   }
   public void testSouthWest2NorthEastMaskFromC4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "01111111"
            + // A5-H5
            "00111111"
            + // A4-H4
            "00011111"
            + // A3-H3
            "00001111"
            + // A2-H2
            "00000111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._C4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._C4))));
   }
   public void testSouthWest2NorthEastMaskFromD5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "01111111"
            + // A7-H7
            "00111111"
            + // A6-H6
            "00011111"
            + // A5-H5
            "00001111"
            + // A4-H4
            "00000111"
            + // A3-H3
            "00000011"
            + // A2-H2
            "00000001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._D5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._D5))));
   }
   public void testSouthWest2NorthEastMaskFromE6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00111111"
            + // A8-H8
            "00011111"
            + // A7-H7
            "00001111"
            + // A6-H6
            "00000111"
            + // A5-H5
            "00000011"
            + // A4-H4
            "00000001"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._E6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._E6))));
   }
   public void testSouthWest2NorthEastMaskFromF7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00001111"
            + // A8-H8
            "00000111"
            + // A7-H7
            "00000011"
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
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._F7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._F7))));
   }
   public void testSouthWest2NorthEastMaskFromG8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000011"
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
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._G8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._G8))));
   }
   public void testSouthWest2NorthEastMaskFromA1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._A1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._A1))));
   }
   public void testSouthWest2NorthEastMaskFromB2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "01111111"
            + // A2-H2
            "00111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._B2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._B2))));
   }
   public void testSouthWest2NorthEastMaskFromC3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "01111111"
            + // A4-H4
            "00111111"
            + // A3-H3
            "00011111"
            + // A2-H2
            "00001111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._C3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._C3))));
   }
   public void testSouthWest2NorthEastMaskFromD4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "01111111"
            + // A6-H6
            "00111111"
            + // A5-H5
            "00011111"
            + // A4-H4
            "00001111"
            + // A3-H3
            "00000111"
            + // A2-H2
            "00000011", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._D4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._D4))));
   }
   public void testSouthWest2NorthEastMaskFromE5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "01111111"
            + // A8-H8
            "00111111"
            + // A7-H7
            "00011111"
            + // A6-H6
            "00001111"
            + // A5-H5
            "00000111"
            + // A4-H4
            "00000011"
            + // A3-H3
            "00000001"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._E5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._E5))));
   }
   public void testSouthWest2NorthEastMaskFromF6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00011111"
            + // A8-H8
            "00001111"
            + // A7-H7
            "00000111"
            + // A6-H6
            "00000011"
            + // A5-H5
            "00000001"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._F6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._F6))));
   }
   public void testSouthWest2NorthEastMaskFromG7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000111"
            + // A8-H8
            "00000011"
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
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._G7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._G7))));
   }
   public void testSouthWest2NorthEastMaskFromH8() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            +
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
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._H8))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._H8))));
   }
   public void testSouthWest2NorthEastMaskFromB1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "11111111"
            + // A2-H2
            "01111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._B1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._B1))));
   }
   public void testSouthWest2NorthEastMaskFromC2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "01111111"
            + // A3-H3
            "00111111"
            + // A2-H2
            "00011111", // A1-H1

            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._C2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._C2))));
   }
   public void testSouthWest2NorthEastMaskFromD3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "01111111"
            + // A5-H5
            "00111111"
            + // A4-H4
            "00011111"
            + // A3-H3
            "00001111"
            + // A2-H2
            "00000111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._D3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._D3))));
   }
   public void testSouthWest2NorthEastMaskFromE4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "01111111"
            + // A7-H7
            "00111111"
            + // A6-H6
            "00011111"
            + // A5-H5
            "00001111"
            + // A4-H4
            "00000111"
            + // A3-H3
            "00000011"
            + // A2-H2
            "00000001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._E4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._E4))));
   }
   public void testSouthWest2NorthEastMaskFromF5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00111111"
            + // A8-H8
            "00011111"
            + // A7-H7
            "00001111"
            + // A6-H6
            "00000111"
            + // A5-H5
            "00000011"
            + // A4-H4
            "00000001"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._F5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._F5))));
   }
   public void testSouthWest2NorthEastMaskFromG6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            +
            "00001111"
            + // A8-H8
            "00000111"
            + // A7-H7
            "00000011"
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
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._G6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._G6))));
   }
   public void testSouthWest2NorthEastMaskFromH7() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            +
            "00000011"
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
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._H7))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._H7))));
   }
   public void testSouthWest2NorthEastMaskFromC1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "11111111"
            + // A3-H3
            "01111111"
            + // A2-H2
            "00111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._C1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._C1))));
   }
   public void testSouthWest2NorthEastMaskFromD2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "01111111"
            + // A4-H4
            "00111111"
            + // A3-H3
            "00011111"
            + // A2-H2
            "00001111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._D2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._D2))));
   }
   public void testSouthWest2NorthEastMaskFromE3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "01111111"
            + // A6-H6
            "00111111"
            + // A5-H5
            "00011111"
            + // A4-H4
            "00001111"
            + // A3-H3
            "00000111"
            + // A2-H2
            "00000011", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._E3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._E3))));
   }
   public void testSouthWest2NorthEastMaskFromF4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "01111111"
            + // A8-H8
            "00111111"
            + // A7-H7
            "00011111"
            + // A6-H6
            "00001111"
            + // A5-H5
            "00000111"
            + // A4-H4
            "00000011"
            + // A3-H3
            "00000001"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._F4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._F4))));
   }
   public void testSouthWest2NorthEastMaskFromG5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00011111"
            + // A8-H8
            "00001111"
            + // A7-H7
            "00000111"
            + // A6-H6
            "00000011"
            + // A5-H5
            "00000001"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._G5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._G5))));
   }
   public void testSouthWest2NorthEastMaskFromH6() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00000111"
            + // A8-H8
            "00000011"
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
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._H6))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._H6))));
   }
   public void testSouthWest2NorthEastMaskFromD1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "11111111"
            + // A4-H4
            "01111111"
            + // A3-H3
            "00111111"
            + // A2-H2
            "00011111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._D1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._D1))));
   }
   public void testSouthWest2NorthEastMaskFromE2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "01111111"
            + // A5-H5
            "00111111"
            + // A4-H4
            "00011111"
            + // A3-H3
            "00001111"
            + // A2-H2
            "00000111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._E2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._E2))));
   }
   public void testSouthWest2NorthEastMaskFromF3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""+
            "11111111"
            + // A8-H8
            "01111111"
            + // A7-H7
            "00111111"
            + // A6-H6
            "00011111"
            + // A5-H5
            "00001111"
            + // A4-H4
            "00000111"
            + // A3-H3
            "00000011"
            + // A2-H2
            "00000001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._F3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._F3))));
   }
   public void testSouthWest2NorthEastMaskFromG4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            +
            "00111111"
            + // A½8-H8
            "00011111"
            + // A7-H7
            "00001111"
            + // A6-H6
            "00000111"
            + // A5-H5
            "00000011"
            + // A4-H4
            "00000001"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._G4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._G4))));
   }
   public void testSouthWest2NorthEastMaskFromH5() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            +
            "00001111"
            + // A8-H8
            "00000111"
            + // A7-H7
            "00000011"
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
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._H5))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._H5))));
   }
   public void testSouthWest2NorthEastMaskFromE1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "11111111"
            + // A5-H5
            "01111111"
            + // A4-H4
            "00111111"
            + // A3-H3
            "00011111"
            + // A2-H2
            "00001111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._E1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._E1))));
   }
   public void testSouthWest2NorthEastMaskFromF2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "01111111"
            + // A6-H6
            "00111111"
            + // A5-H5
            "00011111"
            + // A4-H4
            "00001111"
            + // A3-H3
            "00000111"
            + // A2-H2
            "00000011", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._F2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._F2))));
   }
   public void testSouthWest2NorthEastMaskFromG3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "01111111"
            + // A8-H8
            "00111111"
            + // A7-H7
            "00011111"
            + // A6-H6
            "00001111"
            + // A5-H5
            "00000111"
            + // A4-H4
            "00000011"
            + // A3-H3
            "00000001"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._G3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._G3))));
   }
   public void testSouthWest2NorthEastMaskFromH4() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "00011111"
            + // A8-H8
            "00001111"
            + // A7-H7
            "00000111"
            + // A6-H6
            "00000011"
            + // A5-H5
            "00000001"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1

            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._H4))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._H4))));
   }
   public void testSouthWest2NorthEastMaskFromF1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "11111111"
            + // A6-H6
            "01111111"
            + // A5-H5
            "00111111"
            + // A4-H4
            "00011111"
            + // A3-H3
            "00001111"
            + // A2-H2
            "00000111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._F1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._F1))));
   }   
   public void testSouthWest2NorthEastMaskFromG2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""+
            "11111111"
            + // A8-H8
            "01111111"
            + // A7-H7
            "00111111"
            + // A6-H6
            "00011111"
            + // A5-H5
            "00001111"
            + // A4-H4
            "00000111"
            + // A3-H3
            "00000011"
            + // A2-H2
            "00000001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._G2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._G2))));
   }
   public void testSouthWest2NorthEastMaskFromH3() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            +
            "00111111"
            + // A½8-H8
            "00011111"
            + // A7-H7
            "00001111"
            + // A6-H6
            "00000111"
            + // A5-H5
            "00000011"
            + // A4-H4
            "00000001"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._H3))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._H3))));
   }   
   
   public void testSouthWest2NorthEastMaskFromG1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "11111111"
            + // A7-H7
            "01111111"
            + // A6-H6
            "00111111"
            + // A5-H5
            "00011111"
            + // A4-H4
            "00001111"
            + // A3-H3
            "00000111"
            + // A2-H2
            "00000011", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._G1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._G1))));
   }
   public void testSouthWest2NorthEastMaskFromH2() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "01111111"
            + // A8-H8
            "00111111"
            + // A7-H7
            "00011111"
            + // A6-H6
            "00001111"
            + // A5-H5
            "00000111"
            + // A4-H4
            "00000011"
            + // A3-H3
            "00000001"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._H2))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._H2))));
   }
   public void testSouthWest2NorthEastMaskFromH1() {
      BishopMask bishopMask= BishopMasks.create();
      Assert.assertEquals(""
            + //
            "11111111"
            + // A8-H8
            "01111111"
            + // A7-H7
            "00111111"
            + // A6-H6
            "00011111"
            + // A5-H5
            "00001111"
            + // A4-H4
            "00000111"
            + // A3-H3
            "00000011"
            + // A2-H2
            "00000001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  bishopMask.getSouthWest2NorthEastMaskFrom(Square._H1))
                  .length() - 1] + Long.toBinaryString(bishopMask
                  .getSouthWest2NorthEastMaskFrom(Square._H1))));
   }

   
}