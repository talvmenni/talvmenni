package org.forritan.talvmenni.strategy;

import java.io.Serializable;

import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.TheoryBook;
import org.forritan.talvmenni.search.PrincipalVariation;
import org.forritan.talvmenni.search.Search;
import org.forritan.talvmenni.search.PrincipalVariation.Thinking;
import org.forritan.talvmenni.strategy.AbstractStrategy.DebugInfo;

public interface Strategy extends Serializable {
   
   public static final long serialVersionUID = 1L; 
   
   public Position.Move getNextMove(Position position, boolean whiteToMove);
   
   public Search getSearch();
   public Thinking getThinking();
   public PrincipalVariation getPrincipalVariation();
   public TheoryBook getTheoryBook();

   public DebugInfo getDebugInfo();
   
   
}
