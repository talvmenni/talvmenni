package org.forritan.talvmenni.strategy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.forritan.talvmenni.knowledge.Draw;
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
               this.writeTask(task);
            }
         }

      }

      protected void collectResults() {
         SimpleOneLevelAlphaBetaResult template= new SimpleOneLevelAlphaBetaResult();

         this.bestResult= null;
         for (int i= 0; i < this.numberOfTasks; i++) {
            SimpleOneLevelAlphaBetaResult result= (SimpleOneLevelAlphaBetaResult) this
                  .takeResult(template);
            if (this.bestResult == null
                  || this.bestResult.score.intValue() > result.score.intValue()) {
               this.bestResult= result;
            }
         }
      }
   }

   public static class SimpleOneLevelAlphaBetaTask extends ChessEngineTask {
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
         SimpleOneLevelAlphaBetaResult result= new SimpleOneLevelAlphaBetaResult();

         result.score= new Integer(
               score);
         result.move= this.move;
         result.principalVariation= this.worker.search.getPrincipalVariation()
               .getCurrentBestLine();
         return result;

      }
   }

   public static class SimpleOneLevelAlphaBetaResult extends Result {

      public Integer score;
      public Move    move;
      public List    principalVariation;

      public SimpleOneLevelAlphaBetaResult() {
      }
   }
}