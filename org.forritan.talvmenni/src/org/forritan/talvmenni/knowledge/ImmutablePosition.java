package org.forritan.talvmenni.knowledge;

public class ImmutablePosition extends AbstractPosition {

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
   public ImmutablePosition(
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

   /**
    * @param white
    * @param black
    */
   protected ImmutablePosition(
         long auxiliaryState,
         Bitboard white,
         Bitboard black) {
      super(
            auxiliaryState,
            white,
            black);
   }

   public Position pushMove(
         long auxiliaryState,
         Bitboard white,
         Bitboard black) {
      return Position.Factory.create(
            false,
            false,
            auxiliaryState,
            white,
            black);
   }

   public Position popMove() {
      return this;
   }

   public synchronized Position getImmutable() {
      return this;
   }

   public synchronized Position getMutable() {
      return Position.Factory.create(
            false,
            true,
            this.auxiliaryState,
            this.getWhite(),
            this.getBlack());
   }
}