package org.forritan.talvmenni.bitboard.paths;

import junit.framework.Assert;
import junit.framework.TestCase;


public class WhitePawnTest extends TestCase {

   private final String[] zeroPrefix = new String[64];

   public WhitePawnTest() {
      for (int i= 0, j= 64; i < zeroPrefix.length; i++, j--) {
         StringBuffer zeroes= new StringBuffer();
         for (int k= 1; k < j; k++) {
            zeroes.append('0');
         }
         zeroPrefix[i]= zeroes.toString();
      }
   }

   protected void setUp() throws Exception {
      super.setUp();
   }

   protected void tearDown() throws Exception {
      super.tearDown();
   }

   public void testWhitePawnPathsFromA1() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00000000"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(WhitePawn._PATHS_FROM_A1)
                  .length() - 1] + Long.toBinaryString(WhitePawn._PATHS_FROM_A1)));
   }

   public void testWhitePawnPathsFromB1() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00000000"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // B1-H1
            (this.zeroPrefix[Long.toBinaryString(WhitePawn._PATHS_FROM_B1)
                  .length() - 1] + Long.toBinaryString(WhitePawn._PATHS_FROM_B1)));
   }

   public void testWhitePawnPathsFromC1() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00000000"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // C1-H1
            (this.zeroPrefix[Long.toBinaryString(WhitePawn._PATHS_FROM_C1)
                  .length() - 1] + Long.toBinaryString(WhitePawn._PATHS_FROM_C1)));
   }

   public void testWhitePawnPathsFromD1() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00000000"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // D1-H1
            (this.zeroPrefix[Long.toBinaryString(WhitePawn._PATHS_FROM_D1)
                  .length() - 1] + Long.toBinaryString(WhitePawn._PATHS_FROM_D1)));
   }
   public void testWhitePawnPathsFromE1() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00000000"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // E1-H1
            (this.zeroPrefix[Long.toBinaryString(WhitePawn._PATHS_FROM_E1)
                  .length() - 1] + Long.toBinaryString(WhitePawn._PATHS_FROM_E1)));
   }

   public void testWhitePawnPathsFromF1() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00000000"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // F1-H1
            (this.zeroPrefix[Long.toBinaryString(WhitePawn._PATHS_FROM_F1)
                  .length() - 1] + Long.toBinaryString(WhitePawn._PATHS_FROM_F1)));
   }
   
   public void testWhitePawnPathsFromG1() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00000000"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // G1-H1
            (this.zeroPrefix[Long.toBinaryString(WhitePawn._PATHS_FROM_G1)
                  .length() - 1] + Long.toBinaryString(WhitePawn._PATHS_FROM_G1)));
   }

   public void testWhitePawnPathsFromH1() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00000000"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // H1-H1
            (this.zeroPrefix[Long.toBinaryString(WhitePawn._PATHS_FROM_H1)
                  .length() - 1] + Long.toBinaryString(WhitePawn._PATHS_FROM_H1)));
   }

   public void testWhitePawnPathsFromA2() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00000000"
            + // A5-H5
            "10000000"
            + // A4-H4
            "11000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(WhitePawn._PATHS_FROM_A2)
                  .length() - 1] + Long.toBinaryString(WhitePawn._PATHS_FROM_A2)));
   }

   public void testWhitePawnPathsFromB2() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00000000"
            + // A5-H5
            "01000000"
            + // A4-H4
            "11100000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // B1-H1
            (this.zeroPrefix[Long.toBinaryString(WhitePawn._PATHS_FROM_B2)
                  .length() - 1] + Long.toBinaryString(WhitePawn._PATHS_FROM_B2)));
   }
   
}