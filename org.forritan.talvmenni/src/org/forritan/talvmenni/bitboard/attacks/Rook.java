package org.forritan.talvmenni.bitboard.attacks;

import java.util.Iterator;

import org.forritan.talvmenni.bitboard.BitboardIterator;
import org.forritan.talvmenni.bitboard.RookMasks;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.paths.Rooks;
import org.forritan.talvmenni.game.Position;


public class Rook {

   public static long attacksFrom(
         long square,
         Position p) {

        long result= Square._EMPTY_BOARD;
        
        if(!p.white.isAnyPieceOnPosition(square) && !p.black.isAnyPieceOnPosition(square)) {
         return result;
      }

        long allPiecesOnPath= Rooks.create().getPathsFrom(
                  square)
                  & (p.white.allPieces | p.black.allPieces);

        //Check North from square...
        long northPath= Square._EMPTY_BOARD;
        Iterator<Long> northPiecesIterator= new BitboardIterator((allPiecesOnPath
               & ~RookMasks.create().getNorth2SouthMaskFrom(
                        square)));
        while (northPiecesIterator.hasNext()) {
             Long piece= northPiecesIterator.next();
               northPath |= ~RookMasks.create().getNorth2SouthMaskFrom(piece.longValue());
            }
        northPath |= ~Rooks.create().getPathsFrom(square);
        northPath |= RookMasks.create().getNorth2SouthMaskFrom(square);            
        result |= ~northPath;

        //Check South from square...
        long southPath= Square._EMPTY_BOARD;
        Iterator<Long> southPiecesIterator= new BitboardIterator((allPiecesOnPath
               & ~RookMasks.create().getSouth2NorthMaskFrom(
                        square)));
        while (southPiecesIterator.hasNext()) {
             Long piece= southPiecesIterator.next();
             southPath |= ~RookMasks.create().getSouth2NorthMaskFrom(piece.longValue());
            }
        southPath |= ~Rooks.create().getPathsFrom(square);
        southPath |= RookMasks.create().getSouth2NorthMaskFrom(square);            
        result |= ~southPath;
            
        //Check East from square...
        long eastPath= Square._EMPTY_BOARD;
        Iterator<Long> eastPiecesIterator= new BitboardIterator((allPiecesOnPath
               & ~RookMasks.create().getEast2WestMaskFrom(
                        square)));
        while (eastPiecesIterator.hasNext()) {
             Long piece= eastPiecesIterator.next();
             eastPath |= ~RookMasks.create().getEast2WestMaskFrom(piece.longValue());
            }
        eastPath |= ~Rooks.create().getPathsFrom(square);
        eastPath |= RookMasks.create().getEast2WestMaskFrom(square);            
        result |= ~eastPath;

        //Check West from square...
        long westPath= Square._EMPTY_BOARD;
        Iterator<Long> westPiecesIterator= new BitboardIterator((allPiecesOnPath
               & ~RookMasks.create().getWest2EastMaskFrom(
                        square)));
        while (westPiecesIterator.hasNext()) {
             Long piece= westPiecesIterator.next();
             westPath |= ~RookMasks.create().getWest2EastMaskFrom(piece.longValue());
            }
        westPath |= ~Rooks.create().getPathsFrom(square);
        westPath |= RookMasks.create().getWest2EastMaskFrom(square);            
        result |= ~westPath;
        
        if(p.white.isAnyPieceOnPosition(square)) {
           result &= ~p.white.allPieces;
        } else {
           result &= ~p.black.allPieces;
        }
            
      return result;
   }
}