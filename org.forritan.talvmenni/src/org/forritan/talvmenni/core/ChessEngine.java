package org.forritan.talvmenni.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;

import org.forritan.talvmenni.bitboard.BitboardIterator;
import org.forritan.talvmenni.bitboard.attacks.Bishop;
import org.forritan.talvmenni.bitboard.attacks.BlackPawn;
import org.forritan.talvmenni.bitboard.attacks.King;
import org.forritan.talvmenni.bitboard.attacks.Knight;
import org.forritan.talvmenni.bitboard.attacks.Queen;
import org.forritan.talvmenni.bitboard.attacks.Rook;
import org.forritan.talvmenni.bitboard.attacks.WhitePawn;
import org.forritan.talvmenni.bitboard.paths.WhitePawnMoves;
import org.forritan.talvmenni.game.Move;
import org.forritan.talvmenni.game.MoveHistory;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.Rules;
import org.forritan.talvmenni.ui.ConsoleProtocol;
import org.forritan.talvmenni.ui.DebugWindow;
import org.forritan.talvmenni.ui.UciProtocol;
import org.forritan.talvmenni.ui.UiProtocol;
import org.forritan.talvmenni.ui.XboardProtocol;


public class ChessEngine implements Runnable {

   private boolean             running;

   private Protocol            protocol;

   private ThreadFactory       threadFactory;

   private LinkedBlockingQueue<String> inMessages;

   private LinkedBlockingQueue<String> outMessages;

   public static ChessEngine create() {
      ChessEngine engine= new ChessEngine();

      if (TalvMenni.DEBUG_WINDOW) {
         //TODO: !!!! Skal flytast / gerast asynkront / órogvar i/o við
         // WinBoard
         long time= -System.currentTimeMillis();
         new DebugWindow();
         time+= System.currentTimeMillis();
         System.err.println("Used "
               + time
               + " millis in main thread to create DebugWindow");
      }

      return engine;
   }

   private ChessEngine() {

      this.running= false;
      this.protocol= new ProtocolImpl();
      this.threadFactory= Executors.defaultThreadFactory();
      this.inMessages= new LinkedBlockingQueue<String>();
      this.outMessages= new LinkedBlockingQueue<String>();
   }

   public boolean isRunning() {
      return this.running;
   }

   public void setRunning(boolean running) {
      this.running= running;
      try {
         // InStreamHandler is blocking on System.in, so we close it, so that
         // the InStreamHandler thread gets interrupted.
         System.in.close(); 
      } catch (IOException e) {} // just exit quietly...
   }

   public void run() {
      this.running= true;
      this.threadFactory.newThread(new ProtocolHandler()).start();
      this.threadFactory.newThread(new InStreamHandler()).start();
      this.threadFactory.newThread(new OutStreamHandler()).start();
   }

   public Protocol getProtocol() {
      return this.protocol;
   }

   public interface Protocol {
      public String processInput(String input);

      public boolean isGo();
      public boolean setGo(boolean go);
      public void newGame();
      public void stop();
      public void whiteToMove();
      public void blackToMove();
      public boolean isWhiteToMove();
      public Position getCurrentPosition();
      public Rules getCurrentRules();
      public Move makeMove(long fromSquare, long toSquare, int promotionPiece);
   }

   private class ProtocolImpl implements Protocol {

      private UiProtocol uiProtocol;
      private Position   currentPosition;
      private Rules      currentRules;
      private boolean    go = false;
      private boolean    WhiteToMove = true;

      public String processInput(String theInput) {

         String theOutput= null;

         if (uiProtocol == null) {
            if (theInput.equalsIgnoreCase("xboard")) {
               uiProtocol= XboardProtocol.create(this); //Change protocol to
               // XboardProtocol
            } else if (theInput.equals("uci")) {
               uiProtocol= UciProtocol.create(this); //Change protocol to
               // UCIProtocol
            } else if (theInput.equals("cmd")) {
               uiProtocol= ConsoleProtocol.create(this); //Change protocol to
               // ConsoleProtocol
            }
         }

         if (uiProtocol != null) {
            theOutput= uiProtocol.processInput(theInput);
         }

         return theOutput;
      }

      public void stop() {
         currentRules= null;
         currentPosition= null;
         this.go= false;
         ChessEngine.this.setRunning(false);
      }

      public void newGame() {
         this.currentPosition= Position.createInitial();
         MoveHistory.getInstance().reset();
         this.WhiteToMove = true;
         this.go= true;
      }
      
      
      public void whiteToMove() {
         this.WhiteToMove= true;
      }

      public void blackToMove() {
         this.WhiteToMove= false;
      }

      public boolean isWhiteToMove() {
         return this.WhiteToMove;
      }

      public Rules getCurrentRules() {
         return this.currentRules;
      }
      public Position getCurrentPosition() {
         return this.currentPosition;
      }
      
      public Move makeMove(long fromSquare, long toSquare, int promotionPiece) {
         Move move= new Move(this.currentPosition, fromSquare, toSquare, promotionPiece);
         MoveHistory.getInstance().add(move);
         this.currentPosition = move.toPosition;
         this.WhiteToMove= !this.WhiteToMove;
         return move;
      }

      public boolean isGo() {
         return this.go;
      }

      public boolean setGo(boolean go) {
         return this.go= go;
      }

   }

   private class ProtocolHandler implements Runnable {

      public void run() {

         while (ChessEngine.this.isRunning()) {

            try {
               String reply= ChessEngine.this.protocol
                     .processInput(ChessEngine.this.inMessages.take());

               if (reply != null && reply.length() > 0) {
                  if (TalvMenni.DEBUG_WINDOW) {
                     DebugWindow.updateTekst("From_Talvmenni: "
                           + reply);
                  }
                  ChessEngine.this.outMessages.add(reply);
               }

            } catch (InterruptedException e) {
               e.printStackTrace();
            }
         }
      }
   }

   private class InStreamHandler implements Runnable {

      public void run() {

         BufferedReader inReader= new BufferedReader(new InputStreamReader(
               System.in));

         String inputMessage= "";

         while (ChessEngine.this.isRunning()) {

            try {
               inputMessage= inReader.readLine();
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
            if (inputMessage != null) {
               ChessEngine.this.inMessages.add(inputMessage);
               if (TalvMenni.DEBUG_WINDOW) {
                  DebugWindow.updateTekst("FromUI: "
                        + inputMessage);
               }

            }
            inputMessage= null;
         }
      }
   }

   private class OutStreamHandler implements Runnable {

      public void run() {

         while (ChessEngine.this.isRunning()) {

            try {
               System.out.println((String) ChessEngine.this.outMessages.take());
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
         }
      }
   }
}