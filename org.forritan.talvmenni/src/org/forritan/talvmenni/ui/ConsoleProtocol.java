/**
 * talvmenni - A distributed chess-engine implemented in Java(TM)
 * and against Sun Microsystems Jini/JavaSpaces(TM).
 *  
 * Copyright (C) 2004-2006 Ey?un Lamhauge and Ey?un Nielsen
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

package org.forritan.talvmenni.ui;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.forritan.talvmenni.ChessEngineMethods;
import org.forritan.talvmenni.ChessEngine.Protocol;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.Squares;
import org.forritan.talvmenni.knowledge.ImmutablePosition;
import org.forritan.talvmenni.knowledge.Move;
import org.forritan.talvmenni.knowledge.MoveHistory;
import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.TheoryBook;


public class ConsoleProtocol extends UiProtocolBase {

   private static ConsoleProtocol instance;

   private ConsoleProtocol(
         Protocol protocol) {
      super(
            protocol);
   }

   public static ConsoleProtocol create(
         Protocol protocol) {
      if (ConsoleProtocol.instance == null) {
         ConsoleProtocol.instance= new ConsoleProtocol(
               protocol);
      }
      return ConsoleProtocol.instance;
   }

   public String processInput(
         String theInput) {
      String theOutput= null;

      if ("cmd".equalsIgnoreCase(theInput)) {
         theOutput= welcomeMessage();
      } else if ("help".equalsIgnoreCase(theInput)) {
         theOutput= helpMessage();
      } else if ("history".equalsIgnoreCase(theInput)) {
         theOutput= printHistory();
      } else if ("possible".equalsIgnoreCase(theInput)) {
         theOutput= printPossibleMoves();
      } else if ("possible white".equalsIgnoreCase(theInput)) {
         theOutput= printPossibleMoves(true);
      } else if ("possible black".equalsIgnoreCase(theInput)) {
         theOutput= printPossibleMoves(false);
      } else if ("new".equalsIgnoreCase(theInput)) {
         this.protocol.newGame();
         theOutput= "Setting up a new game...\n\n"
               + ConsoleProtocol.getStringBoard(
                     this.protocol.getCurrentPosition(),
                     this.getWhoIsToMove())
               + "\n";
      } else if (theInput.equalsIgnoreCase("go")) {
         this.protocol.setGo(true);
         theOutput= "Computer-thinking on\n";
      } else if (theInput.equalsIgnoreCase("force")) {
         this.protocol.setGo(false);
         theOutput= "Computer-thinking off\n";
      } else if (theInput.toUpperCase().startsWith(
            "PERFTM")) {
         String plyString= theInput.substring(
               6).trim();
         try {
            theOutput= this.perftm(Integer.parseInt(plyString));
         } catch (NumberFormatException e) {
            theOutput= "NumberFormatException: perft "
                  + plyString;
         }
      } else if (theInput.toUpperCase().startsWith(
            "PERFT")) {
         String plyString= theInput.substring(
               5).trim();
         try {
            theOutput= this.perft(Integer.parseInt(plyString));
         } catch (NumberFormatException e) {
            theOutput= "NumberFormatException: perft "
                  + plyString;
         }
      } else if (theInput.toUpperCase().startsWith(
            "MOVE")) {
         String theMove= theInput.substring(
               4).trim();
         theOutput= makeMove(theMove); // usermove
      } else if ((theInput.equalsIgnoreCase("?"))
            && (this.protocol.isGo())) {
         Move move= this.protocol.makeNextMove();
         if (move != null) {
            theOutput= "Moved "
                  + move
                  + "...\n"
                  + ConsoleProtocol.getStringBoard(
                        this.protocol.getCurrentPosition(),
                        this.getWhoIsToMove());
         } else {
            theOutput= getWhoIsToMove()
                  + " is checkmated!\n";
         }
      } else if ("position".equalsIgnoreCase(theInput)) {
         theOutput= ConsoleProtocol.getStringBoard(
               this.protocol.getCurrentPosition(),
               this.getWhoIsToMove());
      } else if ("fen".equalsIgnoreCase(theInput)) {
         theOutput= getStringFEN();
      } else if (theInput.toUpperCase().startsWith(
            "LOADBOOK")) {
         String fileName= theInput.substring(9);
         TheoryBook book= this.protocol.getStrategy().getTheoryBook();
         if (book != null) {
            try {
               book.loadBook(fileName);
               theOutput= "Book successfully loaded from "
                     + fileName
                     + ".";
            } catch (FileNotFoundException e) {
               theOutput= "File: "
                     + fileName
                     + " not found!";
            } catch (IOException e) {
               theOutput= "IOException: "
                     + e.getMessage();
            }
         } else {
            theOutput= "Current strategy doesn't support books, sorry!";
         }
      } else if (theInput.toUpperCase().startsWith(
            "SETBOARD")) {
         String theFEN= theInput.substring(8);

         this.protocol.setPositionFromFEN(theFEN);
         theOutput= ConsoleProtocol.getStringBoard(
               this.protocol.getCurrentPosition(),
               this.getWhoIsToMove());
      } else if ("white".equalsIgnoreCase(theInput)) {
         if (this.protocol.isWhiteToMove())
            theOutput= "White is already to move";
         else
            theOutput= "White to Move";
         this.protocol.whiteToMove();
      } else if ("black".equalsIgnoreCase(theInput)) {
         if (this.protocol.isWhiteToMove())
            theOutput= "Black to Move";
         else
            theOutput= "Black is already to move";
         this.protocol.blackToMove();
      } else if ("quit".equalsIgnoreCase(theInput)) // quit and exit
      {
         theOutput= "bye";
         this.protocol.stop();
      } else if (theOutput == null) {
         theOutput= "unknown command: "
               + theInput;
      }

      return theOutput;
   }

   private String getWhoIsToMove() {
      if (this.protocol.isWhiteToMove())
         return "White";
      else
         return "Black";
   }

   private String makeMove(
         String theMove) {

      if (theMove.length() < 4) { return "Illegal move format: "
            + theMove; }

      String fromSquare= theMove.substring(
            0,
            1).concat(
            Integer.toString(Integer.valueOf(
                  theMove.substring(
                        1,
                        2)).intValue())).toUpperCase();

      String toSquare= theMove.substring(
            2,
            3).concat(
            Integer.toString(Integer.valueOf(
                  theMove.substring(
                        3,
                        4)).intValue())).toUpperCase();

      int promotionPiece= Position.PromotionPiece.NONE;

      if (theMove.length() > 4) {
         String promoteTo= theMove.substring(
               4,
               5);
         if (promoteTo.equalsIgnoreCase("q")) {
            promotionPiece= ImmutablePosition.PromotionPiece.QUEEN;
         } else if (promoteTo.equalsIgnoreCase("r")) {
            promotionPiece= ImmutablePosition.PromotionPiece.ROOK;
         } else if (promoteTo.equalsIgnoreCase("b")) {
            promotionPiece= ImmutablePosition.PromotionPiece.BISHOP;
         } else if (promoteTo.equalsIgnoreCase("n")) {
            promotionPiece= ImmutablePosition.PromotionPiece.KNIGHT;
         }
      }

      Square square= Squares.create();
      Position currentPosition= this.protocol.getCurrentPosition();

      if (isLegalMove(
            square.getSquare(fromSquare),
            square.getSquare(toSquare),
            currentPosition)) {
         this.protocol.makeMove(
               square.getSquare(fromSquare),
               square.getSquare(toSquare),
               promotionPiece);
         return ConsoleProtocol.getStringBoard(
               this.protocol.getCurrentPosition(),
               this.getWhoIsToMove());
      } else
         return "Illegal Move: "
               + theMove;

   }

   private String helpMessage() {

      String message;

      message= "--------------------------------------------------------\n";
      message= message
            + "---                 List of commands                 ---\n";
      message= message
            + "--------------------------------------------------------\n";
      message= message
            + "- \n";
      message= message
            + "- HELP: This help screen \n";
      message= message
            + "- POSITION: Display current position \n";
      message= message
            + "- HISTORY: Show the movelist \n";
      message= message
            + "- POSSIBLE: Display list of allowed moves \n";
      message= message
            + "- NEW: Start a new game \n";
      message= message
            + "- MOVE: Make a move. (Format: 'MOVE fftt') \n";
      message= message
            + "- ?: Force computer to move now \n";
      message= message
            + "- FEN: Show the position in FEN-notation \n";
      message= message
            + "- SETBOARD: Setup a position. (Format: SETBOARD 'FEN-string' \n";
      message= message
            + "- WHITE: Give white the move \n";
      message= message
            + "- BLACK: Give black the move \n";
      message= message
            + "- QUIT: Quit and leave the program \n";
      message= message
            + "--------------------------------------------------------\n";

      return message;

   }

   private String welcomeMessage() {

      String message;

      message= "--------------------------------------------------------\n";
      message= message
            + "- Welcome to TalvMenni console -\n";
      message= message
            + "- \n";
      message= message
            + "- For help on usage, type in HELP and press enter. -\n";
      message= message
            + "- \n";
      message= message
            + "- (Type in quit and press enter to quit -\n";
      message= message
            + "--------------------------------------------------------\n";

      return message;
   }

   private String printPossibleMoves() {
      if (this.protocol.isWhiteToMove()) {
         return this.protocol.getCurrentPosition().getWhite()
               .getPossibleMoves().toString();
      } else {
         return this.protocol.getCurrentPosition().getBlack()
               .getPossibleMoves().toString();
      }
   }

   private String printPossibleMoves(
         boolean whiteMoves) {
      if (whiteMoves) {
         return this.protocol.getCurrentPosition().getWhite()
               .getPossibleMoves().toString();
      } else {
         return this.protocol.getCurrentPosition().getBlack()
               .getPossibleMoves().toString();
      }
   }

   private String perftm(
         int ply) {
      return ChessEngineMethods.perftm(
            this.protocol.getCurrentPosition().getImmutable(),
            this.protocol.isWhiteToMove(),
            ply);
   }

   private String perft(
         int ply) {
      long time= -System.currentTimeMillis();
      long perftMoves= ChessEngineMethods.perft(
            this.protocol.getCurrentPosition().getMutable(),
            this.protocol.isWhiteToMove(),
            ply);
      time+= System.currentTimeMillis();
      return "Total moves="
            + perftMoves
            + "  time="
            + time;
   }

   private String printHistory() {
      StringBuffer result= new StringBuffer();
      List history= MoveHistory.getInstance().getHistory();
      int number= 1;
      for (Iterator it= history.iterator(); it.hasNext();) {
         Move move= (Move) it.next();
         if ((number++ % 2) != 0) {
            result.append(
                  number / 2).append(
                  ". ").append(
                  move);
         } else {
            result.append(
                  ", ").append(
                  move).append(
                  "\n");
         }
      }
      return result.toString();
   }

   private boolean isLegalMove(
         long fromSquare,
         long toSquare,
         Position currentPosition) {
      if (currentPosition == null) {
         System.out.println("ERROR: No game created");
         return false;
      }
      if (currentPosition.getWhite().isAnyPieceOnPosition(
            fromSquare)
            && !this.protocol.isWhiteToMove()) return false;
      if (currentPosition.getBlack().isAnyPieceOnPosition(
            fromSquare)
            && this.protocol.isWhiteToMove()) return false;
      if (!currentPosition.isLegalMove(
            fromSquare,
            toSquare)) return false;
      return true;
   }

   private static String getStringPiece(
         Position p,
         long square) {
      if (p != null) {
         if (p.getWhite().isPawn(
               square))
            return "P";
         else if (p.getBlack().isPawn(
               square))
            return "p";
         else if (p.getWhite().isRook(
               square))
            return "R";
         else if (p.getBlack().isRook(
               square))
            return "r";
         else if (p.getWhite().isBishop(
               square))
            return "B";
         else if (p.getBlack().isBishop(
               square))
            return "b";
         else if (p.getWhite().isKnight(
               square))
            return "N";
         else if (p.getBlack().isKnight(
               square))
            return "n";
         else if (p.getWhite().isQueen(
               square))
            return "Q";
         else if (p.getBlack().isQueen(
               square))
            return "q";
         else if (p.getWhite().isKing(
               square))
            return "K";
         else if (p.getBlack().isKing(
               square))
            return "k";
         else
            return ".";
      } else
         return ".";
   }

   private String getStringFEN() {
      Position board= this.protocol.getCurrentPosition();

      StringBuffer result= new StringBuffer();
      int countEmptySquares= 0;

      for (int y= 0; y < 8; y++) {
         for (int x= 0; x < 8; x++) {
            int square= y
                  * 8
                  + x;

            Square square2= Squares.create();
            long sq;

            sq= square2.getSquareNormalizedIndex(square);

            if ((!board.getWhite().isAnyPieceOnPosition(
                  sq))
                  && (!board.getBlack().isAnyPieceOnPosition(
                        sq))) {
               countEmptySquares++;
            }

            else {
               if (countEmptySquares > 0) {
                  result.append(countEmptySquares);
                  countEmptySquares= 0;
               }

               result.append(ConsoleProtocol.getStringPiece(
                     this.protocol.getCurrentPosition(),
                     sq));
            }
         }

         if (countEmptySquares > 0) {
            result.append(countEmptySquares);
            countEmptySquares= 0;
         }

         if (y < 7) {
            result.append("/");
         }

      }
      result.append(" ");
      result.append((this.protocol.isWhiteToMove()) ? "w" : "b");
      result.append(" ");

      return result.toString();
   }

   public static String getStringBoard(
         Position p,
         String whoIsToMove) {
      String positionString= "    ---------------\n";
      Square square= Squares.create();
      long sq;

      for (int x= 8; x > 0; x--) {
         positionString= positionString
               + x
               + " | ";
         for (int y= 0; y < 8; y++) {
            sq= square.getSquareNormalizedIndex(64
                  - (x * 8)
                  + y);
            positionString= positionString
                  + ConsoleProtocol.getStringPiece(
                        p,
                        sq)
                  + " ";
         }
         positionString= positionString
               + "|\n";
      }
      positionString= positionString
            + "    ---------------\n";
      positionString= positionString
            + "    a b c d e f g h\n";
      positionString= positionString
            + "    ["
            + whoIsToMove
            + " to move]\n";

      return positionString;

   }

}