package org.forritan.talvmenni.ui;

import java.io.*;

import org.forritan.talvmenni.core.ChessEngine;


public class XboardProtocol {

   private boolean isRunning;
   ChessEngine     AChessEngine = new ChessEngine();

   public XboardProtocol() {
      isRunning= true;
   }

   public void run() {

      BufferedReader inReader= new BufferedReader(new InputStreamReader(
            System.in));

      String xboardMessage= "";
      System.out.println("feature myname=\"TALVMENNI v 0.1\" done=1");

      while (this.isRunning) {
         try {
            xboardMessage= inReader.readLine();
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
         if (xboardMessage != null) {
            this.processInput(xboardMessage);
         }
         xboardMessage= null;

      }

   }

   /**
    * @param xboardMessage
    */
   private void processInput(String xboardMessage) {
      if ("new".equalsIgnoreCase(xboardMessage)) // Start a new game
      {
         AChessEngine.newGame();
      } else if ("white".equalsIgnoreCase(xboardMessage)) // white to move
      {
         AChessEngine.WhiteToMove();
      } else if ("black".equalsIgnoreCase(xboardMessage)) // black to move
      {
         AChessEngine.BlackToMove();
      } else if ("go".equalsIgnoreCase(xboardMessage)) // Stop the engine
      {
         AChessEngine.startEngine();
      } else if ("force".equalsIgnoreCase(xboardMessage)) // Stop the engine
      {
         AChessEngine.stopEngine();
      } else if ("q".equalsIgnoreCase(xboardMessage) // quit and exit
            || "quit".equalsIgnoreCase(xboardMessage)
            || "exit".equalsIgnoreCase(xboardMessage)) {
         AChessEngine= null;
         System.out.flush();
         this.isRunning= false;
      } else if (AChessEngine.CheckLegalMove(xboardMessage)) {
         AChessEngine.NewMove(xboardMessage);
      } else {//Unknown command from Xboard
      }
      ;
   }

}