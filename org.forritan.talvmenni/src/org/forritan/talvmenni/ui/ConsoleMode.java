package org.forritan.talvmenni.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ConsoleMode {
   private String  prompt;
   private boolean isRunning;

   public ConsoleMode() {
      isRunning= true;
      this.prompt= ":\\>";
   }

   public void create() {
      welcomeMessage();

      while (this.isRunning) {
         System.out.print(this.prompt);
         BufferedReader inputReader= new BufferedReader(new InputStreamReader(
               System.in));
         String input= null;
         try {
            input= inputReader.readLine();
         } catch (IOException e) {
         }
         if (input != null) {
            this.processInput(input);
         }
         input= null;
      }

   }

   /**
    * @param input
    */
   private void processInput(String input) {
      if ("".equalsIgnoreCase(input)
            || input.matches("( )*")) {
         //Just ignore it...
      } else if ("new".equalsIgnoreCase(input)) // Start a new game
      {
         ChessEngine ChessEngine= new ChessEngine();
         ChessEngine.startEngine();
         System.out.println(this.prompt
               + "Talvmenni has started...");
      } else if ("white".equalsIgnoreCase(input)) // Stop the game
      {
//         ChessEngine.WhiteToMove();
         System.out.println(this.prompt
               + "White to move...");
      } else if ("black".equalsIgnoreCase(input)) // black to move
      {
//         ChessEngine.BlackToMove();
         System.out.println(this.prompt
               + "Black to move...");
      } else if ("force".equalsIgnoreCase(input)) // white to move
      {
//         ChessEngine.stopEngine();
         System.out.println(this.prompt
               + "Talvmenni has been stopped...");
      } else if ("q".equalsIgnoreCase(input)
            || "quit".equalsIgnoreCase(input)
            || "exit".equalsIgnoreCase(input)) {
         System.out.println(this.prompt
               + "Bye...");
         System.out.flush();
         this.isRunning= false;
      }
   }

   private void welcomeMessage() {

      StringBuffer message= new StringBuffer();
      message.append(
            "--------------------------------------------------------\n")
            .append("- Welcome to TalvMenni console -\n").append(
                  "-                                                      -\n")
            .append(
                  "- For help on usage, type in HELP and press enter.     -\n")
            .append(
                  "-                                                      -\n")
            .append(
                  "- (Type in q  and press enter to quit                  -\n")
            .append(
                  "--------------------------------------------------------\n");
      System.out.println(message.toString());
   }

}