package org.forritan.talvmenni;

import java.io.IOException;

import org.forritan.talvmenni.knowledge.TheoryBook;
import org.forritan.talvmenni.knowledge.Transposition;
import org.forritan.talvmenni.search.PrincipalVariation;
import org.forritan.talvmenni.strategy.AlphaBetaStrategy;
import org.forritan.talvmenni.strategy.AlphaBetaWithTranspositionTableStrategy;
import org.forritan.talvmenni.strategy.IterativeDeepeningAlphaBetaStrategy;
import org.forritan.talvmenni.strategy.IterativeDeepeningAlphaBetaWithQuiescentAndNullMoveAndTranspositionTableStrategy;
import org.forritan.talvmenni.strategy.IterativeDeepeningAlphaBetaWithQuiescentAndTranspositionTableStrategy;
import org.forritan.talvmenni.strategy.IterativeDeepeningAlphaBetaWithTranspositionTableStrategy;
import org.forritan.talvmenni.strategy.IterativeDeepeningMTDfWithTranspositionTableStrategy;
import org.forritan.talvmenni.strategy.MTDfStrategyWithTranspositionTable;
import org.forritan.talvmenni.strategy.NegaMaxStrategy;
import org.forritan.talvmenni.strategy.RandomMoveStrategy;
import org.forritan.talvmenni.strategy.SimpleOneLevelAlphaBetaParallelStrategy;
import org.forritan.talvmenni.strategy.Strategy;
import org.forritan.talvmenni.ui.DebugWindow;

import edu.emory.mathcs.util.concurrent.PlainThreadFactory;
import edu.emory.mathcs.util.concurrent.ThreadFactory;


public class TalvMenni {

   public final static String        NAME                          = "Talvmenni";
   public final static String        VERSION                       = "0.0.1";

   public static String              DEBUG_NAME;

   /**
    * Default 0 - Minimum time in milli seconds for moving. Should probably be
    * something 600 when playing as human player on FICS og ICC... ;-)
    */
   public static long                MINIMUM_MOVE_DELAY            = 0;

   /**
    * Default PLY = 4 Minimum for being able to detect that we are getting
    * checkmated...
    */
   public static int                 PLY                           = 4;

   /**
    * Default QUIESCENT_MAX_DEPTH = 16 - ply seems like a resonable value ;-)
    */
   public static int                 QUIESCENT_MAX_DEPTH           = 8 - PLY;

   /**
    * Default reduction of depth in NullMove search: NULL_MOVE_REDUCTION = 2
    */
   public static final int           NULL_MOVE_REDUCTION           = 2;

   /**
    * Default MAX_TRANSPOSITION_ENTRIES - Maximum number of entries in each of
    * the transposition tables (currently white and black). If
    * MAX_TRANSPOSITION_ENTRIES is reached the eldest entry will be removed
    * before a new entry is added.
    */
   public static int                 MAX_TRANSPOSITION_ENTRIES     = 50000;

   /**
    * Default MAX_HISTORY_HEURISTIC_ENTRIES - Maximum number of entries in the
    * history heuristic table. If MAX_HISTORY_HEURISTIC_ENTRIES is reached the
    * eldest entry will be removed before a new entry is added.
    */
   public static int                 MAX_HISTORY_HEURISTIC_ENTRIES = 500000;

   /**
    * Very experimental :) Partition search - e.g.: Entries in transposition
    * will evaluate as equal if the pieces - excluding pawns - are equal...
    */
   public static final boolean       PARTITION_SEARCH              = false;

   /**
    *  
    */
   public static int                 STRATEGY                      = ChoosenStrategy.ITERATIVE_DEEPENING_ALPHA_BETA_WITH_QUIESCENT_AND_TRANSPOSITION_TABLE;

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

      String strategyPropertyString= System.getProperty("strategy");
      if (strategyPropertyString != null) {
         if ("random".equalsIgnoreCase(strategyPropertyString)) {
            STRATEGY= ChoosenStrategy.RANDOM_MOVE;
         } else if ("nm".equalsIgnoreCase(strategyPropertyString)) {
            STRATEGY= ChoosenStrategy.NEGA_MAX;
         } else if ("ab".equalsIgnoreCase(strategyPropertyString)) {
            STRATEGY= ChoosenStrategy.ALPHA_BETA;
         } else if ("abtt".equalsIgnoreCase(strategyPropertyString)) {
            STRATEGY= ChoosenStrategy.ALPHA_BETA_WITH_TRANSPOSITION_TABLE;
         } else if ("idab".equalsIgnoreCase(strategyPropertyString)) {
            STRATEGY= ChoosenStrategy.ITERATIVE_DEEPENING_ALPHA_BETA;
         } else if ("idabtt".equalsIgnoreCase(strategyPropertyString)) {
            STRATEGY= ChoosenStrategy.ITERATIVE_DEEPENING_ALPHA_BETA_WITH_TRANSPOSITION_TABLE;
         } else if ("idabqtt".equalsIgnoreCase(strategyPropertyString)) {
            STRATEGY= ChoosenStrategy.ITERATIVE_DEEPENING_ALPHA_BETA_WITH_QUIESCENT_AND_TRANSPOSITION_TABLE;
         } else if ("idabqnmtt".equalsIgnoreCase(strategyPropertyString)) {
            STRATEGY= ChoosenStrategy.ITERATIVE_DEEPENING_ALPHA_BETA_WITH_QUIESCENT_AND_NULL_MOVE_AND_TRANSPOSITION_TABLE;
         } else if ("mtdf".equalsIgnoreCase(strategyPropertyString)) {
            STRATEGY= ChoosenStrategy.MTDF_WITH_TRANSPOSITION_TABLE;
         } else if ("idmtdf".equalsIgnoreCase(strategyPropertyString)) {
            STRATEGY= ChoosenStrategy.ITERATIVE_DEEPENING_MTDF_WITH_TRANSPOSITION_TABLE;
         }
      }

      String minimumMoveDelay= System.getProperty("minimumMoveDelay");
      if (minimumMoveDelay != null) {
         MINIMUM_MOVE_DELAY= Long.valueOf(
               minimumMoveDelay).intValue();
      }

      String searchDepth= System.getProperty("ply");
      if (searchDepth != null) {
         PLY= Integer.valueOf(
               searchDepth).intValue();
      }

      String quiescentMaxDepth= System.getProperty("quiescentMaxDepth");
      if (quiescentMaxDepth != null) {
         QUIESCENT_MAX_DEPTH= Integer.valueOf(
               quiescentMaxDepth).intValue();
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

      String MaxHistoryHeuristicEntries= System
            .getProperty("MaxHistoryHeuristicEntries");
      if (MaxHistoryHeuristicEntries != null) {
         MAX_HISTORY_HEURISTIC_ENTRIES= Integer.valueOf(
               MaxHistoryHeuristicEntries).intValue();
      }

      final TheoryBook book= new TheoryBook(
            140000);

      final ChessEngine chessEngine= ChessEngine.create(ChoosenStrategy.get(
            STRATEGY,
            book));

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

   public static class ChoosenStrategy {

      public static final int RANDOM_MOVE                                                                         = 0;

      public static final int NEGA_MAX                                                                            = 1;

      public static final int ALPHA_BETA                                                                          = 2;
      public static final int ALPHA_BETA_WITH_TRANSPOSITION_TABLE                                                 = 3;
      public static final int ITERATIVE_DEEPENING_ALPHA_BETA                                                      = 4;
      public static final int ITERATIVE_DEEPENING_ALPHA_BETA_WITH_TRANSPOSITION_TABLE                             = 5;
      public static final int ITERATIVE_DEEPENING_ALPHA_BETA_WITH_QUIESCENT_AND_TRANSPOSITION_TABLE               = 6;
      public static final int ITERATIVE_DEEPENING_ALPHA_BETA_WITH_QUIESCENT_AND_NULL_MOVE_AND_TRANSPOSITION_TABLE = 7;

      public static final int MTDF_WITH_TRANSPOSITION_TABLE                                                       = 8;
      public static final int ITERATIVE_DEEPENING_MTDF_WITH_TRANSPOSITION_TABLE                                   = 9;

      public static final int SIMPLE_ONE_LEVEL_ALPHA_BETA_PARALLEL                                                = 10;

      public static Strategy get(
            int choosenOne,
            TheoryBook book) {
         switch (choosenOne) {

            case ChoosenStrategy.RANDOM_MOVE:
               return new RandomMoveStrategy(
                     PrincipalVariation.Factory.create(0));

            case ChoosenStrategy.NEGA_MAX:
               new NegaMaxStrategy(
                     PLY,
                     book,
                     PrincipalVariation.Factory.create(PLY));

            case ChoosenStrategy.ALPHA_BETA:
               new AlphaBetaStrategy(
                     PLY,
                     book,
                     PrincipalVariation.Factory.create(PLY));

            case ChoosenStrategy.ALPHA_BETA_WITH_TRANSPOSITION_TABLE:
               new AlphaBetaWithTranspositionTableStrategy(
                     PLY,
                     new Transposition(),
                     false,
                     book,
                     PrincipalVariation.Factory.create(PLY));

            case ChoosenStrategy.ITERATIVE_DEEPENING_ALPHA_BETA:
               return new IterativeDeepeningAlphaBetaStrategy(
                     PLY,
                     book,
                     PrincipalVariation.Factory.create(PLY));

            case ChoosenStrategy.ITERATIVE_DEEPENING_ALPHA_BETA_WITH_TRANSPOSITION_TABLE:
               return new IterativeDeepeningAlphaBetaWithTranspositionTableStrategy(
                     PLY,
                     new Transposition(),
                     false,
                     book,
                     PrincipalVariation.Factory.create(PLY));

            case ChoosenStrategy.ITERATIVE_DEEPENING_ALPHA_BETA_WITH_QUIESCENT_AND_TRANSPOSITION_TABLE:
               new IterativeDeepeningAlphaBetaWithQuiescentAndTranspositionTableStrategy(
                     PLY,
                     new Transposition(),
                     false,
                     book,
                     PrincipalVariation.Factory.create(PLY),
                     QUIESCENT_MAX_DEPTH);

            case ChoosenStrategy.ITERATIVE_DEEPENING_ALPHA_BETA_WITH_QUIESCENT_AND_NULL_MOVE_AND_TRANSPOSITION_TABLE:
               new IterativeDeepeningAlphaBetaWithQuiescentAndNullMoveAndTranspositionTableStrategy(
                     PLY,
                     new Transposition(),
                     true,
                     book,
                     PrincipalVariation.Factory.create(PLY),
                     QUIESCENT_MAX_DEPTH);

            case ChoosenStrategy.MTDF_WITH_TRANSPOSITION_TABLE:
               return new MTDfStrategyWithTranspositionTable(
                     PLY,
                     new Transposition(),
                     false,
                     book,
                     PrincipalVariation.Factory.create(PLY),
                     QUIESCENT_MAX_DEPTH);

            case ChoosenStrategy.ITERATIVE_DEEPENING_MTDF_WITH_TRANSPOSITION_TABLE:
               return new IterativeDeepeningMTDfWithTranspositionTableStrategy(
                     PLY,
                     new Transposition(),
                     false,
                     book,
                     PrincipalVariation.Factory.create(PLY),
                     QUIESCENT_MAX_DEPTH);

            case ChoosenStrategy.SIMPLE_ONE_LEVEL_ALPHA_BETA_PARALLEL:
               return new SimpleOneLevelAlphaBetaParallelStrategy(
                     PLY,
                     book,
                     PrincipalVariation.Factory.create(PLY - 1));

            default:
               return new IterativeDeepeningAlphaBetaWithQuiescentAndTranspositionTableStrategy(
                     PLY,
                     new Transposition(),
                     false,
                     book,
                     PrincipalVariation.Factory.create(PLY),
                     QUIESCENT_MAX_DEPTH);
         }
      }

   }
}