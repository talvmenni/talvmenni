package org.forritan.talvmenni.strategy;

import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.search.PrincipalVariation;
import org.forritan.talvmenni.search.Search;
import org.forritan.talvmenni.search.PrincipalVariation.Thinking;
import org.forritan.talvmenni.strategy.AbstractStrategy.DebugInfo;

public interface Strategy {
   
   public Position.Move getNextMove(Position position, boolean whiteToMove);
   
   public Search getSearch();
   public Thinking getThinking();
   public PrincipalVariation getPrincipalVariation();
   public TheoryBook getTheoryBook();

   public DebugInfo getDebugInfo();
   
   
}
