package org.forritan.talvmenni.bitboard;

import junit.framework.Assert;
import junit.framework.TestCase;


public class BackSlashDiagonalTest extends TestCase {

   private final String[] zeroPrefix = new String[64];

   public BackSlashDiagonalTest() {
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

   public void testA1A1() {
      Assert.assertEquals("" + //
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // B2-H2
            "10000000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(BackSlashDiagonal._A1A1).length() - 1] + Long
            .toBinaryString(BackSlashDiagonal._A1A1)));
   }
   public void testA2B1() {
      Assert.assertEquals("" + //
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "10000000" + // B2-H2
            "01000000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(BackSlashDiagonal._A2B1).length() - 1] + Long
            .toBinaryString(BackSlashDiagonal._A2B1)));
   }
   public void testA3C1() {
      Assert.assertEquals("" + //
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "10000000" + // A3-H3
            "01000000" + // B2-H2
            "00100000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(BackSlashDiagonal._A3C1).length() - 1] + Long
            .toBinaryString(BackSlashDiagonal._A3C1)));
   }
   public void testA4D1() {
      Assert.assertEquals("" + //
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "10000000" + // A4-H4
            "01000000" + // A3-H3
            "00100000" + // B2-H2
            "00010000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(BackSlashDiagonal._A4D1).length() - 1] + Long
            .toBinaryString(BackSlashDiagonal._A4D1)));
   }
   public void testA5E1() {
      Assert.assertEquals("" + //
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "10000000" + // A5-H5
            "01000000" + // A4-H4
            "00100000" + // A3-H3
            "00010000" + // B2-H2
            "00001000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(BackSlashDiagonal._A5E1).length() - 1] + Long
            .toBinaryString(BackSlashDiagonal._A5E1)));
   }
   public void testA6F1() {
      Assert.assertEquals("" + //
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "10000000" + // A6-H6
            "01000000" + // A5-H5
            "00100000" + // A4-H4
            "00010000" + // A3-H3
            "00001000" + // B2-H2
            "00000100" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(BackSlashDiagonal._A6F1).length() - 1] + Long
            .toBinaryString(BackSlashDiagonal._A6F1)));
   }
   public void testA7G1() {
      Assert.assertEquals("" + //
            "00000000" + // A8-H8
            "10000000" + // A7-H7
            "01000000" + // A6-H6
            "00100000" + // A5-H5
            "00010000" + // A4-H4
            "00001000" + // A3-H3
            "00000100" + // B2-H2
            "00000010" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(BackSlashDiagonal._A7G1).length() - 1] + Long
            .toBinaryString(BackSlashDiagonal._A7G1)));
   }
   public void testA8H1() {
      Assert.assertEquals("" + //
            "10000000" + // A8-H8
            "01000000" + // A7-H7
            "00100000" + // A6-H6
            "00010000" + // A5-H5
            "00001000" + // A4-H4
            "00000100" + // A3-H3
            "00000010" + // B2-H2
            "00000001" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(BackSlashDiagonal._A8H1).length() - 1] + Long
            .toBinaryString(BackSlashDiagonal._A8H1)));
   }
   public void testB8H2() {
      Assert.assertEquals("" + //
            "01000000" + // A8-H8
            "00100000" + // A7-H7
            "00010000" + // A6-H6
            "00001000" + // A5-H5
            "00000100" + // A4-H4
            "00000010" + // A3-H3
            "00000001" + // B2-H2
            "00000000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(BackSlashDiagonal._B8H2).length() - 1] + Long
            .toBinaryString(BackSlashDiagonal._B8H2)));
   }
   public void testC8H3() {
      Assert.assertEquals("" + //
            "00100000" + // A8-H8
            "00010000" + // A7-H7
            "00001000" + // A6-H6
            "00000100" + // A5-H5
            "00000010" + // A4-H4
            "00000001" + // A3-H3
            "00000000" + // B2-H2
            "00000000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(BackSlashDiagonal._C8H3).length() - 1] + Long
            .toBinaryString(BackSlashDiagonal._C8H3)));
   }
   public void testD8H4() {
      Assert.assertEquals("" + //
            "00010000" + // A8-H8
            "00001000" + // A7-H7
            "00000100" + // A6-H6
            "00000010" + // A5-H5
            "00000001" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // B2-H2
            "00000000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(BackSlashDiagonal._D8H4).length() - 1] + Long
            .toBinaryString(BackSlashDiagonal._D8H4)));
   }
   public void testE8H5() {
      Assert.assertEquals("" + //
            "00001000" + // A8-H8
            "00000100" + // A7-H7
            "00000010" + // A6-H6
            "00000001" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // B2-H2
            "00000000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(BackSlashDiagonal._E8H5).length() - 1] + Long
            .toBinaryString(BackSlashDiagonal._E8H5)));
   }
   public void testF8H6() {
      Assert.assertEquals("" + //
            "00000100" + // A8-H8
            "00000010" + // A7-H7
            "00000001" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // B2-H2
            "00000000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(BackSlashDiagonal._F8H6).length() - 1] + Long
            .toBinaryString(BackSlashDiagonal._F8H6)));
   }
   public void testG8H7() {
      Assert.assertEquals("" + //
            "00000010" + // A8-H8
            "00000001" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // B2-H2
            "00000000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(BackSlashDiagonal._G8H7).length() - 1] + Long
            .toBinaryString(BackSlashDiagonal._G8H7)));
   }
   public void testH8H8() {
      Assert.assertEquals("" + //
            "00000001" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // B2-H2
            "00000000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(BackSlashDiagonal._H8H8).length() - 1] + Long
            .toBinaryString(BackSlashDiagonal._H8H8)));
   }

   
}