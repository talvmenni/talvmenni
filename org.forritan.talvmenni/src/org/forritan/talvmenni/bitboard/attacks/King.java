package org.forritan.talvmenni.bitboard.attacks;

import java.util.HashMap;
import java.util.Map;

import org.forritan.talvmenni.bitboard.paths.Kings;
import org.forritan.talvmenni.knowledge.ImmutablePosition;
import org.forritan.talvmenni.knowledge.Position;


public class King {

   private static org.forritan.talvmenni.bitboard.paths.King kingPaths = Kings
                                                                             .create();

   public static long attacksFrom(
         long square,
         Position p) {
      long result= 0L;

      if (p.getWhite().isKing(square)) {
         result= kingPaths.getPathsFrom(square)
               ^ (kingPaths.getPathsFrom(square) & p.getWhite().allPieces);
      } else if (p.getBlack().isKing(square)) {
         result= kingPaths.getPathsFrom(square)
               ^ (kingPaths.getPathsFrom(square) & p.getBlack().allPieces);
      }

      return result;
   }
}