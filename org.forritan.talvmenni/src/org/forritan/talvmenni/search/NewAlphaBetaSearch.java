package org.forritan.talvmenni.search;

import java.util.ArrayList;
import java.util.List;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.PositionFactory;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.util.Tuple;

public class NewAlphaBetaSearch implements Search {
   
   private Thinking  thinking;
   private DebugInfo debugInfo;
   private int       ply;

   private int       movesSearched;

   public NewAlphaBetaSearch() {
      this(
            0);
   }

   public NewAlphaBetaSearch(
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
      
      int alpha= Integer.MIN_VALUE + 1; // Very important!!! Can't be Integer.MIN_VALUE, because Integer.MIN_VALUE == -Integer.MIN_VALUE
      int beta= Integer.MAX_VALUE;

      long moveTime= -System.currentTimeMillis();
      Tuple<Integer,List<Move>> result= this.alphaBeta(p, e, whiteMove, this.ply, alpha, beta);
      moveTime += System.currentTimeMillis();
      this.thinking.postThinking(this.ply, result.a.intValue(), moveTime + 1, this.movesSearched, result.a.toString());      
      return result.b.subList(0, 1);
   }
   
   private Tuple<Integer,List<Move>> alphaBeta(Position p, Evaluation e, boolean whiteMove, int ply, int alpha, int beta) {

      Tuple<Integer,List<Move>> result= null;

      PositionFactory.nodes++;
      
      if (ply == 0) {
          result= new Tuple<Integer,List<Move>>(Integer.valueOf( (e.getScore(p) * (whiteMove ? 1 : -1)) ), new ArrayList<Move>());
      } else {
         List<Move> moves;
         Tuple<Integer,List<Move>> best = new Tuple<Integer,List<Move>>(Integer.valueOf(Integer.MIN_VALUE + 1), new ArrayList<Move>());

         if(whiteMove) {
            moves= p.getWhite().getPossibleMoves();         
         } else {
            moves= p.getBlack().getPossibleMoves();         
         }
         
         for(Move move : moves) {
            if(best.a.intValue() >= beta)
               break;
            this.movesSearched++;
            p= p.move(move.from, move.to);
            if (best.a.intValue() > alpha) {
               alpha = best.a.intValue();
            }
            Tuple<Integer,List<Move>> value = alphaBeta(p, e, !whiteMove, ply-1, -beta, -alpha);
            p.popMove();
            value.a= Integer.valueOf(value.a.intValue() * -1);
            value.b.add(0, move);

            if (value.a.intValue() > best.a.intValue())
               best = value;
         }
         result= best;
      }
      return result;      
   }   
}
