package org.forritan.talvmenni.knowledge.evaluation;

import java.util.Iterator;
import org.forritan.talvmenni.bitboard.BitboardIterator;
import org.forritan.talvmenni.bitboard.evaluation.Board;
import org.forritan.talvmenni.knowledge.Position;


public class MaterialAndPositionalEvaluation implements Evaluation {

   public int getScore(
         Position position) {
      int result= 0;

      //Eyðun
      // For h....... $#¤@¤%& !!!!
      //      int KING= 11180;
      //      int QUEEN= 980;
      //      int ROOK= 520;
      //      int BISHOP= 330;
      //      int KNIGHT= 330;
      //      int PAWN= 100;
      //
      //      int POSITION_CORE= 20;
      //      int POSITION_INNER_BORDER= 16;
      //      int POSITION_MIDDLE_BORDER= 14;
      //      int POSITION_OUTER_BORDER= 12;
      //      int POSITION_GUARD_REWARD= 10;
      //      int CHECK_REWARD = 30;

      // White

      for (Iterator it= position.getWhite().kingsIterator(); it.hasNext();) {
         it.next();
         result+= KING;
      }
      for (Iterator it= position.getWhite().queensIterator(); it.hasNext();) {
         it.next();
         result+= QUEEN;
      }
      for (Iterator it= position.getWhite().rooksIterator(); it.hasNext();) {
         it.next();
         result+= ROOK;
      }
      for (Iterator it= position.getWhite().bishopsIterator(); it.hasNext();) {
         it.next();
         result+= BISHOP;
      }
      for (Iterator it= position.getWhite().knightsIterator(); it.hasNext();) {
         it.next();
         result+= KNIGHT;
      }
      for (Iterator it= position.getWhite().pawnsIterator(); it.hasNext();) {
         it.next();
         result+= PAWN;
      }

      for (Iterator it= new BitboardIterator(
            ((position.getWhite().allPieces & ~(position.getWhite().kings | position
                  .getWhite().queens)) & Board._CORE)); it.hasNext();) {
         it.next();
         result+= POSITION_CORE;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getWhite().allPieces & ~(position.getWhite().kings | position
                  .getWhite().queens)) & Board._INNER_BORDER)); it.hasNext();) {
         it.next();
         result+= POSITION_INNER_BORDER;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getWhite().allPieces & ~(position.getWhite().kings | position
                  .getWhite().queens)) & Board._MIDDLE_BORDER)); it.hasNext();) {
         it.next();
         result+= POSITION_MIDDLE_BORDER;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getWhite().allPieces & ~(position.getWhite().kings | position
                  .getWhite().queens)) & Board._OUTER_BORDER)); it.hasNext();) {
         it.next();
         result+= POSITION_OUTER_BORDER;
      }

      for (Iterator it= new BitboardIterator(
            (position.getWhite().getAllCaptureMovesAttackedSquares() & position
                  .getWhite().allPieces)); it.hasNext();) {
         it.next();
         result+= POSITION_GUARD_REWARD;
      }

      if (position.getBlack().isChecked()) {
         result+= CHECK_REWARD;
      }

      // Black

      for (Iterator it= position.getBlack().kingsIterator(); it.hasNext();) {
         it.next();
         result-= KING;
      }
      for (Iterator it= position.getBlack().queensIterator(); it.hasNext();) {
         it.next();
         result-= QUEEN;
      }
      for (Iterator it= position.getBlack().rooksIterator(); it.hasNext();) {
         it.next();
         result-= ROOK;
      }
      for (Iterator it= position.getBlack().bishopsIterator(); it.hasNext();) {
         it.next();
         result-= BISHOP;
      }
      for (Iterator it= position.getBlack().knightsIterator(); it.hasNext();) {
         it.next();
         result-= KNIGHT;
      }
      for (Iterator it= position.getBlack().pawnsIterator(); it.hasNext();) {
         it.next();
         result-= PAWN;
      }

      for (Iterator it= new BitboardIterator(
            ((position.getBlack().allPieces & ~(position.getBlack().kings | position
                  .getBlack().queens)) & Board._CORE)); it.hasNext();) {
         it.next();
         result-= POSITION_CORE;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getBlack().allPieces & ~(position.getBlack().kings | position
                  .getBlack().queens)) & Board._INNER_BORDER)); it.hasNext();) {
         it.next();
         result-= POSITION_INNER_BORDER;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getBlack().allPieces & ~(position.getBlack().kings | position
                  .getBlack().queens)) & Board._MIDDLE_BORDER)); it.hasNext();) {
         it.next();
         result-= POSITION_MIDDLE_BORDER;
      }
      for (Iterator it= new BitboardIterator(
            ((position.getBlack().allPieces & ~(position.getBlack().kings | position
                  .getBlack().queens)) & Board._OUTER_BORDER)); it.hasNext();) {
         it.next();
         result-= POSITION_OUTER_BORDER;
      }

      for (Iterator it= new BitboardIterator(
            (position.getBlack().getAllCaptureMovesAttackedSquares() & position
                  .getBlack().allPieces)); it.hasNext();) {
         it.next();
         result-= POSITION_GUARD_REWARD;
      }

      if (position.getWhite().isChecked()) {
         result-= CHECK_REWARD;
      }

      return result;
   }
}