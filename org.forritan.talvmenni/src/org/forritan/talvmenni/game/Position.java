package org.forritan.talvmenni.game;

import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.Squares;
import org.forritan.talvmenni.game.ImmutablePosition.Bitboard;


public interface Position {
   public Bitboard getBlack();
   public Bitboard getWhite();

   public Position move(
         long from,
         long to);

   public Position move(
         long from,
         long to,
         int promotionPiece);

   public boolean isLegalMove(
         long from,
         long to);

   /**
    * @deprecated Use
    * @link{org.forritan.talvmenni.game.Strategy.getNextMove(Position position,
    *                                                                 boolean
    *                                                                 whiteToMove)}
    *                                                                 instead
    * @param whiteMove
    * @return
    */
   public Move getRandomMove(
         boolean whiteMove);
   
   public static interface PromotionPiece {
      public final static int DEFAULT= 0;
      public final static int QUEEN= 0;
      public final static int ROOK= 1;
      public final static int BISHOP= 2;
      public final static int KNIGHT= 3;      
      public final static String[] STRINGS= new String[] {"q", "r", "b", "n"};
   }

   public static class Move {
      public final long from;
      public final long to;

      public Move(long from, long to) {
         this.from= from;
         this.to= to;
      }
      
      public String toString() {
         Square sq= Squares.create();
         return sq.getSquareName(from)
               + sq.getSquareName(to);
      }
      
      public boolean equals(Move otherMove) {
         return (this.from == otherMove.from) 
         && (this.to == otherMove.to);
      }
      
      public boolean equals(Object obj) {
         if(obj instanceof Position.Move) {
            return this.equals((Position.Move) obj);
         } else {
            return false;
         }
      }
      
   }

}