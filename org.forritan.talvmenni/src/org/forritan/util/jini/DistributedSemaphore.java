/**
 * deeDjinn - An ICalendar (RFC2445 & RFC2446) based distributed calendar 
 * implementet against Sun Microsystems Jini/JavaSpaces(TM).
 *  
 * Copyright (C) 2004  Eyðun Lamhauge, Eyðun Nielsen
 *                     og Dánjal Salberg Thomsen
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * 
 * Or you can see it at the Free Software Foundation website on the
 * following url: http://www.fsf.org/licenses/lgpl.html
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

   public boolean isLoggedIn() {
      SemaphoreEntry template= new SemaphoreEntry(resource);
      Entry semaphore= null;
      try {
         semaphore= space.readIfExists(template, null, JavaSpace.NO_WAIT);
      }
      catch (Exception e) {
         e.printStackTrace();
      }
      return semaphore == null;
   }
}
