package org.forritan.talvmenni.game;



public class ImmutablePosition extends PositionFactory {

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
   protected ImmutablePosition(
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

   }

   /**
    * @param white
    * @param black
    */
   protected ImmutablePosition(
         Bitboard white,
         Bitboard black) {
      super(
            white,
            black);
   }

   public Position pushMove(
         Bitboard white,
         Bitboard black) {
      return PositionFactory.create(
            false,
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
      return PositionFactory.create(true, this.getWhite(), this.getBlack());
   }
}