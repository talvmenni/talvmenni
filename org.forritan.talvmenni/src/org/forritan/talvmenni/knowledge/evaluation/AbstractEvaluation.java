package org.forritan.talvmenni.knowledge.evaluation;

import java.util.Iterator;

import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Position.Bitboard;
import org.forritan.talvmenni.knowledge.evaluation.Evaluation.GameFase;


public abstract class AbstractEvaluation implements Evaluation {

   public abstract int getOpeningGameScore(
         Position position);

   public abstract int getMiddleGameScore(
         Position position);

   public abstract int getEndGameScore(
         Position position);

   public int getScore(
         Position position,
         boolean whiteToMove) {
      switch (this.getGameFase(
            position,
            whiteToMove)) {
         case Evaluation.GameFase.END_GAME:
            return this.getEndGameScore(position);
         case Evaluation.GameFase.MIDDLE_GAME:
            return this.getMiddleGameScore(position);
         default: // Evaluation.GameFase.OPENING_GAME:
            return this.getOpeningGameScore(position);
      }
   }

   public int getGameFase(
         Position position,
         boolean whiteToMove) {

      int result= 0;
      Bitboard board;
      if (whiteToMove) {
         board= position.getWhite();
      } else {
         board= position.getBlack();
      }

      for (Iterator it= board.queensIterator(); it.hasNext();) {
         it.next();
         result+= QUEEN_IN_OPENING_GAME;
      }
      for (Iterator it= board.rooksIterator(); it.hasNext();) {
         it.next();
         result+= ROOK_IN_OPENING_GAME;
      }
      for (Iterator it= board.bishopsIterator(); it.hasNext();) {
         it.next();
         result+= BISHOP_IN_OPENING_GAME;
      }
      for (Iterator it= board.knightsIterator(); it.hasNext();) {
         it.next();
         result+= KNIGHT_IN_OPENING_GAME;
      }
      for (Iterator it= board.pawnsIterator(); it.hasNext();) {
         it.next();
         result+= PAWN_IN_OPENING_GAME;
      }

      if (MIDDLE_GAME_WHEN_BELOW < result) {
         return Evaluation.GameFase.OPENING_GAME;
      } else if (END_GAME_WHEN_BELOW < result) {
         return Evaluation.GameFase.MIDDLE_GAME;
      } else {
         return Evaluation.GameFase.END_GAME;
      }
   }
}