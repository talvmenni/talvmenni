package org.forritan.talvmenni.core;

public class TalvMenni {
   public static void main(
         String args[]) {
      ChessEngine chessEngine= ChessEngine.create();
      ChessEngineProtocol chessEngineProtocol= ChessEngineProtocol
            .create(chessEngine);
      
         new ChessEngineThread(
               chessEngineProtocol).start();
   }
}