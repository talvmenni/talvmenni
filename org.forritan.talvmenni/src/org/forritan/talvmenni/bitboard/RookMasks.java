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

public class RookMasks implements RookMask {

   private static final long   serialVersionUID = 1L;

   private static RookMasks    instance;
   private static final long[] east2WestBitmaps   = new long[64];
   private static final long[] west2EastBitmaps   = new long[64];
   private static final long[] north2SouthBitmaps = new long[64];
   private static final long[] south2NorthBitmaps = new long[64];

   public static RookMask create() {
      if (RookMasks.instance == null) {
         RookMasks.instance= new RookMasks();
      }
      return RookMasks.instance;
   }

   private RookMasks() {
   }

   public long getEast2WestMaskFrom(
         long square) {
      return RookMasks.east2WestBitmaps[Square.Util.index(square)];
   }

   public long getWest2EastMaskFrom(
         long square) {
      return RookMasks.west2EastBitmaps[Square.Util.index(square)];
   }

   public long getNorth2SouthMaskFrom(
         long square) {
      return RookMasks.north2SouthBitmaps[Square.Util.index(square)];
   }

   public long getSouth2NorthMaskFrom(
         long square) {
      return RookMasks.south2NorthBitmaps[Square.Util.index(square)];
   }

   static {
      east2WestBitmaps[Square.Util.index(Square._A8)]= _EAST2WEST_FROM_FILE_A; 
      east2WestBitmaps[Square.Util.index(Square._B8)]= _EAST2WEST_FROM_FILE_B;
      east2WestBitmaps[Square.Util.index(Square._C8)]= _EAST2WEST_FROM_FILE_C;
      east2WestBitmaps[Square.Util.index(Square._D8)]= _EAST2WEST_FROM_FILE_D;
      east2WestBitmaps[Square.Util.index(Square._E8)]= _EAST2WEST_FROM_FILE_E;
      east2WestBitmaps[Square.Util.index(Square._F8)]= _EAST2WEST_FROM_FILE_F;
      east2WestBitmaps[Square.Util.index(Square._G8)]= _EAST2WEST_FROM_FILE_G;
      east2WestBitmaps[Square.Util.index(Square._H8)]= _EAST2WEST_FROM_FILE_H;
      
      east2WestBitmaps[Square.Util.index(Square._A7)]= _EAST2WEST_FROM_FILE_A;
      east2WestBitmaps[Square.Util.index(Square._B7)]= _EAST2WEST_FROM_FILE_B;
      east2WestBitmaps[Square.Util.index(Square._C7)]= _EAST2WEST_FROM_FILE_C;
      east2WestBitmaps[Square.Util.index(Square._D7)]= _EAST2WEST_FROM_FILE_D;
      east2WestBitmaps[Square.Util.index(Square._E7)]= _EAST2WEST_FROM_FILE_E;
      east2WestBitmaps[Square.Util.index(Square._F7)]= _EAST2WEST_FROM_FILE_F;
      east2WestBitmaps[Square.Util.index(Square._G7)]= _EAST2WEST_FROM_FILE_G;
      east2WestBitmaps[Square.Util.index(Square._H7)]= _EAST2WEST_FROM_FILE_H;
      
      east2WestBitmaps[Square.Util.index(Square._A6)]= _EAST2WEST_FROM_FILE_A;
      east2WestBitmaps[Square.Util.index(Square._B6)]= _EAST2WEST_FROM_FILE_B;
      east2WestBitmaps[Square.Util.index(Square._C6)]= _EAST2WEST_FROM_FILE_C;
      east2WestBitmaps[Square.Util.index(Square._D6)]= _EAST2WEST_FROM_FILE_D;
      east2WestBitmaps[Square.Util.index(Square._E6)]= _EAST2WEST_FROM_FILE_E;
      east2WestBitmaps[Square.Util.index(Square._F6)]= _EAST2WEST_FROM_FILE_F;
      east2WestBitmaps[Square.Util.index(Square._G6)]= _EAST2WEST_FROM_FILE_G;
      east2WestBitmaps[Square.Util.index(Square._H6)]= _EAST2WEST_FROM_FILE_H;
     
      east2WestBitmaps[Square.Util.index(Square._A5)]= _EAST2WEST_FROM_FILE_A;
      east2WestBitmaps[Square.Util.index(Square._B5)]= _EAST2WEST_FROM_FILE_B;
      east2WestBitmaps[Square.Util.index(Square._C5)]= _EAST2WEST_FROM_FILE_C;
      east2WestBitmaps[Square.Util.index(Square._D5)]= _EAST2WEST_FROM_FILE_D;
      east2WestBitmaps[Square.Util.index(Square._E5)]= _EAST2WEST_FROM_FILE_E;
      east2WestBitmaps[Square.Util.index(Square._F5)]= _EAST2WEST_FROM_FILE_F;
      east2WestBitmaps[Square.Util.index(Square._G5)]= _EAST2WEST_FROM_FILE_G;
      east2WestBitmaps[Square.Util.index(Square._H5)]= _EAST2WEST_FROM_FILE_H;
      
      east2WestBitmaps[Square.Util.index(Square._A4)]= _EAST2WEST_FROM_FILE_A;
      east2WestBitmaps[Square.Util.index(Square._B4)]= _EAST2WEST_FROM_FILE_B;
      east2WestBitmaps[Square.Util.index(Square._C4)]= _EAST2WEST_FROM_FILE_C;
      east2WestBitmaps[Square.Util.index(Square._D4)]= _EAST2WEST_FROM_FILE_D;
      east2WestBitmaps[Square.Util.index(Square._E4)]= _EAST2WEST_FROM_FILE_E;
      east2WestBitmaps[Square.Util.index(Square._F4)]= _EAST2WEST_FROM_FILE_F;
      east2WestBitmaps[Square.Util.index(Square._G4)]= _EAST2WEST_FROM_FILE_G;
      east2WestBitmaps[Square.Util.index(Square._H4)]= _EAST2WEST_FROM_FILE_H;
      
      east2WestBitmaps[Square.Util.index(Square._A3)]= _EAST2WEST_FROM_FILE_A;
      east2WestBitmaps[Square.Util.index(Square._B3)]= _EAST2WEST_FROM_FILE_B;
      east2WestBitmaps[Square.Util.index(Square._C3)]= _EAST2WEST_FROM_FILE_C;
      east2WestBitmaps[Square.Util.index(Square._D3)]= _EAST2WEST_FROM_FILE_D;
      east2WestBitmaps[Square.Util.index(Square._E3)]= _EAST2WEST_FROM_FILE_E;
      east2WestBitmaps[Square.Util.index(Square._F3)]= _EAST2WEST_FROM_FILE_F;
      east2WestBitmaps[Square.Util.index(Square._G3)]= _EAST2WEST_FROM_FILE_G;
      east2WestBitmaps[Square.Util.index(Square._H3)]= _EAST2WEST_FROM_FILE_H;
      
      east2WestBitmaps[Square.Util.index(Square._A2)]= _EAST2WEST_FROM_FILE_A;
      east2WestBitmaps[Square.Util.index(Square._B2)]= _EAST2WEST_FROM_FILE_B;
      east2WestBitmaps[Square.Util.index(Square._C2)]= _EAST2WEST_FROM_FILE_C;
      east2WestBitmaps[Square.Util.index(Square._D2)]= _EAST2WEST_FROM_FILE_D;
      east2WestBitmaps[Square.Util.index(Square._E2)]= _EAST2WEST_FROM_FILE_E;
      east2WestBitmaps[Square.Util.index(Square._F2)]= _EAST2WEST_FROM_FILE_F;
      east2WestBitmaps[Square.Util.index(Square._G2)]= _EAST2WEST_FROM_FILE_G;
      east2WestBitmaps[Square.Util.index(Square._H2)]= _EAST2WEST_FROM_FILE_H;
      
      east2WestBitmaps[Square.Util.index(Square._A1)]= _EAST2WEST_FROM_FILE_A;
      east2WestBitmaps[Square.Util.index(Square._B1)]= _EAST2WEST_FROM_FILE_B;
      east2WestBitmaps[Square.Util.index(Square._C1)]= _EAST2WEST_FROM_FILE_C;
      east2WestBitmaps[Square.Util.index(Square._D1)]= _EAST2WEST_FROM_FILE_D;
      east2WestBitmaps[Square.Util.index(Square._E1)]= _EAST2WEST_FROM_FILE_E;
      east2WestBitmaps[Square.Util.index(Square._F1)]= _EAST2WEST_FROM_FILE_F;
      east2WestBitmaps[Square.Util.index(Square._G1)]= _EAST2WEST_FROM_FILE_G;
      east2WestBitmaps[Square.Util.index(Square._H1)]= _EAST2WEST_FROM_FILE_H;
      
      
      west2EastBitmaps[Square.Util.index(Square._A8)]= _WEST2EAST_FROM_FILE_A;
      west2EastBitmaps[Square.Util.index(Square._B8)]= _WEST2EAST_FROM_FILE_B;
      west2EastBitmaps[Square.Util.index(Square._C8)]= _WEST2EAST_FROM_FILE_C;
      west2EastBitmaps[Square.Util.index(Square._D8)]= _WEST2EAST_FROM_FILE_D;
      west2EastBitmaps[Square.Util.index(Square._E8)]= _WEST2EAST_FROM_FILE_E;
      west2EastBitmaps[Square.Util.index(Square._F8)]= _WEST2EAST_FROM_FILE_F;
      west2EastBitmaps[Square.Util.index(Square._G8)]= _WEST2EAST_FROM_FILE_G;
      west2EastBitmaps[Square.Util.index(Square._H8)]= _WEST2EAST_FROM_FILE_H;
      
      west2EastBitmaps[Square.Util.index(Square._A7)]= _WEST2EAST_FROM_FILE_A;
      west2EastBitmaps[Square.Util.index(Square._B7)]= _WEST2EAST_FROM_FILE_B;
      west2EastBitmaps[Square.Util.index(Square._C7)]= _WEST2EAST_FROM_FILE_C;
      west2EastBitmaps[Square.Util.index(Square._D7)]= _WEST2EAST_FROM_FILE_D;
      west2EastBitmaps[Square.Util.index(Square._E7)]= _WEST2EAST_FROM_FILE_E;
      west2EastBitmaps[Square.Util.index(Square._F7)]= _WEST2EAST_FROM_FILE_F;
      west2EastBitmaps[Square.Util.index(Square._G7)]= _WEST2EAST_FROM_FILE_G;
      west2EastBitmaps[Square.Util.index(Square._H7)]= _WEST2EAST_FROM_FILE_H;
      
      west2EastBitmaps[Square.Util.index(Square._A6)]= _WEST2EAST_FROM_FILE_A;
      west2EastBitmaps[Square.Util.index(Square._B6)]= _WEST2EAST_FROM_FILE_B;
      west2EastBitmaps[Square.Util.index(Square._C6)]= _WEST2EAST_FROM_FILE_C;
      west2EastBitmaps[Square.Util.index(Square._D6)]= _WEST2EAST_FROM_FILE_D;
      west2EastBitmaps[Square.Util.index(Square._E6)]= _WEST2EAST_FROM_FILE_E;
      west2EastBitmaps[Square.Util.index(Square._F6)]= _WEST2EAST_FROM_FILE_F;
      west2EastBitmaps[Square.Util.index(Square._G6)]= _WEST2EAST_FROM_FILE_G;
      west2EastBitmaps[Square.Util.index(Square._H6)]= _WEST2EAST_FROM_FILE_H;
      
      west2EastBitmaps[Square.Util.index(Square._A5)]= _WEST2EAST_FROM_FILE_A;
      west2EastBitmaps[Square.Util.index(Square._B5)]= _WEST2EAST_FROM_FILE_B;
      west2EastBitmaps[Square.Util.index(Square._C5)]= _WEST2EAST_FROM_FILE_C;
      west2EastBitmaps[Square.Util.index(Square._D5)]= _WEST2EAST_FROM_FILE_D;
      west2EastBitmaps[Square.Util.index(Square._E5)]= _WEST2EAST_FROM_FILE_E;
      west2EastBitmaps[Square.Util.index(Square._F5)]= _WEST2EAST_FROM_FILE_F;
      west2EastBitmaps[Square.Util.index(Square._G5)]= _WEST2EAST_FROM_FILE_G;
      west2EastBitmaps[Square.Util.index(Square._H5)]= _WEST2EAST_FROM_FILE_H;
      
      west2EastBitmaps[Square.Util.index(Square._A4)]= _WEST2EAST_FROM_FILE_A;
      west2EastBitmaps[Square.Util.index(Square._B4)]= _WEST2EAST_FROM_FILE_B;
      west2EastBitmaps[Square.Util.index(Square._C4)]= _WEST2EAST_FROM_FILE_C;
      west2EastBitmaps[Square.Util.index(Square._D4)]= _WEST2EAST_FROM_FILE_D;
      west2EastBitmaps[Square.Util.index(Square._E4)]= _WEST2EAST_FROM_FILE_E;
      west2EastBitmaps[Square.Util.index(Square._F4)]= _WEST2EAST_FROM_FILE_F;
      west2EastBitmaps[Square.Util.index(Square._G4)]= _WEST2EAST_FROM_FILE_G;
      west2EastBitmaps[Square.Util.index(Square._H4)]= _WEST2EAST_FROM_FILE_H;
      
      west2EastBitmaps[Square.Util.index(Square._A3)]= _WEST2EAST_FROM_FILE_A;
      west2EastBitmaps[Square.Util.index(Square._B3)]= _WEST2EAST_FROM_FILE_B;
      west2EastBitmaps[Square.Util.index(Square._C3)]= _WEST2EAST_FROM_FILE_C;
      west2EastBitmaps[Square.Util.index(Square._D3)]= _WEST2EAST_FROM_FILE_D;
      west2EastBitmaps[Square.Util.index(Square._E3)]= _WEST2EAST_FROM_FILE_E;
      west2EastBitmaps[Square.Util.index(Square._F3)]= _WEST2EAST_FROM_FILE_F;
      west2EastBitmaps[Square.Util.index(Square._G3)]= _WEST2EAST_FROM_FILE_G;
      west2EastBitmaps[Square.Util.index(Square._H3)]= _WEST2EAST_FROM_FILE_H;
      
      west2EastBitmaps[Square.Util.index(Square._A2)]= _WEST2EAST_FROM_FILE_A;
      west2EastBitmaps[Square.Util.index(Square._B2)]= _WEST2EAST_FROM_FILE_B;
      west2EastBitmaps[Square.Util.index(Square._C2)]= _WEST2EAST_FROM_FILE_C;
      west2EastBitmaps[Square.Util.index(Square._D2)]= _WEST2EAST_FROM_FILE_D;
      west2EastBitmaps[Square.Util.index(Square._E2)]= _WEST2EAST_FROM_FILE_E;
      west2EastBitmaps[Square.Util.index(Square._F2)]= _WEST2EAST_FROM_FILE_F;
      west2EastBitmaps[Square.Util.index(Square._G2)]= _WEST2EAST_FROM_FILE_G;
      west2EastBitmaps[Square.Util.index(Square._H2)]= _WEST2EAST_FROM_FILE_H;
      
      west2EastBitmaps[Square.Util.index(Square._A1)]= _WEST2EAST_FROM_FILE_A;
      west2EastBitmaps[Square.Util.index(Square._B1)]= _WEST2EAST_FROM_FILE_B;
      west2EastBitmaps[Square.Util.index(Square._C1)]= _WEST2EAST_FROM_FILE_C;
      west2EastBitmaps[Square.Util.index(Square._D1)]= _WEST2EAST_FROM_FILE_D;
      west2EastBitmaps[Square.Util.index(Square._E1)]= _WEST2EAST_FROM_FILE_E;
      west2EastBitmaps[Square.Util.index(Square._F1)]= _WEST2EAST_FROM_FILE_F;
      west2EastBitmaps[Square.Util.index(Square._G1)]= _WEST2EAST_FROM_FILE_G;
      west2EastBitmaps[Square.Util.index(Square._H1)]= _WEST2EAST_FROM_FILE_H;

      

      north2SouthBitmaps[Square.Util.index(Square._A8)]= _NORTH2SOUTH_FROM_RANK_8;
      north2SouthBitmaps[Square.Util.index(Square._B8)]= _NORTH2SOUTH_FROM_RANK_8;
      north2SouthBitmaps[Square.Util.index(Square._C8)]= _NORTH2SOUTH_FROM_RANK_8;
      north2SouthBitmaps[Square.Util.index(Square._D8)]= _NORTH2SOUTH_FROM_RANK_8;
      north2SouthBitmaps[Square.Util.index(Square._E8)]= _NORTH2SOUTH_FROM_RANK_8;
      north2SouthBitmaps[Square.Util.index(Square._F8)]= _NORTH2SOUTH_FROM_RANK_8;
      north2SouthBitmaps[Square.Util.index(Square._G8)]= _NORTH2SOUTH_FROM_RANK_8;
      north2SouthBitmaps[Square.Util.index(Square._H8)]= _NORTH2SOUTH_FROM_RANK_8;
      
      north2SouthBitmaps[Square.Util.index(Square._A7)]= _NORTH2SOUTH_FROM_RANK_7;
      north2SouthBitmaps[Square.Util.index(Square._B7)]= _NORTH2SOUTH_FROM_RANK_7;
      north2SouthBitmaps[Square.Util.index(Square._C7)]= _NORTH2SOUTH_FROM_RANK_7;
      north2SouthBitmaps[Square.Util.index(Square._D7)]= _NORTH2SOUTH_FROM_RANK_7;
      north2SouthBitmaps[Square.Util.index(Square._E7)]= _NORTH2SOUTH_FROM_RANK_7;
      north2SouthBitmaps[Square.Util.index(Square._F7)]= _NORTH2SOUTH_FROM_RANK_7;
      north2SouthBitmaps[Square.Util.index(Square._G7)]= _NORTH2SOUTH_FROM_RANK_7;
      north2SouthBitmaps[Square.Util.index(Square._H7)]= _NORTH2SOUTH_FROM_RANK_7;
      
      north2SouthBitmaps[Square.Util.index(Square._A6)]= _NORTH2SOUTH_FROM_RANK_6;
      north2SouthBitmaps[Square.Util.index(Square._B6)]= _NORTH2SOUTH_FROM_RANK_6;
      north2SouthBitmaps[Square.Util.index(Square._C6)]= _NORTH2SOUTH_FROM_RANK_6;
      north2SouthBitmaps[Square.Util.index(Square._D6)]= _NORTH2SOUTH_FROM_RANK_6;
      north2SouthBitmaps[Square.Util.index(Square._E6)]= _NORTH2SOUTH_FROM_RANK_6;
      north2SouthBitmaps[Square.Util.index(Square._F6)]= _NORTH2SOUTH_FROM_RANK_6;
      north2SouthBitmaps[Square.Util.index(Square._G6)]= _NORTH2SOUTH_FROM_RANK_6;
      north2SouthBitmaps[Square.Util.index(Square._H6)]= _NORTH2SOUTH_FROM_RANK_6;
      
      north2SouthBitmaps[Square.Util.index(Square._A5)]= _NORTH2SOUTH_FROM_RANK_5;
      north2SouthBitmaps[Square.Util.index(Square._B5)]= _NORTH2SOUTH_FROM_RANK_5;
      north2SouthBitmaps[Square.Util.index(Square._C5)]= _NORTH2SOUTH_FROM_RANK_5;
      north2SouthBitmaps[Square.Util.index(Square._D5)]= _NORTH2SOUTH_FROM_RANK_5;
      north2SouthBitmaps[Square.Util.index(Square._E5)]= _NORTH2SOUTH_FROM_RANK_5;
      north2SouthBitmaps[Square.Util.index(Square._F5)]= _NORTH2SOUTH_FROM_RANK_5;
      north2SouthBitmaps[Square.Util.index(Square._G5)]= _NORTH2SOUTH_FROM_RANK_5;
      north2SouthBitmaps[Square.Util.index(Square._H5)]= _NORTH2SOUTH_FROM_RANK_5;
      
      north2SouthBitmaps[Square.Util.index(Square._A4)]= _NORTH2SOUTH_FROM_RANK_4;
      north2SouthBitmaps[Square.Util.index(Square._B4)]= _NORTH2SOUTH_FROM_RANK_4;
      north2SouthBitmaps[Square.Util.index(Square._C4)]= _NORTH2SOUTH_FROM_RANK_4;
      north2SouthBitmaps[Square.Util.index(Square._D4)]= _NORTH2SOUTH_FROM_RANK_4;
      north2SouthBitmaps[Square.Util.index(Square._E4)]= _NORTH2SOUTH_FROM_RANK_4;
      north2SouthBitmaps[Square.Util.index(Square._F4)]= _NORTH2SOUTH_FROM_RANK_4;
      north2SouthBitmaps[Square.Util.index(Square._G4)]= _NORTH2SOUTH_FROM_RANK_4;
      north2SouthBitmaps[Square.Util.index(Square._H4)]= _NORTH2SOUTH_FROM_RANK_4;
     
      north2SouthBitmaps[Square.Util.index(Square._A3)]= _NORTH2SOUTH_FROM_RANK_3;
      north2SouthBitmaps[Square.Util.index(Square._B3)]= _NORTH2SOUTH_FROM_RANK_3;
      north2SouthBitmaps[Square.Util.index(Square._C3)]= _NORTH2SOUTH_FROM_RANK_3;
      north2SouthBitmaps[Square.Util.index(Square._D3)]= _NORTH2SOUTH_FROM_RANK_3;
      north2SouthBitmaps[Square.Util.index(Square._E3)]= _NORTH2SOUTH_FROM_RANK_3;
      north2SouthBitmaps[Square.Util.index(Square._F3)]= _NORTH2SOUTH_FROM_RANK_3;
      north2SouthBitmaps[Square.Util.index(Square._G3)]= _NORTH2SOUTH_FROM_RANK_3;
      north2SouthBitmaps[Square.Util.index(Square._H3)]= _NORTH2SOUTH_FROM_RANK_3;
     
      north2SouthBitmaps[Square.Util.index(Square._A2)]= _NORTH2SOUTH_FROM_RANK_2;
      north2SouthBitmaps[Square.Util.index(Square._B2)]= _NORTH2SOUTH_FROM_RANK_2;
      north2SouthBitmaps[Square.Util.index(Square._C2)]= _NORTH2SOUTH_FROM_RANK_2;
      north2SouthBitmaps[Square.Util.index(Square._D2)]= _NORTH2SOUTH_FROM_RANK_2;
      north2SouthBitmaps[Square.Util.index(Square._E2)]= _NORTH2SOUTH_FROM_RANK_2;
      north2SouthBitmaps[Square.Util.index(Square._F2)]= _NORTH2SOUTH_FROM_RANK_2;
      north2SouthBitmaps[Square.Util.index(Square._G2)]= _NORTH2SOUTH_FROM_RANK_2;
      north2SouthBitmaps[Square.Util.index(Square._H2)]= _NORTH2SOUTH_FROM_RANK_2;
      
      north2SouthBitmaps[Square.Util.index(Square._A1)]= _NORTH2SOUTH_FROM_RANK_1;
      north2SouthBitmaps[Square.Util.index(Square._B1)]= _NORTH2SOUTH_FROM_RANK_1;
      north2SouthBitmaps[Square.Util.index(Square._C1)]= _NORTH2SOUTH_FROM_RANK_1;
      north2SouthBitmaps[Square.Util.index(Square._D1)]= _NORTH2SOUTH_FROM_RANK_1;
      north2SouthBitmaps[Square.Util.index(Square._E1)]= _NORTH2SOUTH_FROM_RANK_1;
      north2SouthBitmaps[Square.Util.index(Square._F1)]= _NORTH2SOUTH_FROM_RANK_1;
      north2SouthBitmaps[Square.Util.index(Square._G1)]= _NORTH2SOUTH_FROM_RANK_1;
      north2SouthBitmaps[Square.Util.index(Square._H1)]= _NORTH2SOUTH_FROM_RANK_1;
    
      

      south2NorthBitmaps[Square.Util.index(Square._A8)]= _SOUTH2NORTH_FROM_RANK_8;
      south2NorthBitmaps[Square.Util.index(Square._B8)]= _SOUTH2NORTH_FROM_RANK_8;
      south2NorthBitmaps[Square.Util.index(Square._C8)]= _SOUTH2NORTH_FROM_RANK_8;
      south2NorthBitmaps[Square.Util.index(Square._D8)]= _SOUTH2NORTH_FROM_RANK_8;
      south2NorthBitmaps[Square.Util.index(Square._E8)]= _SOUTH2NORTH_FROM_RANK_8;
      south2NorthBitmaps[Square.Util.index(Square._F8)]= _SOUTH2NORTH_FROM_RANK_8;
      south2NorthBitmaps[Square.Util.index(Square._G8)]= _SOUTH2NORTH_FROM_RANK_8;
      south2NorthBitmaps[Square.Util.index(Square._H8)]= _SOUTH2NORTH_FROM_RANK_8;
      
      south2NorthBitmaps[Square.Util.index(Square._A7)]= _SOUTH2NORTH_FROM_RANK_7;
      south2NorthBitmaps[Square.Util.index(Square._B7)]= _SOUTH2NORTH_FROM_RANK_7;
      south2NorthBitmaps[Square.Util.index(Square._C7)]= _SOUTH2NORTH_FROM_RANK_7;
      south2NorthBitmaps[Square.Util.index(Square._D7)]= _SOUTH2NORTH_FROM_RANK_7;
      south2NorthBitmaps[Square.Util.index(Square._E7)]= _SOUTH2NORTH_FROM_RANK_7;
      south2NorthBitmaps[Square.Util.index(Square._F7)]= _SOUTH2NORTH_FROM_RANK_7;
      south2NorthBitmaps[Square.Util.index(Square._G7)]= _SOUTH2NORTH_FROM_RANK_7;
      south2NorthBitmaps[Square.Util.index(Square._H7)]= _SOUTH2NORTH_FROM_RANK_7;
      
      south2NorthBitmaps[Square.Util.index(Square._A6)]= _SOUTH2NORTH_FROM_RANK_6;
      south2NorthBitmaps[Square.Util.index(Square._B6)]= _SOUTH2NORTH_FROM_RANK_6;
      south2NorthBitmaps[Square.Util.index(Square._C6)]= _SOUTH2NORTH_FROM_RANK_6;
      south2NorthBitmaps[Square.Util.index(Square._D6)]= _SOUTH2NORTH_FROM_RANK_6;
      south2NorthBitmaps[Square.Util.index(Square._E6)]= _SOUTH2NORTH_FROM_RANK_6;
      south2NorthBitmaps[Square.Util.index(Square._F6)]= _SOUTH2NORTH_FROM_RANK_6;
      south2NorthBitmaps[Square.Util.index(Square._G6)]= _SOUTH2NORTH_FROM_RANK_6;
      south2NorthBitmaps[Square.Util.index(Square._H6)]= _SOUTH2NORTH_FROM_RANK_6;
    
      south2NorthBitmaps[Square.Util.index(Square._A5)]= _SOUTH2NORTH_FROM_RANK_5;
      south2NorthBitmaps[Square.Util.index(Square._B5)]= _SOUTH2NORTH_FROM_RANK_5;
      south2NorthBitmaps[Square.Util.index(Square._C5)]= _SOUTH2NORTH_FROM_RANK_5;
      south2NorthBitmaps[Square.Util.index(Square._D5)]= _SOUTH2NORTH_FROM_RANK_5;
      south2NorthBitmaps[Square.Util.index(Square._E5)]= _SOUTH2NORTH_FROM_RANK_5;
      south2NorthBitmaps[Square.Util.index(Square._F5)]= _SOUTH2NORTH_FROM_RANK_5;
      south2NorthBitmaps[Square.Util.index(Square._G5)]= _SOUTH2NORTH_FROM_RANK_5;
      south2NorthBitmaps[Square.Util.index(Square._H5)]= _SOUTH2NORTH_FROM_RANK_5;
     
      south2NorthBitmaps[Square.Util.index(Square._A4)]= _SOUTH2NORTH_FROM_RANK_4;
      south2NorthBitmaps[Square.Util.index(Square._B4)]= _SOUTH2NORTH_FROM_RANK_4;
      south2NorthBitmaps[Square.Util.index(Square._C4)]= _SOUTH2NORTH_FROM_RANK_4;
      south2NorthBitmaps[Square.Util.index(Square._D4)]= _SOUTH2NORTH_FROM_RANK_4;
      south2NorthBitmaps[Square.Util.index(Square._E4)]= _SOUTH2NORTH_FROM_RANK_4;
      south2NorthBitmaps[Square.Util.index(Square._F4)]= _SOUTH2NORTH_FROM_RANK_4;
      south2NorthBitmaps[Square.Util.index(Square._G4)]= _SOUTH2NORTH_FROM_RANK_4;
      south2NorthBitmaps[Square.Util.index(Square._H4)]= _SOUTH2NORTH_FROM_RANK_4;
      
      south2NorthBitmaps[Square.Util.index(Square._A3)]= _SOUTH2NORTH_FROM_RANK_3;
      south2NorthBitmaps[Square.Util.index(Square._B3)]= _SOUTH2NORTH_FROM_RANK_3;
      south2NorthBitmaps[Square.Util.index(Square._C3)]= _SOUTH2NORTH_FROM_RANK_3;
      south2NorthBitmaps[Square.Util.index(Square._D3)]= _SOUTH2NORTH_FROM_RANK_3;
      south2NorthBitmaps[Square.Util.index(Square._E3)]= _SOUTH2NORTH_FROM_RANK_3;
      south2NorthBitmaps[Square.Util.index(Square._F3)]= _SOUTH2NORTH_FROM_RANK_3;
      south2NorthBitmaps[Square.Util.index(Square._G3)]= _SOUTH2NORTH_FROM_RANK_3;
      south2NorthBitmaps[Square.Util.index(Square._H3)]= _SOUTH2NORTH_FROM_RANK_3;
     
      south2NorthBitmaps[Square.Util.index(Square._A2)]= _SOUTH2NORTH_FROM_RANK_2;
      south2NorthBitmaps[Square.Util.index(Square._B2)]= _SOUTH2NORTH_FROM_RANK_2;
      south2NorthBitmaps[Square.Util.index(Square._C2)]= _SOUTH2NORTH_FROM_RANK_2;
      south2NorthBitmaps[Square.Util.index(Square._D2)]= _SOUTH2NORTH_FROM_RANK_2;
      south2NorthBitmaps[Square.Util.index(Square._E2)]= _SOUTH2NORTH_FROM_RANK_2;
      south2NorthBitmaps[Square.Util.index(Square._F2)]= _SOUTH2NORTH_FROM_RANK_2;
      south2NorthBitmaps[Square.Util.index(Square._G2)]= _SOUTH2NORTH_FROM_RANK_2;
      south2NorthBitmaps[Square.Util.index(Square._H2)]= _SOUTH2NORTH_FROM_RANK_2;
      
      south2NorthBitmaps[Square.Util.index(Square._A1)]= _SOUTH2NORTH_FROM_RANK_1;
      south2NorthBitmaps[Square.Util.index(Square._B1)]= _SOUTH2NORTH_FROM_RANK_1;
      south2NorthBitmaps[Square.Util.index(Square._C1)]= _SOUTH2NORTH_FROM_RANK_1;
      south2NorthBitmaps[Square.Util.index(Square._D1)]= _SOUTH2NORTH_FROM_RANK_1;
      south2NorthBitmaps[Square.Util.index(Square._E1)]= _SOUTH2NORTH_FROM_RANK_1;
      south2NorthBitmaps[Square.Util.index(Square._F1)]= _SOUTH2NORTH_FROM_RANK_1;
      south2NorthBitmaps[Square.Util.index(Square._G1)]= _SOUTH2NORTH_FROM_RANK_1;
      south2NorthBitmaps[Square.Util.index(Square._H1)]= _SOUTH2NORTH_FROM_RANK_1;
   }
}