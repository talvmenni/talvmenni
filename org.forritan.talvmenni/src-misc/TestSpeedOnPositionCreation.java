import org.forritan.talvmenni.game.Move;
import org.forritan.talvmenni.game.MoveHistory;
import org.forritan.talvmenni.game.ImmutablePosition;


public class TestSpeedOnPositionCreation {
   public static void main(
         String[] args) {

      int howMany= 1000000;

      System.out.println("Creating "
            + howMany
            + " positions...");

      long time= -System.currentTimeMillis();
      ImmutablePosition initialPosition= ImmutablePosition.createInitial();

      for (int i= 0; i < howMany; i++) {
         long from= 1L << (i % 32);
         long to= 1L << ((i % 32) + 16);
         Move m= new Move(
               initialPosition,
               from,
               to, 
               ImmutablePosition.PromotionPiece.DEFAULT);
         if (howMany < 1001) {
            MoveHistory.getInstance().add(
                  m);
         }
      }

      time+= System.currentTimeMillis();

      System.out.println("...in "
            + time
            + " milliseconds.");
      System.out.println("i.e. " + 1L * howMany * 1000 / time + " pr. second.");


      System.out.println(MoveHistory.getInstance().getHistory());

   }
}