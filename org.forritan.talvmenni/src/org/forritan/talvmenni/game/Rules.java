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

      result= bitboardMoving.isAnyPieceOnPosition(from)
            && !bitboardMoving.isAnyPieceOnPosition(to);
      return result;
   }

}