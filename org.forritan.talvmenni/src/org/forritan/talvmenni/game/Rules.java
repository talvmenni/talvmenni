package org.forritan.talvmenni.game;

public class Rules {

   public static boolean isMoveLegal(
         Position position,
         long from,
         long to,
         boolean whiteToMove) {

      boolean result;

      Position.Bitboard bitboardMoving;
      if (whiteToMove) {
         bitboardMoving= position.white;
      } else {
         bitboardMoving= position.black;
      }

      result= 
         isAnyPieceOnPosition(bitboardMoving, from)
      && !isAnyPieceOnPosition(bitboardMoving, to);

      return result;

   }

   public static boolean isAnyPieceOnPosition(
         Position.Bitboard pieces,
         long position) {
      return ((pieces.allPieces & position) != 0L);
   }

   public static boolean isKing(
         Position.Bitboard pieces,
         long position) {
      return ((pieces.king & position) != 0L);
   }

   public static boolean isQueen(
         Position.Bitboard pieces,
         long position) {
      return ((pieces.queen & position) != 0L);
   }

   public static boolean isRook(
         Position.Bitboard pieces,
         long position) {
      return ((pieces.rooks & position) != 0L);
   }

   public static boolean isBishop(
         Position.Bitboard pieces,
         long position) {
      return ((pieces.bishops & position) != 0L);
   }

   public static boolean isKnight(
         Position.Bitboard pieces,
         long position) {
      return ((pieces.knights & position) != 0L);
   }

   public static boolean isPawn(
         Position.Bitboard pieces,
         long position) {
      return ((pieces.pawns & position) != 0L);
   }

}