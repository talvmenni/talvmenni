package org.forritan.talvmenni.bitboard.attacks;

import org.forritan.talvmenni.bitboard.paths.WhitePawnCaptures;
import org.forritan.talvmenni.game.Position;


public class WhitePawn {

   public static long captureMovesAttacksFrom(
         long square,
         Position p) {
      long result= 0L;
      return WhitePawnCaptures.create().getPathsFrom(
            square)
            ^ (WhitePawnCaptures.create().getPathsFrom(
                  square) & p.white.allPieces);
   }
}