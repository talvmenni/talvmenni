package org.forritan.talvmenni.core;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import org.forritan.talvmenni.game.FullSearchSimpleMaterialEvaluationChooseRandomlyBetweenBestMovesStrategy;
import org.forritan.talvmenni.ui.DebugWindow;


public class TalvMenni {

   public final static String NAME    = "Talvmenni";
   public final static String VERSION = "0.1";

   public static boolean      TELLUSER_ALL_INPUT;
   public static String       DEBUG_NAME;

   public static void main(
         String args[]) {
      ThreadFactory threadFactory= Executors.defaultThreadFactory();

      TELLUSER_ALL_INPUT= Boolean
            .getBoolean("org.forritan.talvmenni.telluser_all_input");
      DEBUG_NAME= System.getProperty("org.forritan.talvmenni.debug_name");
      if(DEBUG_NAME == null) {
         DEBUG_NAME= "";
      }

      final ChessEngine chessEngine=
         ChessEngine.create(new FullSearchSimpleMaterialEvaluationChooseRandomlyBetweenBestMovesStrategy(3));

      if (Boolean.getBoolean("org.forritan.talvmenni.debug_window")) {
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