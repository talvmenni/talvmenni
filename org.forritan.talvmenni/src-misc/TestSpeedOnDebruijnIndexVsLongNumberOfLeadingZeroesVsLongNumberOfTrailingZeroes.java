import java.util.Random;

import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.Squares;

public class TestSpeedOnDebruijnIndexVsLongNumberOfLeadingZeroesVsLongNumberOfTrailingZeroes {
   
   public static void main(
         String[] args) {
      
      int howMany= 1000000;
      
      Square sq= Squares.create();
      
      //VM warmup...
      int index;

      for (int i= 0; i < howMany; i++) {
         index= Square.Util.deBruijn64Index(sq.getSquare(new Random().nextInt(64))); 
      }
      for (int i= 0; i < howMany; i++) {
         index= Long.numberOfLeadingZeros(sq.getSquare(new Random().nextInt(64))); 
      }
      for (int i= 0; i < howMany; i++) {
         index= Long.numberOfTrailingZeros(sq.getSquare(new Random().nextInt(64))); 
      }

      // Square.Util.deBruijn64Index
      long time= -System.currentTimeMillis();
      for (int i= 0; i < howMany; i++) {
         index= Square.Util.deBruijn64Index(sq.getSquare(new Random().nextInt(64))); 
      }      
      time += System.currentTimeMillis();      
      System.out.println("Getting the index " + howMany + " times using deBruijn64Index: " + time + " milliseconds...");
      
      // Long.numberOfLeadingZeros
      time= -System.currentTimeMillis();
      for (int i= 0; i < howMany; i++) {
         index= Long.numberOfLeadingZeros(sq.getSquare(new Random().nextInt(64))); 
      }      
      time += System.currentTimeMillis();      
      System.out.println("Getting the index " + howMany + " times using Long.numberOfLeadingZeros: " + time + " milliseconds...");
      
      // Long.numberOfTrailingZeros
      time= -System.currentTimeMillis();
      for (int i= 0; i < howMany; i++) {
         index= Long.numberOfTrailingZeros(sq.getSquare(new Random().nextInt(64))); 
      }      
      time += System.currentTimeMillis();      
      System.out.println("Getting the index " + howMany + " times using Long.numberOfTrailingZeros: " + time + " milliseconds...");
      
      
   }

}
