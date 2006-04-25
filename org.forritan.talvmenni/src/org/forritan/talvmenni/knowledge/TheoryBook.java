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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.Squares;
import org.forritan.talvmenni.knowledge.Position.ColorPosition;
import org.forritan.talvmenni.knowledge.Position.Move;


public class TheoryBook {

   private Table<Integer, List<TupleMoveWeight>> whiteBook;
   private Table<Integer, List<TupleMoveWeight>> blackBook;

   public TheoryBook(
         int maxBookEntries) {
      this.whiteBook= new Table<Integer, List<TupleMoveWeight>>(maxBookEntries);
      this.blackBook= new Table<Integer, List<TupleMoveWeight>>(maxBookEntries);
   }

   public void loadBook(
         String fileName) throws IOException {

      int whiteCollisions= 0;
      int blackCollisions= 0;

      BufferedReader reader= new BufferedReader(
            new FileReader(
                  fileName));

      int lineNumber= 0;
      boolean fenStringLine= true;
      String line= null;
      ColorPosition p= null;
      List<TupleMoveWeight> bookMoves= null;

      while ((line= reader.readLine()) != null) {
         lineNumber++;
         if (fenStringLine) {
            try {
               p= Position.Factory.createPositionFromFEN(
                     false,
                     false,
                     line);

               if (this.containsKey(
                     new Integer(p.position.hashCode()),
                     p.whiteToMove.booleanValue())) {

                  if (this.get(
                        new Integer(p.position.hashCode()),
                        p.whiteToMove.booleanValue()).size() != 0) {
                     if (p.whiteToMove.booleanValue()) {
                        whiteCollisions++;
                     } else {
                        blackCollisions++;
                     }
                  }

                  bookMoves= this.get(
                        new Integer(p.position.hashCode()),
                        p.whiteToMove.booleanValue());
               } else {
                  bookMoves= new ArrayList<TupleMoveWeight>();
               }
            } catch (IllegalArgumentException e) {
               fenStringLine= !fenStringLine; //try to read new fenString next
               // time also...
               //XXX: Remove...
               System.err
                     .println("IllegalArgumentException: [FENString] at lineNumber "
                           + lineNumber
                           + ": "
                           + line);
            }
         } else {
            Square sq= Squares.create();
            StringTokenizer st= new StringTokenizer(
                  line);
            while (st.hasMoreTokens()) {
               String moveAndScore= st.nextToken();
               if (moveAndScore.length() > 6) {
                  String from= moveAndScore.substring(
                        0,
                        2).toUpperCase();
                  String to= moveAndScore.substring(
                        2,
                        4).toUpperCase();

                  Position.Move move= new Position.Move(
                        sq.getSquare(from),
                        sq.getSquare(to),
                        Position.PromotionPiece.NONE);
                  //TODO: ?????? Position.PromotionPiece.NONE ?????
                  
                  Integer score= null;
                  try {
                     score= new Integer(moveAndScore.substring(
                           5,
                           (moveAndScore.length() - 1)));
                  } catch (NumberFormatException e) {
                     score= new Integer(0);
                     System.err
                           .println("NumberFormatException: [FENString] at lineNumber "
                                 + lineNumber
                                 + ": "
                                 + line);
                     System.err
                           .println("NumberFormatException: [moveAndScore]: "
                                 + moveAndScore);

                  }

                  if (p.whiteToMove.booleanValue()) {
                     if (p.position.getWhite().getPossibleMoves().contains(
                           move)) {
                        if (!bookMoves.contains(move)) {
                           bookMoves.add(new TupleMoveWeight(
                                 move,
                                 score));
                        }
                     }
                  } else {
                     if (p.position.getBlack().getPossibleMoves().contains(
                           move)) {
                        if (!bookMoves.contains(move)) {
                           bookMoves.add(new TupleMoveWeight(
                                 move,
                                 score));
                        }
                     }
                  }
               }
            }
         }

         this.put(
               new Integer(p.position.hashCode()),
               bookMoves,
               p.whiteToMove.booleanValue());
         fenStringLine= !fenStringLine;
      }

      System.err.println("Loaded whitebook and there where "
            + whiteCollisions
            + " collisions...");
      System.err.println("Loaded blackbook and there where "
            + blackCollisions
            + " collisions...");

   }

   public int size(
         boolean whiteBook) {
      if (whiteBook) {
         return this.whiteBook.size();
      } else {
         return this.blackBook.size();
      }
   }

   public boolean containsKey(
         Position key,
         boolean whiteBook) {
      return this.containsKey(
            new Integer(key.hashCode()),
            whiteBook);
   }

   public boolean containsKey(
         Integer key,
         boolean whiteBook) {
      if (whiteBook) {
         return this.whiteBook.containsKey(key);
      } else {
         return this.blackBook.containsKey(key);
      }
   }

   public List put(
         Integer key,
         List<TupleMoveWeight> value,
         boolean whiteBook) {
      if (whiteBook) {
         return this.whiteBook.put(
               key,
               value);
      } else {
         return this.blackBook.put(
               key,
               value);
      }
   }

   public List<TupleMoveWeight> get(
         Position key,
         boolean whiteBook) {
      return this.get(
            new Integer(key.hashCode()),
            whiteBook);
   }

   public List<TupleMoveWeight> get(
         Integer key,
         boolean whiteBook) {
      if (whiteBook) {
         return this.whiteBook.get(key);
      } else {
         return this.blackBook.get(key);
      }
   }

   public void clear(
         boolean whiteBook) {
      if (whiteBook) {
         this.whiteBook.clear();
      } else {
         this.blackBook.clear();
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
   
   public static class TupleMoveWeight {

      public Move move;
      public Integer weight;

      public TupleMoveWeight(
            Move move,
            Integer weight) {
         this.move= move;
         this.weight= weight;
      }
   }

}