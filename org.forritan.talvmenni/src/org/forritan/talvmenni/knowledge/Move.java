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

package org.forritan.talvmenni.knowledge;

import org.forritan.talvmenni.bitboard.Rank;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.Squares;


public class Move {

   public final boolean  whiteMove;
   public final long     time;
   public final Position fromPosition;
   public final Position toPosition;
   public final long     from;
   public final long     to;
   public final int      promotionPiece;

   public Move(
         Position fromPosition,
         long fromSquare,
         long toSquare,
         int promotionPiece) {
      this.time= System.currentTimeMillis();
      this.promotionPiece= promotionPiece;
      this.fromPosition= fromPosition.getImmutable();
      this.whiteMove= this.fromPosition.getWhite().isAnyPieceOnPosition(
            fromSquare);
      this.toPosition= fromPosition.move(new Position.Move(
            fromSquare,
            toSquare,
            this.promotionPiece));
      this.from= fromSquare;
      this.to= toSquare;
   }

   public Move(
         Position fromPosition,
         long fromSquare,
         long toSquare) {
      this.time= System.currentTimeMillis();
      this.promotionPiece= Position.PromotionPiece.NONE;
      this.fromPosition= fromPosition.getImmutable();
      this.whiteMove= this.fromPosition.getWhite().isAnyPieceOnPosition(
            fromSquare);
      this.toPosition= fromPosition.move(new Position.Move(
            fromSquare,
            toSquare,
            this.promotionPiece));
      this.from= fromSquare;
      this.to= toSquare;
   }

   public String toString() {
      Square sq= Squares.create();
      return sq.getSquareName(from)
            + sq.getSquareName(to)
            + this.getPromotionString();
   }

   private String getPromotionString() {
      String result= "";
      if (this.whiteMove) {
         if (fromPosition.getWhite().isPawn(
               from)
               && ((from & ~Rank._7) == Square._EMPTY_BOARD)) {
            result= Position.PromotionPiece.STRINGS[this.promotionPiece];
         }
      } else {
         if (fromPosition.getBlack().isPawn(
               from)
               && ((from & ~Rank._2) == Square._EMPTY_BOARD)) {
            result= Position.PromotionPiece.STRINGS[this.promotionPiece];
         }
      }
      return result;
   }
}