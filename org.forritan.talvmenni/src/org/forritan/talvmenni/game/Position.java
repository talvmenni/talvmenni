package org.forritan.talvmenni.game;

import org.forritan.talvmenni.game.ImmutablePosition.Bitboard;
import org.forritan.talvmenni.game.ImmutablePosition.Move;


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

}