package org.forritan.talvmenni.ui;

import org.forritan.talvmenni.TalvMenni;
import org.forritan.talvmenni.ChessEngine.Protocol;


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
         String theInput) {
      String theOutput= "";
      if (theInput.equalsIgnoreCase("isready")) {
         theOutput+= "readyok";
   } else if (theInput.equalsIgnoreCase("ucinewgame")) {
      this.protocol.newGame();
   }
      
      
      return theOutput;

   }
}


