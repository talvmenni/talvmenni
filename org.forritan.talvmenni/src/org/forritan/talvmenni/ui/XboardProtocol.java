package org.forritan.talvmenni.ui;

public class XboardProtocol implements UiProtocol {

	public String processInput(String theInput) {
		String theOutput= null;
		
		if (theInput.equalsIgnoreCase("xboard")) {
			theOutput= "feature myname=\"TALVMENNI v 0.1\" done=1";
         }
		
		return theOutput;
		
		
		
		//      if ("new".equalsIgnoreCase(xboardMessage)) // Start a new game
		//      {
		//         AChessEngine.newGame();
		//      } else if ("white".equalsIgnoreCase(xboardMessage)) // white to move
		//      {
		//         AChessEngine.WhiteToMove();
		//      } else if ("black".equalsIgnoreCase(xboardMessage)) // black to move
		//      {
		//         AChessEngine.BlackToMove();
		//      } else if ("go".equalsIgnoreCase(xboardMessage)) // Stop the engine
		//      {
		//         AChessEngine.startEngine();
		//      } else if ("force".equalsIgnoreCase(xboardMessage)) // Stop the
		// engine
		//      {
		//         AChessEngine.stopEngine();
		//      } else if ("q".equalsIgnoreCase(xboardMessage) // quit and exit
		//            || "quit".equalsIgnoreCase(xboardMessage)
		//            || "exit".equalsIgnoreCase(xboardMessage)) {
		//         AChessEngine= null;
		//         System.out.flush();
		//         this.isRunning= false;
		//      } else if (AChessEngine.CheckLegalMove(xboardMessage)) {
		//         AChessEngine.NewMove(xboardMessage);
		//      } else {//Unknown command from Xboard
		//      }
		//      ;
	}

}