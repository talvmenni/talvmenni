package org.forritan.talvmenni.core;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.game.Transposition;
import org.forritan.talvmenni.strategy.AlphaBetaWithTranspositionTableStrategy;
import org.forritan.talvmenni.ui.DebugWindow;
import org.forritan.util.debug.ExceptionLoggingWindowHandler;
import org.forritan.util.debug.ObjectStatisticsWindow;


public class TalvMenni {

   public final static String NAME                      = "Talvmenni";
   public final static String VERSION                   = "0.0.1";

   public static String       DEBUG_NAME;

   /**
    * Default PLY = 4 Minimum for being able to detect that we are getting
    * checkmated...
    */
   public static int          PLY                       = 4;

   /**
    * Default MAX_TRANSPOSITION_ENTRIES = 100000 Maximum number of entries in
    * each of the transposition tables (currently white and black). If
    * MAX_TRANSPOSITION_ENTRIES is reached the eldest entry will be removed
    * before a new entry is added.
    */
   public static int          MAX_TRANSPOSITION_ENTRIES = 100000;

   public static void main(
         String args[]) {

      ThreadFactory threadFactory= Executors.defaultThreadFactory();

      String searchDepth= System.getProperty("ply");
      if (searchDepth != null) {
         PLY= Integer.valueOf(
               searchDepth).intValue();
      }

      DEBUG_NAME= System.getProperty("debug_name");
      if (DEBUG_NAME == null) {
         DEBUG_NAME= "NewAlphaBeta ["
               + PLY
               + " ply]";
      }

      String MaxTranpositionEntries= System
            .getProperty("MaxTranpositionEntries");
      if (MaxTranpositionEntries != null) {
         MAX_TRANSPOSITION_ENTRIES= Integer.valueOf(
               MaxTranpositionEntries).intValue();
      }

      final TheoryBook book= new TheoryBook(
            140000);

      final ChessEngine chessEngine= ChessEngine
            .create(new AlphaBetaWithTranspositionTableStrategy(
                  PLY,
                  new Transposition(
                        MAX_TRANSPOSITION_ENTRIES),
                  book));
      //      .create(new AlphaBetaStrategy(
      //            PLY,
      //            book));
      //      .create(new
      // MiniMaxSearchSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy(
      //            PLY,
      //            book));
      //      .create(new MiniMaxOpeningBookWithDelayStrategy(
      //            PLY,
      //            new Transposition(MAX_TRANSPOSITION_ENTRIES),
      //            book,
      //            2000,
      //            4200));

      if (Boolean.getBoolean("exception_logging_window")) {
         Thread windowThread= threadFactory.newThread(new Runnable() {
            public void run() {
               Thread
                     .setDefaultUncaughtExceptionHandler(ExceptionLoggingWindowHandler
                           .getInstance());
            }
         });
         windowThread.start();
      }

      if (Boolean.getBoolean("object_statisics_window")) {
         Thread windowThread= threadFactory.newThread(new Runnable() {
            public void run() {
               ObjectStatisticsWindow window= new ObjectStatisticsWindow(
                     TalvMenni.NAME
                           + " | "
                           + TalvMenni.DEBUG_NAME
                           + " | Object creations statistics");
               chessEngine.getProtocol().getObjectCreationStatistics()
                     .addObserver(
                           window);
            }
         });
         windowThread.start();
      }

      if (Boolean.getBoolean("debug_window")) {
         Thread windowThread= threadFactory.newThread(new Runnable() {
            public void run() {
               DebugWindow window= new DebugWindow(
                     TalvMenni.NAME
                           + " | "
                           + TalvMenni.DEBUG_NAME);
               chessEngine.addObserver(window);
            }
         });
         windowThread.start();
      }

      if (System.getProperty("opening_book") != null) {

         Thread loadBookThread= threadFactory.newThread(new Runnable() {
            public void run() {
               try {
                  chessEngine.getProtocol().getDebugInfo().postText(
                        "Loading openingbook: "
                              + System.getProperty("opening_book")
                              + "...");
                  book.loadBook(System.getProperty("opening_book"));
                  chessEngine.getProtocol().getDebugInfo().postText(
                        "Finnished loading openingbook...");
               } catch (IOException e) {
               }
            }
         });
         loadBookThread.start();
      }

      chessEngine.run();
   }
}