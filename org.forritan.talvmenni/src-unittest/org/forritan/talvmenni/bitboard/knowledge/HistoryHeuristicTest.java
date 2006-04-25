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

package org.forritan.talvmenni.bitboard.knowledge;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.knowledge.HistoryHeuristic;
import org.forritan.talvmenni.knowledge.MutablePosition;
import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Position.Move;


public class HistoryHeuristicTest extends TestCase {

   public void testGetAndUpdate() {
      HistoryHeuristic hh= new HistoryHeuristic();
      Move a2a3= new Move(
            Square._A2,
            Square._A3,
            Position.PromotionPiece.NONE);

      assertFalse(hh.containsMove(a2a3));
      assertNull(hh.get(a2a3));

      hh.updateWithSufficient(
            a2a3,
            0);

      assertTrue(hh.containsMove(a2a3));
      Integer weight= hh.get(a2a3);
      assertNotNull(weight);

      assertEquals(
            1,
            weight.intValue());

      hh.updateWithSufficient(
            a2a3,
            0);
      assertEquals(
            2,
            hh.get(
                  a2a3).intValue());

      hh.updateWithSufficient(
            a2a3,
            1);
      assertEquals(
            4,
            hh.get(
                  a2a3).intValue());

      hh.updateWithSufficient(
            a2a3,
            3);
      assertEquals(
            12,
            hh.get(
                  a2a3).intValue());
   }

   public void testSortMoveList() throws IllegalArgumentException,
         SecurityException, InstantiationException, IllegalAccessException,
         InvocationTargetException, NoSuchMethodException {
      HistoryHeuristic hh= new HistoryHeuristic();
      hh.clear();

      Position.Bitboard whiteBoard= Position.Factory.createInitial(
            MutablePosition.class).getWhite();

      List<Move> originalMoveList= new ArrayList<Move>();

      originalMoveList.addAll(whiteBoard.getPossibleMoves());

      Move b1c3= new Move(
            Square._B1,
            Square._C3,
            Position.PromotionPiece.NONE);
      Move a2a3= new Move(
            Square._A2,
            Square._A3,
            Position.PromotionPiece.NONE);
      Move e2e4= new Move(
            Square._E2,
            Square._E4,
            Position.PromotionPiece.NONE);

      @SuppressWarnings("unused")
      Move a2a4= new Move(
            Square._A2,
            Square._A4,
            Position.PromotionPiece.NONE);
      @SuppressWarnings("unused")
      Move b2b3= new Move(
            Square._B2,
            Square._B3,
            Position.PromotionPiece.NONE);
      @SuppressWarnings("unused")
      Move b2b4= new Move(
            Square._B2,
            Square._B4,
            Position.PromotionPiece.NONE);

      hh.sortMoveList(whiteBoard);

      assertEquals(
            originalMoveList,
            whiteBoard.getPossibleMoves());

      hh.updateWithSufficient(
            b1c3,
            4);
      hh.updateWithSufficient(
            a2a3,
            3);
      hh.updateWithSufficient(
            e2e4,
            2);

      assertEquals(
            originalMoveList,
            whiteBoard.getPossibleMoves());

      hh.sortMoveList(whiteBoard);

      List<Move> orderedList= new ArrayList<Move>();
      orderedList.addAll(originalMoveList);
      orderedList.remove(b1c3);
      orderedList.remove(a2a3);
      orderedList.remove(e2e4);
      orderedList.add(
            0,
            e2e4);
      orderedList.add(
            0,
            a2a3);
      orderedList.add(
            0,
            b1c3);

      assertEquals(
            orderedList,
            whiteBoard.getPossibleMoves());
   }

}