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
            ((p.white.kings ^ Square._E1) == 0L));
      Assert.assertTrue(
            "White queen should be on d1!",
            ((p.white.queens ^ Square._D1) == 0L));
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
            ((p.black.kings ^ Square._E8) == 0L));
      Assert.assertTrue(
            "Black queen should be on d8!",
            ((p.black.queens ^ Square._D8) == 0L));
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
            p.white.isRook(piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on G1!",
            ((piece ^ Square._G1) == 0L));
      Assert.assertTrue(
            "And the piece should be a knight",
            p.white.isKnight(piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on F1!",
            ((piece ^ Square._F1) == 0L));
      Assert.assertTrue(
            "And the piece should be a bishop",
            p.white.isBishop(piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on E1!",
            ((piece ^ Square._E1) == 0L));
      Assert.assertTrue(
            "And the piece should be a king",
            p.white.isKing(piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on D1!",
            ((piece ^ Square._D1) == 0L));
      Assert.assertTrue(
            "And the piece should be a queen",
            p.white.isQueen(piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on C1!",
            ((piece ^ Square._C1) == 0L));
      Assert.assertTrue(
            "And the piece should be a bishop",
            p.white.isBishop(piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on B1!",
            ((piece ^ Square._B1) == 0L));
      Assert.assertTrue(
            "And the piece should be a knight",
            p.white.isKnight(piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on A1!",
            ((piece ^ Square._A1) == 0L));
      Assert.assertTrue(
            "And the piece should be a rook",
            p.white.isRook(piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on H2!",
            ((piece ^ Square._H2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            p.white.isPawn(piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on G2!",
            ((piece ^ Square._G2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            p.white.isPawn(piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on F2!",
            ((piece ^ Square._F2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            p.white.isPawn(piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on E2!",
            ((piece ^ Square._E2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            p.white.isPawn(piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on D2!",
            ((piece ^ Square._D2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            p.white.isPawn(piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on C2!",
            ((piece ^ Square._C2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            p.white.isPawn(piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on B2!",
            ((piece ^ Square._B2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            p.white.isPawn(piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on A2!",
            ((piece ^ Square._A2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            p.white.isPawn(piece));

      Assert.assertTrue(!allWhitePieces.hasNext());

   }

   public void testIsPawnAtInitialPosition() {
      Position p= Position.createInitial();
      Assert.assertTrue(
            "Should be white pawn",
            p.white.isPawn(Square._A2));
      Assert.assertTrue(
            "Should be black pawn",
            p.black.isPawn(Square._A7));
      Assert.assertTrue(
            "Should be white pawn",
            p.white.isPawn(Square._B2));
      Assert.assertTrue(
            "Should be black pawn",
            p.black.isPawn(Square._B7));
      Assert.assertTrue(
            "Should be white pawn",
            p.white.isPawn(Square._C2));
      Assert.assertTrue(
            "Should be black pawn",
            p.black.isPawn(Square._C7));
      Assert.assertTrue(
            "Should be white pawn",
            p.white.isPawn(Square._D2));
      Assert.assertTrue(
            "Should be black pawn",
            p.black.isPawn(Square._D7));
      Assert.assertTrue(
            "Should be white pawn",
            p.white.isPawn(Square._E2));
      Assert.assertTrue(
            "Should be black pawn",
            p.black.isPawn(Square._E7));
      Assert.assertTrue(
            "Should be white pawn",
            p.white.isPawn(Square._F2));
      Assert.assertTrue(
            "Should be black pawn",
            p.black.isPawn(Square._F7));
      Assert.assertTrue(
            "Should be white pawn",
            p.white.isPawn(Square._G2));
      Assert.assertTrue(
            "Should be black pawn",
            p.black.isPawn(Square._G7));
      Assert.assertTrue(
            "Should be white pawn",
            p.white.isPawn(Square._H2));
      Assert.assertTrue(
            "Should be black pawn",
            p.black.isPawn(Square._H7));
   }

   public void testIsKingAtInitialPosition() {
      Position p= Position.createInitial();
      Assert.assertTrue(
            "Should be white king",
            p.white.isKing(Square._E1));
      Assert.assertTrue(
            "Should not be white king",
            !p.white.isKing(Square._A1));
      Assert.assertTrue(
            "Should be black king",
            p.black.isKing(Square._E8));
      Assert.assertTrue(
            "Should not be black king",
            !p.black.isKing(Square._A1));
   }

   public void testIsQueenAtInitialPosition() {
      Position p= Position.createInitial();
      Assert.assertTrue(
            "Should be white queen",
            p.white.isQueen(Square._D1));
      Assert.assertTrue(
            "Should not be white queen",
            !p.white.isQueen(Square._A1));
      Assert.assertTrue(
            "Should be black queen",
            p.black.isQueen(Square._D8));
      Assert.assertTrue(
            "Should not be black queen",
            !p.black.isQueen(Square._A1));
   }

   public void testIsRookAtInitialPosition() {
      Position p= Position.createInitial();
      Assert.assertTrue(
            "Should be white rook",
            p.white.isRook(Square._A1));
      Assert.assertTrue(
            "Should be white rook",
            p.white.isRook(Square._H1));

      Assert.assertTrue(
            "Should be black rook",
            p.black.isRook(Square._A8));
      Assert.assertTrue(
            "Should be black rook",
            p.black.isRook(Square._H8));
   }

   public void testIsBishopAtInitialPosition() {
      Position p= Position.createInitial();
      Assert.assertTrue(
            "Should be white bishop",
            p.white.isBishop(Square._C1));
      Assert.assertTrue(
            "Should be white bishop",
            p.white.isBishop(Square._F1));

      Assert.assertTrue(
            "Should be black bishop",
            p.black.isBishop(Square._C8));
      Assert.assertTrue(
            "Should be black bishop",
            p.black.isBishop(Square._F8));
   }

   public void testIsKnightAtInitialPosition() {
      Position p= Position.createInitial();
      Assert.assertTrue(
            "Should be white knight",
            p.white.isKnight(Square._B1));
      Assert.assertTrue(
            "Should be white knight",
            p.white.isKnight(Square._G1));

      Assert.assertTrue(
            "Should be black knight",
            p.black.isKnight(Square._B8));
      Assert.assertTrue(
            "Should be black knight",
            p.black.isKnight(Square._G8));
   }

   public void testEnpassantAfterA2A4() {
      Position p= Position.createInitial().move(
            Square._A2,
            Square._A4);      
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._A3));
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._B4));
   }

   public void testEnpassantAfterB2B4() {
      Position p= Position.createInitial().move(
            Square._B2,
            Square._B4);      
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._A4));
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._B3));
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._C4));
   }

   public void testEnpassantAfterC2C4() {
      Position p= Position.createInitial().move(
            Square._C2,
            Square._C4);      
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._B4));
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._C3));
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._D4));
   }

   public void testEnpassantAfterD2D4() {
      Position p= Position.createInitial().move(
            Square._D2,
            Square._D4);      
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._C4));
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._D3));
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._E4));
   }

   public void testEnpassantAfterE2E4() {
      Position p= Position.createInitial().move(
            Square._E2,
            Square._E4);      
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._D4));
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._E3));
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._F4));
   }

   public void testEnpassantAfterF2F4() {
      Position p= Position.createInitial().move(
            Square._F2,
            Square._F4);      
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._E4));
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._F3));
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._G4));
   }

   public void testEnpassantAfterG2G4() {
      Position p= Position.createInitial().move(
            Square._G2,
            Square._G4);      
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._F4));
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._G3));
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._H4));
   }

   public void testEnpassantAfterH2H4() {
      Position p= Position.createInitial().move(
            Square._H2,
            Square._H4);      
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._G4));
      Assert.assertTrue(
            "Should be enpassant square",
            p.white.isEnpassant(Square._H3));
   }

}