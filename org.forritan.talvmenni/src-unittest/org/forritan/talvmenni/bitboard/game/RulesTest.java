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
      Assert.assertTrue(
            "Should be legal to move pawn at initial position A2 to A4",
            Rules.isMoveLegal(
                  p,
                  Square._A2,
                  Square._A4,
                  true));
      Assert.assertTrue(
            "Should be legal to move pawn at initial position B2 to B3",
            Rules.isMoveLegal(
                  p,
                  Square._B2,
                  Square._B3,
                  true));
      Assert.assertTrue(
            "Should be legal to move pawn at initial position B2 to B4",
            Rules.isMoveLegal(
                  p,
                  Square._B2,
                  Square._B4,
                  true));
      Assert.assertTrue(
            "Should be legal to move pawn at initial position C2 to C3",
            Rules.isMoveLegal(
                  p,
                  Square._C2,
                  Square._C3,
                  true));
      Assert.assertTrue(
            "Should be legal to move pawn at initial position C2 to C4",
            Rules.isMoveLegal(
                  p,
                  Square._C2,
                  Square._C4,
                  true));
      Assert.assertTrue(
            "Should be legal to move pawn at initial position D2 to D3",
            Rules.isMoveLegal(
                  p,
                  Square._D2,
                  Square._D3,
                  true));
      Assert.assertTrue(
            "Should be legal to move pawn at initial position D2 to D4",
            Rules.isMoveLegal(
                  p,
                  Square._D2,
                  Square._D4,
                  true));
      Assert.assertTrue(
            "Should be legal to move pawn at initial position E2 to E3",
            Rules.isMoveLegal(
                  p,
                  Square._E2,
                  Square._E3,
                  true));
      Assert.assertTrue(
            "Should be legal to move pawn at initial position E2 to E4",
            Rules.isMoveLegal(
                  p,
                  Square._E2,
                  Square._E4,
                  true));
      Assert.assertTrue(
            "Should be legal to move pawn at initial position F2 to F3",
            Rules.isMoveLegal(
                  p,
                  Square._F2,
                  Square._F3,
                  true));
      Assert.assertTrue(
            "Should be legal to move pawn at initial position F2 to F4",
            Rules.isMoveLegal(
                  p,
                  Square._F2,
                  Square._F4,
                  true));
      Assert.assertTrue(
            "Should be legal to move pawn at initial position G2 to G3",
            Rules.isMoveLegal(
                  p,
                  Square._G2,
                  Square._G3,
                  true));
      Assert.assertTrue(
            "Should be legal to move pawn at initial position G2 to G4",
            Rules.isMoveLegal(
                  p,
                  Square._G2,
                  Square._G4,
                  true));
      Assert.assertTrue(
            "Should be legal to move pawn at initial position H2 to H3",
            Rules.isMoveLegal(
                  p,
                  Square._H2,
                  Square._H3,
                  true));
      Assert.assertTrue(
            "Should be legal to move pawn at initial position H2 to H4",
            Rules.isMoveLegal(
                  p,
                  Square._H2,
                  Square._H4,
                  true));
   }

   public void testLegalRookMovesFromInitialPosition() {
      Position p= Position.createInitial();
   }

   public void testLegalBishopMovesFromInitialPosition() {
      Position p= Position.createInitial();
   }

   public void testLegalQueenMovesFromInitialPosition() {
      Position p= Position.createInitial();
   }

   public void testLegalKingMovesFromInitialPosition() {
      Position p= Position.createInitial();
   }

   public void testLegalKnightMovesFromInitialPosition() {
      Position p= Position.createInitial();
      Assert
            .assertTrue(
                  "Should be legal to move white knight at initial position B1 to A3",
                  Rules.isMoveLegal(
                        p,
                        Square._B1,
                        Square._A3,
                        true));
      Assert
            .assertTrue(
                  "Should be legal to move white knight at initial position B1 to C3",
                  Rules.isMoveLegal(
                        p,
                        Square._B1,
                        Square._C3,
                        true));
      Assert
            .assertTrue(
                  "Should be legal to move white knight at initial position G1 to F3",
                  Rules.isMoveLegal(
                        p,
                        Square._G1,
                        Square._F3,
                        true));
      Assert
            .assertTrue(
                  "Should be legal to move white knight at initial position G1 to H3",
                  Rules.isMoveLegal(
                        p,
                        Square._G1,
                        Square._H3,
                        true));
      Assert
            .assertTrue(
                  "Should be legal to move black knight at initial position B1 to A3",
                  Rules.isMoveLegal(
                        p,
                        Square._B8,
                        Square._A6,
                        false));
      Assert
            .assertTrue(
                  "Should be legal to move black knight at initial position B1 to C3",
                  Rules.isMoveLegal(
                        p,
                        Square._B8,
                        Square._C6,
                        false));
      Assert
            .assertTrue(
                  "Should be legal to move black knight at initial position G1 to F3",
                  Rules.isMoveLegal(
                        p,
                        Square._G8,
                        Square._F6,
                        false));
      Assert
            .assertTrue(
                  "Should be legal to move black knight at initial position G1 to H3",
                  Rules.isMoveLegal(
                        p,
                        Square._G8,
                        Square._H6,
                        false));
   }

   public void testIsPawnAtInitialPosition() {
      Position p= Position.createInitial();
      Assert.assertTrue(
            "Should be white pawn",
            Rules.isPawn(
                  p.white,
                  Square._A2));
      Assert.assertTrue(
            "Should be black pawn",
            Rules.isPawn(
                  p.black,
                  Square._A7));
      Assert.assertTrue(
            "Should be white pawn",
            Rules.isPawn(
                  p.white,
                  Square._B2));
      Assert.assertTrue(
            "Should be black pawn",
            Rules.isPawn(
                  p.black,
                  Square._B7));
      Assert.assertTrue(
            "Should be white pawn",
            Rules.isPawn(
                  p.white,
                  Square._C2));
      Assert.assertTrue(
            "Should be black pawn",
            Rules.isPawn(
                  p.black,
                  Square._C7));
      Assert.assertTrue(
            "Should be white pawn",
            Rules.isPawn(
                  p.white,
                  Square._D2));
      Assert.assertTrue(
            "Should be black pawn",
            Rules.isPawn(
                  p.black,
                  Square._D7));
      Assert.assertTrue(
            "Should be white pawn",
            Rules.isPawn(
                  p.white,
                  Square._E2));
      Assert.assertTrue(
            "Should be black pawn",
            Rules.isPawn(
                  p.black,
                  Square._E7));
      Assert.assertTrue(
            "Should be white pawn",
            Rules.isPawn(
                  p.white,
                  Square._F2));
      Assert.assertTrue(
            "Should be black pawn",
            Rules.isPawn(
                  p.black,
                  Square._F7));
      Assert.assertTrue(
            "Should be white pawn",
            Rules.isPawn(
                  p.white,
                  Square._G2));
      Assert.assertTrue(
            "Should be black pawn",
            Rules.isPawn(
                  p.black,
                  Square._G7));
      Assert.assertTrue(
            "Should be white pawn",
            Rules.isPawn(
                  p.white,
                  Square._H2));
      Assert.assertTrue(
            "Should be black pawn",
            Rules.isPawn(
                  p.black,
                  Square._H7));

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

   public void testIsRookAtInitialPosition() {
      Position p= Position.createInitial();
      Assert.assertTrue(
            "Should be white rook",
            Rules.isRook(
                  p.white,
                  Square._A1));
      Assert.assertTrue(
            "Should be white rook",
            Rules.isRook(
                  p.white,
                  Square._H1));

      Assert.assertTrue(
            "Should be black rook",
            Rules.isRook(
                  p.black,
                  Square._A8));
      Assert.assertTrue(
            "Should be black rook",
            Rules.isRook(
                  p.black,
                  Square._H8));
   }

   public void testIsBishopAtInitialPosition() {
      Position p= Position.createInitial();
      Assert.assertTrue(
            "Should be white bishop",
            Rules.isBishop(
                  p.white,
                  Square._C1));
      Assert.assertTrue(
            "Should be white bishop",
            Rules.isBishop(
                  p.white,
                  Square._F1));

      Assert.assertTrue(
            "Should be black bishop",
            Rules.isBishop(
                  p.black,
                  Square._C8));
      Assert.assertTrue(
            "Should be black bishop",
            Rules.isBishop(
                  p.black,
                  Square._F8));
   }

   public void testIsKnightAtInitialPosition() {
      Position p= Position.createInitial();
      Assert.assertTrue(
            "Should be white knight",
            Rules.isKnight(
                  p.white,
                  Square._B1));
      Assert.assertTrue(
            "Should be white knight",
            Rules.isKnight(
                  p.white,
                  Square._G1));

      Assert.assertTrue(
            "Should be black knight",
            Rules.isKnight(
                  p.black,
                  Square._B8));
      Assert.assertTrue(
            "Should be black knight",
            Rules.isKnight(
                  p.black,
                  Square._G8));
   }

}