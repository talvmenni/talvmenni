/**
 * talvmenni - A distributed chess-engine implemented in Java(TM)
 * and against Sun Microsystems Jini/JavaSpaces(TM).
 *  
 * Copyright (C) 2004-2006 Ey�un Lamhauge and Ey�un Nielsen
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