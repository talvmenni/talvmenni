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

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;
import junit.framework.TestCase;
import net.jini.core.entry.Entry;
import net.jini.core.entry.UnusableEntryException;
import net.jini.core.lease.Lease;
import net.jini.core.transaction.Transaction;
import net.jini.core.transaction.TransactionException;
import net.jini.space.JavaSpace;

public class DistributedArray {

   private JavaSpace space;
   private String name;

   public DistributedArray(JavaSpace space, String name) {
      this.space= space;
      this.name= name;
   }

   public synchronized void create(final Transaction ext_tx)
      throws RemoteException, TransactionException {

      Transaction tx= null;
      if (ext_tx == null) {
         tx= JiniToolBox.transaction(JiniToolBox.DEFAULT_LEASE_TIME);
      }
      else {
         tx= ext_tx;
      }

      DistributedSemaphore semaphore=
         new DistributedSemaphore(this.space, this.name);
      semaphore.create(1, tx);

      Start start= new Start();
      start.name= name;
      start.position= new Integer(0);

      End end= new End();
      end.name= name;
      end.position= new Integer(0);

      space.write(start, tx, Lease.FOREVER);
      space.write(end, tx, Lease.FOREVER);

      if (ext_tx == null && tx != null) {
         tx.commit();
      }
   }

   public synchronized void remove(final Transaction ext_tx)
      throws
         RemoteException,
         UnusableEntryException,
         TransactionException,
         InterruptedException {

      Transaction tx= null;
      if (ext_tx == null) {
         tx= JiniToolBox.transaction(JiniToolBox.DEFAULT_LEASE_TIME);
      }
      else {
         tx= ext_tx;
      }

      Start start= new Start();
      start.name= this.name;
      space.takeIfExists(start, tx, JavaSpace.NO_WAIT);

      End end= new End();
      end.name= this.name;
      space.takeIfExists(end, tx, JavaSpace.NO_WAIT);

      Element elementTemplate= new Element();
      elementTemplate.name= this.name;
      Entry element= null;
      do {
         element=
            this.space.takeIfExists(elementTemplate, tx, JavaSpace.NO_WAIT);
      }
      while (element != null);

      if (ext_tx == null && tx != null) {
         tx.commit();
      }
   }

   public synchronized int append(Object obj, final Transaction ext_tx)
      throws
         RemoteException,
         TransactionException,
         UnusableEntryException,
         InterruptedException {

      Transaction tx= null;
      if (ext_tx == null) {
         tx= JiniToolBox.transaction(JiniToolBox.DEFAULT_LEASE_TIME);
      }
      else {
         tx= ext_tx;
      }

      End template= new End();
      template.name= name;

      End end= (End) space.take(template, tx, 0);
      int position= end.increment();
      space.write(end, tx, Lease.FOREVER);

      Element element= new Element(name, position, obj);
      space.write(element, tx, Lease.FOREVER);

      if (ext_tx == null && tx != null) {
         tx.commit();
      }

      return position;
   }

   public synchronized int size(final Transaction ext_tx)
      throws
         RemoteException,
         TransactionException,
         UnusableEntryException,
         InterruptedException {
      Start startTemplate= new Start();
      startTemplate.name= name;

      Transaction tx= null;
      if (ext_tx == null) {
         tx= JiniToolBox.transaction(JiniToolBox.DEFAULT_LEASE_TIME);
      }
      else {
         tx= ext_tx;
      }

      End endTemplate= new End();
      endTemplate.name= name;

      Start start= (Start) space.read(startTemplate, null, Long.MAX_VALUE);
      End end= (End) space.read(endTemplate, null, Long.MAX_VALUE);

      if (ext_tx == null && tx != null) {
         tx.commit();
      }

      return (end.position.intValue() - start.position.intValue());
   }

   public synchronized void modifyElement(
      int pos,
      Object newObject,
      final Transaction ext_tx)
      throws
         RemoteException,
         TransactionException,
         UnusableEntryException,
         InterruptedException {

      Transaction tx= null;
      if (ext_tx == null) {
         tx= JiniToolBox.transaction(JiniToolBox.DEFAULT_LEASE_TIME);
      }
      else {
         tx= ext_tx;
      }

      Element template= new Element(name, pos, null);

      Element element= (Element) space.take(template, tx, Lease.FOREVER);
      element.data= newObject;
      space.write(element, tx, Lease.FOREVER);

      if (ext_tx == null && tx != null) {
         tx.commit();
      }
   }

   public synchronized Object readElement(int pos)
      throws
         RemoteException,
         TransactionException,
         UnusableEntryException,
         InterruptedException {

      Element template= new Element(name, pos, null);
      Element element= (Element) space.read(template, null, Long.MAX_VALUE);
      return element.data;
   }

   public synchronized List<Object> list(final Transaction ext_tx)
      throws
         RemoteException,
         TransactionException,
         UnusableEntryException,
         InterruptedException {

      Transaction tx= null;
      if (ext_tx == null) {
         tx= JiniToolBox.transaction(JiniToolBox.DEFAULT_LEASE_TIME);
      }
      else {
         tx= ext_tx;
      }

      List<Object> result= new ArrayList<Object>();

      for (int i= 0; i < this.size(tx); i++) {
         result.add(i, this.readElement(i));
      }

      if (ext_tx == null && tx != null) {
         tx.commit();
      }
      return result;
   }

   public static class Element implements Entry {

      private static final long serialVersionUID = 1L;

      public String name;
      public Integer index;
      public Object data;

      public Element() {
      }

      public Element(String name, int index, Object data) {
         this.name= name;
         this.index= new Integer(index);
         this.data= data;
      }
   }

   public static class Start extends Index {

      private static final long serialVersionUID = 1L;

      public Start() {
      }
   }

   public static class End extends Index {

      private static final long serialVersionUID = 1L;

      public End() {
      }
   }

   public static abstract class Index implements Entry {
      public String name;
      public Integer position;

      public int increment() {
         int pos= position.intValue();
         position= new Integer(position.intValue() + 1);
         return pos;
      }

      public int decrement() {
         int pos= position.intValue();
         position= new Integer(position.intValue() - 1);
         return pos;
      }
   }

   public static class TestDistributedArray extends TestCase {

      private JavaSpace space;
      private DistributedArray array;

      protected void setUp() throws Exception {
         super.setUp();
         this.space= ServiceLocator.getJavaSpaceInstance();
      }

      protected void tearDown() throws Exception {
         super.tearDown();
         this.array.remove(null);
      }

      public void testInitial()
         throws
            RemoteException,
            TransactionException,
            UnusableEntryException,
            InterruptedException {

         String name= "testDistributedSpaceArray";
         this.array= new DistributedArray(space, name);

         array.create(null);

         for (int i= 0; i < 10; i++) {
            array.append(new Integer(i), null);
         }
         Assert.assertEquals(10, array.size(null));

         for (int i= 0; i < 10; i++) {
            Integer elem= (Integer) array.readElement(i);
            Assert.assertEquals(i, elem.intValue());
         }
      }
   }
}
