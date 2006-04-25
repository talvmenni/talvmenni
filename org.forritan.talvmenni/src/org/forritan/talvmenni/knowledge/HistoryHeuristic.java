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

package org.forritan.talvmenni.knowledge;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.forritan.talvmenni.TalvMenni;
import org.forritan.talvmenni.knowledge.Position.Move;


public class HistoryHeuristic implements Serializable {

   public static final long   serialVersionUID = 1L;

   private Map<Move, Integer> historyMap;

   public HistoryHeuristic() {
      this.historyMap= new Table<Move, Integer>(
            TalvMenni.MAX_HISTORY_HEURISTIC_ENTRIES);
   }

   public void clear() {
      this.historyMap.clear();
   }

   public boolean containsMove(
         Move move) {
      return this.historyMap.containsKey(move);
   }

   public Integer get(
         Move move) {
      return this.historyMap.get(move);
   }

   public void updateWithSufficient(
         Move move,
         int depth) {
      int weight= 0;
      if (this.historyMap.containsKey(move)) {
         weight= this.historyMap.get(
               move).intValue();
      }
      weight+= (1 << depth);
      this.historyMap.put(
            move,
            new Integer(
                  weight));
   }

   public void sortMoveList(
         Position.Bitboard board) {

      // TODO: Guard - if there are any moves in betterOrderMoves... Refactor
      // into updatePossibleMovesOrdering()
      board.updatePossibleMovesOrdering();

      List moves= board.getPossibleMoves();

      Map<Move, Integer> heuristicMoves= new LinkedHashMap<Move, Integer>();
      Iterator it= moves.iterator();
      while (it.hasNext()) {
         Move move= (Move) it.next();
         if (historyMap.containsKey(move)) {
            heuristicMoves.put(
                  move,
                  historyMap.get(move));
         }
      }

      ArrayList<Map.Entry<Move, Integer>> aList= new ArrayList<Map.Entry<Move, Integer>>();
      aList.addAll(heuristicMoves.entrySet());
      Collections.sort(
            aList,
            new Comparator<Map.Entry<Move, Integer>>() {
               public int compare(
                     Map.Entry<Move, Integer> o1,
                     Map.Entry<Move, Integer> o2) {
                  return o1.getValue().compareTo(
                        o2.getValue());
               }
            });

      for (Iterator i= aList.iterator(); i.hasNext();) {
         board.betterMove((Move) ((Map.Entry) i.next()).getKey());
      }

      board.updatePossibleMovesOrdering();
   }

   private static class Table<K, V> extends LinkedHashMap<K, V> {
      private static final long serialVersionUID = 1L;
      private final int         maxEntries;

      public Table(
            int maxEntries) {
         this.maxEntries= maxEntries;
      }

      protected boolean removeEldestEntry(
            Map.Entry eldest) {
         return size() > maxEntries;
      }

   }

}