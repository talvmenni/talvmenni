package org.forritan.talvmenni.game;

public interface Strategy {
   
   public Position.Move getNextMove(Position position, boolean whiteToMove);
   public int getPromotionPiece();

}
