/**
 * talvmenni - A distributed chess-engine implemented in Java(TM)
 * and against Sun Microsystems Jini/JavaSpaces(TM).
 *  
 * Copyright (C) 2004-2006 Eyðun Lamhauge and Eyðun Nielsen
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License. 
 */

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
   
//   public void abortCalculation();
   public Position.Move getNextMove(Position position, boolean whiteToMove);
   
   public Search getSearch();
   public Thinking getThinking();
   public PrincipalVariation getPrincipalVariation();
   public TheoryBook getTheoryBook();

   public DebugInfo getDebugInfo();
   
   
}
