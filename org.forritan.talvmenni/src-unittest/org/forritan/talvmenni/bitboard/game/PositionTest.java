package org.forritan.talvmenni.bitboard.game;

import java.util.Iterator;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.forritan.talvmenni.bitboard.Rank;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.Rules;


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

   public void testAllPiecesIterator() {
      Position p= Position.createInitial();
      Iterator allWhitePieces= p.white.allPiecesIterator();
      long piece;

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on H1!",
            ((piece ^ Square._H1) == 0L));
      Assert.assertTrue(
            "And the piece should be a rook",
            Rules.isRook(
                  p.white,
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on G1!",
            ((piece ^ Square._G1) == 0L));
      Assert.assertTrue(
            "And the piece should be a knight",
            Rules.isKnight(
                  p.white,
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on F1!",
            ((piece ^ Square._F1) == 0L));
      Assert.assertTrue(
            "And the piece should be a bishop",
            Rules.isBishop(
                  p.white,
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on E1!",
            ((piece ^ Square._E1) == 0L));
      Assert.assertTrue(
            "And the piece should be a king",
            Rules.isKing(
                  p.white,
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on D1!",
            ((piece ^ Square._D1) == 0L));
      Assert.assertTrue(
            "And the piece should be a queen",
            Rules.isQueen(
                  p.white,
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on C1!",
            ((piece ^ Square._C1) == 0L));
      Assert.assertTrue(
            "And the piece should be a bishop",
            Rules.isBishop(
                  p.white,
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on B1!",
            ((piece ^ Square._B1) == 0L));
      Assert.assertTrue(
            "And the piece should be a knight",
            Rules.isKnight(
                  p.white,
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on A1!",
            ((piece ^ Square._A1) == 0L));
      Assert.assertTrue(
            "And the piece should be a rook",
            Rules.isRook(
                  p.white,
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on H2!",
            ((piece ^ Square._H2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            Rules.isPawn(
                  p.white,
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on G2!",
            ((piece ^ Square._G2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            Rules.isPawn(
                  p.white,
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on F2!",
            ((piece ^ Square._F2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            Rules.isPawn(
                  p.white,
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on E2!",
            ((piece ^ Square._E2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            Rules.isPawn(
                  p.white,
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on D2!",
            ((piece ^ Square._D2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            Rules.isPawn(
                  p.white,
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on C2!",
            ((piece ^ Square._C2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            Rules.isPawn(
                  p.white,
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on B2!",
            ((piece ^ Square._B2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            Rules.isPawn(
                  p.white,
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on A2!",
            ((piece ^ Square._A2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            Rules.isPawn(
                  p.white,
                  piece));

      Assert.assertTrue(!allWhitePieces.hasNext());

   }

}