package org.forritan.talvmenni.bitboard.attacks;

import org.forritan.talvmenni.bitboard.paths.BlackPawnKills;
import org.forritan.talvmenni.bitboard.paths.WhitePawnKills;
import org.forritan.talvmenni.game.Position;


public class BlackPawn {

   public static long killerMovesAttacksFrom(
         long square,
         Position p) {
      return BlackPawnKills.create().getPathsFrom(
            square)
            ^ (BlackPawnKills.create().getPathsFrom(
                  square) & p.black.allPieces);
   }
}