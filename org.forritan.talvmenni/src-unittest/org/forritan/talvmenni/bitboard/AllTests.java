package org.forritan.talvmenni.bitboard;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

   public static Test suite() {
      TestSuite suite = new TestSuite(
         "Test for org.forritan.shallowsenior.bitboard");
      //$JUnit-BEGIN$
      suite.addTestSuite(SquareTest.class);
      suite.addTestSuite(FileTest.class);
      suite.addTestSuite(RankTest.class);
      suite.addTest(org.forritan.talvmenni.bitboard.paths.AllTests.suite());
      suite.addTest(org.forritan.talvmenni.bitboard.attacks.AllTests.suite());
      //$JUnit-END$
      return suite;
   }
}