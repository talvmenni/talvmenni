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

package org.forritan.talvmenni.bitboard.paths;

import junit.framework.Assert;
import junit.framework.TestCase;


public class KnightTest extends TestCase {

   private final String[] zeroPrefix = new String[64];

   public KnightTest() {
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

   public void testKnightPathsFromA1() {
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
            "01000000"
            + // A3-H3
            "00100000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_A1)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_A1)));
   }

   public void testKnightPathsFromB1() {
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
            "10100000"
            + // A3-H3
            "00010000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_B1)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_B1)));
   }

   public void testKnightPathsFromC1() {
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
            "01010000"
            + // A3-H3
            "10001000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_C1)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_C1)));
   }

   public void testKnightPathsFromD1() {
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
            "00101000"
            + // A3-H3
            "01000100"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_D1)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_D1)));
   }

   public void testKnightPathsFromE1() {
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
            "00010100"
            + // A3-H3
            "00100010"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_E1)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_E1)));
   }

   public void testKnightPathsFromF1() {
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
            "00001010"
            + // A3-H3
            "00010001"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_F1)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_F1)));
   }

   public void testKnightPathsFromG1() {
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
            "00000101"
            + // A3-H3
            "00001000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_G1)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_G1)));
   }

   public void testKnightPathsFromH1() {
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
            "00000010"
            + // A3-H3
            "00000100"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_H1)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_H1)));
   }

   public void testKnightPathsFromA2() {
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
            "00100000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_A2)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_A2)));
   }

   public void testKnightPathsFromB2() {
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
            "10100000"
            + // A4-H4
            "00010000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00010000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_B2)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_B2)));
   }

   public void testKnightPathsFromC2() {
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
            "01010000"
            + // A4-H4
            "10001000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "10001000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_C2)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_C2)));
   }

   public void testKnightPathsFromD2() {
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
            "00101000"
            + // A4-H4
            "01000100"
            + // A3-H3
            "00000000"
            + // A2-H2
            "01000100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_D2)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_D2)));
   }

   public void testKnightPathsFromE2() {
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
            "00010100"
            + // A4-H4
            "00100010"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00100010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_E2)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_E2)));
   }

   public void testKnightPathsFromF2() {
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
            "00001010"
            + // A4-H4
            "00010001"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00010001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_F2)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_F2)));
   }

   public void testKnightPathsFromG2() {
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
            "00000101"
            + // A4-H4
            "00001000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00001000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_G2)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_G2)));
   }

   public void testKnightPathsFromH2() {
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
            "00000010"
            + // A4-H4
            "00000100"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_H2)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_H2)));
   }

   public void testKnightPathsFromA3() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "01000000"
            + // A5-H5
            "00100000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00100000"
            + // A2-H2
            "01000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_A3)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_A3)));
   }

   public void testKnightPathsFromB3() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "10100000"
            + // A5-H5
            "00010000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00010000"
            + // A2-H2
            "10100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_B3)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_B3)));
   }

   public void testKnightPathsFromC3() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "01010000"
            + // A5-H5
            "10001000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "10001000"
            + // A2-H2
            "01010000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_C3)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_C3)));
   }

   public void testKnightPathsFromD3() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00101000"
            + // A5-H5
            "01000100"
            + // A4-H4
            "00000000"
            + // A3-H3
            "01000100"
            + // A2-H2
            "00101000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_D3)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_D3)));
   }

   public void testKnightPathsFromE3() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00010100"
            + // A5-H5
            "00100010"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00100010"
            + // A2-H2
            "00010100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_E3)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_E3)));
   }

   public void testKnightPathsFromF3() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00001010"
            + // A5-H5
            "00010001"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00010001"
            + // A2-H2
            "00001010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_F3)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_F3)));
   }

   public void testKnightPathsFromG3() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00000101"
            + // A5-H5
            "00001000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00001000"
            + // A2-H2
            "00000101", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_G3)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_G3)));
   }

   public void testKnightPathsFromH3() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00000010"
            + // A5-H5
            "00000100"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000100"
            + // A2-H2
            "00000010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_H3)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_H3)));
   }

   public void testKnightPathsFromA4() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "01000000"
            + // A6-H6
            "00100000"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00100000"
            + // A3-H3
            "01000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_A4)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_A4)));
   }

   public void testKnightPathsFromB4() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "10100000"
            + // A6-H6
            "00010000"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00010000"
            + // A3-H3
            "10100000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_B4)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_B4)));
   }

   public void testKnightPathsFromC4() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "01010000"
            + // A6-H6
            "10001000"
            + // A5-H5
            "00000000"
            + // A4-H4
            "10001000"
            + // A3-H3
            "01010000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_C4)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_C4)));
   }

   public void testKnightPathsFromD4() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00101000"
            + // A6-H6
            "01000100"
            + // A5-H5
            "00000000"
            + // A4-H4
            "01000100"
            + // A3-H3
            "00101000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_D4)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_D4)));
   }

   public void testKnightPathsFromE4() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00010100"
            + // A6-H6
            "00100010"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00100010"
            + // A3-H3
            "00010100"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_E4)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_E4)));
   }

   public void testKnightPathsFromF4() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00001010"
            + // A6-H6
            "00010001"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00010001"
            + // A3-H3
            "00001010"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_F4)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_F4)));
   }

   public void testKnightPathsFromG4() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000101"
            + // A6-H6
            "00001000"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00001000"
            + // A3-H3
            "00000101"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_G4)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_G4)));
   }

   public void testKnightPathsFromH4() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000010"
            + // A6-H6
            "00000100"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00000100"
            + // A3-H3
            "00000010"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_H4)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_H4)));
   }

   public void testKnightPathsFromA5() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "01000000"
            + // A7-H7
            "00100000"
            + // A6-H6
            "00000000"
            + // A5-H5
            "00100000"
            + // A4-H4
            "01000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_A5)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_A5)));
   }

   public void testKnightPathsFromB5() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "10100000"
            + // A7-H7
            "00010000"
            + // A6-H6
            "00000000"
            + // A5-H5
            "00010000"
            + // A4-H4
            "10100000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_B5)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_B5)));
   }

   public void testKnightPathsFromC5() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "01010000"
            + // A7-H7
            "10001000"
            + // A6-H6
            "00000000"
            + // A5-H5
            "10001000"
            + // A4-H4
            "01010000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_C5)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_C5)));
   }

   public void testKnightPathsFromD5() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00101000"
            + // A7-H7
            "01000100"
            + // A6-H6
            "00000000"
            + // A5-H5
            "01000100"
            + // A4-H4
            "00101000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_D5)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_D5)));
   }

   public void testKnightPathsFromE5() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00010100"
            + // A7-H7
            "00100010"
            + // A6-H6
            "00000000"
            + // A5-H5
            "00100010"
            + // A4-H4
            "00010100"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_E5)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_E5)));
   }

   public void testKnightPathsFromF5() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00001010"
            + // A7-H7
            "00010001"
            + // A6-H6
            "00000000"
            + // A5-H5
            "00010001"
            + // A4-H4
            "00001010"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_F5)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_F5)));
   }

   public void testKnightPathsFromG5() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000101"
            + // A7-H7
            "00001000"
            + // A6-H6
            "00000000"
            + // A5-H5
            "00001000"
            + // A4-H4
            "00000101"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_G5)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_G5)));
   }

   public void testKnightPathsFromH5() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000010"
            + // A7-H7
            "00000100"
            + // A6-H6
            "00000000"
            + // A5-H5
            "00000100"
            + // A4-H4
            "00000010"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_H5)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_H5)));
   }

   public void testKnightPathsFromA6() {
      Assert.assertEquals(""
            + //
            "01000000"
            + // A8-H8
            "00100000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00100000"
            + // A5-H5
            "01000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_A6)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_A6)));
   }

   public void testKnightPathsFromB6() {
      Assert.assertEquals(""
            + //
            "10100000"
            + // A8-H8
            "00010000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00010000"
            + // A5-H5
            "10100000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_B6)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_B6)));
   }

   public void testKnightPathsFromC6() {
      Assert.assertEquals(""
            + //
            "01010000"
            + // A8-H8
            "10001000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "10001000"
            + // A5-H5
            "01010000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_C6)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_C6)));
   }

   public void testKnightPathsFromD6() {
      Assert.assertEquals(""
            + //
            "00101000"
            + // A8-H8
            "01000100"
            + // A7-H7
            "00000000"
            + // A6-H6
            "01000100"
            + // A5-H5
            "00101000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_D6)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_D6)));
   }

   public void testKnightPathsFromE6() {
      Assert.assertEquals(""
            + //
            "00010100"
            + // A8-H8
            "00100010"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00100010"
            + // A5-H5
            "00010100"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_E6)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_E6)));
   }

   public void testKnightPathsFromF6() {
      Assert.assertEquals(""
            + //
            "00001010"
            + // A8-H8
            "00010001"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00010001"
            + // A5-H5
            "00001010"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_F6)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_F6)));
   }

   public void testKnightPathsFromG6() {
      Assert.assertEquals(""
            + //
            "00000101"
            + // A8-H8
            "00001000"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00001000"
            + // A5-H5
            "00000101"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_G6)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_G6)));
   }

   public void testKnightPathsFromH6() {
      Assert.assertEquals(""
            + //
            "00000010"
            + // A8-H8
            "00000100"
            + // A7-H7
            "00000000"
            + // A6-H6
            "00000100"
            + // A5-H5
            "00000010"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_H6)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_H6)));
   }

   public void testKnightPathsFromA7() {
      Assert.assertEquals(""
            + //
            "00100000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00100000"
            + // A6-H6
            "01000000"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_A7)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_A7)));
   }

   public void testKnightPathsFromB7() {
      Assert.assertEquals(""
            + //
            "00010000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00010000"
            + // A6-H6
            "10100000"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_B7)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_B7)));
   }

   public void testKnightPathsFromC7() {
      Assert.assertEquals(""
            + //
            "10001000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "10001000"
            + // A6-H6
            "01010000"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_C7)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_C7)));
   }

   public void testKnightPathsFromD7() {
      Assert.assertEquals(""
            + //
            "01000100"
            + // A8-H8
            "00000000"
            + // A7-H7
            "01000100"
            + // A6-H6
            "00101000"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_D7)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_D7)));
   }

   public void testKnightPathsFromE7() {
      Assert.assertEquals(""
            + //
            "00100010"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00100010"
            + // A6-H6
            "00010100"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_E7)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_E7)));
   }

   public void testKnightPathsFromF7() {
      Assert.assertEquals(""
            + //
            "00010001"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00010001"
            + // A6-H6
            "00001010"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_F7)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_F7)));
   }

   public void testKnightPathsFromG7() {
      Assert.assertEquals(""
            + //
            "00001000"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00001000"
            + // A6-H6
            "00000101"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_G7)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_G7)));
   }

   public void testKnightPathsFromH7() {
      Assert.assertEquals(""
            + //
            "00000100"
            + // A8-H8
            "00000000"
            + // A7-H7
            "00000100"
            + // A6-H6
            "00000010"
            + // A5-H5
            "00000000"
            + // A4-H4
            "00000000"
            + // A3-H3
            "00000000"
            + // A2-H2
            "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_H7)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_H7)));
   }

   public void testKnightPathsFromA8() {
      Assert.assertEquals(""
            + // 
            "00000000"
            + // A8-H8
            "00100000"
            + // A7-H7
            "01000000"
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
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_A8)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_A8)));
   }

   public void testKnightPathsFromB8() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00010000"
            + // A7-H7
            "10100000"
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
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_B8)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_B8)));
   }

   public void testKnightPathsFromC8() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "10001000"
            + // A7-H7
            "01010000"
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
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_C8)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_C8)));
   }

   public void testKnightPathsFromD8() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "01000100"
            + // A7-H7
            "00101000"
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
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_D8)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_D8)));
   }

   public void testKnightPathsFromE8() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00100010"
            + // A7-H7
            "00010100"
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
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_E8)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_E8)));
   }

   public void testKnightPathsFromF8() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00010001"
            + // A7-H7
            "00001010"
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
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_F8)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_F8)));
   }

   public void testKnightPathsFromG8() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00001000"
            + // A7-H7
            "00000101"
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
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_G8)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_G8)));
   }

   public void testKnightPathsFromH8() {
      Assert.assertEquals(""
            + //
            "00000000"
            + // A8-H8
            "00000100"
            + // A7-H7
            "00000010"
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
            (this.zeroPrefix[Long.toBinaryString(Knight._PATHS_FROM_H8)
                  .length() - 1] + Long.toBinaryString(Knight._PATHS_FROM_H8)));
   }

}