package org.forritan.talvmenni.core;

public class TalvMenni {
   
   public static final boolean CROUCHING_TIGER_HIDDEN_DEBUG = false; // ...or just till the f***ing eclipse debugger gets up to speed... ;-)
   public static final boolean DEBUG_WINDOW = false;

   public static void main(
         String args[]) {
      ChessEngine chessEngine= ChessEngine.create();
      chessEngine.run();
   }
}