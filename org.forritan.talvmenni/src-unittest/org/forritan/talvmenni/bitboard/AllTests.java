package org.forritan.talvmenni.bitboard;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

   public static Test suite() {
      TestSuite suite = new TestSuite(
         "Test for org.forritan.shallowsenior.bitboard");

      //$JUnit-BEGIN$
      suite.addTestSuite(SquareTest.class);
      suite.addTestSuite(SlashDiagonalTest.class);
      suite.addTestSuite(BishopMaskTest.class);
      suite.addTestSuite(FileTest.class);
      suite.addTestSuite(SquaresTest.class);
      suite.addTestSuite(RankTest.class);
      suite.addTestSuite(BishopMasksTest.class);
      suite.addTestSuite(BackSlashDiagonalTest.class);
      suite.addTestSuite(RookMasksTest.class);
      suite.addTestSuite(RookMaskTest.class);
      //$JUnit-END$

      suite.addTest(org.forritan.talvmenni.bitboard.paths.AllTests.suite());
      suite.addTest(org.forritan.talvmenni.bitboard.attacks.AllTests.suite());
      suite.addTest(org.forritan.talvmenni.bitboard.game.AllTests.suite());
      suite.addTest(org.forritan.talvmenni.bitboard.evaluation.AllTests.suite());

      return suite;
   }
}