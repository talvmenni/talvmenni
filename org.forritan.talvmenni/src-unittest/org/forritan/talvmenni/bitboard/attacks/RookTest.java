package org.forritan.talvmenni.bitboard.attacks;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.attacks.Rook;
import org.forritan.talvmenni.game.ImmutablePosition;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.AbstractPosition;


public class RookTest extends TestCase {

   private final String[] zeroPrefix = new String[64];

   public RookTest() {
      for (int i= 0, j= 64; i < zeroPrefix.length; i++, j--) {
         StringBuffer zeroes= new StringBuffer();
         for (int k= 1; k < j; k++) {
            zeroes.append('0');
         }
         zeroPrefix[i]= zeroes.toString();
      }
   }

   public void testRookAttacks1() {
      Position p= Position.Factory.create(
            false,
            false,
            Square._E1, // whiteKings
            Square._G4, // whiteQueens
            Square._A1
                  | Square._H1, // whiteRooks
            Square._B4
                  | Square._F1, // whiteBishops
            Square._C3
                  | Square._G1, // whiteKnights
            Square._A3
                  | Square._B2
                  | Square._C2
                  | Square._D4
                  | Square._E3
                  | Square._F4
                  | Square._G2
                  | Square._H2, // whitePawns
            Square._EMPTY_BOARD, // whiteCastling
            Square._EMPTY_BOARD, // whiteEnpassant
            Square._E8, // blackKings
            Square._D8, // blackQueens
            Square._A5
                  | Square._H8, // blackRooks
            Square._C8
                  | Square._F8, // blackBishops
            Square._D1
                  | Square._F6, // blackKnights
            Square._B7
                  | Square._C7
                  | Square._D5
                  | Square._E6
                  | Square._F7
                  | Square._G7
                  | Square._H7, // blackPawns
            Square._EMPTY_BOARD, // blackCastling
            Square._EMPTY_BOARD // blackEnpassant
            );

      long whiteRookAtA1Attacks= Rook.attacksFrom(
            Square._A1,
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
                  "10000000"
                  + // A2-H2
                  "01110000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  whiteRookAtA1Attacks).length() - 1] + Long
                  .toBinaryString(whiteRookAtA1Attacks)));

      long whiteRookAtH1Attacks= Rook.attacksFrom(
            Square._H1,
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
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  whiteRookAtH1Attacks).length() - 1] + Long
                  .toBinaryString(whiteRookAtH1Attacks)));

      long blackRookAtA5Attacks= Rook.attacksFrom(
            Square._A5,
            p);

      Assert.assertEquals(
            ""
                  + //
                  "10000000"
                  + // A8-H8
                  "10000000"
                  + // A7-H7
                  "10000000"
                  + // A6-H6
                  "01100000"
                  + // A5-H5
                  "10000000"
                  + // A4-H4
                  "10000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  blackRookAtA5Attacks).length() - 1] + Long
                  .toBinaryString(blackRookAtA5Attacks)));

      long blackRookAtH8Attacks= Rook.attacksFrom(
            Square._H8,
            p);

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
                  blackRookAtH8Attacks).length() - 1] + Long
                  .toBinaryString(blackRookAtH8Attacks)));

   }

}