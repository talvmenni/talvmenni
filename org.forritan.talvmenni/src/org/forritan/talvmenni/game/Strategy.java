package org.forritan.talvmenni.game;

import java.util.Observable;

import org.forritan.talvmenni.search.Search;

public interface Strategy {
   
   public Position.Move getNextMove(Position position, boolean whiteToMove);
   public int getPromotionPiece();
   
   public Search getSearch();
   
}
