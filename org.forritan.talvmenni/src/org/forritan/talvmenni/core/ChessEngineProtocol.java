package org.forritan.talvmenni.core;

import org.forritan.talvmenni.ui.UiProtocol;

public class ChessEngineProtocol {
   
   

   //    private static final int WAITING = 0;
   //    private static final int WHITE_TO_MOVE = 1;
   //    private static final int BLACK_TO_MOVE = 2;
   //
   //    private int state = WAITING;

   private ChessEngine chessEngine;
   private UiProtocol uiProtocol;

   public static ChessEngineProtocol create(
         ChessEngine chessEngine) {
      ChessEngineProtocol result= new ChessEngineProtocol(
            chessEngine);
      return result;
   }

   private ChessEngineProtocol(
         ChessEngine chessEngine) {
      this.chessEngine= chessEngine;
   }

   public String processInput(
         String theInput) {
      String theOutput= null;

      // Callbacks to chessEngine? Evaluation etc...

      if (theInput.equalsIgnoreCase("xboard")) {
         theOutput= "feature myname=\"TALVMENNI v 0.1\" done=1";
         //Change protocol to XboardProtocol?
      } else if (theInput.equals("d2d4")) {
         theOutput= "move d7d5";
      } else if (theInput.equals("e2e4")) {
         theOutput= "move c7c5";
      }

      return theOutput;
   }

   public boolean isRunning() {
      return this.chessEngine.isRunning();
   }

}