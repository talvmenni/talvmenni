package org.forritan.talvmenni.ui;

public class ConsoleProtocol implements UiProtocol {

   private static ConsoleProtocol instance;

   private ConsoleProtocol() {
   }

   public static ConsoleProtocol create() {
      if (ConsoleProtocol.instance == null) {
         ConsoleProtocol.instance= new ConsoleProtocol();
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