package org.forritan.talvmenni.game;

import java.util.StringTokenizer;

import org.forritan.talvmenni.bitboard.Rank;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.Squares;
import org.forritan.talvmenni.bitboard.paths.BlackPawnCaptures;
import org.forritan.talvmenni.bitboard.paths.BlackPawnMoves;
import org.forritan.talvmenni.bitboard.paths.WhitePawnCaptures;
import org.forritan.talvmenni.bitboard.paths.WhitePawnMoves;
import org.forritan.util.Tuple;


public abstract class PositionFactory implements Position {

   protected Bitboard white;
   protected Bitboard black;

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

   public static Position createInitial(boolean mutable) {
      if(mutable) {
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
      } else {
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
         boolean mutable,
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
      if(mutable) {
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
      } else {
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
   }

   public static Position create(
         boolean mutable,
         Bitboard white,
         Bitboard black) {
      if(mutable) {
         return new MutablePosition(
               white,
               black);
      } else {
         return new ImmutablePosition(
               white,
               black);
      }

   }

   
   public static Tuple<Position, Boolean> createPositionFromFEN(boolean mutable,
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
            sq= square2.getSquare(square);

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

      Position fenPosition= PositionFactory.create(
            mutable,
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
      
      return new Tuple<Position, Boolean>(fenPosition, whiteMove);

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