package org.forritan.talvmenni.ui;

import org.forritan.talvmenni.core.ChessEngine.Protocol;


public class UciProtocol extends UiProtocolBase {

   private static UciProtocol instance;

   private UciProtocol(
         Protocol protocol) {
      super(
            protocol);
   }

   public static UciProtocol create(
         Protocol protocol) {
      if (UciProtocol.instance == null) {
         UciProtocol.instance= new UciProtocol(
               protocol);
      }
      return UciProtocol.instance;
   }

   public String processInput(
         String input) {
      // TODO Auto-generated method stub
      return null;
   }

}