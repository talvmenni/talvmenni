package org.forritan.talvmenni.bitboard.attacks;

import org.forritan.talvmenni.bitboard.Rank;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.paths.BlackPawnCaptures;
import org.forritan.talvmenni.bitboard.paths.BlackPawnMoves;
import org.forritan.talvmenni.bitboard.paths.WhitePawnCaptures;
import org.forritan.talvmenni.knowledge.ImmutablePosition;
import org.forritan.talvmenni.knowledge.Position;


public class BlackPawn {

   public static long captureMoveAttacksFrom(
         long square,
         Position p) {
      long result= 0L;
      result= BlackPawnCaptures.create().getPathsFrom(
            square);
      result&= ~p.getBlack().allPieces;
      result&= p.getWhite().allPieces;
      
      if(p.getWhite().enpassant != Square._EMPTY_BOARD) {
         result |= ((BlackPawnCaptures.create().getPathsFrom(
               square)
               & p.getWhite().enpassant)
               & Rank._3);
      }

      return result;
   }

   public static long moveAttacksFrom(
         long square,
         Position p) {
      long result= BlackPawnMoves.create().getPathsFrom(
            square);
      result&= ~p.getBlack().allPieces;
      result&= ~p.getWhite().allPieces;
      result&= ~(((p.getWhite().allPieces | p.getBlack().allPieces) & Rank._6 & (square >> 8)) >> 8);
      return result;
   }
}