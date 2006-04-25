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


public class BishopMaskTest extends TestCase {

   private final String[] zeroPrefix = new String[64];

   public BishopMaskTest() {
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

   public void test_NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A8A8() {
      Assert
            .assertEquals(
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
                        BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A8A8)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A8A8)));
   }

   public void test_NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A7B8() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "01111111"
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
                        BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A7B8)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A7B8)));
   }

   public void test_NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A6C8() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "00111111"
                        + // A8-H8
                        "01111111"
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
                        BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A6C8)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A6C8)));
   }
   public void test_NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A5D8() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "00011111"
                        + // A8-H8
                        "00111111"
                        + // A7-H7
                        "01111111"
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
                        BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A5D8)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A5D8)));
   }
   public void test_NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A4E8() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "00001111"
                        + // A8-H8
                        "00011111"
                        + // A7-H7
                        "00111111"
                        + // A6-H6
                        "01111111"
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
                        BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A4E8)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A4E8)));
   }
   public void test_NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A3F8() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "00000111"
                        + // A8-H8
                        "00001111"
                        + // A7-H7
                        "00011111"
                        + // A6-H6
                        "00111111"
                        + // A5-H5
                        "01111111"
                        + // A4-H4
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // B2-H2
                        "11111111" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A3F8)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A3F8)));
   }
   public void test_NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A2G8() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "00000011"
                        + // A8-H8
                        "00000111"
                        + // A7-H7
                        "00001111"
                        + // A6-H6
                        "00011111"
                        + // A5-H5
                        "00111111"
                        + // A4-H4
                        "01111111"
                        + // A3-H3
                        "11111111"
                        + // B2-H2
                        "11111111" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A2G8)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A2G8)));
   }
   public void test_NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A1H8() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "00000001"
                        + // A8-H8
                        "00000011"
                        + // A7-H7
                        "00000111"
                        + // A6-H6
                        "00001111"
                        + // A5-H5
                        "00011111"
                        + // A4-H4
                        "00111111"
                        + // A3-H3
                        "01111111"
                        + // B2-H2
                        "11111111" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A1H8)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A1H8)));
   }
   public void test_NORTHWEST2SOUTHEAST_FROM_DIAGONAL_B1H7() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "00000000"
                        + // A8-H8
                        "00000001"
                        + // A7-H7
                        "00000011"
                        + // A6-H6
                        "00000111"
                        + // A5-H5
                        "00001111"
                        + // A4-H4
                        "00011111"
                        + // A3-H3
                        "00111111"
                        + // B2-H2
                        "01111111" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_B1H7)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_B1H7)));
   }
   public void test_NORTHWEST2SOUTHEAST_FROM_DIAGONAL_C1H6() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "00000000"
                        + // A8-H8
                        "00000000"
                        + // A7-H7
                        "00000001"
                        + // A6-H6
                        "00000011"
                        + // A5-H5
                        "00000111"
                        + // A4-H4
                        "00001111"
                        + // A3-H3
                        "00011111"
                        + // B2-H2
                        "00111111" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_C1H6)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_C1H6)));
   }
   public void test_NORTHWEST2SOUTHEAST_FROM_DIAGONAL_D1H5() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "00000000"
                        + // A8-H8
                        "00000000"
                        + // A7-H7
                        "00000000"
                        + // A6-H6
                        "00000001"
                        + // A5-H5
                        "00000011"
                        + // A4-H4
                        "00000111"
                        + // A3-H3
                        "00001111"
                        + // B2-H2
                        "00011111" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_D1H5)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_D1H5)));
   }
   public void test_NORTHWEST2SOUTHEAST_FROM_DIAGONAL_E1H4() {
      Assert
            .assertEquals(
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
                        "00000001"
                        + // A4-H4
                        "00000011"
                        + // A3-H3
                        "00000111"
                        + // B2-H2
                        "00001111" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_E1H4)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_E1H4)));
   }
   public void test_NORTHWEST2SOUTHEAST_FROM_DIAGONAL_F1H3() {
      Assert
            .assertEquals(
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
                        "00000001"
                        + // A3-H3
                        "00000011"
                        + // B2-H2
                        "00000111" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_F1H3)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_F1H3)));
   }

   public void test_NORTHWEST2SOUTHEAST_FROM_DIAGONAL_G1H2() {
      Assert
            .assertEquals(
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
                        "00000001"
                        + // B2-H2
                        "00000011" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_G1H2)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_G1H2)));
   }
   
   public void test_NORTHWEST2SOUTHEAST_FROM_DIAGONAL_H1H1() {
      Assert
            .assertEquals(
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
                        "00000001" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_H1H1)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHWEST2SOUTHEAST_FROM_DIAGONAL_H1H1)));
   }
   public void test_SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A1A1() {
      Assert
            .assertEquals(
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
                        BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A1A1)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A1A1)));
   }
   public void test_SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A2B1() {
      Assert
            .assertEquals(
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
                        "01111111" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A2B1)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A2B1)));
   }
   
   public void test_SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A3C1() {
      Assert
            .assertEquals(
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
                        "01111111"
                        + // B2-H2
                        "00111111" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A3C1)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A3C1)));
   }
   public void test_SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A4D1() {
      Assert
            .assertEquals(
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
                        "01111111"
                        + // A3-H3
                        "00111111"
                        + // B2-H2
                        "00011111" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A4D1)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A4D1)));
   }
   public void test_SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A5E1() {
      Assert
            .assertEquals(
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
                        "01111111"
                        + // A4-H4
                        "00111111"
                        + // A3-H3
                        "00011111"
                        + // B2-H2
                        "00001111" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A5E1)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A5E1)));
   }
   public void test_SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A6F1() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "11111111"
                        + // A8-H8
                        "11111111"
                        + // A7-H7
                        "11111111"
                        + // A6-H6
                        "01111111"
                        + // A5-H5
                        "00111111"
                        + // A4-H4
                        "00011111"
                        + // A3-H3
                        "00001111"
                        + // B2-H2
                        "00000111" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A6F1)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A6F1)));
   }
   public void test_SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A7G1() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "11111111"
                        + // A8-H8
                        "11111111"
                        + // A7-H7
                        "01111111"
                        + // A6-H6
                        "00111111"
                        + // A5-H5
                        "00011111"
                        + // A4-H4
                        "00001111"
                        + // A3-H3
                        "00000111"
                        + // B2-H2
                        "00000011" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A7G1)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A7G1)));
   }
   public void test_SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A8H1() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "11111111"
                        + // A8-H8
                        "01111111"
                        + // A7-H7
                        "00111111"
                        + // A6-H6
                        "00011111"
                        + // A5-H5
                        "00001111"
                        + // A4-H4
                        "00000111"
                        + // A3-H3
                        "00000011"
                        + // B2-H2
                        "00000001" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A8H1)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A8H1)));
   }
   public void test_SOUTHWEST2NORTHEAST_FROM_DIAGONAL_B8H2() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "01111111"
                        + // A8-H8
                        "00111111"
                        + // A7-H7
                        "00011111"
                        + // A6-H6
                        "00001111"
                        + // A5-H5
                        "00000111"
                        + // A4-H4
                        "00000011"
                        + // A3-H3
                        "00000001"
                        + // B2-H2
                        "00000000" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_B8H2)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_B8H2)));
   }
   public void test_SOUTHWEST2NORTHEAST_FROM_DIAGONAL_C8H3() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "00111111"
                        + // A8-H8
                        "00011111"
                        + // A7-H7
                        "00001111"
                        + // A6-H6
                        "00000111"
                        + // A5-H5
                        "00000011"
                        + // A4-H4
                        "00000001"
                        + // A3-H3
                        "00000000"
                        + // B2-H2
                        "00000000" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_C8H3)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_C8H3)));
   }
   public void test_SOUTHWEST2NORTHEAST_FROM_DIAGONAL_D8H4() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "00011111"
                        + // A8-H8
                        "00001111"
                        + // A7-H7
                        "00000111"
                        + // A6-H6
                        "00000011"
                        + // A5-H5
                        "00000001"
                        + // A4-H4
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // B2-H2
                        "00000000" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_D8H4)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_D8H4)));
   }
   public void test_SOUTHWEST2NORTHEAST_FROM_DIAGONAL_E8H5() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "00001111"
                        + // A8-H8
                        "00000111"
                        + // A7-H7
                        "00000011"
                        + // A6-H6
                        "00000001"
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
                        BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_E8H5)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_E8H5)));
   }
   public void test_SOUTHWEST2NORTHEAST_FROM_DIAGONAL_F8H6() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "00000111"
                        + // A8-H8
                        "00000011"
                        + // A7-H7
                        "00000001"
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
                        BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_F8H6)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_F8H6)));
   }
   public void test_SOUTHWEST2NORTHEAST_FROM_DIAGONAL_G8H7() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "00000011"
                        + // A8-H8
                        "00000001"
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
                        BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_G8H7)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_G8H7)));
   }
   public void test_SOUTHWEST2NORTHEAST_FROM_DIAGONAL_H8H8() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "00000001"
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
                        BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_H8H8)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHWEST2NORTHEAST_FROM_DIAGONAL_H8H8)));
   }

   public void test_NORTHEAST2SOUTHWEST_FROM_DIAGONAL_H8H8() {
      Assert
            .assertEquals(
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
                        BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_H8H8)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_H8H8)));
   }
   public void test_NORTHEAST2SOUTHWEST_FROM_DIAGONAL_G8H7() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "11111110"
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
                        BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_G8H7)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_G8H7)));
   }
   public void test_NORTHEAST2SOUTHWEST_FROM_DIAGONAL_F8H6() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "11111100"
                        + // A8-H8
                        "11111110"
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
                        BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_F8H6)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_F8H6)));
   }
   public void test_NORTHEAST2SOUTHWEST_FROM_DIAGONAL_E8H5() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "11111000"
                        + // A8-H8
                        "11111100"
                        + // A7-H7
                        "11111110"
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
                        BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_E8H5)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_E8H5)));
   }
   public void test_NORTHEAST2SOUTHWEST_FROM_DIAGONAL_D8H4() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "11110000"
                        + // A8-H8
                        "11111000"
                        + // A7-H7
                        "11111100"
                        + // A6-H6
                        "11111110"
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
                        BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_D8H4)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_D8H4)));
   }
   public void test_NORTHEAST2SOUTHWEST_FROM_DIAGONAL_C8H3() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "11100000"
                        + // A8-H8
                        "11110000"
                        + // A7-H7
                        "11111000"
                        + // A6-H6
                        "11111100"
                        + // A5-H5
                        "11111110"
                        + // A4-H4
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // B2-H2
                        "11111111" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_C8H3)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_C8H3)));
   }
   public void test_NORTHEAST2SOUTHWEST_FROM_DIAGONAL_B8H2() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "11000000"
                        + // A8-H8
                        "11100000"
                        + // A7-H7
                        "11110000"
                        + // A6-H6
                        "11111000"
                        + // A5-H5
                        "11111100"
                        + // A4-H4
                        "11111110"
                        + // A3-H3
                        "11111111"
                        + // B2-H2
                        "11111111" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_B8H2)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_B8H2)));
   }
   public void test_NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A8H1() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "10000000"
                        + // A8-H8
                        "11000000"
                        + // A7-H7
                        "11100000"
                        + // A6-H6
                        "11110000"
                        + // A5-H5
                        "11111000"
                        + // A4-H4
                        "11111100"
                        + // A3-H3
                        "11111110"
                        + // B2-H2
                        "11111111" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A8H1)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A8H1)));
   }
   public void test_NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A7G1() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "00000000"
                        + // A8-H8
                        "10000000"
                        + // A7-H7
                        "11000000"
                        + // A6-H6
                        "11100000"
                        + // A5-H5
                        "11110000"
                        + // A4-H4
                        "11111000"
                        + // A3-H3
                        "11111100"
                        + // B2-H2
                        "11111110" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A7G1)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A7G1)));
   }
   public void test_NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A6F1() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "00000000"
                        + // A8-H8
                        "00000000"
                        + // A7-H7
                        "10000000"
                        + // A6-H6
                        "11000000"
                        + // A5-H5
                        "11100000"
                        + // A4-H4
                        "11110000"
                        + // A3-H3
                        "11111000"
                        + // B2-H2
                        "11111100" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A6F1)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A6F1)));
   }
   public void test_NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A5E1() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "00000000"
                        + // A8-H8
                        "00000000"
                        + // A7-H7
                        "00000000"
                        + // A6-H6
                        "10000000"
                        + // A5-H5
                        "11000000"
                        + // A4-H4
                        "11100000"
                        + // A3-H3
                        "11110000"
                        + // B2-H2
                        "11111000" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A5E1)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A5E1)));
   }
   public void test_NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A4D1() {
      Assert
            .assertEquals(
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
                        "10000000"
                        + // A4-H4
                        "11000000"
                        + // A3-H3
                        "11100000"
                        + // B2-H2
                        "11110000" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A4D1)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A4D1)));
   }
   public void test_NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A3C1() {
      Assert
            .assertEquals(
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
                        "10000000"
                        + // A3-H3
                        "11000000"
                        + // B2-H2
                        "11100000" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A3C1)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A3C1)));
   }
   public void test_NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A2B1() {
      Assert
            .assertEquals(
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
                        "10000000"
                        + // B2-H2
                        "11000000" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A2B1)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A2B1)));
   }
   public void test_NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A1A1() {
      Assert
            .assertEquals(
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
                        "10000000" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A1A1)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A1A1)));
   }
   public void test_SOUTHEAST2NORTHWEST_FROM_DIAGONAL_H1H1() {
      Assert
            .assertEquals(
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
                        BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_H1H1)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_H1H1)));
   }
   public void test_SOUTHEAST2NORTHWEST_FROM_DIAGONAL_G1H2() {
      Assert
            .assertEquals(
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
                        "11111110" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_G1H2)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_G1H2)));
   }
   public void test_SOUTHEAST2NORTHWEST_FROM_DIAGONAL_F1H3() {
      Assert
            .assertEquals(
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
                        "11111110"
                        + // B2-H2
                        "11111100" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_F1H3)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_F1H3)));
   }
   public void test_SOUTHEAST2NORTHWEST_FROM_DIAGONAL_E1H4() {
      Assert
            .assertEquals(
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
                        "11111110"
                        + // A3-H3
                        "11111100"
                        + // B2-H2
                        "11111000" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_E1H4)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_E1H4)));
   }
   public void test_SOUTHEAST2NORTHWEST_FROM_DIAGONAL_D1H5() {
      Assert
            .assertEquals(
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
                        "11111110"
                        + // A4-H4
                        "11111100"
                        + // A3-H3
                        "11111000"
                        + // B2-H2
                        "11110000" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_D1H5)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_D1H5)));
   }
   public void test_SOUTHEAST2NORTHWEST_FROM_DIAGONAL_C1H6() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "11111111"
                        + // A8-H8
                        "11111111"
                        + // A7-H7
                        "11111111"
                        + // A6-H6
                        "11111110"
                        + // A5-H5
                        "11111100"
                        + // A4-H4
                        "11111000"
                        + // A3-H3
                        "11110000"
                        + // B2-H2
                        "11100000" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_C1H6)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_C1H6)));
   }
   public void test_SOUTHEAST2NORTHWEST_FROM_DIAGONAL_B1H7() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "11111111"
                        + // A8-H8
                        "11111111"
                        + // A7-H7
                        "11111110"
                        + // A6-H6
                        "11111100"
                        + // A5-H5
                        "11111000"
                        + // A4-H4
                        "11110000"
                        + // A3-H3
                        "11100000"
                        + // B2-H2
                        "11000000" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_B1H7)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_B1H7)));
   }
   public void test_SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A1H8() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "11111111"
                        + // A8-H8
                        "11111110"
                        + // A7-H7
                        "11111100"
                        + // A6-H6
                        "11111000"
                        + // A5-H5
                        "11110000"
                        + // A4-H4
                        "11100000"
                        + // A3-H3
                        "11000000"
                        + // B2-H2
                        "10000000" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A1H8)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A1H8)));
   }
   public void test_SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A2G8() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "11111110"
                        + // A8-H8
                        "11111100"
                        + // A7-H7
                        "11111000"
                        + // A6-H6
                        "11110000"
                        + // A5-H5
                        "11100000"
                        + // A4-H4
                        "11000000"
                        + // A3-H3
                        "10000000"
                        + // B2-H2
                        "00000000" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A2G8)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A2G8)));
   }
   public void test_SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A3F8() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "11111100"
                        + // A8-H8
                        "11111000"
                        + // A7-H7
                        "11110000"
                        + // A6-H6
                        "11100000"
                        + // A5-H5
                        "11000000"
                        + // A4-H4
                        "10000000"
                        + // A3-H3
                        "00000000"
                        + // B2-H2
                        "00000000" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A3F8)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A3F8)));
   }
   public void test_SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A4E8() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "11111000"
                        + // A8-H8
                        "11110000"
                        + // A7-H7
                        "11100000"
                        + // A6-H6
                        "11000000"
                        + // A5-H5
                        "10000000"
                        + // A4-H4
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // B2-H2
                        "00000000" // A1-H1
                  ,
                  (this.zeroPrefix[Long.toBinaryString(
                        BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A4E8)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A4E8)));
   }
   public void test_SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A5D8() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "11110000"
                        + // A8-H8
                        "11100000"
                        + // A7-H7
                        "11000000"
                        + // A6-H6
                        "10000000"
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
                        BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A5D8)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A5D8)));
   }
   public void test_SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A6C8() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "11100000"
                        + // A8-H8
                        "11000000"
                        + // A7-H7
                        "10000000"
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
                        BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A6C8)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A6C8)));
   }
   public void test_SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A7B8() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "11000000"
                        + // A8-H8
                        "10000000"
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
                        BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A7B8)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A7B8)));
   }

   public void test_SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A8A8() {
      Assert
            .assertEquals(
                  ""
                        + //
                        "10000000"
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
                        BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A8A8)
                        .length() - 1] + Long
                        .toBinaryString(BishopMask._SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A8A8)));
   }


}