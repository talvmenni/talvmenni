package org.forritan.talvmenni.bitboard.attacks;

import org.forritan.talvmenni.bitboard.paths.WhitePawnKills;
import org.forritan.talvmenni.game.Position;


public class WhitePawn {

   public static long killerMovesAttacksFrom(
         long square,
         Position p) {
      long result= 0L;
      return WhitePawnKills.create().getPathsFrom(
            square)
            ^ (WhitePawnKills.create().getPathsFrom(
                  square) & p.white.allPieces);
   }
}