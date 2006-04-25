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

package org.forritan.talvmenni.knowledge.evaluation;

import java.util.Iterator;

import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Position.Bitboard;


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