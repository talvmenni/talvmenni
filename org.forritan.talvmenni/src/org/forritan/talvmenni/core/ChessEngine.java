package org.forritan.talvmenni.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;

import org.forritan.talvmenni.game.Move;
import org.forritan.talvmenni.game.MoveHistory;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.PositionFactory;
import org.forritan.talvmenni.game.Rules;
import org.forritan.talvmenni.strategy.Strategy;
import org.forritan.talvmenni.ui.ConsoleProtocol;
import org.forritan.talvmenni.ui.UciProtocol;
import org.forritan.talvmenni.ui.UiProtocol;
import org.forritan.talvmenni.ui.XboardProtocol;
import org.forritan.util.Tuple;
import org.forritan.util.debug.ObjectCreationStatistics;


public class ChessEngine extends Observable implements Runnable {

   private Strategy                    strategy;
   private boolean                     running;
   private Protocol                    protocol;
   private ThreadFactory               threadFactory;
   private LinkedBlockingQueue<String> inMessages;
   private LinkedBlockingQueue<String> outMessages;
   private ProtocolHandler             protocolHandler;

   public static ChessEngine create(
         Strategy strategy) {
      return new ChessEngine(
            strategy);
   }

   private ChessEngine(
         Strategy strategy) {
      this.running= false;
      this.protocol= new ProtocolImpl();
      this.strategy= strategy;
      this.threadFactory= Executors.defaultThreadFactory();
      this.inMessages= new LinkedBlockingQueue<String>();
      this.outMessages= new LinkedBlockingQueue<String>();
   }

   public synchronized boolean isRunning() {
      return this.running;
   }

   public synchronized void run() {
      this.running= true;
      this.protocolHandler= new ProtocolHandler();
      this.threadFactory.newThread(
            this.protocolHandler).start();
      this.threadFactory.newThread(
            new InStreamHandler()).start();
      this.threadFactory.newThread(
            new OutStreamHandler()).start();
   }

   public synchronized Protocol getProtocol() {
      return this.protocol;
   }

   public synchronized void addObserver(
         Observer observer) {
      this.protocolHandler.addObserver(observer);
      this.protocol.getDebugInfo().addObserver(
            observer);
      this.strategy.getSearch().getDebugInfo().addObserver(
            observer);
      this.strategy.getSearch().getThinking().addObserver(
            observer);
   }

   public interface Protocol {
      public String processInput(
            String input);

      public boolean isGo();

      public boolean setGo(
            boolean go);

      public void newGame();

      public void stop();

      public void postThinking(
            boolean observeIt);

      public void whiteToMove();

      public void blackToMove();

      public boolean isWhiteToMove();

      public Position getCurrentPosition();

      public void setCurrentPosition(
            Position position);

      public void setPositionFromFEN(
            String FENString);

      public Rules getCurrentRules();

      public Move makeMove(
            long fromSquare,
            long toSquare);

      public Move makeMove(
            long fromSquare,
            long toSquare,
            int promotionPiece);

      public Move makeNextMove();

      public Strategy getStrategy();

      public ObjectCreationStatistics getObjectCreationStatistics();

      public DebugInfo getDebugInfo();
   }

   private class ProtocolImpl implements Protocol {

      private ObjectCreationStatistics objectCreationStatistics;
      private DebugInfo                debugInfo;
      private UiProtocol               uiProtocol;
      private Position                 currentPosition;
      private Rules                    currentRules;
      private boolean                  go          = false;
      private boolean                  whiteToMove = true;

      public ProtocolImpl() {
         this.debugInfo= new DebugInfo();
         this.objectCreationStatistics= new ObjectCreationStatistics();
      }

      public synchronized ObjectCreationStatistics getObjectCreationStatistics() {
         return this.objectCreationStatistics;
      }

      public synchronized DebugInfo getDebugInfo() {
         return this.debugInfo;
      }

      public synchronized String processInput(
            String theInput) {
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

      public synchronized void stop() {
         currentRules= null;
         this.setCurrentPosition(null);
         this.go= false;
         ChessEngine.this.running= false;
         //         try {
         //            // InStreamHandler is blocking on System.in, so we close it, so that
         //            // the InStreamHandler thread gets interrupted.
         //            System.in.close();
         //         } catch (IOException e) {} // just exit quietly...
      }

      public synchronized void newGame() {
         this.setCurrentPosition(PositionFactory.createInitial(false));
         MoveHistory.getInstance().reset();
         this.whiteToMove= true;
         this.go= true;
      }

      public synchronized void whiteToMove() {
         this.whiteToMove= true;
      }

      public synchronized void blackToMove() {
         this.whiteToMove= false;
      }

      public synchronized boolean isWhiteToMove() {
         return this.whiteToMove;
      }

      public Rules getCurrentRules() {
         return this.currentRules;
      }

      public synchronized Position getCurrentPosition() {
         return this.currentPosition;
      }

      public synchronized void setCurrentPosition(
            Position position) {
         this.currentPosition= position;
         if (position != null) {
            this.currentPosition= position.getImmutable();
            if (this.whiteToMove) {
               this.debugInfo.postPossibleMoves(this.currentPosition.getWhite()
                     .getPossibleMoves());
            } else {
               this.debugInfo.postPossibleMoves(this.currentPosition.getBlack()
                     .getPossibleMoves());
            }
         }
      }

      public synchronized Move makeMove(
            long fromSquare,
            long toSquare) {
         return this.makeMove(
               fromSquare,
               toSquare,
               ChessEngine.this.strategy.getPromotionPiece());
      }

      public synchronized void setPositionFromFEN(
            String FENString) {
         Tuple<Position, Boolean> tuple= PositionFactory.createPositionFromFEN(false, FENString);
         if(tuple.b.booleanValue()) {
            this.whiteToMove();
         } else {
            this.blackToMove();
         }
         this.setCurrentPosition(tuple.a);
      }

      public synchronized Move makeMove(
            long fromSquare,
            long toSquare,
            int promotionPiece) {
         this.objectCreationStatistics
               .post("ChessEngine.ProtocolImpl.makeMove(...)");
         this.objectCreationStatistics
               .post(ObjectCreationStatistics.ResetObjectCreationStats);
         Move move= new Move(
               this.getCurrentPosition(),
               fromSquare,
               toSquare,
               promotionPiece);
         MoveHistory.getInstance().add(
               move);
         this.whiteToMove= !this.whiteToMove;
         this.setCurrentPosition(move.toPosition);
         this.objectCreationStatistics
               .post(ObjectCreationStatistics.PrintObjectCreationStats);
         return move;
      }

      public synchronized Move makeNextMove() {
         this.objectCreationStatistics
               .post("ChessEngine.ProtocolImpl.makeNextMove()");
         this.objectCreationStatistics
               .post(ObjectCreationStatistics.ResetObjectCreationStats);
         Position.Move nextMove= ChessEngine.this.strategy.getNextMove(
               this.getCurrentPosition(),
               this.whiteToMove);
         Move move= null;
         if (nextMove != null) {
            move= new Move(
                  this.getCurrentPosition(),
                  nextMove.from,
                  nextMove.to,
                  ChessEngine.this.strategy.getPromotionPiece());
            MoveHistory.getInstance().add(
                  move);
            this.whiteToMove= !this.whiteToMove;
            this.setCurrentPosition(move.toPosition);
         }
         this.objectCreationStatistics
               .post(ObjectCreationStatistics.PrintObjectCreationStats);
         return move;
      }

      public synchronized boolean isGo() {
         return this.go;
      }

      public synchronized boolean setGo(
            boolean go) {
         return this.go= go;
      }

      public synchronized Strategy getStrategy() {
         return ChessEngine.this.strategy;
      }

      public synchronized void postThinking(
            boolean observeIt) {
         if (observeIt) {
            ChessEngine.this.strategy.getSearch().getThinking().addObserver(
                  new Observer() {
                     public void update(
                           Observable o,
                           Object arg) {
                        if (arg instanceof String) {
                           this.updateText((String) arg);
                        }
                     }

                     private void updateText(
                           String text) {
                        ChessEngine.this.outMessages.add(text);
                     }
                  });
         } else {
            ChessEngine.this.strategy.getSearch().getThinking()
                  .deleteObservers();
         }
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
               if (reply != null
                     && reply.length() > 0) {
                  ChessEngine.this.outMessages.add(reply);
                  this.setChanged();
                  this.notifyObservers(reply);
               }
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
         }
         //XXX: Doesn't work properly just yet...
         ChessEngine.this.getProtocol().getObjectCreationStatistics().post(
               ObjectCreationStatistics.PrintObjectCreationSinceVMStartStats);

      }
   }

   private class InStreamHandler implements Runnable {
      public void run() {
         BufferedReader inReader= new BufferedReader(
               new InputStreamReader(
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

   public class DebugInfo extends Observable {

      public void postPossibleMoves(
            List<Position.Move> moves) {
         this.setChanged();
         this.notifyObservers(moves.size()
               + " possible moves for "
               + (ChessEngine.this.protocol.isWhiteToMove() ? "white: "
                     : "black: ")
               + moves.toString());
      }

      public void postText(
            String text) {
         this.setChanged();
         this.notifyObservers(text);
      }

   }
}