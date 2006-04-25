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

package org.forritan.talvmenni.search;

import java.io.Serializable;
import java.util.List;

import org.forritan.talvmenni.knowledge.HistoryHeuristic;
import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Transposition;
import org.forritan.talvmenni.knowledge.Position.Move;
import org.forritan.talvmenni.knowledge.evaluation.Evaluation;
import org.forritan.talvmenni.search.PrincipalVariation.DebugInfo;
import org.forritan.talvmenni.search.PrincipalVariation.Thinking;


public interface Search extends Serializable {

   public static final long serialVersionUID = 1L;

   public void setPly(
         int ply);

   public List<Move> getBestMoves(
         Position p,
         Evaluation e,
         boolean whiteMove);

   public PrincipalVariation getPrincipalVariation();

   public HistoryHeuristic getHistoryHeuristic();
   public void setHistoryHeuristic(HistoryHeuristic historyHeuristic);

   public Transposition getTransposition();
   public void setTransposition(Transposition transposition);

   public Thinking getThinking();

   public DebugInfo getDebugInfo();

   public int getLastScore();

}