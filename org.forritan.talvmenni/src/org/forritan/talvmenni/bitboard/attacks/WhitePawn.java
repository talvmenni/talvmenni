package org.forritan.talvmenni.bitboard.attacks;

import org.forritan.talvmenni.bitboard.Rank;
import org.forritan.talvmenni.bitboard.Square;
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
      result&= ~p.getWhite().allPieces;
      result&= p.getBlack().allPieces;
      
      if(p.getBlack().enpassant != Square._EMPTY_BOARD) {
         result |= ((WhitePawnCaptures.create().getPathsFrom(
               square)
               & p.getBlack().enpassant)
               & Rank._6);
      }

      return result;
   }

   public static long moveAttacksFrom(
         long square,
         Position p) {
      long result= WhitePawnMoves.create().getPathsFrom(
            square);
      result&= ~p.getBlack().allPieces;
      result&= ~p.getWhite().allPieces;
      result&= ~(((p.getWhite().allPieces | p.getBlack().allPieces)
            & Rank._3 & (square << 8)) << 8);
      return result;
   }
}