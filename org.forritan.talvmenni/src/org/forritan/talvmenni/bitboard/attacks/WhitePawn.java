package org.forritan.talvmenni.bitboard.attacks;

import org.forritan.talvmenni.bitboard.paths.BlackPawnCaptures;
import org.forritan.talvmenni.bitboard.paths.BlackPawnMoves;
import org.forritan.talvmenni.bitboard.paths.WhitePawnCaptures;
import org.forritan.talvmenni.bitboard.paths.WhitePawnMoves;
import org.forritan.talvmenni.game.Position;


public class WhitePawn {

   public static long captureMoveAttacksFrom(
         long square,
         Position p) {
      long result= 0L;
      result= WhitePawnCaptures.create().getPathsFrom(
            square);
      result &= ~p.white.allPieces;
      result &= p.black.allPieces;
      return result; 
   }
   
   public static long moveAttacksFrom(
         long square,
         Position p) {
      long result= 0L;
      result= WhitePawnMoves.create().getPathsFrom(
            square);
      result &= ~p.black.allPieces;
      result &= ~p.white.allPieces;
      return result; 
   }
}