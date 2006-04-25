/**
 * talvmenni - A distributed chess-engine implemented in Java(TM)
 * and against Sun Microsystems Jini/JavaSpaces(TM).
 *  
 * Copyright (C) 2004-2006 Eyðun Lamhauge and Eyðun Nielsen
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

import junit.framework.Assert;
import junit.framework.TestCase;


public class SlashDiagonalTest extends TestCase {

   private final String[] zeroPrefix = new String[64];

   public SlashDiagonalTest() {
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

   public void testA8A8() {
      Assert.assertEquals("" + //
            "10000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // B2-H2
            "00000000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(SlashDiagonal._A8A8).length() - 1] + Long
            .toBinaryString(SlashDiagonal._A8A8)));
   }
   public void testA7B8() {
      Assert.assertEquals("" + //
            "01000000" + // A8-H8
            "10000000" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // B2-H2
            "00000000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(SlashDiagonal._A7B8).length() - 1] + Long
            .toBinaryString(SlashDiagonal._A7B8)));
   }
   public void testA6C8() {
      Assert.assertEquals("" + //
            "00100000" + // A8-H8
            "01000000" + // A7-H7
            "10000000" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // B2-H2
            "00000000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(SlashDiagonal._A6C8).length() - 1] + Long
            .toBinaryString(SlashDiagonal._A6C8)));
   }
   public void testA5D8() {
      Assert.assertEquals("" + //
            "00010000" + // A8-H8
            "00100000" + // A7-H7
            "01000000" + // A6-H6
            "10000000" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // B2-H2
            "00000000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(SlashDiagonal._A5D8).length() - 1] + Long
            .toBinaryString(SlashDiagonal._A5D8)));
   }
   public void testA4E8() {
      Assert.assertEquals("" + //
            "00001000" + // A8-H8
            "00010000" + // A7-H7
            "00100000" + // A6-H6
            "01000000" + // A5-H5
            "10000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // B2-H2
            "00000000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(SlashDiagonal._A4E8).length() - 1] + Long
            .toBinaryString(SlashDiagonal._A4E8)));
   }
   public void testA3F8() {
      Assert.assertEquals("" + //
            "00000100" + // A8-H8
            "00001000" + // A7-H7
            "00010000" + // A6-H6
            "00100000" + // A5-H5
            "01000000" + // A4-H4
            "10000000" + // A3-H3
            "00000000" + // B2-H2
            "00000000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(SlashDiagonal._A3F8).length() - 1] + Long
            .toBinaryString(SlashDiagonal._A3F8)));
   }
   public void testA2G8() {
      Assert.assertEquals("" + //
            "00000010" + // A8-H8
            "00000100" + // A7-H7
            "00001000" + // A6-H6
            "00010000" + // A5-H5
            "00100000" + // A4-H4
            "01000000" + // A3-H3
            "10000000" + // B2-H2
            "00000000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(SlashDiagonal._A2G8).length() - 1] + Long
            .toBinaryString(SlashDiagonal._A2G8)));
   }
   public void testA1H8() {
      Assert.assertEquals("" + //
            "00000001" + // A8-H8
            "00000010" + // A7-H7
            "00000100" + // A6-H6
            "00001000" + // A5-H5
            "00010000" + // A4-H4
            "00100000" + // A3-H3
            "01000000" + // B2-H2
            "10000000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(SlashDiagonal._A1H8).length() - 1] + Long
            .toBinaryString(SlashDiagonal._A1H8)));
   }
   public void testB1H7() {
      Assert.assertEquals("" + //
            "00000000" + // A8-H8
            "00000001" + // A7-H7
            "00000010" + // A6-H6
            "00000100" + // A5-H5
            "00001000" + // A4-H4
            "00010000" + // A3-H3
            "00100000" + // B2-H2
            "01000000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(SlashDiagonal._B1H7).length() - 1] + Long
            .toBinaryString(SlashDiagonal._B1H7)));
   }
   public void testC1H6() {
      Assert.assertEquals("" + //
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000001" + // A6-H6
            "00000010" + // A5-H5
            "00000100" + // A4-H4
            "00001000" + // A3-H3
            "00010000" + // B2-H2
            "00100000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(SlashDiagonal._C1H6).length() - 1] + Long
            .toBinaryString(SlashDiagonal._C1H6)));
   }
   public void testD1H5() {
      Assert.assertEquals("" + //
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000001" + // A5-H5
            "00000010" + // A4-H4
            "00000100" + // A3-H3
            "00001000" + // B2-H2
            "00010000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(SlashDiagonal._D1H5).length() - 1] + Long
            .toBinaryString(SlashDiagonal._D1H5)));
   }
   public void testE1H4() {
      Assert.assertEquals("" + //
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "00000001" + // A4-H4
            "00000010" + // A3-H3
            "00000100" + // B2-H2
            "00001000" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(SlashDiagonal._E1H4).length() - 1] + Long
            .toBinaryString(SlashDiagonal._E1H4)));
   }
   public void testF1H3() {
      Assert.assertEquals("" + //
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "00000001" + // A3-H3
            "00000010" + // B2-H2
            "00000100" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(SlashDiagonal._F1H3).length() - 1] + Long
            .toBinaryString(SlashDiagonal._F1H3)));
   }
   public void testG1H2() {
      Assert.assertEquals("" + //
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "00000001" + // B2-H2
            "00000010" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(SlashDiagonal._G1H2).length() - 1] + Long
            .toBinaryString(SlashDiagonal._G1H2)));
   }
   public void testH1H1() {
      Assert.assertEquals("" + //
            "00000000" + // A8-H8
            "00000000" + // A7-H7
            "00000000" + // A6-H6
            "00000000" + // A5-H5
            "00000000" + // A4-H4
            "00000000" + // A3-H3
            "00000000" + // B2-H2
            "00000001" // A1-H1
      , (this.zeroPrefix[Long.toBinaryString(SlashDiagonal._H1H1).length() - 1] + Long
            .toBinaryString(SlashDiagonal._H1H1)));
   }

   
}