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

package org.forritan.talvmenni.bitboard.attacks;

import org.forritan.talvmenni.bitboard.paths.Kings;
import org.forritan.talvmenni.knowledge.Position;


public class King {

   private static org.forritan.talvmenni.bitboard.paths.King kingPaths = Kings
                                                                             .create();

   public static long attacksFrom(
         long square,
         Position p) {
      long result= 0L;

      if (p.getWhite().isKing(square)) {
         result= (kingPaths.getPathsFrom(square)& ~p.getWhite().allPieces);
      } else if (p.getBlack().isKing(square)) {
         result= (kingPaths.getPathsFrom(square)& ~p.getBlack().allPieces);
      }

      return result;
   }
}