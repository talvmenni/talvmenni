/*
 * Created on 04-04-2004
 * 
 * TODO To change the template for this generated file go to Window -
 * Preferences - Java - Code Generation - Code and Comments
 */
package org.forritan.talvmenni.bitboard;

import junit.framework.Assert;
import junit.framework.TestCase;


public class RookMaskTest extends TestCase {

   private final String[] zeroPrefix = new String[64];

   public RookMaskTest() {
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

   public void test_West2EastFromFileA() {
      Assert.assertEquals(
            ""
                  + //
                  "11111111"
                  + // A8-H8
                  "11111111"
                  + // A7-H7
                  "11111111"
                  + // A6-H6
                  "11111111"
                  + // A5-H5
                  "11111111"
                  + // A4-H4
                  "11111111"
                  + // A3-H3
                  "11111111"
                  + // B2-H2
                  "11111111" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._WEST2EAST_FROM_FILE_A).length() - 1] + Long
                  .toBinaryString(RookMask._WEST2EAST_FROM_FILE_A)));
   }

   public void test_West2EastFromFileB() {
      Assert.assertEquals(
            ""
                  + //
                  "01111111"
                  + // A8-H8
                  "01111111"
                  + // A7-H7
                  "01111111"
                  + // A6-H6
                  "01111111"
                  + // A5-H5
                  "01111111"
                  + // A4-H4
                  "01111111"
                  + // A3-H3
                  "01111111"
                  + // B2-H2
                  "01111111" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._WEST2EAST_FROM_FILE_B).length() - 1] + Long
                  .toBinaryString(RookMask._WEST2EAST_FROM_FILE_B)));
   }

   public void test_West2EastFromFileC() {
      Assert.assertEquals(
            ""
                  + //
                  "00111111"
                  + // A8-H8
                  "00111111"
                  + // A7-H7
                  "00111111"
                  + // A6-H6
                  "00111111"
                  + // A5-H5
                  "00111111"
                  + // A4-H4
                  "00111111"
                  + // A3-H3
                  "00111111"
                  + // B2-H2
                  "00111111" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._WEST2EAST_FROM_FILE_C).length() - 1] + Long
                  .toBinaryString(RookMask._WEST2EAST_FROM_FILE_C)));
   }

   public void test_West2EastFromFileD() {
      Assert.assertEquals(
            ""
                  + //
                  "00011111"
                  + // A8-H8
                  "00011111"
                  + // A7-H7
                  "00011111"
                  + // A6-H6
                  "00011111"
                  + // A5-H5
                  "00011111"
                  + // A4-H4
                  "00011111"
                  + // A3-H3
                  "00011111"
                  + // B2-H2
                  "00011111" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._WEST2EAST_FROM_FILE_D).length() - 1] + Long
                  .toBinaryString(RookMask._WEST2EAST_FROM_FILE_D)));
   }

   public void test_West2EastFromFileE() {
      Assert.assertEquals(
            ""
                  + //
                  "00001111"
                  + // A8-H8
                  "00001111"
                  + // A7-H7
                  "00001111"
                  + // A6-H6
                  "00001111"
                  + // A5-H5
                  "00001111"
                  + // A4-H4
                  "00001111"
                  + // A3-H3
                  "00001111"
                  + // B2-H2
                  "00001111" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._WEST2EAST_FROM_FILE_E).length() - 1] + Long
                  .toBinaryString(RookMask._WEST2EAST_FROM_FILE_E)));
   }

   public void test_West2EastFromFileF() {
      Assert.assertEquals(
            ""
                  + //
                  "00000111"
                  + // A8-H8
                  "00000111"
                  + // A7-H7
                  "00000111"
                  + // A6-H6
                  "00000111"
                  + // A5-H5
                  "00000111"
                  + // A4-H4
                  "00000111"
                  + // A3-H3
                  "00000111"
                  + // B2-H2
                  "00000111" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._WEST2EAST_FROM_FILE_F).length() - 1] + Long
                  .toBinaryString(RookMask._WEST2EAST_FROM_FILE_F)));
   }

   public void test_West2EastFromFileG() {
      Assert.assertEquals(
            ""
                  + //
                  "00000011"
                  + // A8-H8
                  "00000011"
                  + // A7-H7
                  "00000011"
                  + // A6-H6
                  "00000011"
                  + // A5-H5
                  "00000011"
                  + // A4-H4
                  "00000011"
                  + // A3-H3
                  "00000011"
                  + // B2-H2
                  "00000011" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._WEST2EAST_FROM_FILE_G).length() - 1] + Long
                  .toBinaryString(RookMask._WEST2EAST_FROM_FILE_G)));
   }

   public void test_West2EastFromFileH() {
      Assert.assertEquals(
            ""
                  + //
                  "00000001"
                  + // A8-H8
                  "00000001"
                  + // A7-H7
                  "00000001"
                  + // A6-H6
                  "00000001"
                  + // A5-H5
                  "00000001"
                  + // A4-H4
                  "00000001"
                  + // A3-H3
                  "00000001"
                  + // B2-H2
                  "00000001" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._WEST2EAST_FROM_FILE_H).length() - 1] + Long
                  .toBinaryString(RookMask._WEST2EAST_FROM_FILE_H)));
   }

   public void test_East2WestFromFileA() {
      Assert.assertEquals(
            ""
                  + //
                  "10000000"
                  + // A8-H8
                  "10000000"
                  + // A7-H7
                  "10000000"
                  + // A6-H6
                  "10000000"
                  + // A5-H5
                  "10000000"
                  + // A4-H4
                  "10000000"
                  + // A3-H3
                  "10000000"
                  + // B2-H2
                  "10000000" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._EAST2WEST_FROM_FILE_A).length() - 1] + Long
                  .toBinaryString(RookMask._EAST2WEST_FROM_FILE_A)));
   }

   public void test_East2WestFromFileB() {
      Assert.assertEquals(
            ""
                  + //
                  "11000000"
                  + // A8-H8
                  "11000000"
                  + // A7-H7
                  "11000000"
                  + // A6-H6
                  "11000000"
                  + // A5-H5
                  "11000000"
                  + // A4-H4
                  "11000000"
                  + // A3-H3
                  "11000000"
                  + // B2-H2
                  "11000000" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._EAST2WEST_FROM_FILE_B).length() - 1] + Long
                  .toBinaryString(RookMask._EAST2WEST_FROM_FILE_B)));
   }

   public void test_East2WestFromFileC() {
      Assert.assertEquals(
            ""
                  + //
                  "11100000"
                  + // A8-H8
                  "11100000"
                  + // A7-H7
                  "11100000"
                  + // A6-H6
                  "11100000"
                  + // A5-H5
                  "11100000"
                  + // A4-H4
                  "11100000"
                  + // A3-H3
                  "11100000"
                  + // B2-H2
                  "11100000" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._EAST2WEST_FROM_FILE_C).length() - 1] + Long
                  .toBinaryString(RookMask._EAST2WEST_FROM_FILE_C)));
   }

   public void test_East2WestFromFileD() {
      Assert.assertEquals(
            ""
                  + //
                  "11110000"
                  + // A8-H8
                  "11110000"
                  + // A7-H7
                  "11110000"
                  + // A6-H6
                  "11110000"
                  + // A5-H5
                  "11110000"
                  + // A4-H4
                  "11110000"
                  + // A3-H3
                  "11110000"
                  + // B2-H2
                  "11110000" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._EAST2WEST_FROM_FILE_D).length() - 1] + Long
                  .toBinaryString(RookMask._EAST2WEST_FROM_FILE_D)));
   }

   public void test_East2WestFromFileE() {
      Assert.assertEquals(
            ""
                  + //
                  "11111000"
                  + // A8-H8
                  "11111000"
                  + // A7-H7
                  "11111000"
                  + // A6-H6
                  "11111000"
                  + // A5-H5
                  "11111000"
                  + // A4-H4
                  "11111000"
                  + // A3-H3
                  "11111000"
                  + // B2-H2
                  "11111000" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._EAST2WEST_FROM_FILE_E).length() - 1] + Long
                  .toBinaryString(RookMask._EAST2WEST_FROM_FILE_E)));
   }

   public void test_East2WestFromFileF() {
      Assert.assertEquals(
            ""
                  + //
                  "11111100"
                  + // A8-H8
                  "11111100"
                  + // A7-H7
                  "11111100"
                  + // A6-H6
                  "11111100"
                  + // A5-H5
                  "11111100"
                  + // A4-H4
                  "11111100"
                  + // A3-H3
                  "11111100"
                  + // B2-H2
                  "11111100" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._EAST2WEST_FROM_FILE_F).length() - 1] + Long
                  .toBinaryString(RookMask._EAST2WEST_FROM_FILE_F)));
   }

   public void test_East2WestFromFileG() {
      Assert.assertEquals(
            ""
                  + //
                  "11111110"
                  + // A8-H8
                  "11111110"
                  + // A7-H7
                  "11111110"
                  + // A6-H6
                  "11111110"
                  + // A5-H5
                  "11111110"
                  + // A4-H4
                  "11111110"
                  + // A3-H3
                  "11111110"
                  + // B2-H2
                  "11111110" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._EAST2WEST_FROM_FILE_G).length() - 1] + Long
                  .toBinaryString(RookMask._EAST2WEST_FROM_FILE_G)));
   }

   public void test_East2WestFromFileH() {
      Assert.assertEquals(
            ""
                  + //
                  "11111111"
                  + // A8-H8
                  "11111111"
                  + // A7-H7
                  "11111111"
                  + // A6-H6
                  "11111111"
                  + // A5-H5
                  "11111111"
                  + // A4-H4
                  "11111111"
                  + // A3-H3
                  "11111111"
                  + // B2-H2
                  "11111111" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._EAST2WEST_FROM_FILE_H).length() - 1] + Long
                  .toBinaryString(RookMask._EAST2WEST_FROM_FILE_H)));
   }


   public void test_North2SouthFromRank1() {
      Assert.assertEquals(
            ""
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
                  + // B2-H2
                  "11111111" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._NORTH2SOUTH_FROM_RANK_1).length() - 1] + Long
                  .toBinaryString(RookMask._NORTH2SOUTH_FROM_RANK_1)));
   }

   public void test_North2SouthFromRank2() {
      Assert.assertEquals(
            ""
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
                  "11111111"
                  + // B2-H2
                  "11111111" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._NORTH2SOUTH_FROM_RANK_2).length() - 1] + Long
                  .toBinaryString(RookMask._NORTH2SOUTH_FROM_RANK_2)));
   }

   public void test_North2SouthFromRank3() {
      Assert.assertEquals(
            ""
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
                  "11111111"
                  + // A3-H3
                  "11111111"
                  + // B2-H2
                  "11111111" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._NORTH2SOUTH_FROM_RANK_3).length() - 1] + Long
                  .toBinaryString(RookMask._NORTH2SOUTH_FROM_RANK_3)));
   }

   public void test_North2SouthFromRank4() {
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "11111111"
                  + // A4-H4
                  "11111111"
                  + // A3-H3
                  "11111111"
                  + // B2-H2
                  "11111111" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._NORTH2SOUTH_FROM_RANK_4).length() - 1] + Long
                  .toBinaryString(RookMask._NORTH2SOUTH_FROM_RANK_4)));
   }

   public void test_North2SouthFromRank5() {
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "11111111"
                  + // A5-H5
                  "11111111"
                  + // A4-H4
                  "11111111"
                  + // A3-H3
                  "11111111"
                  + // B2-H2
                  "11111111" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._NORTH2SOUTH_FROM_RANK_5).length() - 1] + Long
                  .toBinaryString(RookMask._NORTH2SOUTH_FROM_RANK_5)));
   }

   public void test_North2SouthFromRank6() {
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "11111111"
                  + // A6-H6
                  "11111111"
                  + // A5-H5
                  "11111111"
                  + // A4-H4
                  "11111111"
                  + // A3-H3
                  "11111111"
                  + // B2-H2
                  "11111111" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._NORTH2SOUTH_FROM_RANK_6).length() - 1] + Long
                  .toBinaryString(RookMask._NORTH2SOUTH_FROM_RANK_6)));
   }

   public void test_North2SouthFromRank7() {
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "11111111"
                  + // A7-H7
                  "11111111"
                  + // A6-H6
                  "11111111"
                  + // A5-H5
                  "11111111"
                  + // A4-H4
                  "11111111"
                  + // A3-H3
                  "11111111"
                  + // B2-H2
                  "11111111" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._NORTH2SOUTH_FROM_RANK_7).length() - 1] + Long
                  .toBinaryString(RookMask._NORTH2SOUTH_FROM_RANK_7)));
   }

   public void test_North2SouthFromRank8() {
      Assert.assertEquals(
            ""
                  + //
                  "11111111"
                  + // A8-H8
                  "11111111"
                  + // A7-H7
                  "11111111"
                  + // A6-H6
                  "11111111"
                  + // A5-H5
                  "11111111"
                  + // A4-H4
                  "11111111"
                  + // A3-H3
                  "11111111"
                  + // B2-H2
                  "11111111" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._NORTH2SOUTH_FROM_RANK_8).length() - 1] + Long
                  .toBinaryString(RookMask._NORTH2SOUTH_FROM_RANK_8)));
   }

   public void test_South2NorthFromRank1() {
      Assert.assertEquals(
            ""
                  + //
                  "11111111"
                  + // A8-H8
                  "11111111"
                  + // A7-H7
                  "11111111"
                  + // A6-H6
                  "11111111"
                  + // A5-H5
                  "11111111"
                  + // A4-H4
                  "11111111"
                  + // A3-H3
                  "11111111"
                  + // B2-H2
                  "11111111" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._SOUTH2NORTH_FROM_RANK_1).length() - 1] + Long
                  .toBinaryString(RookMask._SOUTH2NORTH_FROM_RANK_1)));
   }

   public void test_South2NorthFromRank2() {
      Assert.assertEquals(
            ""
                  + //
                  "11111111"
                  + // A8-H8
                  "11111111"
                  + // A7-H7
                  "11111111"
                  + // A6-H6
                  "11111111"
                  + // A5-H5
                  "11111111"
                  + // A4-H4
                  "11111111"
                  + // A3-H3
                  "11111111"
                  + // B2-H2
                  "00000000" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._SOUTH2NORTH_FROM_RANK_2).length() - 1] + Long
                  .toBinaryString(RookMask._SOUTH2NORTH_FROM_RANK_2)));
   }

   public void test_South2NorthFromRank3() {
      Assert.assertEquals(
            ""
                  + //
                  "11111111"
                  + // A8-H8
                  "11111111"
                  + // A7-H7
                  "11111111"
                  + // A6-H6
                  "11111111"
                  + // A5-H5
                  "11111111"
                  + // A4-H4
                  "11111111"
                  + // A3-H3
                  "00000000"
                  + // B2-H2
                  "00000000" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._SOUTH2NORTH_FROM_RANK_3).length() - 1] + Long
                  .toBinaryString(RookMask._SOUTH2NORTH_FROM_RANK_3)));
   }

   public void test_South2NorthFromRank4() {
      Assert.assertEquals(
            ""
                  + //
                  "11111111"
                  + // A8-H8
                  "11111111"
                  + // A7-H7
                  "11111111"
                  + // A6-H6
                  "11111111"
                  + // A5-H5
                  "11111111"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // B2-H2
                  "00000000" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._SOUTH2NORTH_FROM_RANK_4).length() - 1] + Long
                  .toBinaryString(RookMask._SOUTH2NORTH_FROM_RANK_4)));
   }

   public void test_South2NorthFromRank5() {
      Assert.assertEquals(
            ""
                  + //
                  "11111111"
                  + // A8-H8
                  "11111111"
                  + // A7-H7
                  "11111111"
                  + // A6-H6
                  "11111111"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // B2-H2
                  "00000000" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._SOUTH2NORTH_FROM_RANK_5).length() - 1] + Long
                  .toBinaryString(RookMask._SOUTH2NORTH_FROM_RANK_5)));
   }

   public void test_South2NorthFromRank6() {
      Assert.assertEquals(
            ""
                  + //
                  "11111111"
                  + // A8-H8
                  "11111111"
                  + // A7-H7
                  "11111111"
                  + // A6-H6
                  "00000000"
                  + // A5-H5
                  "00000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // B2-H2
                  "00000000" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._SOUTH2NORTH_FROM_RANK_6).length() - 1] + Long
                  .toBinaryString(RookMask._SOUTH2NORTH_FROM_RANK_6)));
   }

   public void test_South2NorthFromRank7() {
      Assert.assertEquals(
            ""
                  + //
                  "11111111"
                  + // A8-H8
                  "11111111"
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
                  + // B2-H2
                  "00000000" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._SOUTH2NORTH_FROM_RANK_7).length() - 1] + Long
                  .toBinaryString(RookMask._SOUTH2NORTH_FROM_RANK_7)));
   }

   public void test_South2NorthFromRank8() {
      Assert.assertEquals(
            ""
                  + //
                  "11111111"
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
                  + // B2-H2
                  "00000000" // A1-H1
            ,
            (this.zeroPrefix[Long.toBinaryString(
                  RookMask._SOUTH2NORTH_FROM_RANK_8).length() - 1] + Long
                  .toBinaryString(RookMask._SOUTH2NORTH_FROM_RANK_8)));
   }

   
}

