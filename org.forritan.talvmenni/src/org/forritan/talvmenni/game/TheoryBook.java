package org.forritan.talvmenni.game;

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
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.util.Tuple;


public class TheoryBook {

   private Table<Integer, List<Tuple<Move, Integer>>> whiteBook;
   private Table<Integer, List<Tuple<Move, Integer>>> blackBook;

   public TheoryBook(
         int maxBookEntries) {
      this.whiteBook= new Table<Integer, List<Tuple<Move, Integer>>>(
            maxBookEntries);
      this.blackBook= new Table<Integer, List<Tuple<Move, Integer>>>(
            maxBookEntries);
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
      Tuple<Position, Boolean> p= null;
      List<Tuple<Move, Integer>> bookMoves= null;

      while ((line= reader.readLine()) != null) {
         lineNumber++;
         if (fenStringLine) {
            try {
               p= PositionFactory.createPositionFromFEN(
                     false,
                     line);

               if (this.containsKey(
                     Integer.valueOf(p.a.hashCode()),
                     p.b.booleanValue())) {

                  if (this.get(
                        Integer.valueOf(p.a.hashCode()),
                        p.b.booleanValue()).size() != 0) {
                     if (p.b.booleanValue()) {
                        whiteCollisions++;
                     } else {
                        blackCollisions++;
                     }
                  }

                  bookMoves= this.get(
                        Integer.valueOf(p.a.hashCode()),
                        p.b.booleanValue());
               } else {
                  bookMoves= new ArrayList<Tuple<Move, Integer>>();
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
                     if (p.a.getWhite().getPossibleMoves().contains(
                           move)) {
                        if (!bookMoves.contains(move)) {
                           bookMoves.add(new Tuple<Move, Integer>(
                                 move,
                                 score));
                        }
                     }
                  } else {
                     if (p.a.getBlack().getPossibleMoves().contains(
                           move)) {
                        if (!bookMoves.contains(move)) {
                           bookMoves.add(new Tuple<Move, Integer>(
                                 move,
                                 score));
                        }
                     }
                  }
               }
            }
         }

         this.put(
               Integer.valueOf(p.a.hashCode()),
               bookMoves,
               p.b.booleanValue());
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
            Integer.valueOf(key.hashCode()),
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

   public List<Tuple<Move, Integer>> put(
         Integer key,
         List<Tuple<Move, Integer>> value,
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

   public List<Tuple<Move, Integer>> get(
         Position key,
         boolean whiteBook) {
      return this.get(
            Integer.valueOf(key.hashCode()),
            whiteBook);
   }

   public List<Tuple<Move, Integer>> get(
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

}