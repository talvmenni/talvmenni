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
    * @param whiteKing
    * @param whiteQueen
    * @param whiteRooks
    * @param whiteBishops
    * @param whiteKnights
    * @param whitePawns
    * @param whiteCastling
    * @param whiteEnpassant
    * @param blackKing
    * @param blackQueen
    * @param blackRooks
    * @param blackBishops
    * @param blackKnights
    * @param blackPawns
    * @param blackCastling
    * @param blackEnpassant
    * @return
    */
   public static Position create(
         long whiteKing,
         long whiteQueen,
         long whiteRooks,
         long whiteBishops,
         long whiteKnights,
         long whitePawns,
         long whiteCastling,
         long whiteEnpassant,
         long blackKing,
         long blackQueen,
         long blackRooks,
         long blackBishops,
         long blackKnights,
         long blackPawns,
         long blackCastling,
         long blackEnpassant) {
      return new Position(
            whiteKing,
            whiteQueen,
            whiteRooks,
            whiteBishops,
            whiteKnights,
            whitePawns,
            whiteCastling,
            whiteEnpassant,
            blackKing,
            blackQueen,
            blackRooks,
            blackBishops,
            blackKnights,
            blackPawns,
            blackCastling,
            blackEnpassant);
   }

   /**
    * 
    * @param whiteKing
    * @param whiteQueen
    * @param whiteRooks
    * @param whiteBishops
    * @param whiteKnights
    * @param whitePawns
    * @param whiteCastling
    * @param whiteEnpassant
    * @param blackKing
    * @param blackQueen
    * @param blackRooks
    * @param blackBishops
    * @param blackKnights
    * @param blackPawns
    * @param blackCastling
    * @param blackEnpassant
    */
   private Position(
         long whiteKing,
         long whiteQueen,
         long whiteRooks,
         long whiteBishops,
         long whiteKnights,
         long whitePawns,
         long whiteCastling,
         long whiteEnpassant,
         long blackKing,
         long blackQueen,
         long blackRooks,
         long blackBishops,
         long blackKnights,
         long blackPawns,
         long blackCastling,
         long blackEnpassant) {

      this.white= new Bitboard(
            whiteKing,
            whiteQueen,
            whiteRooks,
            whiteBishops,
            whiteKnights,
            whitePawns,
            whiteCastling,
            whiteEnpassant);
      this.black= new Bitboard(
            blackKing,
            blackQueen,
            blackRooks,
            blackBishops,
            blackKnights,
            blackPawns,
            blackCastling,
            blackEnpassant);
   }

   public class Bitboard {
      public final long king;
      public final long queen;
      public final long rooks;
      public final long bishops;
      public final long knights;
      public final long pawns;

      public final long castling;
      public final long enpassant;

      public final long allPieces;

      /**
       * 
       * @param king
       * @param queen
       * @param rooks
       * @param bishops
       * @param knights
       * @param pawns
       * @param castling
       * @param enpassant
       */
      public Bitboard(
            long king,
            long queen,
            long rooks,
            long bishops,
            long knights,
            long pawns,
            long castling,
            long enpassant) {
         this.king= king;
         this.queen= queen;
         this.rooks= rooks;
         this.bishops= bishops;
         this.knights= knights;
         this.pawns= pawns;

         this.castling= castling;
         this.enpassant= enpassant;

         this.allPieces= this.king
               | this.queen
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
               this.king);
      }

      public Iterator queensIterator() {
         return new BitboardIterator(
               this.queen);
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

      public boolean isAnyPieceOnPosition(long position) {
         return ((this.allPieces & position) != 0L);
      }
      
      public boolean isKing(long position) {
         return ((this.king & position) != 0L);
      }

      public boolean isQueen(long position) {
         return ((this.queen & position) != 0L);
      }

      public boolean isRook(long position) {
         return ((this.rooks & position) != 0L);
      }

      public boolean isBishop(long position) {
         return ((this.bishops & position) != 0L);
      }

      public boolean isKnight(long position) {
         return ((this.knights & position) != 0L);
      }

      public boolean isPawn(long position) {
         return ((this.pawns & position) != 0L);
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
            
            this.bitboard= this.bitboard ^ result;
            
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