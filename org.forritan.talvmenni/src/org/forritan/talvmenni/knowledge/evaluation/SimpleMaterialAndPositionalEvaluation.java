package org.forritan.talvmenni.knowledge.evaluation;

import java.util.Iterator;

import org.forritan.talvmenni.bitboard.BitboardIterator;
import org.forritan.talvmenni.bitboard.Rank;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.evaluation.Board;
import org.forritan.talvmenni.knowledge.Draw;
import org.forritan.talvmenni.knowledge.Position;

public class SimpleMaterialAndPositionalEvaluation extends AbstractEvaluation { 
   
//   private Draw draw;
   
   public SimpleMaterialAndPositionalEvaluation() {
//      this.draw= Draw.getInstance();
   }

//      //Draw by three times repitition
//      if(position.isDrawByThreeTimesRepetition()) {
//         return Evaluation.DRAW_BY_THREE_TIMES_REPETITION;
//      }

   public int getOpeningGameScore(
         Position position) {
      
      int result= 0;
      
      // White
      
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
      
      for (Iterator it= new BitboardIterator(((position.getWhite().allPieces & ~(position.getWhite().kings | position.getWhite().queens )) & Board._CORE)); it.hasNext();) {
         it.next();
         result += Evaluation.POSITION_CORE_IN_OPENING_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getWhite().allPieces & ~(position.getWhite().kings | position.getWhite().queens )) & Board._INNER_BORDER)); it.hasNext();) {
         it.next();
         result += Evaluation.POSITION_INNER_BORDER_IN_OPENING_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getWhite().allPieces & ~(position.getWhite().kings | position.getWhite().queens )) & Board._MIDDLE_BORDER)); it.hasNext();) {
         it.next();
         result += Evaluation.POSITION_MIDDLE_BORDER_IN_OPENING_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getWhite().allPieces & ~(position.getWhite().kings | position.getWhite().queens )) & Board._OUTER_BORDER)); it.hasNext();) {
         it.next();
         result += Evaluation.POSITION_OUTER_BORDER_IN_OPENING_GAME;         
      }
      
      for (Iterator it= new BitboardIterator((position.getWhite().getAllCaptureMovesAttackedSquares() & position.getWhite().allPieces)); it.hasNext();) {
         it.next();
         result += Evaluation.POSITION_GUARD_REWARD_IN_OPENING_GAME;         
      }

      if( ((position.getWhite().kings ) & Board._KING_CENTER_SQUARES) != Square._EMPTY_BOARD ) {
         result += Evaluation.KING_CENTER_REWARD_IN_OPENING_GAME;         
      }

      if(position.getBlack().isInCheck()) {
         result += Evaluation.CHECK_REWARD_IN_OPENING_GAME;                  
      }
            

      // Black
      
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
      
      for (Iterator it= new BitboardIterator(((position.getBlack().allPieces & ~(position.getBlack().kings | position.getBlack().queens )) & Board._CORE)); it.hasNext();) {
         it.next();
         result -= Evaluation.POSITION_CORE_IN_OPENING_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getBlack().allPieces & ~(position.getBlack().kings | position.getBlack().queens )) & Board._INNER_BORDER)); it.hasNext();) {
         it.next();
         result -= Evaluation.POSITION_INNER_BORDER_IN_OPENING_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getBlack().allPieces & ~(position.getBlack().kings | position.getBlack().queens )) & Board._MIDDLE_BORDER)); it.hasNext();) {
         it.next();
         result -= Evaluation.POSITION_MIDDLE_BORDER_IN_OPENING_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getBlack().allPieces & ~(position.getBlack().kings | position.getBlack().queens )) & Board._OUTER_BORDER)); it.hasNext();) {
         it.next();
         result -= Evaluation.POSITION_OUTER_BORDER_IN_OPENING_GAME;         
      }
            
      for (Iterator it= new BitboardIterator((position.getBlack().getAllCaptureMovesAttackedSquares() & position.getBlack().allPieces)); it.hasNext();) {
         it.next();
         result -= Evaluation.POSITION_GUARD_REWARD_IN_OPENING_GAME;         
      }

      if( ((position.getBlack().kings ) & Board._KING_CENTER_SQUARES) != Square._EMPTY_BOARD ) {
         result -= Evaluation.KING_CENTER_REWARD_IN_OPENING_GAME;         
      }

      if(position.getWhite().isInCheck()) {
         result -= Evaluation.CHECK_REWARD_IN_OPENING_GAME;                  
      }
        
      return result;
   }

   public int getMiddleGameScore(
         Position position) {

      int result= 0;
      
      // White
      
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
      
      for (Iterator it= new BitboardIterator(((position.getWhite().allPieces & ~(position.getWhite().kings )) & Board._CORE)); it.hasNext();) {
         it.next();
         result += Evaluation.POSITION_CORE_IN_MIDDLE_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getWhite().allPieces & ~(position.getWhite().kings )) & Board._INNER_BORDER)); it.hasNext();) {
         it.next();
         result += Evaluation.POSITION_INNER_BORDER_IN_MIDDLE_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getWhite().allPieces & ~(position.getWhite().kings )) & Board._MIDDLE_BORDER)); it.hasNext();) {
         it.next();
         result += Evaluation.POSITION_MIDDLE_BORDER_IN_MIDDLE_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getWhite().allPieces & ~(position.getWhite().kings )) & Board._OUTER_BORDER)); it.hasNext();) {
         it.next();
         result += Evaluation.POSITION_OUTER_BORDER_IN_MIDDLE_GAME;         
      }
      
      for (Iterator it= new BitboardIterator((position.getWhite().getAllCaptureMovesAttackedSquares() & position.getWhite().allPieces)); it.hasNext();) {
         it.next();
         result += Evaluation.POSITION_GUARD_REWARD_IN_MIDDLE_GAME;         
      }

      if( ((position.getWhite().kings ) & Board._KING_CENTER_SQUARES) != Square._EMPTY_BOARD ) {
         result += Evaluation.KING_CENTER_REWARD_IN_OPENING_GAME;         
      }

      if(position.getBlack().isInCheck()) {
         result += Evaluation.CHECK_REWARD_IN_MIDDLE_GAME;                  
      }
            

      // Black
      
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
      
      for (Iterator it= new BitboardIterator(((position.getBlack().allPieces & ~(position.getBlack().kings )) & Board._CORE)); it.hasNext();) {
         it.next();
         result -= Evaluation.POSITION_CORE_IN_MIDDLE_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getBlack().allPieces & ~(position.getBlack().kings )) & Board._INNER_BORDER)); it.hasNext();) {
         it.next();
         result -= Evaluation.POSITION_INNER_BORDER_IN_MIDDLE_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getBlack().allPieces & ~(position.getBlack().kings )) & Board._MIDDLE_BORDER)); it.hasNext();) {
         it.next();
         result -= Evaluation.POSITION_MIDDLE_BORDER_IN_MIDDLE_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getBlack().allPieces & ~(position.getBlack().kings )) & Board._OUTER_BORDER)); it.hasNext();) {
         it.next();
         result -= Evaluation.POSITION_OUTER_BORDER_IN_MIDDLE_GAME;         
      }
      
      for (Iterator it= new BitboardIterator((position.getBlack().getAllCaptureMovesAttackedSquares() & position.getBlack().allPieces)); it.hasNext();) {
         it.next();
         result -= Evaluation.POSITION_GUARD_REWARD_IN_MIDDLE_GAME;         
      }
      
      if( ((position.getBlack().kings ) & Board._KING_CENTER_SQUARES) != Square._EMPTY_BOARD ) {
         result -= Evaluation.KING_CENTER_REWARD_IN_OPENING_GAME;         
      }
                  
      if(position.getWhite().isInCheck()) {
         result -= Evaluation.CHECK_REWARD_IN_MIDDLE_GAME;                  
      }
        
      return result;
   }


   public int getEndGameScore(
         Position position) {
      
      int result= 0;
      
      // White
      
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
      
      for (Iterator it= new BitboardIterator(((position.getWhite().allPieces ) & Board._CORE)); it.hasNext();) {
         it.next();
         result += Evaluation.POSITION_CORE_IN_END_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getWhite().allPieces ) & Board._INNER_BORDER)); it.hasNext();) {
         it.next();
         result += Evaluation.POSITION_INNER_BORDER_IN_END_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getWhite().allPieces ) & Board._MIDDLE_BORDER)); it.hasNext();) {
         it.next();
         result += Evaluation.POSITION_MIDDLE_BORDER_IN_END_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getWhite().allPieces ) & Board._OUTER_BORDER)); it.hasNext();) {
         it.next();
         result += Evaluation.POSITION_OUTER_BORDER_IN_END_GAME;         
      }

      for (Iterator it= new BitboardIterator(((position.getWhite().pawns ) & Rank._7)); it.hasNext();) {
         it.next();
         result += Evaluation.PAWN_TO_PROMOTE_IN_1_IN_END_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getWhite().pawns ) & Rank._6)); it.hasNext();) {
         it.next();
         result += Evaluation.PAWN_TO_PROMOTE_IN_2_IN_END_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getWhite().pawns ) & Rank._5)); it.hasNext();) {
         it.next();
         result += Evaluation.PAWN_TO_PROMOTE_IN_3_IN_END_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getWhite().pawns ) & Rank._4)); it.hasNext();) {
         it.next();
         result += Evaluation.PAWN_TO_PROMOTE_IN_4_IN_END_GAME;         
      }
      
      for (Iterator it= new BitboardIterator((position.getWhite().getAllCaptureMovesAttackedSquares() & position.getWhite().allPieces)); it.hasNext();) {
         it.next();
         result += Evaluation.POSITION_GUARD_REWARD_IN_END_GAME;         
      }

      if(position.getBlack().isInCheck()) {
         result += Evaluation.CHECK_REWARD_IN_END_GAME;                  
      }
            

      // Black
      
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
      
      for (Iterator it= new BitboardIterator(((position.getBlack().allPieces ) & Board._CORE)); it.hasNext();) {
         it.next();
         result -= Evaluation.POSITION_CORE_IN_END_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getBlack().allPieces ) & Board._INNER_BORDER)); it.hasNext();) {
         it.next();
         result -= Evaluation.POSITION_INNER_BORDER_IN_END_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getBlack().allPieces ) & Board._MIDDLE_BORDER)); it.hasNext();) {
         it.next();
         result -= Evaluation.POSITION_MIDDLE_BORDER_IN_END_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getBlack().allPieces ) & Board._OUTER_BORDER)); it.hasNext();) {
         it.next();
         result -= Evaluation.POSITION_OUTER_BORDER_IN_END_GAME;         
      }
      
      for (Iterator it= new BitboardIterator(((position.getBlack().pawns ) & Rank._2)); it.hasNext();) {
         it.next();
         result -= Evaluation.PAWN_TO_PROMOTE_IN_1_IN_END_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getBlack().pawns ) & Rank._3)); it.hasNext();) {
         it.next();
         result -= Evaluation.PAWN_TO_PROMOTE_IN_2_IN_END_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getBlack().pawns ) & Rank._4)); it.hasNext();) {
         it.next();
         result -= Evaluation.PAWN_TO_PROMOTE_IN_3_IN_END_GAME;         
      }
      for (Iterator it= new BitboardIterator(((position.getBlack().pawns ) & Rank._5)); it.hasNext();) {
         it.next();
         result -= Evaluation.PAWN_TO_PROMOTE_IN_4_IN_END_GAME;         
      }
                  
      for (Iterator it= new BitboardIterator((position.getBlack().getAllCaptureMovesAttackedSquares() & position.getBlack().allPieces)); it.hasNext();) {
         it.next();
         result -= Evaluation.POSITION_GUARD_REWARD_IN_END_GAME;         
      }

      if(position.getWhite().isInCheck()) {
         result -= Evaluation.CHECK_REWARD_IN_END_GAME;                  
      }
        
      return result;
   }
}
