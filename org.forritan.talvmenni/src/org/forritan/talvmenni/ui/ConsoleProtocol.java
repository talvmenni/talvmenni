package org.forritan.talvmenni.ui;

import java.util.List;

import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.Squares;
import org.forritan.talvmenni.core.ChessEngine.Protocol;
import org.forritan.talvmenni.game.ImmutablePosition;
import org.forritan.talvmenni.game.Move;
import org.forritan.talvmenni.game.MoveHistory;
import org.forritan.talvmenni.game.OpeningBook;
import org.forritan.talvmenni.game.Position;

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
      if ("possible".equalsIgnoreCase(theInput)) {
         theOutput= printPossibleMoves();
      }
      if ("possible white".equalsIgnoreCase(theInput)) {
         theOutput= printPossibleMoves(true);
      }
      if ("possible black".equalsIgnoreCase(theInput)) {
         theOutput= printPossibleMoves(false);
      }
      if ("new".equalsIgnoreCase(theInput)) {
         this.protocol.newGame();
         theOutput= "Setting up a new game...\n\n"
               + ConsoleProtocol.getStringBoard(this.protocol.getCurrentPosition(), this.getWhoIsToMove())
               + "\n";
      }
   if (theInput.equalsIgnoreCase("go")) {
      this.protocol.setGo(true);
      theOutput= "Computer-thinking on\n";}
    if (theInput.equalsIgnoreCase("force")) {
      this.protocol.setGo(false );
      theOutput= "Computer-thinking off\n";}      
      
      if (theInput.toUpperCase().startsWith(
            "MOVE")) {
         String theMove= theInput.substring(
               4).trim();

         theOutput= makeMove(theMove); // usermove
      }

      if ((theInput.equalsIgnoreCase("?")) && (this.protocol.isGo())) {
         Move move= this.protocol.makeNextMove();
         if(move != null) {
           theOutput = ConsoleProtocol.getStringBoard(this.protocol.getCurrentPosition(), this.getWhoIsToMove());
         }
         else {
            theOutput = getWhoIsToMove()+" is checkmated!\n";                  
         }
      }
      
      if ("position".equalsIgnoreCase(theInput)) {
         theOutput= ConsoleProtocol.getStringBoard(this.protocol.getCurrentPosition(), this.getWhoIsToMove());
      }
      if ("fen".equalsIgnoreCase(theInput)) {
         theOutput= getStringFEN();
      }
      if (theInput.toUpperCase().startsWith("LOADBOOK")) {
       	String theFile= theInput.substring(9);
          theOutput= OpeningBook.loadBook(theFile);
       }

   if (theInput.toUpperCase().startsWith("SETBOARD")) {
      	String theFEN= theInput.substring(8);

         this.protocol.setPositionFromFEN(theFEN);
         theOutput= ConsoleProtocol.getStringBoard(this.protocol.getCurrentPosition(), this.getWhoIsToMove());
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

   private String getWhoIsToMove() {
      if (this.protocol.isWhiteToMove())
         return "White";
      else
         return "Black";
   }

   private String makeMove(
         String theMove) {

      if (theMove.length() < 4)
      	{return "Illegal move format: "+theMove;
         }
      
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
      
      int promotionPiece= ImmutablePosition.PromotionPiece.DEFAULT;;

      if(theMove.length() > 4) {
         String promoteTo= theMove.substring(4, 5);
         if(promoteTo.equalsIgnoreCase("q")) {
            promotionPiece= ImmutablePosition.PromotionPiece.QUEEN;               
         } else if(promoteTo.equalsIgnoreCase("r")) {
            promotionPiece= ImmutablePosition.PromotionPiece.ROOK;               
         } else if(promoteTo.equalsIgnoreCase("b")) {
            promotionPiece= ImmutablePosition.PromotionPiece.BISHOP;               
         } else if(promoteTo.equalsIgnoreCase("n")) {
            promotionPiece= ImmutablePosition.PromotionPiece.KNIGHT;                              
         } 
      }

      
      Square square= Squares.create();
      Position currentPosition= this.protocol.getCurrentPosition();      
      
      if (isLegalMove(square.getSquare(fromSquare), square.getSquare(toSquare), currentPosition))
             {
             this.protocol.makeMove(
               square.getSquare(fromSquare),
               square.getSquare(toSquare),
               promotionPiece);
         return ConsoleProtocol.getStringBoard(this.protocol.getCurrentPosition(), this.getWhoIsToMove());
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

   private String printPossibleMoves()
   {
      if(this.protocol.isWhiteToMove()) {
         return this.protocol.getCurrentPosition().getWhite().getPossibleMoves().toString();
      } else {
         return this.protocol.getCurrentPosition().getBlack().getPossibleMoves().toString();
      }
   }

   private String printPossibleMoves(boolean whiteMoves)
   {
      if(whiteMoves) {
         return this.protocol.getCurrentPosition().getWhite().getPossibleMoves().toString();
      } else {
         return this.protocol.getCurrentPosition().getBlack().getPossibleMoves().toString();
      }
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
   private boolean isLegalMove(
         long fromSquare, 
         long toSquare, 
         Position currentPosition)
   {
      if (currentPosition == null)
      { System.out.println("ERROR: No game created");
         return false;}
      if (currentPosition.getWhite().isAnyPieceOnPosition(fromSquare) && !this.protocol.isWhiteToMove())
          return false;
      if (currentPosition.getBlack().isAnyPieceOnPosition(fromSquare) && this.protocol.isWhiteToMove())
         return false;
      if (!currentPosition.isLegalMove(fromSquare, toSquare))
         return false;
      return true;
   }
   
   private static String getStringPiece(
         Position p, 
         long square) {
      if (p != null) {
         if (p.getWhite().isPawn(square))
            return "P";
         else if (p.getBlack().isPawn(square))
            return "p";
         else if (p.getWhite().isRook(square))
            return "R";
         else if (p.getBlack().isRook(square))
            return "r";
         else if (p.getWhite().isBishop(square))
            return "B";
         else if (p.getBlack().isBishop(square))
            return "b";
         else if (p.getWhite().isKnight(square))
            return "N";
         else if (p.getBlack().isKnight(square))
            return "n";
         else if (p.getWhite().isQueen(square))
            return "Q";
         else if (p.getBlack().isQueen(square))
            return "q";
         else if (p.getWhite().isKing(square))
            return "K";
         else if (p.getBlack().isKing(square))
            return "k";
         else
            return ".";
      } else
         return ".";
   }

   private String getStringFEN() {
      Position board= this.protocol.getCurrentPosition();

      StringBuffer result = new StringBuffer();
      int countEmptySquares = 0;
      
      for (int y = 0; y <8; y++) {
          for (int x = 0; x < 8; x++) {
              int square = y * 8 + x;

              Square square2= Squares.create();
              long sq;

              sq= square2.getSquare(square);
              
              if ((!board.getWhite().isAnyPieceOnPosition(sq)) && (!board.getBlack().isAnyPieceOnPosition(sq))) {
                  countEmptySquares++;
              }

              else {
                  if (countEmptySquares > 0) {
                      result.append(countEmptySquares);
                      countEmptySquares = 0;
                  }
                  
                  result.append(ConsoleProtocol.getStringPiece(this.protocol.getCurrentPosition(), sq));
              }
          }
                      
          if (countEmptySquares > 0) {
              result.append(countEmptySquares);
              countEmptySquares = 0;
          }

          if (y < 7) {
              result.append("/");
          }

      }
      result.append (" ");
      result.append((this.protocol.isWhiteToMove()) ? "w" : "b");
      result.append(" ");

      return result.toString();
  }
   
   public static String getStringBoard(Position p, String whoIsToMove) {
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
                  + ConsoleProtocol.getStringPiece(p, sq)
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