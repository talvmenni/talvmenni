package org.forritan.talvmenni.evaluation;

import java.util.Iterator;

import org.forritan.talvmenni.knowledge.ImmutablePosition;
import org.forritan.talvmenni.knowledge.Position;

public class SimpleMaterialEvaluation implements Evaluation { 

   public int getScore(
         Position position) {
      int result= 0;
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
      
      return result;
   }
}
