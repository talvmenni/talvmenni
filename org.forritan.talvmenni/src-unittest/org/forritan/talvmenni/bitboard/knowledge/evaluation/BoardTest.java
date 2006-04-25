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

package org.forritan.talvmenni.bitboard.knowledge.evaluation;

import org.forritan.talvmenni.bitboard.evaluation.Board;

import junit.framework.Assert;
import junit.framework.TestCase;


public class BoardTest extends TestCase {

   private final String[] zeroPrefix = new String[64];

   public BoardTest() {
      for (int i= 0, j= 64; i < zeroPrefix.length; i++, j--) {
         StringBuffer zeroes= new StringBuffer();
         for (int k= 1; k < j; k++) {
            zeroes.append('0');
         }
         zeroPrefix[i]= zeroes.toString();
      }
   }

   public void testCore() {
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00000000"
                  + // A6-H6
                  "00011000"
                  + // A5-H5
                  "00011000"
                  + // A4-H4
                  "00000000"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Board._CORE).length() - 1] + Long
                  .toBinaryString(Board._CORE)));

   }
   
   public void testInnerBorder() {
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "00000000"
                  + // A7-H7
                  "00111100"
                  + // A6-H6
                  "00100100"
                  + // A5-H5
                  "00100100"
                  + // A4-H4
                  "00111100"
                  + // A3-H3
                  "00000000"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Board._INNER_BORDER).length() - 1] + Long
                  .toBinaryString(Board._INNER_BORDER)));

   }
   
   public void testMiddleBorder() {
      Assert.assertEquals(
            ""
                  + //
                  "00000000"
                  + // A8-H8
                  "01111110"
                  + // A7-H7
                  "01000010"
                  + // A6-H6
                  "01000010"
                  + // A5-H5
                  "01000010"
                  + // A4-H4
                  "01000010"
                  + // A3-H3
                  "01111110"
                  + // A2-H2
                  "00000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Board._MIDDLE_BORDER).length() - 1] + Long
                  .toBinaryString(Board._MIDDLE_BORDER)));

   }
   
   public void testOuterBorder() {
      Assert.assertEquals(
            ""
                  + //
                  "11111111"
                  + // A8-H8
                  "10000001"
                  + // A7-H7
                  "10000001"
                  + // A6-H6
                  "10000001"
                  + // A5-H5
                  "10000001"
                  + // A4-H4
                  "10000001"
                  + // A3-H3
                  "10000001"
                  + // A2-H2
                  "11111111", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(
                  Board._OUTER_BORDER).length() - 1] + Long
                  .toBinaryString(Board._OUTER_BORDER)));

   }
   
}