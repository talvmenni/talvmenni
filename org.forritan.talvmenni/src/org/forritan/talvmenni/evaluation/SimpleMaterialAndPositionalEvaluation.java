package org.forritan.talvmenni.evaluation;

import java.util.Iterator;

import org.forritan.talvmenni.bitboard.BitboardIterator;
import org.forritan.talvmenni.bitboard.evaluation.Board;
import org.forritan.talvmenni.game.ImmutablePosition;
import org.forritan.talvmenni.game.Position;

public class SimpleMaterialAndPositionalEvaluation implements Evaluation { 

   public int getScore(
         Position position) {
      int result= 0;
      
      // White
      
      for (Iterator it= position.getWhite().kingsIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.KING;         
      }
      for (Iterator it= position.getWhite().queensIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.QUEEN;         
      }
      for (Iterator it= position.getWhite().rooksIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.ROOK;         
      }
      for (Iterator it= position.getWhite().bishopsIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.BISHOP;         
      }
      for (Iterator it= position.getWhite().knightsIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.KNIGHT;         
      }
      for (Iterator it= position.getWhite().pawnsIterator(); it.hasNext();) {
         it.next();
         result += Evaluation.PAWN;         
      }
      
      for (Iterator it= new BitboardIterator(((position.getWhite().allPieces & ~position.getWhite().kings) & Board._CORE)); it.hasNext();) {
         it.next();
         result += Evaluation.POSITION_CORE;         
      }
      for (Iterator it= new BitboardIterator(((position.getWhite().allPieces & ~position.getWhite().kings) & Board._INNER_BORDER)); it.hasNext();) {
         it.next();
         result += Evaluation.POSITION_INNER_BORDER;         
      }
      for (Iterator it= new BitboardIterator(((position.getWhite().allPieces & ~position.getWhite().kings) & Board._MIDDLE_BORDER)); it.hasNext();) {
         it.next();
         result += Evaluation.POSITION_MIDDLE_BORDER;         
      }
      for (Iterator it= new BitboardIterator(((position.getWhite().allPieces & ~position.getWhite().kings) & Board._OUTER_BORDER)); it.hasNext();) {
         it.next();
         result += Evaluation.POSITION_OUTER_BORDER;         
      }

      for (Iterator it= new BitboardIterator((position.getWhite().getAllCaptureMovesAttackedSquares() & position.getWhite().allPieces)); it.hasNext();) {
         it.next();
         result += Evaluation.POSITION_GUARD_REWARD;         
      }

      if(position.getBlack().isChecked()) {
         result += Evaluation.CHECK_REWARD;                  
      }
            

      // Black
      
      for (Iterator it= position.getBlack().kingsIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.KING;         
      }
      for (Iterator it= position.getBlack().queensIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.QUEEN;         
      }
      for (Iterator it= position.getBlack().rooksIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.ROOK;         
      }
      for (Iterator it= position.getBlack().bishopsIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.BISHOP;         
      }
      for (Iterator it= position.getBlack().knightsIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.KNIGHT;         
      }
      for (Iterator it= position.getBlack().pawnsIterator(); it.hasNext();) {
         it.next();
         result -= Evaluation.PAWN;         
      }
      
      for (Iterator it= new BitboardIterator(((position.getBlack().allPieces & ~position.getBlack().kings) & Board._CORE)); it.hasNext();) {
         it.next();
         result -= Evaluation.POSITION_CORE;         
      }
      for (Iterator it= new BitboardIterator(((position.getBlack().allPieces & ~position.getBlack().kings) & Board._INNER_BORDER)); it.hasNext();) {
         it.next();
         result -= Evaluation.POSITION_INNER_BORDER;         
      }
      for (Iterator it= new BitboardIterator(((position.getBlack().allPieces & ~position.getBlack().kings) & Board._MIDDLE_BORDER)); it.hasNext();) {
         it.next();
         result -= Evaluation.POSITION_MIDDLE_BORDER;         
      }
      for (Iterator it= new BitboardIterator(((position.getBlack().allPieces & ~position.getBlack().kings) & Board._OUTER_BORDER)); it.hasNext();) {
         it.next();
         result -= Evaluation.POSITION_OUTER_BORDER;         
      }
      
      for (Iterator it= new BitboardIterator((position.getBlack().getAllCaptureMovesAttackedSquares() & position.getBlack().allPieces)); it.hasNext();) {
         it.next();
         result -= Evaluation.POSITION_GUARD_REWARD;         
      }
                  
      if(position.getWhite().isChecked()) {
         result -= Evaluation.CHECK_REWARD;                  
      }
                  
      return result;
   }
}
