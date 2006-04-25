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

public interface RookMask extends Serializable {
   
   public static final long serialVersionUID = 1L; 

   public long getEast2WestMaskFrom(
         long square);

   public long getWest2EastMaskFrom(
         long square);

   public long getNorth2SouthMaskFrom(
         long square);

   public long getSouth2NorthMaskFrom(
         long square);

   public static final long _WEST2EAST_FROM_FILE_A   = Square._FULL_BOARD;
   public static final long _WEST2EAST_FROM_FILE_B   = File._B
                                                           | File._C
                                                           | File._D
                                                           | File._E
                                                           | File._F
                                                           | File._G
                                                           | File._H;
   public static final long _WEST2EAST_FROM_FILE_C   = File._C
                                                           | File._D
                                                           | File._E
                                                           | File._F
                                                           | File._G
                                                           | File._H;
   public static final long _WEST2EAST_FROM_FILE_D   = File._D
                                                           | File._E
                                                           | File._F
                                                           | File._G
                                                           | File._H;
   public static final long _WEST2EAST_FROM_FILE_E   = File._E
                                                           | File._F
                                                           | File._G
                                                           | File._H;
   public static final long _WEST2EAST_FROM_FILE_F   = File._F
                                                           | File._G
                                                           | File._H;
   public static final long _WEST2EAST_FROM_FILE_G   = File._G
                                                           | File._H;
   public static final long _WEST2EAST_FROM_FILE_H   = File._H;

   public static final long _EAST2WEST_FROM_FILE_A   = File._A;
   public static final long _EAST2WEST_FROM_FILE_B   = File._A
                                                           | File._B;
   public static final long _EAST2WEST_FROM_FILE_C   = File._A
                                                           | File._B
                                                           | File._C;
   public static final long _EAST2WEST_FROM_FILE_D   = File._A
                                                           | File._B
                                                           | File._C
                                                           | File._D;
   public static final long _EAST2WEST_FROM_FILE_E   = File._A
                                                           | File._B
                                                           | File._C
                                                           | File._D
                                                           | File._E;
   public static final long _EAST2WEST_FROM_FILE_F   = File._A
                                                           | File._B
                                                           | File._C
                                                           | File._D
                                                           | File._E
                                                           | File._F;
   public static final long _EAST2WEST_FROM_FILE_G   = File._A
                                                           | File._B
                                                           | File._C
                                                           | File._D
                                                           | File._E
                                                           | File._F
                                                           | File._G;
   public static final long _EAST2WEST_FROM_FILE_H   = Square._FULL_BOARD;

   public static final long _NORTH2SOUTH_FROM_RANK_1 = Rank._1;
   public static final long _NORTH2SOUTH_FROM_RANK_2 = Rank._1
                                                           | Rank._2;
   public static final long _NORTH2SOUTH_FROM_RANK_3 = Rank._1
                                                           | Rank._2
                                                           | Rank._3;
   public static final long _NORTH2SOUTH_FROM_RANK_4 = Rank._1
                                                           | Rank._2
                                                           | Rank._3
                                                           | Rank._4;
   public static final long _NORTH2SOUTH_FROM_RANK_5 = Rank._1
                                                           | Rank._2
                                                           | Rank._3
                                                           | Rank._4
                                                           | Rank._5;
   public static final long _NORTH2SOUTH_FROM_RANK_6 = Rank._1
                                                           | Rank._2
                                                           | Rank._3
                                                           | Rank._4
                                                           | Rank._5
                                                           | Rank._6;
   public static final long _NORTH2SOUTH_FROM_RANK_7 = Rank._1
                                                           | Rank._2
                                                           | Rank._3
                                                           | Rank._4
                                                           | Rank._5
                                                           | Rank._6
                                                           | Rank._7;
   public static final long _NORTH2SOUTH_FROM_RANK_8 = Square._FULL_BOARD;

   public static final long _SOUTH2NORTH_FROM_RANK_1 = Square._FULL_BOARD;

   public static final long _SOUTH2NORTH_FROM_RANK_2 = Rank._2
                                                           | Rank._3
                                                           | Rank._4
                                                           | Rank._5
                                                           | Rank._6
                                                           | Rank._7
                                                           | Rank._8;
   public static final long _SOUTH2NORTH_FROM_RANK_3 = Rank._3
                                                           | Rank._4
                                                           | Rank._5
                                                           | Rank._6
                                                           | Rank._7
                                                           | Rank._8;
   public static final long _SOUTH2NORTH_FROM_RANK_4 = Rank._4
                                                           | Rank._5
                                                           | Rank._6
                                                           | Rank._7
                                                           | Rank._8;
   public static final long _SOUTH2NORTH_FROM_RANK_5 = Rank._5
                                                           | Rank._6
                                                           | Rank._7
                                                           | Rank._8;
   public static final long _SOUTH2NORTH_FROM_RANK_6 = Rank._6
                                                           | Rank._7
                                                           | Rank._8;
   public static final long _SOUTH2NORTH_FROM_RANK_7 = Rank._7
                                                           | Rank._8;
   public static final long _SOUTH2NORTH_FROM_RANK_8 = Rank._8;

}