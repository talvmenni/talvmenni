package org.forritan.talvmenni.ui;

public class ChessEngine {

   public boolean WhiteToMove; //0 or 1: Is white to move or not?
   public boolean BlackToMove; //0 or 1: Is black to move or not?

   public ChessEngine() {
      WhiteToMove= true;
      BlackToMove= false;
   }

   public void startEngine() {

   }

   /**
    *  
    */
   public void stopEngine() {
      // TODO Auto-generated method stub

   }

   /**
    *  
    */
   public void WhiteToMove() {
      WhiteToMove= true;
      BlackToMove= !WhiteToMove;

   }

   /**
    *  
    */
   public void BlackToMove() {
      BlackToMove= true;
      WhiteToMove= !BlackToMove;

   }

   /**
    * 
    */
   public void newGame() {
      // TODO Auto-generated method stub
      
   }

   /**
    * @param xboardMessage
    * @return
    */
   public boolean CheckLegalMove(String xboardMessage) {
      // TODO Auto-generated method stub
      return false;
   }

   /**
    * 
    */
   public void NewMove(String xboardMessage) {

      //update board
      if (xboardMessage.equals("d2d4")) {
         System.out.println("move d7d5");
      } else if (xboardMessage.equals("e2e4")) {
         System.out.println("move c7c5");
      }
      
   }

}