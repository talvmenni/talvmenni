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

import org.forritan.talvmenni.bitboard.Square;


public interface WhiteBishop extends Bishop {

   public static final long _PATHS_FROM_B1 = Square._A2
                                                 | Square._C2
                                                 | Square._D3
                                                 | Square._E4
                                                 | Square._F5
                                                 | Square._G6
                                                 | Square._H7;

   public static final long _PATHS_FROM_D1 = Square._A4
                                                 | Square._B3
                                                 | Square._C2
                                                 | Square._E2
                                                 | Square._F3
                                                 | Square._G4
                                                 | Square._H5;

   public static final long _PATHS_FROM_F1 = Square._A6
                                                 | Square._B5
                                                 | Square._C4
                                                 | Square._D3
                                                 | Square._E2
                                                 | Square._G2
                                                 | Square._H3;

   public static final long _PATHS_FROM_H1 = Square._A8
                                                 | Square._B7
                                                 | Square._C6
                                                 | Square._D5
                                                 | Square._E4
                                                 | Square._F3
                                                 | Square._G2;

   public static final long _PATHS_FROM_A2 = Square._B1
                                                 | Square._B3
                                                 | Square._C4
                                                 | Square._D5
                                                 | Square._E6
                                                 | Square._F7
                                                 | Square._G8;

   public static final long _PATHS_FROM_C2 = Square._A4
                                                 | Square._B3
                                                 | Square._B1
                                                 | Square._D1
                                                 | Square._D3
                                                 | Square._E4
                                                 | Square._F5
                                                 | Square._G6
                                                 | Square._H7;

   public static final long _PATHS_FROM_E2 = Square._A6
                                                 | Square._B5
                                                 | Square._C4
                                                 | Square._D3
                                                 | Square._D1
                                                 | Square._F3
                                                 | Square._F1
                                                 | Square._G4
                                                 | Square._H5;

   public static final long _PATHS_FROM_G2 = Square._A8
                                                 | Square._B7
                                                 | Square._C6
                                                 | Square._D5
                                                 | Square._E4
                                                 | Square._F3
                                                 | Square._F1
                                                 | Square._H3
                                                 | Square._H1;

   public static final long _PATHS_FROM_B3 = Square._A2
                                                 | Square._A4
                                                 | Square._C2
                                                 | Square._C4
                                                 | Square._D1
                                                 | Square._D5
                                                 | Square._E6
                                                 | Square._F7
                                                 | Square._G8;

   public static final long _PATHS_FROM_D3 = Square._A6
                                                 | Square._B5
                                                 | Square._B1
                                                 | Square._C4
                                                 | Square._C2
                                                 | Square._E4
                                                 | Square._E2
                                                 | Square._F5
                                                 | Square._F1
                                                 | Square._G6
                                                 | Square._H7;

   public static final long _PATHS_FROM_F3 = Square._A8
                                                 | Square._B7
                                                 | Square._C6
                                                 | Square._D5
                                                 | Square._D1
                                                 | Square._E4
                                                 | Square._E2
                                                 | Square._G4
                                                 | Square._G2
                                                 | Square._H5
                                                 | Square._H1;

   public static final long _PATHS_FROM_H3 = Square._C8
                                                 | Square._D7
                                                 | Square._E6
                                                 | Square._F5
                                                 | Square._F1
                                                 | Square._G4
                                                 | Square._G2;

   public static final long _PATHS_FROM_A4 = Square._B3
                                                 | Square._B5
                                                 | Square._C2
                                                 | Square._C6
                                                 | Square._D1
                                                 | Square._D7
                                                 | Square._E8;

   public static final long _PATHS_FROM_C4 = Square._A6
                                                 | Square._A2
                                                 | Square._B5
                                                 | Square._B3
                                                 | Square._D5
                                                 | Square._D3
                                                 | Square._E6
                                                 | Square._E2
                                                 | Square._F7
                                                 | Square._F1
                                                 | Square._G8;

   public static final long _PATHS_FROM_E4 = Square._A8
                                                 | Square._B1
                                                 | Square._B7
                                                 | Square._C2
                                                 | Square._C6
                                                 | Square._D3
                                                 | Square._D5
                                                 | Square._F3
                                                 | Square._F5
                                                 | Square._G2
                                                 | Square._G6
                                                 | Square._H1
                                                 | Square._H7;

   public static final long _PATHS_FROM_G4 = Square._C8
                                                 | Square._D7
                                                 | Square._D1
                                                 | Square._E6
                                                 | Square._E2
                                                 | Square._F5
                                                 | Square._F3
                                                 | Square._H5
                                                 | Square._H3;

   public static final long _PATHS_FROM_B5 = Square._A6
                                                 | Square._A4
                                                 | Square._C6
                                                 | Square._C4
                                                 | Square._D7
                                                 | Square._D3
                                                 | Square._E8
                                                 | Square._E2
                                                 | Square._F1;

   public static final long _PATHS_FROM_D5 = Square._A2
                                                 | Square._A8
                                                 | Square._B3
                                                 | Square._B7
                                                 | Square._C4
                                                 | Square._C6
                                                 | Square._E4
                                                 | Square._E6
                                                 | Square._F3
                                                 | Square._F7
                                                 | Square._G2
                                                 | Square._G8
                                                 | Square._H1;

   public static final long _PATHS_FROM_F5 = Square._B1
                                                 | Square._C2
                                                 | Square._C8
                                                 | Square._D3
                                                 | Square._D7
                                                 | Square._E4
                                                 | Square._E6
                                                 | Square._G4
                                                 | Square._G6
                                                 | Square._H3
                                                 | Square._H7;

   public static final long _PATHS_FROM_H5 = Square._D1
                                                 | Square._E2
                                                 | Square._E8
                                                 | Square._F3
                                                 | Square._F7
                                                 | Square._G4
                                                 | Square._G6;

   public static final long _PATHS_FROM_A6 = Square._B5
                                                 | Square._B7
                                                 | Square._C4
                                                 | Square._C8
                                                 | Square._D3
                                                 | Square._E2
                                                 | Square._F1;

   public static final long _PATHS_FROM_C6 = Square._A4
                                                 | Square._A8
                                                 | Square._B5
                                                 | Square._B7
                                                 | Square._D7
                                                 | Square._D5
                                                 | Square._E8
                                                 | Square._E4
                                                 | Square._F3
                                                 | Square._G2
                                                 | Square._H1;

   public static final long _PATHS_FROM_E6 = Square._A2
                                                 | Square._B3
                                                 | Square._C4
                                                 | Square._C8
                                                 | Square._D5
                                                 | Square._D7
                                                 | Square._F5
                                                 | Square._F7
                                                 | Square._G4
                                                 | Square._G8
                                                 | Square._H3;

   public static final long _PATHS_FROM_G6 = Square._B1
                                                 | Square._C2
                                                 | Square._D3
                                                 | Square._E4
                                                 | Square._E8
                                                 | Square._F5
                                                 | Square._F7
                                                 | Square._H5
                                                 | Square._H7;

   public static final long _PATHS_FROM_B7 = Square._A6
                                                 | Square._A8
                                                 | Square._C8
                                                 | Square._C6
                                                 | Square._D5
                                                 | Square._E4
                                                 | Square._F3
                                                 | Square._G2
                                                 | Square._H1;

   public static final long _PATHS_FROM_D7 = Square._A4
                                                 | Square._B5
                                                 | Square._C6
                                                 | Square._C8
                                                 | Square._E6
                                                 | Square._E8
                                                 | Square._F5
                                                 | Square._G4
                                                 | Square._H3;

   public static final long _PATHS_FROM_F7 = Square._A2
                                                 | Square._B3
                                                 | Square._C4
                                                 | Square._D5
                                                 | Square._E6
                                                 | Square._E8
                                                 | Square._G6
                                                 | Square._G8
                                                 | Square._H5;

   public static final long _PATHS_FROM_H7 = Square._B1
                                                 | Square._C2
                                                 | Square._D3
                                                 | Square._E4
                                                 | Square._F5
                                                 | Square._G6
                                                 | Square._G8;

   public static final long _PATHS_FROM_A8 = Square._B7
                                                 | Square._C6
                                                 | Square._D5
                                                 | Square._E4
                                                 | Square._F3
                                                 | Square._G2
                                                 | Square._H1;

   public static final long _PATHS_FROM_C8 = Square._A6
                                                 | Square._B7
                                                 | Square._D7
                                                 | Square._E6
                                                 | Square._F5
                                                 | Square._G4
                                                 | Square._H3;

   public static final long _PATHS_FROM_E8 = Square._A4
                                                 | Square._B5
                                                 | Square._C6
                                                 | Square._D7
                                                 | Square._F7
                                                 | Square._G6
                                                 | Square._H5;

   public static final long _PATHS_FROM_G8 = Square._A2
                                                 | Square._B3
                                                 | Square._C4
                                                 | Square._D5
                                                 | Square._E6
                                                 | Square._F7
                                                 | Square._H7;

}