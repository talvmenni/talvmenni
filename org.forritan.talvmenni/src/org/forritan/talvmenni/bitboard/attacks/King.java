package org.forritan.talvmenni.bitboard.attacks;

import java.util.HashMap;
import java.util.Map;

import org.forritan.talvmenni.bitboard.paths.Kings;
import org.forritan.talvmenni.game.Position;


public class King {

   private static org.forritan.talvmenni.bitboard.paths.King kingPaths = Kings
                                                                             .create();

   public static long attacksFrom(
         long square,
         Position p) {
      long result= 0L;

      if (p.white.isKing(square)) {
         result= kingPaths.getPathsFrom(square)
               ^ (kingPaths.getPathsFrom(square) & p.white.allPieces);
      } else if (p.black.isKing(square)) {
         result= kingPaths.getPathsFrom(square)
               ^ (kingPaths.getPathsFrom(square) & p.black.allPieces);
      }

      return result;
   }
}