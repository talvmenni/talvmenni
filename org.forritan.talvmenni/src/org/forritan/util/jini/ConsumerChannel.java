/**
 * talvmenni - A distributed chess-engine implemented in Java(TM) and against
 * Sun Microsystems Jini/JavaSpaces(TM).
 *  
 * Copyright (C) 2004  Ey�un Lamhauge and Ey�un Nielsen
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

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import net.jini.core.entry.Entry;
import net.jini.core.entry.UnusableEntryException;
import net.jini.core.lease.Lease;
import net.jini.core.transaction.Transaction;
import net.jini.core.transaction.TransactionException;
import net.jini.space.JavaSpace;

public class ConsumerChannel {

   private static Map channels= new HashMap();

   private JavaSpace space;
   private String name;

   public ConsumerChannel(JavaSpace space, String name) {
      this.space= space;
      this.name= name;
   }

   public synchronized void create(final Transaction ext_tx)
      throws RemoteException, TransactionException {

      if (Boolean.getBoolean("deedjinn.debug.verbose")) {
         Integer numberOfChannels;
         if (channels.containsKey(name)) {
            numberOfChannels= (Integer) channels.get(name);
            numberOfChannels= new Integer(numberOfChannels.intValue() + 1);
            channels.put(name, numberOfChannels);
         }
         else {
            numberOfChannels= new Integer(1);
            channels.put(name, numberOfChannels);
         }
         System.out.println(
            "*** Creating channel: "
               + name
               + " for the "
               + numberOfChannels
               + " time...");
      }

      Transaction tx= null;
      if (ext_tx == null) {
         tx= JiniToolBox.transaction(JiniToolBox.DEFAULT_LEASE_TIME);
      }
      else {
         tx= ext_tx;
      }

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

      if (Boolean.getBoolean("deedjinn.debug.verbose")) {
         System.out.println(
            "ConsumerChannel.append - going to take End on channel "
               + this.name);
      }

      End end= (End) space.take(template, tx, Lease.FOREVER);
      int position= end.increment();

      if (Boolean.getBoolean("deedjinn.debug.verbose")) {
         System.out.println(
            "ConsumerChannel.append - End position is " + position);
         System.out.println(
            "ConsumerChannel.append - going to write End on channel "
               + this.name);
      }

      space.write(end, tx, Lease.FOREVER);
      Element element= new Element(name, position, obj);

      if (Boolean.getBoolean("deedjinn.debug.verbose")) {
         System.out.println(
            "ConsumerChannel.append - going to write Element on channel "
               + this.name);
      }

      space.write(element, tx, Lease.FOREVER);

      if (ext_tx == null && tx != null) {
         tx.commit();
      }

      if (Boolean.getBoolean("deedjinn.debug.verbose")) {
         System.out.println(
            "ConsumerChannel.append on channel " + this.name + " - Done!");
      }

      return position;
   }

   public synchronized Object readNext(final Transaction ext_tx)
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

      Start startTemplate= new Start();
      startTemplate.name= this.name;

      if (Boolean.getBoolean("deedjinn.debug.verbose")) {
         System.out.println(
            "ConsumerChannel.readNext() - going to take Start on channel "
               + this.name);
      }

      Start start= (Start) space.take(startTemplate, tx, Lease.FOREVER);
      int position= start.increment();

      if (Boolean.getBoolean("deedjinn.debug.verbose")) {
         System.out.println(
            "ConsumerChannel.readNext() - start position is " + position);
         System.out.println(
            "ConsumerChannel.readNext() - going to write Start on channel "
               + this.name);
      }

      space.write(start, tx, Lease.FOREVER);
      Element template= new Element(this.name, position, null);

      if (Boolean.getBoolean("deedjinn.debug.verbose")) {
         System.out.println(
            "ConsumerChannel.readNext() - going to take Element on channel "
               + this.name);
      }

      Element element= (Element) space.take(template, tx, Lease.FOREVER);

      if (ext_tx == null && tx != null) {
         tx.commit();
      }

      if (Boolean.getBoolean("deedjinn.debug.verbose")) {
         System.out.println(
            "ConsumerChannel.readNext() on channel " + this.name + " - Done!");
      }

      return element.data;
   }

   public static class Element implements Entry {
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
      public Start() {
      }
   }

   public static class End extends Index {
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
}
