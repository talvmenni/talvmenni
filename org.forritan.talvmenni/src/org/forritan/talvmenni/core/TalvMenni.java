package org.forritan.talvmenni.core;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import org.forritan.talvmenni.strategy.AlphaBetaSearchSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy;
import org.forritan.talvmenni.ui.DebugWindow;
import org.forritan.util.debug.ExceptionLoggingWindowHandler;
import org.forritan.util.debug.ObjectStatisticsWindow;


public class TalvMenni {

   public final static String NAME         = "Talvmenni";
   public final static String VERSION      = "0.0.1";

   public static String       DEBUG_NAME;

   /**
    * Default PLY = 4 
    * Minimum for being able to detect that we are getting checkmated...
    */
   public static int          PLY = 4;                   

   /**
    * Default MAX_TRANSPOSITION_ENTRIES = 100000
    * Maximum number of entries in each of the transposition tables (currently 
    * white and black). If MAX_TRANSPOSITION_ENTRIES is reached the eldest
    * entry will be removed before a new entry is added.
    */
   public static int          MAX_TRANSPOSITION_ENTRIES = 100000;
   
   public static void main(
         String args[]) {

      ThreadFactory threadFactory= Executors.defaultThreadFactory();

      DEBUG_NAME= System.getProperty("debug_name");
      if (DEBUG_NAME == null) {
         DEBUG_NAME= "AlphaBeta";
      }

      String searchDepth= System.getProperty("ply");
      if (searchDepth != null) {
         PLY= Integer.valueOf(
               searchDepth).intValue();
      }

      String MaxTranpositionEntries= System.getProperty("MaxTranpositionEntries");
      if (MaxTranpositionEntries != null) {
         MAX_TRANSPOSITION_ENTRIES= Integer.valueOf(
               MaxTranpositionEntries).intValue();
      }

      final ChessEngine chessEngine= ChessEngine
            .create(
                  new AlphaBetaSearchSimpleMaterialAndPositionalEvaluationChooseRandomlyBetweenBestMovesStrategy(
                  PLY));
                  //,new Transposition(MAX_TRANSPOSITION_ENTRIES)));

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