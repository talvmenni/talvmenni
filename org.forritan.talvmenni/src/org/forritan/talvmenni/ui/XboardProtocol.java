package org.forritan.talvmenni.ui;

import org.forritan.talvmenni.bitboard.Squares;
import org.forritan.talvmenni.core.ChessEngine;
import org.forritan.talvmenni.core.TalvMenni;
import org.forritan.talvmenni.game.Move;
import org.forritan.talvmenni.game.Position;


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
      String theOutput= "";

      if (theInput.equalsIgnoreCase("protover 2")) {
         theOutput+= "feature usermove=1 "
               + "setboard=1 "
               + "time=0 " //We have not implemented timecontrol yet
               + "sigint=0 "
               + "sigterm=0 "
               + "analyze=0 " //We have not implemented analyze yet
               + "myname=\""
               + TalvMenni.NAME
               + "-"
               + TalvMenni.VERSION
               + "\""
               + "done=1";
      } else if (theInput.toUpperCase().startsWith(
      "SETBOARD")) {
         String theFEN= theInput.substring(8);
         this.protocol.setPositionFromFEN(theFEN);
      } else if (theInput.toUpperCase().equalsIgnoreCase("POST")) {
         this.protocol.postThinking(true);
      } else if (theInput.toUpperCase().equalsIgnoreCase("NOPOST")) {
         this.protocol.postThinking(false);
      } else if (theInput.startsWith("usermove")) {
         String moveString= theInput.substring(
               8).trim();

         int promotionPiece= Position.PromotionPiece.DEFAULT;

         if (moveString.length() > 4) {
            String promoteTo= moveString.substring(
                  4,
                  5);
            for (int i= 0; i < Position.PromotionPiece.STRINGS.length; i++) {
               if (promoteTo
                     .equalsIgnoreCase(Position.PromotionPiece.STRINGS[i])) {
                  promotionPiece= i;
               }
            }
         }

         this.protocol.makeMove(
               Squares.create().getSquare(
                     moveString.substring(
                           0,
                           2).toUpperCase()),
               Squares.create().getSquare(
                     moveString.substring(
                           2,
                           4).toUpperCase()),
               promotionPiece);

         if (this.protocol.isGo()) {

            Move move= this.protocol.makeNextMove();
            if (move != null) {

               theOutput+= "move "
                     + move.toString();
            } else {
               if (this.protocol.isWhiteToMove()) {
                  if (this.protocol.getCurrentPosition().white.isChecked()) {
                     theOutput+= "0-1 {Black mates}";
                  } else {
                     theOutput+= "1/2-1/2 {Stalemate}";
                  }
               } else {
                  if (this.protocol.getCurrentPosition().black.isChecked()) {
                     theOutput+= "1-0 {White mates}";
                  } else {
                     theOutput+= "1/2-1/2 {Stalemate}";
                  }
               }
            }
         }

      } else if (theInput.equalsIgnoreCase("go")) {
         
         this.protocol.setGo(true);
         Move move= this.protocol.makeNextMove();
         
         if (move != null) {
            theOutput+= "move "
                  + move.toString();
         } else {
            if (this.protocol.isWhiteToMove()) {
               if (this.protocol.getCurrentPosition().white.isChecked()) {
                  theOutput+= "0-1 {Black mates}";
               } else {
                  theOutput+= "1/2-1/2 {Stalemate}";
               }
            } else {
               if (this.protocol.getCurrentPosition().black.isChecked()) {
                  theOutput+= "1-0 {White mates}";
               } else {
                  theOutput+= "1/2-1/2 {Stalemate}";
               }
            }
         }
         
      } else if (theInput.equalsIgnoreCase("force")) {
         this.protocol.setGo(false);
      } else if (theInput.equalsIgnoreCase("draw")) {
         theOutput+= "offer draw";
      } else if (theInput.equalsIgnoreCase("new")) {
         this.protocol.newGame();
      } else if (theInput.startsWith("result")) {
         //the game ended
      } else if (theInput.equalsIgnoreCase("quit")) {
         this.protocol.stop();
      }
      return theOutput;
   }
}