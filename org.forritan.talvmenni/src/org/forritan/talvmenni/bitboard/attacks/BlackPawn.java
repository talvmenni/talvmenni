package org.forritan.talvmenni.bitboard.attacks;

import org.forritan.talvmenni.bitboard.paths.BlackPawnCaptures;
import org.forritan.talvmenni.bitboard.paths.WhitePawnCaptures;
import org.forritan.talvmenni.game.Position;


public class BlackPawn {

   public static long captureMovesAttacksFrom(
         long square,
         Position p) {
      return BlackPawnCaptures.create().getPathsFrom(
            square)
            ^ (BlackPawnCaptures.create().getPathsFrom(
                  square) & p.black.allPieces);
   }
}