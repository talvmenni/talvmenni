package org.forritan.talvmenni.UI;

public class ChessEngine {

   private static boolean WhiteToMove; //0 or 1: Is white to move or not?
   private static boolean BlackToMove; //0 or 1: Is black to move or not?

   public ChessEngine() {
      WhiteToMove= true;
      BlackToMove= false;
   }

   public static void startEngine() {
      ChessEngine ChessEngine= new ChessEngine();

   }

   /**
    *  
    */
   public static void stopEngine() {
      // TODO Auto-generated method stub

   }

   /**
    *  
    */
   public static void WhiteToMove() {
      WhiteToMove= true;
      BlackToMove= !WhiteToMove;

   }

   /**
    *  
    */
   public static void BlackToMove() {
      BlackToMove= true;
      WhiteToMove= !BlackToMove;

   }

}