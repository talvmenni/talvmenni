package org.forritan.talvmenni.search;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.AbstractPosition;
import org.forritan.talvmenni.game.Transposition;
import org.forritan.talvmenni.game.Transposition.ThreeTuplePlyScoreMoves;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.talvmenni.search.PrincipalVariation.DebugInfo;
import org.forritan.talvmenni.search.PrincipalVariation.Thinking;


public class AlphaBetaWithTranspositionTableSearch implements Search {

   private PrincipalVariation pv;
   private Transposition      transposition;
   private int                ply;
   private final boolean      useMoveOrdering;

   private int                movesSearched;
   private int                transpositionHits;

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
      this.ply= ply;
      this.useMoveOrdering= useMoveOrdering;
      this.transposition= transposition;
      this.pv= PrincipalVariation.Factory.create(ply);
   }

   public void setPly(
         int ply) {
      this.ply= ply;
      this.pv.setDepth(ply);
   }

   public Thinking getThinking() {
      return this.pv.getThinking();
   }

   public DebugInfo getDebugInfo() {
      return this.pv.getDebugInfo();
   }

   public List getBestMoves(
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
      // int beta= Integer.MAX_VALUE;
      // If checkmate there is no need to search further...
      int beta= Evaluation.CHECKMATE_SCORE;

      this.pv.clear();

      int result= this.alphaBeta(
            p,
            e,
            whiteMove,
            this.ply,
            alpha,
            beta);

      time+= System.currentTimeMillis();

      this.pv.getDebugInfo().postNodesPerSecond(
            time,
            this.movesSearched);

      this.pv.getDebugInfo().postBestMoves(
            this.pv.getCurrentBestLine());

      this.pv.getDebugInfo().postTranspositionHits(
            this.transpositionHits);

      return (pv.getBestMoveAsList());

   }

   private int alphaBeta(
         Position p,
         Evaluation e,
         boolean whiteMove,
         int ply,
         int alpha,
         int beta) {

      int result;
      
      if(ply < this.ply) {
         if (this.transposition.contains(
               p,
               whiteMove)) {
            ThreeTuplePlyScoreMoves entry= this.transposition.get(
                  p,
                  whiteMove);
            if (entry.ply.intValue() >= ply) {
               this.transpositionHits++;
               this.pv.updateLastExaminedLine();
               return entry.score.intValue();
            }
         }
      }

      if (ply == 0) {
         result= (e.getScore(p) * (whiteMove ? 1 : -1));
         this.pv.updateLastExaminedLine();
      } else {
         List moves;
         int best= Integer.MIN_VALUE + 1;

         if (whiteMove) {
            moves= p.getWhite().getPossibleMoves();
         } else {
            moves= p.getBlack().getPossibleMoves();
         }

         if (moves.size() > 0) {
            for (Iterator it= moves.iterator(); it.hasNext();) {
               Move move= (Move) it.next();
               if (best >= beta) {
                  break;
               }
               this.movesSearched++;

               int movesSearchedBefore= this.movesSearched;
               long moveTime= -System.currentTimeMillis();
               p= p.move(
                     move.from,
                     move.to);
               if (best > alpha) {
                  alpha= best;
               }

               this.pv.push(move);

               int score= -alphaBeta(
                     p,
                     e,
                     !whiteMove,
                     ply - 1,
                     -beta,
                     -alpha);

               this.pv.pop();

               p.popMove();

               moveTime+= System.currentTimeMillis();

               if (score > best) {
                  best= score;
                  this.pv.updatePV(
                        ply,
                        moveTime,
                        (this.movesSearched - movesSearchedBefore),
                        (best * (whiteMove ? 1 : -1)));

                  if (this.useMoveOrdering) {
                     if (whiteMove) {
                        p.getWhite().killerMove(
                              move);
                     } else {
                        p.getBlack().killerMove(
                              move);
                     }
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
               result= (-Evaluation.CHECKMATE_SCORE - ply);
            } else {
               // Stalemate...
               result= 0;
            }
         }
      }

      this.transposition.update(
            p,
            whiteMove,
            this.pv.getCurrentBestLine(),
            result,
            ply);

      return result;
   }
}