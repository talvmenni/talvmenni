package org.forritan.talvmenni.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.forritan.talvmenni.core.ChessEngine;


public class ConsoleProtocol {
   private String  prompt;
   private boolean isRunning;
   ChessEngine     AChessEngine = ChessEngine.create();

   public ConsoleProtocol() {
      isRunning= true;
      this.prompt= ":\\>";
   }

   public void run() {
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
//      if ("".equalsIgnoreCase(input)
//            || input.matches("( )*")) {
//         //Just ignore it...
//      } else if ("new".equalsIgnoreCase(input)) // Start a new game
//      {
//         AChessEngine.newGame();
//         System.out.println(this.prompt
//               + "New game has been setup");
//      } else if ("white".equalsIgnoreCase(input)) // white to move
//      {
//         AChessEngine.WhiteToMove();
//         System.out.println(this.prompt
//               + "White to move...");
//      } else if ("black".equalsIgnoreCase(input)) // black to move
//      {
//         AChessEngine.BlackToMove();
//         System.out.println(this.prompt
//               + "Black to move...");
//      } else if ("go".equalsIgnoreCase(input)) // Stop the engine
//      {
//         AChessEngine.startEngine();
//         System.out.println(this.prompt
//               + "Talvmenni is started...");
//      } else if ("force".equalsIgnoreCase(input)) // Stop the engine
//      {
//         AChessEngine.stopEngine();
//         System.out.println(this.prompt
//               + "Talvmenni has been stopped...");
//      } else if ("q".equalsIgnoreCase(input) // quit and exit
//            || "quit".equalsIgnoreCase(input)
//            || "exit".equalsIgnoreCase(input)) {
//         AChessEngine= null;
//         System.out.println(this.prompt
//               + "Bye...");
//         System.out.flush();
//         this.isRunning= false;
//
//      } else if (AChessEngine.CheckLegalMove(input)) {
//         AChessEngine.NewMove(input);
//      } else {
//         System.out.println(this.prompt
//               + "Unknown command: "
//               + input.toString());
//      }
//      ;
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