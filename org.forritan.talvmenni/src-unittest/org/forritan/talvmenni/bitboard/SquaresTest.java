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

      sq= square.getSquare(Square.Util.index(Square._A8));
      Assert.assertTrue(sq == Square._A8);
      sq= square.getSquare(Square.Util.index(Square._B8));
      Assert.assertTrue(sq == Square._B8);
      sq= square.getSquare(Square.Util.index(Square._C8));
      Assert.assertTrue(sq == Square._C8);
      sq= square.getSquare(Square.Util.index(Square._D8));
      Assert.assertTrue(sq == Square._D8);
      sq= square.getSquare(Square.Util.index(Square._E8));
      Assert.assertTrue(sq == Square._E8);
      sq= square.getSquare(Square.Util.index(Square._F8));
      Assert.assertTrue(sq == Square._F8);
      sq= square.getSquare(Square.Util.index(Square._G8));
      Assert.assertTrue(sq == Square._G8);
      sq= square.getSquare(Square.Util.index(Square._H8));
      Assert.assertTrue(sq == Square._H8);

      sq= square.getSquare(Square.Util.index(Square._A7));
      Assert.assertTrue(sq == Square._A7);
      sq= square.getSquare(Square.Util.index(Square._B7));
      Assert.assertTrue(sq == Square._B7);
      sq= square.getSquare(Square.Util.index(Square._C7));
      Assert.assertTrue(sq == Square._C7);
      sq= square.getSquare(Square.Util.index(Square._D7));
      Assert.assertTrue(sq == Square._D7);
      sq= square.getSquare(Square.Util.index(Square._E7));
      Assert.assertTrue(sq == Square._E7);
      sq= square.getSquare(Square.Util.index(Square._F7));
      Assert.assertTrue(sq == Square._F7);
      sq= square.getSquare(Square.Util.index(Square._G7));
      Assert.assertTrue(sq == Square._G7);
      sq= square.getSquare(Square.Util.index(Square._H7));
      Assert.assertTrue(sq == Square._H7);

      sq= square.getSquare(Square.Util.index(Square._A6));
      Assert.assertTrue(sq == Square._A6);
      sq= square.getSquare(Square.Util.index(Square._B6));
      Assert.assertTrue(sq == Square._B6);
      sq= square.getSquare(Square.Util.index(Square._C6));
      Assert.assertTrue(sq == Square._C6);
      sq= square.getSquare(Square.Util.index(Square._D6));
      Assert.assertTrue(sq == Square._D6);
      sq= square.getSquare(Square.Util.index(Square._E6));
      Assert.assertTrue(sq == Square._E6);
      sq= square.getSquare(Square.Util.index(Square._F6));
      Assert.assertTrue(sq == Square._F6);
      sq= square.getSquare(Square.Util.index(Square._G6));
      Assert.assertTrue(sq == Square._G6);
      sq= square.getSquare(Square.Util.index(Square._H6));
      Assert.assertTrue(sq == Square._H6);

      sq= square.getSquare(Square.Util.index(Square._A5));
      Assert.assertTrue(sq == Square._A5);
      sq= square.getSquare(Square.Util.index(Square._B5));
      Assert.assertTrue(sq == Square._B5);
      sq= square.getSquare(Square.Util.index(Square._C5));
      Assert.assertTrue(sq == Square._C5);
      sq= square.getSquare(Square.Util.index(Square._D5));
      Assert.assertTrue(sq == Square._D5);
      sq= square.getSquare(Square.Util.index(Square._E5));
      Assert.assertTrue(sq == Square._E5);
      sq= square.getSquare(Square.Util.index(Square._F5));
      Assert.assertTrue(sq == Square._F5);
      sq= square.getSquare(Square.Util.index(Square._G5));
      Assert.assertTrue(sq == Square._G5);
      sq= square.getSquare(Square.Util.index(Square._H5));
      Assert.assertTrue(sq == Square._H5);

      sq= square.getSquare(Square.Util.index(Square._A4));
      Assert.assertTrue(sq == Square._A4);
      sq= square.getSquare(Square.Util.index(Square._B4));
      Assert.assertTrue(sq == Square._B4);
      sq= square.getSquare(Square.Util.index(Square._C4));
      Assert.assertTrue(sq == Square._C4);
      sq= square.getSquare(Square.Util.index(Square._D4));
      Assert.assertTrue(sq == Square._D4);
      sq= square.getSquare(Square.Util.index(Square._E4));
      Assert.assertTrue(sq == Square._E4);
      sq= square.getSquare(Square.Util.index(Square._F4));
      Assert.assertTrue(sq == Square._F4);
      sq= square.getSquare(Square.Util.index(Square._G4));
      Assert.assertTrue(sq == Square._G4);
      sq= square.getSquare(Square.Util.index(Square._H4));
      Assert.assertTrue(sq == Square._H4);

      sq= square.getSquare(Square.Util.index(Square._A3));
      Assert.assertTrue(sq == Square._A3);
      sq= square.getSquare(Square.Util.index(Square._B3));
      Assert.assertTrue(sq == Square._B3);
      sq= square.getSquare(Square.Util.index(Square._C3));
      Assert.assertTrue(sq == Square._C3);
      sq= square.getSquare(Square.Util.index(Square._D3));
      Assert.assertTrue(sq == Square._D3);
      sq= square.getSquare(Square.Util.index(Square._E3));
      Assert.assertTrue(sq == Square._E3);
      sq= square.getSquare(Square.Util.index(Square._F3));
      Assert.assertTrue(sq == Square._F3);
      sq= square.getSquare(Square.Util.index(Square._G3));
      Assert.assertTrue(sq == Square._G3);
      sq= square.getSquare(Square.Util.index(Square._H3));
      Assert.assertTrue(sq == Square._H3);

      sq= square.getSquare(Square.Util.index(Square._A2));
      Assert.assertTrue(sq == Square._A2);
      sq= square.getSquare(Square.Util.index(Square._B2));
      Assert.assertTrue(sq == Square._B2);
      sq= square.getSquare(Square.Util.index(Square._C2));
      Assert.assertTrue(sq == Square._C2);
      sq= square.getSquare(Square.Util.index(Square._D2));
      Assert.assertTrue(sq == Square._D2);
      sq= square.getSquare(Square.Util.index(Square._E2));
      Assert.assertTrue(sq == Square._E2);
      sq= square.getSquare(Square.Util.index(Square._F2));
      Assert.assertTrue(sq == Square._F2);
      sq= square.getSquare(Square.Util.index(Square._G2));
      Assert.assertTrue(sq == Square._G2);
      sq= square.getSquare(Square.Util.index(Square._H2));
      Assert.assertTrue(sq == Square._H2);

      sq= square.getSquare(Square.Util.index(Square._A1));
      Assert.assertTrue(sq == Square._A1);
      sq= square.getSquare(Square.Util.index(Square._B1));
      Assert.assertTrue(sq == Square._B1);
      sq= square.getSquare(Square.Util.index(Square._C1));
      Assert.assertTrue(sq == Square._C1);
      sq= square.getSquare(Square.Util.index(Square._D1));
      Assert.assertTrue(sq == Square._D1);
      sq= square.getSquare(Square.Util.index(Square._E1));
      Assert.assertTrue(sq == Square._E1);
      sq= square.getSquare(Square.Util.index(Square._F1));
      Assert.assertTrue(sq == Square._F1);
      sq= square.getSquare(Square.Util.index(Square._G1));
      Assert.assertTrue(sq == Square._G1);
      sq= square.getSquare(Square.Util.index(Square._H1));
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
//*/
            "H1",
            "G1",
            "H7",
            "F1",
            "G8",
            "G7",
            "D4",
            "E1",
            "C8",
            "F8",
            "F7",
            "F6",
            "B5",
            "C4",
            "G3",
            "D1",
            "B8",
            "A7",
            "E8",
            "D5",
            "C7",
            "E7",
            "E6",
            "B3",
            "C6",
            "A5",
            "G5",
            "B4",
            "H4",
            "F3",
            "D2",
            "C1",
            "A8",
            "A6",
            "H8",
            "E4",
            "D8",
            "G6",
            "C5",
            "H3",
            "B7",
            "E5",
            "D7",
            "C3",
            "D6",
            "H5",
            "A3",
            "E2",
            "B6",
            "F4",
            "H6",
            "A2",
            "F5",
            "D3",
            "A4",
            "F2",
            "G4",
            "B2",
            "E3",
            "G2",
            "C2",
            "H2",
            "A1",
            "B1"
/*/
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
            "H1"
//*/
      };
      for (int i= 0; i < names.length; i++) {
         Assert.assertEquals(
               names[i],
               square.getSquareName(square.getSquare(i)).toUpperCase());
      }
   }

}