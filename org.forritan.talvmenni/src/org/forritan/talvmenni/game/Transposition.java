package org.forritan.talvmenni.game;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Transposition {

   private Map<Position, Entry> table;

   public Transposition() {
      this.table= new HashMap<Position, Entry>();
   }

   private static class Entry {
      public int      score;
      public int      ply;

      private Entry(
            int score,
            int ply) {
         this.score= score;
         this.ply= ply;
      }
   }

   public int size() {
      return this.table.size();
   }

   public boolean isEmpty() {
      return this.table.isEmpty();
   }

   public boolean contains(
         Position p) {
      return this.table.containsKey(p);
   }

   public Entry get(
         Position p) {
      return this.table.get(p);
   }

   public void update(
         Position position,
         int score,
         int ply) {      
      if(this.table.containsKey(position)) {
         Entry e= this.table.get(position);
         if(e.ply < ply) {
            e.ply= ply;
            e.score= score;
         }
      } else {
         this.table.put(position, new Entry(score, ply));
      }
   }

   public void clear() {
      this.table.clear();
   }
}

