package org.forritan.talvmenni.search;

import java.util.Iterator;
import java.util.List;

import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Position.Move;
import org.forritan.talvmenni.knowledge.evaluation.Evaluation;

import org.forritan.talvmenni.search.PrincipalVariation.DebugInfo;
import org.forritan.talvmenni.search.PrincipalVariation.Thinking;


public class NegaMaxSearch implements Search {

   private PrincipalVariation pv;
   private int                ply;

   private int                movesSearched;

   public NegaMaxSearch(PrincipalVariation pv) {
      this(
            0,
            pv);
   }

   public NegaMaxSearch(
         int ply,
         PrincipalVariation pv) {
      this.ply= ply;
      this.pv= pv;
   }

   public void setPly(
         int ply) {
      this.ply= ply;
   }

   public PrincipalVariation getPrincipalVariation() {
      return this.pv;
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
      
      this.pv.clearPrincipalVariation();

      int result= this.negaMax(
            p,
            e,
            whiteMove,
            this.ply);

      time+= System.currentTimeMillis();

      System.err.println("*** at ply = " + ply + " : best result = " + result + " NegaMaxSearch ***");

      this.pv.getDebugInfo().postNodesPerSecond(
            time,
            this.movesSearched);
      this.pv.getDebugInfo().postBestMoves(pv.getCurrentBestLine());
      return (pv.getBestMoveAsList());
   }

   public int negaMax(
         Position p,
         Evaluation e,
         boolean whiteMove,
         int ply) {

      int result;
      if (ply == 0) {
         this.pv.updateLastExaminedLine();
         result= (e.getScore(p) * (whiteMove ? 1 : -1));
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

               this.movesSearched++;

               int movesSearchedBefore= this.movesSearched;
               long moveTime= -System.currentTimeMillis();
               p= p.move(
                     move.from,
                     move.to);

               this.pv.push(move);

               int score= -negaMax(
                     p,
                     e,
                     !whiteMove,
                     ply - 1);
       
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
               }
            }
            result= best;
         } else {
            if (whiteMove ? p.getWhite().isInCheck() : p.getBlack().isInCheck()) {
               // Checkmate...
               result= -(Evaluation.CHECKMATE_SCORE + ply);
            } else {
               // Stalemate...
               result= 0;
            }
         }
      }
      return result;
   }
}