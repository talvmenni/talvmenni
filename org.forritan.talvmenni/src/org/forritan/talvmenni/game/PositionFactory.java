package org.forritan.talvmenni.game;

import org.forritan.talvmenni.bitboard.Rank;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.game.Position.Bitboard;


public abstract class PositionFactory implements Position {

   public static int positionsCreated;
   public static int nodes = 1;
   protected Bitboard white;
   protected Bitboard black;

   public static Position createInitialImmutable() {
      return new ImmutablePosition(
            Square._E1, // whiteKings
            Square._D1, // whiteQueens
            Square._A1
                  | Square._H1, // whiteRooks
            Square._C1
                  | Square._F1, // whiteBishops
            Square._B1
                  | Square._G1, // whiteKnights
            Rank._2, // whitePawns
            Square._A1
                  | Square._E1
                  | Square._H1, // whiteCastling
            Square._EMPTY_BOARD, // whiteEnpassant
            Square._E8, // blackKings
            Square._D8, // blackQueens
            Square._A8
                  | Square._H8, // blackRooks
            Square._C8
                  | Square._F8, // blackBishops
            Square._B8
                  | Square._G8, // blackKnights
            Rank._7, // blackPawns
            Square._A8
                  | Square._E8
                  | Square._H8, // blackCastling
            Square._EMPTY_BOARD // blackEnpassant
      );
   }

   /**
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
    * @return
    */
   public static Position create(
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
            return new ImmutablePosition(
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

   public Bitboard getBlack() {
      return this.black;
   }

   public Bitboard getWhite() {
      return this.white;
   }


}
