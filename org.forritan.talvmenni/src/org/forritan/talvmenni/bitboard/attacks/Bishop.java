package org.forritan.talvmenni.bitboard.attacks;

import java.util.Iterator;

import org.forritan.talvmenni.bitboard.BitboardIterator;
import org.forritan.talvmenni.bitboard.BishopMasks;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.paths.Bishops;
import org.forritan.talvmenni.game.ImmutablePosition;
import org.forritan.talvmenni.game.Position;


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
      Iterator<Long> northWestPiecesIterator= new BitboardIterator((allPiecesOnPath
             & ~BishopMasks.create().getNorthWest2SouthEastMaskFrom(
                      square)));
      while (northWestPiecesIterator.hasNext()) {
           Long piece= northWestPiecesIterator.next();
             northWestPath |= ~BishopMasks.create().getNorthWest2SouthEastMaskFrom(piece.longValue());
          }
      northWestPath |= ~Bishops.create().getPathsFrom(square);
      northWestPath |= BishopMasks.create().getNorthWest2SouthEastMaskFrom(square);            
      result |= ~northWestPath;

      //Check SouthWest from square...
      long southWestPath= Square._EMPTY_BOARD;
      Iterator<Long> southWestPiecesIterator= new BitboardIterator((allPiecesOnPath
             & ~BishopMasks.create().getSouthWest2NorthEastMaskFrom(
                      square)));
      while (southWestPiecesIterator.hasNext()) {
           Long piece= southWestPiecesIterator.next();
           southWestPath |= ~BishopMasks.create().getSouthWest2NorthEastMaskFrom(piece.longValue());
          }
      southWestPath |= ~Bishops.create().getPathsFrom(square);
      southWestPath |= BishopMasks.create().getSouthWest2NorthEastMaskFrom(square);            
      result |= ~southWestPath;
          
      //Check SouthEast from square...
      long southEastPath= Square._EMPTY_BOARD;
      Iterator<Long> southEastPiecesIterator= new BitboardIterator((allPiecesOnPath
             & ~BishopMasks.create().getSouthEast2NorthWestMaskFrom(
                      square)));
      while (southEastPiecesIterator.hasNext()) {
           Long piece= southEastPiecesIterator.next();
           southEastPath |= ~BishopMasks.create().getSouthEast2NorthWestMaskFrom(piece.longValue());
          }
      southEastPath |= ~Bishops.create().getPathsFrom(square);
      southEastPath |= BishopMasks.create().getSouthEast2NorthWestMaskFrom(square);            
      result |= ~southEastPath;

      //Check NorthEast from square...
      long northEastPath= Square._EMPTY_BOARD;
      Iterator<Long> northEastPiecesIterator= new BitboardIterator((allPiecesOnPath
             & ~BishopMasks.create().getNorthEast2SouthWestMaskFrom(
                      square)));
      while (northEastPiecesIterator.hasNext()) {
           Long piece= northEastPiecesIterator.next();
           northEastPath |= ~BishopMasks.create().getNorthEast2SouthWestMaskFrom(piece.longValue());
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