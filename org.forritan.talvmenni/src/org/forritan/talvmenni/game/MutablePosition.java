package org.forritan.talvmenni.game;

import java.util.Stack;

import org.forritan.talvmenni.game.Position.Bitboard;


public class MutablePosition extends AbstractPosition {
   
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
      this.whiteBitboards= new Stack();
      this.blackBitboards= new Stack();
   }

   /**
    * @param white
    * @param black
    */
   protected MutablePosition(
         Bitboard white,
         Bitboard black) {
      super(
            white,
            black);
      this.whiteBitboards= new Stack();
      this.blackBitboards= new Stack();
   }

   public Position pushMove(
         Bitboard white,
         Bitboard black) {
      
      this.whiteBitboards.push(this.white);
      this.blackBitboards.push(this.black);
      this.white= white;
      this.black= black;
      return this;
   }
   
   public Position popMove() {
      this.white= (Bitboard) this.whiteBitboards.pop();
      this.black= (Bitboard) this.blackBitboards.pop();
      return this;
   }

   public Position getImmutable() {
      return Position.Factory.create(false, this.getWhite(), this.getBlack());
   }

   public Position getMutable() {
      return this;
   }
}