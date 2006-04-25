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

package org.forritan.util.jini;

import net.jini.core.entry.Entry;
import net.jini.core.lease.Lease;
import net.jini.core.transaction.Transaction;
import net.jini.space.JavaSpace;

public class DistributedSemaphore {
   private JavaSpace space;
   private String resource;

   public DistributedSemaphore(JavaSpace space, String resource) {
      this.space= space;
      this.resource= resource;
   }

   public void create(int num, Transaction tx) {
      for (int i= 0; i < num; i++) {
         SemaphoreEntry semaphoreEntry= new SemaphoreEntry(resource);
         try {
            space.write(semaphoreEntry, tx, Lease.FOREVER);
         }
         catch (Exception e) {
            e.printStackTrace();
         }
      }
   }

   public void down(Transaction tx) {
      SemaphoreEntry template= new SemaphoreEntry(resource);
      try {
         space.take(template, tx, Long.MAX_VALUE);
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }

   public void up(Transaction tx) {
      SemaphoreEntry semaphoreEntry= new SemaphoreEntry(resource);
      try {
         space.write(semaphoreEntry, tx, Lease.FOREVER);
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }

   public boolean exists() {
      SemaphoreEntry template= new SemaphoreEntry(resource);
      Entry semaphore= null;
      try {
         semaphore= space.readIfExists(template, null, JavaSpace.NO_WAIT);
      }
      catch (Exception e) {
         e.printStackTrace();
      }
      return semaphore != null;
   }
}
