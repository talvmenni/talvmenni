package org.forritan.talvmenni.ui;

public class UciProtocol implements UiProtocol {

   private static UciProtocol instance;

   private UciProtocol() {
   }

   public static UciProtocol create() {
      if (UciProtocol.instance == null) {
         UciProtocol.instance= new UciProtocol();
      }
      return UciProtocol.instance;
   }

   public String processInput(
         String input) {
      // TODO Auto-generated method stub
      return null;
   }

}