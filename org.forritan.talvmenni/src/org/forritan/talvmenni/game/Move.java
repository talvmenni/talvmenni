package org.forritan.talvmenni.game;

import org.forritan.talvmenni.bitboard.Rank;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.Squares;


public class Move {
   
   public final boolean whiteMove;
   public final long     time;
   public final Position fromPosition;
   public final Position toPosition;
   public final long     from;
   public final long     to;
   public final int promotionPiece;

   public Move(
         Position fromPosition,
         long fromSquare,
         long toSquare,
         int promotionPiece) {
      this.time= System.currentTimeMillis();
      this.promotionPiece= promotionPiece;
      this.fromPosition= fromPosition.getImmutable();
      this.whiteMove= this.fromPosition.getWhite().isAnyPieceOnPosition(fromSquare);
      this.toPosition= fromPosition.move(
            fromSquare,
            toSquare, 
            this.promotionPiece);
      this.from= fromSquare;
      this.to= toSquare;
   }

   public Move(
         Position fromPosition,
         long fromSquare,
         long toSquare) {
      this.time= System.currentTimeMillis();
      this.promotionPiece= Position.PromotionPiece.NONE;
      this.fromPosition= fromPosition.getImmutable();
      this.whiteMove= this.fromPosition.getWhite().isAnyPieceOnPosition(fromSquare);
      this.toPosition= fromPosition.move(
            fromSquare,
            toSquare);
      this.from= fromSquare;
      this.to= toSquare;
   }
   

   public String toString() {
      Square sq= Squares.create();
      return sq.getSquareName(from)
            + sq.getSquareName(to)
            + this.getPromotionString();
   }

   private String getPromotionString() {
      String result= "";
      if(this.whiteMove) {
         if(fromPosition.getWhite().isPawn(from) && ((from & ~Rank._7) == Square._EMPTY_BOARD)) {
            result= Position.PromotionPiece.STRINGS[this.promotionPiece];
         }
      } else {
         if(fromPosition.getBlack().isPawn(from) && ((from & ~Rank._2) == Square._EMPTY_BOARD)) {
            result= Position.PromotionPiece.STRINGS[this.promotionPiece];
         }
      }
      return result;
   }
}