import org.forritan.talvmenni.knowledge.AbstractPosition;
import org.forritan.talvmenni.knowledge.ImmutablePosition;
import org.forritan.talvmenni.knowledge.Move;
import org.forritan.talvmenni.knowledge.MoveHistory;
import org.forritan.talvmenni.knowledge.Position;


public class TestSpeedOnPositionCreation {
   public static void main(
         String[] args) {

      int howMany= 1000000;

      System.out.println("Creating "
            + howMany
            + " mutable positions...");

      long time= -System.currentTimeMillis();
      Position initialPosition= Position.Factory.createInitial(false, true);

      for (int i= 0; i < howMany; i++) {
         long from= 1L << (i % 32);
         long to= 1L << ((i % 32) + 16);
         initialPosition.move(from, to);
         initialPosition.popMove();
//         Move m= new Move(
//               initialPosition,
//               from,
//               to, 
//               PositionFactory.PromotionPiece.DEFAULT);
//         if (howMany < 1001) {
//            MoveHistory.getInstance().add(
//                  m);
//         }
      }

      time+= System.currentTimeMillis();

      System.out.println("...in "
            + time
            + " milliseconds.");
      System.out.println("i.e. " + 1L * howMany * 1000 / time + " pr. second.");


//      System.out.println(MoveHistory.getInstance().getHistory());


      System.out.println("Creating "
            + howMany
            + " immutable positions...");

      time= -System.currentTimeMillis();
      initialPosition= Position.Factory.createInitial(false, false);

      for (int i= 0; i < howMany; i++) {
         long from= 1L << (i % 32);
         long to= 1L << ((i % 32) + 16);

         initialPosition.move(from, to);
         initialPosition.popMove();

//         Move m= new Move(
//               initialPosition,
//               from,
//               to, 
//               PositionFactory.PromotionPiece.DEFAULT);
//         if (howMany < 1001) {
//            MoveHistory.getInstance().add(
//                  m);
//         }
      }

      time+= System.currentTimeMillis();

      System.out.println("...in "
            + time
            + " milliseconds.");
      System.out.println("i.e. " + 1L * howMany * 1000 / time + " pr. second.");


//      System.out.println(MoveHistory.getInstance().getHistory());

   }
}