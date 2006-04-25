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

package org.forritan.talvmenni.strategy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.TheoryBook;
import org.forritan.talvmenni.knowledge.Position.Move;
import org.forritan.talvmenni.knowledge.evaluation.Evaluation;
import org.forritan.talvmenni.knowledge.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.masterworker.generic.Result;
import org.forritan.talvmenni.search.AlphaBetaSearch;
import org.forritan.talvmenni.search.PrincipalVariation;


public class SimpleOneLevelAlphaBetaParallelStrategy extends
      AbstractParallelStrategy {

   private static final long serialVersionUID = 1L;

   private SimpleOneLevelAlphaBetaMaster master;

   public SimpleOneLevelAlphaBetaParallelStrategy(
         int ply,
         TheoryBook book,
         PrincipalVariation pv) {
      super(
            ply,
            book,
            pv,
            new AlphaBetaSearch(
                  ply - 1),
            new SimpleMaterialAndPositionalEvaluation());

      try {
         this.master= new SimpleOneLevelAlphaBetaMaster();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }

   protected List<Move> search(
         Position position,
         boolean whiteToMove) {

      @SuppressWarnings("unused")
      int alpha= Integer.MIN_VALUE + 1;
      // Very important!!! Can't be
      // Integer.MIN_VALUE, because
      // Integer.MIN_VALUE ==
      // -Integer.MIN_VALUE
      // int beta= Integer.MAX_VALUE;
      // If checkmate there is no need to search further...
      @SuppressWarnings("unused")
      int beta= Evaluation.CHECKMATE_SCORE;

      this.master.position= position;
      this.master.whiteToMove= whiteToMove;
      this.master.ply= this.ply;

      this.master.run();

      List<Move> result= new ArrayList<Move>();
      result.add(this.master.bestResult.move);
      return result;

   }

   public static class SimpleOneLevelAlphaBetaMaster extends ChessEngineMaster {

      public int                           numberOfTasks;

      public Position                      position;
      public boolean                       whiteToMove;
      public int                           ply;

      public SimpleOneLevelAlphaBetaResult bestResult;

      public SimpleOneLevelAlphaBetaMaster() throws IOException,
            InterruptedException {
         super();
      }

      protected void generateTasks() {
         List moves;
         if (this.whiteToMove) {
            moves= this.position.getWhite().getPossibleMoves();
         } else {
            moves= this.position.getBlack().getPossibleMoves();
         }

         this.numberOfTasks= moves.size();
         if (this.numberOfTasks > 0) {
            for (Iterator it= moves.iterator(); it.hasNext();) {
               Move move= (Move) it.next();
               Position childPosition= this.position.move(
                     move).getImmutable();
               this.position.popMove();
               ChessEngineTask task= new SimpleOneLevelAlphaBetaTask(
                     childPosition,
                     move,
                     Boolean.valueOf(!this.whiteToMove),
                     new Integer(
                           this.ply));
               try {
                  this.writeTask(task);
               } catch (IOException e) {
                  e.printStackTrace();
               } catch (InterruptedException e) {
                  e.printStackTrace();
               }
            }
         }

      }

      protected void collectResults() {
         SimpleOneLevelAlphaBetaResult template= new SimpleOneLevelAlphaBetaResult();

         this.bestResult= null;
         for (int i= 0; i < this.numberOfTasks; i++) {
            SimpleOneLevelAlphaBetaResult result= null;
            try {
               result= (SimpleOneLevelAlphaBetaResult) this
                     .takeResult(template);
            } catch (IOException e) {
               e.printStackTrace();
            }
            if(result != null) {
               if (this.bestResult == null
                     || this.bestResult.score.intValue() > result.score.intValue()) {
                  this.bestResult= result;
               }
            }
         }
      }
   }

   public static class SimpleOneLevelAlphaBetaTask extends ChessEngineTask {
      
      private static final long serialVersionUID = 1L;

      public Position position;
      public Move     move;
      public Boolean  whiteToMove;
      public Integer  ply;

      public SimpleOneLevelAlphaBetaTask() {
      }

      public SimpleOneLevelAlphaBetaTask(
            Position position,
            Move move,
            Boolean whiteToMove,
            Integer ply) {
         this.position= position;
         this.move= move;
         this.whiteToMove= whiteToMove;
         this.ply= ply;

         //TODO: throws NPE...
         //         
         //         this.worker.search.getPrincipalVariation().getThinking().addObserver(
         //               new Observer() {
         //                  public void update(
         //                        Observable o,
         //                        Object arg) {
         //                     if (arg instanceof String) {
         //                        System.out.println((String) arg);
         //                     }
         //                  }
         //               });
      }

      public Move getMove() {
         return this.move;
      }

      public Result execute() {

         int alpha= Integer.MIN_VALUE + 1;
         // Very important!!! Can't be
         // Integer.MIN_VALUE, because
         // Integer.MIN_VALUE ==
         // -Integer.MIN_VALUE

         int beta= Integer.MAX_VALUE;
         // If checkmate there is no need to search further...
         // int beta= Evaluation.CHECKMATE_SCORE;

         int score= ((AlphaBetaSearch) this.worker.getSearch()).alphaBeta(
               position,
               this.worker.evaluation,
               this.whiteToMove.booleanValue(),
               this.ply.intValue(),
               alpha,
               beta);

         @SuppressWarnings("unused")
         List bestMoves= this.worker.getSearch().getBestMoves(
               this.position,
               this.worker.evaluation,
               this.whiteToMove.booleanValue());
         SimpleOneLevelAlphaBetaResult result= new SimpleOneLevelAlphaBetaResult();

         result.score= new Integer(
               score);
         result.move= this.move;
         result.principalVariation= this.worker.getSearch().getPrincipalVariation()
               .getCurrentBestLine();
         return result;

      }
   }

   public static class SimpleOneLevelAlphaBetaResult extends Result {

      private static final long serialVersionUID = 1L;

      public Integer score;
      public Move    move;
      public List    principalVariation;

      public SimpleOneLevelAlphaBetaResult() {
      }
   }
}