package org.forritan.talvmenni.strategy;

import java.io.IOException;
import java.rmi.RemoteException;

import net.jini.core.entry.Entry;
import net.jini.core.entry.UnusableEntryException;
import net.jini.core.lease.Lease;
import net.jini.core.transaction.TransactionException;
import net.jini.space.JavaSpace;

import org.forritan.talvmenni.core.TalvMenni;
import org.forritan.talvmenni.game.TheoryBook;
import org.forritan.talvmenni.game.Transposition;
import org.forritan.talvmenni.masterworker.generic.Command;
import org.forritan.talvmenni.masterworker.generic.Result;
import org.forritan.talvmenni.masterworker.generic.Task;
import org.forritan.talvmenni.search.PrincipalVariation;
import org.forritan.util.jini.ServiceLocator;

public abstract class AbstractParallelStrategy extends AbstractStrategy {
   
   public JavaSpace space= null;

   public AbstractParallelStrategy(
         int ply,
         TheoryBook book,
         PrincipalVariation pv) {
      super(
            ply,
            book,
            pv);
      try {
         this.space= (JavaSpace) ServiceLocator.getService(JavaSpace.class);
         
         final ChessEngineWorker worker= new ChessEngineWorker();
         worker.setTransposition(new Transposition(TalvMenni.MAX_TRANSPOSITION_ENTRIES));
         
         TalvMenni.getThreadFactory().newThread(new Runnable() {
            public void run() {
               while(true) {
                  try {
                     AbstractParallelStrategy.this.space.write(worker, null, Lease.FOREVER);
                  } catch (RemoteException e) {
                     e.printStackTrace();
                  } catch (TransactionException e) {
                     e.printStackTrace();
                  }
                  while(true) {
                     try {
                        if(AbstractParallelStrategy.this.space.readIfExists(worker, null, 1000L) == null) {
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
   
   public static class ChessEngineWorker extends Task {
      
      public JavaSpace space= null;
      public Transposition transposition= null;
      
      public ChessEngineWorker() {
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
      
      public Transposition getTransposition() {
         return this.transposition;
      }

      public void setTransposition(
            Transposition transposition) {
         this.transposition= transposition;
      }
   }
   
   public static class ChessEngineTask implements Entry, Command {
      
      public ChessEngineTask() {
      }
      
       public Result execute() {
           throw new RuntimeException(
               "ChessEngineTask.execute() not implemented");
       }
   }   
}
