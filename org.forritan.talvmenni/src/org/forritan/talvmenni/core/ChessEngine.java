package org.forritan.talvmenni.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;

import org.forritan.talvmenni.game.Move;
import org.forritan.talvmenni.game.MoveHistory;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.Rules;
import org.forritan.talvmenni.ui.ConsoleProtocol;
import org.forritan.talvmenni.ui.UciProtocol;
import org.forritan.talvmenni.ui.UiProtocol;
import org.forritan.talvmenni.ui.XboardProtocol;


public class ChessEngine extends Observable implements Runnable {

   private boolean             running;
   private Protocol            protocol;
   private ThreadFactory       threadFactory;
   private LinkedBlockingQueue<String> inMessages;
   private LinkedBlockingQueue<String> outMessages;
   private ProtocolHandler protocolHandler;

   public static ChessEngine create() {
      return new ChessEngine();
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

   public void run() {
      this.running= true;
      this.protocolHandler= new ProtocolHandler();
      this.threadFactory.newThread(this.protocolHandler).start();
      this.threadFactory.newThread(new InStreamHandler()).start();
      this.threadFactory.newThread(new OutStreamHandler()).start();
   }

   public Protocol getProtocol() {
      return this.protocol;
   }

   public synchronized void addObserver(Observer observer) {
      this.protocolHandler.addObserver(observer);
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
         ChessEngine.this.running= false;
         try {
            // InStreamHandler is blocking on System.in, so we close it, so that
            // the InStreamHandler thread gets interrupted.
            System.in.close(); 
         } catch (IOException e) {} // just exit quietly...
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

   private class ProtocolHandler extends Observable implements Runnable {
      public void run() {
         while (ChessEngine.this.isRunning()) {
            try {
               String message= ChessEngine.this.inMessages.take();
               this.setChanged();
               this.notifyObservers(message);
               String reply= ChessEngine.this.protocol.processInput(message);
               if (reply != null && reply.length() > 0) {
                  ChessEngine.this.outMessages.add(reply);
                  this.setChanged();
                  this.notifyObservers(reply);
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
               e.printStackTrace();
            }
            if (inputMessage != null) {
               ChessEngine.this.inMessages.add(inputMessage);
            }
            inputMessage= null;
         }
      }
   }

   private class OutStreamHandler implements Runnable {
      public void run() {
         while (ChessEngine.this.isRunning()) {
            try {
               System.out.println(ChessEngine.this.outMessages.take());
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
         }
      }
   }
}