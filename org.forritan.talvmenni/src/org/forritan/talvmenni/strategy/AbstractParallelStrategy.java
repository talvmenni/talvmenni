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

import edu.emory.mathcs.util.concurrent.PlainThreadFactory;
import edu.emory.mathcs.util.concurrent.ThreadFactory;


public abstract class AbstractParallelStrategy extends AbstractStrategy {

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

      final ChessEngineWorker workerTemplate= new ChessEngineWorker();
      final ChessEngineWorker worker= new ChessEngineWorker();
//      worker.transposition= new Transposition();
//      worker.historyHeuristic= new HistoryHeuristic();
      worker.search= search;
      worker.evaluation= evaluation;

      ChessEngineWorker.getThreadFactory().newThread(
            new Runnable() {
               public void run() {
                  int workerNumber= 1;
                  while (true) {
                     worker.name= "Talvmenni ChessEngineWorker #"
                           + workerNumber;
                     try {
                        ServiceLocator.getJavaSpaceInstance().write(
                              worker,
                              null,
                              Lease.FOREVER);
                        workerNumber++;
                        worker.name= null;
                     } catch (RemoteException e) {
                        e.printStackTrace();
                     } catch (TransactionException e) {
                        e.printStackTrace();
                     } catch (IOException e) {
                        e.printStackTrace();
                     } catch (InterruptedException e) {
                        e.printStackTrace();
                     }
                     while (true) {
                        try {
                           if (ServiceLocator.getJavaSpaceInstance()
                                 .readIfExists(
                                       workerTemplate,
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
                        } catch (IOException e) {
                           // TODO Auto-generated catch block
                           e.printStackTrace();
                        }
                     }
                  }
               }
            }).start();

   }

   public static abstract class ChessEngineMaster implements Runnable {

      public ChessEngineMaster() {
      }

      public synchronized void run() {
         generateTasks();
         collectResults();
      }

      protected abstract void generateTasks();

      protected abstract void collectResults();

      protected void writeTask(
            Entry task) throws IOException, InterruptedException {
         try {
            ServiceLocator.getJavaSpaceInstance().write(
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
            Result template) throws IOException {
         try {
            Result result= (Result) ServiceLocator.getJavaSpaceInstance().take(
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

      public String                               name             = null;
      public transient Transposition              transposition    = null;
      public transient HistoryHeuristic           historyHeuristic = null;
      public Search                               search           = null;
      public Evaluation                           evaluation       = null;
      private ChessEngineTask                     task;

      private static transient PlainThreadFactory threadFactory;

      public synchronized static ThreadFactory getThreadFactory() {
         if (ChessEngineWorker.threadFactory == null) {
            ChessEngineWorker.threadFactory= new PlainThreadFactory();
         }
         return ChessEngineWorker.threadFactory;
      }

      public ChessEngineWorker() {
         this.transposition= new Transposition();
         this.historyHeuristic= new HistoryHeuristic();
      }

      public Result execute() {
         try {
            ChessEngineTask taskTemplate= new ChessEngineTask();

            while (true) {
               System.out.println(this.name
                     + " looking for new chesstask...");
               try {
                  task= (ChessEngineTask) ServiceLocator.getJavaSpaceInstance()
                        .take(
                              taskTemplate,
                              null,
                              Long.MAX_VALUE);
                  if (task != null) {
                     task.worker= this;
                     Result result= task.execute();
                     if (result != null) {
                        ServiceLocator.getJavaSpaceInstance().write(
                              result,
                              null,
                              Lease.FOREVER);
                     }
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
         }
         return null;
      }

      public ChessEngineTask getTask() {
         return this.task;
      }

      public void setTask(
            ChessEngineTask task) {
         this.task= task;
      }

      public Search getSearch() {
         this.search.setTransposition(this.transposition);
         this.search.setHistoryHeuristic(this.historyHeuristic);
         return this.search;
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