package org.forritan.talvmenni.bitboard.attacks;

import org.forritan.talvmenni.bitboard.paths.BlackPawnCaptures;
import org.forritan.talvmenni.bitboard.paths.BlackPawnMoves;
import org.forritan.talvmenni.game.Position;


public class BlackPawn {

   public static long captureMoveAttacksFrom(
         long square,
         Position p) {
      long result= 0L;
      result= BlackPawnCaptures.create().getPathsFrom(
            square);
      result &= ~p.black.allPieces;
      result &= p.white.allPieces;
      return result; 
   }
   
   public static long moveAttacksFrom(
         long square,
         Position p) {
      long result= 0L;
      result= BlackPawnMoves.create().getPathsFrom(
            square);
      result &= ~p.black.allPieces;
      result &= ~p.white.allPieces;
      return result; 
   }

}