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

import java.util.Stack;


public class MutablePosition extends AbstractPosition {

   private static final long serialVersionUID = 1L;

   Stack<Long> auxiliaryStates;
   Stack<Bitboard> whiteBitboards;
   Stack<Bitboard> blackBitboards;

   /**
    * 
    * @param whiteKings
    * @param whiteQueens
    * @param whiteRooks
    * @param whiteBishops
    * @param whiteKnights
    * @param whitePawns
    * @param whiteCastling
    * @param whiteEnpassant
    * @param blackKings
    * @param blackQueens
    * @param blackRooks
    * @param blackBishops
    * @param blackKnights
    * @param blackPawns
    * @param blackCastling
    * @param blackEnpassant
    */
   public MutablePosition(
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
      this.auxiliaryStates= new Stack<Long>();
      this.whiteBitboards= new Stack<Bitboard>();
      this.blackBitboards= new Stack<Bitboard>();
   }

   /**
    * @param white
    * @param black
    */
   protected MutablePosition(
         long auxiliaryState,
         Bitboard white,
         Bitboard black) {
      super(
            auxiliaryState,
            white,
            black);
      this.auxiliaryStates= new Stack<Long>();
      this.whiteBitboards= new Stack<Bitboard>();
      this.blackBitboards= new Stack<Bitboard>();
   }

   public Position pushMove(
         long auxiliaryState,
         Bitboard white,
         Bitboard black) {

      this.auxiliaryStates.push(new Long(this.auxiliaryState));
      this.whiteBitboards.push(this.white);
      this.blackBitboards.push(this.black);
      this.auxiliaryState= auxiliaryState;
      this.white= white;
      this.black= black;
      return this;
   }

   public Position popMove() {
      this.auxiliaryState= this.auxiliaryStates.pop().longValue();
      this.white= this.whiteBitboards.pop();
      this.black= this.blackBitboards.pop();
      return this;
   }

   public Position getImmutable() {
      return Position.Factory.create(
            false,
            false,
            this.auxiliaryState,
            this.getWhite(),
            this.getBlack());
   }

   public Position getMutable() {
      return this;
   }
}