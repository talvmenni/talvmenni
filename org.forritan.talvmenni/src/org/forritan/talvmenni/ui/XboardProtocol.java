package org.forritan.talvmenni.ui;

import org.forritan.talvmenni.core.ChessEngine;

public class XboardProtocol extends UiProtocolBase {

   private static XboardProtocol instance;

   private XboardProtocol(ChessEngine.Protocol protocol) {
      super(protocol);
   }

   public static XboardProtocol create(ChessEngine.Protocol protocol) {
      if (XboardProtocol.instance == null) {
         XboardProtocol.instance= new XboardProtocol(protocol);
      }
      return XboardProtocol.instance;
   }

   public String processInput(
         String theInput) {
      String theOutput= null;

      if (theInput.equalsIgnoreCase("protover 2")) {
         theOutput= "feature usermove=1 "
               + "time=0 " //We have not implemented timecontrol yet
               + "sigint=0 "
               + "sigterm=0 "
               + "analyze=0 " //We have not implemented analyze yet
               + "myname=\"TALVMENNI v 0.1\""
               + "done=1";
      }

      if (theInput.startsWith("usermove")) {
         theOutput= "isAmove";
      }

      return theOutput;

   }

}