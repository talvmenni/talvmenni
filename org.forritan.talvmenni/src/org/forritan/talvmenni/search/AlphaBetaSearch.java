package org.forritan.talvmenni.search;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.AbstractPosition;
import org.forritan.talvmenni.game.Position.Move;


public class AlphaBetaSearch implements Search {

   private Thinking  thinking;
   private DebugInfo debugInfo;
   private int       ply;

   private int       movesSearched;

   public AlphaBetaSearch() {
      this(
            0);
   }

   public AlphaBetaSearch(
         int ply) {
      this.ply= ply;
      this.thinking= new Thinking();
      this.debugInfo= new DebugInfo();
   }

   public void setPly(
         int ply) {
      this.ply= ply;
   }

   public Thinking getThinking() {
      return this.thinking;
   }

   public DebugInfo getDebugInfo() {
      return this.debugInfo;
   }

   public List getBestMoves(
         Position p,
         Evaluation e,
         boolean whiteMove) {

      long time= -System.currentTimeMillis();
      this.movesSearched= 0;

      int alpha= Integer.MIN_VALUE + 1;
      // Very important!!! Can't be
      // Integer.MIN_VALUE, because
      // Integer.MIN_VALUE ==
      // -Integer.MIN_VALUE
      // int beta= Integer.MAX_VALUE;
      // If checkmate there is no need to search further...
      int beta= Evaluation.CHECKMATE_SCORE;

      TupleScoreMoves result= this.alphaBeta(
            p,
            e,
            whiteMove,
            this.ply,
            alpha,
            beta);

      time+= System.currentTimeMillis();

      this.debugInfo.postNodesPerSecond(
            time,
            this.movesSearched);
      this.debugInfo.postBestMoves(result.moves);

      return (result.moves.size() > 0 ? result.moves.subList(
            0,
            1) : result.moves);
   }

   private TupleScoreMoves alphaBeta(
         Position p,
         Evaluation e,
         boolean whiteMove,
         int ply,
         int alpha,
         int beta) {

      TupleScoreMoves result= null;

      if (ply == 0) {
         result= new TupleScoreMoves(
               new Integer((e.getScore(p) * (whiteMove ? 1 : -1))),
               new ArrayList());
      } else {
         List moves;
         TupleScoreMoves best= new TupleScoreMoves(
               new Integer(Integer.MIN_VALUE + 1),
               new ArrayList());

         if (whiteMove) {
            moves= p.getWhite().getPossibleMoves();
         } else {
            moves= p.getBlack().getPossibleMoves();
         }

         if (moves.size() > 0) {
            
            for (Iterator it= moves.iterator(); it.hasNext();) {
               Move move= (Move) it.next();
               if (best.score.intValue() >= beta) {
//                  this.debugInfo.postText("***break***");
                  break;
               }
               this.movesSearched++;

               int movesSearchedBefore= this.movesSearched;
               long moveTime= -System.currentTimeMillis();
               p= p.move(
                     move.from,
                     move.to);
               if (best.score.intValue() > alpha) {
                  alpha= best.score.intValue();
               }
               TupleScoreMoves value= alphaBeta(
                     p,
                     e,
                     !whiteMove,
                     ply - 1,
                     -beta,
                     -alpha);
               p.popMove();
               value.score= new Integer(value.score.intValue()
                     * -1);
               value.moves.add(
                     0,
                     move);
               moveTime+= System.currentTimeMillis();

               if (value.score.intValue() > best.score.intValue()) {
                  best= value;
                  if (whiteMove) {
                     p.getWhite().killerMove(
                           move);
                  } else {
                     p.getBlack().killerMove(
                           move);
                  }
                  if (ply == this.ply) {
                     this.debugInfo.postCurrentBestMove(
                           move,
                           best.score.intValue(),
                           (this.movesSearched - movesSearchedBefore));
                     this.thinking.postThinking(
                           ply,
                           (best.score.intValue() * (whiteMove ? 1 : -1)),
                           moveTime + 1,
                           (this.movesSearched - movesSearchedBefore),
                           best.moves.toString());
                  }
               }
            }

            p.getWhite().updatePossibleMovesOrdering();
            p.getBlack().updatePossibleMovesOrdering();

            result= best;
         } else {
            if (whiteMove ? p.getWhite().isChecked() : p.getBlack().isChecked()) {
               // Checkmate...
               result= new TupleScoreMoves(
                     new Integer(((-Evaluation.CHECKMATE_SCORE - ply))),
                     new ArrayList());
            } else {
               // Stalemate...
               result= new TupleScoreMoves(
                     new Integer(0),
                     new ArrayList());
            }
         }
      }

      return result;
   }
}