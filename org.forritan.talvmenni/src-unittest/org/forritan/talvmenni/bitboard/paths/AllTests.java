package org.forritan.talvmenni.bitboard.paths;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

   public static Test suite() {
      TestSuite suite = new TestSuite(
         "Test for org.forritan.shallowsenior.bitboard.attacks");
      //$JUnit-BEGIN$
      suite.addTestSuite(RookTest.class);
      suite.addTestSuite(QueenTest.class);
      suite.addTestSuite(BishopTest.class);
      suite.addTestSuite(KnightTest.class);
      suite.addTestSuite(KingTest.class);
      suite.addTestSuite(WhitePawnMoveTest.class);
      suite.addTestSuite(BlackPawnMoveTest.class);
      suite.addTestSuite(BlackPawnKillTest.class);
      suite.addTestSuite(WhitePawnKillTest.class);
      //$JUnit-END$
      return suite;
   }
}