package org.forritan.talvmenni.knowledge;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.forritan.talvmenni.TalvMenni;
import org.forritan.talvmenni.knowledge.Position.Move;

public class HistoryHeuristic implements Serializable {

   public static final long serialVersionUID = 1L;

   private static HistoryHeuristic instance;

   private Map                     historyMap;

   public HistoryHeuristic() {
      this.historyMap= new Table(
            TalvMenni.MAX_HISTORY_HEURISTIC_ENTRIES);
   }

   /**
    * @deprecated Use no-arg constructor instead...
    */  
   public static HistoryHeuristic getInstance() {
      if (HistoryHeuristic.instance == null) {
         HistoryHeuristic.instance= new HistoryHeuristic();
      }
      return HistoryHeuristic.instance;
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
      return (Integer) this.historyMap.get(move);
   }

   public void updateWithSufficient(
         Move move,
         int depth) {
      int weight= 0;
      if (this.historyMap.containsKey(move)) {
         weight= ((Integer) this.historyMap.get(move)).intValue();
      }
      weight+= (1 << depth);
      this.historyMap.put(
            move,
            new Integer(
                  weight));
   }
   
   public void sortMoveList(
         Position.Bitboard board) {
      
      //TODO: Guard - if there are any moves in betterOrderMoves... Refactor into updatePossibleMovesOrdering()
      board.updatePossibleMovesOrdering();

      List moves= board.getPossibleMoves();      
      
      Map heuristicMoves= new LinkedHashMap();
      Iterator it= moves.iterator();
      while (it.hasNext()) {
         Move move= (Move) it.next();
         if (historyMap.containsKey(move)) {
            heuristicMoves.put(
                  move,
                  ((Integer) historyMap.get(move)));
         }
      }
            
      ArrayList aList= new ArrayList();
      aList.addAll(heuristicMoves.entrySet());
      Collections.sort(
            aList,
            new Comparator() {
               public int compare(
                     Object o1,
                     Object o2) {
                  return ((Integer) ((Map.Entry) o1).getValue())
                        .compareTo((Integer) ((Map.Entry) o2).getValue());
               }
            });

      for (Iterator i= aList.iterator(); i.hasNext();) {
         board.betterMove((Move) ((Map.Entry) i.next()).getKey());
      }
      
      board.updatePossibleMovesOrdering();
   }

   private static class Table extends LinkedHashMap {
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