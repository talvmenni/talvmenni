package org.forritan.talvmenni.ui;

import org.forritan.talvmenni.bitboard.Squares;
import org.forritan.talvmenni.core.ChessEngine;
import org.forritan.talvmenni.game.Move;


public class XboardProtocol extends UiProtocolBase {

   private static XboardProtocol instance;

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
         String moveString= theInput.substring(
               8).trim();
         String from= moveString.substring(
               0,
               2);
         String to= moveString.substring(
               2,
               4);
         
         System.err.println("From: " + from + " - To: " + to);

         this.protocol.makeMove(
               Squares.create().getSquare(from.toUpperCase()),
               Squares.create().getSquare(to.toUpperCase()));
         Move move= this.protocol.makeRandomMove();
         theOutput= "move "
               + move.toString();

      } else if (theInput.equalsIgnoreCase("draw")) {
         theOutput= "offer draw";
      } else if (theInput.equalsIgnoreCase("new")) {
         this.protocol.newGame();
      } else if (theInput.equalsIgnoreCase("quit")) {
         this.protocol.stop();
      }

      return theOutput;

   }

}