package org.forritan.talvmenni.search;

import java.util.ArrayList;
import java.util.List;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.game.MTDfTransposition;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.AbstractPosition;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.util.ThreeTuple;
import org.forritan.util.Tuple;


public class MTDfSearch implements Search {

   private Thinking          thinking;
   private DebugInfo         debugInfo;

   private MTDfTransposition transposition;
   private int               ply;

   private int               movesSearched;
   private int               transpositionHits;

   public MTDfSearch(
         MTDfTransposition transposition) {
      this(
            0,
            transposition);
   }

   public MTDfSearch(
         int ply,
         MTDfTransposition transposition) {
      this.thinking= new Thinking();
      this.debugInfo= new DebugInfo();
      this.ply= ply;
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

      int f= 0;
      int d= this.ply;

      Tuple<Integer, List<Move>> result= this.mtdf(
            p,
            e,
            whiteMove,
            f,
            d);

      time+= System.currentTimeMillis();

      this.debugInfo.postNodesPerSecond(
            time,
            this.movesSearched);
      this.debugInfo.postBestMoves(result.b.size() > 0 ? result.b.subList(
            0,
            1) : result.b);

      return (result.b.size() > 0 ? result.b.subList(
            0,
            1) : result.b);
   }

   /**
    * MTD(f). See http://www.cs.vu.nl/~aske/mtdf.html
    * 
    * @param p
    * @param e
    * @param whiteMove
    * @param f
    * @param d
    * @return
    */

   private Tuple<Integer, List<Move>> mtdf(
         Position p,
         Evaluation e,
         boolean whiteMove,
         int f,
         int d) {

      Tuple<Integer, List<Move>> g= new Tuple<Integer, List<Move>>(
            Integer.valueOf(f),
            new ArrayList<Move>());

      int lowerbound= Integer.MIN_VALUE + 1;
      // Very important!!! Can't be
      // Integer.MIN_VALUE, because
      // Integer.MIN_VALUE ==
      // -Integer.MIN_VALUE
      int upperbound= Integer.MAX_VALUE;

      do {
         int beta;
         if (g.a.intValue() == lowerbound) {
            beta= g.a.intValue() + 1;
         } else {
            beta= g.a.intValue();
         }

         g= this.alphaBetaWithMemory(
               p,
               e,
               whiteMove,
               d,
               beta - 1,
               beta);

         if (g.a.intValue() < beta) {
            upperbound= g.a.intValue();
         } else {
            lowerbound= g.a.intValue();
         }
      } while (lowerbound < upperbound);

      return g;
   }

   private Tuple<Integer, List<Move>> alphaBetaWithMemory(
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
         Tuple<ThreeTuple<Integer, Integer, List<Move>>, Tuple<Integer, Integer>> entry= this.transposition
               .get(
                     p,
                     whiteMove);

         if (entry.b.a.intValue() >= beta)

         if (entry.a.a.intValue() >= ply) {
            this.transpositionHits++;
            List<Move> moves= new ArrayList<Move>();
            moves.addAll(entry.a.c);
            return new Tuple<Integer, List<Move>>(
                  entry.a.b,
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
               if (best.a.intValue() >= beta) break;
               this.movesSearched++;

               int movesSearchedBefore= this.movesSearched;
               long moveTime= -System.currentTimeMillis();
               p= p.move(
                     move.from,
                     move.to);
               if (best.a.intValue() > alpha) {
                  alpha= best.a.intValue();
               }
               Tuple<Integer, List<Move>> value= alphaBetaWithMemory(
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

            p.getWhite().updatePossibleMovesOrdering();
            p.getBlack().updatePossibleMovesOrdering();

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

//      this.transposition.update(
//            p,
//            whiteMove,
//            result.b,
//            result.a.intValue(),
//            ply
//            );

      return result;
   }
}