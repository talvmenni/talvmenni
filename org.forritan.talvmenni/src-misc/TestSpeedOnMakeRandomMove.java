import org.forritan.talvmenni.game.Position;


public class TestSpeedOnMakeRandomMove {
   public static void main(
         String[] args) {

      int howMany= 1000000;

      System.out.println("Making "
            + howMany
            + " random moves...");
      
      System.out.println();
      

      Position p= Position.createInitial();
      long time= -System.currentTimeMillis();
      for (int i= 0; i < howMany; i++) {
         Position.Move move= p.getRandomMove((i % 2) == 0);
         if(move != null) {
            p= p.move(move.from, move.to);
         } else {
            p= Position.createInitial();
            System.out.print(".");
         }
      }

      time+= System.currentTimeMillis();

      System.out.println();

      System.out.println("...in "
            + time
            + " milliseconds.");
      System.out.println("i.e. " + 1L * howMany * 1000 / time + " pr. second.");

   }
}