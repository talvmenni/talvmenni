package org.forritan.talvmenni.bitboard.attacks;

import org.forritan.talvmenni.bitboard.paths.BlackPawnCaptures;
import org.forritan.talvmenni.bitboard.paths.BlackPawnMoves;
import org.forritan.talvmenni.game.Position;


public class BlackPawn {

   public static long captureMoveAttacksFrom(
         long square,
         Position p) {
      return BlackPawnCaptures.create().getPathsFrom(
            square)
            ^ (BlackPawnCaptures.create().getPathsFrom(
                  square) & p.black.allPieces);
   }
   
   public static long moveAttacksFrom(
         long square,
         Position p) {
      long result= 0L;
      return BlackPawnMoves.create().getPathsFrom(
            square)
            ^ (BlackPawnMoves.create().getPathsFrom(
                  square) & p.black.allPieces);
   }

}