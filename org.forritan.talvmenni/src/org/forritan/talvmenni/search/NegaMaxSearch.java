package org.forritan.talvmenni.search;

import java.util.ArrayList;
import java.util.List;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.PositionFactory;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.util.Tuple;


public class NegaMaxSearch implements Search {

   private Thinking  thinking;
   private DebugInfo debugInfo;
   private int       ply;

   private int       movesSearched;

   public NegaMaxSearch() {
      this(
            0);
   }

   public NegaMaxSearch(
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

   public List<Move> getBestMoves(
         Position p,
         Evaluation e,
         boolean whiteMove) {
      
      long time= -System.currentTimeMillis();
      this.movesSearched= 0;

      Tuple<Integer, List<Move>> result= this.negaMax(
            p,
            e,
            whiteMove,
            this.ply);
      
      time+= System.currentTimeMillis();
      
      this.debugInfo.postNodesPerSecond(
            time,
            this.movesSearched);
      this.debugInfo.postBestMoves(result.b);

      return (result.b.size() > 0 ? result.b.subList(
            0,
            1) : result.b);
   }

   private Tuple<Integer, List<Move>> negaMax(
         Position p,
         Evaluation e,
         boolean whiteMove,
         int ply) {

      Tuple<Integer, List<Move>> result= null;

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

               this.movesSearched++;

               int movesSearchedBefore= this.movesSearched;
               long moveTime= -System.currentTimeMillis();
               p= p.move(
                     move.from,
                     move.to);
               Tuple<Integer, List<Move>> value= negaMax(
                     p,
                     e,
                     !whiteMove,
                     ply - 1);
               p.popMove();
               value.a= Integer.valueOf(value.a.intValue()
                     * -1);
               value.b.add(
                     0,
                     move);
               moveTime+= System.currentTimeMillis();

               
               
               if (value.a.intValue() > best.a.intValue()) {
                  best= value;
                  if (ply == this.ply) {
                     this.debugInfo.postCurrentBestMove(
                           move,
                           best.a.intValue(),
                           (this.movesSearched - movesSearchedBefore));
                     this.thinking.postThinking(
                           ply,
                           (best.a.intValue() * (whiteMove?1:-1)),
                           moveTime + 1,
                           (this.movesSearched - movesSearchedBefore),
                           best.b.toString());
                  }
               }
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

      return result;
   }
}