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

import org.forritan.talvmenni.bitboard.Square;


public class BlackPawnKillTest extends TestCase {

   private final String[] zeroPrefix = new String[64];

   public BlackPawnKillTest() {
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

   public void testBlackPawnPathsFromA1() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._A1)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._A1))));
   }

   public void testBlackPawnPathsFromB1() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._B1)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._B1))));
   }

   public void testBlackPawnPathsFromC1() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._C1)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._C1))));
   }

   public void testBlackPawnPathsFromD1() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._D1)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._D1))));
   }

   public void testBlackPawnPathsFromE1() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._E1)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._E1))));
   }

   public void testBlackPawnPathsFromF1() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._F1)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._F1))));
   }

   public void testBlackPawnPathsFromG1() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._G1)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._G1))));
   }

   public void testBlackPawnPathsFromH1() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._H1)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._H1))));
   }

   public void testBlackPawnPathsFromA2() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "01000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._A2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._A2))));
   }

   public void testBlackPawnPathsFromB2() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "10100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._B2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._B2))));
   }

   public void testBlackPawnPathsFromC2() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "01010000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._C2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._C2))));
   }

   public void testBlackPawnPathsFromD2() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00101000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._D2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._D2))));
   }

   public void testBlackPawnPathsFromE2() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00010100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._E2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._E2))));
   }

   public void testBlackPawnPathsFromF2() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00001010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._F2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._F2))));
   }

   public void testBlackPawnPathsFromG2() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00000101", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._G2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._G2))));
   }

   public void testBlackPawnPathsFromH2() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00000010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._H2)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._H2))));
   }

   public void testBlackPawnPathsFromA3() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "01000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._A3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._A3))));
   }

   public void testBlackPawnPathsFromB3() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "10100000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._B3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._B3))));
   }

   public void testBlackPawnPathsFromC3() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "01010000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._C3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._C3))));
   }

   public void testBlackPawnPathsFromD3() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "00101000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._D3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._D3))));
   }

   public void testBlackPawnPathsFromE3() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "00010100"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._E3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._E3))));
   }

   public void testBlackPawnPathsFromF3() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "00001010"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._F3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._F3))));
   }

   public void testBlackPawnPathsFromG3() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "00000101"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._G3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._G3))));
   }

   public void testBlackPawnPathsFromH3() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "00000010"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._H3)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._H3))));
   }

   public void testBlackPawnPathsFromA4() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "01000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._A4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._A4))));
   }

   public void testBlackPawnPathsFromB4() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "10100000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._B4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._B4))));
   }

   public void testBlackPawnPathsFromC4() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "01010000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._C4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._C4))));
   }

   public void testBlackPawnPathsFromD4() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "00101000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._D4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._D4))));
   }

   public void testBlackPawnPathsFromE4() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "00010100"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._E4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._E4))));
   }

   public void testBlackPawnPathsFromF4() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "00001010"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._F4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._F4))));
   }

   public void testBlackPawnPathsFromG4() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "00000101"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._G4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._G4))));
   }

   public void testBlackPawnPathsFromH4() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "00000010"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._H4)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._H4))));
   }

   public void testBlackPawnPathsFromA5() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "01000000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._A5)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._A5))));
   }

   public void testBlackPawnPathsFromB5() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "10100000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._B5)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._B5))));
   }

   public void testBlackPawnPathsFromC5() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "01010000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._C5)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._C5))));
   }

   public void testBlackPawnPathsFromD5() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "00101000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._D5)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._D5))));
   }

   public void testBlackPawnPathsFromE5() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "00010100"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._E5)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._E5))));
   }

   public void testBlackPawnPathsFromF5() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "00001010"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._F5)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._F5))));
   }

   public void testBlackPawnPathsFromG5() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "00000101"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._G5)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._G5))));
   }

   public void testBlackPawnPathsFromH5() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  "00000010"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._H5)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._H5))));
   }

   public void testBlackPawnPathsFromA6() {
      Pawn pawn= BlackPawnCaptures.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
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
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._A6)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._A6))));
   }

   public void testBlackPawnPathsFromB6() {
      Pawn pawn= BlackPawnCaptures.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
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
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._B6)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._B6))));
   }

   public void testBlackPawnPathsFromC6() {
      Pawn pawn= BlackPawnCaptures.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
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
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._C6)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._C6))));
   }

   public void testBlackPawnPathsFromD6() {
      Pawn pawn= BlackPawnCaptures.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
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
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._D6)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._D6))));
   }

   public void testBlackPawnPathsFromE6() {
      Pawn pawn= BlackPawnCaptures.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
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
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._E6)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._E6))));
   }

   public void testBlackPawnPathsFromF6() {
      Pawn pawn= BlackPawnCaptures.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
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
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._F6)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._F6))));
   }

   public void testBlackPawnPathsFromG6() {
      Pawn pawn= BlackPawnCaptures.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
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
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._G6)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._G6))));
   }

   public void testBlackPawnPathsFromH6() {
      Pawn pawn= BlackPawnCaptures.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
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
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._H6)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._H6))));
   }

   public void testBlackPawnPathsFromA7() {
      Pawn pawn= BlackPawnCaptures.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
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
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._A7)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._A7))));
   }

   public void testBlackPawnPathsFromB7() {
      Pawn pawn= BlackPawnCaptures.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
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
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._B7)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._B7))));
   }

   public void testBlackPawnPathsFromC7() {
      Pawn pawn= BlackPawnCaptures.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
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
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._C7)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._C7))));
   }

   public void testBlackPawnPathsFromD7() {
      Pawn pawn= BlackPawnCaptures.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
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
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._D7)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._D7))));
   }

   public void testBlackPawnPathsFromE7() {
      Pawn pawn= BlackPawnCaptures.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
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
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._E7)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._E7))));
   }

   public void testBlackPawnPathsFromF7() {
      Pawn pawn= BlackPawnCaptures.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
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
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._F7)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._F7))));
   }

   public void testBlackPawnPathsFromG7() {
      Pawn pawn= BlackPawnCaptures.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
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
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._G7)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._G7))));
   }

   public void testBlackPawnPathsFromH7() {
      Pawn pawn= BlackPawnCaptures.create();
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
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
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._H7)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._H7))));
   }

   public void testBlackPawnPathsFromA8() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._A8)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._A8))));
   }

   public void testBlackPawnPathsFromB8() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._B8)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._B8))));
   }

   public void testBlackPawnPathsFromC8() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._C8)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._C8))));
   }

   public void testBlackPawnPathsFromD8() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._D8)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._D8))));
   }

   public void testBlackPawnPathsFromE8() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._E8)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._E8))));
   }

   public void testBlackPawnPathsFromF8() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._F8)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._F8))));
   }

   public void testBlackPawnPathsFromG8() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._G8)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._G8))));
   }

   public void testBlackPawnPathsFromH8() {
      Pawn pawn= BlackPawnCaptures.create();
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
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  pawn.getPathsFrom(Square._H8)).length() - 1] + Long
                  .toBinaryString(pawn.getPathsFrom(Square._H8))));
   }

}