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
   // i.e.: in case of a client breakdown,
   // the calendar is restored in space after 30 seconds.
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
