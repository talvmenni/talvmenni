package org.forritan.talvmenni.game;

import java.util.Observable;

public interface Strategy {
   
   public Position.Move getNextMove(Position position, boolean whiteToMove);
   public int getPromotionPiece();
   
   public Observable getObservable();
   
}
