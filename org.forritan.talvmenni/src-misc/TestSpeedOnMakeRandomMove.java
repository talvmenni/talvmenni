import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import org.forritan.talvmenni.game.Position;
import org.forritan.talvmenni.game.PositionFactory;
import org.forritan.talvmenni.game.Position.Move;
import org.forritan.util.debug.ExceptionLoggingWindowHandler;


public class TestSpeedOnMakeRandomMove {
   public static void main(
         String[] args) {
           
      
      System.err.println("Warmup... ");

      int warmup= 100000;      
      
      ___resetObjectCreationStats();
     
      Random rnd= new Random();
      
      Position p= PositionFactory.createInitialImmutable();
      boolean whiteToMove= true;
      for (int i= 0; i < warmup; i++) {
         List<Move> moves= (whiteToMove ? p.getWhite().getPossibleMoves() : p.getBlack().getPossibleMoves());
         if(!moves.isEmpty()) {
            Move move= moves.get(rnd.nextInt(moves.size()));
            p= p.move(move.from, move.to);
         } else {
            p= PositionFactory.createInitialImmutable();
         }
         whiteToMove= !whiteToMove;
      }
      System.err.println("... created " + warmup + " immutable positions");
      ___printObjectCreationStats(System.err);

      ___resetObjectCreationStats();

      p= PositionFactory.createInitialMutable();
      whiteToMove= true;
      for (int i= 0; i < warmup; i++) {
         List<Move> moves= (whiteToMove ? p.getWhite().getPossibleMoves() : p.getBlack().getPossibleMoves());
         if(!moves.isEmpty()) {
            Move move= moves.get(rnd.nextInt(moves.size()));
            p= p.move(move.from, move.to);
         } else {
            p= PositionFactory.createInitialMutable();
         }
         whiteToMove= !whiteToMove;
      }

      System.err.println("... created " + warmup + " mutable positions");
      ___printObjectCreationStats(System.err);

      
      
      p= PositionFactory.createInitialImmutable();
      whiteToMove= true;
      int howMany= 100000;
      System.out.println("Making "
            + howMany
            + " random immutable moves...");
            

      long time= -System.currentTimeMillis();
      for (int i= 0; i < howMany; i++) {
         List<Move> moves= (whiteToMove ? p.getWhite().getPossibleMoves() : p.getBlack().getPossibleMoves());
         if(!moves.isEmpty()) {
            Move move= moves.get(new Random().nextInt(moves.size()));
            p= p.move(move.from, move.to);
         } else {
            p= PositionFactory.createInitialImmutable();
            System.out.print(".");
         }
         whiteToMove= !whiteToMove;
      }

      time+= System.currentTimeMillis();

      System.out.println("...in "
            + time
            + " milliseconds.");
      System.out.println("i.e. " + 1L * howMany * 1000 / time + " pr. second.");

 
   
      p= PositionFactory.createInitialMutable();
      whiteToMove= true;
      System.out.println("Making "
            + howMany
            + " random mutable moves...");
            

      time= -System.currentTimeMillis();
      for (int i= 0; i < howMany; i++) {
         List<Move> moves= (whiteToMove ? p.getWhite().getPossibleMoves() : p.getBlack().getPossibleMoves());
         if(!moves.isEmpty()) {
            Move move= moves.get(new Random().nextInt(moves.size()));
            p= p.move(move.from, move.to);
            p.popMove();
         } else {
            p= PositionFactory.createInitialMutable();
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