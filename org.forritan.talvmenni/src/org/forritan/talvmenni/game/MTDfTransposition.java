package org.forritan.talvmenni.game;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.forritan.talvmenni.game.Position.Move;
import org.forritan.util.ThreeTuple;
import org.forritan.util.Tuple;


public class MTDfTransposition {

   // Table<Position, new Tuple<new ThreeTuple<ply, score, moves>>,
   // new Tuple<lowerbound, upperbound>>

   private Table<Position, Tuple<ThreeTuple<Integer, Integer, List<Move>>, Tuple<Integer, Integer>>> whiteTable;
   private Table<Position, Tuple<ThreeTuple<Integer, Integer, List<Move>>, Tuple<Integer, Integer>>> blackTable;

   public MTDfTransposition(
         int maxEntries) {
      this.whiteTable= new Table<Position, Tuple<ThreeTuple<Integer, Integer, List<Move>>, Tuple<Integer, Integer>>>(
            maxEntries);
      this.blackTable= new Table<Position, Tuple<ThreeTuple<Integer, Integer, List<Move>>, Tuple<Integer, Integer>>>(
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

   public Tuple<ThreeTuple<Integer, Integer, List<Move>>, Tuple<Integer, Integer>> get(
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
         int ply,
         int lowerbound,
         int upperbound) {

      if (white) {
         if (this.whiteTable.containsKey(position)) {
            Tuple<ThreeTuple<Integer, Integer, List<Move>>, Tuple<Integer, Integer>> entry= this.whiteTable
                  .get(position);
            if (entry.a.a.intValue() < ply
                  || (entry.a.a.intValue() == ply && entry.a.b.intValue() < score)) {
               entry.a.a= Integer.valueOf(ply);
               entry.a.b= Integer.valueOf(score);
               entry.a.c.clear();
               entry.a.c.addAll(moves);
            }
         } else {
            this.whiteTable
                  .put(
                        position,
                        new Tuple<ThreeTuple<Integer, Integer, List<Move>>, Tuple<Integer, Integer>>(
                              new ThreeTuple<Integer, Integer, List<Move>>(
                                    Integer.valueOf(ply),
                                    Integer.valueOf(score),
                                    moves),
                              new Tuple<Integer, Integer>(
                                    Integer.valueOf(lowerbound),
                                    Integer.valueOf(upperbound))));
         }
      } else {
         if (this.blackTable.containsKey(position)) {
            Tuple<ThreeTuple<Integer, Integer, List<Move>>, Tuple<Integer, Integer>> entry= this.blackTable
                  .get(position);
            if (entry.a.a.intValue() > ply
                  || (entry.a.a.intValue() == ply && entry.a.b.intValue() > score)) {
               entry.a.a= Integer.valueOf(ply);
               entry.a.b= Integer.valueOf(score);
               entry.a.c.clear();
               entry.a.c.addAll(moves);
            }
         } else {
            this.blackTable.put(
                  position,
                  new Tuple<ThreeTuple<Integer, Integer, List<Move>>, Tuple<Integer, Integer>>(
                        new ThreeTuple<Integer, Integer, List<Move>>(
                              Integer.valueOf(ply),
                              Integer.valueOf(score),
                              moves),
                        new Tuple<Integer, Integer>(
                              Integer.valueOf(lowerbound),
                              Integer.valueOf(upperbound))));
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

