package org.forritan.talvmenni.game;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.forritan.talvmenni.game.Position.Move;


public class Transposition {
   
   // Table<Position, new ThreeTuple<ply, score, moves>>

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
         Position p,
         boolean white) {
      if (white) {
         return this.whiteTable.containsKey(p);
      } else {
         return this.blackTable.containsKey(p);
      }
   }

   public ThreeTuplePlyScoreMoves get(
         Position p,
         boolean white) {
      if (white) {
         return (ThreeTuplePlyScoreMoves) this.whiteTable.get(p);
      } else {
         return (ThreeTuplePlyScoreMoves) this.blackTable.get(p);
      }
   }

   public void update(
         Position position,
         boolean white,
         List moves,
         int score,
         int ply) {
      
      if (white) {
         if (this.whiteTable.containsKey(position)) {
            ThreeTuplePlyScoreMoves entry= (ThreeTuplePlyScoreMoves) this.whiteTable.get(position);
            if ((entry.ply.intValue() < ply)
                  || (entry.ply.intValue() == ply && entry.score.intValue() < score)) {
               this.whiteTable.remove(position);
               this.whiteTable.put(
                     position.getImmutable(),
                     new ThreeTuplePlyScoreMoves(
                           new Integer(ply),
                           new Integer(score),
                           Collections.unmodifiableList(moves)));
            }
         } else {
            this.whiteTable.put(
                  position.getImmutable(),
                  new ThreeTuplePlyScoreMoves(
                        new Integer(ply),
                        new Integer(score),
                        Collections.unmodifiableList(moves)));
         }
      } else {
         if (this.blackTable.containsKey(position)) {
            ThreeTuplePlyScoreMoves entry= (ThreeTuplePlyScoreMoves) this.blackTable.get(position);
            if (entry.ply.intValue() < ply
                  || (entry.ply.intValue() == ply && entry.ply.intValue() < score)) {
               this.blackTable.remove(position);
               this.blackTable.put(
                     position.getImmutable(),
                     new ThreeTuplePlyScoreMoves(
                           new Integer(ply),
                           new Integer(score),
                           Collections.unmodifiableList(moves)));
            }
         } else {
            this.blackTable.put(
                  position.getImmutable(),
                  new ThreeTuplePlyScoreMoves(
                        new Integer(ply),
                        new Integer(score),
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
   
   public static class ThreeTuplePlyScoreMoves {

      public Integer ply;
      public Integer score;
      public List moves;

      public ThreeTuplePlyScoreMoves(
            Integer ply,
            Integer score,
            List moves) {
         this.ply= ply;
         this.score= score;
         this.moves= moves;
      }

   }
}

