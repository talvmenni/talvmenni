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

   public void testDeBruijnSequence() {
      Assert.assertEquals(
            "0000001111110111100111010111000110110100110010110000101010001001",
            (this.zeroPrefix[Long.toBinaryString(
                  Square.Util.DEBRUIJN64).length() - 1] + Long.toBinaryString(Square.Util.DEBRUIJN64)));
   }

   public void testDeBruijnIndex() {
      Assert.assertEquals(62, Square.Util.deBruijn64Index(Square._A1));
      Assert.assertEquals(51, Square.Util.deBruijn64Index(Square._A2));
      Assert.assertEquals(46, Square.Util.deBruijn64Index(Square._A3));
      Assert.assertEquals(54, Square.Util.deBruijn64Index(Square._A4));
      Assert.assertEquals(25, Square.Util.deBruijn64Index(Square._A5));
      Assert.assertEquals(33, Square.Util.deBruijn64Index(Square._A6));
      Assert.assertEquals(17, Square.Util.deBruijn64Index(Square._A7));
      Assert.assertEquals(32, Square.Util.deBruijn64Index(Square._A8));

      Assert.assertEquals(63, Square.Util.deBruijn64Index(Square._B1));
      Assert.assertEquals(57, Square.Util.deBruijn64Index(Square._B2));
      Assert.assertEquals(23, Square.Util.deBruijn64Index(Square._B3));
      Assert.assertEquals(27, Square.Util.deBruijn64Index(Square._B4));
      Assert.assertEquals(12, Square.Util.deBruijn64Index(Square._B5));
      Assert.assertEquals(48, Square.Util.deBruijn64Index(Square._B6));
      Assert.assertEquals(40, Square.Util.deBruijn64Index(Square._B7));
      Assert.assertEquals(16, Square.Util.deBruijn64Index(Square._B8));

      Assert.assertEquals(31, Square.Util.deBruijn64Index(Square._C1));
      Assert.assertEquals(60, Square.Util.deBruijn64Index(Square._C2));
      Assert.assertEquals(43, Square.Util.deBruijn64Index(Square._C3));
      Assert.assertEquals(13, Square.Util.deBruijn64Index(Square._C4));
      Assert.assertEquals(38, Square.Util.deBruijn64Index(Square._C5));
      Assert.assertEquals(24, Square.Util.deBruijn64Index(Square._C6));
      Assert.assertEquals(20, Square.Util.deBruijn64Index(Square._C7));
      Assert.assertEquals(8, Square.Util.deBruijn64Index(Square._C8));

      Assert.assertEquals(15, Square.Util.deBruijn64Index(Square._D1));
      Assert.assertEquals(30, Square.Util.deBruijn64Index(Square._D2));
      Assert.assertEquals(53, Square.Util.deBruijn64Index(Square._D3));
      Assert.assertEquals(6, Square.Util.deBruijn64Index(Square._D4));
      Assert.assertEquals(19, Square.Util.deBruijn64Index(Square._D5));
      Assert.assertEquals(44, Square.Util.deBruijn64Index(Square._D6));
      Assert.assertEquals(42, Square.Util.deBruijn64Index(Square._D7));
      Assert.assertEquals(36, Square.Util.deBruijn64Index(Square._D8));

      Assert.assertEquals(7, Square.Util.deBruijn64Index(Square._E1));
      Assert.assertEquals(47, Square.Util.deBruijn64Index(Square._E2));
      Assert.assertEquals(58, Square.Util.deBruijn64Index(Square._E3));
      Assert.assertEquals(35, Square.Util.deBruijn64Index(Square._E4));
      Assert.assertEquals(41, Square.Util.deBruijn64Index(Square._E5));
      Assert.assertEquals(22, Square.Util.deBruijn64Index(Square._E6));
      Assert.assertEquals(21, Square.Util.deBruijn64Index(Square._E7));
      Assert.assertEquals(18, Square.Util.deBruijn64Index(Square._E8));
   
      Assert.assertEquals(3, Square.Util.deBruijn64Index(Square._F1));
      Assert.assertEquals(55, Square.Util.deBruijn64Index(Square._F2));
      Assert.assertEquals(29, Square.Util.deBruijn64Index(Square._F3));
      Assert.assertEquals(49, Square.Util.deBruijn64Index(Square._F4));
      Assert.assertEquals(52, Square.Util.deBruijn64Index(Square._F5));
      Assert.assertEquals(11, Square.Util.deBruijn64Index(Square._F6));
      Assert.assertEquals(10, Square.Util.deBruijn64Index(Square._F7));
      Assert.assertEquals(9, Square.Util.deBruijn64Index(Square._F8));
   
      Assert.assertEquals(1, Square.Util.deBruijn64Index(Square._G1));
      Assert.assertEquals(59, Square.Util.deBruijn64Index(Square._G2));
      Assert.assertEquals(14, Square.Util.deBruijn64Index(Square._G3));
      Assert.assertEquals(56, Square.Util.deBruijn64Index(Square._G4));
      Assert.assertEquals(26, Square.Util.deBruijn64Index(Square._G5));
      Assert.assertEquals(37, Square.Util.deBruijn64Index(Square._G6));
      Assert.assertEquals(5, Square.Util.deBruijn64Index(Square._G7));
      Assert.assertEquals(4, Square.Util.deBruijn64Index(Square._G8));
   
      Assert.assertEquals(0, Square.Util.deBruijn64Index(Square._H1));
      Assert.assertEquals(61, Square.Util.deBruijn64Index(Square._H2));
      Assert.assertEquals(39, Square.Util.deBruijn64Index(Square._H3));
      Assert.assertEquals(28, Square.Util.deBruijn64Index(Square._H4));
      Assert.assertEquals(45, Square.Util.deBruijn64Index(Square._H5));
      Assert.assertEquals(50, Square.Util.deBruijn64Index(Square._H6));
      Assert.assertEquals(2, Square.Util.deBruijn64Index(Square._H7));
      Assert.assertEquals(34, Square.Util.deBruijn64Index(Square._H8));
   
   }
   
   public void testA1() {
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
                  "10000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._A1).length() - 1] + Long.toBinaryString(Square._A1)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._A1,
            square.getSquare(Square.A1));
   }

   public void testA2() {
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
                  "10000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._A2).length() - 1] + Long.toBinaryString(Square._A2)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._A2,
            square.getSquare(Square.A2));
   }

   public void testA3() {
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
                  "10000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._A3).length() - 1] + Long.toBinaryString(Square._A3)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._A3,
            square.getSquare(Square.A3));
   }

   public void testA4() {
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
                  Square._A4).length() - 1] + Long.toBinaryString(Square._A4)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._A4,
            square.getSquare(Square.A4));
   }

   public void testA5() {
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
                  Square._A5).length() - 1] + Long.toBinaryString(Square._A5)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._A5,
            square.getSquare(Square.A5));
   }

   public void testA6() {
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
                  Square._A6).length() - 1] + Long.toBinaryString(Square._A6)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._A6,
            square.getSquare(Square.A6));
   }

   public void testA7() {
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
                  Square._A7).length() - 1] + Long.toBinaryString(Square._A7)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._A7,
            square.getSquare(Square.A7));
   }

   public void testA8() {
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
                  Square._A8).length() - 1] + Long.toBinaryString(Square._A8)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._A8,
            square.getSquare(Square.A8));
   }

   public void testB1() {
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
                  "01000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._B1).length() - 1] + Long.toBinaryString(Square._B1)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._B1,
            square.getSquare(Square.B1));
   }

   public void testB2() {
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
                  "01000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._B2).length() - 1] + Long.toBinaryString(Square._B2)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._B2,
            square.getSquare(Square.B2));
   }

   public void testB3() {
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
                  "01000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._B3).length() - 1] + Long.toBinaryString(Square._B3)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._B3,
            square.getSquare(Square.B3));
   }

   public void testB4() {
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
                  Square._B4).length() - 1] + Long.toBinaryString(Square._B4)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._B4,
            square.getSquare(Square.B4));
   }

   public void testB5() {
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
                  Square._B5).length() - 1] + Long.toBinaryString(Square._B5)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._B5,
            square.getSquare(Square.B5));
   }

   public void testB6() {
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
                  Square._B6).length() - 1] + Long.toBinaryString(Square._B6)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._B6,
            square.getSquare(Square.B6));
   }

   public void testB7() {
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
                  Square._B7).length() - 1] + Long.toBinaryString(Square._B7)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._B7,
            square.getSquare(Square.B7));
   }

   public void testB8() {
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
                  Square._B8).length() - 1] + Long.toBinaryString(Square._B8)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._B8,
            square.getSquare(Square.B8));
   }

   public void testC1() {
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
                  "00100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._C1).length() - 1] + Long.toBinaryString(Square._C1)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._C1,
            square.getSquare(Square.C1));
   }

   public void testC2() {
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
                  "00100000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._C2).length() - 1] + Long.toBinaryString(Square._C2)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._C2,
            square.getSquare(Square.C2));
   }

   public void testC3() {
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
                  "00100000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._C3).length() - 1] + Long.toBinaryString(Square._C3)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._C3,
            square.getSquare(Square.C3));
   }

   public void testC4() {
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
                  Square._C4).length() - 1] + Long.toBinaryString(Square._C4)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._C4,
            square.getSquare(Square.C4));
   }

   public void testC5() {
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
                  Square._C5).length() - 1] + Long.toBinaryString(Square._C5)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._C5,
            square.getSquare(Square.C5));
   }

   public void testC6() {
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
                  Square._C6).length() - 1] + Long.toBinaryString(Square._C6)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._C6,
            square.getSquare(Square.C6));
   }

   public void testC7() {
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
                  Square._C7).length() - 1] + Long.toBinaryString(Square._C7)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._C7,
            square.getSquare(Square.C7));
   }

   public void testC8() {
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
                  Square._C8).length() - 1] + Long.toBinaryString(Square._C8)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._C8,
            square.getSquare(Square.C8));
   }

   public void testD1() {
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
                  "00010000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._D1).length() - 1] + Long.toBinaryString(Square._D1)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._D1,
            square.getSquare(Square.D1));
   }

   public void testD2() {
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
                  "00010000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._D2).length() - 1] + Long.toBinaryString(Square._D2)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._D2,
            square.getSquare(Square.D2));
   }

   public void testD3() {
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
                  "00010000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._D3).length() - 1] + Long.toBinaryString(Square._D3)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._D3,
            square.getSquare(Square.D3));
   }

   public void testD4() {
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
                  Square._D4).length() - 1] + Long.toBinaryString(Square._D4)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._D4,
            square.getSquare(Square.D4));
   }

   public void testD5() {
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
                  Square._D5).length() - 1] + Long.toBinaryString(Square._D5)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._D5,
            square.getSquare(Square.D5));
   }

   public void testD6() {
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
                  Square._D6).length() - 1] + Long.toBinaryString(Square._D6)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._D6,
            square.getSquare(Square.D6));
   }

   public void testD7() {
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
                  Square._D7).length() - 1] + Long.toBinaryString(Square._D7)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._D7,
            square.getSquare(Square.D7));
   }

   public void testD8() {
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
                  Square._D8).length() - 1] + Long.toBinaryString(Square._D8)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._D8,
            square.getSquare(Square.D8));
   }

   public void testE1() {
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
                  "00001000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._E1).length() - 1] + Long.toBinaryString(Square._E1)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._E1,
            square.getSquare(Square.E1));
   }

   public void testE2() {
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
                  "00001000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._E2).length() - 1] + Long.toBinaryString(Square._E2)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._E2,
            square.getSquare(Square.E2));
   }

   public void testE3() {
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
                  "00001000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._E3).length() - 1] + Long.toBinaryString(Square._E3)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._E3,
            square.getSquare(Square.E3));
   }

   public void testE4() {
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
                  Square._E4).length() - 1] + Long.toBinaryString(Square._E4)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._E4,
            square.getSquare(Square.E4));
   }

   public void testE5() {
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
                  Square._E5).length() - 1] + Long.toBinaryString(Square._E5)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._E5,
            square.getSquare(Square.E5));
   }

   public void testE6() {
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
                  Square._E6).length() - 1] + Long.toBinaryString(Square._E6)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._E6,
            square.getSquare(Square.E6));
   }

   public void testE7() {
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
                  Square._E7).length() - 1] + Long.toBinaryString(Square._E7)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._E7,
            square.getSquare(Square.E7));
   }

   public void testE8() {
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
                  Square._E8).length() - 1] + Long.toBinaryString(Square._E8)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._E8,
            square.getSquare(Square.E8));
   }

   public void testF1() {
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
                  "00000100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._F1).length() - 1] + Long.toBinaryString(Square._F1)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._F1,
            square.getSquare(Square.F1));
   }

   public void testF2() {
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
                  "00000100"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._F2).length() - 1] + Long.toBinaryString(Square._F2)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._F2,
            square.getSquare(Square.F2));
   }

   public void testF3() {
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
                  "00000100"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._F3).length() - 1] + Long.toBinaryString(Square._F3)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._F3,
            square.getSquare(Square.F3));
   }

   public void testF4() {
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
                  Square._F4).length() - 1] + Long.toBinaryString(Square._F4)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._F4,
            square.getSquare(Square.F4));
   }

   public void testF5() {
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
                  Square._F5).length() - 1] + Long.toBinaryString(Square._F5)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._F5,
            square.getSquare(Square.F5));
   }

   public void testF6() {
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
                  Square._F6).length() - 1] + Long.toBinaryString(Square._F6)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._F6,
            square.getSquare(Square.F6));
   }

   public void testF7() {
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
                  Square._F7).length() - 1] + Long.toBinaryString(Square._F7)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._F7,
            square.getSquare(Square.F7));
   }

   public void testF8() {
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
                  Square._F8).length() - 1] + Long.toBinaryString(Square._F8)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._F8,
            square.getSquare(Square.F8));
   }

   public void testG1() {
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
                  "00000010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._G1).length() - 1] + Long.toBinaryString(Square._G1)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._G1,
            square.getSquare(Square.G1));
   }

   public void testG2() {
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
                  "00000010"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._G2).length() - 1] + Long.toBinaryString(Square._G2)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._G2,
            square.getSquare(Square.G2));
   }

   public void testG3() {
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
                  "00000010"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._G3).length() - 1] + Long.toBinaryString(Square._G3)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._G3,
            square.getSquare(Square.G3));
   }

   public void testG4() {
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
                  Square._G4).length() - 1] + Long.toBinaryString(Square._G4)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._G4,
            square.getSquare(Square.G4));
   }

   public void testG5() {
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
                  Square._G5).length() - 1] + Long.toBinaryString(Square._G5)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._G5,
            square.getSquare(Square.G5));
   }

   public void testG6() {
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
                  Square._G6).length() - 1] + Long.toBinaryString(Square._G6)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._G6,
            square.getSquare(Square.G6));
   }

   public void testG7() {
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
                  Square._G7).length() - 1] + Long.toBinaryString(Square._G7)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._G7,
            square.getSquare(Square.G7));
   }

   public void testG8() {
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
                  Square._G8).length() - 1] + Long.toBinaryString(Square._G8)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._G8,
            square.getSquare(Square.G8));
   }

   public void testH1() {
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
                  "00000001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._H1).length() - 1] + Long.toBinaryString(Square._H1)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._H1,
            square.getSquare(Square.H1));
   }

   public void testH2() {
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
                  "00000001"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._H2).length() - 1] + Long.toBinaryString(Square._H2)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._H2,
            square.getSquare(Square.H2));
   }

   public void testH3() {
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
                  "00000001"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Square._H3).length() - 1] + Long.toBinaryString(Square._H3)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._H3,
            square.getSquare(Square.H3));
   }

   public void testH4() {
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
                  Square._H4).length() - 1] + Long.toBinaryString(Square._H4)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._H4,
            square.getSquare(Square.H4));
   }

   public void testH5() {
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
                  Square._H5).length() - 1] + Long.toBinaryString(Square._H5)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._H5,
            square.getSquare(Square.H5));
   }

   public void testH6() {
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
                  Square._H6).length() - 1] + Long.toBinaryString(Square._H6)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._H6,
            square.getSquare(Square.H6));
   }

   public void testH7() {
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
                  Square._H7).length() - 1] + Long.toBinaryString(Square._H7)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._H7,
            square.getSquare(Square.H7));
   }

   public void testH8() {
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
                  Square._H8).length() - 1] + Long.toBinaryString(Square._H8)));
      Square square= Squares.create();
      Assert.assertEquals(
            Square._H8,
            square.getSquare(Square.H8));
   }

   public void testEmptyBoard() {
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
                  Square._EMPTY_BOARD).length() - 1] + Long
                  .toBinaryString(Square._EMPTY_BOARD)));
   }

   public void testFullBoard() {
      Assert.assertEquals(
            ""
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
                  Square._FULL_BOARD).length() - 1] + Long
                  .toBinaryString(Square._FULL_BOARD)));
   }

}