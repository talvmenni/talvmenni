package org.forritan.talvmenni.core;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import org.forritan.talvmenni.game.IterativeDeepeningAlphaBetaSearchSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy;
import org.forritan.talvmenni.ui.DebugWindow;
import org.forritan.util.debug.ExceptionLoggingWindowHandler;
import org.forritan.util.debug.ObjectStatisticsWindow;


public class TalvMenni {

   public final static String NAME         = "Talvmenni";
   public final static String VERSION      = "0.1";

   public static String       DEBUG_NAME;

   public static int          SEARCH_DEPTH = 2;          // Minimum for being
                                                         // able to detect that
                                                         // we are getting
                                                         // checkmated...

   public static void main(
         String args[]) {

      ThreadFactory threadFactory= Executors.defaultThreadFactory();

      DEBUG_NAME= System.getProperty("debug_name");
      if (DEBUG_NAME == null) {
         DEBUG_NAME= "";
      }

      String searchDepth= System.getProperty("search_depth");
      if (searchDepth != null) {
         SEARCH_DEPTH= Integer.valueOf(
               searchDepth).intValue();
      }

      final ChessEngine chessEngine= ChessEngine
            .create(new IterativeDeepeningAlphaBetaSearchSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy(
                  SEARCH_DEPTH));

      if (Boolean.getBoolean("exception_logging_window")) {
         Thread windowThread= threadFactory.newThread(new Runnable() {
            public void run() {
               Thread.setDefaultUncaughtExceptionHandler(
                     ExceptionLoggingWindowHandler.getInstance());
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


      chessEngine.run();
   }
}