package org.forritan.talvmenni.core.util;

import java.util.List;

import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.Position.Move;


public class ChessEngineMethods {

   public static long perft(
         Position p,
         boolean whiteMove,
         int ply) {
      if (ply == 1) {
         if (whiteMove) {
            return p.getWhite().getPossibleMoves().size();
         } else {
            return p.getBlack().getPossibleMoves().size();
         }
      } else {
         long result= 0;
         List<Move> moves;
         if (whiteMove) {
            moves= p.getWhite().getPossibleMoves();
         } else {
            moves= p.getBlack().getPossibleMoves();
         }
         for (Move move : moves) {
            result+= ChessEngineMethods.perft(
                  p.move(
                        move.from,
                        move.to),
                  !whiteMove,
                  ply - 1);
            p.popMove();
         }
         return result;
      }

   }

}
