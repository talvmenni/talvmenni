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

import java.io.Serializable;

public interface BishopMask extends Serializable {
   
   public static final long serialVersionUID = 1L; 
   
   public long getNorthWest2SouthEastMaskFrom(
         long square);

   public long getNorthEast2SouthWestMaskFrom(
         long square);

   public long getSouthEast2NorthWestMaskFrom(
         long square);

   public long getSouthWest2NorthEastMaskFrom(
         long square);

   public static final long _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A8A8 = Square._FULL_BOARD;
   public static final long _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A7B8 = SlashDiagonal._A7B8
                                                                          | SlashDiagonal._A6C8
                                                                          | SlashDiagonal._A5D8
                                                                          | SlashDiagonal._A4E8
                                                                          | SlashDiagonal._A3F8
                                                                          | SlashDiagonal._A2G8
                                                                          | SlashDiagonal._A1H8
                                                                          | SlashDiagonal._B1H7
                                                                          | SlashDiagonal._C1H6
                                                                          | SlashDiagonal._D1H5
                                                                          | SlashDiagonal._E1H4
                                                                          | SlashDiagonal._F1H3
                                                                          | SlashDiagonal._G1H2
                                                                          | SlashDiagonal._H1H1;
   public static final long _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A6C8 = SlashDiagonal._A6C8
                                                                          | SlashDiagonal._A5D8
                                                                          | SlashDiagonal._A4E8
                                                                          | SlashDiagonal._A3F8
                                                                          | SlashDiagonal._A2G8
                                                                          | SlashDiagonal._A1H8
                                                                          | SlashDiagonal._B1H7
                                                                          | SlashDiagonal._C1H6
                                                                          | SlashDiagonal._D1H5
                                                                          | SlashDiagonal._E1H4
                                                                          | SlashDiagonal._F1H3
                                                                          | SlashDiagonal._G1H2
                                                                          | SlashDiagonal._H1H1;

   public static final long _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A5D8 = SlashDiagonal._A5D8
                                                                          | SlashDiagonal._A4E8
                                                                          | SlashDiagonal._A3F8
                                                                          | SlashDiagonal._A2G8
                                                                          | SlashDiagonal._A1H8
                                                                          | SlashDiagonal._B1H7
                                                                          | SlashDiagonal._C1H6
                                                                          | SlashDiagonal._D1H5
                                                                          | SlashDiagonal._E1H4
                                                                          | SlashDiagonal._F1H3
                                                                          | SlashDiagonal._G1H2
                                                                          | SlashDiagonal._H1H1;

   public static final long _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A4E8 = SlashDiagonal._A4E8
                                                                          | SlashDiagonal._A3F8
                                                                          | SlashDiagonal._A2G8
                                                                          | SlashDiagonal._A1H8
                                                                          | SlashDiagonal._B1H7
                                                                          | SlashDiagonal._C1H6
                                                                          | SlashDiagonal._D1H5
                                                                          | SlashDiagonal._E1H4
                                                                          | SlashDiagonal._F1H3
                                                                          | SlashDiagonal._G1H2
                                                                          | SlashDiagonal._H1H1;

   public static final long _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A3F8 = SlashDiagonal._A3F8
                                                                          | SlashDiagonal._A2G8
                                                                          | SlashDiagonal._A1H8
                                                                          | SlashDiagonal._B1H7
                                                                          | SlashDiagonal._C1H6
                                                                          | SlashDiagonal._D1H5
                                                                          | SlashDiagonal._E1H4
                                                                          | SlashDiagonal._F1H3
                                                                          | SlashDiagonal._G1H2
                                                                          | SlashDiagonal._H1H1;

   public static final long _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A2G8 = SlashDiagonal._A2G8
                                                                          | SlashDiagonal._A1H8
                                                                          | SlashDiagonal._B1H7
                                                                          | SlashDiagonal._C1H6
                                                                          | SlashDiagonal._D1H5
                                                                          | SlashDiagonal._E1H4
                                                                          | SlashDiagonal._F1H3
                                                                          | SlashDiagonal._G1H2
                                                                          | SlashDiagonal._H1H1;

   public static final long _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_A1H8 = SlashDiagonal._A1H8
                                                                          | SlashDiagonal._B1H7
                                                                          | SlashDiagonal._C1H6
                                                                          | SlashDiagonal._D1H5
                                                                          | SlashDiagonal._E1H4
                                                                          | SlashDiagonal._F1H3
                                                                          | SlashDiagonal._G1H2
                                                                          | SlashDiagonal._H1H1;

   public static final long _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_B1H7 = SlashDiagonal._B1H7
                                                                          | SlashDiagonal._C1H6
                                                                          | SlashDiagonal._D1H5
                                                                          | SlashDiagonal._E1H4
                                                                          | SlashDiagonal._F1H3
                                                                          | SlashDiagonal._G1H2
                                                                          | SlashDiagonal._H1H1;
   public static final long _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_C1H6 = SlashDiagonal._C1H6
                                                                          | SlashDiagonal._D1H5
                                                                          | SlashDiagonal._E1H4
                                                                          | SlashDiagonal._F1H3
                                                                          | SlashDiagonal._G1H2
                                                                          | SlashDiagonal._H1H1;
   public static final long _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_D1H5 = SlashDiagonal._D1H5
                                                                          | SlashDiagonal._E1H4
                                                                          | SlashDiagonal._F1H3
                                                                          | SlashDiagonal._G1H2
                                                                          | SlashDiagonal._H1H1;

   public static final long _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_E1H4 = SlashDiagonal._E1H4
                                                                          | SlashDiagonal._F1H3
                                                                          | SlashDiagonal._G1H2
                                                                          | SlashDiagonal._H1H1;
   public static final long _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_F1H3 = SlashDiagonal._F1H3
                                                                          | SlashDiagonal._G1H2
                                                                          | SlashDiagonal._H1H1;
   public static final long _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_G1H2 = SlashDiagonal._G1H2
                                                                          | SlashDiagonal._H1H1;
   public static final long _NORTHWEST2SOUTHEAST_FROM_DIAGONAL_H1H1 = SlashDiagonal._H1H1;

   public static final long _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A1A1 = Square._FULL_BOARD;
   public static final long _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A2B1 = BackSlashDiagonal._A2B1
                                                                          | BackSlashDiagonal._A3C1
                                                                          | BackSlashDiagonal._A4D1
                                                                          | BackSlashDiagonal._A5E1
                                                                          | BackSlashDiagonal._A6F1
                                                                          | BackSlashDiagonal._A7G1
                                                                          | BackSlashDiagonal._A8H1
                                                                          | BackSlashDiagonal._B8H2
                                                                          | BackSlashDiagonal._C8H3
                                                                          | BackSlashDiagonal._D8H4
                                                                          | BackSlashDiagonal._E8H5
                                                                          | BackSlashDiagonal._F8H6
                                                                          | BackSlashDiagonal._G8H7
                                                                          | BackSlashDiagonal._H8H8;
   public static final long _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A3C1 = BackSlashDiagonal._A3C1
                                                                          | BackSlashDiagonal._A4D1
                                                                          | BackSlashDiagonal._A5E1
                                                                          | BackSlashDiagonal._A6F1
                                                                          | BackSlashDiagonal._A7G1
                                                                          | BackSlashDiagonal._A8H1
                                                                          | BackSlashDiagonal._B8H2
                                                                          | BackSlashDiagonal._C8H3
                                                                          | BackSlashDiagonal._D8H4
                                                                          | BackSlashDiagonal._E8H5
                                                                          | BackSlashDiagonal._F8H6
                                                                          | BackSlashDiagonal._G8H7
                                                                          | BackSlashDiagonal._H8H8;

   public static final long _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A4D1 = BackSlashDiagonal._A4D1
                                                                          | BackSlashDiagonal._A5E1
                                                                          | BackSlashDiagonal._A6F1
                                                                          | BackSlashDiagonal._A7G1
                                                                          | BackSlashDiagonal._A8H1
                                                                          | BackSlashDiagonal._B8H2
                                                                          | BackSlashDiagonal._C8H3
                                                                          | BackSlashDiagonal._D8H4
                                                                          | BackSlashDiagonal._E8H5
                                                                          | BackSlashDiagonal._F8H6
                                                                          | BackSlashDiagonal._G8H7
                                                                          | BackSlashDiagonal._H8H8;

   public static final long _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A5E1 = BackSlashDiagonal._A5E1
                                                                          | BackSlashDiagonal._A6F1
                                                                          | BackSlashDiagonal._A7G1
                                                                          | BackSlashDiagonal._A8H1
                                                                          | BackSlashDiagonal._B8H2
                                                                          | BackSlashDiagonal._C8H3
                                                                          | BackSlashDiagonal._D8H4
                                                                          | BackSlashDiagonal._E8H5
                                                                          | BackSlashDiagonal._F8H6
                                                                          | BackSlashDiagonal._G8H7
                                                                          | BackSlashDiagonal._H8H8;

   public static final long _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A6F1 = BackSlashDiagonal._A6F1
                                                                          | BackSlashDiagonal._A7G1
                                                                          | BackSlashDiagonal._A8H1
                                                                          | BackSlashDiagonal._B8H2
                                                                          | BackSlashDiagonal._C8H3
                                                                          | BackSlashDiagonal._D8H4
                                                                          | BackSlashDiagonal._E8H5
                                                                          | BackSlashDiagonal._F8H6
                                                                          | BackSlashDiagonal._G8H7
                                                                          | BackSlashDiagonal._H8H8;

   public static final long _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A7G1 = BackSlashDiagonal._A7G1
                                                                          | BackSlashDiagonal._A8H1
                                                                          | BackSlashDiagonal._B8H2
                                                                          | BackSlashDiagonal._C8H3
                                                                          | BackSlashDiagonal._D8H4
                                                                          | BackSlashDiagonal._E8H5
                                                                          | BackSlashDiagonal._F8H6
                                                                          | BackSlashDiagonal._G8H7
                                                                          | BackSlashDiagonal._H8H8;

   public static final long _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_A8H1 = BackSlashDiagonal._A8H1
                                                                          | BackSlashDiagonal._B8H2
                                                                          | BackSlashDiagonal._C8H3
                                                                          | BackSlashDiagonal._D8H4
                                                                          | BackSlashDiagonal._E8H5
                                                                          | BackSlashDiagonal._F8H6
                                                                          | BackSlashDiagonal._G8H7
                                                                          | BackSlashDiagonal._H8H8;

   public static final long _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_B8H2 = BackSlashDiagonal._B8H2
                                                                          | BackSlashDiagonal._C8H3
                                                                          | BackSlashDiagonal._D8H4
                                                                          | BackSlashDiagonal._E8H5
                                                                          | BackSlashDiagonal._F8H6
                                                                          | BackSlashDiagonal._G8H7
                                                                          | BackSlashDiagonal._H8H8;
   public static final long _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_C8H3 = BackSlashDiagonal._C8H3
                                                                          | BackSlashDiagonal._D8H4
                                                                          | BackSlashDiagonal._E8H5
                                                                          | BackSlashDiagonal._F8H6
                                                                          | BackSlashDiagonal._G8H7
                                                                          | BackSlashDiagonal._H8H8;
   public static final long _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_D8H4 = BackSlashDiagonal._D8H4
                                                                          | BackSlashDiagonal._E8H5
                                                                          | BackSlashDiagonal._F8H6
                                                                          | BackSlashDiagonal._G8H7
                                                                          | BackSlashDiagonal._H8H8;

   public static final long _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_E8H5 = BackSlashDiagonal._E8H5
                                                                          | BackSlashDiagonal._F8H6
                                                                          | BackSlashDiagonal._G8H7
                                                                          | BackSlashDiagonal._H8H8;
   public static final long _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_F8H6 = BackSlashDiagonal._F8H6
                                                                          | BackSlashDiagonal._G8H7
                                                                          | BackSlashDiagonal._H8H8;
   public static final long _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_G8H7 = BackSlashDiagonal._G8H7
                                                                          | BackSlashDiagonal._H8H8;
   public static final long _SOUTHWEST2NORTHEAST_FROM_DIAGONAL_H8H8 = BackSlashDiagonal._H8H8;

   public static final long _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_H1H1 = Square._FULL_BOARD;
   public static final long _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_G1H2 = SlashDiagonal._A7B8
                                                                          | SlashDiagonal._A6C8
                                                                          | SlashDiagonal._A5D8
                                                                          | SlashDiagonal._A4E8
                                                                          | SlashDiagonal._A3F8
                                                                          | SlashDiagonal._A2G8
                                                                          | SlashDiagonal._A1H8
                                                                          | SlashDiagonal._B1H7
                                                                          | SlashDiagonal._C1H6
                                                                          | SlashDiagonal._D1H5
                                                                          | SlashDiagonal._E1H4
                                                                          | SlashDiagonal._F1H3
                                                                          | SlashDiagonal._G1H2
                                                                          | SlashDiagonal._A8A8;
   public static final long _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_F1H3 = SlashDiagonal._A6C8
                                                                          | SlashDiagonal._A5D8
                                                                          | SlashDiagonal._A4E8
                                                                          | SlashDiagonal._A3F8
                                                                          | SlashDiagonal._A2G8
                                                                          | SlashDiagonal._A1H8
                                                                          | SlashDiagonal._B1H7
                                                                          | SlashDiagonal._C1H6
                                                                          | SlashDiagonal._D1H5
                                                                          | SlashDiagonal._E1H4
                                                                          | SlashDiagonal._F1H3
                                                                          | SlashDiagonal._A7B8
                                                                          | SlashDiagonal._A8A8;

   public static final long _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_E1H4 = SlashDiagonal._A5D8
                                                                          | SlashDiagonal._A4E8
                                                                          | SlashDiagonal._A3F8
                                                                          | SlashDiagonal._A2G8
                                                                          | SlashDiagonal._A1H8
                                                                          | SlashDiagonal._B1H7
                                                                          | SlashDiagonal._C1H6
                                                                          | SlashDiagonal._D1H5
                                                                          | SlashDiagonal._E1H4
                                                                          | SlashDiagonal._A6C8
                                                                          | SlashDiagonal._A7B8
                                                                          | SlashDiagonal._A8A8;

   public static final long _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_D1H5 = SlashDiagonal._A4E8
                                                                          | SlashDiagonal._A3F8
                                                                          | SlashDiagonal._A2G8
                                                                          | SlashDiagonal._A1H8
                                                                          | SlashDiagonal._B1H7
                                                                          | SlashDiagonal._C1H6
                                                                          | SlashDiagonal._D1H5
                                                                          | SlashDiagonal._A5D8
                                                                          | SlashDiagonal._A6C8
                                                                          | SlashDiagonal._A7B8
                                                                          | SlashDiagonal._A8A8;

   public static final long _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_C1H6 = SlashDiagonal._A3F8
                                                                          | SlashDiagonal._A2G8
                                                                          | SlashDiagonal._A1H8
                                                                          | SlashDiagonal._B1H7
                                                                          | SlashDiagonal._C1H6
                                                                          | SlashDiagonal._A4E8
                                                                          | SlashDiagonal._A5D8
                                                                          | SlashDiagonal._A6C8
                                                                          | SlashDiagonal._A7B8
                                                                          | SlashDiagonal._A8A8;

   public static final long _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_B1H7 = SlashDiagonal._A2G8
                                                                          | SlashDiagonal._A1H8
                                                                          | SlashDiagonal._B1H7
                                                                          | SlashDiagonal._A3F8
                                                                          | SlashDiagonal._A4E8
                                                                          | SlashDiagonal._A5D8
                                                                          | SlashDiagonal._A6C8
                                                                          | SlashDiagonal._A7B8
                                                                          | SlashDiagonal._A8A8;

   public static final long _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A1H8 = SlashDiagonal._A1H8
                                                                          | SlashDiagonal._A2G8
                                                                          | SlashDiagonal._A3F8
                                                                          | SlashDiagonal._A4E8
                                                                          | SlashDiagonal._A5D8
                                                                          | SlashDiagonal._A6C8
                                                                          | SlashDiagonal._A7B8
                                                                          | SlashDiagonal._A8A8;

   public static final long _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A2G8 = SlashDiagonal._A2G8
                                                                          | SlashDiagonal._A3F8
                                                                          | SlashDiagonal._A4E8
                                                                          | SlashDiagonal._A5D8
                                                                          | SlashDiagonal._A6C8
                                                                          | SlashDiagonal._A7B8
                                                                          | SlashDiagonal._A8A8;
   public static final long _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A3F8 = SlashDiagonal._A3F8
                                                                          | SlashDiagonal._A4E8
                                                                          | SlashDiagonal._A5D8
                                                                          | SlashDiagonal._A6C8
                                                                          | SlashDiagonal._A7B8
                                                                          | SlashDiagonal._A8A8;
   public static final long _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A4E8 = SlashDiagonal._A4E8
                                                                          | SlashDiagonal._A5D8
                                                                          | SlashDiagonal._A6C8
                                                                          | SlashDiagonal._A7B8
                                                                          | SlashDiagonal._A8A8;

   public static final long _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A5D8 = SlashDiagonal._A5D8
                                                                          | SlashDiagonal._A6C8
                                                                          | SlashDiagonal._A7B8
                                                                          | SlashDiagonal._A8A8;

   public static final long _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A6C8 = SlashDiagonal._A6C8
                                                                          | SlashDiagonal._A7B8
                                                                          | SlashDiagonal._A8A8;

   public static final long _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A7B8 = SlashDiagonal._A7B8
                                                                          | SlashDiagonal._A8A8;

   public static final long _SOUTHEAST2NORTHWEST_FROM_DIAGONAL_A8A8 = SlashDiagonal._A8A8;

   public static final long _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_H8H8 = Square._FULL_BOARD;
   public static final long _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_G8H7 = BackSlashDiagonal._G8H7
                                                                          | BackSlashDiagonal._F8H6
                                                                          | BackSlashDiagonal._E8H5
                                                                          | BackSlashDiagonal._D8H4
                                                                          | BackSlashDiagonal._C8H3
                                                                          | BackSlashDiagonal._B8H2
                                                                          | BackSlashDiagonal._A8H1
                                                                          | BackSlashDiagonal._A7G1
                                                                          | BackSlashDiagonal._A6F1
                                                                          | BackSlashDiagonal._A5E1
                                                                          | BackSlashDiagonal._A4D1
                                                                          | BackSlashDiagonal._A3C1
                                                                          | BackSlashDiagonal._A2B1
                                                                          | BackSlashDiagonal._A1A1;
   public static final long _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_F8H6 = BackSlashDiagonal._F8H6
                                                                          | BackSlashDiagonal._E8H5
                                                                          | BackSlashDiagonal._D8H4
                                                                          | BackSlashDiagonal._C8H3
                                                                          | BackSlashDiagonal._B8H2
                                                                          | BackSlashDiagonal._A8H1
                                                                          | BackSlashDiagonal._A7G1
                                                                          | BackSlashDiagonal._A6F1
                                                                          | BackSlashDiagonal._A5E1
                                                                          | BackSlashDiagonal._A4D1
                                                                          | BackSlashDiagonal._A3C1
                                                                          | BackSlashDiagonal._A2B1
                                                                          | BackSlashDiagonal._A1A1;

   public static final long _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_E8H5 = BackSlashDiagonal._E8H5
                                                                          | BackSlashDiagonal._D8H4
                                                                          | BackSlashDiagonal._C8H3
                                                                          | BackSlashDiagonal._B8H2
                                                                          | BackSlashDiagonal._A8H1
                                                                          | BackSlashDiagonal._A7G1
                                                                          | BackSlashDiagonal._A6F1
                                                                          | BackSlashDiagonal._A5E1
                                                                          | BackSlashDiagonal._A4D1
                                                                          | BackSlashDiagonal._A3C1
                                                                          | BackSlashDiagonal._A2B1
                                                                          | BackSlashDiagonal._A1A1;

   public static final long _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_D8H4 = BackSlashDiagonal._D8H4
                                                                          | BackSlashDiagonal._C8H3
                                                                          | BackSlashDiagonal._B8H2
                                                                          | BackSlashDiagonal._A8H1
                                                                          | BackSlashDiagonal._A7G1
                                                                          | BackSlashDiagonal._A6F1
                                                                          | BackSlashDiagonal._A5E1
                                                                          | BackSlashDiagonal._A4D1
                                                                          | BackSlashDiagonal._A3C1
                                                                          | BackSlashDiagonal._A2B1
                                                                          | BackSlashDiagonal._A1A1;

   public static final long _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_C8H3  = BackSlashDiagonal._C8H3
                                                                          | BackSlashDiagonal._B8H2
                                                                          | BackSlashDiagonal._A8H1
                                                                          | BackSlashDiagonal._A7G1
                                                                          | BackSlashDiagonal._A6F1
                                                                          | BackSlashDiagonal._A5E1
                                                                          | BackSlashDiagonal._A4D1
                                                                          | BackSlashDiagonal._A3C1
                                                                          | BackSlashDiagonal._A2B1
                                                                          | BackSlashDiagonal._A1A1;

   public static final long _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_B8H2 = BackSlashDiagonal._B8H2
                                                                          | BackSlashDiagonal._A8H1
                                                                          | BackSlashDiagonal._A7G1
                                                                          | BackSlashDiagonal._A6F1
                                                                          | BackSlashDiagonal._A5E1
                                                                          | BackSlashDiagonal._A4D1
                                                                          | BackSlashDiagonal._A3C1
                                                                          | BackSlashDiagonal._A2B1
                                                                          | BackSlashDiagonal._A1A1;

   public static final long _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A8H1 = BackSlashDiagonal._A8H1
                                                                          | BackSlashDiagonal._A7G1
                                                                          | BackSlashDiagonal._A6F1
                                                                          | BackSlashDiagonal._A5E1
                                                                          | BackSlashDiagonal._A4D1
                                                                          | BackSlashDiagonal._A3C1
                                                                          | BackSlashDiagonal._A2B1
                                                                          | BackSlashDiagonal._A1A1;

   public static final long _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A7G1 = BackSlashDiagonal._A7G1
                                                                          | BackSlashDiagonal._A6F1
                                                                          | BackSlashDiagonal._A5E1
                                                                          | BackSlashDiagonal._A4D1
                                                                          | BackSlashDiagonal._A3C1
                                                                          | BackSlashDiagonal._A2B1
                                                                          | BackSlashDiagonal._A1A1;
   public static final long _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A6F1 = BackSlashDiagonal._A6F1
                                                                          | BackSlashDiagonal._A5E1
                                                                          | BackSlashDiagonal._A4D1
                                                                          | BackSlashDiagonal._A3C1
                                                                          | BackSlashDiagonal._A2B1
                                                                          | BackSlashDiagonal._A1A1;
   public static final long _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A5E1 = BackSlashDiagonal._A5E1
                                                                          | BackSlashDiagonal._A4D1
                                                                          | BackSlashDiagonal._A3C1
                                                                          | BackSlashDiagonal._A2B1
                                                                          | BackSlashDiagonal._A1A1;

   public static final long _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A4D1 = BackSlashDiagonal._A4D1
                                                                          | BackSlashDiagonal._A3C1
                                                                          | BackSlashDiagonal._A2B1
                                                                          | BackSlashDiagonal._A1A1;
   public static final long _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A3C1 = BackSlashDiagonal._A3C1
                                                                          | BackSlashDiagonal._A2B1
                                                                          | BackSlashDiagonal._A1A1;
   public static final long _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A2B1 = BackSlashDiagonal._A2B1
                                                                          | BackSlashDiagonal._A1A1;
   public static final long _NORTHEAST2SOUTHWEST_FROM_DIAGONAL_A1A1 = BackSlashDiagonal._A1A1;

}