package org.forritan.talvmenni.UI;

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

}