package org.forritan.talvmenni.knowledge.evaluation;

import java.util.Iterator;

import org.forritan.talvmenni.knowledge.ImmutablePosition;
import org.forritan.talvmenni.knowledge.Position;

public class SimpleMaterialEvaluation  extends AbstractEvaluation { 

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
