package org.forritan.talvmenni.game;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.forritan.talvmenni.game.Position.Move;
import org.forritan.util.ThreeTuple;


public class Transposition {
   
   // Table<Position, new ThreeTuple<ply, score, moves>>

   private Table<Position, ThreeTuple<Integer, Integer, List<Move>>> whiteTable;
   private Table<Position, ThreeTuple<Integer, Integer, List<Move>>> blackTable;

   public Transposition(
         int maxEntries) {
      this.whiteTable= new Table<Position, ThreeTuple<Integer, Integer, List<Move>>>(
            maxEntries);
      this.blackTable= new Table<Position, ThreeTuple<Integer, Integer, List<Move>>>(
            maxEntries);
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

   public ThreeTuple<Integer, Integer, List<Move>> get(
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
            ThreeTuple<Integer, Integer, List<Move>> entry= this.whiteTable.get(position);
            if ((entry.a.intValue() < ply)
                  || (entry.a.intValue() == ply && entry.b.intValue() < score)) {
               this.whiteTable.remove(position);
               this.whiteTable.put(
                     position.getImmutable(),
                     new ThreeTuple<Integer, Integer, List<Move>>(
                           Integer.valueOf(ply),
                           Integer.valueOf(score),
                           Collections.unmodifiableList(moves)));
            }
         } else {
            this.whiteTable.put(
                  position.getImmutable(),
                  new ThreeTuple<Integer, Integer, List<Move>>(
                        Integer.valueOf(ply),
                        Integer.valueOf(score),
                        Collections.unmodifiableList(moves)));
         }
      } else {
         if (this.blackTable.containsKey(position)) {
            ThreeTuple<Integer, Integer, List<Move>> entry= this.blackTable.get(position);
            if (entry.a.intValue() < ply
                  || (entry.a.intValue() == ply && entry.b.intValue() < score)) {
               this.blackTable.remove(position);
               this.blackTable.put(
                     position.getImmutable(),
                     new ThreeTuple<Integer, Integer, List<Move>>(
                           Integer.valueOf(ply),
                           Integer.valueOf(score),
                           Collections.unmodifiableList(moves)));
            }
         } else {
            this.blackTable.put(
                  position.getImmutable(),
                  new ThreeTuple<Integer, Integer, List<Move>>(
                        Integer.valueOf(ply),
                        Integer.valueOf(score),
                        Collections.unmodifiableList(moves)));
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

