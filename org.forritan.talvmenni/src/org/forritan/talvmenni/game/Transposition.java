package org.forritan.talvmenni.game;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.forritan.talvmenni.game.Position.Move;
import org.forritan.util.ThreeTuple;


public class Transposition {
   
   // Table<Position.hashCode(), new ThreeTuple<ply, score, moves>>

   private Table<Integer, ThreeTuple<Integer, Integer, List<Move>>> whiteTable;
   private Table<Integer, ThreeTuple<Integer, Integer, List<Move>>> blackTable;

   public Transposition(
         int maxEntries) {
      this.whiteTable= new Table<Integer, ThreeTuple<Integer, Integer, List<Move>>>(
            maxEntries);
      this.blackTable= new Table<Integer, ThreeTuple<Integer, Integer, List<Move>>>(
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
         return this.whiteTable.containsKey(Integer.valueOf(p.hashCode()));
      } else {
         return this.blackTable.containsKey(Integer.valueOf(p.hashCode()));
      }
   }

   public ThreeTuple<Integer, Integer, List<Move>> get(
         Position p,
         boolean white) {
      if (white) {
         return this.whiteTable.get(Integer.valueOf(p.hashCode()));
      } else {
         return this.blackTable.get(Integer.valueOf(p.hashCode()));
      }
   }

   public void update(
         Position position,
         boolean white,
         List<Move> moves,
         int score,
         int ply) {

      if (white) {
         if (this.whiteTable.containsKey(Integer.valueOf(position.hashCode()))) {
            ThreeTuple<Integer, Integer, List<Move>> entry= this.whiteTable.get(Integer.valueOf(position.hashCode()));
            if (entry.a.intValue() < ply
                  || (entry.a.intValue() == ply && entry.b.intValue() < score)) {
               entry.a= Integer.valueOf(ply);
               entry.b= Integer.valueOf(score);
               entry.c.clear();
               entry.c.addAll(moves);
            }
         } else {
            this.whiteTable.put(
                  Integer.valueOf(position.hashCode()),
                  new ThreeTuple<Integer, Integer, List<Move>>(
                        Integer.valueOf(ply),
                        Integer.valueOf(score),
                        moves));
         }
      } else {
         if (this.blackTable.containsKey(Integer.valueOf(position.hashCode()))) {
            ThreeTuple<Integer, Integer, List<Move>> entry= this.blackTable.get(Integer.valueOf(position.hashCode()));
            if (entry.a.intValue() > ply
                  || (entry.a.intValue() == ply && entry.b.intValue() > score)) {
               entry.a= Integer.valueOf(ply);;
               entry.b= Integer.valueOf(score);
               entry.c.clear();
               entry.c.addAll(moves);
            }
         } else {
            this.blackTable.put(
                  Integer.valueOf(position.hashCode()),
                  new ThreeTuple<Integer, Integer, List<Move>>(
                        Integer.valueOf(ply),
                        Integer.valueOf(score),
                        moves));
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

