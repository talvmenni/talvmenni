package org.forritan.talvmenni.bitboard.knowledge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.knowledge.HistoryHeuristic;
import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Position.Move;


public class HistoryHeuristicTest extends TestCase {

   public void testSingleton() {
      Assert.assertNotNull(HistoryHeuristic.getInstance());
   }

   public void testGetAndUpdate() {
      HistoryHeuristic hh= HistoryHeuristic.getInstance();
      Move a2a3= new Move(Square._A2, Square._A3, Position.PromotionPiece.NONE);
      
      assertFalse(hh.containsMove(a2a3));
      assertNull(hh.get(a2a3));
      
      hh.updateWithSufficient(a2a3, 0);

      assertTrue(hh.containsMove(a2a3));
      Integer weight= hh.get(a2a3); 
      assertNotNull(weight);
      
      assertEquals(1, weight.intValue());

      hh.updateWithSufficient(a2a3, 0);
      assertEquals(2, hh.get(a2a3).intValue());

      hh.updateWithSufficient(a2a3, 1);
      assertEquals(4, hh.get(a2a3).intValue());

      hh.updateWithSufficient(a2a3, 3);
      assertEquals(12, hh.get(a2a3).intValue());     
   }
   
   public void testSort() {
      HistoryHeuristic hh= HistoryHeuristic.getInstance();
      
      List originalMoveList= new ArrayList();

      Move e2e4= new Move(Square._E2, Square._E4, Position.PromotionPiece.NONE);
      Move b1b5= new Move(Square._B1, Square._B5, Position.PromotionPiece.NONE);
      Move c3d4= new Move(Square._C3, Square._D4, Position.PromotionPiece.NONE);
      Move h6f7= new Move(Square._H6, Square._F7, Position.PromotionPiece.NONE);
      Move d2g2= new Move(Square._D2, Square._G2, Position.PromotionPiece.NONE);
      
      originalMoveList.add(e2e4);
      originalMoveList.add(b1b5);
      originalMoveList.add(c3d4);
      originalMoveList.add(h6f7);
      originalMoveList.add(d2g2);
      
      List moveList= new ArrayList();
      moveList.addAll(originalMoveList);
      
      moveList= hh.sort(moveList);      
      assertEquals(originalMoveList, moveList);
      
      hh.updateWithSufficient(b1b5, 4);
      hh.updateWithSufficient(h6f7, 5);
      hh.updateWithSufficient(d2g2, 3);
      moveList= hh.sort(moveList);      

      List expectedMoveList= new ArrayList();
      expectedMoveList.add(h6f7);
      expectedMoveList.add(b1b5);
      expectedMoveList.add(d2g2);
      expectedMoveList.add(e2e4);
      expectedMoveList.add(c3d4);

      assertEquals(expectedMoveList, moveList);
      
   }

}