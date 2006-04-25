/**
 * talvmenni - A distributed chess-engine implemented in Java(TM)
 * and against Sun Microsystems Jini/JavaSpaces(TM).
 *  
 * Copyright (C) 2004-2006 Eyðun Lamhauge and Eyðun Nielsen
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

package org.forritan.talvmenni.knowledge;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.forritan.talvmenni.bitboard.BitboardIterator;
import org.forritan.talvmenni.bitboard.Rank;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.Squares;
import org.forritan.talvmenni.bitboard.attacks.Bishop;
import org.forritan.talvmenni.bitboard.attacks.BlackPawn;
import org.forritan.talvmenni.bitboard.attacks.King;
import org.forritan.talvmenni.bitboard.attacks.Knight;
import org.forritan.talvmenni.bitboard.attacks.Queen;
import org.forritan.talvmenni.bitboard.attacks.Rook;
import org.forritan.talvmenni.bitboard.attacks.WhitePawn;
import org.forritan.talvmenni.bitboard.paths.BlackPawnMoves;
import org.forritan.talvmenni.bitboard.paths.WhitePawnMoves;


public interface Position extends Serializable {

   public static final long serialVersionUID = 1L;

   public Bitboard getBlack();

   public Bitboard getWhite();

   public Position getImmutable();

   public Position getMutable();

   public Position move(
         Move move);

   public boolean isLegalMove(
         long from,
         long to);

   public boolean isPromotionMove(
         long from,
         long to);

   public boolean isDrawByThreeTimesRepetition();

   public Position pushMove(
         long auxillaryState,
         Bitboard white,
         Bitboard black);

   public Position popMove();

   public class Bitboard implements Serializable {

      public static final long serialVersionUID = 1L;

      public final int         hashCode;
      public final int         partitionSearchHashCode;

      public final boolean     whiteBoard;
      public final Position    parent;

      public final long        kings;
      public final long        queens;
      public final long        rooks;
      public final long        bishops;
      public final long        knights;
      public final long        pawns;

      public final long        castling;
      public final long        enpassant;

      public final long        allPieces;

      private List<Move>             possibleMoves;
      private List<Move>             possibleCaptureMoves;
      private List<Move>             betterOrderMoves;
      private long             allCaptureMovesAttackedSquares;
      private boolean          allCaptureMovesAttackedSquaresInitialized;
      private Boolean          kingsSideCastlingLegal;
      private Boolean          queensSideCastlingLegal;

      /**
       * @param white
       * @param parent
       * @param kings
       * @param queens
       * @param rooks
       * @param bishops
       * @param knights
       * @param pawns
       * @param castling
       * @param enpassant
       */
      public Bitboard(
            boolean whiteBoard,
            Position parent,
            long kings,
            long queens,
            long rooks,
            long bishops,
            long knights,
            long pawns,
            long castling,
            long enpassant) {
         this.whiteBoard= whiteBoard;
         this.parent= parent;
         this.kings= kings;
         this.queens= queens;
         this.rooks= rooks;
         this.bishops= bishops;
         this.knights= knights;
         this.pawns= pawns;

         this.castling= castling;
         this.enpassant= enpassant;

         this.allPieces= this.kings
               | this.queens
               | this.rooks
               | this.bishops
               | this.knights
               | this.pawns;

         int SEED= 17;
         int PRIME_FACTOR= 37;
         int hash= SEED;
         hash= PRIME_FACTOR
               * hash
               + ((int) (this.kings ^ (this.kings >>> 32)));
         hash= PRIME_FACTOR
               * hash
               + ((int) (this.queens ^ (this.queens >>> 32)));
         hash= PRIME_FACTOR
               * hash
               + ((int) (this.rooks ^ (this.rooks >>> 32)));
         hash= PRIME_FACTOR
               * hash
               + ((int) (this.bishops ^ (this.bishops >>> 32)));
         hash= PRIME_FACTOR
               * hash
               + ((int) (this.knights ^ (this.knights >>> 32)));
         hash= PRIME_FACTOR
               * hash
               + ((int) (this.castling ^ (this.castling >>> 32)));
         hash= PRIME_FACTOR
               * hash
               + (whiteBoard ? 0 : 1);

         int partitionSearchHash= hash;

         partitionSearchHash= PRIME_FACTOR
               * partitionSearchHash
               + Bitboard.populationCount(pawns);

         partitionSearchHash= PRIME_FACTOR
               * partitionSearchHash
               + Bitboard.populationCount(enpassant);

         this.partitionSearchHashCode= partitionSearchHash;

         hash= PRIME_FACTOR
               * hash
               + ((int) (this.pawns ^ (this.pawns >>> 32)));
         hash= PRIME_FACTOR
               * hash
               + ((int) (this.enpassant ^ (this.enpassant >>> 32)));

         this.hashCode= hash;

      }

      public static int populationCount(
            long i) {
         i= i
               - ((i >>> 1) & 0x5555555555555555L);
         i= (i & 0x3333333333333333L)
               + ((i >>> 2) & 0x3333333333333333L);
         i= (i + (i >>> 4)) & 0x0f0f0f0f0f0f0f0fL;
         i= i
               + (i >>> 8);
         i= i
               + (i >>> 16);
         i= i
               + (i >>> 32);
         return (int) i & 0x7f;
      }

      public boolean equals(
            Object o) {
         if (o instanceof Bitboard) {
            return (this.whiteBoard == ((Bitboard) o).whiteBoard)
                  && (this.kings == ((Bitboard) o).kings)
                  && (this.queens == ((Bitboard) o).queens)
                  && (this.rooks == ((Bitboard) o).rooks)
                  && (this.bishops == ((Bitboard) o).bishops)
                  && (this.knights == ((Bitboard) o).knights)
                  && (this.pawns == ((Bitboard) o).pawns)
                  && (this.castling == ((Bitboard) o).castling)
                  && (this.enpassant == ((Bitboard) o).enpassant);
         } else {
            return false;
         }
      }

      public boolean partitionSearchEquals(
            Object o) {
         if (o instanceof Bitboard) {
            return (Bitboard.populationCount(this.pawns) == Bitboard
                  .populationCount(((Bitboard) o).pawns))
                  && (Bitboard.populationCount(this.enpassant) == Bitboard
                        .populationCount(((Bitboard) o).enpassant))
                  && (this.whiteBoard == ((Bitboard) o).whiteBoard)
                  && (this.kings == ((Bitboard) o).kings)
                  && (this.queens == ((Bitboard) o).queens)
                  && (this.rooks == ((Bitboard) o).rooks)
                  && (this.bishops == ((Bitboard) o).bishops)
                  && (this.knights == ((Bitboard) o).knights)
                  && (this.castling == ((Bitboard) o).castling);
         } else {
            return false;
         }
      }

      public int hashCode() {
         return this.hashCode;
      }

      public int partitionSearchHashCode() {
         return this.partitionSearchHashCode;
      }

      public void betterMove(
            Move move) {
         if (this.betterOrderMoves == null) {
            this.betterOrderMoves= new ArrayList<Move>();
         }
         this.betterOrderMoves.add(
               0,
               move);
      }

      public void updatePossibleMovesOrdering() {
         this.getPossibleMoves(); // Initialize

         if (this.possibleMoves != null
               && this.betterOrderMoves != null) {
            List<Move> currentPossibleMoves= new ArrayList<Move>();
            currentPossibleMoves.addAll(this.possibleMoves);
            this.possibleMoves= new ArrayList<Move>();
            this.possibleMoves.addAll(this.betterOrderMoves);
            currentPossibleMoves.removeAll(this.betterOrderMoves);
            this.possibleMoves.addAll(currentPossibleMoves);
            this.betterOrderMoves= null;
         }
      }

      public void updateMoveOrderingCapturesFirst() {
         this.getPossibleMoves(); // Initialize
         this.getPossibleCaptureMoves(); // Initialize

         if (this.possibleMoves != null
               && this.possibleCaptureMoves != null) {
            List<Move> currentPossibleMoves= new ArrayList<Move>();
            currentPossibleMoves.addAll(this.possibleMoves);
            this.possibleMoves= new ArrayList<Move>();
            this.possibleMoves.addAll(this.possibleCaptureMoves);
            currentPossibleMoves.removeAll(this.possibleCaptureMoves);
            this.possibleMoves.addAll(currentPossibleMoves);
         }
      }

      public List<Move> getPossibleCaptureMoves() {
         if (this.possibleCaptureMoves == null) {
            this.possibleCaptureMoves= new ArrayList<Move>();

            long allPossibleOpponentCaptures= this
                  .getAllCaptureMovesAttackedSquares();

            if (this.whiteBoard) {
               allPossibleOpponentCaptures&= this.parent.getBlack().allPieces;
            } else {
               allPossibleOpponentCaptures&= this.parent.getWhite().allPieces;
            }

            for (Iterator<Move> it= this.getPossibleMoves().iterator(); it.hasNext();) {
               Move move= it.next();
               if ((move.to & allPossibleOpponentCaptures) != Square._EMPTY_BOARD) {
                  this.possibleCaptureMoves.add(
                        0,
                        move);
               }
            }
         }
         return this.possibleCaptureMoves;
      }

      public List<Move> getPossibleMoves() {
         if (this.possibleMoves == null) {
            this.possibleMoves= new ArrayList<Move>();

            BitboardIterator rooks= this.rooksIterator();
            while (rooks.hasNext()) {
               long fromSquare= rooks.nextBitboard();
               findMoves(
                     this.possibleMoves,
                     fromSquare,
                     new BitboardIterator(
                           Rook.attacksFrom(
                                 fromSquare,
                                 this.parent)));
            }

            BitboardIterator bishops= this.bishopsIterator();
            while (bishops.hasNext()) {
               long fromSquare= bishops.nextBitboard();
               findMoves(
                     this.possibleMoves,
                     fromSquare,
                     new BitboardIterator(
                           Bishop.attacksFrom(
                                 fromSquare,
                                 this.parent)));
            }

            BitboardIterator knights= this.knightsIterator();
            while (knights.hasNext()) {
               long fromSquare= knights.nextBitboard();
               findMoves(
                     this.possibleMoves,
                     fromSquare,
                     new BitboardIterator(
                           Knight.attacksFrom(
                                 fromSquare,
                                 this.parent)));
            }

            BitboardIterator queens= this.queensIterator();
            while (queens.hasNext()) {
               long fromSquare= queens.nextBitboard();
               findMoves(
                     this.possibleMoves,
                     fromSquare,
                     new BitboardIterator(
                           Queen.attacksFrom(
                                 fromSquare,
                                 this.parent)));
            }

            BitboardIterator pawns= this.pawnsIterator();
            while (pawns.hasNext()) {
               long fromSquare= pawns.nextBitboard();

               if (this.whiteBoard) {
                  findMoves(
                        this.possibleMoves,
                        fromSquare,
                        new BitboardIterator(
                              WhitePawn.captureMoveAttacksFrom(
                                    fromSquare,
                                    this.parent)
                                    | WhitePawn.moveAttacksFrom(
                                          fromSquare,
                                          this.parent)));
               } else {
                  findMoves(
                        this.possibleMoves,
                        fromSquare,
                        new BitboardIterator(
                              BlackPawn.captureMoveAttacksFrom(
                                    fromSquare,
                                    this.parent)
                                    | BlackPawn.moveAttacksFrom(
                                          fromSquare,
                                          this.parent)));
               }
            }

            BitboardIterator kings= this.kingsIterator();
            while (kings.hasNext()) {
               long fromSquare= kings.nextBitboard();
               findMoves(
                     this.possibleMoves,
                     fromSquare,
                     new BitboardIterator(
                           King.attacksFrom(
                                 fromSquare,
                                 this.parent)));
            }

            if (this.isQueensSideCastlingLegal()) {
               if (this.whiteBoard) {
                  this.possibleMoves.add(new Move(
                        Square._E1,
                        Square._C1,
                        PromotionPiece.NONE));
               } else {
                  this.possibleMoves.add(new Move(
                        Square._E8,
                        Square._C8,
                        PromotionPiece.NONE));
               }
            }

            if (this.isKingsSideCastlingLegal()) {
               if (this.whiteBoard) {
                  this.possibleMoves.add(new Move(
                        Square._E1,
                        Square._G1,
                        PromotionPiece.NONE));
               } else {
                  this.possibleMoves.add(new Move(
                        Square._E8,
                        Square._G8,
                        PromotionPiece.NONE));
               }
            }
         }
         return this.possibleMoves;
      }

      private void findMoves(
            List<Move> result,
            long fromSquare,
            BitboardIterator moves) {
         while (moves.hasNext()) {
            long toSquare= moves.nextBitboard();
            Position newPosition;
            if (this.parent.isPromotionMove(
                  fromSquare,
                  toSquare)) {
               for (int promoteTo= PromotionPiece.QUEEN; promoteTo <= PromotionPiece.KNIGHT; promoteTo++) {
                  newPosition= this.parent.move(new Move(
                        fromSquare,
                        toSquare,
                        promoteTo));
                  this.addMoveToResultIfNotInCheck(
                        result,
                        fromSquare,
                        toSquare,
                        promoteTo,
                        newPosition);
                  this.parent.popMove();
               }
            } else {
               newPosition= this.parent.move(new Move(
                     fromSquare,
                     toSquare,
                     PromotionPiece.NONE));
               this.addMoveToResultIfNotInCheck(
                     result,
                     fromSquare,
                     toSquare,
                     PromotionPiece.NONE,
                     newPosition);
               this.parent.popMove();
            }
            newPosition= null;
         }
      }

      /**
       * @param result
       * @param fromSquare
       * @param toSquare
       * @param newPosition
       */
      private void addMoveToResultIfNotInCheck(
            List<Move> result,
            long fromSquare,
            long toSquare,
            int promotionPiece,
            Position newPosition) {
         if (this.whiteBoard) {
            if (!newPosition.getWhite().isInCheck()) {
               result.add(new Move(
                     fromSquare,
                     toSquare,
                     promotionPiece));
            }
         } else {
            if (!newPosition.getBlack().isInCheck()) {
               result.add(new Move(
                     fromSquare,
                     toSquare,
                     promotionPiece));
            }
         }
      }

      /**
       * Is "castling kings side" (o-o) legal?
       */
      public boolean isKingsSideCastlingLegal() {

         if (this.kingsSideCastlingLegal == null) {

            boolean piecesNotMoved;

            if (whiteBoard) {
               piecesNotMoved= (this.castling & Square._E1) != Square._EMPTY_BOARD
                     && (this.castling & Square._H1) != Square._EMPTY_BOARD;
            } else {
               piecesNotMoved= (this.castling & Square._E8) != Square._EMPTY_BOARD
                     && (this.castling & Square._H8) != Square._EMPTY_BOARD;
            }

            boolean result= false;

            if (piecesNotMoved) {
               if (whiteBoard) {
                  result= ((this.parent.getBlack()
                        .getAllCaptureMovesAttackedSquares() & (Square._E1
                        | Square._F1 | Square._G1)) == Square._EMPTY_BOARD)
                        && (((this.allPieces | this.parent.getBlack().allPieces) & (Square._F1 | Square._G1)) == Square._EMPTY_BOARD);
               } else {
                  result= ((this.parent.getWhite()
                        .getAllCaptureMovesAttackedSquares() & (Square._E8
                        | Square._F8 | Square._G8)) == Square._EMPTY_BOARD)
                        && (((this.allPieces | this.parent.getWhite().allPieces) & (Square._F8 | Square._G8)) == Square._EMPTY_BOARD);
               }
            }
            this.kingsSideCastlingLegal= Boolean.valueOf(result);
         }
         return this.kingsSideCastlingLegal.booleanValue();
      }

      /**
       * Is "castling queens side" (o-o-o) legal?
       */
      public boolean isQueensSideCastlingLegal() {

         if (this.queensSideCastlingLegal == null) {

            boolean piecesNotMoved;

            if (whiteBoard) {
               piecesNotMoved= (this.castling & Square._A1) != Square._EMPTY_BOARD
                     && (this.castling & Square._E1) != Square._EMPTY_BOARD;
            } else {
               piecesNotMoved= (this.castling & Square._A8) != Square._EMPTY_BOARD
                     && (this.castling & Square._E8) != Square._EMPTY_BOARD;
            }

            boolean result= false;

            if (piecesNotMoved) {
               if (whiteBoard) {
                  result= ((this.parent.getBlack()
                        .getAllCaptureMovesAttackedSquares() & (Square._C1
                        | Square._D1 | Square._E1)) == Square._EMPTY_BOARD)
                        && (((this.allPieces | this.parent.getBlack().allPieces) & (Square._B1
                              | Square._C1 | Square._D1)) == Square._EMPTY_BOARD);
               } else {
                  result= ((this.parent.getWhite()
                        .getAllCaptureMovesAttackedSquares() & (Square._C8
                        | Square._D8 | Square._E8)) == Square._EMPTY_BOARD)
                        && (((this.allPieces | this.parent.getWhite().allPieces) & (Square._B8
                              | Square._C8 | Square._D8)) == Square._EMPTY_BOARD);
               }
            }
            this.queensSideCastlingLegal= Boolean.valueOf(result);
         }
         return this.queensSideCastlingLegal.booleanValue();
      }

      public long getAllPawnsReadyForPromotion() {
         //TODO: Implementation...
         return Square._EMPTY_BOARD;
      }

      public boolean isInCheck() {
         long allSquaresUnderAttackByOppositionPieces;
         if (this.whiteBoard) {
            allSquaresUnderAttackByOppositionPieces= this.parent.getBlack()
                  .getAllCaptureMovesAttackedSquares();
         } else {
            allSquaresUnderAttackByOppositionPieces= this.parent.getWhite()
                  .getAllCaptureMovesAttackedSquares();
         }
         return (allSquaresUnderAttackByOppositionPieces & this.kings) != Squares._EMPTY_BOARD;
      }

      public BitboardIterator allPiecesIterator() {
         return new BitboardIterator(
               this.allPieces);
      }

      public BitboardIterator kingsIterator() {
         return new BitboardIterator(
               this.kings);
      }

      public BitboardIterator queensIterator() {
         return new BitboardIterator(
               this.queens);
      }

      public BitboardIterator rooksIterator() {
         return new BitboardIterator(
               this.rooks);
      }

      public BitboardIterator bishopsIterator() {
         return new BitboardIterator(
               this.bishops);
      }

      public BitboardIterator knightsIterator() {
         return new BitboardIterator(
               this.knights);
      }

      public BitboardIterator pawnsIterator() {
         return new BitboardIterator(
               this.pawns);
      }

      public boolean isAnyPieceOnPosition(
            long position) {
         return ((this.allPieces & position) != Square._EMPTY_BOARD);
      }

      public boolean isKing(
            long position) {
         return ((this.kings & position) != Square._EMPTY_BOARD);
      }

      public boolean isQueen(
            long position) {
         return ((this.queens & position) != Square._EMPTY_BOARD);
      }

      public boolean isRook(
            long position) {
         return ((this.rooks & position) != Square._EMPTY_BOARD);
      }

      public boolean isBishop(
            long position) {
         return ((this.bishops & position) != Square._EMPTY_BOARD);
      }

      public boolean isKnight(
            long position) {
         return ((this.knights & position) != Square._EMPTY_BOARD);
      }

      public boolean isPawn(
            long position) {
         return ((this.pawns & position) != Square._EMPTY_BOARD);
      }

      public boolean isEnpassant(
            long position) {
         return ((this.enpassant & position) != Square._EMPTY_BOARD);
      }

      public long getAllCaptureMovesAttackedSquares() {

         if (!this.allCaptureMovesAttackedSquaresInitialized) {
            this.allCaptureMovesAttackedSquaresInitialized= true;

            long result= Square._EMPTY_BOARD;

            BitboardIterator kings= this.kingsIterator();
            while (kings.hasNext()) {
               long square= kings.nextBitboard();
               result|= King.attacksFrom(
                     square,
                     this.parent);
            }

            BitboardIterator queens= this.queensIterator();
            while (queens.hasNext()) {
               long square= queens.nextBitboard();
               result|= Queen.attacksFrom(
                     square,
                     this.parent);
            }

            BitboardIterator rooks= this.rooksIterator();
            while (rooks.hasNext()) {
               long square= rooks.nextBitboard();
               result|= Rook.attacksFrom(
                     square,
                     this.parent);
            }

            BitboardIterator bishops= this.bishopsIterator();
            while (bishops.hasNext()) {
               long square= bishops.nextBitboard();
               result|= Bishop.attacksFrom(
                     square,
                     this.parent);
            }

            BitboardIterator knights= this.knightsIterator();
            while (knights.hasNext()) {
               long square= knights.nextBitboard();
               result|= Knight.attacksFrom(
                     square,
                     this.parent);
            }

            BitboardIterator pawns= this.pawnsIterator();
            while (pawns.hasNext()) {
               if (this.whiteBoard) {
                  long square= pawns.nextBitboard();
                  result|= WhitePawn.captureMoveAttacksFrom(
                        square,
                        this.parent);
               } else {
                  long square= pawns.nextBitboard();
                  result|= BlackPawn.captureMoveAttacksFrom(
                        square,
                        this.parent);
               }
            }
            this.allCaptureMovesAttackedSquares= result;
         }
         return this.allCaptureMovesAttackedSquares;
      }
   }

   public static interface PromotionPiece extends Serializable {

      public static final long     serialVersionUID = 1L;

      public final static int      NONE             = 4;

      public final static int      QUEEN            = 0;
      public final static int      ROOK             = 1;
      public final static int      BISHOP           = 2;
      public final static int      KNIGHT           = 3;
      public final static String[] STRINGS          = new String[] {
                                                          "q",
                                                          "r",
                                                          "b",
                                                          "n",
                                                          ""};
   }

   public static class Move implements Serializable {

      public static final long serialVersionUID = 1L;

      public final static int  SEED             = 17;
      public final static int  PRIME_FACTOR     = 37;

      public final long        from;
      public final long        to;
      public final int         promotionPiece;

      public final int         hashCode;

      public Move(
            long from,
            long to,
            int promotionPiece) {
         this.from= from;
         this.to= to;
         this.promotionPiece= promotionPiece;

         int hash= SEED;
         hash= PRIME_FACTOR
               * hash
               + ((int) (this.from ^ (this.from >>> 32)));
         hash= PRIME_FACTOR
               * hash
               + ((int) (this.to ^ (this.to >>> 32)));
         this.hashCode= hash;
      }

      public String toString() {
         Square sq= Squares.create();
         return sq.getSquareName(from)
               + sq.getSquareName(to)
               + (this.promotionPiece == PromotionPiece.NONE ? ""
                     : PromotionPiece.STRINGS[this.promotionPiece]);
      }

      public boolean equals(
            Move otherMove) {
         return (this.from == otherMove.from)
               && (this.to == otherMove.to);
      }

      public boolean equalsIncludingPromotion(
            Move otherMove) {
         return (this.from == otherMove.from)
               && (this.to == otherMove.to)
               && (this.promotionPiece == otherMove.promotionPiece);
      }

      public boolean equals(
            Object obj) {
         if (obj instanceof Move) {
            return this.equals((Move) obj);
         } else {
            return false;
         }
      }

      public int hashCode() {
         return this.hashCode;
      }

   }

   public static class Factory {

      public static Position createInitial(
            Class positionClass) throws IllegalArgumentException,
            InstantiationException, IllegalAccessException,
            InvocationTargetException, SecurityException, NoSuchMethodException {

         Constructor constructor= positionClass.getConstructor(new Class[] {
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class});
         return (Position) constructor.newInstance(
               new Object[] { 
               new Long(AuxiliaryState.NO_AUXILIARY_STATE),
               new Long(Square._E1), // whiteKings
               new Long(Square._D1), // whiteQueens
               new Long(Square._A1
                           | Square._H1), // whiteRooks
               new Long(Square._C1
                           | Square._F1), // whiteBishops
               new Long(Square._B1
                           | Square._G1), // whiteKnights
               new Long(Rank._2), // whitePawns
               new Long(Square._A1
                           | Square._E1
                           | Square._H1), // whiteCastling
               new Long(Square._EMPTY_BOARD), // whiteEnpassant
               new Long(Square._E8), // blackKings
               new Long(Square._D8), // blackQueens
               new Long(Square._A8
                           | Square._H8), // blackRooks
               new Long(Square._C8
                           | Square._F8), // blackBishops
               new Long(Square._B8
                           | Square._G8), // blackKnights
               new Long(Rank._7), // blackPawns
               new Long(Square._A8
                           | Square._E8
                           | Square._H8), // blackCastling
               new Long(Square._EMPTY_BOARD) // blackEnpassant
               });

      }

      public static Position create(
            Class positionClass,
            long auxillaryState,
            long whiteKings,
            long whiteQueens,
            long whiteRooks,
            long whiteBishops,
            long whiteKnights,
            long whitePawns,
            long whiteCastling,
            long whiteEnpassant,
            long blackKings,
            long blackQueens,
            long blackRooks,
            long blackBishops,
            long blackKnights,
            long blackPawns,
            long blackCastling,
            long blackEnpassant) throws IllegalArgumentException,
            InstantiationException, IllegalAccessException,
            InvocationTargetException, SecurityException, NoSuchMethodException {

         Constructor constructor= positionClass.getConstructor(new Class[] {
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class,
               long.class});

         return (Position) constructor.newInstance(
               new Object[] { 
               new Long(auxillaryState),
               new Long(whiteKings), // whiteKings
               new Long(whiteQueens), // whiteQueens
               new Long(whiteRooks), // whiteRooks
               new Long(whiteBishops), // whiteBishops
               new Long(whiteKnights), // whiteKnights
               new Long(whitePawns), // whitePawns
               new Long(whiteCastling), // whiteCastling
               new Long(whiteEnpassant), // whiteEnpassant
               new Long(blackKings), // blackKings
               new Long(blackKnights), // blackQueens
               new Long(blackRooks), // blackRooks
               new Long(blackBishops), // blackBishops
               new Long(blackKnights), // blackKnights
               new Long(blackPawns), // blackPawns
               new Long(blackCastling), // blackCastling
               new Long(blackEnpassant) // blackEnpassant
               });
      }

      /**
       * @param mutable
       * @param whiteKings
       * @param whiteQueens
       * @param whiteRooks
       * @param whiteBishops
       * @param whiteKnights
       * @param whitePawns
       * @param whiteCastling
       * @param whiteEnpassant
       * @param blackKings
       * @param blackQueens
       * @param blackRooks
       * @param blackBishops
       * @param blackKnights
       * @param blackPawns
       * @param blackCastling
       * @param blackEnpassant
       * @return
       */
      public static Position create(
            boolean partitionSearchPosition,
            boolean mutable,
            long auxillaryState,
            long whiteKings,
            long whiteQueens,
            long whiteRooks,
            long whiteBishops,
            long whiteKnights,
            long whitePawns,
            long whiteCastling,
            long whiteEnpassant,
            long blackKings,
            long blackQueens,
            long blackRooks,
            long blackBishops,
            long blackKnights,
            long blackPawns,
            long blackCastling,
            long blackEnpassant) {
         if (mutable
               && !partitionSearchPosition) {
            return new MutablePosition(
                  auxillaryState,
                  whiteKings,
                  whiteQueens,
                  whiteRooks,
                  whiteBishops,
                  whiteKnights,
                  whitePawns,
                  whiteCastling,
                  whiteEnpassant,
                  blackKings,
                  blackQueens,
                  blackRooks,
                  blackBishops,
                  blackKnights,
                  blackPawns,
                  blackCastling,
                  blackEnpassant);
         } else if (!mutable
               && !partitionSearchPosition) {
            return new ImmutablePosition(
                  auxillaryState,
                  whiteKings,
                  whiteQueens,
                  whiteRooks,
                  whiteBishops,
                  whiteKnights,
                  whitePawns,
                  whiteCastling,
                  whiteEnpassant,
                  blackKings,
                  blackQueens,
                  blackRooks,
                  blackBishops,
                  blackKnights,
                  blackPawns,
                  blackCastling,
                  blackEnpassant);
         } else if (mutable
               && partitionSearchPosition) {
            return new MutablePartitionSearchPosition(
                  auxillaryState,
                  whiteKings,
                  whiteQueens,
                  whiteRooks,
                  whiteBishops,
                  whiteKnights,
                  whitePawns,
                  whiteCastling,
                  whiteEnpassant,
                  blackKings,
                  blackQueens,
                  blackRooks,
                  blackBishops,
                  blackKnights,
                  blackPawns,
                  blackCastling,
                  blackEnpassant);
         } else if (!mutable
               && partitionSearchPosition) { return new ImmutablePartitionSearchPosition(
               auxillaryState,
               whiteKings,
               whiteQueens,
               whiteRooks,
               whiteBishops,
               whiteKnights,
               whitePawns,
               whiteCastling,
               whiteEnpassant,
               blackKings,
               blackQueens,
               blackRooks,
               blackBishops,
               blackKnights,
               blackPawns,
               blackCastling,
               blackEnpassant); }
         return null;
      }

      public static Position create(
            boolean partitionSearchPosition,
            boolean mutable,
            long auxillaryState,
            Bitboard white,
            Bitboard black) {
         if (mutable
               && !partitionSearchPosition) {
            return new MutablePosition(
                  auxillaryState,
                  white,
                  black);
         } else if (!mutable
               && !partitionSearchPosition) {
            return new ImmutablePosition(
                  auxillaryState,
                  white,
                  black);
         } else if (mutable
               && partitionSearchPosition) {
            return new MutablePartitionSearchPosition(
                  auxillaryState,
                  white,
                  black);
         } else if (!mutable
               && partitionSearchPosition) { return new ImmutablePartitionSearchPosition(
               auxillaryState,
               white,
               black); }

         return null;

      }

      public static ColorPosition createPositionFromFEN(
            boolean partitionSearchPosition,
            boolean mutable,
            String FENString) {

         Boolean whiteMove= null;

         long whiteKings= Square._EMPTY_BOARD;
         long whiteQueens= Square._EMPTY_BOARD;
         long whiteRooks= Square._EMPTY_BOARD;
         long whiteBishops= Square._EMPTY_BOARD;
         long whiteKnights= Square._EMPTY_BOARD;
         long whitePawns= Square._EMPTY_BOARD;
         long whiteCastling= Square._EMPTY_BOARD;
         long whiteEnpassant= Square._EMPTY_BOARD;
         long blackKings= Square._EMPTY_BOARD;
         long blackQueens= Square._EMPTY_BOARD;
         long blackRooks= Square._EMPTY_BOARD;
         long blackBishops= Square._EMPTY_BOARD;
         long blackKnights= Square._EMPTY_BOARD;
         long blackPawns= Square._EMPTY_BOARD;
         long blackCastling= Square._EMPTY_BOARD;
         long blackEnpassant= Square._EMPTY_BOARD;

         Square square2= Squares.create();
         long sq;

         StringTokenizer st= new StringTokenizer(
               FENString);

         String positionString= st.nextToken();

         int y= 0;
         int x= 0;

         for (int pos= 0; pos < positionString.length(); pos++) {
            char activeChar= positionString.charAt(pos);

            if (activeChar == '/') {
               y++;
               x= 0;
            } else if (Character.isDigit(activeChar)) {
               x+= Integer.parseInt(""
                     + activeChar);
            } else {
               int square= y
                     * 8
                     + x;
               sq= square2.getSquareNormalizedIndex(square);

               if (activeChar == 'r') {
                  blackRooks|= sq;
               } else if (activeChar == 'R') {
                  whiteRooks|= sq;
               } else if (activeChar == 'b') {
                  blackBishops|= sq;
               } else if (activeChar == 'B') {
                  whiteBishops|= sq;
               } else if (activeChar == 'q') {
                  blackQueens|= sq;
               } else if (activeChar == 'Q') {
                  whiteQueens|= sq;
               } else if (activeChar == 'k') {
                  blackKings|= sq;
               } else if (activeChar == 'K') {
                  whiteKings|= sq;
               } else if (activeChar == 'n') {
                  blackKnights|= sq;
               } else if (activeChar == 'N') {
                  whiteKnights|= sq;
               } else if (activeChar == 'p') {
                  blackPawns|= sq;
               } else if (activeChar == 'P') {
                  whitePawns|= sq;
               }

               x++;
            }
         }

         if (st.hasMoreTokens()) {
            String colorToMove= st.nextToken();
            if (colorToMove.equals("w")) {
               whiteMove= Boolean.TRUE;
            } else if (colorToMove.equals("b")) {
               whiteMove= Boolean.FALSE;
            }
         } else {
            // Malformed FEN string
            throw new IllegalArgumentException(
                  "FENString malformed - must say which side is next to move");
         }

         if (st.hasMoreTokens()) {
            String castlingString= st.nextToken();

            for (int pos= 0; pos < castlingString.length(); pos++) {
               char activeChar= castlingString.charAt(pos);
               if (activeChar == 'K') {
                  whiteCastling|= Square._E1;
                  whiteCastling|= Square._H1;
               }
               if (activeChar == 'Q') {
                  whiteCastling|= Square._E1;
                  whiteCastling|= Square._A1;
               }
               if (activeChar == 'k') {
                  blackCastling|= Square._E8;
                  blackCastling|= Square._H8;
               }
               if (activeChar == 'q') {
                  blackCastling|= Square._E8;
                  blackCastling|= Square._A8;
               }
            }
         }

         if (st.hasMoreTokens()) {
            String targetSquareStr= st.nextToken().toUpperCase();
            if (!"-".equalsIgnoreCase(targetSquareStr)) {
               long targetSquare= Squares.create().getSquare(
                     targetSquareStr.toUpperCase());
               if (whiteMove.booleanValue()) {
                  if ((blackPawns & (targetSquare >> 8)) != Square._EMPTY_BOARD) {
                     blackEnpassant= BlackPawnMoves.create().getPathsFrom(
                           (targetSquare << 8));
                  }
               } else {
                  if ((whitePawns & (targetSquare << 8)) != Square._EMPTY_BOARD) {
                     whiteEnpassant= WhitePawnMoves.create().getPathsFrom(
                           (targetSquare >> 8));
                  }
               }
            }
         }

         Position fenPosition= Position.Factory.create(
               partitionSearchPosition,
               mutable,
               AuxiliaryState.NO_AUXILIARY_STATE,
               whiteKings,
               whiteQueens,
               whiteRooks,
               whiteBishops,
               whiteKnights,
               whitePawns,
               whiteCastling,
               whiteEnpassant,
               blackKings,
               blackQueens,
               blackRooks,
               blackBishops,
               blackKnights,
               blackPawns,
               blackCastling,
               blackEnpassant);

         return new ColorPosition(
               fenPosition,
               whiteMove);
      }
   }

   public static class ColorPosition implements Serializable {

      public static final long serialVersionUID = 1L;

      public Position          position;
      public Boolean           whiteToMove;

      public ColorPosition(
            Position position,
            Boolean whiteMove) {
         this.position= position;
         this.whiteToMove= whiteMove;
      }
   }

   public static interface AuxiliaryState {

      /**
       * 64 general bits for any auxiliary information regarding the position as
       * a whole
       */

      public static final long NO_AUXILIARY_STATE             = 0L;
      public static final long DRAW_BY_THREE_TIMES_REPETITION = 1L;

      //      public static final long ___NOT_DEFINED_YET_1 = 1L << 1;
      //      public static final long ___NOT_DEFINED_YET_2 = 1L << 2;
      //      public static final long ___NOT_DEFINED_YET_3 = 1L << 3;
      //      public static final long ___NOT_DEFINED_YET_4 = 1L << 4;
      //      public static final long ___NOT_DEFINED_YET_5 = 1L << 5;
      //      public static final long ___NOT_DEFINED_YET_6 = 1L << 6;
      //      public static final long ___NOT_DEFINED_YET_7 = 1L << 7;
      //      public static final long ___NOT_DEFINED_YET_8 = 1L << 8;
      //      public static final long ___NOT_DEFINED_YET_9 = 1L << 9;
      //
      //      public static final long ___NOT_DEFINED_YET_10 = 1L << 10;
      //      public static final long ___NOT_DEFINED_YET_11 = 1L << 11;
      //      public static final long ___NOT_DEFINED_YET_12 = 1L << 12;
      //      public static final long ___NOT_DEFINED_YET_13 = 1L << 13;
      //      public static final long ___NOT_DEFINED_YET_14 = 1L << 14;
      //      public static final long ___NOT_DEFINED_YET_15 = 1L << 15;
      //      public static final long ___NOT_DEFINED_YET_16 = 1L << 16;
      //      public static final long ___NOT_DEFINED_YET_17 = 1L << 17;
      //      public static final long ___NOT_DEFINED_YET_18 = 1L << 18;
      //      public static final long ___NOT_DEFINED_YET_19 = 1L << 19;
      //
      //      public static final long ___NOT_DEFINED_YET_20 = 1L << 20;
      //      public static final long ___NOT_DEFINED_YET_21 = 1L << 21;
      //      public static final long ___NOT_DEFINED_YET_22 = 1L << 22;
      //      public static final long ___NOT_DEFINED_YET_23 = 1L << 23;
      //      public static final long ___NOT_DEFINED_YET_24 = 1L << 24;
      //      public static final long ___NOT_DEFINED_YET_25 = 1L << 25;
      //      public static final long ___NOT_DEFINED_YET_26 = 1L << 26;
      //      public static final long ___NOT_DEFINED_YET_27 = 1L << 27;
      //      public static final long ___NOT_DEFINED_YET_28 = 1L << 28;
      //      public static final long ___NOT_DEFINED_YET_29 = 1L << 29;
      //
      //      public static final long ___NOT_DEFINED_YET_30 = 1L << 30;
      //      public static final long ___NOT_DEFINED_YET_31 = 1L << 31;
      //      public static final long ___NOT_DEFINED_YET_32 = 1L << 32;
      //      public static final long ___NOT_DEFINED_YET_33 = 1L << 33;
      //      public static final long ___NOT_DEFINED_YET_34 = 1L << 34;
      //      public static final long ___NOT_DEFINED_YET_35 = 1L << 35;
      //      public static final long ___NOT_DEFINED_YET_36 = 1L << 36;
      //      public static final long ___NOT_DEFINED_YET_37 = 1L << 37;
      //      public static final long ___NOT_DEFINED_YET_38 = 1L << 38;
      //      public static final long ___NOT_DEFINED_YET_39 = 1L << 39;
      //
      //      public static final long ___NOT_DEFINED_YET_40 = 1L << 40;
      //      public static final long ___NOT_DEFINED_YET_41 = 1L << 41;
      //      public static final long ___NOT_DEFINED_YET_42 = 1L << 42;
      //      public static final long ___NOT_DEFINED_YET_43 = 1L << 43;
      //      public static final long ___NOT_DEFINED_YET_44 = 1L << 44;
      //      public static final long ___NOT_DEFINED_YET_45 = 1L << 45;
      //      public static final long ___NOT_DEFINED_YET_46 = 1L << 46;
      //      public static final long ___NOT_DEFINED_YET_47 = 1L << 47;
      //      public static final long ___NOT_DEFINED_YET_48 = 1L << 48;
      //      public static final long ___NOT_DEFINED_YET_49 = 1L << 49;
      //
      //      public static final long ___NOT_DEFINED_YET_50 = 1L << 50;
      //      public static final long ___NOT_DEFINED_YET_51 = 1L << 51;
      //      public static final long ___NOT_DEFINED_YET_52 = 1L << 52;
      //      public static final long ___NOT_DEFINED_YET_53 = 1L << 53;
      //      public static final long ___NOT_DEFINED_YET_54 = 1L << 54;
      //      public static final long ___NOT_DEFINED_YET_55 = 1L << 55;
      //      public static final long ___NOT_DEFINED_YET_56 = 1L << 56;
      //      public static final long ___NOT_DEFINED_YET_57 = 1L << 57;
      //      public static final long ___NOT_DEFINED_YET_58 = 1L << 58;
      //      public static final long ___NOT_DEFINED_YET_59 = 1L << 59;
      //
      //      public static final long ___NOT_DEFINED_YET_60 = 1L << 60;
      //      public static final long ___NOT_DEFINED_YET_61 = 1L << 61;
      //      public static final long ___NOT_DEFINED_YET_62 = 1L << 62;
      //      public static final long ___NOT_DEFINED_YET_63 = 1L << 63;

   }
}