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

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

import junit.framework.Assert;
import junit.framework.TestCase;
import net.jini.core.discovery.LookupLocator;
import net.jini.core.entry.Entry;
import net.jini.core.lookup.ServiceRegistrar;
import net.jini.core.lookup.ServiceTemplate;
import net.jini.core.transaction.server.TransactionManager;
import net.jini.discovery.DiscoveryEvent;
import net.jini.discovery.DiscoveryListener;
import net.jini.discovery.LookupDiscovery;
import net.jini.lookup.entry.Name;
import net.jini.space.JavaSpace;

public class ServiceLocator {

   private Object service;
   private Object mutex;
   private ServiceTemplate serviceTemplate;

   public ServiceLocator() {
      mutex= new Object();
   }

   public static Object getService(Class clazz)
      throws IOException, InterruptedException {
      return getService(clazz, ((String) (null)));
   }

   public static Object getService(String name, Class clazz)
      throws MalformedURLException, IOException, ClassNotFoundException {

      if (System.getSecurityManager() == null)
         System.setSecurityManager(new RMISecurityManager());

      LookupLocator lookuplocator= new LookupLocator("jini://" + name);

      ServiceRegistrar serviceregistrar= lookuplocator.getRegistrar();

      ServiceTemplate servicetemplate=
         new ServiceTemplate(null, new Class[] { clazz }, null);

      return serviceregistrar.lookup(servicetemplate);
   }

   public static Object getService(Class clazz, String name)
      throws IOException, InterruptedException {

      ServiceLocator servicelocator= new ServiceLocator();

      return servicelocator.getServiceImpl(clazz, name);
   }

   private Object getServiceImpl(Class clazz, String name)
      throws IOException, InterruptedException {

      Class classes[]= { clazz };
      Entry entries[]= null;

      if (name != null)
         entries= (new Entry[] { new Name(name)});

      serviceTemplate= new ServiceTemplate(null, classes, entries);

      if (System.getSecurityManager() == null)
         System.setSecurityManager(new RMISecurityManager());

      LookupDiscovery lookupdiscovery=
         new LookupDiscovery(LookupDiscovery.ALL_GROUPS);

      lookupdiscovery.addDiscoveryListener(new ServiceRegistry());

      while (service == null)
         synchronized (mutex) {
            mutex.wait();
         }

      lookupdiscovery.terminate();

      return service;
   }

   private void findService(ServiceRegistrar serviceregistrar) {
      try {
         synchronized (mutex) {
            service= serviceregistrar.lookup(serviceTemplate);
            if (service != null)
               mutex.notifyAll();
         }
      }
      catch (RemoteException remoteexception) {
         System.err.println(remoteexception);
      }
   }

   private class ServiceRegistry implements DiscoveryListener {

      public void discovered(DiscoveryEvent discoveryevent) {
         ServiceRegistrar registrar[]= discoveryevent.getRegistrars();
         for (int i= 0; i < registrar.length && service == null; i++) {
            findService(registrar[i]);
         }
      }

      public void discarded(DiscoveryEvent discoveryevent) {
      }
   }

   public static class TestServiceLocator extends TestCase {

      protected void setUp() throws Exception {
         super.setUp();
      }
      protected void tearDown() throws Exception {
         super.tearDown();
      }

      public void testServiceLocator()
         throws IOException, InterruptedException {
         JavaSpace space=
            (JavaSpace) ServiceLocator.getService(JavaSpace.class);
         Assert.assertNotNull(space);
      }

   }

   private static JavaSpace space;
   public static JavaSpace getJavaSpaceInstance()
      throws IOException, InterruptedException {
      if (space == null) {
         space= (JavaSpace) ServiceLocator.getService(JavaSpace.class);
      }
      return space;
   }

   private static TransactionManager transactionManager;
   public static TransactionManager getTransactionManagerInstance()
      throws IOException, InterruptedException {
      if (transactionManager == null) {
         transactionManager=
            (TransactionManager) ServiceLocator.getService(
               TransactionManager.class);
      }
      return transactionManager;
   }

}
