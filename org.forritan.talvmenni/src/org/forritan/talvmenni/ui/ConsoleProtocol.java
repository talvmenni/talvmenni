package org.forritan.talvmenni.ui;

import java.util.List;

import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.Squares;
import org.forritan.talvmenni.core.ChessEngine.Protocol;
import org.forritan.talvmenni.game.Move;
import org.forritan.talvmenni.game.MoveHistory;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.Rules;


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
      }

      if ("help".equalsIgnoreCase(theInput)) {
         theOutput= helpMessage();
      }
      if ("history".equalsIgnoreCase(theInput)) {
         theOutput= printHistory();
      }

      if ("new".equalsIgnoreCase(theInput)) {
         this.protocol.newGame();
         theOutput= "Setting up a new game...\n\n"
               + this.getBoardPosition()
               + "\n";
      }

      if (theInput.toUpperCase().startsWith(
            "MOVE")) {
         String theMove= theInput.substring(
               4).trim();

         theOutput= makeMove(theMove);

      }

      if ("position".equalsIgnoreCase(theInput)) {
         theOutput= getBoardPosition();
      }
      if ("white".equalsIgnoreCase(theInput)) {
         if (this.protocol.isWhiteToMove())
            theOutput= "White is already to move";
         else
            theOutput= "White to Move";
         this.protocol.whiteToMove();
      }
      if ("black".equalsIgnoreCase(theInput)) {
         if (this.protocol.isWhiteToMove())
            theOutput= "Black to Move";
         else
            theOutput= "Black is already to move";
         this.protocol.blackToMove();
      }

      if ("quit".equalsIgnoreCase(theInput)) // quit and exit
      {
         theOutput= "bye";
         this.protocol.stop();
      }

      if (theOutput == null) {
         theOutput= "unknown command: "
               + theInput;
      }

      return theOutput;
   }

   private String getBoardPosition() {
      String positionString= "    ---------------\n";
      Square square= Squares.create();
      long sq;

      for (int x= 8; x > 0; x--) {
         positionString= positionString
               + x
               + " | ";
         for (int y= 0; y < 8; y++) {
            sq= square.getSquare(64
                  - (x * 8)
                  + y);
            positionString= positionString
                  + this.getStringPiece(sq)
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
            + getWhoIsToMove()
            + " to move]";

      return positionString;

   }

   private String getWhoIsToMove() {
      if (this.protocol.isWhiteToMove())
         return "White";
      else
         return "Black";
   }

   private String makeMove(
         String theMove) {

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

      Square square= Squares.create();
      Rules currentRules= this.protocol.getCurrentRules();
      Position currentPosition= this.protocol.getCurrentPosition();

      if (Rules.isMoveLegal(
            currentPosition,
            square.getSquare(fromSquare),
            square.getSquare(toSquare),
            this.protocol.isWhiteToMove())) {
         this.protocol.makeMove(
               square.getSquare(fromSquare),
               square.getSquare(toSquare));
         return getBoardPosition();
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
      //      message= message
      //            + "- \n";
      message= message
            + "- HISTORY: Show the movelist \n";
      //      message= message
      //            + "- \n";
      message= message
            + "- POSITION: Display current position on prompt \n";
      //      message= message
      //            + "- \n";
      message= message
            + "- NEW: Start a new game \n";
      message= message
            + "- MOVE: Make move. Format: 'MOVE fftt' \n";
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

   private String printHistory() {
      StringBuilder result= new StringBuilder();
      List<Move> history= MoveHistory.getInstance().getHistory();
      int number= 1;
      for(Move move : history )  {
         if((number++ % 2) != 0) {
            result.append(number / 2).append(". ").append(move);
         } else {
            result.append(", ").append(move).append("\n");
         }
      }
      return result.toString();            
   }

   public String getStringPiece(
         long square) {
      Position currentPosition= this.protocol.getCurrentPosition();
      if (currentPosition != null) {
         if (currentPosition.white.isPawn(square))
            return "P";
         else if (currentPosition.black.isPawn(square))
            return "p";
         else if (currentPosition.white.isRook(square))
            return "R";
         else if (currentPosition.black.isRook(square))
            return "r";
         else if (currentPosition.white.isBishop(square))
            return "B";
         else if (currentPosition.black.isBishop(square))
            return "b";
         else if (currentPosition.white.isKnight(square))
            return "N";
         else if (currentPosition.black.isKnight(square))
            return "n";
         else if (currentPosition.white.isQueen(square))
            return "Q";
         else if (currentPosition.black.isQueen(square))
            return "q";
         else if (currentPosition.white.isKing(square))
            return "K";
         else if (currentPosition.black.isKing(square))
            return "k";
         else
            return ".";
      } else
         return ".";
   }
}