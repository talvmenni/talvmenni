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

import org.forritan.talvmenni.bitboard.BitboardIterator;
import org.forritan.talvmenni.bitboard.RookMasks;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.paths.Rooks;
import org.forritan.talvmenni.knowledge.Position;


public class Rook {

   public static long attacksFrom(
         long square,
         Position p) {

        long result= Square._EMPTY_BOARD;
        
        if(!p.getWhite().isAnyPieceOnPosition(square) && !p.getBlack().isAnyPieceOnPosition(square)) {
         return result;
      }

        long allPiecesOnPath= Rooks.create().getPathsFrom(
                  square)
                  & (p.getWhite().allPieces | p.getBlack().allPieces);

        //Check North from square...
        long northPath= Square._EMPTY_BOARD;
        BitboardIterator northPiecesIterator= new BitboardIterator((allPiecesOnPath
               & ~RookMasks.create().getNorth2SouthMaskFrom(
                        square)));
        while (northPiecesIterator.hasNext()) {
               northPath |= ~RookMasks.create().getNorth2SouthMaskFrom(northPiecesIterator.nextBitboard());
            }
        northPath |= ~Rooks.create().getPathsFrom(square);
        northPath |= RookMasks.create().getNorth2SouthMaskFrom(square);            
        result |= ~northPath;

        //Check South from square...
        long southPath= Square._EMPTY_BOARD;
        BitboardIterator southPiecesIterator= new BitboardIterator((allPiecesOnPath
               & ~RookMasks.create().getSouth2NorthMaskFrom(
                        square)));
        while (southPiecesIterator.hasNext()) {
             southPath |= ~RookMasks.create().getSouth2NorthMaskFrom(southPiecesIterator.nextBitboard());
            }
        southPath |= ~Rooks.create().getPathsFrom(square);
        southPath |= RookMasks.create().getSouth2NorthMaskFrom(square);            
        result |= ~southPath;
            
        //Check East from square...
        long eastPath= Square._EMPTY_BOARD;
        BitboardIterator eastPiecesIterator= new BitboardIterator((allPiecesOnPath
               & ~RookMasks.create().getEast2WestMaskFrom(
                        square)));
        while (eastPiecesIterator.hasNext()) {
             eastPath |= ~RookMasks.create().getEast2WestMaskFrom(eastPiecesIterator.nextBitboard());
            }
        eastPath |= ~Rooks.create().getPathsFrom(square);
        eastPath |= RookMasks.create().getEast2WestMaskFrom(square);            
        result |= ~eastPath;

        //Check West from square...
        long westPath= Square._EMPTY_BOARD;
        BitboardIterator westPiecesIterator= new BitboardIterator((allPiecesOnPath
               & ~RookMasks.create().getWest2EastMaskFrom(
                        square)));
        while (westPiecesIterator.hasNext()) {
             westPath |= ~RookMasks.create().getWest2EastMaskFrom(westPiecesIterator.nextBitboard());
            }
        westPath |= ~Rooks.create().getPathsFrom(square);
        westPath |= RookMasks.create().getWest2EastMaskFrom(square);            
        result |= ~westPath;
        
        if(p.getWhite().isAnyPieceOnPosition(square)) {
           result &= ~p.getWhite().allPieces;
        } else {
           result &= ~p.getBlack().allPieces;
        }
            
      return result;
   }
}