package org.forritan.talvmenni.ui;

import org.forritan.talvmenni.core.ChessEngine;


public class XboardProtocol extends UiProtocolBase {

   private static XboardProtocol instance;
   private static int            moveCounter;
   private static String         moves= "";

   private XboardProtocol(
         ChessEngine.Protocol protocol) {
      super(
            protocol);
   }

   public static XboardProtocol create(
         ChessEngine.Protocol protocol) {
      if (XboardProtocol.instance == null) {
         XboardProtocol.instance= new XboardProtocol(
               protocol);
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
      } else if (theInput.startsWith("usermove")) {
         
         // Royn teg nú!!! ;-) Koyr WinBoard...
         String move= theInput.substring(
               8).trim();
         
         moves+= move;
         
         if("d2d3e2e3c2c4f2f4b2b3g2g3".equalsIgnoreCase(moves)) {
            theOutput= "resign";
         } else if (move.length() == 4) {
            
            if ("d2d4".equalsIgnoreCase(move)) {
               theOutput= "offer draw\n";
            } else {
               theOutput= "";
            }
            
            theOutput+= "move ".concat(move.substring(
                  0,
                  1).concat(
                  Integer.toString(8 - (Integer.valueOf(
                        move.substring(
                              1,
                              2)).intValue() - 1))).concat(
                  move.substring(
                        2,
                        3)).concat(
                  Integer.toString(8 - (Integer.valueOf(
                        move.substring(
                              3,
                              4)).intValue() - 1))));
            moveCounter++;
         } else {
            theOutput= "offer draw";
         }
      } else if (theInput.equalsIgnoreCase("draw")) {
         theOutput= "offer draw";
      } else if (theInput.equalsIgnoreCase("quit")) {
         this.protocol.stop();
      }

      if (moveCounter > 10)
            theOutput+= "\n1/2-1/2 {Draw by boredom - You are playing all my moves?!?}";

      return theOutput;

   }

}