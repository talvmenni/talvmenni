package org.forritan.talvmenni.search;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.PositionFactory;
import org.forritan.talvmenni.game.Transposition;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.util.ThreeTuple;
import org.forritan.util.Tuple;


public class AlphaBetaWithTranspositionTableSearch implements Search {

   private Thinking      thinking;
   private DebugInfo     debugInfo;

   private Transposition transposition;
   private int           ply;
   private final boolean       useMoveOrdering;

   private int           movesSearched;
   private int           transpositionHits;

   public AlphaBetaWithTranspositionTableSearch(
         Transposition transposition,
         boolean useMoveOrdering) {
      this(
            0,
            transposition,
            useMoveOrdering);
   }

   public AlphaBetaWithTranspositionTableSearch(
         int ply,
         Transposition transposition,
         boolean useMoveOrdering) {
      this.thinking= new Thinking();
      this.debugInfo= new DebugInfo();
      this.ply= ply;
      this.useMoveOrdering= useMoveOrdering;
      this.transposition= transposition;
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

   public List<Move> getBestMoves(
         Position p,
         Evaluation e,
         boolean whiteMove) {

      long time= -System.currentTimeMillis();
      this.movesSearched= 0;
      this.transpositionHits= 0;

      int alpha= Integer.MIN_VALUE + 1;
      // Very important!!! Can't be
      // Integer.MIN_VALUE, because
      // Integer.MIN_VALUE ==
      // -Integer.MIN_VALUE
      int beta= Integer.MAX_VALUE;

      Tuple<Integer, List<Move>> result= this.alphaBeta(
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
      this.debugInfo.postBestMoves(result.b.size() > 0 ? result.b.subList(
            0,
            1) : result.b);
      this.debugInfo.postTranspositionHits(this.transpositionHits);

      return (result.b.size() > 0 ? result.b.subList(
            0,
            1) : result.b);
   }

   private Tuple<Integer, List<Move>> alphaBeta(
         Position p,
         Evaluation e,
         boolean whiteMove,
         int ply,
         int alpha,
         int beta) {

      Tuple<Integer, List<Move>> result= null;

      if (this.transposition.contains(
            p,
            whiteMove)) {
         ThreeTuple<Integer, Integer, List<Move>> entry= this.transposition
               .get(
                     p,
                     whiteMove);
         if (entry.a.intValue() >= ply) {
            this.transpositionHits++;
            List<Move> moves= new ArrayList<Move>();
            moves.addAll(entry.c);
            return new Tuple<Integer, List<Move>>(
                  entry.b,
                  moves);
         }
      }

      if (ply == 0) {
         result= new Tuple<Integer, List<Move>>(
               Integer.valueOf((e.getScore(p) * (whiteMove ? 1 : -1))),
               new ArrayList<Move>());
      } else {
         List<Move> moves;
         Tuple<Integer, List<Move>> best= new Tuple<Integer, List<Move>>(
               Integer.valueOf(Integer.MIN_VALUE + 1),
               new ArrayList<Move>());

         if (whiteMove) {
            moves= p.getWhite().getPossibleMoves();
         } else {
            moves= p.getBlack().getPossibleMoves();
         }

         if (moves.size() > 0) {
            for (Move move : moves) {
               if (best.a.intValue() >= beta) {
                  break;
               }
               this.movesSearched++;

               int movesSearchedBefore= this.movesSearched;
               long moveTime= -System.currentTimeMillis();
               p= p.move(
                     move.from,
                     move.to);
               if (best.a.intValue() > alpha) {
                  alpha= best.a.intValue();
               }
               Tuple<Integer, List<Move>> value= alphaBeta(
                     p,
                     e,
                     !whiteMove,
                     ply - 1,
                     -beta,
                     -alpha);
               p.popMove();
               value.a= Integer.valueOf(value.a.intValue()
                     * -1);
               value.b.add(
                     0,
                     move);
               moveTime+= System.currentTimeMillis();

               if (value.a.intValue() > best.a.intValue()) {
                  best= value;
                  if (this.useMoveOrdering) {
                     if (whiteMove) {
                        p.getWhite().killerMove(
                              move);
                     } else {
                        p.getBlack().killerMove(
                              move);
                     }
                  }
                  if (ply == this.ply) {
                     this.debugInfo.postCurrentBestMove(
                           move,
                           best.a.intValue(),
                           (this.movesSearched - movesSearchedBefore));
                     this.thinking.postThinking(
                           ply,
                           (best.a.intValue() * (whiteMove ? 1 : -1)),
                           moveTime + 1,
                           (this.movesSearched - movesSearchedBefore),
                           best.b.toString());
                  }
               }
            }

            if (this.useMoveOrdering) {
               p.getWhite().updatePossibleMovesOrdering();
               p.getBlack().updatePossibleMovesOrdering();
            }

            result= best;
         } else {
            if (whiteMove ? p.getWhite().isChecked() : p.getBlack().isChecked()) {
               // Checkmate...
               result= new Tuple<Integer, List<Move>>(
                     Integer.valueOf(((-20000 - ply))),
                     new ArrayList<Move>());
            } else {
               // Stalemate...
               result= new Tuple<Integer, List<Move>>(
                     Integer.valueOf(0),
                     new ArrayList<Move>());
            }
         }
      }

      this.transposition.update(
            p,
            whiteMove,
            result.b,
            result.a.intValue(),
            ply);

      return result;
   }
}