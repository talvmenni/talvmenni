package org.forritan.talvmenni.bitboard.evaluation;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

   public static Test suite() {
      TestSuite suite = new TestSuite(
         "Test for org.forritan.talvmenni.bitboard.evaluation");
      //$JUnit-BEGIN$
      suite.addTestSuite(BoardTest.class);
      //$JUnit-END$
      return suite;
   }
}