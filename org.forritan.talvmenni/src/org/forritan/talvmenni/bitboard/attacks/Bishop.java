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

import org.forritan.talvmenni.bitboard.BishopMasks;
import org.forritan.talvmenni.bitboard.BitboardIterator;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.paths.Bishops;
import org.forritan.talvmenni.knowledge.Position;


public class Bishop {

   public static long attacksFrom(
         long square,
         Position p) {
      long result= Square._EMPTY_BOARD;
      
      if(!p.getWhite().isAnyPieceOnPosition(square) && !p.getBlack().isAnyPieceOnPosition(square)) {
       return result;
    }

      long allPiecesOnPath= Bishops.create().getPathsFrom(
                square)
                & (p.getWhite().allPieces | p.getBlack().allPieces);

      //Check NorthWest from square...
      long northWestPath= Square._EMPTY_BOARD;
      BitboardIterator northWestPiecesIterator= new BitboardIterator((allPiecesOnPath
             & ~BishopMasks.create().getNorthWest2SouthEastMaskFrom(
                      square)));
      while (northWestPiecesIterator.hasNext()) {
             northWestPath |= ~BishopMasks.create().getNorthWest2SouthEastMaskFrom(northWestPiecesIterator.nextBitboard());
          }
      northWestPath |= ~Bishops.create().getPathsFrom(square);
      northWestPath |= BishopMasks.create().getNorthWest2SouthEastMaskFrom(square);            
      result |= ~northWestPath;

      //Check SouthWest from square...
      long southWestPath= Square._EMPTY_BOARD;
      BitboardIterator southWestPiecesIterator= new BitboardIterator((allPiecesOnPath
             & ~BishopMasks.create().getSouthWest2NorthEastMaskFrom(
                      square)));
      while (southWestPiecesIterator.hasNext()) {
           southWestPath |= ~BishopMasks.create().getSouthWest2NorthEastMaskFrom(southWestPiecesIterator.nextBitboard());
          }
      southWestPath |= ~Bishops.create().getPathsFrom(square);
      southWestPath |= BishopMasks.create().getSouthWest2NorthEastMaskFrom(square);            
      result |= ~southWestPath;
          
      //Check SouthEast from square...
      long southEastPath= Square._EMPTY_BOARD;
      BitboardIterator southEastPiecesIterator= new BitboardIterator((allPiecesOnPath
             & ~BishopMasks.create().getSouthEast2NorthWestMaskFrom(
                      square)));
      while (southEastPiecesIterator.hasNext()) {
           southEastPath |= ~BishopMasks.create().getSouthEast2NorthWestMaskFrom(southEastPiecesIterator.nextBitboard());
          }
      southEastPath |= ~Bishops.create().getPathsFrom(square);
      southEastPath |= BishopMasks.create().getSouthEast2NorthWestMaskFrom(square);            
      result |= ~southEastPath;

      //Check NorthEast from square...
      long northEastPath= Square._EMPTY_BOARD;
      BitboardIterator northEastPiecesIterator= new BitboardIterator((allPiecesOnPath
             & ~BishopMasks.create().getNorthEast2SouthWestMaskFrom(
                      square)));
      while (northEastPiecesIterator.hasNext()) {
           northEastPath |= ~BishopMasks.create().getNorthEast2SouthWestMaskFrom(northEastPiecesIterator.nextBitboard());
          }
      northEastPath |= ~Bishops.create().getPathsFrom(square);
      northEastPath |= BishopMasks.create().getNorthEast2SouthWestMaskFrom(square);            
      result |= ~northEastPath;
      
      if(p.getWhite().isAnyPieceOnPosition(square)) {
         result &= ~p.getWhite().allPieces;
      } else {
         result &= ~p.getBlack().allPieces;
      }
          
    return result;
   }
}