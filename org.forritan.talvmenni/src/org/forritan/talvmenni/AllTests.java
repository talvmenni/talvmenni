package org.forritan.talvmenni;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

   public static Test suite() {
      TestSuite suite= new TestSuite(
            "Test for org.forritan.talvmenni");
      //$JUnit-BEGIN$

      //$JUnit-END$
      
      suite.addTest(org.forritan.talvmenni.bitboard.AllTests.suite());
      suite.addTest(org.forritan.talvmenni.evaluation.AllTests.suite());

      return suite;
   }
}
