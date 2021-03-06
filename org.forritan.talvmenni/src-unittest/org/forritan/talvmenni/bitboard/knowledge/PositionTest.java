/**
 * talvmenni - A distributed chess-engine implemented in Java(TM)
 * and against Sun Microsystems Jini/JavaSpaces(TM).
 *  
 * Copyright (C) 2004-2006 Ey?un Lamhauge and Ey?un Nielsen
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License. 
 */

package org.forritan.talvmenni.bitboard.knowledge;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.forritan.talvmenni.bitboard.Rank;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.knowledge.ImmutablePosition;
import org.forritan.talvmenni.knowledge.MutablePosition;
import org.forritan.talvmenni.knowledge.Position;


public class PositionTest extends TestCase {

   private final String[] zeroPrefix = new String[64];

   public PositionTest() {
      for (int i= 0, j= 64; i < zeroPrefix.length; i++, j--) {
         StringBuffer zeroes= new StringBuffer();
         for (int k= 1; k < j; k++) {
            zeroes.append('0');
         }
         zeroPrefix[i]= zeroes.toString();
      }
   }

   public void testCreateInitial() throws IllegalArgumentException,
         SecurityException, InstantiationException, IllegalAccessException,
         InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(ImmutablePosition.class);
      Assert.assertTrue(
            "White king should be on e1!",
            ((p.getWhite().kings ^ Square._E1) == 0L));
      Assert.assertTrue(
            "White queen should be on d1!",
            ((p.getWhite().queens ^ Square._D1) == 0L));
      Assert.assertTrue(
            "White rooks should be on a1 and h1!",
            ((p.getWhite().rooks ^ (Square._A1 | Square._H1)) == 0L));
      Assert.assertTrue(
            "White bishops should be on c1 and f1!",
            ((p.getWhite().bishops ^ (Square._C1 | Square._F1)) == 0L));
      Assert.assertTrue(
            "White knigths should be on b1 and g1!",
            ((p.getWhite().knights ^ (Square._B1 | Square._G1)) == 0L));
      Assert.assertTrue(
            "White pawns should be on 2nd rank!",
            ((p.getWhite().pawns ^ Rank._2) == 0L));

      Assert.assertTrue(
            "Black king should be on e8!",
            ((p.getBlack().kings ^ Square._E8) == 0L));
      Assert.assertTrue(
            "Black queen should be on d8!",
            ((p.getBlack().queens ^ Square._D8) == 0L));
      Assert.assertTrue(
            "Black rooks should be on a8 and h8!",
            ((p.getBlack().rooks ^ (Square._A8 | Square._H8)) == 0L));
      Assert.assertTrue(
            "Black bishops should be on c8 and f8!",
            ((p.getBlack().bishops ^ (Square._C8 | Square._F8)) == 0L));
      Assert.assertTrue(
            "Black knigths should be on b8 and g8!",
            ((p.getBlack().knights ^ (Square._B8 | Square._G8)) == 0L));
      Assert.assertTrue(
            "Black pawns should be on 7th rank!",
            ((p.getBlack().pawns ^ Rank._7) == 0L));
   }

   public void testAllPiecesIterator() throws IllegalArgumentException,
         SecurityException, InstantiationException, IllegalAccessException,
         InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(ImmutablePosition.class);
      Iterator allWhitePieces= p.getWhite().allPiecesIterator();
      long piece;

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on H1!",
            ((piece ^ Square._H1) == 0L));
      Assert.assertTrue(
            "And the piece should be a rook",
            p.getWhite().isRook(
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on G1!",
            ((piece ^ Square._G1) == 0L));
      Assert.assertTrue(
            "And the piece should be a knight",
            p.getWhite().isKnight(
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on F1!",
            ((piece ^ Square._F1) == 0L));
      Assert.assertTrue(
            "And the piece should be a bishop",
            p.getWhite().isBishop(
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on E1!",
            ((piece ^ Square._E1) == 0L));
      Assert.assertTrue(
            "And the piece should be a king",
            p.getWhite().isKing(
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on D1!",
            ((piece ^ Square._D1) == 0L));
      Assert.assertTrue(
            "And the piece should be a queen",
            p.getWhite().isQueen(
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on C1!",
            ((piece ^ Square._C1) == 0L));
      Assert.assertTrue(
            "And the piece should be a bishop",
            p.getWhite().isBishop(
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on B1!",
            ((piece ^ Square._B1) == 0L));
      Assert.assertTrue(
            "And the piece should be a knight",
            p.getWhite().isKnight(
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on A1!",
            ((piece ^ Square._A1) == 0L));
      Assert.assertTrue(
            "And the piece should be a rook",
            p.getWhite().isRook(
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on H2!",
            ((piece ^ Square._H2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            p.getWhite().isPawn(
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on G2!",
            ((piece ^ Square._G2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            p.getWhite().isPawn(
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on F2!",
            ((piece ^ Square._F2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            p.getWhite().isPawn(
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on E2!",
            ((piece ^ Square._E2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            p.getWhite().isPawn(
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on D2!",
            ((piece ^ Square._D2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            p.getWhite().isPawn(
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on C2!",
            ((piece ^ Square._C2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            p.getWhite().isPawn(
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on B2!",
            ((piece ^ Square._B2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            p.getWhite().isPawn(
                  piece));

      Assert.assertTrue(allWhitePieces.hasNext());
      piece= ((Long) allWhitePieces.next()).longValue();
      Assert.assertTrue(
            "Piece should be on A2!",
            ((piece ^ Square._A2) == 0L));
      Assert.assertTrue(
            "And the piece should be a pawn",
            p.getWhite().isPawn(
                  piece));

      Assert.assertTrue(!allWhitePieces.hasNext());

   }

   public void testIsPawnAtInitialPosition() throws IllegalArgumentException,
         SecurityException, InstantiationException, IllegalAccessException,
         InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(ImmutablePosition.class);
      Assert.assertTrue(
            "Should be white pawn",
            p.getWhite().isPawn(
                  Square._A2));
      Assert.assertTrue(
            "Should be black pawn",
            p.getBlack().isPawn(
                  Square._A7));
      Assert.assertTrue(
            "Should be white pawn",
            p.getWhite().isPawn(
                  Square._B2));
      Assert.assertTrue(
            "Should be black pawn",
            p.getBlack().isPawn(
                  Square._B7));
      Assert.assertTrue(
            "Should be white pawn",
            p.getWhite().isPawn(
                  Square._C2));
      Assert.assertTrue(
            "Should be black pawn",
            p.getBlack().isPawn(
                  Square._C7));
      Assert.assertTrue(
            "Should be white pawn",
            p.getWhite().isPawn(
                  Square._D2));
      Assert.assertTrue(
            "Should be black pawn",
            p.getBlack().isPawn(
                  Square._D7));
      Assert.assertTrue(
            "Should be white pawn",
            p.getWhite().isPawn(
                  Square._E2));
      Assert.assertTrue(
            "Should be black pawn",
            p.getBlack().isPawn(
                  Square._E7));
      Assert.assertTrue(
            "Should be white pawn",
            p.getWhite().isPawn(
                  Square._F2));
      Assert.assertTrue(
            "Should be black pawn",
            p.getBlack().isPawn(
                  Square._F7));
      Assert.assertTrue(
            "Should be white pawn",
            p.getWhite().isPawn(
                  Square._G2));
      Assert.assertTrue(
            "Should be black pawn",
            p.getBlack().isPawn(
                  Square._G7));
      Assert.assertTrue(
            "Should be white pawn",
            p.getWhite().isPawn(
                  Square._H2));
      Assert.assertTrue(
            "Should be black pawn",
            p.getBlack().isPawn(
                  Square._H7));
   }

   public void testIsKingAtInitialPosition() throws IllegalArgumentException,
         SecurityException, InstantiationException, IllegalAccessException,
         InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(ImmutablePosition.class);
      Assert.assertTrue(
            "Should be white king",
            p.getWhite().isKing(
                  Square._E1));
      Assert.assertTrue(
            "Should not be white king",
            !p.getWhite().isKing(
                  Square._A1));
      Assert.assertTrue(
            "Should be black king",
            p.getBlack().isKing(
                  Square._E8));
      Assert.assertTrue(
            "Should not be black king",
            !p.getBlack().isKing(
                  Square._A1));
   }

   public void testIsQueenAtInitialPosition() throws IllegalArgumentException,
         SecurityException, InstantiationException, IllegalAccessException,
         InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(ImmutablePosition.class);
      Assert.assertTrue(
            "Should be white queen",
            p.getWhite().isQueen(
                  Square._D1));
      Assert.assertTrue(
            "Should not be white queen",
            !p.getWhite().isQueen(
                  Square._A1));
      Assert.assertTrue(
            "Should be black queen",
            p.getBlack().isQueen(
                  Square._D8));
      Assert.assertTrue(
            "Should not be black queen",
            !p.getBlack().isQueen(
                  Square._A1));
   }

   public void testIsRookAtInitialPosition() throws IllegalArgumentException,
         SecurityException, InstantiationException, IllegalAccessException,
         InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(ImmutablePosition.class);
      Assert.assertTrue(
            "Should be white rook",
            p.getWhite().isRook(
                  Square._A1));
      Assert.assertTrue(
            "Should be white rook",
            p.getWhite().isRook(
                  Square._H1));

      Assert.assertTrue(
            "Should be black rook",
            p.getBlack().isRook(
                  Square._A8));
      Assert.assertTrue(
            "Should be black rook",
            p.getBlack().isRook(
                  Square._H8));
   }

   public void testIsBishopAtInitialPosition() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(ImmutablePosition.class);
      Assert.assertTrue(
            "Should be white bishop",
            p.getWhite().isBishop(
                  Square._C1));
      Assert.assertTrue(
            "Should be white bishop",
            p.getWhite().isBishop(
                  Square._F1));

      Assert.assertTrue(
            "Should be black bishop",
            p.getBlack().isBishop(
                  Square._C8));
      Assert.assertTrue(
            "Should be black bishop",
            p.getBlack().isBishop(
                  Square._F8));
   }

   public void testIsKnightAtInitialPosition() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(ImmutablePosition.class);
      Assert.assertTrue(
            "Should be white knight",
            p.getWhite().isKnight(
                  Square._B1));
      Assert.assertTrue(
            "Should be white knight",
            p.getWhite().isKnight(
                  Square._G1));

      Assert.assertTrue(
            "Should be black knight",
            p.getBlack().isKnight(
                  Square._B8));
      Assert.assertTrue(
            "Should be black knight",
            p.getBlack().isKnight(
                  Square._G8));
   }

   public void testEnpassantAfterA2A4() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(
            ImmutablePosition.class).move(
            new Position.Move(
                  Square._A2,
                  Square._A4,
                  Position.PromotionPiece.NONE));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getWhite().isEnpassant(
                  Square._A3));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getWhite().isEnpassant(
                  Square._A4));
   }

   public void testEnpassantAfterB2B4() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(
            ImmutablePosition.class).move(
            new Position.Move(
                  Square._B2,
                  Square._B4,
                  Position.PromotionPiece.NONE));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getWhite().isEnpassant(
                  Square._B3));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getWhite().isEnpassant(
                  Square._B4));
   }

   public void testEnpassantAfterC2C4() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(
            ImmutablePosition.class).move(
            new Position.Move(
                  Square._C2,
                  Square._C4,
                  Position.PromotionPiece.NONE));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getWhite().isEnpassant(
                  Square._C3));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getWhite().isEnpassant(
                  Square._C4));
   }

   public void testEnpassantAfterD2D4() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(
            ImmutablePosition.class).move(
            new Position.Move(
                  Square._D2,
                  Square._D4,
                  Position.PromotionPiece.NONE));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getWhite().isEnpassant(
                  Square._D3));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getWhite().isEnpassant(
                  Square._D4));
   }

   public void testEnpassantAfterE2E4() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(
            ImmutablePosition.class).move(
            new Position.Move(
                  Square._E2,
                  Square._E4,
                  Position.PromotionPiece.NONE));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getWhite().isEnpassant(
                  Square._E3));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getWhite().isEnpassant(
                  Square._E4));
   }

   public void testEnpassantAfterF2F4() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(
            ImmutablePosition.class).move(
            new Position.Move(
                  Square._F2,
                  Square._F4,
                  Position.PromotionPiece.NONE));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getWhite().isEnpassant(
                  Square._F3));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getWhite().isEnpassant(
                  Square._F4));
   }

   public void testEnpassantAfterG2G4() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(
            ImmutablePosition.class).move(
            new Position.Move(
                  Square._G2,
                  Square._G4,
                  Position.PromotionPiece.NONE));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getWhite().isEnpassant(
                  Square._G3));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getWhite().isEnpassant(
                  Square._G4));
   }

   public void testEnpassantAfterH2H4() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(
            ImmutablePosition.class).move(
            new Position.Move(
                  Square._H2,
                  Square._H4,
                  Position.PromotionPiece.NONE));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getWhite().isEnpassant(
                  Square._H3));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getWhite().isEnpassant(
                  Square._H4));
   }

   public void testEnpassantAfterA7A5() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(
            ImmutablePosition.class).move(
            new Position.Move(
                  Square._A7,
                  Square._A5,
                  Position.PromotionPiece.NONE));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getBlack().isEnpassant(
                  Square._A6));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getBlack().isEnpassant(
                  Square._A5));
   }

   public void testEnpassantAfterB7B5() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(
            ImmutablePosition.class).move(
            new Position.Move(
                  Square._B7,
                  Square._B5,
                  Position.PromotionPiece.NONE));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getBlack().isEnpassant(
                  Square._B6));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getBlack().isEnpassant(
                  Square._B5));
   }

   public void testEnpassantAfterC7C5() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(
            ImmutablePosition.class).move(
            new Position.Move(
                  Square._C7,
                  Square._C5,
                  Position.PromotionPiece.NONE));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getBlack().isEnpassant(
                  Square._C6));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getBlack().isEnpassant(
                  Square._C5));
   }

   public void testEnpassantAfterD7D5() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(
            ImmutablePosition.class).move(
            new Position.Move(
                  Square._D7,
                  Square._D5,
                  Position.PromotionPiece.NONE));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getBlack().isEnpassant(
                  Square._D6));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getBlack().isEnpassant(
                  Square._D5));
   }

   public void testEnpassantAfterE7E5() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(
            ImmutablePosition.class).move(
            new Position.Move(
                  Square._E7,
                  Square._E5,
                  Position.PromotionPiece.NONE));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getBlack().isEnpassant(
                  Square._E6));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getBlack().isEnpassant(
                  Square._E5));
   }

   public void testEnpassantAfterF7F5() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(
            ImmutablePosition.class).move(
            new Position.Move(
                  Square._F7,
                  Square._F5,
                  Position.PromotionPiece.NONE));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getBlack().isEnpassant(
                  Square._F6));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getBlack().isEnpassant(
                  Square._F5));
   }

   public void testEnpassantAfterG7G5() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(
            ImmutablePosition.class).move(
            new Position.Move(
                  Square._G7,
                  Square._G5,
                  Position.PromotionPiece.NONE));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getBlack().isEnpassant(
                  Square._G6));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getBlack().isEnpassant(
                  Square._G5));
   }

   public void testEnpassantAfterH7H5() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.createInitial(
            ImmutablePosition.class).move(
            new Position.Move(
                  Square._H7,
                  Square._H5,
                  Position.PromotionPiece.NONE));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getBlack().isEnpassant(
                  Square._H6));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getBlack().isEnpassant(
                  Square._H5));
   }

   public void testEnpassant() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
      Position p= Position.Factory.create(
            ImmutablePosition.class,
            Position.AuxiliaryState.NO_AUXILIARY_STATE,
            Square._H1, // whiteKings
            Square._EMPTY_BOARD, // whiteQueens
            Square._EMPTY_BOARD, // whiteRooks
            Square._EMPTY_BOARD, // whiteBishops
            Square._EMPTY_BOARD, // whiteKnights
            Square._C5, // whitePawns
            Square._EMPTY_BOARD, // whiteCastling
            Square._EMPTY_BOARD, // whiteEnpassant
            Square._H8, // blackKings
            Square._EMPTY_BOARD, // blackQueens
            Square._EMPTY_BOARD, // blackRooks
            Square._EMPTY_BOARD, // blackBishops
            Square._EMPTY_BOARD, // blackKnights
            Square._D7, // blackPawns
            Square._EMPTY_BOARD, // blackCastling
            Square._EMPTY_BOARD // blackEnpassant
            );

      Assert.assertTrue(
            "Should be white pawn",
            p.getWhite().isPawn(
                  Square._C5));
      Assert.assertTrue(
            "Should be black pawn",
            p.getBlack().isPawn(
                  Square._D7));

      Assert.assertTrue(
            "Should not be enpassant square",
            !p.getBlack().isEnpassant(
                  Square._D6));
      Assert.assertTrue(
            "Should not be enpassant square",
            !p.getBlack().isEnpassant(
                  Square._D5));

      p= p.move(new Position.Move(
            Square._D7,
            Square._D5,
            Position.PromotionPiece.NONE));

      Assert.assertTrue(
            "Should be white pawn",
            p.getWhite().isPawn(
                  Square._C5));
      Assert.assertTrue(
            "Should be black pawn",
            p.getBlack().isPawn(
                  Square._D5));

      Assert.assertTrue(
            "Should be enpassant square",
            p.getBlack().isEnpassant(
                  Square._D6));
      Assert.assertTrue(
            "Should be enpassant square",
            p.getBlack().isEnpassant(
                  Square._D5));

      p= p.move(new Position.Move(
            Square._C5,
            Square._D6,
            Position.PromotionPiece.NONE));

      Assert.assertTrue(
            "Should be white pawn",
            p.getWhite().isPawn(
                  Square._D6));

      Assert.assertTrue(
            "Should be no black pawn left",
            !p.getBlack().pawnsIterator().hasNext());

      Assert.assertTrue(
            "Should not be enpassant square",
            !p.getBlack().isEnpassant(
                  Square._D6));
      Assert.assertTrue(
            "Should not be enpassant square",
            !p.getBlack().isEnpassant(
                  Square._D5));

   }

   public void testAllAttackedSquaresInitialBoard()
         throws IllegalArgumentException, SecurityException,
         InstantiationException, IllegalAccessException,
         InvocationTargetException, NoSuchMethodException {

      long attacks;
      Position p= Position.Factory.createInitial(ImmutablePosition.class);

      attacks= p.getWhite().getAllCaptureMovesAttackedSquares();
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
                  "10100101"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  attacks).length() - 1] + Long.toBinaryString(attacks)));

      attacks= p.getBlack().getAllCaptureMovesAttackedSquares();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "10100101"
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
                  attacks).length() - 1] + Long.toBinaryString(attacks)));

   }

   public void testAllAttackedSquaresKings() {

      long attacks;
      Position p= Position.Factory.create(
            false,
            false,
            Position.AuxiliaryState.NO_AUXILIARY_STATE,
            Square._F3, // whiteKings
            Square._EMPTY_BOARD, // whiteQueens
            Square._EMPTY_BOARD, // whiteRooks
            Square._EMPTY_BOARD, // whiteBishops
            Square._EMPTY_BOARD, // whiteKnights
            Square._EMPTY_BOARD, // whitePawns
            Square._EMPTY_BOARD, // whiteCastling
            Square._EMPTY_BOARD, // whiteEnpassant
            Square._C6, // blackKings
            Square._EMPTY_BOARD, // blackQueens
            Square._EMPTY_BOARD, // blackRooks
            Square._EMPTY_BOARD, // blackBishops
            Square._EMPTY_BOARD, // blackKnights
            Square._EMPTY_BOARD, // blackPawns
            Square._EMPTY_BOARD, // blackCastling
            Square._EMPTY_BOARD // blackEnpassant
            );

      attacks= p.getWhite().getAllCaptureMovesAttackedSquares();
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
                  "00001110"
                  + // A4-H4
                  "00001010"
                  + // A3-H3
                  "00001110"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  attacks).length() - 1] + Long.toBinaryString(attacks)));

      attacks= p.getBlack().getAllCaptureMovesAttackedSquares();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "01110000"
                  + // A7-H7
                  "01010000"
                  + // A6-H6
                  "01110000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  attacks).length() - 1] + Long.toBinaryString(attacks)));

   }

   public void testEquals() throws IllegalArgumentException, SecurityException,
         InstantiationException, IllegalAccessException,
         InvocationTargetException, NoSuchMethodException {

      Position p1= Position.Factory.createInitial(ImmutablePosition.class);
      Position p2= Position.Factory.createInitial(MutablePosition.class);

      Assert.assertEquals(
            p1,
            p2);
      Assert.assertTrue(
            "HashCode should also be equal...",
            p1.hashCode() == p2.hashCode());

      p1= p1.move(new Position.Move(
            Square._D2,
            Square._D4,
            Position.PromotionPiece.NONE));
      p2= p2.move(new Position.Move(
            Square._D2,
            Square._D4,
            Position.PromotionPiece.NONE));

      Assert.assertEquals(
            p1,
            p2);
      Assert.assertTrue(
            "HashCode should also be equal...",
            p1.hashCode() == p2.hashCode());

      p1= p1.getImmutable();
      p2= p2.getImmutable();

      Assert.assertEquals(
            p1,
            p2);
      Assert.assertTrue(
            "HashCode should also be equal...",
            p1.hashCode() == p2.hashCode());

      p1= p1.getMutable();
      p2= p2.getMutable();

      Assert.assertEquals(
            p1,
            p2);
      Assert.assertTrue(
            "HashCode should also be equal...",
            p1.hashCode() == p2.hashCode());

      Assert.assertTrue(
            "Should be equal...",
            p1.equals(p2));
      Assert.assertTrue(
            "Should be equal...",
            p2.equals(p1));

      p1= p1.move(new Position.Move(
            Square._D7,
            Square._D5,
            Position.PromotionPiece.NONE));

      Assert.assertTrue(
            "Should not be equal...",
            !p1.equals(p2));
      Assert.assertTrue(
            "HashCode should also not be equal...",
            p1.hashCode() != p2.hashCode());

   }

}