package org.forritan.talvmenni.masterworker.generic;

import java.io.IOException;
import java.rmi.RemoteException;

import org.forritan.util.jini.ServiceLocator;

import net.jini.core.entry.*;
import net.jini.core.lease.Lease;
import net.jini.core.transaction.*;
import net.jini.space.JavaSpace;


public class GenericWorker {
   private Thread thread;

   public static void main(
         String[] args) throws IOException, InterruptedException {
      System.setProperty(
            "java.security.policy",
            "policy.all");
      new GenericWorker().startWork();
   }

   public GenericWorker() {
   }

   public void startWork() throws IOException, InterruptedException {
      Task taskTemplate= new Task();

      while (true) {
         System.out.println("Looking for new task...");
         try {
            Task task= (Task) ServiceLocator.getJavaSpaceInstance().take(
                  taskTemplate,
                  null,
                  Long.MAX_VALUE);
            Result result= task.execute();
            if (result != null) {
               ServiceLocator.getJavaSpaceInstance().write(
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
   }
}