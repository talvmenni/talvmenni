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

      if ("quit".equalsIgnoreCase(theInput)) // quit and exit
      {
         theOutput= "bye";
         this.protocol.stop();
      }

      return theOutput;
   }

   private String welcomeMessage() {

      String message;
      message= "--------------------------------------------------------\n";
      message= message
            + "- Welcome to TalvMenni console -\n";
      message= message
            + "- -\n";
      message= message
            + "- For help on usage, type in HELP and press enter. -\n";
      message= message
            + "- -\n";
      message= message
            + "- (Type in quit and press enter to quit -\n";
      message= message
            + "--------------------------------------------------------\n";

      return message;
   }
}