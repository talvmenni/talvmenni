package org.forritan.talvmenni.strategy;

import java.util.List;
import java.util.Observable;

import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.PositionFactory;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.talvmenni.search.Search;
import org.forritan.talvmenni.strategy.AbstractStrategy.DebugInfo;

public interface Strategy {
   
   public Position.Move getNextMove(Position position, boolean whiteToMove);
   public int getPromotionPiece();
   
   public Search getSearch();
   public TheoryBook getTheoryBook();

   public DebugInfo getDebugInfo();
   
   
}
