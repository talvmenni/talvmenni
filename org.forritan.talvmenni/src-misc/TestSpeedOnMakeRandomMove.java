import java.util.List;
import java.util.Random;

import org.forritan.talvmenni.knowledge.AbstractPosition;
import org.forritan.talvmenni.knowledge.Position;
import org.forritan.talvmenni.knowledge.Position.Move;


public class TestSpeedOnMakeRandomMove {
   public static void main(
         String[] args) {
           
      
      System.err.println("Warmup... ");

      int warmup= 100000;      
      
//      ___resetObjectCreationStats();
     
      Random rnd= new Random();
      
      Position p= Position.Factory.createInitial(false, false);
      boolean whiteToMove= true;
      for (int i= 0; i < warmup; i++) {
         List moves= (whiteToMove ? p.getWhite().getPossibleMoves() : p.getBlack().getPossibleMoves());
         if(!moves.isEmpty()) {
            Move move= (Move) moves.get(rnd.nextInt(moves.size()));
            p= p.move(move);
         } else {
            p= Position.Factory.createInitial(false, false);
         }
         whiteToMove= !whiteToMove;
      }
      System.err.println("... created " + warmup + " immutable positions");
//      ___printObjectCreationStats(System.err);
//
//      ___resetObjectCreationStats();

      p= Position.Factory.createInitial(false, true);
      whiteToMove= true;
      for (int i= 0; i < warmup; i++) {
         List moves= (whiteToMove ? p.getWhite().getPossibleMoves() : p.getBlack().getPossibleMoves());
         if(!moves.isEmpty()) {
            Move move= (Move) moves.get(rnd.nextInt(moves.size()));
            p= p.move(move);
         } else {
            p= Position.Factory.createInitial(false, true);
         }
         whiteToMove= !whiteToMove;
      }

      System.err.println("... created " + warmup + " mutable positions");
//      ___printObjectCreationStats(System.err);

      
      
      p= Position.Factory.createInitial(false, false);
      whiteToMove= true;
      int howMany= 100000;
      System.out.println("Making "
            + howMany
            + " random immutable moves...");
            

      long time= -System.currentTimeMillis();
      for (int i= 0; i < howMany; i++) {
         List moves= (whiteToMove ? p.getWhite().getPossibleMoves() : p.getBlack().getPossibleMoves());
         if(!moves.isEmpty()) {
            Move move= (Move) moves.get(new Random().nextInt(moves.size()));
            p= p.move(move);
         } else {
            p= Position.Factory.createInitial(false, false);
            System.out.print(".");
         }
         whiteToMove= !whiteToMove;
      }

      time+= System.currentTimeMillis();

      System.out.println("...in "
            + time
            + " milliseconds.");
      System.out.println("i.e. " + 1L * howMany * 1000 / time + " pr. second.");

 
   
      p= Position.Factory.createInitial(false, true);
      whiteToMove= true;
      System.out.println("Making "
            + howMany
            + " random mutable moves...");
            

      time= -System.currentTimeMillis();
      for (int i= 0; i < howMany; i++) {
         List moves= (whiteToMove ? p.getWhite().getPossibleMoves() : p.getBlack().getPossibleMoves());
         if(!moves.isEmpty()) {
            Move move= (Move) moves.get(new Random().nextInt(moves.size()));
            p= p.move(move);
            p.popMove();
         } else {
            p= Position.Factory.createInitial(false, true);
            System.out.print(".");
         }
         whiteToMove= !whiteToMove;
      }

      time+= System.currentTimeMillis();

      System.out.println("...in "
            + time
            + " milliseconds.");
      System.out.println("i.e. " + 1L * howMany * 1000 / time + " pr. second.");
   }
}