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



public class MutablePartitionSearchPosition extends MutablePosition {

   private static final long serialVersionUID = 1L;

   public MutablePartitionSearchPosition(
         long auxiliaryState,
         long whiteKings,
         long whiteQueens,
         long whiteRooks,
         long whiteBishops,
         long whiteKnights,
         long whitePawns,
         long whiteCastling,
         long whiteEnpassant,
         long blackKings,
         long blackQueens,
         long blackRooks,
         long blackBishops,
         long blackKnights,
         long blackPawns,
         long blackCastling,
         long blackEnpassant) {
      super(
            auxiliaryState,
            whiteKings,
            whiteQueens,
            whiteRooks,
            whiteBishops,
            whiteKnights,
            whitePawns,
            whiteCastling,
            whiteEnpassant,
            blackKings,
            blackQueens,
            blackRooks,
            blackBishops,
            blackKnights,
            blackPawns,
            blackCastling,
            blackEnpassant);
   }

   public MutablePartitionSearchPosition(
         long auxiliaryState,
         Bitboard white,
         Bitboard black) {
      super(
            auxiliaryState,
            white,
            black);
   }

   public int hashCode() {
      return this.getWhite().partitionSearchHashCode()
            ^ this.getBlack().partitionSearchHashCode();
   }

   public boolean equals(
         Object o) {
      if (o instanceof Position) {
         return this.getWhite().partitionSearchEquals(
               ((Position) o).getWhite())
               && this.getBlack().partitionSearchEquals(
                     ((Position) o).getBlack());
      } else {
         return false;
      }
   }

   public Position getImmutable() {
      return Position.Factory.create(
            true,
            false,
            this.auxiliaryState,
            this.getWhite(),
            this.getBlack());
   }

}