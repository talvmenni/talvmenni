package org.forritan.talvmenni.knowledge.evaluation;

import java.util.Iterator;

import org.forritan.talvmenni.bitboard.BitboardIterator;
import org.forritan.talvmenni.bitboard.evaluation.Board;
import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Position.Bitboard;


public class MaterialAndPositionalEvaluation extends AbstractEvaluation {

   public int getOpeningGameScore(
         Position position) {
      int result= 0;
   
      // White
   
      for (Iterator it= position.getWhite().kingsIterator(); it.hasNext();) {
         it.next();
         result+= KING_IN_OPENING_GAME;
      }
      for (Iterator it= position.getWhite().queensIterator(); it.hasNext();) {
         it.next();
         result+= QUEEN_IN_OPENING_GAME;
      }
      for (Iterator it= position.getWhite().rooksIterator(); it.hasNext();) {
         it.next();
         result+= ROOK_IN_OPENING_GAME;
      }
      for (Iterator it= position.getWhite().bishopsIterator(); it.hasNext();) {
         it.next();
         result+= BISHOP_IN_OPENING_GAME;
      }
      for (Iterator it= position.getWhite().knightsIterator(); it.hasNext();) {
         it.next();
         result+= KNIGHT_IN_OPENING_GAME;
      }
      for (Iterator it= position.getWhite().pawnsIterator(); it.hasNext();) {
         it.next();
         result+= PAWN_IN_OPENING_GAME;
      }
   
      for (Iterator it= new BitboardIterator(
            ((position.getWhite().allPieces & ~(position.getWhite().kings | position
                  .getWhite().queens)) & Board._CORE)); it.hasNext();) {
         it.next();
         result+= POSITION_CORE_IN_OPENING_GAME;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getWhite().allPieces & ~(position.getWhite().kings | position
                  .getWhite().queens)) & Board._INNER_BORDER)); it.hasNext();) {
         it.next();
         result+= POSITION_INNER_BORDER_IN_OPENING_GAME;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getWhite().allPieces & ~(position.getWhite().kings | position
                  .getWhite().queens)) & Board._MIDDLE_BORDER)); it.hasNext();) {
         it.next();
         result+= POSITION_MIDDLE_BORDER_IN_OPENING_GAME;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getWhite().allPieces & ~(position.getWhite().kings | position
                  .getWhite().queens)) & Board._OUTER_BORDER)); it.hasNext();) {
         it.next();
         result+= POSITION_OUTER_BORDER_IN_OPENING_GAME;
      }
   
      for (Iterator it= new BitboardIterator(
            (position.getWhite().getAllCaptureMovesAttackedSquares() & position
                  .getWhite().allPieces)); it.hasNext();) {
         it.next();
         result+= POSITION_GUARD_REWARD_IN_OPENING_GAME;
      }
   
      if (position.getBlack().isInCheck()) {
         result+= CHECK_REWARD_IN_OPENING_GAME;
      }
   
      // Black
   
      for (Iterator it= position.getBlack().kingsIterator(); it.hasNext();) {
         it.next();
         result-= KING_IN_OPENING_GAME;
      }
      for (Iterator it= position.getBlack().queensIterator(); it.hasNext();) {
         it.next();
         result-= QUEEN_IN_OPENING_GAME;
      }
      for (Iterator it= position.getBlack().rooksIterator(); it.hasNext();) {
         it.next();
         result-= ROOK_IN_OPENING_GAME;
      }
      for (Iterator it= position.getBlack().bishopsIterator(); it.hasNext();) {
         it.next();
         result-= BISHOP_IN_OPENING_GAME;
      }
      for (Iterator it= position.getBlack().knightsIterator(); it.hasNext();) {
         it.next();
         result-= KNIGHT_IN_OPENING_GAME;
      }
      for (Iterator it= position.getBlack().pawnsIterator(); it.hasNext();) {
         it.next();
         result-= PAWN_IN_OPENING_GAME;
      }
   
      for (Iterator it= new BitboardIterator(
            ((position.getBlack().allPieces & ~(position.getBlack().kings | position
                  .getBlack().queens)) & Board._CORE)); it.hasNext();) {
         it.next();
         result-= POSITION_CORE_IN_OPENING_GAME;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getBlack().allPieces & ~(position.getBlack().kings | position
                  .getBlack().queens)) & Board._INNER_BORDER)); it.hasNext();) {
         it.next();
         result-= POSITION_INNER_BORDER_IN_OPENING_GAME;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getBlack().allPieces & ~(position.getBlack().kings | position
                  .getBlack().queens)) & Board._MIDDLE_BORDER)); it.hasNext();) {
         it.next();
         result-= POSITION_MIDDLE_BORDER_IN_OPENING_GAME;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getBlack().allPieces & ~(position.getBlack().kings | position
                  .getBlack().queens)) & Board._OUTER_BORDER)); it.hasNext();) {
         it.next();
         result-= POSITION_OUTER_BORDER_IN_OPENING_GAME;
      }
   
      for (Iterator it= new BitboardIterator(
            (position.getBlack().getAllCaptureMovesAttackedSquares() & position
                  .getBlack().allPieces)); it.hasNext();) {
         it.next();
         result-= POSITION_GUARD_REWARD_IN_OPENING_GAME;
      }
   
      if (position.getWhite().isInCheck()) {
         result-= CHECK_REWARD_IN_OPENING_GAME;
      }
   
      return result;
   }
     
   public int getMiddleGameScore(
         Position position) {
      int result= 0;
   
      // White
   
      for (Iterator it= position.getWhite().kingsIterator(); it.hasNext();) {
         it.next();
         result+= KING_IN_MIDDLE_GAME;
      }
      for (Iterator it= position.getWhite().queensIterator(); it.hasNext();) {
         it.next();
         result+= QUEEN_IN_MIDDLE_GAME;
      }
      for (Iterator it= position.getWhite().rooksIterator(); it.hasNext();) {
         it.next();
         result+= ROOK_IN_MIDDLE_GAME;
      }
      for (Iterator it= position.getWhite().bishopsIterator(); it.hasNext();) {
         it.next();
         result+= BISHOP_IN_MIDDLE_GAME;
      }
      for (Iterator it= position.getWhite().knightsIterator(); it.hasNext();) {
         it.next();
         result+= KNIGHT_IN_MIDDLE_GAME;
      }
      for (Iterator it= position.getWhite().pawnsIterator(); it.hasNext();) {
         it.next();
         result+= PAWN_IN_MIDDLE_GAME;
      }
   
      for (Iterator it= new BitboardIterator(
            ((position.getWhite().allPieces & ~(position.getWhite().kings | position
                  .getWhite().queens)) & Board._CORE)); it.hasNext();) {
         it.next();
         result+= POSITION_CORE_IN_MIDDLE_GAME;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getWhite().allPieces & ~(position.getWhite().kings | position
                  .getWhite().queens)) & Board._INNER_BORDER)); it.hasNext();) {
         it.next();
         result+= POSITION_INNER_BORDER_IN_MIDDLE_GAME;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getWhite().allPieces & ~(position.getWhite().kings | position
                  .getWhite().queens)) & Board._MIDDLE_BORDER)); it.hasNext();) {
         it.next();
         result+= POSITION_MIDDLE_BORDER_IN_MIDDLE_GAME;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getWhite().allPieces & ~(position.getWhite().kings | position
                  .getWhite().queens)) & Board._OUTER_BORDER)); it.hasNext();) {
         it.next();
         result+= POSITION_OUTER_BORDER_IN_MIDDLE_GAME;
      }
   
      for (Iterator it= new BitboardIterator(
            (position.getWhite().getAllCaptureMovesAttackedSquares() & position
                  .getWhite().allPieces)); it.hasNext();) {
         it.next();
         result+= POSITION_GUARD_REWARD_IN_MIDDLE_GAME;
      }
   
      if (position.getBlack().isInCheck()) {
         result+= CHECK_REWARD_IN_MIDDLE_GAME;
      }
   
      // Black
   
      for (Iterator it= position.getBlack().kingsIterator(); it.hasNext();) {
         it.next();
         result-= KING_IN_MIDDLE_GAME;
      }
      for (Iterator it= position.getBlack().queensIterator(); it.hasNext();) {
         it.next();
         result-= QUEEN_IN_MIDDLE_GAME;
      }
      for (Iterator it= position.getBlack().rooksIterator(); it.hasNext();) {
         it.next();
         result-= ROOK_IN_MIDDLE_GAME;
      }
      for (Iterator it= position.getBlack().bishopsIterator(); it.hasNext();) {
         it.next();
         result-= BISHOP_IN_MIDDLE_GAME;
      }
      for (Iterator it= position.getBlack().knightsIterator(); it.hasNext();) {
         it.next();
         result-= KNIGHT_IN_MIDDLE_GAME;
      }
      for (Iterator it= position.getBlack().pawnsIterator(); it.hasNext();) {
         it.next();
         result-= PAWN_IN_MIDDLE_GAME;
      }
   
      for (Iterator it= new BitboardIterator(
            ((position.getBlack().allPieces & ~(position.getBlack().kings | position
                  .getBlack().queens)) & Board._CORE)); it.hasNext();) {
         it.next();
         result-= POSITION_CORE_IN_MIDDLE_GAME;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getBlack().allPieces & ~(position.getBlack().kings | position
                  .getBlack().queens)) & Board._INNER_BORDER)); it.hasNext();) {
         it.next();
         result-= POSITION_INNER_BORDER_IN_MIDDLE_GAME;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getBlack().allPieces & ~(position.getBlack().kings | position
                  .getBlack().queens)) & Board._MIDDLE_BORDER)); it.hasNext();) {
         it.next();
         result-= POSITION_MIDDLE_BORDER_IN_MIDDLE_GAME;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getBlack().allPieces & ~(position.getBlack().kings | position
                  .getBlack().queens)) & Board._OUTER_BORDER)); it.hasNext();) {
         it.next();
         result-= POSITION_OUTER_BORDER_IN_MIDDLE_GAME;
      }
   
      for (Iterator it= new BitboardIterator(
            (position.getBlack().getAllCaptureMovesAttackedSquares() & position
                  .getBlack().allPieces)); it.hasNext();) {
         it.next();
         result-= POSITION_GUARD_REWARD_IN_MIDDLE_GAME;
      }
   
      if (position.getWhite().isInCheck()) {
         result-= CHECK_REWARD_IN_MIDDLE_GAME;
      }
   
      return result;
   }

   public int getEndGameScore(
         Position position) {
      int result= 0;
   
      // White
   
      for (Iterator it= position.getWhite().kingsIterator(); it.hasNext();) {
         it.next();
         result+= KING_IN_END_GAME;
      }
      for (Iterator it= position.getWhite().queensIterator(); it.hasNext();) {
         it.next();
         result+= QUEEN_IN_END_GAME;
      }
      for (Iterator it= position.getWhite().rooksIterator(); it.hasNext();) {
         it.next();
         result+= ROOK_IN_END_GAME;
      }
      for (Iterator it= position.getWhite().bishopsIterator(); it.hasNext();) {
         it.next();
         result+= BISHOP_IN_END_GAME;
      }
      for (Iterator it= position.getWhite().knightsIterator(); it.hasNext();) {
         it.next();
         result+= KNIGHT_IN_END_GAME;
      }
      for (Iterator it= position.getWhite().pawnsIterator(); it.hasNext();) {
         it.next();
         result+= PAWN_IN_END_GAME;
      }
   
      for (Iterator it= new BitboardIterator(
            ((position.getWhite().allPieces & ~(position.getWhite().kings | position
                  .getWhite().queens)) & Board._CORE)); it.hasNext();) {
         it.next();
         result+= POSITION_CORE_IN_END_GAME;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getWhite().allPieces & ~(position.getWhite().kings | position
                  .getWhite().queens)) & Board._INNER_BORDER)); it.hasNext();) {
         it.next();
         result+= POSITION_INNER_BORDER_IN_END_GAME;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getWhite().allPieces & ~(position.getWhite().kings | position
                  .getWhite().queens)) & Board._MIDDLE_BORDER)); it.hasNext();) {
         it.next();
         result+= POSITION_MIDDLE_BORDER_IN_END_GAME;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getWhite().allPieces & ~(position.getWhite().kings | position
                  .getWhite().queens)) & Board._OUTER_BORDER)); it.hasNext();) {
         it.next();
         result+= POSITION_OUTER_BORDER_IN_END_GAME;
      }
   
      for (Iterator it= new BitboardIterator(
            (position.getWhite().getAllCaptureMovesAttackedSquares() & position
                  .getWhite().allPieces)); it.hasNext();) {
         it.next();
         result+= POSITION_GUARD_REWARD_IN_END_GAME;
      }
   
      if (position.getBlack().isInCheck()) {
         result+= CHECK_REWARD_IN_END_GAME;
      }
   
      // Black
   
      for (Iterator it= position.getBlack().kingsIterator(); it.hasNext();) {
         it.next();
         result-= KING_IN_END_GAME;
      }
      for (Iterator it= position.getBlack().queensIterator(); it.hasNext();) {
         it.next();
         result-= QUEEN_IN_END_GAME;
      }
      for (Iterator it= position.getBlack().rooksIterator(); it.hasNext();) {
         it.next();
         result-= ROOK_IN_END_GAME;
      }
      for (Iterator it= position.getBlack().bishopsIterator(); it.hasNext();) {
         it.next();
         result-= BISHOP_IN_END_GAME;
      }
      for (Iterator it= position.getBlack().knightsIterator(); it.hasNext();) {
         it.next();
         result-= KNIGHT_IN_END_GAME;
      }
      for (Iterator it= position.getBlack().pawnsIterator(); it.hasNext();) {
         it.next();
         result-= PAWN_IN_END_GAME;
      }
   
      for (Iterator it= new BitboardIterator(
            ((position.getBlack().allPieces & ~(position.getBlack().kings | position
                  .getBlack().queens)) & Board._CORE)); it.hasNext();) {
         it.next();
         result-= POSITION_CORE_IN_END_GAME;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getBlack().allPieces & ~(position.getBlack().kings | position
                  .getBlack().queens)) & Board._INNER_BORDER)); it.hasNext();) {
         it.next();
         result-= POSITION_INNER_BORDER_IN_END_GAME;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getBlack().allPieces & ~(position.getBlack().kings | position
                  .getBlack().queens)) & Board._MIDDLE_BORDER)); it.hasNext();) {
         it.next();
         result-= POSITION_MIDDLE_BORDER_IN_END_GAME;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getBlack().allPieces & ~(position.getBlack().kings | position
                  .getBlack().queens)) & Board._OUTER_BORDER)); it.hasNext();) {
         it.next();
         result-= POSITION_OUTER_BORDER_IN_END_GAME;
      }
   
      for (Iterator it= new BitboardIterator(
            (position.getBlack().getAllCaptureMovesAttackedSquares() & position
                  .getBlack().allPieces)); it.hasNext();) {
         it.next();
         result-= POSITION_GUARD_REWARD_IN_END_GAME;
      }
   
      if (position.getWhite().isInCheck()) {
         result-= CHECK_REWARD_IN_END_GAME;
      }
   
      return result;
   }

}