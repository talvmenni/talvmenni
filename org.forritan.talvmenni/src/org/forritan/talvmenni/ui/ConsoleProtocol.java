package org.forritan.talvmenni.ui;

import org.forritan.talvmenni.core.ChessEngine.Protocol;


public class ConsoleProtocol extends UiProtocolBase {

   private static ConsoleProtocol instance;

   private ConsoleProtocol(Protocol protocol) {
      super(protocol);
   }

   public static ConsoleProtocol create(Protocol protocol) {
      if (ConsoleProtocol.instance == null) {
         ConsoleProtocol.instance= new ConsoleProtocol(protocol);
      }
      return ConsoleProtocol.instance;
   }

   public String processInput(String theInput) {
      String theOutput= null;

      if ("cmd".equalsIgnoreCase(theInput)) {
         theOutput= welcomeMessage();
      }

      if ("help".equalsIgnoreCase(theInput)) {
         theOutput= helpMessage();
      }

      if ("new".equalsIgnoreCase(theInput)) {
         theOutput= "Setting up a new game";
         this.protocol.newGame();
      }

      if ("position".equalsIgnoreCase(theInput)) {
         theOutput= boardPosition();
      }
      if ("white".equalsIgnoreCase(theInput)) {
         theOutput= "White to Move";
      }
      if ("black".equalsIgnoreCase(theInput)) {
         theOutput= "Black to Move";
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

   private String boardPosition() {
      String positionString= "";

      for (int x= 7; x >= 0; x--) {
         positionString= positionString
               + (x + 1)
               + " ";
         for (int y= 0; y < 8; y++) {
            positionString= positionString
                  + ". ";
         }
         positionString= positionString
               + "\n";
      }
      positionString= positionString
            + "  a b c d e f g h\n";
      return positionString;
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
            + "- \n";
      message= message
            + "- MOVELIST: Show the move-history \n";
      message= message
            + "- \n";
      message= message
            + "- POSITION: Display current position on prompt \n";
      message= message
            + "- \n";
      message= message
            + "- NEW: Start a new game \n";
      message= message
            + "- \n";
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
}