package org.forritan.talvmenni.bitboard.game;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.forritan.talvmenni.bitboard.Rank;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.game.Position;


public class PositionTest extends TestCase {

   public void testCreateInitial() {
      Position p= Position.createInitial();
      Assert.assertTrue(
            "White king should be on e1!",
            ((p.white.king ^ Square._E1) == 0L));
      Assert.assertTrue(
            "White queen should be on d1!",
            ((p.white.queen ^ Square._D1) == 0L));
      Assert.assertTrue(
            "White rooks should be on a1 and h1!",
            ((p.white.rooks ^ (Square._A1 | Square._H1)) == 0L));
      Assert.assertTrue(
            "White bishops should be on c1 and f1!",
            ((p.white.bishops ^ (Square._C1 | Square._F1)) == 0L));
      Assert.assertTrue(
            "White knigths should be on b1 and g1!",
            ((p.white.knights ^ (Square._B1 | Square._G1)) == 0L));
      Assert.assertTrue(
            "White pawns should be on 2nd rank!",
            ((p.white.pawns ^ Rank._2) == 0L));

      Assert.assertTrue(
            "Black king should be on e8!",
            ((p.black.king ^ Square._E8) == 0L));
      Assert.assertTrue(
            "Black queen should be on d8!",
            ((p.black.queen ^ Square._D8) == 0L));
      Assert.assertTrue(
            "Black rooks should be on a8 and h8!",
            ((p.black.rooks ^ (Square._A8 | Square._H8)) == 0L));
      Assert.assertTrue(
            "Black bishops should be on c8 and f8!",
            ((p.black.bishops ^ (Square._C8 | Square._F8)) == 0L));
      Assert.assertTrue(
            "Black knigths should be on b8 and g8!",
            ((p.black.knights ^ (Square._B8 | Square._G8)) == 0L));
      Assert.assertTrue(
            "Black pawns should be on 7th rank!",
            ((p.black.pawns ^ Rank._7) == 0L));
   }

}