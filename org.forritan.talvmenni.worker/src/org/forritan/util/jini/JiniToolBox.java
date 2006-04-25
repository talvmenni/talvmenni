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

import java.io.IOException;
import java.rmi.RemoteException;

import net.jini.core.lease.Lease;
import net.jini.core.lease.LeaseDeniedException;
import net.jini.core.transaction.Transaction;
import net.jini.core.transaction.TransactionFactory;
import net.jini.lease.LeaseRenewalManager;

public class JiniToolBox {
   
   // Lease for 30 seconds at the time...
   public static final long DEFAULT_LEASE_TIME= 30 * 1000L;
   
   public static Transaction transaction(long leasetime) {
      Transaction.Created txc= null;
      try {
         txc=
            TransactionFactory.create(
                  ServiceLocator.getTransactionManagerInstance(),
                  leasetime);
      }
      catch (LeaseDeniedException e) {
         e.printStackTrace();
      }
      catch (RemoteException e) {
         e.printStackTrace();
      }
      catch (IOException e) {
         e.printStackTrace();
      }
      catch (InterruptedException e) {
         e.printStackTrace();
      }

      LeaseRenewalManager lrm= new LeaseRenewalManager();
      lrm.renewUntil(txc.lease, Lease.FOREVER, leasetime, null);

      return txc.transaction;
   }
}
