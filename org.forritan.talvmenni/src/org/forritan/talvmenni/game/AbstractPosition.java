package org.forritan.talvmenni.game;

import java.util.StringTokenizer;

import org.forritan.talvmenni.bitboard.Rank;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.Squares;
import org.forritan.talvmenni.bitboard.paths.BlackPawnCaptures;
import org.forritan.talvmenni.bitboard.paths.BlackPawnMoves;
import org.forritan.talvmenni.bitboard.paths.WhitePawnCaptures;
import org.forritan.talvmenni.bitboard.paths.WhitePawnMoves;


public abstract class AbstractPosition implements Position {

   protected Bitboard white;
   protected Bitboard black;

   protected AbstractPosition(
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
         Bitboard white,
         Bitboard black) {
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
      return this.getWhite().hashCode() ^ this.getBlack().hashCode();
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

   public Position move(
         long from,
         long to) {
      return this.move(
            from,
            to,
            PromotionPiece.DEFAULT);
   }

   public Position move(
         long from,
         long to,
         int promotionPiece) {

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
            from)) {
         // Move the the piece...
         if (this.getWhite().isKing(
               from)) {
            whiteKings= whiteKings
                  ^ from
                  | to;
            if (from == Square._E1) {
               if (to == Square._C1) {
                  whiteRooks= whiteRooks
                        ^ Square._A1
                        | Square._D1;
               } else if (to == Square._G1) {
                  whiteRooks= whiteRooks
                        ^ Square._H1
                        | Square._F1;
               }
            }
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
            whiteCastling= Square._EMPTY_BOARD;
         } else if (this.getWhite().isQueen(
               from)) {
            whiteQueens= whiteQueens
                  ^ from
                  | to;
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
         } else if (this.getWhite().isRook(
               from)) {
            whiteRooks= whiteRooks
                  ^ from
                  | to;
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
            whiteCastling= ~(~whiteCastling | from);
         } else if (this.getWhite().isBishop(
               from)) {
            whiteBishops= whiteBishops
                  ^ from
                  | to;
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
         } else if (this.getWhite().isKnight(
               from)) {
            whiteKnights= whiteKnights
                  ^ from
                  | to;
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
         } else if (this.getWhite().isPawn(
               from)) {

            // First set en passant bits...
            if (((from & Rank._2) != Square._EMPTY_BOARD)
                  && (to & Rank._4) != Square._EMPTY_BOARD) {
               whiteEnpassant= WhitePawnMoves.create().getPathsFrom(
                     from);
            } else {
               whiteEnpassant= Square._EMPTY_BOARD;
            }
            blackEnpassant= Square._EMPTY_BOARD;

            // Check promotion
            if ((~Rank._7 & from) == Squares._EMPTY_BOARD) {
               whitePawns^= from;
               switch (promotionPiece) {
                  case PromotionPiece.QUEEN:
                     whiteQueens|= to;
                     break;
                  case PromotionPiece.ROOK:
                     whiteRooks|= to;
                     break;
                  case PromotionPiece.BISHOP:
                     whiteBishops|= to;
                     break;
                  case PromotionPiece.KNIGHT:
                     whiteKnights|= to;
                     break;
               }
            } else {
               whitePawns^= from;
               whitePawns|= to;
            }
         }

         //... and clear any captures
         if (this.getBlack().isAnyPieceOnPosition(
               to)) {
            if (this.getBlack().isQueen(
                  to)) {
               blackQueens= blackQueens
                     ^ to;
            } else if (this.getBlack().isRook(
                  to)) {
               blackRooks= blackRooks
                     ^ to;
            } else if (this.getBlack().isBishop(
                  to)) {
               blackBishops= blackBishops
                     ^ to;
            } else if (this.getBlack().isKnight(
                  to)) {
               blackKnights= blackKnights
                     ^ to;
            } else if (this.getBlack().isPawn(
                  to)) {
               blackPawns= blackPawns
                     ^ to;
            }
         }

         // ... and clear any enpassant captures
         if (this.getBlack().isEnpassant(
               to)
               && this.getWhite().isPawn(
                     from)
               && ((to & Rank._6) != Square._EMPTY_BOARD)) {
            blackPawns= blackPawns
                  ^ (this.getBlack().enpassant ^ (this.getBlack().enpassant & WhitePawnCaptures
                        .create().getPathsFrom(
                              from)));
         }

      } else if (this.getBlack().isAnyPieceOnPosition(
            from)) {
         // Move the the piece...
         if (this.getBlack().isKing(
               from)) {
            blackKings= blackKings
                  ^ from
                  | to;
            if (from == Square._E8) {
               if (to == Square._C8) {
                  blackRooks= blackRooks
                        ^ Square._A8
                        | Square._D8;
               } else if (to == Square._G8) {
                  blackRooks= blackRooks
                        ^ Square._H8
                        | Square._F8;
               }
            }
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
            blackCastling= Square._EMPTY_BOARD;
         } else if (this.getBlack().isQueen(
               from)) {
            blackQueens= blackQueens
                  ^ from
                  | to;
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
         } else if (this.getBlack().isRook(
               from)) {
            blackRooks= blackRooks
                  ^ from
                  | to;
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
            blackCastling= ~(~blackCastling | from);
         } else if (this.getBlack().isBishop(
               from)) {
            blackBishops= blackBishops
                  ^ from
                  | to;
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
         } else if (this.getBlack().isKnight(
               from)) {
            blackKnights= blackKnights
                  ^ from
                  | to;
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
         } else if (this.getBlack().isPawn(
               from)) {

            if (((from & Rank._7) != Square._EMPTY_BOARD)
                  && ((to & Rank._5) != Square._EMPTY_BOARD)) {
               blackEnpassant= BlackPawnMoves.create().getPathsFrom(
                     from);
            } else {
               blackEnpassant= Square._EMPTY_BOARD;
            }
            whiteEnpassant= Square._EMPTY_BOARD;

            if ((~Rank._2 & from) == Squares._EMPTY_BOARD) {
               blackPawns^= from;
               switch (promotionPiece) {
                  case PromotionPiece.QUEEN:
                     blackQueens|= to;
                     break;
                  case PromotionPiece.ROOK:
                     blackRooks|= to;
                     break;
                  case PromotionPiece.BISHOP:
                     blackBishops|= to;
                     break;
                  case PromotionPiece.KNIGHT:
                     blackKnights|= to;
                     break;
               }
            } else {
               blackPawns= blackPawns
                     ^ from
                     | to;
            }
         }

         //... and clear any captures
         if (this.getWhite().isAnyPieceOnPosition(
               to)) {
            if (this.getWhite().isQueen(
                  to)) {
               whiteQueens= whiteQueens
                     ^ to;
            } else if (this.getWhite().isRook(
                  to)) {
               whiteRooks= whiteRooks
                     ^ to;
            } else if (this.getWhite().isBishop(
                  to)) {
               whiteBishops= whiteBishops
                     ^ to;
            } else if (this.getWhite().isKnight(
                  to)) {
               whiteKnights= whiteKnights
                     ^ to;
            } else if (this.getWhite().isPawn(
                  to)) {
               whitePawns= whitePawns
                     ^ to;
            } else if (this.getWhite().isEnpassant(
                  to)) {
               whitePawns= whitePawns
                     ^ to;
            }
         }

         // ... and clear any enpassant captures
         if (this.getWhite().isEnpassant(
               to)
               && this.getBlack().isPawn(
                     from)
               && ((to & Rank._3) != Square._EMPTY_BOARD)) {
            whitePawns= whitePawns
                  ^ (this.getWhite().enpassant ^ (this.getWhite().enpassant & BlackPawnCaptures
                        .create().getPathsFrom(
                              from)));
         }

      }

      return this.pushMove(
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
   }

   public boolean isLegalMove(
         long from,
         long to) {
      if (this.getWhite().isAnyPieceOnPosition(
            from)) {
         return this.getWhite().getPossibleMoves().contains(
               new Move(
                     from,
                     to));
      } else if (this.getBlack().isAnyPieceOnPosition(
            from)) { return this.getBlack().getPossibleMoves().contains(
            new Move(
                  from,
                  to)); }
      return false;
   }

}