package org.forritan.talvmenni.game;

import org.forritan.talvmenni.game.Position.Bitboard;

public class MutablePartitionSearchPosition extends MutablePosition {

   public MutablePartitionSearchPosition(
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

   public MutablePartitionSearchPosition(
         Bitboard white,
         Bitboard black) {
      super(
            white,
            black);
   }

   public Position getImmutable() {
      return Position.Factory.create(true, false, this.getWhite(), this.getBlack());
   }

}
