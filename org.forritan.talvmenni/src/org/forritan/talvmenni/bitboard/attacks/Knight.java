package org.forritan.talvmenni.bitboard.attacks;

import org.forritan.talvmenni.bitboard.paths.Knights;
import org.forritan.talvmenni.game.Position;


public class Knight {

   public static long attacksFrom(
         long square,
         Position p) {

      if (p.white.isKnight(square)) {
         return Knights.create().getPathsFrom(
               square)
               ^ (Knights.create().getPathsFrom(
                     square) & p.white.allPieces);
      } else if (p.black.isKnight(square)) { return Knights.create()
            .getPathsFrom(
                  square)
            ^ (Knights.create().getPathsFrom(
                  square) & p.black.allPieces); }

      return 0L;
   }
}