package org.forritan.talvmenni.game;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.forritan.talvmenni.game.Position.Move;


public class Transposition {

   private Map<Position, Entry> table;

   public Transposition() {
      this.table= new HashMap<Position, Entry>();
   }

   public static class Entry {
      public List<Move> moves;
      public int      score;
      public int      ply;

      private Entry(
            List<Move> moves,
            int score,
            int ply) {
         this.moves= moves;
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
         List<Move> moves,
         int score,
         int ply) {      
      if(this.table.containsKey(position)) {
         Entry e= this.table.get(position);
         if(e.ply <= ply && e.score < score) {
//            System.err.println("this.table.containsKey(position)");         
//            System.err.println("pre: e.ply= " + e.ply);
//            System.err.println("pre: e.score= " + e.score);
//            System.err.println("pre: e.moves= " + e.moves);
            e.ply= ply;
            e.score= score;
            e.moves.clear();
            e.moves.addAll(moves);
//            System.err.println("post: e.ply= " + e.ply);
//            System.err.println("post: e.score= " + e.score);
//            System.err.println("post: e.moves= " + e.moves);
         }
      } else {
         this.table.put(position.getImmutable(), new Entry(moves, score, ply));
      }
   }

   public void clear() {
      this.table.clear();
   }
}

