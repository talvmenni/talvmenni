package org.forritan.talvmenni.strategy;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.jini.core.entry.Entry;
import net.jini.core.entry.UnusableEntryException;
import net.jini.core.lease.Lease;
import net.jini.core.lease.LeaseDeniedException;
import net.jini.core.transaction.Transaction;
import net.jini.core.transaction.TransactionException;
import net.jini.core.transaction.TransactionFactory;
import net.jini.core.transaction.server.TransactionManager;
import net.jini.space.JavaSpace;

import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.TheoryBook;
import org.forritan.talvmenni.knowledge.Transposition;
import org.forritan.talvmenni.knowledge.Position.Move;
import org.forritan.talvmenni.knowledge.evaluation.Evaluation;
import org.forritan.talvmenni.knowledge.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.masterworker.generic.Result;
import org.forritan.talvmenni.search.AlphaBetaWithQuiescentAndTranspositionTableSearch;
import org.forritan.talvmenni.search.PrincipalVariation;
import org.forritan.util.jini.ServiceLocator;


public class ParallelIterativDeepeningAlphaBetaWithQuiescentAndTranspositionTableStrategy
      extends AbstractParallelStrategy {

   private Master master;
   private int    masterSearchToPly;

   public ParallelIterativDeepeningAlphaBetaWithQuiescentAndTranspositionTableStrategy(
         int ply,
         int masterSearchToPly,
         Transposition transposition,
         boolean useMoveOrdering,
         TheoryBook book,
         PrincipalVariation pv,
         int quiescentMaxDepth) {
      super(
            ply,
            book,
            pv,
            new AlphaBetaWithQuiescentAndTranspositionTableSearch(
                  transposition,
                  useMoveOrdering,
                  pv,
                  quiescentMaxDepth),
            new SimpleMaterialAndPositionalEvaluation());

      try {
         this.master= new Master();
         this.masterSearchToPly= masterSearchToPly;
      } catch (IOException e) {
         e.printStackTrace();
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }

   protected List search(
         Position position,
         boolean whiteToMove) {

      List result= null;

      // First we do a fast 3 or 4-ply iterative deepening search to get better
      // moveordering
      Position mutablePosition= position.getMutable();
      for (int i= 1; i <= this.masterSearchToPly; i++) {
         this.search.setPly(i);
         result= this.search.getBestMoves(
               mutablePosition,
               this.evaluation,
               whiteToMove);
      }

      this.master.position= position;
      this.master.whiteToMove= whiteToMove;
      this.master.ply= this.ply;
      this.master.masterSearchToPly= this.masterSearchToPly;

      this.master.generateTasks();

      for (int i= this.masterSearchToPly + 1; i <= this.ply; i++) {
         this.master.collectAtPly= i;
         this.master.collectResults();
         result= new ArrayList();
         result.add(this.master.bestResult.move);
      }
      return result;

   }

   public static class Master extends ChessEngineMaster {

      public int        numberOfTasks;

      public Position   position;
      public boolean    whiteToMove;
      public int        ply;
      public int        masterSearchToPly;
      public int        collectAtPly;

      public TaskResult bestResult;

      public Master() throws IOException, InterruptedException {
         super();
      }

      protected void generateTasks() {

         // First empty space for old alphabeta entries
         AlphaBetaEntry alphaBetaEntryTemplate= new AlphaBetaEntry();

         Object obj= null;
         do {
            try {
               obj= ServiceLocator.getJavaSpaceInstance().takeIfExists(
                     alphaBetaEntryTemplate,
                     null,
                     5000L);
            } catch (RemoteException e) {
               e.printStackTrace();
            } catch (UnusableEntryException e) {
               e.printStackTrace();
            } catch (TransactionException e) {
               e.printStackTrace();
            } catch (InterruptedException e) {
               e.printStackTrace();
            } catch (IOException e) {
               e.printStackTrace();
            }
         } while (obj != null);

         AlphaBetaEntry alphaBetaEntry= new AlphaBetaEntry();
         for (int i= 1; i <= this.ply; i++) {
            alphaBetaEntry.ply= new Integer(
                  i);
            alphaBetaEntry.alpha= new Integer(
                  Integer.MIN_VALUE + 1);
            alphaBetaEntry.beta= new Integer(
                  Integer.MAX_VALUE);
            try {
               this.writeTask(alphaBetaEntry);
            } catch (IOException e) {
               e.printStackTrace();
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
         }

         List moves;
         if (this.whiteToMove) {
            moves= this.position.getWhite().getPossibleMoves();
         } else {
            moves= this.position.getBlack().getPossibleMoves();
         }

         this.numberOfTasks= moves.size();
         if (this.numberOfTasks > 0) {

            // If checkmate there is no need to search further...
            int alpha= -Evaluation.CHECKMATE_SCORE;
            int beta= Evaluation.CHECKMATE_SCORE;

            for (Iterator it= moves.iterator(); it.hasNext();) {
               Move move= (Move) it.next();
               Position childPosition= this.position.move(
                     move).getImmutable();
               this.position.popMove();
               ChessEngineTask task= new Task(
                     childPosition,
                     move,
                     Boolean.valueOf(!this.whiteToMove),
                     new Integer(
                           -beta),
                     new Integer(
                           -alpha),
                     new Integer(
                           this.ply - 1),
                     new Integer(
                           this.masterSearchToPly - 1),
                     new Integer(
                           0),
                     null,
                     Boolean.TRUE);
               try {
                  System.err.println("Writing task for move: "
                        + move);
                  this.writeTask(task);

               } catch (IOException e) {
                  e.printStackTrace();
               } catch (InterruptedException e) {
                  e.printStackTrace();
               }
            }
         }

      }

      protected void collectResults() {
         TaskResult template= new TaskResult();
         this.bestResult= null;
         template.ply= new Integer(
               this.collectAtPly);
         for (int i= 0; i < this.numberOfTasks; i++) {
            TaskResult result= null;
            try {
               System.err.println("Starting to collect "
                     + this.numberOfTasks
                     + " results at "
                     + this.collectAtPly
                     + " ply");
               result= (TaskResult) this.takeResult(template);
               System.err.println("[PLY="
                     + this.collectAtPly
                     + "] Got a result: "
                     + result.move
                     + " is scored with "
                     + result.score.intValue());
            } catch (IOException e) {
               e.printStackTrace();
            }

            if (result != null) {
               if (this.bestResult == null
                     || this.bestResult.score.intValue() > result.score
                           .intValue()) {
                  this.bestResult= result;
               }
            }
         }

         System.err.println("Finnished collecting results at "
               + this.collectAtPly
               + " ply");
         System.err.println("Best result: "
               + this.bestResult.move.toString()
               + " with "
               + this.bestResult.score.toString()
               + " in score...");
      }
   }

   public static class Task extends ChessEngineTask {

      public transient int lastScore;

      public Position      position;
      public Move          move;
      public Boolean       whiteToMove;
      public Integer       alpha;
      public Integer       beta;
      public Integer       ply;
      public Integer       masterSearchedToPly;
      public Integer       workerSearchedToPly;
      public String        lastWorkerId;
      public Boolean       lastWorkerIdNull;

      public Task() {
      }

      public Task(
            Position position,
            Move move,
            Boolean whiteToMove,
            Integer alpha,
            Integer beta,
            Integer ply,
            Integer masterSearchedToPly,
            Integer workerSearchedToPly,
            String lastWorkerId,
            Boolean lastWorkerIdNull) {
         this.position= position;
         this.move= move;
         this.whiteToMove= whiteToMove;
         this.alpha= alpha;
         this.beta= beta;
         this.ply= ply;
         this.masterSearchedToPly= masterSearchedToPly;
         this.workerSearchedToPly= workerSearchedToPly;
         this.lastWorkerId= lastWorkerId;
         this.lastWorkerIdNull= lastWorkerIdNull;
      }

      public Move getMove() {
         return this.move;
      }

      public Result execute() {

         long time= -System.currentTimeMillis();

         boolean taskIsSwapped= false;
         System.out
               .println("[PLY="
                     + (this.workerSearchedToPly.intValue() == 0 ? ("1-" + (this.masterSearchedToPly
                           .intValue() + 1))
                           : ("" + (this.workerSearchedToPly.intValue() + 2)))
                     + "] "
                     + "Evaluating "
                     + this.getMove().toString()
                     + " - last worker on this task was "
                     + this.lastWorkerId
                     + "...");

         AlphaBetaWithQuiescentAndTranspositionTableSearch search= (AlphaBetaWithQuiescentAndTranspositionTableSearch) this.worker
               .getSearch();

         for (int localPly= this.workerSearchedToPly.intValue() + 1; localPly <= this.ply
               .intValue(); localPly++) {

            System.out.println("Setting local ply to: "
                  + localPly);

            // Lookup possible better alpha-beta values in space...
            this.updateAlphaBeta(
                  localPly,
                  this.alpha.intValue(),
                  this.beta.intValue());

            search.setPly(localPly);
            search.getBestMoves(
                  this.position.getMutable(),
                  this.worker.evaluation,
                  this.whiteToMove.booleanValue());
            this.lastScore= search.getLastScore();

            time+= System.currentTimeMillis();

            this.workerSearchedToPly= new Integer(
                  localPly);
            this.lastWorkerId= this.worker.name;
            this.lastWorkerIdNull= Boolean.FALSE;

            Task swapTask= null;
            Task swapTemplate= new Task();

            if (localPly >= (this.masterSearchedToPly.intValue())) {

               //Lookup possible better alpha-beta values in space...
               this.updateAlphaBeta(
                     localPly,
                     search.getFinalAlpha(),
                     search.getFinalBeta());

               //first find possible task in space which hasn't been
               // searched
               // as
               // at
               // all yet

               swapTemplate.lastWorkerIdNull= Boolean.TRUE;
               swapTask= this.getTaskFromSpace(swapTemplate);

               if (swapTask == null) {
                  swapTemplate.lastWorkerIdNull= null;
                  swapTemplate.lastWorkerId= this.worker.name;
                  //first find possible task in space which haven't been
                  // searched
                  // as
                  // deep as the current one (this) and which was last
                  // searched
                  // on the current worker, because then we might get some
                  // advantage
                  // with transpositiontable and history heuristic, maybe...
                  // :)
                  int j= 1;
                  while (j < this.workerSearchedToPly.intValue()
                        && swapTask == null) {
                     swapTemplate.workerSearchedToPly= new Integer(
                           j);
                     swapTask= this.getTaskFromSpace(swapTemplate);
                     j++;
                  }
               }

               if (swapTask == null) {
                  swapTemplate.lastWorkerId= null;
                  //then find any task in space which haven't been searched
                  // as
                  // deep as the current one (this)
                  int j= 1;
                  while (j < this.workerSearchedToPly.intValue()
                        && swapTask == null) {
                     swapTemplate.workerSearchedToPly= new Integer(
                           j);
                     swapTask= this.getTaskFromSpace(swapTemplate);
                     j++;
                  }
               }

            }

            if (localPly > (this.masterSearchedToPly.intValue())) {

               List bestMoves= this.worker.getSearch().getBestMoves(
                     this.position.getMutable(),
                     this.worker.evaluation,
                     this.whiteToMove.booleanValue());

               TaskResult result= new TaskResult();

               result.ply= new Integer(
                     localPly + 1);
               result.score= new Integer(
                     this.worker.getSearch().getLastScore());
               result.move= this.move;
               result.principalVariation= this.worker.getSearch()
                     .getPrincipalVariation().getCurrentBestLine();

               if (result != null) {
                  try {
                     JavaSpace space= ServiceLocator.getJavaSpaceInstance();
                     space.write(
                           result,
                           null,
                           Lease.FOREVER);
                  } catch (RemoteException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
                  } catch (TransactionException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
                  } catch (IOException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
                  } catch (InterruptedException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
                  }
               }
            }

            taskIsSwapped= false;
            if (swapTask != null) {
               taskIsSwapped= true;
               break; //if task is swapped...
            }
         }
         if (this.workerSearchedToPly.intValue() < this.ply.intValue()
               || taskIsSwapped) {
            return Task.this.worker.getTask().execute();
         } else {
            return null;
         }
      }

      /**
       * @param swapTemplate
       * @return
       */
      private Task getTaskFromSpace(
            Task swapTemplate) {
         Task result= null;

         try {
            TransactionManager txMgr= ServiceLocator
                  .getTransactionManagerInstance();
            Transaction.Created trc= null;
            Transaction tx= null;
            trc= TransactionFactory.create(
                  txMgr,
                  Lease.FOREVER);
            if (trc != null) {

               tx= trc.transaction;
               result= (Task) ServiceLocator.getJavaSpaceInstance()
                     .takeIfExists(
                           swapTemplate,
                           tx,
                           5000L);
               if (result != null) {
                  System.out.println("Swapping task...");
                  ServiceLocator.getJavaSpaceInstance().write(
                        this,
                        tx,
                        Lease.FOREVER);
                  this.worker.setTask(result);
                  this.worker.getTask().worker= this.worker;
               }
               tx.commit();
            }
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         } catch (UnusableEntryException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         } catch (TransactionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         } catch (LeaseDeniedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }

         return result;
      }

      /**
       * Lookup possible better alpha-beta values or update in space...
       * 
       * @throws IOException
       */
      private void updateAlphaBeta(
            int ply,
            int alpha,
            int beta) {

         if (alpha > this.alpha.intValue()) {
            this.alpha= new Integer(
                  alpha);
         }
         if (beta < this.beta.intValue()) {
            this.beta= new Integer(
                  beta);
         }

         AlphaBetaEntry alphaBetaEntry= null;
         AlphaBetaEntry alphaBetaTemplate= new AlphaBetaEntry();
         alphaBetaTemplate.ply= new Integer(
               ply);
         try {
            alphaBetaEntry= (AlphaBetaEntry) ServiceLocator
                  .getJavaSpaceInstance().read(
                        alphaBetaTemplate,
                        null,
                        3000L);
            if (alphaBetaEntry != null) {
               int oldAlpha= alpha;
               int oldBeta= beta;
               if (alphaBetaEntry.alpha.intValue() > oldAlpha) {
                  this.alpha= new Integer(
                        alphaBetaEntry.alpha.intValue());
                  System.out.println("[Ply="
                        + (alphaBetaTemplate.ply.intValue() + 1)
                        + "] New alpha: "
                        + this.alpha.intValue());
               }
               if (alphaBetaEntry.beta.intValue() < oldBeta) {
                  this.beta= new Integer(
                        alphaBetaEntry.beta.intValue());
                  System.out.println("[Ply="
                        + (alphaBetaTemplate.ply.intValue() + 1)
                        + "] New beta: "
                        + this.beta.intValue());
               }

               if (alphaBetaEntry.alpha.intValue() < this.alpha.intValue()
                     || this.beta.intValue() > alphaBetaEntry.beta.intValue()) {
                  TransactionManager txMgr= ServiceLocator
                        .getTransactionManagerInstance();
                  Transaction.Created trc= null;
                  Transaction tx;
                  trc= TransactionFactory.create(
                        txMgr,
                        Lease.FOREVER);
                  if (trc != null) {
                     tx= trc.transaction;

                     alphaBetaEntry= (AlphaBetaEntry) ServiceLocator
                           .getJavaSpaceInstance().take(
                                 alphaBetaTemplate,
                                 tx,
                                 3000L);
                     if (alphaBetaEntry != null) {
                        alphaBetaEntry.alpha= new Integer(
                              alpha);
                        alphaBetaEntry.beta= new Integer(
                              beta);
                        ServiceLocator.getJavaSpaceInstance().write(
                              alphaBetaEntry,
                              tx,
                              Lease.FOREVER);
                     }
                     tx.commit();
                     System.out.println("[Ply="
                           + (alphaBetaTemplate.ply.intValue() + 1)
                           + "] - Updated alpha-beta in space...");
                  }
               }
            }
         } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         } catch (UnusableEntryException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         } catch (TransactionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         } catch (LeaseDeniedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }

   public static class TaskResult extends Result {

      public Integer ply                = null;
      public Integer score              = null;
      public Move    move               = null;
      public List    principalVariation = null;

      public TaskResult() {
      }
   }

   public static class AlphaBetaEntry implements Entry {

      public Integer ply;
      public Integer alpha;
      public Integer beta;

      public AlphaBetaEntry() {
      }

   }

}