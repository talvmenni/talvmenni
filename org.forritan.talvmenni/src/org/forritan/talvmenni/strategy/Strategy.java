package org.forritan.talvmenni.strategy;

import java.util.Observable;

import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.talvmenni.search.Search;

public interface Strategy {
   
   public Position.Move getNextMove(Position position, boolean whiteToMove);
   public int getPromotionPiece();
   
   public Search getSearch();

   public TheoryBook getTheoryBook();
   
}
