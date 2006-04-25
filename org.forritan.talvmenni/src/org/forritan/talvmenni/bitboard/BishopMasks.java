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

public class BishopMasks implements BishopMask {

   private static final long   serialVersionUID = 1L;

   private static BishopMasks  instance;
   private static final long[] northWest2SouthEastBitmaps = new long[64];
   private static final long[] northEast2SouthWestBitmaps = new long[64];
   private static final long[] southEast2NorthWestBitmaps = new long[64];
   private static final long[] southWest2NorthEastBitmaps = new long[64];

   public static BishopMask create() {
      if (BishopMasks.instance == null) {
         BishopMasks.instance= new BishopMasks();
      }
      return BishopMasks.instance;
   }

   private BishopMasks() {
   }

   public long getNorthWest2SouthEastMaskFrom(long square) {
      return BishopMasks.northWest2SouthEastBitmaps[Square.Util.index(square)];
   }

   public long getNorthEast2SouthWestMaskFrom(long square) {
      return BishopMasks.northEast2SouthWestBitmaps[Square.Util.index(square)];
   }

   public long getSouthEast2NorthWestMaskFrom(long square) {
      return BishopMasks.southEast2NorthWestBitmaps[Square.Util.index(square)];
   }

   public long getSouthWest2NorthEastMaskFrom(long square) {
      return BishopMasks.southWest2NorthEastBitmaps[Square.Util.index(square)];
   }

   static {
      
      northWest2SouthEastBitmaps[Square.Util.index(Square._A8)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A8A8; //A8
      northWest2SouthEastBitmaps[Square.Util.index(Square._B8)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A7B8; //B8
      northWest2SouthEastBitmaps[Square.Util.index(Square._C8)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A6C8; //C8
      northWest2SouthEastBitmaps[Square.Util.index(Square._D8)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A5D8; //D8
      northWest2SouthEastBitmaps[Square.Util.index(Square._E8)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A4E8; //E8
      northWest2SouthEastBitmaps[Square.Util.index(Square._F8)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A3F8; //F8
      northWest2SouthEastBitmaps[Square.Util.index(Square._G8)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A2G8; //G8
      northWest2SouthEastBitmaps[Square.Util.index(Square._H8)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A1H8; //H8
      northWest2SouthEastBitmaps[Square.Util.index(Square._A7)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A7B8; //A7
      northWest2SouthEastBitmaps[Square.Util.index(Square._B7)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A6C8; //B7
      northWest2SouthEastBitmaps[Square.Util.index(Square._C7)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A5D8; //C7
      northWest2SouthEastBitmaps[Square.Util.index(Square._D7)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A4E8; //D7
      northWest2SouthEastBitmaps[Square.Util.index(Square._E7)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A3F8; //E7
      northWest2SouthEastBitmaps[Square.Util.index(Square._F7)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A2G8; //F7
      northWest2SouthEastBitmaps[Square.Util.index(Square._G7)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A1H8; //G7
      northWest2SouthEastBitmaps[Square.Util.index(Square._H7)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_B1H7; //H7
      northWest2SouthEastBitmaps[Square.Util.index(Square._A6)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A6C8; //A6
      northWest2SouthEastBitmaps[Square.Util.index(Square._B6)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A5D8; //B6
      northWest2SouthEastBitmaps[Square.Util.index(Square._C6)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A4E8; //C6
      northWest2SouthEastBitmaps[Square.Util.index(Square._D6)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A3F8; //D6
      northWest2SouthEastBitmaps[Square.Util.index(Square._E6)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A2G8; //E6
      northWest2SouthEastBitmaps[Square.Util.index(Square._F6)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A1H8; //F6
      northWest2SouthEastBitmaps[Square.Util.index(Square._G6)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_B1H7; //G6
      northWest2SouthEastBitmaps[Square.Util.index(Square._H6)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_C1H6; //H6
      northWest2SouthEastBitmaps[Square.Util.index(Square._A5)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A5D8; //A5
      northWest2SouthEastBitmaps[Square.Util.index(Square._B5)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A4E8; //B5
      northWest2SouthEastBitmaps[Square.Util.index(Square._C5)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A3F8; //C5
      northWest2SouthEastBitmaps[Square.Util.index(Square._D5)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A2G8; //D5
      northWest2SouthEastBitmaps[Square.Util.index(Square._E5)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A1H8; //E5
      northWest2SouthEastBitmaps[Square.Util.index(Square._F5)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_B1H7; //F5
      northWest2SouthEastBitmaps[Square.Util.index(Square._G5)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_C1H6; //G5
      northWest2SouthEastBitmaps[Square.Util.index(Square._H5)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_D1H5; //H5
      northWest2SouthEastBitmaps[Square.Util.index(Square._A4)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A4E8; //A4
      northWest2SouthEastBitmaps[Square.Util.index(Square._B4)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A3F8; //B4
      northWest2SouthEastBitmaps[Square.Util.index(Square._C4)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A2G8; //C4
      northWest2SouthEastBitmaps[Square.Util.index(Square._D4)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A1H8; //D4
      northWest2SouthEastBitmaps[Square.Util.index(Square._E4)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_B1H7; //E4
      northWest2SouthEastBitmaps[Square.Util.index(Square._F4)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_C1H6; //F4
      northWest2SouthEastBitmaps[Square.Util.index(Square._G4)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_D1H5; //G4
      northWest2SouthEastBitmaps[Square.Util.index(Square._H4)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_E1H4; //H4
      northWest2SouthEastBitmaps[Square.Util.index(Square._A3)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A3F8; //A3
      northWest2SouthEastBitmaps[Square.Util.index(Square._B3)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A2G8; //B3
      northWest2SouthEastBitmaps[Square.Util.index(Square._C3)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A1H8; //C3
      northWest2SouthEastBitmaps[Square.Util.index(Square._D3)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_B1H7; //D3
      northWest2SouthEastBitmaps[Square.Util.index(Square._E3)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_C1H6; //E3
      northWest2SouthEastBitmaps[Square.Util.index(Square._F3)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_D1H5; //F3
      northWest2SouthEastBitmaps[Square.Util.index(Square._G3)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_E1H4; //G3
      northWest2SouthEastBitmaps[Square.Util.index(Square._H3)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_F1H3; //H3
      northWest2SouthEastBitmaps[Square.Util.index(Square._A2)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A2G8; //A2
      northWest2SouthEastBitmaps[Square.Util.index(Square._B2)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A1H8; //B2
      northWest2SouthEastBitmaps[Square.Util.index(Square._C2)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_B1H7; //C2
      northWest2SouthEastBitmaps[Square.Util.index(Square._D2)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_C1H6; //D2
      northWest2SouthEastBitmaps[Square.Util.index(Square._E2)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_D1H5; //E2
      northWest2SouthEastBitmaps[Square.Util.index(Square._F2)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_E1H4; //F2
      northWest2SouthEastBitmaps[Square.Util.index(Square._G2)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_F1H3; //G2
      northWest2SouthEastBitmaps[Square.Util.index(Square._H2)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_G1H2; //H2
      northWest2SouthEastBitmaps[Square.Util.index(Square._A1)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A1H8; //A1
      northWest2SouthEastBitmaps[Square.Util.index(Square._B1)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_B1H7; //B1
      northWest2SouthEastBitmaps[Square.Util.index(Square._C1)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_C1H6; //C1
      northWest2SouthEastBitmaps[Square.Util.index(Square._D1)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_D1H5; //D1
      northWest2SouthEastBitmaps[Square.Util.index(Square._E1)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_E1H4; //E1
      northWest2SouthEastBitmaps[Square.Util.index(Square._F1)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_F1H3; //F1
      northWest2SouthEastBitmaps[Square.Util.index(Square._G1)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_G1H2; //G1
      northWest2SouthEastBitmaps[Square.Util.index(Square._H1)]= _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_H1H1; //H1

      northEast2SouthWestBitmaps[Square.Util.index(Square._A8)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A8H1; //A8
      northEast2SouthWestBitmaps[Square.Util.index(Square._B8)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_B8H2; //B8
      northEast2SouthWestBitmaps[Square.Util.index(Square._C8)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_C8H3; //C8
      northEast2SouthWestBitmaps[Square.Util.index(Square._D8)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_D8H4; //D8
      northEast2SouthWestBitmaps[Square.Util.index(Square._E8)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_E8H5; //E8
      northEast2SouthWestBitmaps[Square.Util.index(Square._F8)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_F8H6; //F8
      northEast2SouthWestBitmaps[Square.Util.index(Square._G8)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_G8H7; //G8
      northEast2SouthWestBitmaps[Square.Util.index(Square._H8)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_H8H8; //H8
      northEast2SouthWestBitmaps[Square.Util.index(Square._A7)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A7G1; //A7
      northEast2SouthWestBitmaps[Square.Util.index(Square._B7)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A8H1; //B7
      northEast2SouthWestBitmaps[Square.Util.index(Square._C7)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_B8H2; //C7
      northEast2SouthWestBitmaps[Square.Util.index(Square._D7)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_C8H3; //D7
      northEast2SouthWestBitmaps[Square.Util.index(Square._E7)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_D8H4; //E7
      northEast2SouthWestBitmaps[Square.Util.index(Square._F7)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_E8H5; //F7
      northEast2SouthWestBitmaps[Square.Util.index(Square._G7)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_F8H6; //G7
      northEast2SouthWestBitmaps[Square.Util.index(Square._H7)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_G8H7; //H7
      northEast2SouthWestBitmaps[Square.Util.index(Square._A6)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A6F1; //A6
      northEast2SouthWestBitmaps[Square.Util.index(Square._B6)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A7G1; //B6
      northEast2SouthWestBitmaps[Square.Util.index(Square._C6)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A8H1; //C6
      northEast2SouthWestBitmaps[Square.Util.index(Square._D6)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_B8H2; //D6
      northEast2SouthWestBitmaps[Square.Util.index(Square._E6)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_C8H3; //E6
      northEast2SouthWestBitmaps[Square.Util.index(Square._F6)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_D8H4; //F6
      northEast2SouthWestBitmaps[Square.Util.index(Square._G6)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_E8H5; //G6
      northEast2SouthWestBitmaps[Square.Util.index(Square._H6)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_F8H6; //H6
      northEast2SouthWestBitmaps[Square.Util.index(Square._A5)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A5E1; //A5
      northEast2SouthWestBitmaps[Square.Util.index(Square._B5)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A6F1; //B5
      northEast2SouthWestBitmaps[Square.Util.index(Square._C5)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A7G1; //C5
      northEast2SouthWestBitmaps[Square.Util.index(Square._D5)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A8H1; //D5
      northEast2SouthWestBitmaps[Square.Util.index(Square._E5)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_B8H2; //E5
      northEast2SouthWestBitmaps[Square.Util.index(Square._F5)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_C8H3; //F5
      northEast2SouthWestBitmaps[Square.Util.index(Square._G5)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_D8H4; //G5
      northEast2SouthWestBitmaps[Square.Util.index(Square._H5)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_E8H5; //H5
      northEast2SouthWestBitmaps[Square.Util.index(Square._A4)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A4D1; //A4
      northEast2SouthWestBitmaps[Square.Util.index(Square._B4)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A5E1; //B4
      northEast2SouthWestBitmaps[Square.Util.index(Square._C4)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A6F1; //C4
      northEast2SouthWestBitmaps[Square.Util.index(Square._D4)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A7G1; //D4
      northEast2SouthWestBitmaps[Square.Util.index(Square._E4)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A8H1; //E4
      northEast2SouthWestBitmaps[Square.Util.index(Square._F4)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_B8H2; //F4
      northEast2SouthWestBitmaps[Square.Util.index(Square._G4)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_C8H3; //G4
      northEast2SouthWestBitmaps[Square.Util.index(Square._H4)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_D8H4; //H4
      northEast2SouthWestBitmaps[Square.Util.index(Square._A3)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A3C1; //A3
      northEast2SouthWestBitmaps[Square.Util.index(Square._B3)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A4D1; //B3
      northEast2SouthWestBitmaps[Square.Util.index(Square._C3)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A5E1; //C3
      northEast2SouthWestBitmaps[Square.Util.index(Square._D3)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A6F1; //D3
      northEast2SouthWestBitmaps[Square.Util.index(Square._E3)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A7G1; //E3
      northEast2SouthWestBitmaps[Square.Util.index(Square._F3)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A8H1; //F3
      northEast2SouthWestBitmaps[Square.Util.index(Square._G3)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_B8H2; //G3
      northEast2SouthWestBitmaps[Square.Util.index(Square._H3)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_C8H3; //H3
      northEast2SouthWestBitmaps[Square.Util.index(Square._A2)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A2B1; //A2
      northEast2SouthWestBitmaps[Square.Util.index(Square._B2)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A3C1; //B2
      northEast2SouthWestBitmaps[Square.Util.index(Square._C2)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A4D1; //C2
      northEast2SouthWestBitmaps[Square.Util.index(Square._D2)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A5E1; //D2
      northEast2SouthWestBitmaps[Square.Util.index(Square._E2)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A6F1; //E2
      northEast2SouthWestBitmaps[Square.Util.index(Square._F2)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A7G1; //F2
      northEast2SouthWestBitmaps[Square.Util.index(Square._G2)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A8H1; //G2
      northEast2SouthWestBitmaps[Square.Util.index(Square._H2)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_B8H2; //H2
      northEast2SouthWestBitmaps[Square.Util.index(Square._A1)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A1A1; //A1
      northEast2SouthWestBitmaps[Square.Util.index(Square._B1)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A2B1; //B1
      northEast2SouthWestBitmaps[Square.Util.index(Square._C1)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A3C1; //C1
      northEast2SouthWestBitmaps[Square.Util.index(Square._D1)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A4D1; //D1
      northEast2SouthWestBitmaps[Square.Util.index(Square._E1)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A5E1; //E1
      northEast2SouthWestBitmaps[Square.Util.index(Square._F1)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A6F1; //F1
      northEast2SouthWestBitmaps[Square.Util.index(Square._G1)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A7G1; //G1
      northEast2SouthWestBitmaps[Square.Util.index(Square._H1)]= _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A8H1; //H1

      southWest2NorthEastBitmaps[Square.Util.index(Square._A8)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A8H1; //A8
      southWest2NorthEastBitmaps[Square.Util.index(Square._B8)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_B8H2; //B8
      southWest2NorthEastBitmaps[Square.Util.index(Square._C8)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_C8H3; //C8
      southWest2NorthEastBitmaps[Square.Util.index(Square._D8)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_D8H4; //D8
      southWest2NorthEastBitmaps[Square.Util.index(Square._E8)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_E8H5; //E8
      southWest2NorthEastBitmaps[Square.Util.index(Square._F8)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_F8H6; //F8
      southWest2NorthEastBitmaps[Square.Util.index(Square._G8)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_G8H7; //G8
      southWest2NorthEastBitmaps[Square.Util.index(Square._H8)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_H8H8; //H8
      southWest2NorthEastBitmaps[Square.Util.index(Square._A7)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A7G1; //A7
      southWest2NorthEastBitmaps[Square.Util.index(Square._B7)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A8H1; //B7
      southWest2NorthEastBitmaps[Square.Util.index(Square._C7)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_B8H2; //C7
      southWest2NorthEastBitmaps[Square.Util.index(Square._D7)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_C8H3; //D7
      southWest2NorthEastBitmaps[Square.Util.index(Square._E7)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_D8H4; //E7
      southWest2NorthEastBitmaps[Square.Util.index(Square._F7)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_E8H5; //F7
      southWest2NorthEastBitmaps[Square.Util.index(Square._G7)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_F8H6; //G7
      southWest2NorthEastBitmaps[Square.Util.index(Square._H7)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_G8H7; //H7
      southWest2NorthEastBitmaps[Square.Util.index(Square._A6)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A6F1; //A6
      southWest2NorthEastBitmaps[Square.Util.index(Square._B6)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A7G1; //B6
      southWest2NorthEastBitmaps[Square.Util.index(Square._C6)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A8H1; //C6
      southWest2NorthEastBitmaps[Square.Util.index(Square._D6)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_B8H2; //D6
      southWest2NorthEastBitmaps[Square.Util.index(Square._E6)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_C8H3; //E6
      southWest2NorthEastBitmaps[Square.Util.index(Square._F6)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_D8H4; //F6
      southWest2NorthEastBitmaps[Square.Util.index(Square._G6)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_E8H5; //G6
      southWest2NorthEastBitmaps[Square.Util.index(Square._H6)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_F8H6; //H6
      southWest2NorthEastBitmaps[Square.Util.index(Square._A5)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A5E1; //A5
      southWest2NorthEastBitmaps[Square.Util.index(Square._B5)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A6F1; //B5
      southWest2NorthEastBitmaps[Square.Util.index(Square._C5)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A7G1; //C5
      southWest2NorthEastBitmaps[Square.Util.index(Square._D5)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A8H1; //D5
      southWest2NorthEastBitmaps[Square.Util.index(Square._E5)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_B8H2; //E5
      southWest2NorthEastBitmaps[Square.Util.index(Square._F5)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_C8H3; //F5
      southWest2NorthEastBitmaps[Square.Util.index(Square._G5)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_D8H4; //G5
      southWest2NorthEastBitmaps[Square.Util.index(Square._H5)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_E8H5; //H5
      southWest2NorthEastBitmaps[Square.Util.index(Square._A4)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A4D1; //A4
      southWest2NorthEastBitmaps[Square.Util.index(Square._B4)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A5E1; //B4
      southWest2NorthEastBitmaps[Square.Util.index(Square._C4)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A6F1; //C4
      southWest2NorthEastBitmaps[Square.Util.index(Square._D4)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A7G1; //D4
      southWest2NorthEastBitmaps[Square.Util.index(Square._E4)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A8H1; //E4
      southWest2NorthEastBitmaps[Square.Util.index(Square._F4)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_B8H2; //F4
      southWest2NorthEastBitmaps[Square.Util.index(Square._G4)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_C8H3; //G4
      southWest2NorthEastBitmaps[Square.Util.index(Square._H4)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_D8H4; //H4
      southWest2NorthEastBitmaps[Square.Util.index(Square._A3)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A3C1; //A3
      southWest2NorthEastBitmaps[Square.Util.index(Square._B3)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A4D1; //B3
      southWest2NorthEastBitmaps[Square.Util.index(Square._C3)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A5E1; //C3
      southWest2NorthEastBitmaps[Square.Util.index(Square._D3)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A6F1; //D3
      southWest2NorthEastBitmaps[Square.Util.index(Square._E3)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A7G1; //E3
      southWest2NorthEastBitmaps[Square.Util.index(Square._F3)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A8H1; //F3
      southWest2NorthEastBitmaps[Square.Util.index(Square._G3)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_B8H2; //G3
      southWest2NorthEastBitmaps[Square.Util.index(Square._H3)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_C8H3; //H3
      southWest2NorthEastBitmaps[Square.Util.index(Square._A2)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A2B1; //A2
      southWest2NorthEastBitmaps[Square.Util.index(Square._B2)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A3C1; //B2
      southWest2NorthEastBitmaps[Square.Util.index(Square._C2)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A4D1; //C2
      southWest2NorthEastBitmaps[Square.Util.index(Square._D2)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A5E1; //D2
      southWest2NorthEastBitmaps[Square.Util.index(Square._E2)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A6F1; //E2
      southWest2NorthEastBitmaps[Square.Util.index(Square._F2)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A7G1; //F2
      southWest2NorthEastBitmaps[Square.Util.index(Square._G2)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A8H1; //G2
      southWest2NorthEastBitmaps[Square.Util.index(Square._H2)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_B8H2; //H2
      southWest2NorthEastBitmaps[Square.Util.index(Square._A1)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A1A1; //A1
      southWest2NorthEastBitmaps[Square.Util.index(Square._B1)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A2B1; //B1
      southWest2NorthEastBitmaps[Square.Util.index(Square._C1)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A3C1; //C1
      southWest2NorthEastBitmaps[Square.Util.index(Square._D1)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A4D1; //D1
      southWest2NorthEastBitmaps[Square.Util.index(Square._E1)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A5E1; //E1
      southWest2NorthEastBitmaps[Square.Util.index(Square._F1)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A6F1; //F1
      southWest2NorthEastBitmaps[Square.Util.index(Square._G1)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A7G1; //G1
      southWest2NorthEastBitmaps[Square.Util.index(Square._H1)]= _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A8H1; //H1
      
      southEast2NorthWestBitmaps[Square.Util.index(Square._A8)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A8A8; //A8
      southEast2NorthWestBitmaps[Square.Util.index(Square._B8)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A7B8; //B8
      southEast2NorthWestBitmaps[Square.Util.index(Square._C8)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A6C8; //C8
      southEast2NorthWestBitmaps[Square.Util.index(Square._D8)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A5D8; //D8
      southEast2NorthWestBitmaps[Square.Util.index(Square._E8)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A4E8; //E8
      southEast2NorthWestBitmaps[Square.Util.index(Square._F8)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A3F8; //F8
      southEast2NorthWestBitmaps[Square.Util.index(Square._G8)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A2G8; //G8
      southEast2NorthWestBitmaps[Square.Util.index(Square._H8)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A1H8; //H8
      southEast2NorthWestBitmaps[Square.Util.index(Square._A7)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A7B8; //A7
      southEast2NorthWestBitmaps[Square.Util.index(Square._B7)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A6C8; //B7
      southEast2NorthWestBitmaps[Square.Util.index(Square._C7)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A5D8; //C7
      southEast2NorthWestBitmaps[Square.Util.index(Square._D7)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A4E8; //D7
      southEast2NorthWestBitmaps[Square.Util.index(Square._E7)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A3F8; //E7
      southEast2NorthWestBitmaps[Square.Util.index(Square._F7)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A2G8; //F7
      southEast2NorthWestBitmaps[Square.Util.index(Square._G7)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A1H8; //G7
      southEast2NorthWestBitmaps[Square.Util.index(Square._H7)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_B1H7; //H7
      southEast2NorthWestBitmaps[Square.Util.index(Square._A6)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A6C8; //A6
      southEast2NorthWestBitmaps[Square.Util.index(Square._B6)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A5D8; //B6
      southEast2NorthWestBitmaps[Square.Util.index(Square._C6)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A4E8; //C6
      southEast2NorthWestBitmaps[Square.Util.index(Square._D6)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A3F8; //D6
      southEast2NorthWestBitmaps[Square.Util.index(Square._E6)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A2G8; //E6
      southEast2NorthWestBitmaps[Square.Util.index(Square._F6)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A1H8; //F6
      southEast2NorthWestBitmaps[Square.Util.index(Square._G6)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_B1H7; //G6
      southEast2NorthWestBitmaps[Square.Util.index(Square._H6)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_C1H6; //H6
      southEast2NorthWestBitmaps[Square.Util.index(Square._A5)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A5D8; //A5
      southEast2NorthWestBitmaps[Square.Util.index(Square._B5)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A4E8; //B5
      southEast2NorthWestBitmaps[Square.Util.index(Square._C5)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A3F8; //C5
      southEast2NorthWestBitmaps[Square.Util.index(Square._D5)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A2G8; //D5
      southEast2NorthWestBitmaps[Square.Util.index(Square._E5)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A1H8; //E5
      southEast2NorthWestBitmaps[Square.Util.index(Square._F5)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_B1H7; //F5
      southEast2NorthWestBitmaps[Square.Util.index(Square._G5)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_C1H6; //G5
      southEast2NorthWestBitmaps[Square.Util.index(Square._H5)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_D1H5; //H5
      southEast2NorthWestBitmaps[Square.Util.index(Square._A4)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A4E8; //A4
      southEast2NorthWestBitmaps[Square.Util.index(Square._B4)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A3F8; //B4
      southEast2NorthWestBitmaps[Square.Util.index(Square._C4)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A2G8; //C4
      southEast2NorthWestBitmaps[Square.Util.index(Square._D4)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A1H8; //D4
      southEast2NorthWestBitmaps[Square.Util.index(Square._E4)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_B1H7; //E4
      southEast2NorthWestBitmaps[Square.Util.index(Square._F4)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_C1H6; //F4
      southEast2NorthWestBitmaps[Square.Util.index(Square._G4)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_D1H5; //G4
      southEast2NorthWestBitmaps[Square.Util.index(Square._H4)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_E1H4; //H4
      southEast2NorthWestBitmaps[Square.Util.index(Square._A3)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A3F8; //A3
      southEast2NorthWestBitmaps[Square.Util.index(Square._B3)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A2G8; //B3
      southEast2NorthWestBitmaps[Square.Util.index(Square._C3)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A1H8; //C3
      southEast2NorthWestBitmaps[Square.Util.index(Square._D3)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_B1H7; //D3
      southEast2NorthWestBitmaps[Square.Util.index(Square._E3)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_C1H6; //E3
      southEast2NorthWestBitmaps[Square.Util.index(Square._F3)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_D1H5; //F3
      southEast2NorthWestBitmaps[Square.Util.index(Square._G3)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_E1H4; //G3
      southEast2NorthWestBitmaps[Square.Util.index(Square._H3)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_F1H3; //H3
      southEast2NorthWestBitmaps[Square.Util.index(Square._A2)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A2G8; //A2
      southEast2NorthWestBitmaps[Square.Util.index(Square._B2)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A1H8; //B2
      southEast2NorthWestBitmaps[Square.Util.index(Square._C2)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_B1H7; //C2
      southEast2NorthWestBitmaps[Square.Util.index(Square._D2)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_C1H6; //D2
      southEast2NorthWestBitmaps[Square.Util.index(Square._E2)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_D1H5; //E2
      southEast2NorthWestBitmaps[Square.Util.index(Square._F2)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_E1H4; //F2
      southEast2NorthWestBitmaps[Square.Util.index(Square._G2)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_F1H3; //G2
      southEast2NorthWestBitmaps[Square.Util.index(Square._H2)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_G1H2; //H2
      southEast2NorthWestBitmaps[Square.Util.index(Square._A1)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A1H8; //A1
      southEast2NorthWestBitmaps[Square.Util.index(Square._B1)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_B1H7; //B1
      southEast2NorthWestBitmaps[Square.Util.index(Square._C1)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_C1H6; //C1
      southEast2NorthWestBitmaps[Square.Util.index(Square._D1)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_D1H5; //D1
      southEast2NorthWestBitmaps[Square.Util.index(Square._E1)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_E1H4; //E1
      southEast2NorthWestBitmaps[Square.Util.index(Square._F1)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_F1H3; //F1
      southEast2NorthWestBitmaps[Square.Util.index(Square._G1)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_G1H2; //G1
      southEast2NorthWestBitmaps[Square.Util.index(Square._H1)]= _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_H1H1; //H1
      
   }
}