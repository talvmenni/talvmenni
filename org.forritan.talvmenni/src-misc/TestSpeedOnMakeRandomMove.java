import org.forritan.talvmenni.game.Position;


public class TestSpeedOnMakeRandomMove {
   public static void main(
         String[] args) {

      int warmup= 100000;
     
      Position p= Position.createInitial();      
      for (int i= 0; i < warmup; i++) {
         Position.Move move= p.getRandomMove((i % 2) == 0);
         if(move != null) {
            p= p.move(move.from, move.to);
         } else {
            p= Position.createInitial();
         }
      }
      
      
      
      p= Position.createInitial();
      int howMany= 1000000;
      System.out.println("Making "
            + howMany
            + " random moves...");
            

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

      System.out.println("...in "
            + time
            + " milliseconds.");
      System.out.println("i.e. " + 1L * howMany * 1000 / time + " pr. second.");

   }
}