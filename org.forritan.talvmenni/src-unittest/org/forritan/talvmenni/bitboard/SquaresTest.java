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
      long sq;

      sq= square.getSquare(0);
      Assert.assertTrue(sq == Square._A8);
      sq= square.getSquare(1);
      Assert.assertTrue(sq == Square._B8);
      sq= square.getSquare(2);
      Assert.assertTrue(sq == Square._C8);
      sq= square.getSquare(3);
      Assert.assertTrue(sq == Square._D8);
      sq= square.getSquare(4);
      Assert.assertTrue(sq == Square._E8);
      sq= square.getSquare(5);
      Assert.assertTrue(sq == Square._F8);
      sq= square.getSquare(6);
      Assert.assertTrue(sq == Square._G8);
      sq= square.getSquare(7);
      Assert.assertTrue(sq == Square._H8);

      sq= square.getSquare(8);
      Assert.assertTrue(sq == Square._A7);
      sq= square.getSquare(9);
      Assert.assertTrue(sq == Square._B7);
      sq= square.getSquare(10);
      Assert.assertTrue(sq == Square._C7);
      sq= square.getSquare(11);
      Assert.assertTrue(sq == Square._D7);
      sq= square.getSquare(12);
      Assert.assertTrue(sq == Square._E7);
      sq= square.getSquare(13);
      Assert.assertTrue(sq == Square._F7);
      sq= square.getSquare(14);
      Assert.assertTrue(sq == Square._G7);
      sq= square.getSquare(15);
      Assert.assertTrue(sq == Square._H7);

      sq= square.getSquare(16);
      Assert.assertTrue(sq == Square._A6);
      sq= square.getSquare(17);
      Assert.assertTrue(sq == Square._B6);
      sq= square.getSquare(18);
      Assert.assertTrue(sq == Square._C6);
      sq= square.getSquare(19);
      Assert.assertTrue(sq == Square._D6);
      sq= square.getSquare(20);
      Assert.assertTrue(sq == Square._E6);
      sq= square.getSquare(21);
      Assert.assertTrue(sq == Square._F6);
      sq= square.getSquare(22);
      Assert.assertTrue(sq == Square._G6);
      sq= square.getSquare(23);
      Assert.assertTrue(sq == Square._H6);

      sq= square.getSquare(24);
      Assert.assertTrue(sq == Square._A5);
      sq= square.getSquare(25);
      Assert.assertTrue(sq == Square._B5);
      sq= square.getSquare(26);
      Assert.assertTrue(sq == Square._C5);
      sq= square.getSquare(27);
      Assert.assertTrue(sq == Square._D5);
      sq= square.getSquare(28);
      Assert.assertTrue(sq == Square._E5);
      sq= square.getSquare(29);
      Assert.assertTrue(sq == Square._F5);
      sq= square.getSquare(30);
      Assert.assertTrue(sq == Square._G5);
      sq= square.getSquare(31);
      Assert.assertTrue(sq == Square._H5);

      sq= square.getSquare(32);
      Assert.assertTrue(sq == Square._A4);
      sq= square.getSquare(33);
      Assert.assertTrue(sq == Square._B4);
      sq= square.getSquare(34);
      Assert.assertTrue(sq == Square._C4);
      sq= square.getSquare(35);
      Assert.assertTrue(sq == Square._D4);
      sq= square.getSquare(36);
      Assert.assertTrue(sq == Square._E4);
      sq= square.getSquare(37);
      Assert.assertTrue(sq == Square._F4);
      sq= square.getSquare(38);
      Assert.assertTrue(sq == Square._G4);
      sq= square.getSquare(39);
      Assert.assertTrue(sq == Square._H4);

      sq= square.getSquare(40);
      Assert.assertTrue(sq == Square._A3);
      sq= square.getSquare(41);
      Assert.assertTrue(sq == Square._B3);
      sq= square.getSquare(42);
      Assert.assertTrue(sq == Square._C3);
      sq= square.getSquare(43);
      Assert.assertTrue(sq == Square._D3);
      sq= square.getSquare(44);
      Assert.assertTrue(sq == Square._E3);
      sq= square.getSquare(45);
      Assert.assertTrue(sq == Square._F3);
      sq= square.getSquare(46);
      Assert.assertTrue(sq == Square._G3);
      sq= square.getSquare(47);
      Assert.assertTrue(sq == Square._H3);

      sq= square.getSquare(48);
      Assert.assertTrue(sq == Square._A2);
      sq= square.getSquare(49);
      Assert.assertTrue(sq == Square._B2);
      sq= square.getSquare(50);
      Assert.assertTrue(sq == Square._C2);
      sq= square.getSquare(51);
      Assert.assertTrue(sq == Square._D2);
      sq= square.getSquare(52);
      Assert.assertTrue(sq == Square._E2);
      sq= square.getSquare(53);
      Assert.assertTrue(sq == Square._F2);
      sq= square.getSquare(54);
      Assert.assertTrue(sq == Square._G2);
      sq= square.getSquare(55);
      Assert.assertTrue(sq == Square._H2);

      sq= square.getSquare(56);
      Assert.assertTrue(sq == Square._A1);
      sq= square.getSquare(57);
      Assert.assertTrue(sq == Square._B1);
      sq= square.getSquare(58);
      Assert.assertTrue(sq == Square._C1);
      sq= square.getSquare(59);
      Assert.assertTrue(sq == Square._D1);
      sq= square.getSquare(60);
      Assert.assertTrue(sq == Square._E1);
      sq= square.getSquare(61);
      Assert.assertTrue(sq == Square._F1);
      sq= square.getSquare(62);
      Assert.assertTrue(sq == Square._G1);
      sq= square.getSquare(63);
      Assert.assertTrue(sq == Square._H1);

      sq= square.getSquare(64);
      Assert.assertTrue(sq == Square._EMPTY_BOARD);
      sq= square.getSquare(-1);
      Assert.assertTrue(sq == Square._EMPTY_BOARD);

   }

   public void testGetSquareString() {
      Square square= Squares.create();
      long sq;

      sq= square.getSquare("A1");
      Assert.assertTrue(sq == Square._A1);
      sq= square.getSquare("A2");
      Assert.assertTrue(sq == Square._A2);
      sq= square.getSquare("A3");
      Assert.assertTrue(sq == Square._A3);
      sq= square.getSquare("A4");
      Assert.assertTrue(sq == Square._A4);
      sq= square.getSquare("A5");
      Assert.assertTrue(sq == Square._A5);
      sq= square.getSquare("A6");
      Assert.assertTrue(sq == Square._A6);
      sq= square.getSquare("A7");
      Assert.assertTrue(sq == Square._A7);
      sq= square.getSquare("A8");
      Assert.assertTrue(sq == Square._A8);

      sq= square.getSquare("B1");
      Assert.assertTrue(sq == Square._B1);
      sq= square.getSquare("B2");
      Assert.assertTrue(sq == Square._B2);
      sq= square.getSquare("B3");
      Assert.assertTrue(sq == Square._B3);
      sq= square.getSquare("B4");
      Assert.assertTrue(sq == Square._B4);
      sq= square.getSquare("B5");
      Assert.assertTrue(sq == Square._B5);
      sq= square.getSquare("B6");
      Assert.assertTrue(sq == Square._B6);
      sq= square.getSquare("B7");
      Assert.assertTrue(sq == Square._B7);
      sq= square.getSquare("B8");
      Assert.assertTrue(sq == Square._B8);

      sq= square.getSquare("C1");
      Assert.assertTrue(sq == Square._C1);
      sq= square.getSquare("C2");
      Assert.assertTrue(sq == Square._C2);
      sq= square.getSquare("C3");
      Assert.assertTrue(sq == Square._C3);
      sq= square.getSquare("C4");
      Assert.assertTrue(sq == Square._C4);
      sq= square.getSquare("C5");
      Assert.assertTrue(sq == Square._C5);
      sq= square.getSquare("C6");
      Assert.assertTrue(sq == Square._C6);
      sq= square.getSquare("C7");
      Assert.assertTrue(sq == Square._C7);
      sq= square.getSquare("C8");
      Assert.assertTrue(sq == Square._C8);

      sq= square.getSquare("D1");
      Assert.assertTrue(sq == Square._D1);
      sq= square.getSquare("D2");
      Assert.assertTrue(sq == Square._D2);
      sq= square.getSquare("D3");
      Assert.assertTrue(sq == Square._D3);
      sq= square.getSquare("D4");
      Assert.assertTrue(sq == Square._D4);
      sq= square.getSquare("D5");
      Assert.assertTrue(sq == Square._D5);
      sq= square.getSquare("D6");
      Assert.assertTrue(sq == Square._D6);
      sq= square.getSquare("D7");
      Assert.assertTrue(sq == Square._D7);
      sq= square.getSquare("D8");
      Assert.assertTrue(sq == Square._D8);

      sq= square.getSquare("E1");
      Assert.assertTrue(sq == Square._E1);
      sq= square.getSquare("E2");
      Assert.assertTrue(sq == Square._E2);
      sq= square.getSquare("E3");
      Assert.assertTrue(sq == Square._E3);
      sq= square.getSquare("E4");
      Assert.assertTrue(sq == Square._E4);
      sq= square.getSquare("E5");
      Assert.assertTrue(sq == Square._E5);
      sq= square.getSquare("E6");
      Assert.assertTrue(sq == Square._E6);
      sq= square.getSquare("E7");
      Assert.assertTrue(sq == Square._E7);
      sq= square.getSquare("E8");
      Assert.assertTrue(sq == Square._E8);

      sq= square.getSquare("F1");
      Assert.assertTrue(sq == Square._F1);
      sq= square.getSquare("F2");
      Assert.assertTrue(sq == Square._F2);
      sq= square.getSquare("F3");
      Assert.assertTrue(sq == Square._F3);
      sq= square.getSquare("F4");
      Assert.assertTrue(sq == Square._F4);
      sq= square.getSquare("F5");
      Assert.assertTrue(sq == Square._F5);
      sq= square.getSquare("F6");
      Assert.assertTrue(sq == Square._F6);
      sq= square.getSquare("F7");
      Assert.assertTrue(sq == Square._F7);
      sq= square.getSquare("F8");
      Assert.assertTrue(sq == Square._F8);

      sq= square.getSquare("G1");
      Assert.assertTrue(sq == Square._G1);
      sq= square.getSquare("G2");
      Assert.assertTrue(sq == Square._G2);
      sq= square.getSquare("G3");
      Assert.assertTrue(sq == Square._G3);
      sq= square.getSquare("G4");
      Assert.assertTrue(sq == Square._G4);
      sq= square.getSquare("G5");
      Assert.assertTrue(sq == Square._G5);
      sq= square.getSquare("G6");
      Assert.assertTrue(sq == Square._G6);
      sq= square.getSquare("G7");
      Assert.assertTrue(sq == Square._G7);
      sq= square.getSquare("G8");
      Assert.assertTrue(sq == Square._G8);

      sq= square.getSquare("H1");
      Assert.assertTrue(sq == Square._H1);
      sq= square.getSquare("H2");
      Assert.assertTrue(sq == Square._H2);
      sq= square.getSquare("H3");
      Assert.assertTrue(sq == Square._H3);
      sq= square.getSquare("H4");
      Assert.assertTrue(sq == Square._H4);
      sq= square.getSquare("H5");
      Assert.assertTrue(sq == Square._H5);
      sq= square.getSquare("H6");
      Assert.assertTrue(sq == Square._H6);
      sq= square.getSquare("H7");
      Assert.assertTrue(sq == Square._H7);
      sq= square.getSquare("H8");
      Assert.assertTrue(sq == Square._H8);

   }

   public void testGetSquareName() {
      Square square= Squares.create();
      String[] names= new String[] {
            "A8",
            "B8",
            "C8",
            "D8",
            "E8",
            "F8",
            "G8",
            "H8",
            "A7",
            "B7",
            "C7",
            "D7",
            "E7",
            "F7",
            "G7",
            "H7",
            "A6",
            "B6",
            "C6",
            "D6",
            "E6",
            "F6",
            "G6",
            "H6",
            "A5",
            "B5",
            "C5",
            "D5",
            "E5",
            "F5",
            "G5",
            "H5",
            "A4",
            "B4",
            "C4",
            "D4",
            "E4",
            "F4",
            "G4",
            "H4",
            "A3",
            "B3",
            "C3",
            "D3",
            "E3",
            "F3",
            "G3",
            "H3",
            "A2",
            "B2",
            "C2",
            "D2",
            "E2",
            "F2",
            "G2",
            "H2",
            "A1",
            "B1",
            "C1",
            "D1",
            "E1",
            "F1",
            "G1",
            "H1",};
      for (int i= 0; i < names.length; i++) {
         Assert.assertEquals(
               names[i],
               square.getSquareName(square.getSquare(i)));
      }
   }

}