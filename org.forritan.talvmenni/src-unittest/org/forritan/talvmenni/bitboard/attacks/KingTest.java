package org.forritan.talvmenni.bitboard.attacks;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.forritan.talvmenni.bitboard.Rank;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.game.Position;


public class KingTest extends TestCase {

   private final String[] zeroPrefix = new String[64];

   public KingTest() {
      for (int i= 0, j= 64; i < zeroPrefix.length; i++, j--) {
         StringBuffer zeroes= new StringBuffer();
         for (int k= 1; k < j; k++) {
            zeroes.append('0');
         }
         zeroPrefix[i]= zeroes.toString();
      }
   }

   public void testWhiteKingInitial() {
      Position initialPosition= Position.createInitial();
      long kingAttacksFromE1= King.attacksFrom(
            Square._E1,
            initialPosition);

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
                  kingAttacksFromE1).length() - 1] + Long
                  .toBinaryString(kingAttacksFromE1)));

   }

   public void testWhiteKingAfterD2D4() {
      Position p= Position.createInitial().move(
            Square._D2,
            Square._D4);
      long kingAttacksFromE1= King.attacksFrom(
            Square._E1,
            p);

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
                  kingAttacksFromE1).length() - 1] + Long
                  .toBinaryString(kingAttacksFromE1)));

   }

   public void testWhiteKingAfterD2D4_E2E4() {
      Position p= Position.createInitial().move(
            Square._D2,
            Square._D4).move(
            Square._E2,
            Square._E4);
      long kingAttacksFromE1= King.attacksFrom(
            Square._E1,
            p);

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
                  "00011000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  kingAttacksFromE1).length() - 1] + Long
                  .toBinaryString(kingAttacksFromE1)));

   }

   public void testWhiteKingAfterD2D3_E2E3_F2F4() {
      Position p= Position.createInitial().move(
            Square._D2,
            Square._D3).move(
            Square._E2,
            Square._E3).move(
            Square._F2,
            Square._F4);
      long kingAttacksFromE1= King.attacksFrom(
            Square._E1,
            p);

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
                  "00011100"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  kingAttacksFromE1).length() - 1] + Long
                  .toBinaryString(kingAttacksFromE1)));

   }

   public void testBlackKingInitial() {
      Position initialPosition= Position.createInitial();
      long kingAttacksFromE8= King.attacksFrom(
            Square._E8,
            initialPosition);

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
                  kingAttacksFromE8).length() - 1] + Long
                  .toBinaryString(kingAttacksFromE8)));

   }

   public void testBlackKingAfterD7D5_F7F5() {
      Position p= Position.createInitial().move(
            Square._D7,
            Square._D5).move(
            Square._F7,
            Square._F5);
      long kingAttacksFromE8= King.attacksFrom(
            Square._E8,
            p);

      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00010100"
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
                  kingAttacksFromE8).length() - 1] + Long
                  .toBinaryString(kingAttacksFromE8)));

   }

   public void testBlackKingAfterD7D5() {
      Position p= Position.createInitial().move(
            Square._D7,
            Square._D5);
      long kingAttacksFromE8= King.attacksFrom(
            Square._E8,
            p);

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
                  kingAttacksFromE8).length() - 1] + Long
                  .toBinaryString(kingAttacksFromE8)));

   }

   public void testBlackKingAfterE7E5() {
      Position p= Position.createInitial().move(
            Square._E7,
            Square._E5);
      long kingAttacksFromE8= King.attacksFrom(
            Square._E8,
            p);

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
                  kingAttacksFromE8).length() - 1] + Long
                  .toBinaryString(kingAttacksFromE8)));

   }

}