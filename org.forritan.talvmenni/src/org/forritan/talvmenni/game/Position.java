package org.forritan.talvmenni.game;

import java.util.Iterator;

import org.forritan.talvmenni.bitboard.Rank;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.core.TalvMenni;


public class Position {

   public final Bitboard white;
   public final Bitboard black;

   public static Position createInitial() {
      return new Position(
            Square._E1,
            Square._D1,
            Square._A1
                  | Square._H1,
            Square._C1
                  | Square._F1,
            Square._B1
                  | Square._G1,
            Rank._2,
            Square._A1
                  | Square._E1
                  | Square._H1,
            0L,
            Square._E8,
            Square._D8,
            Square._A8
                  | Square._H8,
            Square._C8
                  | Square._F8,
            Square._B8
                  | Square._G8,
            Rank._7,
            Square._A8
                  | Square._E8
                  | Square._H8,
            0L);
   }

   /**
    * 
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
      return new Position(
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

   /**
    * 
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
    */
   private Position(
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
            whiteKings,
            whiteQueens,
            whiteRooks,
            whiteBishops,
            whiteKnights,
            whitePawns,
            whiteCastling,
            whiteEnpassant);
      this.black= new Bitboard(
            blackKings,
            blackQueens,
            blackRooks,
            blackBishops,
            blackKnights,
            blackPawns,
            blackCastling,
            blackEnpassant);
   }

   public Position move(
         long from,
         long to) {
      Position result= null;

      if (this.isLegalMove(
            from,
            to)) {

         long whiteKings= this.white.kings;
         long whiteQueens= this.white.queens;
         long whiteRooks= this.white.rooks;
         long whiteBishops= this.white.bishops;
         long whiteKnights= this.white.knights;
         long whitePawns= this.white.pawns;
         long whiteCastling= this.white.castling;
         long whiteEnpassant= this.white.enpassant;

         long blackKings= this.black.kings;
         long blackQueens= this.black.queens;
         long blackRooks= this.black.rooks;
         long blackBishops= this.black.bishops;
         long blackKnights= this.black.knights;
         long blackPawns= this.black.pawns;
         long blackCastling= this.black.castling;
         long blackEnpassant= this.black.enpassant;

         if (this.white.isAnyPieceOnPosition(from)) {
            // Move the the piece...
            if (this.white.isKing(from)) {
               whiteKings= whiteKings
                     ^ from
                     & to;
               //TODO: set castling and enpassant
            } else if (this.white.isQueen(from)) {
               whiteQueens= whiteQueens
                     ^ from
                     & to;
               //TODO: set castling and enpassant
            } else if (this.white.isRook(from)) {
               whiteRooks= whiteRooks
                     ^ from
                     & to;
               //TODO: set castling and enpassant
            } else if (this.white.isBishop(from)) {
               whiteBishops= whiteBishops
                     ^ from
                     & to;
               //TODO: set castling and enpassant
            } else if (this.white.isKnight(from)) {
               whiteKnights= whiteKnights
                     ^ from
                     & to;
               //TODO: set castling and enpassant
            } else if (this.white.isPawn(from)) {
               whitePawns= whitePawns
                     ^ from
                     & to;
               //TODO: set castling and enpassant
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

         } else if (this.black.isAnyPieceOnPosition(from)) {
            // Move the the piece...
            if (this.black.isKing(from)) {
               blackKings= blackKings
                     ^ from
                     & to;
               //TODO: set castling and enpassant
            } else if (this.black.isQueen(from)) {
               blackQueens= blackQueens
                     ^ from
                     & to;
               //TODO: set castling and enpassant
            } else if (this.black.isRook(from)) {
               blackRooks= blackRooks
                     ^ from
                     & to;
               //TODO: set castling and enpassant
            } else if (this.black.isBishop(from)) {
               blackBishops= blackBishops
                     ^ from
                     & to;
               //TODO: set castling and enpassant
            } else if (this.black.isKnight(from)) {
               blackKnights= blackKnights
                     ^ from
                     & to;
               //TODO: set castling and enpassant
            } else if (this.black.isPawn(from)) {
               blackPawns= blackPawns
                     ^ from
                     & to;
               //TODO: set castling and enpassant
            }

            //... and clear any captures
            if (this.white.isAnyPieceOnPosition(to)) {
               if (this.white.isQueen(to)) {
                  whiteQueens= whiteQueens
                        ^ to;
               } else if (this.white.isRook(to)) {
                  whiteRooks= whiteRooks
                        ^ to;
               } else if (this.white.isBishop(to)) {
                  whiteBishops= whiteBishops
                        ^ to;
               } else if (this.white.isKnight(to)) {
                  whiteKnights= whiteKnights
                        ^ to;
               } else if (this.white.isPawn(to)) {
                  whitePawns= whitePawns
                        ^ to;
               } else if (this.white.isEnpassant(to)) {
                  whitePawns= whitePawns
                        ^ to;
               }
            }

         }

      } else {
         throw new IllegalArgumentException();
      }
      return result;
   }

   private boolean isLegalMove(
         long from,
         long to) {
      return false;
   }

   public class Bitboard {
      public final long kings;
      public final long queens;
      public final long rooks;
      public final long bishops;
      public final long knights;
      public final long pawns;

      public final long castling;
      public final long enpassant;

      public final long allPieces;

      /**
       * 
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
            long kings,
            long queens,
            long rooks,
            long bishops,
            long knights,
            long pawns,
            long castling,
            long enpassant) {
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
      }

      public Iterator allPiecesIterator() {
         return new BitboardIterator(
               this.allPieces);
      }

      public Iterator kingsIterator() {
         return new BitboardIterator(
               this.kings);
      }

      public Iterator queensIterator() {
         return new BitboardIterator(
               this.queens);
      }

      public Iterator rooksIterator() {
         return new BitboardIterator(
               this.rooks);
      }

      public Iterator bishopsIterator() {
         return new BitboardIterator(
               this.bishops);
      }

      public Iterator knightsIterator() {
         return new BitboardIterator(
               this.knights);
      }

      public Iterator pawnsIterator() {
         return new BitboardIterator(
               this.pawns);
      }

      public boolean isAnyPieceOnPosition(
            long position) {
         return ((this.allPieces & position) != 0L);
      }

      public boolean isKing(
            long position) {
         return ((this.kings & position) != 0L);
      }

      public boolean isQueen(
            long position) {
         return ((this.queens & position) != 0L);
      }

      public boolean isRook(
            long position) {
         return ((this.rooks & position) != 0L);
      }

      public boolean isBishop(
            long position) {
         return ((this.bishops & position) != 0L);
      }

      public boolean isKnight(
            long position) {
         return ((this.knights & position) != 0L);
      }

      public boolean isPawn(
            long position) {
         return ((this.pawns & position) != 0L);
      }

      public boolean isEnpassant(
            long position) {
         return ((this.enpassant & position) != 0L);
      }

      private class BitboardIterator implements Iterator {

         private long bitboard;

         private BitboardIterator(
               long bitboard) {
            this.bitboard= bitboard;
         }

         public boolean hasNext() {
            return this.bitboard != 0L;
         }

         public Object next() {
            long result= Long.lowestOneBit(this.bitboard);

            if (TalvMenni.CROUCHING_TIGER_HIDDEN_DEBUG) {
               System.err.println("DEBUG: this.bitboard= "
                     + this.bitboard
                     + " : "
                     + Long.toBinaryString(this.bitboard));
               System.err.println("DEBUG: result= "
                     + result
                     + " : "
                     + Long.toBinaryString(result));
            }

            this.bitboard= this.bitboard
                  ^ result;

            if (TalvMenni.CROUCHING_TIGER_HIDDEN_DEBUG) {
               System.err.println("DEBUG: this.bitboard= "
                     + this.bitboard
                     + " : "
                     + Long.toBinaryString(this.bitboard));
            }

            return Long.valueOf(result);
         }

         public void remove() {
            throw new UnsupportedOperationException();
         }

      }
   }

}