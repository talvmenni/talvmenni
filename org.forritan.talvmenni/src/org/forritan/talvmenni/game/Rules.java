package org.forritan.talvmenni.game;

public class Rules {

   public static boolean isMoveLegal(
         Position position,
         long from,
         long to,
         boolean whiteToMove) {

      boolean result;

      ImmutablePosition.Bitboard bitboardMoving;
      if (whiteToMove) {
         bitboardMoving= position.getWhite();
      } else {
         bitboardMoving= position.getBlack();
      }

      result= bitboardMoving.isAnyPieceOnPosition(from)
            && !bitboardMoving.isAnyPieceOnPosition(to);
      return result;
   }

}