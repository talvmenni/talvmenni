package org.forritan.talvmenni.bitboard;

import junit.framework.Assert;
import junit.framework.TestCase;


public class SquaresTest extends TestCase {

   protected void setUp() throws Exception {
      super.setUp();
   }

   protected void tearDown() throws Exception {
      super.tearDown();
   }

   public void testCreate() {
      Square square= Squares.create();
      Assert.assertTrue(square != null);
   }

   public void testGetSquareint() {
      Square square= Squares.create();
      long sq= square.getSquare(0);
      Assert.assertTrue(sq == Square._A8);
   }

   public void testGetSquareString() {
      Square square= Squares.create();
      long sq= square.getSquare("E1");
      Assert.assertTrue(sq == Square._E1);

   }

   public void testGetSquareName() {
      Square square= Squares.create();
      String sq= square.getSquareName(Square._A8);
      Assert.assertEquals("A8", sq);
   }

}