package org.forritan.talvmenni.evaluation;

import org.forritan.talvmenni.bitboard.Rank;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.game.ImmutablePosition;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.AbstractPosition;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SimpleMaterialAndPositionalEvaluationTest extends TestCase {

   public void testGetScoreOnInitialPosition() {
      Position p= Position.Factory.createInitial(false);
      Evaluation e= new SimpleMaterialAndPositionalEvaluation();
      Assert.assertEquals(0, e.getScore(p));
   }
   
   public void testGetScoreAllWhitePiecesOnlyBlackKing() {
      Position p= Position.Factory.create(
            false,
            Square._E1, // whiteKings
            Square._D1, // whiteQueens
            Square._A1
                  | Square._H1, // whiteRooks
            Square._C1
                  | Square._F1, // whiteBishops
            Square._B1
                  | Square._G1, // whiteKnights
            Rank._2, // whitePawns
            Square._A1
                  | Square._E1
                  | Square._H1, // whiteCastling
            Square._EMPTY_BOARD, // whiteEnpassant
            Square._E8, // blackKings
            Square._EMPTY_BOARD, // blackQueens
            Square._EMPTY_BOARD, // blackRooks
            Square._EMPTY_BOARD, // blackBishops
            Square._EMPTY_BOARD, // blackKnights
            Square._EMPTY_BOARD, // blackPawns
            Square._EMPTY_BOARD, // blackCastling
            Square._EMPTY_BOARD // blackEnpassant
            );
      Evaluation e= new SimpleMaterialAndPositionalEvaluation();
      Assert.assertEquals(4320, e.getScore(p));
   }
   
   public void testGetScoreAllBlackPiecesOnlyWhiteKing() {
      Position p= Position.Factory.create(
            false,
            Square._E1, // whiteKings
            Square._EMPTY_BOARD, // whiteQueens
            Square._EMPTY_BOARD, // whiteRooks
            Square._EMPTY_BOARD, // whiteBishops
            Square._EMPTY_BOARD, // whiteKnights
            Square._EMPTY_BOARD, // whitePawns
            Square._EMPTY_BOARD, // whiteCastling
            Square._EMPTY_BOARD, // whiteEnpassant
            Square._E8, // blackKings
            Square._D8, // blackQueens
            Square._A8
                  | Square._H8, // blackRooks
            Square._C8
                  | Square._F8, // blackBishops
            Square._B8
                  | Square._G8, // blackKnights
            Rank._7, // blackPawns
            Square._A8
                  | Square._E8
                  | Square._H8, // blackCastling
            Square._EMPTY_BOARD // blackEnpassant
             );
      Evaluation e= new SimpleMaterialAndPositionalEvaluation();
      Assert.assertEquals(-4320, e.getScore(p));
   }
   
}
