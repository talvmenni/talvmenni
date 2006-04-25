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

public class SimpleMaterialEvaluation  extends AbstractEvaluation { 

   private static final long serialVersionUID = 1L;

   public int getOpeningGameScore(
         Position position) {
      int result= 0;
      for (Iterator it= position.getWhite().kingsIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.KING_IN_OPENING_GAME;         
      }
      for (Iterator it= position.getWhite().queensIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.QUEEN_IN_OPENING_GAME;         
      }
      for (Iterator it= position.getWhite().rooksIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.ROOK_IN_OPENING_GAME;         
      }
      for (Iterator it= position.getWhite().bishopsIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.BISHOP_IN_OPENING_GAME;         
      }
      for (Iterator it= position.getWhite().knightsIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.KNIGHT_IN_OPENING_GAME;         
      }
      for (Iterator it= position.getWhite().pawnsIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.PAWN_IN_OPENING_GAME;         
      }
      
      
      
      for (Iterator it= position.getBlack().kingsIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.KING_IN_OPENING_GAME;         
      }
      for (Iterator it= position.getBlack().queensIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.QUEEN_IN_OPENING_GAME;         
      }
      for (Iterator it= position.getBlack().rooksIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.ROOK_IN_OPENING_GAME;         
      }
      for (Iterator it= position.getBlack().bishopsIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.BISHOP_IN_OPENING_GAME;         
      }
      for (Iterator it= position.getBlack().knightsIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.KNIGHT_IN_OPENING_GAME;         
      }
      for (Iterator it= position.getBlack().pawnsIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.PAWN_IN_OPENING_GAME;         
      }
      
      return result;
   }


   public int getMiddleGameScore(
         Position position) {
      int result= 0;
      for (Iterator it= position.getWhite().kingsIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.KING_IN_MIDDLE_GAME;         
      }
      for (Iterator it= position.getWhite().queensIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.QUEEN_IN_MIDDLE_GAME;         
      }
      for (Iterator it= position.getWhite().rooksIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.ROOK_IN_MIDDLE_GAME;         
      }
      for (Iterator it= position.getWhite().bishopsIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.BISHOP_IN_MIDDLE_GAME;         
      }
      for (Iterator it= position.getWhite().knightsIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.KNIGHT_IN_MIDDLE_GAME;         
      }
      for (Iterator it= position.getWhite().pawnsIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.PAWN_IN_MIDDLE_GAME;         
      }
      
      
      
      for (Iterator it= position.getBlack().kingsIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.KING_IN_MIDDLE_GAME;         
      }
      for (Iterator it= position.getBlack().queensIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.QUEEN_IN_MIDDLE_GAME;         
      }
      for (Iterator it= position.getBlack().rooksIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.ROOK_IN_MIDDLE_GAME;         
      }
      for (Iterator it= position.getBlack().bishopsIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.BISHOP_IN_MIDDLE_GAME;         
      }
      for (Iterator it= position.getBlack().knightsIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.KNIGHT_IN_MIDDLE_GAME;         
      }
      for (Iterator it= position.getBlack().pawnsIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.PAWN_IN_MIDDLE_GAME;         
      }
      
      return result;
   }


   public int getEndGameScore(
         Position position) {
      int result= 0;
      for (Iterator it= position.getWhite().kingsIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.KING_IN_END_GAME;         
      }
      for (Iterator it= position.getWhite().queensIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.QUEEN_IN_END_GAME;         
      }
      for (Iterator it= position.getWhite().rooksIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.ROOK_IN_END_GAME;         
      }
      for (Iterator it= position.getWhite().bishopsIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.BISHOP_IN_END_GAME;         
      }
      for (Iterator it= position.getWhite().knightsIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.KNIGHT_IN_END_GAME;         
      }
      for (Iterator it= position.getWhite().pawnsIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.PAWN_IN_END_GAME;         
      }
      
      
      
      for (Iterator it= position.getBlack().kingsIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.KING_IN_END_GAME;         
      }
      for (Iterator it= position.getBlack().queensIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.QUEEN_IN_END_GAME;         
      }
      for (Iterator it= position.getBlack().rooksIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.ROOK_IN_END_GAME;         
      }
      for (Iterator it= position.getBlack().bishopsIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.BISHOP_IN_END_GAME;         
      }
      for (Iterator it= position.getBlack().knightsIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.KNIGHT_IN_END_GAME;         
      }
      for (Iterator it= position.getBlack().pawnsIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.PAWN_IN_END_GAME;         
      }
      
      return result;
   }
}
