package org.forritan.talvmenni.bitboard;

import junit.framework.Assert;
import junit.framework.TestCase;


public class RankTest extends TestCase {

      private final String[] zeroPrefix = new String[64];

      public RankTest() {
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

      public void testA() {
         Assert
               .assertEquals(
                     "00000000" + // H1-H8
                           "00000000" + // G1-G8
                           "00000000" + // F1-F8
                           "00000000" + // E1-E8
                           "00000000" + // D1-D8
                           "00000000" + // C1-C8
                           "00000000" + // B1-B8
                           "11111111",
                     // A1-A8
                     (this.zeroPrefix[Long.toBinaryString(Rank._A).length() - 1] + Long
                           .toBinaryString(Rank._A)));
      }

      public void testB() {
         Assert
               .assertEquals(
                     "00000000" + // H1-H8
                           "00000000" + // G1-G8
                           "00000000" + // F1-F8
                           "00000000" + // E1-E8
                           "00000000" + // D1-D8
                           "00000000" + // C1-C8
                           "11111111" + // B1-B8
                           "00000000",
                     // A1-A8
                     (this.zeroPrefix[Long.toBinaryString(Rank._B).length() - 1] + Long
                           .toBinaryString(Rank._B)));
      }

      public void testC() {
         Assert
               .assertEquals(
                     "00000000" + // H1-H8
                           "00000000" + // G1-G8
                           "00000000" + // F1-F8
                           "00000000" + // E1-E8
                           "00000000" + // D1-D8
                           "11111111" + // C1-C8
                           "00000000" + // B1-B8
                           "00000000",
                     // A1-A8
                     (this.zeroPrefix[Long.toBinaryString(Rank._C).length() - 1] + Long
                           .toBinaryString(Rank._C)));
      }

      public void testD() {
         Assert
               .assertEquals(
                     "00000000" + // H1-H8
                           "00000000" + // G1-G8
                           "00000000" + // F1-F8
                           "00000000" + // E1-E8
                           "11111111" + // D1-D8
                           "00000000" + // C1-C8
                           "00000000" + // B1-B8
                           "00000000",
                     // A1-A8
                     (this.zeroPrefix[Long.toBinaryString(Rank._D).length() - 1] + Long
                           .toBinaryString(Rank._D)));
      }

      public void testE() {
         Assert
               .assertEquals(
                     "00000000" + // H1-H8
                           "00000000" + // G1-G8
                           "00000000" + // F1-F8
                           "11111111" + // E1-E8
                           "00000000" + // D1-D8
                           "00000000" + // C1-C8
                           "00000000" + // B1-B8
                           "00000000",
                     // A1-A8
                     (this.zeroPrefix[Long.toBinaryString(Rank._E).length() - 1] + Long
                           .toBinaryString(Rank._E)));
      }

      public void testF() {
         Assert
               .assertEquals(
                     "00000000" + // H1-H8
                           "00000000" + // G1-G8
                           "11111111" + // F1-F8
                           "00000000" + // E1-E8
                           "00000000" + // D1-D8
                           "00000000" + // C1-C8
                           "00000000" + // B1-B8
                           "00000000",
                     // A1-A8
                     (this.zeroPrefix[Long.toBinaryString(Rank._F).length() - 1] + Long
                           .toBinaryString(Rank._F)));
      }

      public void testG() {
         Assert
               .assertEquals(
                     "00000000" + // H1-H8
                           "11111111" + // G1-G8
                           "00000000" + // F1-F8
                           "00000000" + // E1-E8
                           "00000000" + // D1-D8
                           "00000000" + // C1-C8
                           "00000000" + // B1-B8
                           "00000000",
                     // A1-A8
                     (this.zeroPrefix[Long.toBinaryString(Rank._G).length() - 1] + Long
                           .toBinaryString(Rank._G)));
      }

      public void testH() {
         Assert
               .assertEquals(
                     "11111111" + // H1-H8
                           "00000000" + // G1-G8
                           "00000000" + // F1-F8
                           "00000000" + // E1-E8
                           "00000000" + // D1-D8
                           "00000000" + // C1-C8
                           "00000000" + // B1-B8
                           "00000000",
                     // A1-A8
                     (this.zeroPrefix[Long.toBinaryString(Rank._H).length() - 1] + Long
                           .toBinaryString(Rank._H)));
      }
   }