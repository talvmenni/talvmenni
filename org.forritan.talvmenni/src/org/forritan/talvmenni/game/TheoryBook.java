package org.forritan.talvmenni.game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.Squares;
import org.forritan.util.Tuple;


public class TheoryBook {

   private Table<Position, Position> book;

   public TheoryBook(int maxBookEntries) {
      this.book= new Table<Position, Position>(
            maxBookEntries);
   }

   public void loadBook(
         String fileName) throws IOException {

      int collisions= 0;
      
      BufferedReader reader= new BufferedReader(
            new FileReader(
                  fileName));

      int lineNumber= 0;
      boolean fenStringLine= true;
      String line= null;
      Tuple<Position, Boolean> p= null;
      while ((line= reader.readLine()) != null) {
         lineNumber++;
         if (fenStringLine) {
            try {
               p= PositionFactory.createPositionFromFEN(
                     false,
                     line);
               if (this.containsKey(p.a)) {

                  if(p.b.booleanValue()) {
                     if(this.get(p.a).getWhite().getBookMoves().size() != 0) {
                        collisions++;
                     }
                  } else {
                     if(this.get(p.a).getBlack().getBookMoves().size() != 0) {
                        collisions++;
                     }
                  }
                  
                  p.a= this.get(p.a);
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
                        sq.getSquare(to));
                  Integer score= null;
                  try {
                     score= Integer.valueOf(moveAndScore.substring(
                           5,
                           (moveAndScore.length() - 1)));
                  } catch (NumberFormatException e) {
                     score= Integer.valueOf(0); 
                     System.err
                     .println("NumberFormatException: [FENString] at lineNumber "
                           + lineNumber
                           + ": "
                           + line);
                     System.err
                     .println("NumberFormatException: [moveAndScore]: "
                           + moveAndScore);
                     
                  }

                  if (p.b.booleanValue()) {
                     p.a.getWhite().addBookMove(
                           move,
                           score.intValue());
                  } else {
                     p.a.getBlack().addBookMove(
                           move,
                           score.intValue());
                  }
               }
            }
         }
         this.put(
               p.a,
               p.a);
         fenStringLine= !fenStringLine;
      }
      
      System.err.println("Loaded book and there where " + collisions + " collisions...");
      

   }

   public int size() {
      return this.book.size();
   }

   public boolean containsKey(
         Position key) {
      return this.book.containsKey(key);
   }

   public Position put(
         Position key,
         Position value) {
      return this.book.put(
            key,
            value);
   }

   public Position get(
         Position key) {
      return this.book.get(key);
   }

   public void clear() {
      this.book.clear();
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