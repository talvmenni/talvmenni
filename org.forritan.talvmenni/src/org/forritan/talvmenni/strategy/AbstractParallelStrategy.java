package org.forritan.talvmenni.strategy;

import java.io.IOException;
import java.rmi.RemoteException;

import net.jini.core.entry.Entry;
import net.jini.core.entry.UnusableEntryException;
import net.jini.core.lease.Lease;
import net.jini.core.transaction.TransactionException;
import net.jini.space.JavaSpace;

import org.forritan.talvmenni.TalvMenni;
import org.forritan.talvmenni.knowledge.HistoryHeuristic;
import org.forritan.talvmenni.knowledge.TheoryBook;
import org.forritan.talvmenni.knowledge.Transposition;
import org.forritan.talvmenni.knowledge.Position.Move;
import org.forritan.talvmenni.knowledge.evaluation.Evaluation;
import org.forritan.talvmenni.masterworker.generic.Command;
import org.forritan.talvmenni.masterworker.generic.Result;
import org.forritan.talvmenni.masterworker.generic.Task;
import org.forritan.talvmenni.search.PrincipalVariation;
import org.forritan.talvmenni.search.Search;
import org.forritan.util.jini.ServiceLocator;


public abstract class AbstractParallelStrategy extends AbstractStrategy {

   public JavaSpace space = null;

   public AbstractParallelStrategy(
         int ply,
         TheoryBook book,
         PrincipalVariation pv,
         Search search,
         Evaluation evaluation) {
      super(
            ply,
            book,
            pv,
            search,
            evaluation);
      try {
         this.space= (JavaSpace) ServiceLocator.getService(JavaSpace.class);

         final ChessEngineWorker worker= new ChessEngineWorker();
         worker.transposition= new Transposition();
         worker.search= search;
         worker.evaluation= evaluation;

         TalvMenni.getThreadFactory().newThread(
               new Runnable() {
                  public void run() {
                     while (true) {
                        try {
                           AbstractParallelStrategy.this.space.write(
                                 worker,
                                 null,
                                 Lease.FOREVER);
                        } catch (RemoteException e) {
                           e.printStackTrace();
                        } catch (TransactionException e) {
                           e.printStackTrace();
                        }
                        while (true) {
                           try {
                              if (AbstractParallelStrategy.this.space
                                    .readIfExists(
                                          worker,
                                          null,
                                          1000L) == null) {
                                 break;
                              }
                              Thread.sleep(3000);
                           } catch (RemoteException e) {
                              e.printStackTrace();
                           } catch (UnusableEntryException e) {
                              e.printStackTrace();
                           } catch (TransactionException e) {
                              e.printStackTrace();
                           } catch (InterruptedException e) {
                              e.printStackTrace();
                           }
                        }
                     }
                  }
               }).start();

      } catch (IOException e) {
         e.printStackTrace();
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }

   public static abstract class ChessEngineMaster implements Runnable {
      private JavaSpace space;

      public ChessEngineMaster() throws IOException, InterruptedException {
         space= (JavaSpace) ServiceLocator.getService(JavaSpace.class);
      }

      public synchronized void run() {
         generateTasks();
         collectResults();
      }

      protected abstract void generateTasks();

      protected abstract void collectResults();

      protected void writeTask(
            ChessEngineTask task) {
         try {
            space.write(
                  task,
                  null,
                  Lease.FOREVER);
         } catch (RemoteException e) {
            e.printStackTrace();
         } catch (TransactionException e) {
            e.printStackTrace();
         }
      }

      protected Result takeResult(
            Result template) {
         try {
            Result result= (Result) space.take(
                  template,
                  null,
                  Long.MAX_VALUE);
            return result;
         } catch (RemoteException e) {
            e.printStackTrace();
         } catch (TransactionException e) {
            e.printStackTrace();
         } catch (UnusableEntryException e) {
            e.printStackTrace();
         } catch (InterruptedException e) {
            System.out.println("Task cancelled");
         }
         return null;
      }
   }

   public static class ChessEngineWorker extends Task {

      public JavaSpace        space            = null;
      public Transposition    transposition    = null;
      public HistoryHeuristic historyHeuristic = null;
      public Search           search           = null;
      public Evaluation       evaluation       = null;

      public ChessEngineWorker() {
         this.transposition= new Transposition();
         this.historyHeuristic= new HistoryHeuristic();
      }

      public Result execute() {
         try {
            this.space= (JavaSpace) ServiceLocator.getService(JavaSpace.class);

            ChessEngineTask taskTemplate= new ChessEngineTask();

            while (true) {
               System.out.println("Looking for new chesstask...");
               try {
                  ChessEngineTask task= (ChessEngineTask) space.take(
                        taskTemplate,
                        null,
                        Lease.FOREVER);

                  task.worker= this;

                  System.out.println("Evaluating "
                        + task.getMove().toString()
                        + "...");

                  Result result= task.execute();
                  if (result != null) {
                     space.write(
                           result,
                           null,
                           Lease.FOREVER);
                  }
               } catch (RemoteException e) {
                  System.out.println(e);
               } catch (TransactionException e) {
                  System.out.println(e);
               } catch (UnusableEntryException e) {
                  System.out.println(e);
               } catch (InterruptedException e) {
                  System.out.println("Task cancelled");
               }
            }
         } catch (IOException e) {
            e.printStackTrace();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
         return null;
      }
   }

   public static class ChessEngineTask implements Entry, Command {

      protected transient ChessEngineWorker worker;

      public ChessEngineTask() {
      }

      public Move getMove() {
         throw new RuntimeException(
               "ChessEngineTask.getMove() not implemented");
      }

      public Result execute() {
         throw new RuntimeException(
               "ChessEngineTask.execute() not implemented");
      }

   }

}