package org.forritan.talvmenni.bitboard.attacks;

import java.util.Iterator;

import org.forritan.talvmenni.bitboard.BitboardIterator;
import org.forritan.talvmenni.bitboard.RookMasks;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.paths.Rooks;
import org.forritan.talvmenni.knowledge.ImmutablePosition;
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