package org.forritan.talvmenni;

import java.io.IOException;

import org.forritan.talvmenni.knowledge.TheoryBook;
import org.forritan.talvmenni.knowledge.Transposition;
import org.forritan.talvmenni.search.PrincipalVariation;
import org.forritan.talvmenni.strategy.IterativeDeepeningAlphaBetaWithTranspositionTableStrategy;
import org.forritan.talvmenni.strategy.IterativeDeepeningMTDfWithTranspositionTableStrategy;
import org.forritan.talvmenni.ui.DebugWindow;

import edu.emory.mathcs.util.concurrent.PlainThreadFactory;
import edu.emory.mathcs.util.concurrent.ThreadFactory;


public class TalvMenni {

   public final static String        NAME                      = "Talvmenni";
   public final static String        VERSION                   = "0.0.1";

   public static String              DEBUG_NAME;

   /**
    * Default PLY = 4 Minimum for being able to detect that we are getting
    * checkmated...
    */
   public static int                 PLY                       = 4;

   /**
    * Default MAX_TRANSPOSITION_ENTRIES - Maximum number of entries in each of
    * the transposition tables (currently white and black). If
    * MAX_TRANSPOSITION_ENTRIES is reached the eldest entry will be removed
    * before a new entry is added.
    */
   public static int                 MAX_TRANSPOSITION_ENTRIES = 150000;

   /**
    * Very experimental :) Partition search - e.g.: Entries in transposition
    * will evaluate as equal if the pieces - excluding pawns - are equal...
    */
   public static final boolean       PARTITION_SEARCH          = false;

   private static PlainThreadFactory threadFactory;

   public synchronized static ThreadFactory getThreadFactory() {
      if (TalvMenni.threadFactory == null) {
         TalvMenni.threadFactory= new PlainThreadFactory();
      }
      return TalvMenni.threadFactory;
   }

   public static void main(
         String args[]) {

      ThreadFactory threadFactory= TalvMenni.getThreadFactory();

      String searchDepth= System.getProperty("ply");
      if (searchDepth != null) {
         PLY= Integer.valueOf(
               searchDepth).intValue();
      }

      DEBUG_NAME= System.getProperty("debug_name");
      if (DEBUG_NAME == null) {
         DEBUG_NAME= "";
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

            // Choose strategy

            //      .create(new
            // RandomMoveStrategy(PrincipalVariation.Factory.create(0)));

            //            .create(new SimpleOneLevelAlphaBetaParallelStrategy(
            //                  PLY,
            //                  book,
            //                  PrincipalVariation.Factory.create(PLY - 1)));

            //            .create(new IterativeDeepeningMTDfWithTranspositionTableStrategy(
            //                  PLY,
            //                  new Transposition(
            //                        MAX_TRANSPOSITION_ENTRIES),
            //                  true,
            //                  book,
            //                  PrincipalVariation.Factory.create(PLY)));

            .create(new IterativeDeepeningAlphaBetaWithTranspositionTableStrategy(
                  PLY,
                  new Transposition(
                        MAX_TRANSPOSITION_ENTRIES),
                  true,
                  book,
                  PrincipalVariation.Factory.create(PLY)));

      //            .create(new IterativeDeepeningAndReductionAlphaBetaStrategy(
      //                  PLY,
      //                  3,
      //                  book));

      //            .create(new IterativeDeepeningAlphaBetaStrategy(
      //                  PLY,
      //                  book,
      //                  PrincipalVariation.Factory.create(PLY)));

      //            .create(new MTDfStrategy(
      //                  PLY,
      //                  new Transposition(
      //                        MAX_TRANSPOSITION_ENTRIES),
      //                  true,
      //                  book,
      //                  PrincipalVariation.Factory.create(PLY)));

      //            .create(new AlphaBetaWithTranspositionTableStrategy(
      //                  PLY,
      //                  new Transposition(
      //                        MAX_TRANSPOSITION_ENTRIES),
      //                  true,
      //                  book,
      //                  PrincipalVariation.Factory.create(PLY)));

      //                  .create(new AlphaBetaStrategy(
      //                        PLY,
      //                        book,
      //    PrincipalVariation.Factory.create(PLY)));

      //            .create(new NegaMaxStrategy(
      //                  PLY,
      //                  book,
      //                  PrincipalVariation.Factory.create(PLY)));

      //      if (Boolean.getBoolean("exception_logging_window")) {
      //         Thread windowThread= threadFactory.newThread(new Runnable() {
      //            public void run() {
      //               Thread
      //                     .setDefaultUncaughtExceptionHandler(ExceptionLoggingWindowHandler
      //                           .getInstance());
      //            }
      //         });
      //         windowThread.start();
      //      }

      //      if (Boolean.getBoolean("object_statisics_window")) {
      //         Thread windowThread= threadFactory.newThread(new Runnable() {
      //            public void run() {
      //               ObjectStatisticsWindow window= new ObjectStatisticsWindow(
      //                     TalvMenni.NAME
      //                           + " | "
      //                           + TalvMenni.DEBUG_NAME
      //                           + " | Object creations statistics");
      //               chessEngine.getProtocol().getObjectCreationStatistics()
      //                     .addObserver(
      //                           window);
      //            }
      //         });
      //         windowThread.start();
      //      }

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