package org.forritan.talvmenni.game;

import org.forritan.talvmenni.bitboard.Rank;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.Squares;
import org.forritan.talvmenni.bitboard.paths.BlackPawnCaptures;
import org.forritan.talvmenni.bitboard.paths.BlackPawnMoves;
import org.forritan.talvmenni.bitboard.paths.WhitePawnCaptures;
import org.forritan.talvmenni.bitboard.paths.WhitePawnMoves;
import org.forritan.talvmenni.game.Position.Bitboard;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.talvmenni.game.Position.PromotionPiece;


public abstract class PositionFactory implements Position {

   public static int  positionsCreated;
   public static int  nodes = 1;
   protected Bitboard white;
   protected Bitboard black;

   protected PositionFactory() {
      // Statistics...
      PositionFactory.positionsCreated++;
   }

   protected PositionFactory(
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
      this();
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

   protected PositionFactory(
         Bitboard white,
         Bitboard black) {
      this();
      this.white= white;
      this.black= black;
   }

   public static Position createInitialImmutable() {
      return new ImmutablePosition(
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
   }

   /**
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
   public static Position createImmutable(
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
      return new ImmutablePosition(
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
   }

   public static Position createInitialMutable() {
      return new MutablePosition(
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
   }

   /**
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
   public static Position createMutable(
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
      return new MutablePosition(
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
   }

   public static Position createMutable(
         Bitboard white,
         Bitboard black) {
      return new MutablePosition(
            white,
            black);

   }

   public static Position createImmutable(
         Bitboard white,
         Bitboard black) {
      return new ImmutablePosition(
            white,
            black);

   }

   public abstract Position pushMove(
         Bitboard white,
         Bitboard black);

   public abstract Position popMove();

   public Bitboard getBlack() {
      return this.black;
   }

   public Bitboard getWhite() {
      return this.white;
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

      long blackKings= this.black.kings;
      long blackQueens= this.black.queens;
      long blackRooks= this.black.rooks;
      long blackBishops= this.black.bishops;
      long blackKnights= this.black.knights;
      long blackPawns= this.black.pawns;
      long blackCastling= this.black.castling;
      long blackEnpassant= this.black.enpassant;

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
         if (this.black.isAnyPieceOnPosition(to)) {
            if (this.black.isQueen(to)) {
               blackQueens= blackQueens
                     ^ to;
            } else if (this.black.isRook(to)) {
               blackRooks= blackRooks
                     ^ to;
            } else if (this.black.isBishop(to)) {
               blackBishops= blackBishops
                     ^ to;
            } else if (this.black.isKnight(to)) {
               blackKnights= blackKnights
                     ^ to;
            } else if (this.black.isPawn(to)) {
               blackPawns= blackPawns
                     ^ to;
            }
         }

         // ... and clear any enpassant captures
         if (this.black.isEnpassant(to)
               && this.getWhite().isPawn(
                     from)
               && ((to & Rank._6) != Square._EMPTY_BOARD)) {
            blackPawns= blackPawns
                  ^ (this.black.enpassant ^ (this.black.enpassant & WhitePawnCaptures
                        .create().getPathsFrom(
                              from)));
         }

      } else if (this.black.isAnyPieceOnPosition(from)) {
         // Move the the piece...
         if (this.black.isKing(from)) {
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
         } else if (this.black.isQueen(from)) {
            blackQueens= blackQueens
                  ^ from
                  | to;
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
         } else if (this.black.isRook(from)) {
            blackRooks= blackRooks
                  ^ from
                  | to;
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
            blackCastling= ~(~blackCastling | from);
         } else if (this.black.isBishop(from)) {
            blackBishops= blackBishops
                  ^ from
                  | to;
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
         } else if (this.black.isKnight(from)) {
            blackKnights= blackKnights
                  ^ from
                  | to;
            whiteEnpassant= Square._EMPTY_BOARD;
            blackEnpassant= Square._EMPTY_BOARD;
         } else if (this.black.isPawn(from)) {

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
               && this.black.isPawn(from)
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
      } else if (this.black.isAnyPieceOnPosition(from)) { return this.black
            .getPossibleMoves().contains(
                  new Move(
                        from,
                        to)); }
      return false;
   }

}