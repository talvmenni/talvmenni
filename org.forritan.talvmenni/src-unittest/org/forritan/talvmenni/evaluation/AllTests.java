/*
 * Created on Aug 2, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package org.forritan.talvmenni.evaluation;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author eydun
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
public class AllTests {

   public static Test suite() {
      TestSuite suite= new TestSuite(
            "Test for org.forritan.talvmenni.evaluation");
      //$JUnit-BEGIN$
      suite.addTestSuite(SimpleMaterialEvaluationTest.class);
      //$JUnit-END$
      return suite;
   }
}
