package org.forritan.talvmenni.bitboard.game;

import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.game.ImmutablePosition;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.Rules;

import junit.framework.Assert;
import junit.framework.TestCase;


public class RulesTest extends TestCase {

   public void testLegalPawnMovesFromInitialPosition() {
      Position p= ImmutablePosition.createInitial(false);
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
      Position p= ImmutablePosition.createInitial(false);
   }

   public void testLegalBishopMovesFromInitialPosition() {
      Position p= ImmutablePosition.createInitial(false);
   }

   public void testLegalQueenMovesFromInitialPosition() {
      Position p= ImmutablePosition.createInitial(false);
   }

   public void testLegalKingMovesFromInitialPosition() {
      Position p= ImmutablePosition.createInitial(false);
   }

   public void testLegalKnightMovesFromInitialPosition() {
      Position p= ImmutablePosition.createInitial(false);
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


}