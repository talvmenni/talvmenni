package org.forritan.talvmenni.core;

public class ChessEngine {

   private boolean running;

   public static ChessEngine create() {
      return new ChessEngine();
   }

   //   public boolean WhiteToMove; //0 or 1: Is white to move or not?
   //   public boolean BlackToMove; //0 or 1: Is black to move or not?

   private ChessEngine() {
      this.running= true;
      //      WhiteToMove= true;
      //      BlackToMove= false;
   }

   public boolean isRunning() {
      return this.running;
   }

   public void setRunning(
         boolean running) {
      this.running= running;
   }

//   public void startEngine() {
//
//   }
//
//   /**
//    *  
//    */
//   public void stopEngine() {
//      // TODO Auto-generated method stub
//
//   }
//
//   /**
//    *  
//    */
//   public void WhiteToMove() {
////      WhiteToMove= true;
////      BlackToMove= !WhiteToMove;
//
//   }
//
//   /**
//    *  
//    */
//   public void BlackToMove() {
////      BlackToMove= true;
////      WhiteToMove= !BlackToMove;
//
//   }
//
//   /**
//    *  
//    */
//   public void newGame() {
//      // TODO Auto-generated method stub
//
//   }
//
//   /**
//    * @param xboardMessage
//    * @return
//    */
//   public boolean CheckLegalMove(
//         String xboardMessage) {
//      // TODO Auto-generated method stub
//      return false;
//   }
//
//   /**
//    *  
//    */
//   public void NewMove(
//         String xboardMessage) {
//
//      //update board
//      if (xboardMessage.equals("d2d4")) {
//         System.out.println("move d7d5");
//      } else if (xboardMessage.equals("e2e4")) {
//         System.out.println("move c7c5");
//      }
//
//   }
}