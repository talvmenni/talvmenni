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
import java.util.LinkedHashMap;
import java.util.Map;

import org.forritan.talvmenni.TalvMenni;


public class Transposition implements Serializable {

   public static final long serialVersionUID = 1L;

   private Table<Position, Entry>            whiteTable;
   private Table<Position, Entry>            blackTable;

   public Transposition() {
      this.whiteTable= new Table<Position, Entry>(
            TalvMenni.MAX_TRANSPOSITION_ENTRIES);
      this.blackTable= new Table<Position, Entry>(
            TalvMenni.MAX_TRANSPOSITION_ENTRIES);
   }
   
   /**
    * @deprecated Use no-arg constructor instead...
    * @param maxEntries
    */  
   public Transposition(
         int maxEntries) {
      this.whiteTable= new Table<Position, Entry>(
            maxEntries);
      this.blackTable= new Table<Position, Entry>(
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
         return this.whiteTable.get(position);
      } else {
         return this.blackTable.get(position);
      }
   }

   public void update(
         Position position,
         boolean white,
         int score,
         int depthToLeaf,
         int entryType) {

      Table<Position, Entry> table;

      if (white) {
         table= this.whiteTable;
      } else {
         table= this.blackTable;
      }

      Entry entry;
      if (table.containsKey(position)) {
         entry= table.get(position);
         if ((entry.depthToLeaf < depthToLeaf)) {
            table.remove(position);
         } else {
            switch (entryType) {
               case Entry.Type.UPPER_BOUND:
                  entry.upperBound= score;
                  entry.type &= entryType;
                  break;
               case Entry.Type.EXACT:
                  entry.exactScore= score;
                  entry.type &= entryType;
                  break;
               case Entry.Type.LOWER_BOUND:
                  entry.lowerBound= score;
                  entry.type &= entryType;
                  break;
               default:
                  return;
            }
            table.remove(position);
         }
      } else {
         entry= new Entry(
               score,
               depthToLeaf,
               entryType);
      }
      table.put(
            position.getImmutable(),
            entry);
   }

   public void clear(
         boolean white) {
      if (white) {
         this.whiteTable.clear();
      } else {
         this.blackTable.clear();
      }
   }

   private static class Table<K,V> extends LinkedHashMap<K,V> {
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

   public static class Entry implements Serializable {

      public static final long serialVersionUID = 1L;

      public int upperBound;
      public int exactScore;
      public int lowerBound;
      public int depthToLeaf;
      public int type;

      public Entry(
            int value,
            int depthToLeaf,
            int entryType) {
         switch (entryType) {
            case Type.LOWER_BOUND:
               this.lowerBound= value;
               break;
            case Type.EXACT:
               this.exactScore= value;
               break;
            case Type.UPPER_BOUND:
               this.upperBound= value;
               break;
         }
         this.depthToLeaf= depthToLeaf;
         this.type= entryType;
      }

      public static interface Type extends Serializable {
         public static final long serialVersionUID = 1L;

         public final static int  EXACT            = 1;
         public final static int  LOWER_BOUND      = 2;
         public final static int  UPPER_BOUND      = 4;
      }

   }

}

