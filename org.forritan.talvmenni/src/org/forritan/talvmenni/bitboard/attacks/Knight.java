package org.forritan.talvmenni.bitboard.attacks;

import org.forritan.talvmenni.bitboard.paths.Knights;
import org.forritan.talvmenni.game.ImmutablePosition;
import org.forritan.talvmenni.game.Position;


public class Knight {

   public static long attacksFrom(
         long square,
         Position p) {

      if (p.getWhite().isKnight(square)) {
         return Knights.create().getPathsFrom(
               square)
               ^ (Knights.create().getPathsFrom(
                     square) & p.getWhite().allPieces);
      } else if (p.getBlack().isKnight(square)) { return Knights.create()
            .getPathsFrom(
                  square)
            ^ (Knights.create().getPathsFrom(
                  square) & p.getBlack().allPieces); }

      return 0L;
   }
}