package org.forritan.talvmenni.knowledge;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.forritan.talvmenni.knowledge.Position.Move;

public class Transposition implements Serializable {

   public static final long serialVersionUID = 1L;

   private Table whiteTable;
   private Table blackTable;

   public Transposition(
         int maxEntries) {
      this.whiteTable= new Table(maxEntries);
      this.blackTable= new Table(maxEntries);
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
         Position position,
         boolean white) {
      if (white) {
         return this.whiteTable.containsKey(position);
      } else {
         return this.blackTable.containsKey(position);
      }
   }

   public Entry get(
         Position position,
         boolean white) {
      if (white) {
         return (Entry) this.whiteTable.get(position);
      } else {
         return (Entry) this.blackTable.get(position);
      }
   }

   public void update(
         Position position,
         boolean white,
         int score,
         int ply,
         int alpha,
         int beta) {
      
      if (white) {
         if (this.whiteTable.containsKey(position)) {
            Entry entry= (Entry) this.whiteTable.get(position);
            if ((entry.ply < ply)
                  || (entry.ply == ply && entry.score < score)) {
               this.whiteTable.remove(position);
               this.whiteTable.put(
                     position.getImmutable(),
                     new Entry(
                           score,
                           ply,
                           alpha,
                           beta));
            }
         } else {
            this.whiteTable.put(
                  position.getImmutable(),
                  new Entry(
                        score,
                        ply,
                        alpha,
                        beta));
         }
      } else {
         if (this.blackTable.containsKey(position)) {
            Entry entry= (Entry) this.blackTable.get(position);
            if (entry.ply < ply
                  || (entry.ply == ply && entry.score < score)) {
               this.blackTable.remove(position);
               this.blackTable.put(
                     position.getImmutable(),
                     new Entry(
                           score,
                           ply,
                           alpha,
                           beta));
            }
         } else {
            this.blackTable.put(
                  position.getImmutable(),
                  new Entry(
                        score,
                        ply,
                        alpha,
                        beta));
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
   
   public static class Entry {

      public int  score;
      public int  ply;
      public int  alpha;
      public int  beta;

      public Entry(
            int score,
            int ply,
            int alpha,
            int beta) {
         this.score= score;
         this.ply= ply;
         this.alpha= alpha;
         this.beta= beta;
      }
   }
}

