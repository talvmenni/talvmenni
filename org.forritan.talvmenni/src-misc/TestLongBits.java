public class TestLongBits {

   public static void main(
         String[] args) {

      System.out.println("Testing the bits of the longs:");
      System.out.println();
      for (long i= -10L; i < 11L; i++) {
         System.out.println(" - "
               + i
               + "L: "
               + Long.toBinaryString(i));
      }
   }
   
   
}