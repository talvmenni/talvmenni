package org.forritan.talvmenni.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;

import org.forritan.talvmenni.ui.ConsoleProtocol;
import org.forritan.talvmenni.ui.DebugWindow;
import org.forritan.talvmenni.ui.UciProtocol;
import org.forritan.talvmenni.ui.UiProtocol;
import org.forritan.talvmenni.ui.XboardProtocol;


public class ChessEngine implements Runnable {

   private boolean             running;

   private Protocol            protocol;

   private ThreadFactory       threadFactory;

   private LinkedBlockingQueue inMessages;

   private LinkedBlockingQueue outMessages;

   public static ChessEngine create() {
      ChessEngine engine= new ChessEngine();

      if (TalvMenni.DEBUG_WINDOW) {
         //TODO: !!!! Skal flytast / gerast asynkront / órogvar i/o við WinBoard
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

      if (TalvMenni.CROUCHING_TIGER_HIDDEN_DEBUG) {
         System.err.println("DEBUG: ChessEngine()");
      }

      this.running= false;
      this.protocol= new ProtocolImpl();
      this.threadFactory= Executors.defaultThreadFactory();
      this.inMessages= new LinkedBlockingQueue();
      this.outMessages= new LinkedBlockingQueue();
   }

   public boolean isRunning() {
      return this.running;
   }

   public void setRunning(
         boolean running) {
      this.running= running;
   }

   public void run() {
      if (TalvMenni.CROUCHING_TIGER_HIDDEN_DEBUG) {
         System.err.println("DEBUG: ChessEngine.run()");
      }

      this.running= true;
      this.threadFactory.newThread(
            new ProtocolHandler()).start();
      this.threadFactory.newThread(
            new InStreamHandler()).start();
      this.threadFactory.newThread(
            new OutStreamHandler()).start();
   }

   public interface Protocol {
      public String processInput(
            String input);

      public void stop();
   }

   private class ProtocolImpl implements Protocol {

      private UiProtocol uiProtocol;

      public String processInput(
            String theInput) {

         if (TalvMenni.CROUCHING_TIGER_HIDDEN_DEBUG) {
            System.err.println("DEBUG: ChessEngine.Protocol.processInput( = "
                  + theInput
                  + " )");
         }

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
         ChessEngine.this.setRunning(false);
      }

   }

   private class ProtocolHandler implements Runnable {

      public void run() {

         if (TalvMenni.CROUCHING_TIGER_HIDDEN_DEBUG) {
            System.err.println("DEBUG: ChessEngine.ProtocolHandler.run()");
         }

         while (ChessEngine.this.isRunning()) {

            if (TalvMenni.CROUCHING_TIGER_HIDDEN_DEBUG) {
               System.err
                     .println("DEBUG: ChessEngine.ProtocolHandler.run() - start loop");
            }

            try {
               String reply= ChessEngine.this.protocol
                     .processInput((String) ChessEngine.this.inMessages.take());

               if (reply != null) {
                  if (TalvMenni.DEBUG_WINDOW) {
                     DebugWindow.updateTekst("ToUI: "
                           + reply);
                  }

                  ChessEngine.this.outMessages.add(reply);
               }
            } catch (InterruptedException e) {
               e.printStackTrace();
            }

            if (TalvMenni.CROUCHING_TIGER_HIDDEN_DEBUG) {
               System.err
                     .println("DEBUG: ChessEngine.ProtocolHandler.run() - end loop");
            }

         }

         if (TalvMenni.CROUCHING_TIGER_HIDDEN_DEBUG) {
            System.err
                  .println("DEBUG: ChessEngine.ProtocolHandler.run() - thread terminates");
         }

      }

   }

   private class InStreamHandler implements Runnable {

      public void run() {

         if (TalvMenni.CROUCHING_TIGER_HIDDEN_DEBUG) {
            System.err.println("DEBUG: ChessEngine.InStreamHandler.run()");
         }

         BufferedReader inReader= new BufferedReader(
               new InputStreamReader(
                     System.in));

         String inputMessage= "";

         while (ChessEngine.this.isRunning()) {

            if (TalvMenni.CROUCHING_TIGER_HIDDEN_DEBUG) {
               System.err
                     .println("DEBUG: ChessEngine.InStreamHandler.run() - start loop");
            }

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

            if (TalvMenni.CROUCHING_TIGER_HIDDEN_DEBUG) {
               System.err
                     .println("DEBUG: ChessEngine.InStreamHandler.run() - end loop");
            }

         }

         if (TalvMenni.CROUCHING_TIGER_HIDDEN_DEBUG) {
            System.err
                  .println("DEBUG: ChessEngine.InStreamHandler.run() - thread terminates");
         }

      }
   }

   private class OutStreamHandler implements Runnable {

      public void run() {

         if (TalvMenni.CROUCHING_TIGER_HIDDEN_DEBUG) {
            System.err.println("DEBUG: ChessEngine.OutStreamHandler.run()");
         }

         while (ChessEngine.this.isRunning()) {

            if (TalvMenni.CROUCHING_TIGER_HIDDEN_DEBUG) {
               System.err
                     .println("DEBUG: ChessEngine.OutStreamHandler.run() - start loop");
            }

            try {
               System.out.println((String) ChessEngine.this.outMessages.take());
            } catch (InterruptedException e) {
               e.printStackTrace();
            }

            if (TalvMenni.CROUCHING_TIGER_HIDDEN_DEBUG) {
               System.err
                     .println("DEBUG: ChessEngine.OutStreamHandler.run() - end loop");
            }

         }

         if (TalvMenni.CROUCHING_TIGER_HIDDEN_DEBUG) {
            System.err
                  .println("DEBUG: ChessEngine.OutStreamHandler.run() - thread terminates");
         }

      }

   }
}