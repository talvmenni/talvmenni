package org.forritan.talvmenni.strategy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.jini.core.entry.Entry;

import org.forritan.talvmenni.knowledge.Draw;
import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.TheoryBook;
import org.forritan.talvmenni.knowledge.Position.Move;
import org.forritan.talvmenni.knowledge.evaluation.Evaluation;
import org.forritan.talvmenni.knowledge.evaluation.SimpleMaterialAndPositionalEvaluation;
import org.forritan.talvmenni.masterworker.generic.Result;
import org.forritan.talvmenni.search.AlphaBetaSearch;
import org.forritan.talvmenni.search.PrincipalVariation;


public class ParallelIterativDeepeningAlphaBetaStrategy extends
      AbstractParallelStrategy {

   private ParallelIterativeDeepeningAlphaBetaMaster master;

   public ParallelIterativDeepeningAlphaBetaStrategy(
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
         this.master= new ParallelIterativeDeepeningAlphaBetaMaster();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }

   protected List search(
         Position position,
         boolean whiteToMove) {

      int alpha= Integer.MIN_VALUE + 1;
      // Very important!!! Can't be
      // Integer.MIN_VALUE, because
      // Integer.MIN_VALUE ==
      // -Integer.MIN_VALUE
      // int beta= Integer.MAX_VALUE;
      // If checkmate there is no need to search further...
      int beta= Evaluation.CHECKMATE_SCORE;

      this.master.position= position;
      this.master.whiteToMove= whiteToMove;
      this.master.ply= this.ply;

      this.master.run();

      List result= new ArrayList();
      result.add(this.master.bestResult.move);
      return result;

   }

   public static class ParallelIterativeDeepeningAlphaBetaMaster extends ChessEngineMaster {

      public int                           numberOfTasks;

      public Position                      position;
      public boolean                       whiteToMove;
      public int                           ply;

      public ParallelIterativeDeepeningAlphaBetaResult bestResult;

      public ParallelIterativeDeepeningAlphaBetaMaster() throws IOException,
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
               ChessEngineTask task= new ParallelIterativeDeepeningAlphaBetaTask(
                     childPosition,
                     move,
                     Boolean.valueOf(!this.whiteToMove),
                     new Integer(
                           this.ply));
               this.writeTask(task);
            }
         }

      }

      protected void collectResults() {
         ParallelIterativeDeepeningAlphaBetaResult template= new ParallelIterativeDeepeningAlphaBetaResult();

         this.bestResult= null;
         for (int i= 0; i < this.numberOfTasks; i++) {
            ParallelIterativeDeepeningAlphaBetaResult result= (ParallelIterativeDeepeningAlphaBetaResult) this
                  .takeResult(template);
            if (this.bestResult == null
                  || this.bestResult.score.intValue() > result.score.intValue()) {
               this.bestResult= result;
            }
         }
      }
   }

   public static class ParallelIterativeDeepeningAlphaBetaTask extends ChessEngineTask {
            
      public Position position;
      public Move     move;
      public Boolean  whiteToMove;
      public Integer  ply;
      public Integer  masterSearchedToPly;
      public Integer  workerStartSearchFromPly;
      public Integer  workerSearchedToPly;
      public String   lastWorkerId;
      public Boolean  lastWorkerIdNull;
      

      public ParallelIterativeDeepeningAlphaBetaTask() {
      }

      public ParallelIterativeDeepeningAlphaBetaTask(
            Position position,
            Move move,
            Boolean whiteToMove,
            Integer ply) {
         this.position= position;
         this.move= move;
         this.whiteToMove= whiteToMove;
         this.ply= ply;

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

         int score= ((AlphaBetaSearch) this.worker.search).alphaBeta(
               position,
               this.worker.evaluation,
               this.whiteToMove.booleanValue(),
               this.ply.intValue(),
               alpha,
               beta);

         List bestMoves= this.worker.search.getBestMoves(
               this.position,
               this.worker.evaluation,
               this.whiteToMove.booleanValue());
         ParallelIterativeDeepeningAlphaBetaResult result= new ParallelIterativeDeepeningAlphaBetaResult();

         result.score= new Integer(
               score);
         result.move= this.move;
         result.principalVariation= this.worker.search.getPrincipalVariation()
               .getCurrentBestLine();
         return result;

      }
   }

   public static class ParallelIterativeDeepeningAlphaBetaResult extends Result {
      
      public Integer ply;
      public Integer score;
      public Move    move;
      public List    principalVariation;

      public ParallelIterativeDeepeningAlphaBetaResult() {
      }
   }

   public static class AlphaBeta implements Entry {
            
      Integer ply;
      Integer alpha;
      Integer beta;
            
      public AlphaBeta() {
      }
      
   }

}