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

public interface Rank extends Serializable {
   
   public static final long serialVersionUID = 1L; 

   public static final long _1 = Square._A1
                                     | Square._B1
                                     | Square._C1
                                     | Square._D1
                                     | Square._E1
                                     | Square._F1
                                     | Square._G1
                                     | Square._H1;
   public static final long _2 = Square._A2
                                     | Square._B2
                                     | Square._C2
                                     | Square._D2
                                     | Square._E2
                                     | Square._F2
                                     | Square._G2
                                     | Square._H2;
   public static final long _3 = Square._A3
                                     | Square._B3
                                     | Square._C3
                                     | Square._D3
                                     | Square._E3
                                     | Square._F3
                                     | Square._G3
                                     | Square._H3;
   public static final long _4 = Square._A4
                                     | Square._B4
                                     | Square._C4
                                     | Square._D4
                                     | Square._E4
                                     | Square._F4
                                     | Square._G4
                                     | Square._H4;
   public static final long _5 = Square._A5
                                     | Square._B5
                                     | Square._C5
                                     | Square._D5
                                     | Square._E5
                                     | Square._F5
                                     | Square._G5
                                     | Square._H5;
   public static final long _6 = Square._A6
                                     | Square._B6
                                     | Square._C6
                                     | Square._D6
                                     | Square._E6
                                     | Square._F6
                                     | Square._G6
                                     | Square._H6;
   public static final long _7 = Square._A7
                                     | Square._B7
                                     | Square._C7
                                     | Square._D7
                                     | Square._E7
                                     | Square._F7
                                     | Square._G7
                                     | Square._H7;
   public static final long _8 = Square._A8
                                     | Square._B8
                                     | Square._C8
                                     | Square._D8
                                     | Square._E8
                                     | Square._F8
                                     | Square._G8
                                     | Square._H8;
}