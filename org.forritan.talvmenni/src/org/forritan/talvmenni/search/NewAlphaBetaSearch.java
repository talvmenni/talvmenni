package org.forritan.talvmenni.search;

import java.util.List;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.talvmenni.search.Search.DebugInfo;
import org.forritan.talvmenni.search.Search.Thinking;

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
      return null;
   }
   
/*
   alphaBeta(player, board, alpha, beta)
   if(game over in current board position)
       return winner

   children = all legal moves for player from this board
   if(max's turn)
       for each child
           score = alpha-beta(other player,child,alpha,beta)
           if score > alpha then alpha = score (we have found a better best move)
           if alpha >= beta then return alpha (cut off)
       return alpha (this is our best move)
   else (min's turn)
       for each child
           score = alpha-beta(other player,child,alpha,beta)
           if score < beta then beta = score (opponent has found a better worse move)
           if alpha >= beta then return beta (cut off)
       return beta (this is the opponent's best move)
*/

}
