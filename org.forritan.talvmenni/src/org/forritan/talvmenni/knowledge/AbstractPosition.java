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

import org.forritan.talvmenni.bitboard.Rank;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.Squares;
import org.forritan.talvmenni.bitboard.paths.BlackPawnCaptures;
import org.forritan.talvmenni.bitboard.paths.BlackPawnMoves;
import org.forritan.talvmenni.bitboard.paths.WhitePawnCaptures;
import org.forritan.talvmenni.bitboard.paths.WhitePawnMoves;


public abstract class AbstractPosition implements Position {

   protected long     auxiliaryState;

   protected Bitboard white;
   protected Bitboard black;

   protected AbstractPosition(
         long auxiliaryState,
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
      this.auxiliaryState= auxiliaryState;
      this.white= new Bitboard(
            true,
            this,
            whiteKings,
            whiteQueens,
            whiteRooks,
            whiteBishops,
            whiteKnights,
            whitePawns,
            whiteCastling,
            whiteEnpassant);
      this.black= new Bitboard(
            false,
            this,
            blackKings,
            blackQueens,
            blackRooks,
            blackBishops,
            blackKnights,
            blackPawns,
            blackCastling,
            blackEnpassant);
   }

   protected AbstractPosition(
         long auxiliaryState,
         Bitboard white,
         Bitboard black) {
      this.auxiliaryState= auxiliaryState;
      this.white= new Bitboard(
            true,
            this,
            white.kings,
            white.queens,
            white.rooks,
            white.bishops,
            white.knights,
            white.pawns,
            white.castling,
            white.enpassant);
      this.black= new Bitboard(
            false,
            this,
            black.kings,
            black.queens,
            black.rooks,
            black.bishops,
            black.knights,
            black.pawns,
            black.castling,
            black.enpassant);
   }

   public abstract Position pushMove(
         long auxiliaryState,
         Bitboard white,
         Bitboard black);

   public abstract Position popMove();

   public synchronized Bitboard getBlack() {
      return this.black;
   }

   public synchronized Bitboard getWhite() {
      return this.white;
   }

   public int hashCode() {
      return this.getWhite().hashCode()
            ^ this.getBlack().hashCode();
   }

   public boolean equals(
         Object o) {
      if (o instanceof Position) {
         return this.getWhite().equals(
               ((Position) o).getWhite())
               && this.getBlack().equals(
                     ((Position) o).getBlack());
      } else {
         return false;
      }
   }

   //   public Position move(
   //         long from,
   //         long to) {
   //      return this.move(new Move(
   //            from,
   //            to,
   //            PromotionPiece.NONE));
   //   }
   //
   //   public Position move(
   //         long from,
   //         long to,
   //         int promotionPiece) {
   //      return this.move(new Move(
   //            from,
   //            to,
   //            promotionPiece));
   //   }

   public Position move(
         Move move) {

      long auxiliaryState= this.auxiliaryState;

      long whiteKings= this.getWhite().kings;
      long whiteQueens= this.getWhite().queens;
      long whiteRooks= this.getWhite().rooks;
      long whiteBishops= this.getWhite().bishops;
      long whiteKnights= this.getWhite().knights;
      long whitePawns= this.getWhite().pawns;
      long whiteCastling= this.getWhite().castling;
      long whiteEnpassant= this.getWhite().enpassant;

      long blackKings= this.getBlack().kings;
      long blackQueens= this.getBlack().queens;
      long blackRooks= this.getBlack().rooks;
      long blackBishops= this.getBlack().bishops;
      long blackKnights= this.getBlack().knights;
      long blackPawns= this.getBlack().pawns;
      long blackCastling= this.getBlack().castling;
      long blackEnpassant= this.getBlack().enpassant;

      if (this.getWhite().isAnyPieceOnPosition(
            move.from)) {
         // Move the the piece...
         if (this.getWhite().isKing(
               move.from)) {
            whiteKings&= ~move.from;
            whiteKings|= move.to;
            if (move.from == Square._E1) {
               if (move.to == Square._C1) {
                  whiteRooks&= ~Square._A1;
                  whiteRooks|= Square._D1;
               } else if (move.to == Square._G1) {
                  whiteRooks&= ~Square._H1;
                  whiteRooks|= Square._F1;
               }
            }
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
            whiteCastling= Square._EMPTY_BOARD;
         } else if (this.getWhite().isQueen(
               move.from)) {
            whiteQueens&= ~move.from;
            whiteQueens|= move.to;
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
         } else if (this.getWhite().isRook(
               move.from)) {
            whiteRooks&= ~move.from;
            whiteRooks|= move.to;
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
            whiteCastling= ~(~whiteCastling | move.from);
         } else if (this.getWhite().isBishop(
               move.from)) {
            whiteBishops&= ~move.from;
            whiteBishops|= move.to;
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
         } else if (this.getWhite().isKnight(
               move.from)) {
            whiteKnights&= ~move.from;
            whiteKnights|= move.to;
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
         } else if (this.getWhite().isPawn(
               move.from)) {

            // First set en passant bits...
            if (((move.from & Rank._2) != Square._EMPTY_BOARD)
                  && (move.to & Rank._4) != Square._EMPTY_BOARD) {
               whiteEnpassant= WhitePawnMoves.create().getPathsFrom(
                     move.from);
            } else {
               whiteEnpassant= Square._EMPTY_BOARD;
            }
            blackEnpassant= Square._EMPTY_BOARD;

            whitePawns&= ~move.from;
            // Check promotion
            if ((~Rank._7 & move.from) == Squares._EMPTY_BOARD) {
               switch (move.promotionPiece) {
                  case PromotionPiece.QUEEN:
                     whiteQueens|= move.to;
                     break;
                  case PromotionPiece.ROOK:
                     whiteRooks|= move.to;
                     break;
                  case PromotionPiece.BISHOP:
                     whiteBishops|= move.to;
                     break;
                  case PromotionPiece.KNIGHT:
                     whiteKnights|= move.to;
                     break;
               }
            } else {
               whitePawns|= move.to;
            }
         }

         //... and clear any captures
         if (this.getBlack().isAnyPieceOnPosition(
               move.to)) {
            if (this.getBlack().isQueen(
                  move.to)) {
               blackQueens&= ~move.to;
            } else if (this.getBlack().isRook(
                  move.to)) {
               blackRooks&= ~move.to;
               blackCastling&= ~move.to;
            } else if (this.getBlack().isBishop(
                  move.to)) {
               blackBishops&= ~move.to;
            } else if (this.getBlack().isKnight(
                  move.to)) {
               blackKnights&= ~move.to;
            } else if (this.getBlack().isPawn(
                  move.to)) {
               blackPawns&= ~move.to;
            }
         }

         // ... and clear any enpassant captures
         if (this.getBlack().isEnpassant(
               move.to)
               && this.getWhite().isPawn(
                     move.from)
               && ((move.to & Rank._6) != Square._EMPTY_BOARD)) {
            blackPawns= blackPawns
                  ^ (this.getBlack().enpassant ^ (this.getBlack().enpassant & WhitePawnCaptures
                        .create().getPathsFrom(
                              move.from)));
         }

      } else if (this.getBlack().isAnyPieceOnPosition(
            move.from)) {
         // Move the the piece...
         if (this.getBlack().isKing(
               move.from)) {
            blackKings&= ~move.from;
            blackKings|= move.to;
            if (move.from == Square._E8) {
               if (move.to == Square._C8) {
                  blackRooks&= ~Square._A8;
                  blackRooks|= Square._D8;
               } else if (move.to == Square._G8) {
                  blackRooks&= ~Square._H8;
                  blackRooks|= Square._F8;
               }
            }
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
            blackCastling= Square._EMPTY_BOARD;
         } else if (this.getBlack().isQueen(
               move.from)) {
            blackQueens&= ~move.from;
            blackQueens|= move.to;
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
         } else if (this.getBlack().isRook(
               move.from)) {
            blackRooks&= ~move.from;
            blackRooks|= move.to;
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
            blackCastling= ~(~blackCastling | move.from);
         } else if (this.getBlack().isBishop(
               move.from)) {
            blackBishops&= ~move.from;
            blackBishops|= move.to;
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
         } else if (this.getBlack().isKnight(
               move.from)) {
            blackKnights&= ~move.from;
            blackKnights|= move.to;
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
         } else if (this.getBlack().isPawn(
               move.from)) {

            if (((move.from & Rank._7) != Square._EMPTY_BOARD)
                  && ((move.to & Rank._5) != Square._EMPTY_BOARD)) {
               blackEnpassant= BlackPawnMoves.create().getPathsFrom(
                     move.from);
            } else {
               blackEnpassant= Square._EMPTY_BOARD;
            }
            whiteEnpassant= Square._EMPTY_BOARD;

            blackPawns&= ~move.from;
            if ((~Rank._2 & move.from) == Squares._EMPTY_BOARD) {
               switch (move.promotionPiece) {
                  case PromotionPiece.QUEEN:
                     blackQueens|= move.to;
                     break;
                  case PromotionPiece.ROOK:
                     blackRooks|= move.to;
                     break;
                  case PromotionPiece.BISHOP:
                     blackBishops|= move.to;
                     break;
                  case PromotionPiece.KNIGHT:
                     blackKnights|= move.to;
                     break;
               }
            } else {
               blackPawns|= move.to;
            }
         }

         //... and clear any captures
         if (this.getWhite().isAnyPieceOnPosition(
               move.to)) {
            if (this.getWhite().isQueen(
                  move.to)) {
               whiteQueens&= ~move.to;
            } else if (this.getWhite().isRook(
                  move.to)) {
               whiteRooks&= ~move.to;
               whiteCastling&= ~move.to;
            } else if (this.getWhite().isBishop(
                  move.to)) {
               whiteBishops&= ~move.to;
            } else if (this.getWhite().isKnight(
                  move.to)) {
               whiteKnights&= ~move.to;
            } else if (this.getWhite().isPawn(
                  move.to)) {
               whitePawns&= ~move.to;
            } else if (this.getWhite().isEnpassant(
                  move.to)) {
               whitePawns&= ~move.to;
            }
         }

         // ... and clear any enpassant captures
         if (this.getWhite().isEnpassant(
               move.to)
               && this.getBlack().isPawn(
                     move.from)
               && ((move.to & Rank._3) != Square._EMPTY_BOARD)) {
            whitePawns= whitePawns
                  ^ (this.getWhite().enpassant ^ (this.getWhite().enpassant & BlackPawnCaptures
                        .create().getPathsFrom(
                              move.from)));
         }

      }

  
      Position newPosition= this.pushMove(
            auxiliaryState,
            new Bitboard(
                  true,
                  this,
                  whiteKings,
                  whiteQueens,
                  whiteRooks,
                  whiteBishops,
                  whiteKnights,
                  whitePawns,
                  whiteCastling,
                  whiteEnpassant),
            new Bitboard(
                  false,
                  this,
                  blackKings,
                  blackQueens,
                  blackRooks,
                  blackBishops,
                  blackKnights,
                  blackPawns,
                  blackCastling,
                  blackEnpassant));

      // ... and then set any auxiliary position states

//      //No.1: Draw by three times repetition..
//      if (Draw.getInstance().by3Repetitions(
//            newPosition)) {
//         ((AbstractPosition)newPosition).auxiliaryState&= AuxiliaryState.DRAW_BY_THREE_TIMES_REPETITION;
//      }

      return newPosition;
   
   }

   public boolean isLegalMove(
         long from,
         long to) {
      if (this.getWhite().isAnyPieceOnPosition(
            from)) {
         return this.getWhite().getPossibleMoves().contains(
               new Move(
                     from,
                     to,
                     Position.PromotionPiece.NONE));
      } else if (this.getBlack().isAnyPieceOnPosition(
            from)) { return this.getBlack().getPossibleMoves().contains(
            new Move(
                  from,
                  to,
                  Position.PromotionPiece.NONE)); }
      return false;
   }

   public boolean isPromotionMove(
         long from,
         long to) {
      if (this.getWhite().isPawn(
            from)) {
         return ((Rank._7 & from) != Square._EMPTY_BOARD);
      } else if (this.getBlack().isPawn(
            from)) { return ((Rank._2 & from) != Square._EMPTY_BOARD); }
      return false;
   }

   public boolean isDrawByThreeTimesRepetition() {
      return ((this.auxiliaryState & AuxiliaryState.DRAW_BY_THREE_TIMES_REPETITION) != AuxiliaryState.NO_AUXILIARY_STATE);
   }

}