package org.forritan.talvmenni.search;

import java.util.List;
import java.util.Observable;

import org.forritan.talvmenni.core.ChessEngine;
import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.game.ImmutablePosition;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.AbstractPosition;
import org.forritan.talvmenni.game.Position.Move;

import org.forritan.talvmenni.search.PrincipalVariation.DebugInfo;
import org.forritan.talvmenni.search.PrincipalVariation.Thinking;


public interface Search {

   public void setPly(
         int ply);

   public List getBestMoves(
         Position p,
         Evaluation e,
         boolean whiteMove);

   public PrincipalVariation getPrincipalVariation();
   
   public Thinking getThinking();
   public DebugInfo getDebugInfo();

   public static class TupleScoreMoves {

      public Integer score;
      public List    moves;

      public TupleScoreMoves(
            Integer score,
            List moves) {
         this.score= score;
         this.moves= moves;
      }
   }
   
   
}
