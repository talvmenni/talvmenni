/*
 * Created on 04-04-2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package org.forritan.talvmenni.bitboard;

import junit.framework.Assert;
import junit.framework.TestCase;


public class FileTest extends TestCase {

      private final String[] zeroPrefix = new String[64];

      public FileTest() {
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

      public void test1() {
         Assert.assertEquals(
               "10000000" + // H1-H8
               "10000000" + // G1-G8
               "10000000" + // F1-F8
               "10000000" + // E1-E8
               "10000000" + // D1-D8
               "10000000" + // C1-C8
               "10000000" + // B1-B8
               "10000000" // A1-A8
         , (this.zeroPrefix[Long.toBinaryString(File._1).length() - 1] + Long
               .toBinaryString(File._1)));
      }

      public void test2() {
         Assert.assertEquals("01000000" + // H1-H8
               "01000000" + // G1-G8
               "01000000" + // F1-F8
               "01000000" + // E1-E8
               "01000000" + // D1-D8
               "01000000" + // C1-C8
               "01000000" + // B1-B8
               "01000000" // A1-A8
         , (this.zeroPrefix[Long.toBinaryString(File._2).length() - 1] + Long
               .toBinaryString(File._2)));
      }

      public void test3() {
         Assert.assertEquals("00100000" + // H1-H8
               "00100000" + // G1-G8
               "00100000" + // F1-F8
               "00100000" + // E1-E8
               "00100000" + // D1-D8
               "00100000" + // C1-C8
               "00100000" + // B1-B8
               "00100000" // A1-A8
         , (this.zeroPrefix[Long.toBinaryString(File._3).length() - 1] + Long
               .toBinaryString(File._3)));
      }

      public void test4() {
         Assert.assertEquals("00010000" + // H1-H8
               "00010000" + // G1-G8
               "00010000" + // F1-F8
               "00010000" + // E1-E8
               "00010000" + // D1-D8
               "00010000" + // C1-C8
               "00010000" + // B1-B8
               "00010000" // A1-A8
         , (this.zeroPrefix[Long.toBinaryString(File._4).length() - 1] + Long
               .toBinaryString(File._4)));
      }

      public void test5() {
         Assert.assertEquals("00001000" + // H1-H8
               "00001000" + // G1-G8
               "00001000" + // F1-F8
               "00001000" + // E1-E8
               "00001000" + // D1-D8
               "00001000" + // C1-C8
               "00001000" + // B1-B8
               "00001000" // A1-A8
         , (this.zeroPrefix[Long.toBinaryString(File._5).length() - 1] + Long
               .toBinaryString(File._5)));
      }

      public void test6() {
         Assert.assertEquals("00000100" + // H1-H8
               "00000100" + // G1-G8
               "00000100" + // F1-F8
               "00000100" + // E1-E8
               "00000100" + // D1-D8
               "00000100" + // C1-C8
               "00000100" + // B1-B8
               "00000100" // A1-A8
         , (this.zeroPrefix[Long.toBinaryString(File._6).length() - 1] + Long
               .toBinaryString(File._6)));
      }

      public void test7() {
         Assert.assertEquals("00000010" + // H1-H8
               "00000010" + // G1-G8
               "00000010" + // F1-F8
               "00000010" + // E1-E8
               "00000010" + // D1-D8
               "00000010" + // C1-C8
               "00000010" + // B1-B8
               "00000010" // A1-A8
         , (this.zeroPrefix[Long.toBinaryString(File._7).length() - 1] + Long
               .toBinaryString(File._7)));
      }

      public void test8() {
         Assert.assertEquals("00000001" + // H1-H8
               "00000001" + // G1-G8
               "00000001" + // F1-F8
               "00000001" + // E1-E8
               "00000001" + // D1-D8
               "00000001" + // C1-C8
               "00000001" + // B1-B8
               "00000001" // A1-A8
         , (this.zeroPrefix[Long.toBinaryString(File._8).length() - 1] + Long
               .toBinaryString(File._8)));
      }
   }