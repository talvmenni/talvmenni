/**
 * talvmenni - A distributed chess-engine implemented in Java(TM)
 * and against Sun Microsystems Jini/JavaSpaces(TM).
 *  
 * Copyright (C) 2004-2006 Ey?un Lamhauge and Ey?un Nielsen
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

   public void testA() {
      Assert.assertEquals("" + //
            "10000000" + // A8-H8
            "10000000" + // A7-H7
            "10000000" + // A6-H6
            "10000000" + // A5-H5
            "10000000" + // A4-H4
            "10000000" + // A3-H3
            "10000000" + // A2-H2
            "10000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(File._A).length() - 1] + Long
                  .toBinaryString(File._A)));
   }

   public void testB() {
      Assert.assertEquals("" + //
            "01000000" + // A8-H8
            "01000000" + // A7-H7
            "01000000" + // A6-H6
            "01000000" + // A5-H5
            "01000000" + // A4-H4
            "01000000" + // A3-H3
            "01000000" + // A2-H2
            "01000000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(File._B).length() - 1] + Long
                  .toBinaryString(File._B)));
   }

   public void testC() {
      Assert.assertEquals("" + //
            "00100000" + // A8-H8
            "00100000" + // A7-H7
            "00100000" + // A6-H6
            "00100000" + // A5-H5
            "00100000" + // A4-H4
            "00100000" + // A3-H3
            "00100000" + // A2-H2
            "00100000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(File._C).length() - 1] + Long
                  .toBinaryString(File._C)));
   }

   public void testD() {
      Assert.assertEquals("" + //
            "00010000" + // A8-H8
            "00010000" + // A7-H7
            "00010000" + // A6-H6
            "00010000" + // A5-H5
            "00010000" + // A4-H4
            "00010000" + // A3-H3
            "00010000" + // A2-H2
            "00010000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(File._D).length() - 1] + Long
                  .toBinaryString(File._D)));
   }

   public void testE() {
      Assert.assertEquals("" + //
            "00001000" + // A8-H8
            "00001000" + // A7-H7
            "00001000" + // A6-H6
            "00001000" + // A5-H5
            "00001000" + // A4-H4
            "00001000" + // A3-H3
            "00001000" + // A2-H2
            "00001000", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(File._E).length() - 1] + Long
                  .toBinaryString(File._E)));
   }

   public void testF() {
      Assert.assertEquals("" + //
            "00000100" + // A8-H8
            "00000100" + // A7-H7
            "00000100" + // A6-H6
            "00000100" + // A5-H5
            "00000100" + // A4-H4
            "00000100" + // A3-H3
            "00000100" + // A2-H2
            "00000100", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(File._F).length() - 1] + Long
                  .toBinaryString(File._F)));
   }

   public void testG() {
      Assert.assertEquals("" + //
            "00000010" + // A8-H8
            "00000010" + // A7-H7
            "00000010" + // A6-H6
            "00000010" + // A5-H5
            "00000010" + // A4-H4
            "00000010" + // A3-H3
            "00000010" + // A2-H2
            "00000010", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(File._G).length() - 1] + Long
                  .toBinaryString(File._G)));
   }

   public void testH() {
      Assert.assertEquals("" + //
            "00000001" + // A8-H8
            "00000001" + // A7-H7
            "00000001" + // A6-H6
            "00000001" + // A5-H5
            "00000001" + // A4-H4
            "00000001" + // A3-H3
            "00000001" + // A2-H2
            "00000001", // A1-H1
            (this.zeroPrefix[Long.toBinaryString(File._H).length() - 1] + Long
                  .toBinaryString(File._H)));
   }
}