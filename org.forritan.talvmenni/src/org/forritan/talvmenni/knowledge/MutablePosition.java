package org.forritan.talvmenni.knowledge;

import java.util.Stack;

import org.forritan.talvmenni.knowledge.Position.Bitboard;


public class MutablePosition extends AbstractPosition {

   Stack auxiliaryStates;
   Stack whiteBitboards;
   Stack blackBitboards;

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
   protected MutablePosition(
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
      this.auxiliaryStates= new Stack();
      this.whiteBitboards= new Stack();
      this.blackBitboards= new Stack();
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
      this.auxiliaryStates= new Stack();
      this.whiteBitboards= new Stack();
      this.blackBitboards= new Stack();
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
      this.auxiliaryState= ((Long)this.auxiliaryStates.pop()).longValue();
      this.white= (Bitboard) this.whiteBitboards.pop();
      this.black= (Bitboard) this.blackBitboards.pop();
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