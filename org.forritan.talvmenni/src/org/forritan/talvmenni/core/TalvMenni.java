package org.forritan.talvmenni.core;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import org.forritan.talvmenni.game.FullSearchSimpleMaterialEvaluationChooseRandomlyBetweenBestMovesStrategy;
import org.forritan.talvmenni.ui.DebugWindow;


public class TalvMenni {

   public final static String NAME    = "Talvmenni";
   public final static String VERSION = "0.1";

   public static String       DEBUG_NAME;
   
   public static int SEARCH_DEPTH= 4; // Minimum for being able to detect that we are getting checkmated... 

   public static void main(
         String args[]) {
      ThreadFactory threadFactory= Executors.defaultThreadFactory();

      DEBUG_NAME= System.getProperty("debug_name");
      if(DEBUG_NAME == null) {
         DEBUG_NAME= "";
      }
      
      String searchDepth= System.getProperty("search_depth");
      if(searchDepth != null) {
         SEARCH_DEPTH= Integer.valueOf(searchDepth).intValue();
      }
      
      final ChessEngine chessEngine=
         ChessEngine.create(new FullSearchSimpleMaterialEvaluationChooseRandomlyBetweenBestMovesStrategy(SEARCH_DEPTH));

      if (Boolean.getBoolean("debug_window")) {
         Thread debugWindowThread= threadFactory.newThread(new Runnable() {
            public void run() {
               DebugWindow debugWindow= new DebugWindow(TalvMenni.NAME + " | " + TalvMenni.DEBUG_NAME);
               chessEngine.addObserver(debugWindow);
            }
         });
         debugWindowThread.start();
      }

      chessEngine.run();
   }
}