package org.forritan.talvmenni.ui;

import org.forritan.talvmenni.bitboard.Squares;
import org.forritan.talvmenni.core.ChessEngine;
import org.forritan.talvmenni.core.TalvMenni;
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

      if (TalvMenni.TELLUSER_ALL_INPUT) {
         theOutput+= "telluser ";

         if (TalvMenni.DEBUG_NAME != null) {
            theOutput+= TalvMenni.DEBUG_NAME
                  + ": ";
         }

         theOutput+= theInput
               + "\n";
      }

      if (theInput.equalsIgnoreCase("protover 2")) {
         theOutput+= "feature usermove=1 "
               + "time=0 " //We have not implemented timecontrol yet
               + "sigint=0 "
               + "sigterm=0 "
               + "analyze=0 " //We have not implemented analyze yet
               + "myname=\""
               + TalvMenni.NAME
               + " "
               + TalvMenni.VERSION
               + "\""
               + "done=1";
      } else if (theInput.startsWith("usermove")) {
         String moveString= theInput.substring(
               8).trim();
         
         int promotionPiece= Position.PromotionPiece.DEFAULT;;

         if(moveString.length() > 4) {
            String promoteTo= moveString.substring(4, 5);
            if(promoteTo.equalsIgnoreCase("q")) {
               promotionPiece= Position.PromotionPiece.QUEEN;               
            } else if(promoteTo.equalsIgnoreCase("r")) {
               promotionPiece= Position.PromotionPiece.ROOK;               
            } else if(promoteTo.equalsIgnoreCase("b")) {
               promotionPiece= Position.PromotionPiece.BISHOP;               
            } else if(promoteTo.equalsIgnoreCase("n")) {
               promotionPiece= Position.PromotionPiece.KNIGHT;                              
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
            org.forritan.talvmenni.game.Position.Move move= this.protocol
                  .getCurrentPosition().getRandomMove(
                        this.protocol.isWhiteToMove());
            this.protocol.makeMove(
                  move.from,
                  move.to, 
                  promotionPiece);
            theOutput+= "move "
                  + move.toString();
         }

      } else if (theInput.equalsIgnoreCase("go")) {
         this.protocol.setGo(true);
         org.forritan.talvmenni.game.Position.Move move= this.protocol
               .getCurrentPosition().getRandomMove(
                     this.protocol.isWhiteToMove());
         this.protocol.makeMove(
               move.from,
               move.to,
               Position.PromotionPiece.DEFAULT);
         
         theOutput+= "move "
               + move.toString();
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