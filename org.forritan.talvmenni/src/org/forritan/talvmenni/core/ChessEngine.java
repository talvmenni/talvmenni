package org.forritan.talvmenni.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.StringTokenizer;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;

import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.Squares;
import org.forritan.talvmenni.bitboard.paths.BlackPawnMoves;
import org.forritan.talvmenni.bitboard.paths.WhitePawnMoves;
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
import org.forritan.util.debug.ObjectCreationStatistics;


public class ChessEngine extends Observable implements Runnable {
   
   private Strategy            strategy;
   private boolean             running;
   private Protocol            protocol;
   private ThreadFactory       threadFactory;
   private LinkedBlockingQueue<String> inMessages;
   private LinkedBlockingQueue<String> outMessages;
   private ProtocolHandler protocolHandler;
   
   public static ChessEngine create(Strategy strategy) {
      return new ChessEngine(strategy);
   }

   private ChessEngine(Strategy strategy) {
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
      this.threadFactory.newThread(this.protocolHandler).start();
      this.threadFactory.newThread(new InStreamHandler()).start();
      this.threadFactory.newThread(new OutStreamHandler()).start();
   }

   public synchronized Protocol getProtocol() {
      return this.protocol;
   }
  
   public synchronized void addObserver(Observer observer) {
      this.protocolHandler.addObserver(observer);
      this.protocol.getDebugInfo().addObserver(observer);
      this.strategy.getSearch().getDebugInfo().addObserver(observer);
      this.strategy.getSearch().getThinking().addObserver(observer);
   }
   
   public interface Protocol {
      public String processInput(String input);
      public boolean isGo();
      public boolean setGo(boolean go);
      public void newGame();
      public void stop();
      public void postThinking(boolean observeIt);
      public void whiteToMove();
      public void blackToMove();
      public boolean isWhiteToMove();
      public Position getCurrentPosition();
      public void setCurrentPosition(Position position);
      public void setPositionFromFEN(String FENString);      
      public Rules getCurrentRules();
      public Move makeMove(long fromSquare, long toSquare);
      public Move makeMove(long fromSquare, long toSquare, int promotionPiece);
      public Move makeNextMove();
      public Strategy getStrategy();
      public ObjectCreationStatistics getObjectCreationStatistics();
      public DebugInfo getDebugInfo();
   }

   private class ProtocolImpl implements Protocol {
      
      private ObjectCreationStatistics objectCreationStatistics;
      private DebugInfo debugInfo;
      private UiProtocol uiProtocol;
      private Position   currentPosition;
      private Rules      currentRules;
      private boolean    go = false;
      private boolean    WhiteToMove = true;
      
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

      public synchronized String processInput(String theInput) {
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
         this.setCurrentPosition(PositionFactory.createInitialImmutable());
         MoveHistory.getInstance().reset();
         this.WhiteToMove = true;
         this.go= true;
      }
      
      
      public synchronized void whiteToMove() {
         this.WhiteToMove= true;
      }

      public synchronized void blackToMove() {
         this.WhiteToMove= false;
      }

      public synchronized boolean isWhiteToMove() {
         return this.WhiteToMove;
      }

      public Rules getCurrentRules() {
         return this.currentRules;
      }

      public synchronized Position getCurrentPosition() {
         return this.currentPosition;
      }

      public synchronized void setCurrentPosition(Position position) {
         this.currentPosition= position;
         if(position != null) {
            this.currentPosition= position.getImmutable();
            if(this.WhiteToMove) {
               this.debugInfo.postPossibleMoves(this.currentPosition.getWhite().getPossibleMoves());
            } else {
               this.debugInfo.postPossibleMoves(this.currentPosition.getBlack().getPossibleMoves());
            }
         }
      }
      
      public synchronized Move makeMove(long fromSquare, long toSquare) {
         return this.makeMove(fromSquare, toSquare, ChessEngine.this.strategy.getPromotionPiece());
      }
      
      public synchronized void setPositionFromFEN(String FENString)
      {
         long whiteKings = Square._EMPTY_BOARD;
         long whiteQueens= Square._EMPTY_BOARD; 
         long whiteRooks = Square._EMPTY_BOARD;
         long whiteBishops = Square._EMPTY_BOARD;
         long whiteKnights = Square._EMPTY_BOARD;
         long whitePawns = Square._EMPTY_BOARD;
         long whiteCastling = Square._EMPTY_BOARD;
         long whiteEnpassant = Square._EMPTY_BOARD;
         long blackKings = Square._EMPTY_BOARD;
         long blackQueens = Square._EMPTY_BOARD;
         long blackRooks = Square._EMPTY_BOARD;
         long blackBishops = Square._EMPTY_BOARD;
         long blackKnights = Square._EMPTY_BOARD;
         long blackPawns = Square._EMPTY_BOARD;
         long blackCastling = Square._EMPTY_BOARD;
         long blackEnpassant = Square._EMPTY_BOARD;
         
         Square square2= Squares.create();
         long sq;

         StringTokenizer st = new StringTokenizer(FENString);
        
         String positionString = st.nextToken();
         
         this.debugInfo.postText(positionString);

         int y = 0;
         int x = 0;      
         
         for (int pos = 0; pos < positionString.length(); pos++) {
             char activeChar = positionString.charAt(pos);
             
             if (activeChar == '/') {
                 y++;
                 x = 0;
             } else if (Character.isDigit(activeChar)) {
                 x += Integer.parseInt("" + activeChar);
             } else {
                 int square = y * 8 + x;
                 sq= square2.getSquare(square);
                                  
                 if (activeChar=='r') {
                    blackRooks |= sq;
                 } else if (activeChar=='R') {
                    whiteRooks |= sq;
                 } else if (activeChar=='b') {
                    blackBishops |= sq;
                 } else if (activeChar=='B') {
                    whiteBishops |= sq;
                 } else if (activeChar=='q') {
                    blackQueens |= sq;
                 } else if (activeChar=='Q') {
                    whiteQueens |= sq;
                 } else if (activeChar=='k') {
                    blackKings |= sq;
                 } else if (activeChar=='K') {
                    whiteKings |= sq;
                 } else if (activeChar=='n') {
                    blackKnights |= sq;
                 } else if (activeChar=='N') {
                    whiteKnights |= sq;
                 } else if (activeChar=='p') {
                    blackPawns |= sq;
                 } else if (activeChar=='P') {
                    whitePawns |= sq;
                 }
                 
                 x++;
             }           
         }         

         if (st.hasMoreTokens()) {
            if (st.nextToken().equals("w")) 
               this.whiteToMove();
            else
               this.blackToMove();               
        } else {
           this.whiteToMove();
        }
         
         if (st.hasMoreTokens()) {
            String castlingString = st.nextToken();
            
            for (int pos = 0; pos < castlingString.length(); pos++) {
               char activeChar = castlingString.charAt(pos);
               if (activeChar == 'K') {
                  whiteCastling |= Square._E1;
                  whiteCastling |= Square._H1;
               }
               if (activeChar == 'Q') {
                  whiteCastling |= Square._E1;
                  whiteCastling |= Square._A1;
               }
               if (activeChar == 'k') {
                  blackCastling |= Square._E8;
                  blackCastling |= Square._H8;
               }
               if (activeChar == 'q') {
                  blackCastling |= Square._E8;
                  blackCastling |= Square._A8;
               }
            }
        }
         
         if (st.hasMoreTokens()) {
            String targetSquareStr= st.nextToken().toUpperCase();
            if (targetSquareStr != "-")
            {
               long targetSquare= Squares.create().getSquare(targetSquareStr);
               if (isWhiteToMove()) {
                     if((blackPawns & (targetSquare >> 8)) != Square._EMPTY_BOARD) {
                        blackEnpassant=
                           BlackPawnMoves.create().getPathsFrom(
                                 (targetSquare << 8));
                     }
               } else {
                  if((whitePawns & (targetSquare << 8)) != Square._EMPTY_BOARD) {
                     whiteEnpassant=
                        WhitePawnMoves.create().getPathsFrom(
                              (targetSquare >> 8));
                  }
               }
            }
         }
 
         Position fenPosition = PositionFactory.createImmutable(
               whiteKings,
               whiteQueens,
               whiteRooks,
               whiteBishops,
               whiteKnights,
               whitePawns,
               whiteCastling,
               whiteEnpassant,
               blackKings,
               blackQueens,
               blackRooks,
               blackBishops,
               blackKnights,
               blackPawns,
               blackCastling,
               blackEnpassant);
                  
         this.setCurrentPosition(fenPosition);
      }

         
      
      public synchronized Move makeMove(long fromSquare, long toSquare, int promotionPiece) {
         this.objectCreationStatistics.post("ChessEngine.ProtocolImpl.makeMove(...)");
         this.objectCreationStatistics.post(ObjectCreationStatistics.ResetObjectCreationStats);
         Move move= new Move(this.getCurrentPosition(), fromSquare, toSquare, promotionPiece);
         MoveHistory.getInstance().add(move);
         this.WhiteToMove= !this.WhiteToMove;
         this.setCurrentPosition(move.toPosition);
         this.objectCreationStatistics.post(ObjectCreationStatistics.PrintObjectCreationStats);
         return move;
      }
      
      public synchronized Move makeNextMove() {
         this.objectCreationStatistics.post("ChessEngine.ProtocolImpl.makeNextMove()");
         this.objectCreationStatistics.post(ObjectCreationStatistics.ResetObjectCreationStats);
         Position.Move nextMove= ChessEngine.this.strategy.getNextMove(this.getCurrentPosition(), this.WhiteToMove);
         Move move= null;
         if(nextMove != null) {
            move= new Move(this.getCurrentPosition(), nextMove.from, nextMove.to, ChessEngine.this.strategy.getPromotionPiece());
            MoveHistory.getInstance().add(move);
            this.WhiteToMove= !this.WhiteToMove;
            this.setCurrentPosition(move.toPosition);
         }
         this.objectCreationStatistics.post(ObjectCreationStatistics.PrintObjectCreationStats);
         return move;
      }


      public synchronized boolean isGo() {
         return this.go;
      }

      public synchronized boolean setGo(boolean go) {
         return this.go= go;
      }

      public synchronized Strategy getStrategy() {
         return ChessEngine.this.strategy;
      }

      public synchronized void postThinking(
            boolean observeIt) {
         if(observeIt) {
            ChessEngine.this.strategy.getSearch().getThinking().addObserver(new Observer() {
               public void update(
                     Observable o,
                     Object arg) {
                  if(arg instanceof String) {
                     this.updateText((String)arg);
                  }
               }
               private void updateText(
                     String text) {
                  ChessEngine.this.outMessages.add(text);                  
               }
            });
         } else {
            ChessEngine.this.strategy.getSearch().getThinking().deleteObservers();
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
               if (reply != null && reply.length() > 0) {
                  ChessEngine.this.outMessages.add(reply);
                  this.setChanged();
                  this.notifyObservers(reply);
               }
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
         }
         //XXX: Doesn't work properly just yet...
         ChessEngine
         .this
         .getProtocol()
         .getObjectCreationStatistics()
         .post(
               ObjectCreationStatistics.PrintObjectCreationSinceVMStartStats);

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
   
   public class DebugInfo extends Observable {
      
      public void postPossibleMoves(List<Position.Move> moves) {
         this.setChanged();
         this.notifyObservers(
               moves.size() 
               + " possible moves for "
               + (ChessEngine.this.protocol.isWhiteToMove() ? "white: " : "black: ") 
               + moves.toString());
      }
      
      public void postText(String text) {
         this.setChanged();
         this.notifyObservers(text);
      }

   }
}