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

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

   public static Test suite() {
      TestSuite suite= new TestSuite("Test for org.forritan.util.jini");
      //$JUnit-BEGIN$
      suite.addTestSuite(ServiceLocator.TestServiceLocator.class);
      suite.addTestSuite(DistributedArray.TestDistributedArray.class);
      //$JUnit-END$
      return suite;
   }
}
