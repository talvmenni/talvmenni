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

import org.forritan.talvmenni.bitboard.Rank;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.paths.WhitePawnCaptures;
import org.forritan.talvmenni.bitboard.paths.WhitePawnMoves;
import org.forritan.talvmenni.knowledge.Position;


public class WhitePawn {

   public static long captureMoveAttacksFrom(
         long square,
         Position p) {
      long result= 0L;
      result= WhitePawnCaptures.create().getPathsFrom(
            square);
      result&= ~p.getWhite().allPieces;
      result&= p.getBlack().allPieces;
      
      if(p.getBlack().enpassant != Square._EMPTY_BOARD) {
         result |= ((WhitePawnCaptures.create().getPathsFrom(
               square)
               & p.getBlack().enpassant)
               & Rank._6);
      }

      return result;
   }

   public static long moveAttacksFrom(
         long square,
         Position p) {
      long result= WhitePawnMoves.create().getPathsFrom(
            square);
      result&= ~p.getBlack().allPieces;
      result&= ~p.getWhite().allPieces;
      result&= ~(((p.getWhite().allPieces | p.getBlack().allPieces)
            & Rank._3 & (square << 8)) << 8);
      return result;
   }
}