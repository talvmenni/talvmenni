/**
 * talvmenni - A distributed chess-engine implemented in Java(TM)
 * and against Sun Microsystems Jini/JavaSpaces(TM).
 *  
 * Copyright (C) 2004-2006 Eyðun Lamhauge and Eyðun Nielsen
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License. 
 */

package org.forritan.talvmenni.masterworker.generic;

import java.io.IOException;
import java.rmi.RemoteException;

import net.jini.core.entry.UnusableEntryException;
import net.jini.core.lease.Lease;
import net.jini.core.transaction.TransactionException;

import org.forritan.util.jini.ServiceLocator;


public class GenericWorker {
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