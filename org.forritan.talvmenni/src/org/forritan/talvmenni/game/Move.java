package org.forritan.talvmenni.game;

import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.Squares;


public class Move {

   public final long     time;
   public final Position fromPosition;
   public final Position toPosition;
   public final long     from;
   public final long     to;

   public Move(
         Position fromPosition,
         long fromSquare,
         long toSquare,
         int promotionPiece) {
      this.time= System.currentTimeMillis();
      this.fromPosition= fromPosition;
      this.toPosition= fromPosition.move(
            fromSquare,
            toSquare, 
            promotionPiece);
      this.from= fromSquare;
      this.to= toSquare;
   }

   public String toString() {
      Square sq= Squares.create();
      return sq.getSquareName(from)
            + sq.getSquareName(to);
   }
}