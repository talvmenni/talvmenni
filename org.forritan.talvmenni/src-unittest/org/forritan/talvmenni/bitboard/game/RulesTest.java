package org.forritan.talvmenni.bitboard.game;

import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.Rules;

import junit.framework.Assert;
import junit.framework.TestCase;


public class RulesTest extends TestCase {

   public void testLegalPawnMovesFromInitialPosition() {
      Position p= Position.createInitial();
      Assert.assertTrue(
            "Should be legal to move pawn at initial position A2 to A3",
            Rules.isMoveLegal(
                  p,
                  Square._A2,
                  Square._A3,
                  true));
   }

   public void testIsKingAtInitialPosition() {
      Position p= Position.createInitial();
      Assert.assertTrue(
            "Should be white king",
            Rules.isKing(
                  p.white,
                  Square._E1));
      Assert.assertTrue(
            "Should not be white king",
            !Rules.isKing(
                  p.white,
                  Square._A1));
      Assert.assertTrue(
            "Should be black king",
            Rules.isKing(
                  p.black,
                  Square._E8));
      Assert.assertTrue(
            "Should not be black king",
            !Rules.isKing(
                  p.black,
                  Square._A1));
   }

   public void testIsQueenAtInitialPosition() {
      Position p= Position.createInitial();
      Assert.assertTrue(
            "Should be white queen",
            Rules.isQueen(
                  p.white,
                  Square._D1));
      Assert.assertTrue(
            "Should not be white queen",
            !Rules.isQueen(
                  p.white,
                  Square._A1));
      Assert.assertTrue(
            "Should be black queen",
            Rules.isQueen(
                  p.black,
                  Square._D8));
      Assert.assertTrue(
            "Should not be black queen",
            !Rules.isQueen(
                  p.black,
                  Square._A1));
   }

}