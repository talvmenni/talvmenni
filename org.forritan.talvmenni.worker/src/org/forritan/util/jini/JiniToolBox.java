/**
 * talvmenni - A distributed chess-engine implemented in Java(TM) and against
 * Sun Microsystems Jini/JavaSpaces(TM).
 *  
 * Copyright (C) 2004  Eyðun Lamhauge and Eyðun Nielsen
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
