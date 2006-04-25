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


public class QueenTest extends TestCase {

   private final String[] zeroPrefix = new String[64];

   public QueenTest() {
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

   public void testQueenPathsFromA1() {
      Assert
            .assertEquals(""
                  + //
                  "10000001"
                  + // A8-H8
                  "10000010"
                  + // A7-H7
                  "10000100"
                  + // A6-H6
                  "10001000"
                  + // A5-H5
                  "10010000"
                  + // A4-H4
                  "10100000"
                  + // A3-H3
                  "11000000"
                  + // A2-H2
                  "01111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_A1)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_A1)));
   }

   public void testQueenPathsFromB1() {
      Assert
            .assertEquals(""
                  + //
                  "01000000"
                  + // A8-H8
                  "01000001"
                  + // A7-H7
                  "01000010"
                  + // A6-H6
                  "01000100"
                  + // A5-H5
                  "01001000"
                  + // A4-H4
                  "01010000"
                  + // A3-H3
                  "11100000"
                  + // A2-H2
                  "10111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_B1)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_B1)));
   }

   public void testQueenPathsFromC1() {
      Assert
            .assertEquals(""
                  + //
                  "00100000"
                  + // A8-H8
                  "00100000"
                  + // A7-H7
                  "00100001"
                  + // A6-H6
                  "00100010"
                  + // A5-H5
                  "00100100"
                  + // A4-H4
                  "10101000"
                  + // A3-H3
                  "01110000"
                  + // A2-H2
                  "11011111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_C1)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_C1)));
   }

   public void testQueenPathsFromD1() {
      Assert
            .assertEquals(""
                  + //
                  "00010000"
                  + // A8-H8
                  "00010000"
                  + // A7-H7
                  "00010000"
                  + // A6-H6
                  "00010001"
                  + // A5-H5
                  "10010010"
                  + // A4-H4
                  "01010100"
                  + // A3-H3
                  "00111000"
                  + // A2-H2
                  "11101111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_D1)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_D1)));
   }

   public void testQueenPathsFromE1() {
      Assert
            .assertEquals(""
                  + //
                  "00001000"
                  + // A8-H8
                  "00001000"
                  + // A7-H7
                  "00001000"
                  + // A6-H6
                  "10001000"
                  + // A5-H5
                  "01001001"
                  + // A4-H4
                  "00101010"
                  + // A3-H3
                  "00011100"
                  + // A2-H2
                  "11110111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_E1)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_E1)));
   }

   public void testQueenPathsFromF1() {
      Assert
            .assertEquals(""
                  + //
                  "00000100"
                  + // A8-H8
                  "00000100"
                  + // A7-H7
                  "10000100"
                  + // A6-H6
                  "01000100"
                  + // A5-H5
                  "00100100"
                  + // A4-H4
                  "00010101"
                  + // A3-H3
                  "00001110"
                  + // A2-H2
                  "11111011", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_F1)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_F1)));
   }

   public void testQueenPathsFromG1() {
      Assert
            .assertEquals(""
                  + //
                  "00000010"
                  + // A8-H8
                  "10000010"
                  + // A7-H7
                  "01000010"
                  + // A6-H6
                  "00100010"
                  + // A5-H5
                  "00010010"
                  + // A4-H4
                  "00001010"
                  + // A3-H3
                  "00000111"
                  + // A2-H2
                  "11111101", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_G1)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_G1)));
   }

   public void testQueenPathsFromH1() {
      Assert
            .assertEquals(""
                  + //
                  "10000001"
                  + // A8-H8
                  "01000001"
                  + // A7-H7
                  "00100001"
                  + // A6-H6
                  "00010001"
                  + // A5-H5
                  "00001001"
                  + // A4-H4
                  "00000101"
                  + // A3-H3
                  "00000011"
                  + // A2-H2
                  "11111110", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_H1)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_H1)));
   }

   public void testQueenPathsFromA2() {
      Assert
            .assertEquals(""
                  + //
                  "10000010"
                  + // A8-H8
                  "10000100"
                  + // A7-H7
                  "10001000"
                  + // A6-H6
                  "10010000"
                  + // A5-H5
                  "10100000"
                  + // A4-H4
                  "11000000"
                  + // A3-H3
                  "01111111"
                  + // A2-H2
                  "11000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_A2)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_A2)));
   }

   public void testQueenPathsFromB2() {
      Assert
            .assertEquals(""
                  + //
                  "01000001"
                  + // A8-H8
                  "01000010"
                  + // A7-H7
                  "01000100"
                  + // A6-H6
                  "01001000"
                  + // A5-H5
                  "01010000"
                  + // A4-H4
                  "11100000"
                  + // A3-H3
                  "10111111"
                  + // A2-H2
                  "11100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_B2)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_B2)));
   }

   public void testQueenPathsFromC2() {
      Assert
            .assertEquals(""
                  + //
                  "00100000"
                  + // A8-H8
                  "00100001"
                  + // A7-H7
                  "00100010"
                  + // A6-H6
                  "00100100"
                  + // A5-H5
                  "10101000"
                  + // A4-H4
                  "01110000"
                  + // A3-H3
                  "11011111"
                  + // A2-H2
                  "01110000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_C2)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_C2)));
   }

   public void testQueenPathsFromD2() {
      Assert
            .assertEquals(""
                  + //
                  "00010000"
                  + // A8-H8
                  "00010000"
                  + // A7-H7
                  "00010001"
                  + // A6-H6
                  "10010010"
                  + // A5-H5
                  "01010100"
                  + // A4-H4
                  "00111000"
                  + // A3-H3
                  "11101111"
                  + // A2-H2
                  "00111000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_D2)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_D2)));
   }

   public void testQueenPathsFromE2() {
      Assert
            .assertEquals(""
                  + //
                  "00001000"
                  + // A8-H8
                  "00001000"
                  + // A7-H7
                  "10001000"
                  + // A6-H6
                  "01001001"
                  + // A5-H5
                  "00101010"
                  + // A4-H4
                  "00011100"
                  + // A3-H3
                  "11110111"
                  + // A2-H2
                  "00011100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_E2)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_E2)));
   }

   public void testQueenPathsFromF2() {
      Assert
            .assertEquals(""
                  + //
                  "00000100"
                  + // A8-H8
                  "10000100"
                  + // A7-H7
                  "01000100"
                  + // A6-H6
                  "00100100"
                  + // A5-H5
                  "00010101"
                  + // A4-H4
                  "00001110"
                  + // A3-H3
                  "11111011"
                  + // A2-H2
                  "00001110", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_F2)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_F2)));
   }

   public void testQueenPathsFromG2() {
      Assert
            .assertEquals(""
                  + //
                  "10000010"
                  + // A8-H8
                  "01000010"
                  + // A7-H7
                  "00100010"
                  + // A6-H6
                  "00010010"
                  + // A5-H5
                  "00001010"
                  + // A4-H4
                  "00000111"
                  + // A3-H3
                  "11111101"
                  + // A2-H2
                  "00000111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_G2)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_G2)));
   }

   public void testQueenPathsFromH2() {
      Assert
            .assertEquals(""
                  + //
                  "01000001"
                  + // A8-H8
                  "00100001"
                  + // A7-H7
                  "00010001"
                  + // A6-H6
                  "00001001"
                  + // A5-H5
                  "00000101"
                  + // A4-H4
                  "00000011"
                  + // A3-H3
                  "11111110"
                  + // A2-H2
                  "00000011", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_H2)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_H2)));
   }

   public void testQueenPathsFromA3() {
      Assert
            .assertEquals(""
                  + //
                  "10000100"
                  + // A8-H8
                  "10001000"
                  + // A7-H7
                  "10010000"
                  + // A6-H6
                  "10100000"
                  + // A5-H5
                  "11000000"
                  + // A4-H4
                  "01111111"
                  + // A3-H3
                  "11000000"
                  + // A2-H2
                  "10100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_A3)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_A3)));
   }

   public void testQueenPathsFromB3() {
      Assert
            .assertEquals(""
                  + //
                  "01000010"
                  + // A8-H8
                  "01000100"
                  + // A7-H7
                  "01001000"
                  + // A6-H6
                  "01010000"
                  + // A5-H5
                  "11100000"
                  + // A4-H4
                  "10111111"
                  + // A3-H3
                  "11100000"
                  + // A2-H2
                  "01010000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_B3)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_B3)));
   }

   public void testQueenPathsFromC3() {
      Assert
            .assertEquals(""
                  + //
                  "00100001"
                  + // A8-H8
                  "00100010"
                  + // A7-H7
                  "00100100"
                  + // A6-H6
                  "10101000"
                  + // A5-H5
                  "01110000"
                  + // A4-H4
                  "11011111"
                  + // A3-H3
                  "01110000"
                  + // A2-H2
                  "10101000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_C3)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_C3)));
   }

   public void testQueenPathsFromD3() {
      Assert
            .assertEquals(""
                  + //
                  "00010000"
                  + // A8-H8
                  "00010001"
                  + // A7-H7
                  "10010010"
                  + // A6-H6
                  "01010100"
                  + // A5-H5
                  "00111000"
                  + // A4-H4
                  "11101111"
                  + // A3-H3
                  "00111000"
                  + // A2-H2
                  "01010100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_D3)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_D3)));
   }

   public void testQueenPathsFromE3() {
      Assert
            .assertEquals(""
                  + //
                  "00001000"
                  + // A8-H8
                  "10001000"
                  + // A7-H7
                  "01001001"
                  + // A6-H6
                  "00101010"
                  + // A5-H5
                  "00011100"
                  + // A4-H4
                  "11110111"
                  + // A3-H3
                  "00011100"
                  + // A2-H2
                  "00101010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_E3)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_E3)));
   }

   public void testQueenPathsFromF3() {
      Assert
            .assertEquals(""
                  + //
                  "10000100"
                  + // A8-H8
                  "01000100"
                  + // A7-H7
                  "00100100"
                  + // A6-H6
                  "00010101"
                  + // A5-H5
                  "00001110"
                  + // A4-H4
                  "11111011"
                  + // A3-H3
                  "00001110"
                  + // A2-H2
                  "00010101", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_F3)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_F3)));
   }

   public void testQueenPathsFromG3() {
      Assert
            .assertEquals(""
                  + //
                  "01000010"
                  + // A8-H8
                  "00100010"
                  + // A7-H7
                  "00010010"
                  + // A6-H6
                  "00001010"
                  + // A5-H5
                  "00000111"
                  + // A4-H4
                  "11111101"
                  + // A3-H3
                  "00000111"
                  + // A2-H2
                  "00001010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_G3)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_G3)));
   }

   public void testQueenPathsFromH3() {
      Assert
            .assertEquals(""
                  + //
                  "00100001"
                  + // A8-H8
                  "00010001"
                  + // A7-H7
                  "00001001"
                  + // A6-H6
                  "00000101"
                  + // A5-H5
                  "00000011"
                  + // A4-H4
                  "11111110"
                  + // A3-H3
                  "00000011"
                  + // A2-H2
                  "00000101", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_H3)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_H3)));
   }

   public void testQueenPathsFromA4() {
      Assert
            .assertEquals(""
                  + //
                  "10001000"
                  + // A8-H8
                  "10010000"
                  + // A7-H7
                  "10100000"
                  + // A6-H6
                  "11000000"
                  + // A5-H5
                  "01111111"
                  + // A4-H4
                  "11000000"
                  + // A3-H3
                  "10100000"
                  + // A2-H2
                  "10010000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_A4)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_A4)));
   }

   public void testQueenPathsFromB4() {
      Assert
            .assertEquals(""
                  + //
                  "01000100"
                  + // A8-H8
                  "01001000"
                  + // A7-H7
                  "01010000"
                  + // A6-H6
                  "11100000"
                  + // A5-H5
                  "10111111"
                  + // A4-H4
                  "11100000"
                  + // A3-H3
                  "01010000"
                  + // A2-H2
                  "01001000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_B4)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_B4)));
   }

   public void testQueenPathsFromC4() {
      Assert
            .assertEquals(""
                  + //
                  "00100010"
                  + // A8-H8
                  "00100100"
                  + // A7-H7
                  "10101000"
                  + // A6-H6
                  "01110000"
                  + // A5-H5
                  "11011111"
                  + // A4-H4
                  "01110000"
                  + // A3-H3
                  "10101000"
                  + // A2-H2
                  "00100100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_C4)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_C4)));
   }

   public void testQueenPathsFromD4() {
      Assert
            .assertEquals(""
                  + //
                  "00010001"
                  + // A8-H8
                  "10010010"
                  + // A7-H7
                  "01010100"
                  + // A6-H6
                  "00111000"
                  + // A5-H5
                  "11101111"
                  + // A4-H4
                  "00111000"
                  + // A3-H3
                  "01010100"
                  + // A2-H2
                  "10010010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_D4)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_D4)));
   }

   public void testQueenPathsFromE4() {
      Assert
            .assertEquals(""
                  + //
                  "10001000"
                  + // A8-H8
                  "01001001"
                  + // A7-H7
                  "00101010"
                  + // A6-H6
                  "00011100"
                  + // A5-H5
                  "11110111"
                  + // A4-H4
                  "00011100"
                  + // A3-H3
                  "00101010"
                  + // A2-H2
                  "01001001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_E4)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_E4)));
   }

   public void testQueenPathsFromF4() {
      Assert
            .assertEquals(""
                  + //
                  "01000100"
                  + // A8-H8
                  "00100100"
                  + // A7-H7
                  "00010101"
                  + // A6-H6
                  "00001110"
                  + // A5-H5
                  "11111011"
                  + // A4-H4
                  "00001110"
                  + // A3-H3
                  "00010101"
                  + // A2-H2
                  "00100100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_F4)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_F4)));
   }

   public void testQueenPathsFromG4() {
      Assert
            .assertEquals(""
                  + //
                  "00100010"
                  + // A8-H8
                  "00010010"
                  + // A7-H7
                  "00001010"
                  + // A6-H6
                  "00000111"
                  + // A5-H5
                  "11111101"
                  + // A4-H4
                  "00000111"
                  + // A3-H3
                  "00001010"
                  + // A2-H2
                  "00010010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_G4)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_G4)));
   }

   public void testQueenPathsFromH4() {
      Assert
            .assertEquals(""
                  + //
                  "00010001"
                  + // A8-H8
                  "00001001"
                  + // A7-H7
                  "00000101"
                  + // A6-H6
                  "00000011"
                  + // A5-H5
                  "11111110"
                  + // A4-H4
                  "00000011"
                  + // A3-H3
                  "00000101"
                  + // A2-H2
                  "00001001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_H4)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_H4)));
   }

   public void testQueenPathsFromA5() {
      Assert
            .assertEquals(""
                  + //
                  "10010000"
                  + // A8-H8
                  "10100000"
                  + // A7-H7
                  "11000000"
                  + // A6-H6
                  "01111111"
                  + // A5-H5
                  "11000000"
                  + // A4-H4
                  "10100000"
                  + // A3-H3
                  "10010000"
                  + // A2-H2
                  "10001000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_A5)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_A5)));
   }

   public void testQueenPathsFromB5() {
      Assert
            .assertEquals(""
                  + //
                  "01001000"
                  + // A8-H8
                  "01010000"
                  + // A7-H7
                  "11100000"
                  + // A6-H6
                  "10111111"
                  + // A5-H5
                  "11100000"
                  + // A4-H4
                  "01010000"
                  + // A3-H3
                  "01001000"
                  + // A2-H2
                  "01000100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_B5)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_B5)));
   }

   public void testQueenPathsFromC5() {
      Assert
            .assertEquals(""
                  + //
                  "00100100"
                  + // A8-H8
                  "10101000"
                  + // A7-H7
                  "01110000"
                  + // A6-H6
                  "11011111"
                  + // A5-H5
                  "01110000"
                  + // A4-H4
                  "10101000"
                  + // A3-H3
                  "00100100"
                  + // A2-H2
                  "00100010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_C5)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_C5)));
   }

   public void testQueenPathsFromD5() {
      Assert
            .assertEquals(""
                  + //
                  "10010010"
                  + // A8-H8
                  "01010100"
                  + // A7-H7
                  "00111000"
                  + // A6-H6
                  "11101111"
                  + // A5-H5
                  "00111000"
                  + // A4-H4
                  "01010100"
                  + // A3-H3
                  "10010010"
                  + // A2-H2
                  "00010001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_D5)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_D5)));
   }

   public void testQueenPathsFromE5() {
      Assert
            .assertEquals(""
                  + //
                  "01001001"
                  + // A8-H8
                  "00101010"
                  + // A7-H7
                  "00011100"
                  + // A6-H6
                  "11110111"
                  + // A5-H5
                  "00011100"
                  + // A4-H4
                  "00101010"
                  + // A3-H3
                  "01001001"
                  + // A2-H2
                  "10001000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_E5)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_E5)));
   }

   public void testQueenPathsFromF5() {
      Assert
            .assertEquals(""
                  + //
                  "00100100"
                  + // A8-H8
                  "00010101"
                  + // A7-H7
                  "00001110"
                  + // A6-H6
                  "11111011"
                  + // A5-H5
                  "00001110"
                  + // A4-H4
                  "00010101"
                  + // A3-H3
                  "00100100"
                  + // A2-H2
                  "01000100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_F5)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_F5)));
   }

   public void testQueenPathsFromG5() {
      Assert
            .assertEquals(""
                  + //
                  "00010010"
                  + // A8-H8
                  "00001010"
                  + // A7-H7
                  "00000111"
                  + // A6-H6
                  "11111101"
                  + // A5-H5
                  "00000111"
                  + // A4-H4
                  "00001010"
                  + // A3-H3
                  "00010010"
                  + // A2-H2
                  "00100010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_G5)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_G5)));
   }

   public void testQueenPathsFromH5() {
      Assert
            .assertEquals(""
                  + //
                  "00001001"
                  + // A8-H8
                  "00000101"
                  + // A7-H7
                  "00000011"
                  + // A6-H6
                  "11111110"
                  + // A5-H5
                  "00000011"
                  + // A4-H4
                  "00000101"
                  + // A3-H3
                  "00001001"
                  + // A2-H2
                  "00010001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_H5)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_H5)));
   }

   public void testQueenPathsFromA6() {
      Assert
            .assertEquals(""
                  + //
                  "10100000"
                  + // A8-H8
                  "11000000"
                  + // A7-H7
                  "01111111"
                  + // A6-H6
                  "11000000"
                  + // A5-H5
                  "10100000"
                  + // A4-H4
                  "10010000"
                  + // A3-H3
                  "10001000"
                  + // A2-H2
                  "10000100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_A6)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_A6)));
   }

   public void testQueenPathsFromB6() {
      Assert
            .assertEquals(""
                  + //
                  "01010000"
                  + // A8-H8
                  "11100000"
                  + // A7-H7
                  "10111111"
                  + // A6-H6
                  "11100000"
                  + // A5-H5
                  "01010000"
                  + // A4-H4
                  "01001000"
                  + // A3-H3
                  "01000100"
                  + // A2-H2
                  "01000010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_B6)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_B6)));
   }

   public void testQueenPathsFromC6() {
      Assert
            .assertEquals(""
                  + //
                  "10101000"
                  + // A8-H8
                  "01110000"
                  + // A7-H7
                  "11011111"
                  + // A6-H6
                  "01110000"
                  + // A5-H5
                  "10101000"
                  + // A4-H4
                  "00100100"
                  + // A3-H3
                  "00100010"
                  + // A2-H2
                  "00100001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_C6)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_C6)));
   }

   public void testQueenPathsFromD6() {
      Assert
            .assertEquals(""
                  + //
                  "01010100"
                  + // A8-H8
                  "00111000"
                  + // A7-H7
                  "11101111"
                  + // A6-H6
                  "00111000"
                  + // A5-H5
                  "01010100"
                  + // A4-H4
                  "10010010"
                  + // A3-H3
                  "00010001"
                  + // A2-H2
                  "00010000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_D6)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_D6)));
   }

   public void testQueenPathsFromE6() {
      Assert
            .assertEquals(""
                  + //
                  "00101010"
                  + // A8-H8
                  "00011100"
                  + // A7-H7
                  "11110111"
                  + // A6-H6
                  "00011100"
                  + // A5-H5
                  "00101010"
                  + // A4-H4
                  "01001001"
                  + // A3-H3
                  "10001000"
                  + // A2-H2
                  "00001000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_E6)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_E6)));
   }

   public void testQueenPathsFromF6() {
      Assert
            .assertEquals(""
                  + //
                  "00010101"
                  + // A8-H8
                  "00001110"
                  + // A7-H7
                  "11111011"
                  + // A6-H6
                  "00001110"
                  + // A5-H5
                  "00010101"
                  + // A4-H4
                  "00100100"
                  + // A3-H3
                  "01000100"
                  + // A2-H2
                  "10000100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_F6)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_F6)));
   }

   public void testQueenPathsFromG6() {
      Assert
            .assertEquals(""
                  + //
                  "00001010"
                  + // A8-H8
                  "00000111"
                  + // A7-H7
                  "11111101"
                  + // A6-H6
                  "00000111"
                  + // A5-H5
                  "00001010"
                  + // A4-H4
                  "00010010"
                  + // A3-H3
                  "00100010"
                  + // A2-H2
                  "01000010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_G6)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_G6)));
   }

   public void testQueenPathsFromH6() {
      Assert
            .assertEquals(""
                  + //
                  "00000101"
                  + // A8-H8
                  "00000011"
                  + // A7-H7
                  "11111110"
                  + // A6-H6
                  "00000011"
                  + // A5-H5
                  "00000101"
                  + // A4-H4
                  "00001001"
                  + // A3-H3
                  "00010001"
                  + // A2-H2
                  "00100001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_H6)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_H6)));
   }

   public void testQueenPathsFromA7() {
      Assert
            .assertEquals(""
                  + //
                  "11000000"
                  + // A8-H8
                  "01111111"
                  + // A7-H7
                  "11000000"
                  + // A6-H6
                  "10100000"
                  + // A5-H5
                  "10010000"
                  + // A4-H4
                  "10001000"
                  + // A3-H3
                  "10000100"
                  + // A2-H2
                  "10000010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_A7)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_A7)));
   }

   public void testQueenPathsFromB7() {
      Assert
            .assertEquals(""
                  + //
                  "11100000"
                  + // A8-H8
                  "10111111"
                  + // A7-H7
                  "11100000"
                  + // A6-H6
                  "01010000"
                  + // A5-H5
                  "01001000"
                  + // A4-H4
                  "01000100"
                  + // A3-H3
                  "01000010"
                  + // A2-H2
                  "01000001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_B7)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_B7)));
   }

   public void testQueenPathsFromC7() {
      Assert
            .assertEquals(""
                  + //
                  "01110000"
                  + // A8-H8
                  "11011111"
                  + // A7-H7
                  "01110000"
                  + // A6-H6
                  "10101000"
                  + // A5-H5
                  "00100100"
                  + // A4-H4
                  "00100010"
                  + // A3-H3
                  "00100001"
                  + // A2-H2
                  "00100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_C7)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_C7)));
   }

   public void testQueenPathsFromD7() {
      Assert
            .assertEquals(""
                  + //
                  "00111000"
                  + // A8-H8
                  "11101111"
                  + // A7-H7
                  "00111000"
                  + // A6-H6
                  "01010100"
                  + // A5-H5
                  "10010010"
                  + // A4-H4
                  "00010001"
                  + // A3-H3
                  "00010000"
                  + // A2-H2
                  "00010000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_D7)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_D7)));
   }

   public void testQueenPathsFromE7() {
      Assert
            .assertEquals(""
                  + //
                  "00011100"
                  + // A8-H8
                  "11110111"
                  + // A7-H7
                  "00011100"
                  + // A6-H6
                  "00101010"
                  + // A5-H5
                  "01001001"
                  + // A4-H4
                  "10001000"
                  + // A3-H3
                  "00001000"
                  + // A2-H2
                  "00001000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_E7)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_E7)));
   }

   public void testQueenPathsFromF7() {
      Assert
            .assertEquals(""
                  + //
                  "00001110"
                  + // A8-H8
                  "11111011"
                  + // A7-H7
                  "00001110"
                  + // A6-H6
                  "00010101"
                  + // A5-H5
                  "00100100"
                  + // A4-H4
                  "01000100"
                  + // A3-H3
                  "10000100"
                  + // A2-H2
                  "00000100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_F7)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_F7)));
   }

   public void testQueenPathsFromG7() {
      Assert
            .assertEquals(""
                  + //
                  "00000111"
                  + // A8-H8
                  "11111101"
                  + // A7-H7
                  "00000111"
                  + // A6-H6
                  "00001010"
                  + // A5-H5
                  "00010010"
                  + // A4-H4
                  "00100010"
                  + // A3-H3
                  "01000010"
                  + // A2-H2
                  "10000010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_G7)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_G7)));
   }

   public void testQueenPathsFromH7() {
      Assert
            .assertEquals(""
                  + //
                  "00000011"
                  + // A8-H8
                  "11111110"
                  + // A7-H7
                  "00000011"
                  + // A6-H6
                  "00000101"
                  + // A5-H5
                  "00001001"
                  + // A4-H4
                  "00010001"
                  + // A3-H3
                  "00100001"
                  + // A2-H2
                  "01000001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_H7)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_H7)));
   }

   public void testQueenPathsFromA8() {
      Assert
            .assertEquals(""
                  + // 
                  "01111111"
                  + // A8-H8
                  "11000000"
                  + // A7-H7
                  "10100000"
                  + // A6-H6
                  "10010000"
                  + // A5-H5
                  "10001000"
                  + // A4-H4
                  "10000100"
                  + // A3-H3
                  "10000010"
                  + // A2-H2
                  "10000001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_A8)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_A8)));
   }

   public void testQueenPathsFromB8() {
      Assert
            .assertEquals(""
                  + //
                  "10111111"
                  + // A8-H8
                  "11100000"
                  + // A7-H7
                  "01010000"
                  + // A6-H6
                  "01001000"
                  + // A5-H5
                  "01000100"
                  + // A4-H4
                  "01000010"
                  + // A3-H3
                  "01000001"
                  + // A2-H2
                  "01000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_B8)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_B8)));
   }

   public void testQueenPathsFromC8() {
      Assert
            .assertEquals(""
                  + //
                  "11011111"
                  + // A8-H8
                  "01110000"
                  + // A7-H7
                  "10101000"
                  + // A6-H6
                  "00100100"
                  + // A5-H5
                  "00100010"
                  + // A4-H4
                  "00100001"
                  + // A3-H3
                  "00100000"
                  + // A2-H2
                  "00100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_C8)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_C8)));
   }

   public void testQueenPathsFromD8() {
      Assert
            .assertEquals(""
                  + //
                  "11101111"
                  + // A8-H8
                  "00111000"
                  + // A7-H7
                  "01010100"
                  + // A6-H6
                  "10010010"
                  + // A5-H5
                  "00010001"
                  + // A4-H4
                  "00010000"
                  + // A3-H3
                  "00010000"
                  + // A2-H2
                  "00010000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_D8)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_D8)));
   }

   public void testQueenPathsFromE8() {
      Assert
            .assertEquals(""
                  + //
                  "11110111"
                  + // A8-H8
                  "00011100"
                  + // A7-H7
                  "00101010"
                  + // A6-H6
                  "01001001"
                  + // A5-H5
                  "10001000"
                  + // A4-H4
                  "00001000"
                  + // A3-H3
                  "00001000"
                  + // A2-H2
                  "00001000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_E8)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_E8)));
   }

   public void testQueenPathsFromF8() {
      Assert
            .assertEquals(""
                  + //
                  "11111011"
                  + // A8-H8
                  "00001110"
                  + // A7-H7
                  "00010101"
                  + // A6-H6
                  "00100100"
                  + // A5-H5
                  "01000100"
                  + // A4-H4
                  "10000100"
                  + // A3-H3
                  "00000100"
                  + // A2-H2
                  "00000100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_F8)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_F8)));
   }

   public void testQueenPathsFromG8() {
      Assert
            .assertEquals(""
                  + //
                  "11111101"
                  + // A8-H8
                  "00000111"
                  + // A7-H7
                  "00001010"
                  + // A6-H6
                  "00010010"
                  + // A5-H5
                  "00100010"
                  + // A4-H4
                  "01000010"
                  + // A3-H3
                  "10000010"
                  + // A2-H2
                  "00000010", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_G8)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_G8)));
   }

   public void testQueenPathsFromH8() {
      Assert
            .assertEquals(""
                  + //
                  "11111110"
                  + // A8-H8
                  "00000011"
                  + // A7-H7
                  "00000101"
                  + // A6-H6
                  "00001001"
                  + // A5-H5
                  "00010001"
                  + // A4-H4
                  "00100001"
                  + // A3-H3
                  "01000001"
                  + // A2-H2
                  "10000001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(Queen._PATHS_FROM_H8)
                        .length() - 1] + Long
                        .toBinaryString(Queen._PATHS_FROM_H8)));
   }

}