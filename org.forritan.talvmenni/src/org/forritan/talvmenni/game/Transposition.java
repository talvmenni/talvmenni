package org.forritan.talvmenni.game;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.forritan.talvmenni.game.Position.Move;


public class Transposition {

   private Table<Position, Entry> whiteTable;
   private Table<Position, Entry> blackTable;

   public Transposition() {
      this.whiteTable= new Table<Position, Entry>();
      this.blackTable= new Table<Position, Entry>();
   }

   public static class Entry {
      public List<Move> moves;
      public int        score;
      public int        ply;

      private Entry(
            List<Move> moves,
            int score,
            int ply) {
         this.moves= moves;
         this.score= score;
         this.ply= ply;
      }
   }

   public int size(
         boolean white) {
      if (white) {
         return this.whiteTable.size();
      } else {
         return this.blackTable.size();
      }
   }

   public boolean isEmpty(
         boolean white) {
      if (white) {
         return this.whiteTable.isEmpty();
      } else {
         return this.blackTable.isEmpty();
      }
   }

   public boolean contains(
         Position p,
         boolean white) {
      if (white) {
         return this.whiteTable.containsKey(p);
      } else {
         return this.blackTable.containsKey(p);
      }
   }

   public Entry get(
         Position p,
         boolean white) {
      if (white) {
         return this.whiteTable.get(p);
      } else {
         return this.blackTable.get(p);
      }
   }

   public void update(
         Position position,
         boolean white,
         List<Move> moves,
         int score,
         int ply) {

      if (white) {
         if (this.whiteTable.containsKey(position)) {
            Entry e= this.whiteTable.get(position);
            if (e.ply < ply
                  || (e.ply == ply && e.score < score)) {
               e.ply= ply;
               e.score= score;
               e.moves.clear();
               e.moves.addAll(moves);
            }
         } else {
            this.whiteTable.put(
                  position.getImmutable(),
                  new Entry(
                        moves,
                        score,
                        ply));
         }
      } else {
         if (this.blackTable.containsKey(position)) {
            Entry e= this.blackTable.get(position);
            if (e.ply > ply
                  || (e.ply == ply && e.score > score)) {
               e.ply= ply;
               e.score= score;
               e.moves.clear();
               e.moves.addAll(moves);
            }
         } else {
            this.blackTable.put(
                  position.getImmutable(),
                  new Entry(
                        moves,
                        score,
                        ply));
         }
      }
   }

   public void clear(
         boolean white) {
      if (white) {
         this.whiteTable.clear();
      } else {
         this.blackTable.clear();
      }
   }

   private static class Table<K, V> extends LinkedHashMap<K, V> implements
         Map<K, V> {
      private static final long serialVersionUID = 1L;
      private static final int  MAX_ENTRIES      = 20000;

      protected boolean removeEldestEntry(
            Map.Entry eldest) {
         return size() > MAX_ENTRIES;
      }

   }
   //   
}

