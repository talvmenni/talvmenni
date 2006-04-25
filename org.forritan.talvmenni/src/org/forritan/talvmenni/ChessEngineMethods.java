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

package org.forritan.talvmenni;

import java.util.Iterator;
import java.util.List;

import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Position.Move;


public class ChessEngineMethods {

   public static long perft(
         Position p,
         boolean whiteMove,
         int ply) {
      if(ply < 1) {
         return -1L;
      }
      if (ply == 1) {
         if (whiteMove) {
            return p.getWhite().getPossibleMoves().size();
         } else {
            return p.getBlack().getPossibleMoves().size();
         }
      } else {
         long result= 0;
         List moves;
         if (whiteMove) {
            moves= p.getWhite().getPossibleMoves();
         } else {
            moves= p.getBlack().getPossibleMoves();
         }
         
         for (Iterator it= moves.iterator();it.hasNext();) {
            Move move= (Move)it.next();
            result+= ChessEngineMethods.perft(
                  p.move(move),
                  !whiteMove,
                  ply - 1);
            p.popMove();
         }
         return result;
      }

   }
   
   public static String perftm(
         Position p,
         boolean whiteMove,
         int ply) {
      StringBuffer buffer= new StringBuffer();
    
      if(ply < 1) {
         return "ply must be 1 or larger...";
      }
      
      long totalPerft= 0;
      int moveNumber= 0;
      List moves;
      if(whiteMove){
         moves= p.getWhite().getPossibleMoves();
      } else {
         moves= p.getWhite().getPossibleMoves();         
      }
            
      buffer.append("perftm ").append(ply).append(" (").append(moves.size()).append(" moves) =").append("\n");      
      for(Iterator it= moves.iterator(); it.hasNext();) {
         Move move= (Move) it.next();
         long perftForMove= perft(p.move(move), !whiteMove, ply-1);
         buffer.append(moveNumber).append(" ").append(move).append(" : ").append(perftForMove).append("\n");
         moveNumber++;
         totalPerft += perftForMove;
      }
      
      buffer.append("Total: ").append(totalPerft).append("\n");
      return buffer.toString();
      
   }

}
