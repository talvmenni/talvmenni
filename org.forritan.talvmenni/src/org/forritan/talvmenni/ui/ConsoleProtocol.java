package org.forritan.talvmenni.ui;

public class ConsoleProtocol implements UiProtocol {
	private String prompt;

	public ConsoleProtocol() {
		this.prompt = ":\\>";
	}

	public String processInput(String theInput) {
		String theOutput = null;

		if ("cmd".equalsIgnoreCase(theInput)) {
			theOutput = welcomeMessage();
		} else if ("quit".equalsIgnoreCase(theInput)) // quit and exit
		{
			theOutput = "bye";
			
		}

		return theOutput;

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

	private String welcomeMessage() {

		String message;
		message = "--------------------------------------------------------\n";
		message = message + "- Welcome to TalvMenni console -\n";
		message = message + "- -\n";
		message = message
				+ "- For help on usage, type in HELP and press enter. -\n";
		message = message + "- -\n";
		message = message + "- (Type in q and press enter to quit -\n";
		message = message
				+ "--------------------------------------------------------\n";

		return message;
	}
}