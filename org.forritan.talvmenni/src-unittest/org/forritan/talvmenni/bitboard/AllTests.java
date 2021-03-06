/**
 * talvmenni - A distributed chess-engine implemented in Java(TM)
 * and against Sun Microsystems Jini/JavaSpaces(TM).
 *  
 * Copyright (C) 2004-2006 Ey?un Lamhauge and Ey?un Nielsen
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

      suite.addTest(org.forritan.talvmenni.bitboard.attacks.AllTests.suite());
      suite.addTest(org.forritan.talvmenni.bitboard.knowledge.AllTests.suite());
      suite.addTest(org.forritan.talvmenni.bitboard.knowledge.evaluation.AllTests.suite());
      suite.addTest(org.forritan.talvmenni.bitboard.paths.AllTests.suite());
      suite.addTest(org.forritan.talvmenni.evaluation.AllTests.suite());

      return suite;
   }
}