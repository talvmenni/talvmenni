package org.forritan.talvmenni.game;

import org.forritan.talvmenni.bitboard.Rank;
import org.forritan.talvmenni.bitboard.Square;


public class Position {

   public final BasePosition white;
   public final BasePosition black;

   public static Position createInitial() {
      return new Position(
            Square._E1,
            Square._D1,
            Square._A1
                  | Square._H1,
            Square._C1
                  | Square._F1,
            Square._B1
                  | Square._G1,
            Rank._2,
            Square._E8,
            Square._D8,
            Square._A8
                  | Square._H8,
            Square._C8
                  | Square._F8,
            Square._B8
                  | Square._G8,
            Rank._7);
   }

   /**
    * 
    * @param whiteKing
    * @param whiteQueen
    * @param whiteRooks
    * @param whiteBishops
    * @param whiteKnights
    * @param whitePawns
    * @param blackKing
    * @param blackQueen
    * @param blackRooks
    * @param blackBishops
    * @param blackKnights
    * @param blackPawns
    * @return
    */
   public static Position create(
         long whiteKing,
         long whiteQueen,
         long whiteRooks,
         long whiteBishops,
         long whiteKnights,
         long whitePawns,
         long blackKing,
         long blackQueen,
         long blackRooks,
         long blackBishops,
         long blackKnights,
         long blackPawns) {
      return new Position(
            whiteKing,
            whiteQueen,
            whiteRooks,
            whiteBishops,
            whiteKnights,
            whitePawns,
            blackKing,
            blackQueen,
            blackRooks,
            blackBishops,
            blackKnights,
            blackPawns);
   }

   /**
    * 
    * @param whiteKing
    * @param whiteQueen
    * @param whiteRooks
    * @param whiteBishops
    * @param whiteKnights
    * @param whitePawns
    * @param blackKing
    * @param blackQueen
    * @param blackRooks
    * @param blackBishops
    * @param blackKnights
    * @param blackPawns
    */
   private Position(
         long whiteKing,
         long whiteQueen,
         long whiteRooks,
         long whiteBishops,
         long whiteKnights,
         long whitePawns,
         long blackKing,
         long blackQueen,
         long blackRooks,
         long blackBishops,
         long blackKnights,
         long blackPawns) {

      this.white= new BasePosition(
            whiteKing,
            whiteQueen,
            whiteRooks,
            whiteBishops,
            whiteKnights,
            whitePawns);
      this.black= new BasePosition(
            blackKing,
            blackQueen,
            blackRooks,
            blackBishops,
            blackKnights,
            blackPawns);
   }

   public class BasePosition {
      public final long king;
      public final long queen;
      public final long rooks;
      public final long bishops;
      public final long knights;
      public final long pawns;

      /**
       * @param king
       * @param queen
       * @param bishops
       * @param knights
       * @param rooks
       * @param pawns
       */
      public BasePosition(
            long king,
            long queen,
            long rooks,
            long bishops,
            long knights,
            long pawns) {
         this.king= king;
         this.queen= queen;
         this.rooks= rooks;
         this.bishops= bishops;
         this.knights= knights;
         this.pawns= pawns;
      }

   }

}