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

import org.forritan.talvmenni.bitboard.Square;


public class RookMasksTest extends TestCase {

   private final String[] zeroPrefix = new String[64];

   public RookMasksTest() {
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

   public void testEast2WestRookMaskFromA1() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "10000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._A1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._A1))));
   }

   public void testEast2WestRookMaskFromB1() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._B1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._B1))));
   }

   public void testEast2WestRookMaskFromC1() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._C1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._C1))));
   }

   public void testEast2WestRookMaskFromD1() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11110000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._D1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._D1))));
   }

   public void testEast2WestRookMaskFromE1() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._E1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._E1))));
   }

   public void testEast2WestRookMaskFromF1() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._F1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._F1))));
   }

   public void testEast2WestRookMaskFromG1() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111110", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._G1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._G1))));
   }

   public void testEast2WestRookMaskFromH1() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._H1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._H1))));
   }

   public void testEast2WestRookMaskFromA2() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "10000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._A2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._A2))));
   }

   public void testEast2WestRookMaskFromB2() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._B2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._B2))));
   }

   public void testEast2WestRookMaskFromC2() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._C2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._C2))));
   }

   public void testEast2WestRookMaskFromD2() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11110000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._D2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._D2))));
   }

   public void testEast2WestRookMaskFromE2() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._E2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._E2))));
   }

   public void testEast2WestRookMaskFromF2() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._F2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._F2))));
   }

   public void testEast2WestRookMaskFromG2() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111110", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._G2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._G2))));
   }

   public void testEast2WestRookMaskFromH2() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._H2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._H2))));
   }

   public void testEast2WestRookMaskFromA3() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "10000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._A3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._A3))));
   }

   public void testEast2WestRookMaskFromB3() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._B3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._B3))));
   }

   public void testEast2WestRookMaskFromC3() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._C3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._C3))));
   }

   public void testEast2WestRookMaskFromD3() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11110000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._D3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._D3))));
   }

   public void testEast2WestRookMaskFromE3() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._E3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._E3))));
   }

   public void testEast2WestRookMaskFromF3() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._F3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._F3))));
   }

   public void testEast2WestRookMaskFromG3() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111110", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._G3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._G3))));
   }

   public void testEast2WestRookMaskFromH3() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._H3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._H3))));
   }

   public void testEast2WestRookMaskFromA4() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "10000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._A4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._A4))));
   }

   public void testEast2WestRookMaskFromB4() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._B4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._B4))));
   }

   public void testEast2WestRookMaskFromC4() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._C4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._C4))));
   }

   public void testEast2WestRookMaskFromD4() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11110000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._D4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._D4))));
   }

   public void testEast2WestRookMaskFromE4() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._E4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._E4))));
   }

   public void testEast2WestRookMaskFromF4() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._F4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._F4))));
   }

   public void testEast2WestRookMaskFromG4() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111110", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._G4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._G4))));
   }

   public void testEast2WestRookMaskFromH4() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._H4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._H4))));
   }

   public void testEast2WestRookMaskFromA5() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "10000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._A5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._A5))));
   }

   public void testEast2WestRookMaskFromB5() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._B5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._B5))));
   }

   public void testEast2WestRookMaskFromC5() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._C5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._C5))));
   }

   public void testEast2WestRookMaskFromD5() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11110000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._D5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._D5))));
   }

   public void testEast2WestRookMaskFromE5() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._E5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._E5))));
   }

   public void testEast2WestRookMaskFromF5() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._F5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._F5))));
   }

   public void testEast2WestRookMaskFromG5() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111110", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._G5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._G5))));
   }

   public void testEast2WestRookMaskFromH5() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._H5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._H5))));
   }

   public void testEast2WestRookMaskFromA6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "10000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._A6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._A6))));
   }

   public void testEast2WestRookMaskFromB6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._B6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._B6))));
   }

   public void testEast2WestRookMaskFromC6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._C6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._C6))));
   }

   public void testEast2WestRookMaskFromD6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11110000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._D6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._D6))));
   }

   public void testEast2WestRookMaskFromE6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._E6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._E6))));
   }

   public void testEast2WestRookMaskFromF6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._F6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._F6))));
   }

   public void testEast2WestRookMaskFromG6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111110", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._G6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._G6))));
   }

   public void testEast2WestRookMaskFromH6() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._H6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._H6))));
   }

   public void testEast2WestRookMaskFromA7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "10000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._A7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._A7))));
   }

   public void testEast2WestRookMaskFromB7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._B7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._B7))));
   }

   public void testEast2WestRookMaskFromC7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._C7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._C7))));
   }

   public void testEast2WestRookMaskFromD7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11110000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._D7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._D7))));
   }

   public void testEast2WestRookMaskFromE7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._E7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._E7))));
   }

   public void testEast2WestRookMaskFromF7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._F7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._F7))));
   }

   public void testEast2WestRookMaskFromG7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111110", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._G7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._G7))));
   }

   public void testEast2WestRookMaskFromH7() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._H7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._H7))));
   }

   public void testEast2WestRookMaskFromA8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "10000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._A8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._A8))));
   }

   public void testEast2WestRookMaskFromB8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._B8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._B8))));
   }

   public void testEast2WestRookMaskFromC8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11100000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._C8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._C8))));
   }

   public void testEast2WestRookMaskFromD8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11110000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._D8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._D8))));
   }

   public void testEast2WestRookMaskFromE8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._E8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._E8))));
   }

   public void testEast2WestRookMaskFromF8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111100", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._F8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._F8))));
   }

   public void testEast2WestRookMaskFromG8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111110", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._G8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._G8))));
   }

   public void testEast2WestRookMaskFromH8() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getEast2WestMaskFrom(Square._H8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getEast2WestMaskFrom(Square._H8))));
   }

   public void testWest2EastRookMaskFromA1() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._A1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._A1))));
   }

   public void testWest2EastRookMaskFromB1() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "01111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._B1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._B1))));
   }

   public void testWest2EastRookMaskFromC1() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._C1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._C1))));
   }

   public void testWest2EastRookMaskFromD1() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00011111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._D1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._D1))));
   }

   public void testWest2EastRookMaskFromE1() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00001111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._E1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._E1))));
   }

   public void testWest2EastRookMaskFromF1() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._F1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._F1))));
   }

   public void testWest2EastRookMaskFromG1() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000011", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._G1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._G1))));
   }

   public void testWest2EastRookMaskFromH1() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._H1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._H1))));
   }

   public void testWest2EastRookMaskFromA2() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._A2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._A2))));
   }

   public void testWest2EastRookMaskFromB2() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "01111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._B2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._B2))));
   }

   public void testWest2EastRookMaskFromC2() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._C2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._C2))));
   }

   public void testWest2EastRookMaskFromD2() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00011111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._D2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._D2))));
   }

   public void testWest2EastRookMaskFromE2() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00001111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._E2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._E2))));
   }

   public void testWest2EastRookMaskFromF2() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._F2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._F2))));
   }

   public void testWest2EastRookMaskFromG2() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000011", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._G2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._G2))));
   }

   public void testWest2EastRookMaskFromH2() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._H2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._H2))));
   }

   public void testWest2EastRookMaskFromA3() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._A3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._A3))));
   }

   public void testWest2EastRookMaskFromB3() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "01111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._B3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._B3))));
   }

   public void testWest2EastRookMaskFromC3() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._C3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._C3))));
   }

   public void testWest2EastRookMaskFromD3() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00011111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._D3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._D3))));
   }

   public void testWest2EastRookMaskFromE3() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00001111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._E3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._E3))));
   }

   public void testWest2EastRookMaskFromF3() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._F3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._F3))));
   }

   public void testWest2EastRookMaskFromG3() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000011", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._G3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._G3))));
   }

   public void testWest2EastRookMaskFromH3() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._H3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._H3))));
   }

   public void testWest2EastRookMaskFromA4() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._A4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._A4))));
   }

   public void testWest2EastRookMaskFromB4() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "01111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._B4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._B4))));
   }

   public void testWest2EastRookMaskFromC4() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._C4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._C4))));
   }

   public void testWest2EastRookMaskFromD4() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00011111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._D4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._D4))));
   }

   public void testWest2EastRookMaskFromE4() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00001111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._E4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._E4))));
   }

   public void testWest2EastRookMaskFromF4() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._F4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._F4))));
   }

   public void testWest2EastRookMaskFromG4() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000011", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._G4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._G4))));
   }

   public void testWest2EastRookMaskFromH4() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._H4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._H4))));
   }

   public void testWest2EastRookMaskFromA5() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._A5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._A5))));
   }

   public void testWest2EastRookMaskFromB5() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "01111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._B5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._B5))));
   }

   public void testWest2EastRookMaskFromC5() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._C5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._C5))));
   }

   public void testWest2EastRookMaskFromD5() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00011111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._D5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._D5))));
   }

   public void testWest2EastRookMaskFromE5() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00001111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._E5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._E5))));
   }

   public void testWest2EastRookMaskFromF5() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._F5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._F5))));
   }

   public void testWest2EastRookMaskFromG5() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000011", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._G5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._G5))));
   }

   public void testWest2EastRookMaskFromH5() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._H5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._H5))));
   }

   public void testWest2EastRookMaskFromA6() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._A6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._A6))));
   }

   public void testWest2EastRookMaskFromB6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "01111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._B6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._B6))));
   }

   public void testWest2EastRookMaskFromC6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._C6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._C6))));
   }

   public void testWest2EastRookMaskFromD6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00011111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._D6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._D6))));
   }

   public void testWest2EastRookMaskFromE6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00001111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._E6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._E6))));
   }

   public void testWest2EastRookMaskFromF6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._F6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._F6))));
   }

   public void testWest2EastRookMaskFromG6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000011", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._G6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._G6))));
   }

   public void testWest2EastRookMaskFromH6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._H6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._H6))));
   }

   public void testWest2EastRookMaskFromA7() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._A7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._A7))));
   }

   public void testWest2EastRookMaskFromB7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "01111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._B7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._B7))));
   }

   public void testWest2EastRookMaskFromC7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._C7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._C7))));
   }

   public void testWest2EastRookMaskFromD7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00011111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._D7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._D7))));
   }

   public void testWest2EastRookMaskFromE7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00001111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._E7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._E7))));
   }

   public void testWest2EastRookMaskFromF7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._F7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._F7))));
   }

   public void testWest2EastRookMaskFromG7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000011", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._G7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._G7))));
   }

   public void testWest2EastRookMaskFromH7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._H7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._H7))));
   }

   public void testWest2EastRookMaskFromA8() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._A8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._A8))));
   }

   public void testWest2EastRookMaskFromB8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "01111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._B8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._B8))));
   }

   public void testWest2EastRookMaskFromC8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._C8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._C8))));
   }

   public void testWest2EastRookMaskFromD8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00011111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._D8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._D8))));
   }

   public void testWest2EastRookMaskFromE8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00001111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._E8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._E8))));
   }

   public void testWest2EastRookMaskFromF8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._F8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._F8))));
   }

   public void testWest2EastRookMaskFromG8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000011", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._G8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._G8))));
   }

   public void testWest2EastRookMaskFromH8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000001", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getWest2EastMaskFrom(Square._H8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getWest2EastMaskFrom(Square._H8))));
   }

   public void testNorth2SouthRookMaskFromA1() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._A1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._A1))));
   }

   public void testNorth2SouthRookMaskFromB1() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._B1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._B1))));
   }

   public void testNorth2SouthRookMaskFromC1() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._C1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._C1))));
   }

   public void testNorth2SouthRookMaskFromD1() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._D1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._D1))));
   }

   public void testNorth2SouthRookMaskFromE1() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._E1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._E1))));
   }

   public void testNorth2SouthRookMaskFromF1() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._F1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._F1))));
   }

   public void testNorth2SouthRookMaskFromG1() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._G1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._G1))));
   }

   public void testNorth2SouthRookMaskFromH1() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._H1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._H1))));
   }

   public void testNorth2SouthRookMaskFromA2() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._A2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._A2))));
   }

   public void testNorth2SouthRookMaskFromB2() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._B2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._B2))));
   }

   public void testNorth2SouthRookMaskFromC2() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._C2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._C2))));
   }

   public void testNorth2SouthRookMaskFromD2() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._D2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._D2))));
   }

   public void testNorth2SouthRookMaskFromE2() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._E2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._E2))));
   }

   public void testNorth2SouthRookMaskFromF2() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._F2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._F2))));
   }

   public void testNorth2SouthRookMaskFromG2() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._G2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._G2))));
   }

   public void testNorth2SouthRookMaskFromH2() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._H2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._H2))));
   }

   public void testNorth2SouthRookMaskFromA3() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._A3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._A3))));
   }

   public void testNorth2SouthRookMaskFromB3() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._B3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._B3))));
   }

   public void testNorth2SouthRookMaskFromC3() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._C3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._C3))));
   }

   public void testNorth2SouthRookMaskFromD3() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._D3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._D3))));
   }

   public void testNorth2SouthRookMaskFromE3() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._E3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._E3))));
   }

   public void testNorth2SouthRookMaskFromF3() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._F3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._F3))));
   }

   public void testNorth2SouthRookMaskFromG3() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._G3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._G3))));
   }

   public void testNorth2SouthRookMaskFromH3() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._H3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._H3))));
   }

   public void testNorth2SouthRookMaskFromA4() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A4-H4
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._A4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._A4))));
   }

   public void testNorth2SouthRookMaskFromB4() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A4-H4
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._B4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._B4))));
   }

   public void testNorth2SouthRookMaskFromC4() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A4-H4
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._C4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._C4))));
   }

   public void testNorth2SouthRookMaskFromD4() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A4-H4
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._D4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._D4))));
   }

   public void testNorth2SouthRookMaskFromE4() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A4-H4
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._E4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._E4))));
   }

   public void testNorth2SouthRookMaskFromF4() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A4-H4
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._F4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._F4))));
   }

   public void testNorth2SouthRookMaskFromG4() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A4-H4
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._G4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._G4))));
   }

   public void testNorth2SouthRookMaskFromH4() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A4-H4
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._H4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._H4))));
   }

   public void testNorth2SouthRookMaskFromA5() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A5-H5
                        "11111111"
                        + // A4-H4
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._A5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._A5))));
   }

   public void testNorth2SouthRookMaskFromB5() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A5-H5
                        "11111111"
                        + // A4-H4
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._B5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._B5))));
   }

   public void testNorth2SouthRookMaskFromC5() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A5-H5
                        "11111111"
                        + // A4-H4
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._C5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._C5))));
   }

   public void testNorth2SouthRookMaskFromD5() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A5-H5
                        "11111111"
                        + // A4-H4
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._D5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._D5))));
   }

   public void testNorth2SouthRookMaskFromE5() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A5-H5
                        "11111111"
                        + // A4-H4
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._E5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._E5))));
   }

   public void testNorth2SouthRookMaskFromF5() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A5-H5
                        "11111111"
                        + // A4-H4
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._F5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._F5))));
   }

   public void testNorth2SouthRookMaskFromG5() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A5-H5
                        "11111111"
                        + // A4-H4
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._G5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._G5))));
   }

   public void testNorth2SouthRookMaskFromH5() {
      RookMask rookMask= RookMasks.create();
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
                        "11111111"
                        + // A5-H5
                        "11111111"
                        + // A4-H4
                        "11111111"
                        + // A3-H3
                        "11111111"
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._H5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._H5))));
   }

   public void testNorth2SouthRookMaskFromA6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._A6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._A6))));
   }

   public void testNorth2SouthRookMaskFromB6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._B6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._B6))));
   }

   public void testNorth2SouthRookMaskFromC6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._C6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._C6))));
   }

   public void testNorth2SouthRookMaskFromD6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._D6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._D6))));
   }

   public void testNorth2SouthRookMaskFromE6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._E6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._E6))));
   }

   public void testNorth2SouthRookMaskFromF6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._F6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._F6))));
   }

   public void testNorth2SouthRookMaskFromG6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._G6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._G6))));
   }

   public void testNorth2SouthRookMaskFromH6() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._H6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._H6))));
   }

   public void testNorth2SouthRookMaskFromA7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._A7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._A7))));
   }

   public void testNorth2SouthRookMaskFromB7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._B7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._B7))));
   }

   public void testNorth2SouthRookMaskFromC7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._C7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._C7))));
   }

   public void testNorth2SouthRookMaskFromD7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._D7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._D7))));
   }

   public void testNorth2SouthRookMaskFromE7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._E7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._E7))));
   }

   public void testNorth2SouthRookMaskFromF7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._F7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._F7))));
   }

   public void testNorth2SouthRookMaskFromG7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._G7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._G7))));
   }

   public void testNorth2SouthRookMaskFromH7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._H7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._H7))));
   }

   public void testNorth2SouthRookMaskFromA8() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._A8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._A8))));
   }

   public void testNorth2SouthRookMaskFromB8() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._B8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._B8))));
   }

   public void testNorth2SouthRookMaskFromC8() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._C8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._C8))));
   }

   public void testNorth2SouthRookMaskFromD8() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._D8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._D8))));
   }

   public void testNorth2SouthRookMaskFromE8() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._E8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._E8))));
   }

   public void testNorth2SouthRookMaskFromF8() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._F8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._F8))));
   }

   public void testNorth2SouthRookMaskFromG8() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._G8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._G8))));
   }

   public void testNorth2SouthRookMaskFromH8() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getNorth2SouthMaskFrom(Square._H8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getNorth2SouthMaskFrom(Square._H8))));
   }

   public void testSouth2NorthRookMaskFromA1() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._A1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._A1))));
   }

   public void testSouth2NorthRookMaskFromB1() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._B1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._B1))));
   }

   public void testSouth2NorthRookMaskFromC1() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._C1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._C1))));
   }

   public void testSouth2NorthRookMaskFromD1() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._D1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._D1))));
   }

   public void testSouth2NorthRookMaskFromE1() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._E1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._E1))));
   }

   public void testSouth2NorthRookMaskFromF1() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._F1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._F1))));
   }

   public void testSouth2NorthRookMaskFromG1() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._G1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._G1))));
   }

   public void testSouth2NorthRookMaskFromH1() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "11111111", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._H1)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._H1))));
   }

   public void testSouth2NorthRookMaskFromA2() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._A2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._A2))));
   }

   public void testSouth2NorthRookMaskFromB2() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._B2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._B2))));
   }

   public void testSouth2NorthRookMaskFromC2() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._C2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._C2))));
   }

   public void testSouth2NorthRookMaskFromD2() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._D2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._D2))));
   }

   public void testSouth2NorthRookMaskFromE2() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._E2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._E2))));
   }

   public void testSouth2NorthRookMaskFromF2() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._F2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._F2))));
   }

   public void testSouth2NorthRookMaskFromG2() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._G2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._G2))));
   }

   public void testSouth2NorthRookMaskFromH2() {
      RookMask rookMask= RookMasks.create();
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._H2)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._H2))));
   }

   public void testSouth2NorthRookMaskFromA3() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._A3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._A3))));
   }

   public void testSouth2NorthRookMaskFromB3() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._B3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._B3))));
   }

   public void testSouth2NorthRookMaskFromC3() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._C3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._C3))));
   }

   public void testSouth2NorthRookMaskFromD3() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._D3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._D3))));
   }

   public void testSouth2NorthRookMaskFromE3() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._E3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._E3))));
   }

   public void testSouth2NorthRookMaskFromF3() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._F3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._F3))));
   }

   public void testSouth2NorthRookMaskFromG3() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._G3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._G3))));
   }

   public void testSouth2NorthRookMaskFromH3() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._H3)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._H3))));
   }

   public void testSouth2NorthRookMaskFromA4() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._A4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._A4))));
   }

   public void testSouth2NorthRookMaskFromB4() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._B4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._B4))));
   }

   public void testSouth2NorthRookMaskFromC4() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._C4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._C4))));
   }

   public void testSouth2NorthRookMaskFromD4() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._D4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._D4))));
   }

   public void testSouth2NorthRookMaskFromE4() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._E4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._E4))));
   }

   public void testSouth2NorthRookMaskFromF4() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._F4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._F4))));
   }

   public void testSouth2NorthRookMaskFromG4() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._G4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._G4))));
   }

   public void testSouth2NorthRookMaskFromH4() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._H4)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._H4))));
   }

   public void testSouth2NorthRookMaskFromA5() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A4-H4
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._A5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._A5))));
   }

   public void testSouth2NorthRookMaskFromB5() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A4-H4
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._B5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._B5))));
   }

   public void testSouth2NorthRookMaskFromC5() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A4-H4
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._C5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._C5))));
   }

   public void testSouth2NorthRookMaskFromD5() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A4-H4
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._D5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._D5))));
   }

   public void testSouth2NorthRookMaskFromE5() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A4-H4
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._E5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._E5))));
   }

   public void testSouth2NorthRookMaskFromF5() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A4-H4
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._F5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._F5))));
   }

   public void testSouth2NorthRookMaskFromG5() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A4-H4
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._G5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._G5))));
   }

   public void testSouth2NorthRookMaskFromH5() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A4-H4
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._H5)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._H5))));
   }

   public void testSouth2NorthRookMaskFromA6() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A5-H5
                        "00000000"
                        + // A4-H4
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._A6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._A6))));
   }

   public void testSouth2NorthRookMaskFromB6() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A5-H5
                        "00000000"
                        + // A4-H4
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._B6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._B6))));
   }

   public void testSouth2NorthRookMaskFromC6() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A5-H5
                        "00000000"
                        + // A4-H4
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._C6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._C6))));
   }

   public void testSouth2NorthRookMaskFromD6() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A5-H5
                        "00000000"
                        + // A4-H4
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._D6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._D6))));
   }

   public void testSouth2NorthRookMaskFromE6() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A5-H5
                        "00000000"
                        + // A4-H4
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._E6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._E6))));
   }

   public void testSouth2NorthRookMaskFromF6() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A5-H5
                        "00000000"
                        + // A4-H4
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._F6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._F6))));
   }

   public void testSouth2NorthRookMaskFromG6() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A5-H5
                        "00000000"
                        + // A4-H4
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._G6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._G6))));
   }

   public void testSouth2NorthRookMaskFromH6() {
      RookMask rookMask= RookMasks.create();
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
                        "00000000"
                        + // A5-H5
                        "00000000"
                        + // A4-H4
                        "00000000"
                        + // A3-H3
                        "00000000"
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._H6)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._H6))));
   }

   public void testSouth2NorthRookMaskFromA7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._A7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._A7))));
   }

   public void testSouth2NorthRookMaskFromB7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._B7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._B7))));
   }

   public void testSouth2NorthRookMaskFromC7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._C7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._C7))));
   }

   public void testSouth2NorthRookMaskFromD7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._D7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._D7))));
   }

   public void testSouth2NorthRookMaskFromE7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._E7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._E7))));
   }

   public void testSouth2NorthRookMaskFromF7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._F7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._F7))));
   }

   public void testSouth2NorthRookMaskFromG7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._G7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._G7))));
   }

   public void testSouth2NorthRookMaskFromH7() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._H7)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._H7))));
   }

   public void testSouth2NorthRookMaskFromA8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._A8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._A8))));
   }

   public void testSouth2NorthRookMaskFromB8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._B8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._B8))));
   }

   public void testSouth2NorthRookMaskFromC8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._C8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._C8))));
   }

   public void testSouth2NorthRookMaskFromD8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._D8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._D8))));
   }

   public void testSouth2NorthRookMaskFromE8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._E8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._E8))));
   }

   public void testSouth2NorthRookMaskFromF8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._F8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._F8))));
   }

   public void testSouth2NorthRookMaskFromG8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._G8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._G8))));
   }

   public void testSouth2NorthRookMaskFromH8() {
      RookMask rookMask= RookMasks.create();
      Assert
            .assertEquals(
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
                        + // A2-H2
                        "00000000", // A1-H1
                  (this.zeroPrefix[Long.toBinaryString(
                        rookMask.getSouth2NorthMaskFrom(Square._H8)).length() - 1] + Long
                        .toBinaryString(rookMask
                              .getSouth2NorthMaskFrom(Square._H8))));
   }

}