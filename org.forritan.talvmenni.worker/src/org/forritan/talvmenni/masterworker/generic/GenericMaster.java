package org.forritan.talvmenni.masterworker.generic;

import java.io.IOException;
import java.rmi.RemoteException;

import net.jini.core.entry.UnusableEntryException;
import net.jini.core.lease.Lease;
import net.jini.core.transaction.TransactionException;
import net.jini.space.JavaSpace;

import org.forritan.util.jini.ServiceLocator;


public abstract class GenericMaster implements Runnable {

   public GenericMaster() {
   }

   public synchronized void run() {
      generateTasks();
      collectResults();
   }

   protected abstract void generateTasks();

   protected abstract void collectResults();

   protected void writeTask(
         Task task) throws IOException, InterruptedException {
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