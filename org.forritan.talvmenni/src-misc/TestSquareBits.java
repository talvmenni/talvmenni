import java.util.HashMap;
import java.util.Map;

import org.forritan.talvmenni.bitboard.Square;


public class TestSquareBits {

   private static final String[] zeroPrefix = new String[64];

   static {
      for (int i= 0, j= 64; i < zeroPrefix.length; i++, j--) {
         StringBuffer zeroes= new StringBuffer();
         for (int k= 1; k < j; k++) {
            zeroes.append('0');
         }
         zeroPrefix[i]= zeroes.toString();
      }
   }

   public static void main(
         String[] args) {

      Map map= new HashMap();
      
      System.out.println("Long.MAX_VALUE: "
            + zeroPrefix[Long.toBinaryString(
                  Long.MAX_VALUE).length() - 1]
            + Long.toBinaryString(Long.MAX_VALUE)
            + " | "
            + (Long.MAX_VALUE));

      System.out.println("Long.MIN_VALUE: "
            + zeroPrefix[Long.toBinaryString(
                  Long.MIN_VALUE).length() - 1]
            + Long.toBinaryString(Long.MIN_VALUE)
            + " | "
            + (Long.MIN_VALUE));

      System.out.println("~A8: "
            + zeroPrefix[Long.toBinaryString(
                  ~Square._A8).length() - 1]
            + Long.toBinaryString(~Square._A8)
            + " | "
            + (~Square._A8));

      System.out.println();

      System.out.println("_A8: "
            + zeroPrefix[Long.toBinaryString(
                  Square._A8).length() - 1]
            + Long.toBinaryString(Square._A8)
            + " | "
            + Square._A8
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._A8).hashCode());

      System.out.println("_B8: "
            + zeroPrefix[Long.toBinaryString(
                  Square._B8).length() - 1]
            + Long.toBinaryString(Square._B8)
            + " | "
            + Square._B8
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._B8).hashCode());

      System.out.println("_C8: "
            + zeroPrefix[Long.toBinaryString(
                  Square._C8).length() - 1]
            + Long.toBinaryString(Square._C8)
            + " | "
            + Square._C8
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._C8).hashCode());

      System.out.println("_D8: "
            + zeroPrefix[Long.toBinaryString(
                  Square._D8).length() - 1]
            + Long.toBinaryString(Square._D8)
            + " | "
            + Square._D8
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._D8).hashCode());

      System.out.println("_E8: "
            + zeroPrefix[Long.toBinaryString(
                  Square._E8).length() - 1]
            + Long.toBinaryString(Square._E8)
            + " | "
            + Square._E8
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._E8).hashCode());

      System.out.println("_F8: "
            + zeroPrefix[Long.toBinaryString(
                  Square._F8).length() - 1]
            + Long.toBinaryString(Square._F8)
            + " | "
            + Square._F8
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._F8).hashCode());

      System.out.println("_G8: "
            + zeroPrefix[Long.toBinaryString(
                  Square._G8).length() - 1]
            + Long.toBinaryString(Square._G8)
            + " | "
            + Square._G8
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._G8).hashCode());

      System.out.println("_H8: "
            + zeroPrefix[Long.toBinaryString(
                  Square._H8).length() - 1]
            + Long.toBinaryString(Square._H8)
            + " | "
            + Square._H8
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._H8).hashCode());

      System.out.println();

      System.out.println("_A7: "
            + zeroPrefix[Long.toBinaryString(
                  Square._A7).length() - 1]
            + Long.toBinaryString(Square._A7)
            + " | "
            + Square._A7
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._A7).hashCode());

      System.out.println("_B7: "
            + zeroPrefix[Long.toBinaryString(
                  Square._B7).length() - 1]
            + Long.toBinaryString(Square._B7)
            + " | "
            + Square._B7
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._B7).hashCode());

      System.out.println("_C7: "
            + zeroPrefix[Long.toBinaryString(
                  Square._C7).length() - 1]
            + Long.toBinaryString(Square._C7)
            + " | "
            + Square._C7
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._C7).hashCode());

      System.out.println("_D7: "
            + zeroPrefix[Long.toBinaryString(
                  Square._D7).length() - 1]
            + Long.toBinaryString(Square._D7)
            + " | "
            + Square._D7
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._D7).hashCode());

      System.out.println("_E7: "
            + zeroPrefix[Long.toBinaryString(
                  Square._E7).length() - 1]
            + Long.toBinaryString(Square._E7)
            + " | "
            + Square._E7
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._E7).hashCode());

      System.out.println("_F7: "
            + zeroPrefix[Long.toBinaryString(
                  Square._F7).length() - 1]
            + Long.toBinaryString(Square._F7)
            + " | "
            + Square._F7
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._F7).hashCode());

      System.out.println("_G7: "
            + zeroPrefix[Long.toBinaryString(
                  Square._G7).length() - 1]
            + Long.toBinaryString(Square._G7)
            + " | "
            + Square._G7
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._G7).hashCode());

      System.out.println("_H7: "
            + zeroPrefix[Long.toBinaryString(
                  Square._H7).length() - 1]
            + Long.toBinaryString(Square._H7)
            + " | "
            + Square._H7
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._H7).hashCode());

      System.out.println();

      System.out.println("_A6: "
            + zeroPrefix[Long.toBinaryString(
                  Square._A6).length() - 1]
            + Long.toBinaryString(Square._A6)
            + " | "
            + Square._A6
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._A6).hashCode());

      System.out.println("_B6: "
            + zeroPrefix[Long.toBinaryString(
                  Square._B6).length() - 1]
            + Long.toBinaryString(Square._B6)
            + " | "
            + Square._B6
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._B6).hashCode());

      System.out.println("_C6: "
            + zeroPrefix[Long.toBinaryString(
                  Square._C6).length() - 1]
            + Long.toBinaryString(Square._C6)
            + " | "
            + Square._C6
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._C6).hashCode());

      System.out.println("_D6: "
            + zeroPrefix[Long.toBinaryString(
                  Square._D6).length() - 1]
            + Long.toBinaryString(Square._D6)
            + " | "
            + Square._D6
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._D6).hashCode());

      System.out.println("_E6: "
            + zeroPrefix[Long.toBinaryString(
                  Square._E6).length() - 1]
            + Long.toBinaryString(Square._E6)
            + " | "
            + Square._E6
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._E6).hashCode());

      System.out.println("_F6: "
            + zeroPrefix[Long.toBinaryString(
                  Square._F6).length() - 1]
            + Long.toBinaryString(Square._F6)
            + " | "
            + Square._F6
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._F6).hashCode());

      System.out.println("_G6: "
            + zeroPrefix[Long.toBinaryString(
                  Square._G6).length() - 1]
            + Long.toBinaryString(Square._G6)
            + " | "
            + Square._G6
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._G6).hashCode());

      System.out.println("_H6: "
            + zeroPrefix[Long.toBinaryString(
                  Square._H6).length() - 1]
            + Long.toBinaryString(Square._H6)
            + " | "
            + Square._H6
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._H6).hashCode());

      System.out.println();

      System.out.println("_A5: "
            + zeroPrefix[Long.toBinaryString(
                  Square._A5).length() - 1]
            + Long.toBinaryString(Square._A5)
            + " | "
            + Square._A5
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._A5).hashCode());

      System.out.println("_B5: "
            + zeroPrefix[Long.toBinaryString(
                  Square._B5).length() - 1]
            + Long.toBinaryString(Square._B5)
            + " | "
            + Square._B5
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._B5).hashCode());

      System.out.println("_C5: "
            + zeroPrefix[Long.toBinaryString(
                  Square._C5).length() - 1]
            + Long.toBinaryString(Square._C5)
            + " | "
            + Square._C5
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._C5).hashCode());

      System.out.println("_D5: "
            + zeroPrefix[Long.toBinaryString(
                  Square._D5).length() - 1]
            + Long.toBinaryString(Square._D5)
            + " | "
            + Square._D5
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._D5).hashCode());

      System.out.println("_E5: "
            + zeroPrefix[Long.toBinaryString(
                  Square._E5).length() - 1]
            + Long.toBinaryString(Square._E5)
            + " | "
            + Square._E5
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._E5).hashCode());

      System.out.println("_F5: "
            + zeroPrefix[Long.toBinaryString(
                  Square._F5).length() - 1]
            + Long.toBinaryString(Square._F5)
            + " | "
            + Square._F5
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._F5).hashCode());

      System.out.println("_G5: "
            + zeroPrefix[Long.toBinaryString(
                  Square._G5).length() - 1]
            + Long.toBinaryString(Square._G5)
            + " | "
            + Square._G5
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._G5).hashCode());

      System.out.println("_H5: "
            + zeroPrefix[Long.toBinaryString(
                  Square._H5).length() - 1]
            + Long.toBinaryString(Square._H5)
            + " | "
            + Square._H5
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._H5).hashCode());

      System.out.println();

      System.out.println("_A4: "
            + zeroPrefix[Long.toBinaryString(
                  Square._A4).length() - 1]
            + Long.toBinaryString(Square._A4)
            + " | "
            + Square._A4
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._A4).hashCode());

      System.out.println("_B4: "
            + zeroPrefix[Long.toBinaryString(
                  Square._B4).length() - 1]
            + Long.toBinaryString(Square._B4)
            + " | "
            + Square._B4
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._B4).hashCode());

      System.out.println("_C4: "
            + zeroPrefix[Long.toBinaryString(
                  Square._C4).length() - 1]
            + Long.toBinaryString(Square._C4)
            + " | "
            + Square._C4
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._C4).hashCode());

      System.out.println("_D4: "
            + zeroPrefix[Long.toBinaryString(
                  Square._D4).length() - 1]
            + Long.toBinaryString(Square._D4)
            + " | "
            + Square._D4
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._D4).hashCode());

      System.out.println("_E4: "
            + zeroPrefix[Long.toBinaryString(
                  Square._E4).length() - 1]
            + Long.toBinaryString(Square._E4)
            + " | "
            + Square._E4
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._E4).hashCode());

      System.out.println("_F4: "
            + zeroPrefix[Long.toBinaryString(
                  Square._F4).length() - 1]
            + Long.toBinaryString(Square._F4)
            + " | "
            + Square._F4
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._F4).hashCode());

      System.out.println("_G4: "
            + zeroPrefix[Long.toBinaryString(
                  Square._G4).length() - 1]
            + Long.toBinaryString(Square._G4)
            + " | "
            + Square._G4
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._G4).hashCode());

      System.out.println("_H4: "
            + zeroPrefix[Long.toBinaryString(
                  Square._H4).length() - 1]
            + Long.toBinaryString(Square._H4)
            + " | "
            + Square._H4
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._H4).hashCode());

      System.out.println();

      System.out.println("_A3: "
            + zeroPrefix[Long.toBinaryString(
                  Square._A3).length() - 1]
            + Long.toBinaryString(Square._A3)
            + " | "
            + Square._A3
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._A3).hashCode());

      System.out.println("_B3: "
            + zeroPrefix[Long.toBinaryString(
                  Square._B3).length() - 1]
            + Long.toBinaryString(Square._B3)
            + " | "
            + Square._B3
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._B3).hashCode());

      System.out.println("_C3: "
            + zeroPrefix[Long.toBinaryString(
                  Square._C3).length() - 1]
            + Long.toBinaryString(Square._C3)
            + " | "
            + Square._C3
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._C3).hashCode());

      System.out.println("_D3: "
            + zeroPrefix[Long.toBinaryString(
                  Square._D3).length() - 1]
            + Long.toBinaryString(Square._D3)
            + " | "
            + Square._D3
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._D3).hashCode());

      System.out.println("_E3: "
            + zeroPrefix[Long.toBinaryString(
                  Square._E3).length() - 1]
            + Long.toBinaryString(Square._E3)
            + " | "
            + Square._E3
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._E3).hashCode());

      System.out.println("_F3: "
            + zeroPrefix[Long.toBinaryString(
                  Square._F3).length() - 1]
            + Long.toBinaryString(Square._F3)
            + " | "
            + Square._F3
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._F3).hashCode());

      System.out.println("_G3: "
            + zeroPrefix[Long.toBinaryString(
                  Square._G3).length() - 1]
            + Long.toBinaryString(Square._G3)
            + " | "
            + Square._G3
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._G3).hashCode());

      System.out.println("_H3: "
            + zeroPrefix[Long.toBinaryString(
                  Square._H3).length() - 1]
            + Long.toBinaryString(Square._H3)
            + " | "
            + Square._H3
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._H3).hashCode());

      System.out.println();

      System.out.println("_A2: "
            + zeroPrefix[Long.toBinaryString(
                  Square._A2).length() - 1]
            + Long.toBinaryString(Square._A2)
            + " | "
            + Square._A2
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._A2).hashCode());

      System.out.println("_B2: "
            + zeroPrefix[Long.toBinaryString(
                  Square._B2).length() - 1]
            + Long.toBinaryString(Square._B2)
            + " | "
            + Square._B2
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._B2).hashCode());

      System.out.println("_C2: "
            + zeroPrefix[Long.toBinaryString(
                  Square._C2).length() - 1]
            + Long.toBinaryString(Square._C2)
            + " | "
            + Square._C2
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._C2).hashCode());

      System.out.println("_D2: "
            + zeroPrefix[Long.toBinaryString(
                  Square._D2).length() - 1]
            + Long.toBinaryString(Square._D2)
            + " | "
            + Square._D2
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._D2).hashCode());

      System.out.println("_E2: "
            + zeroPrefix[Long.toBinaryString(
                  Square._E2).length() - 1]
            + Long.toBinaryString(Square._E2)
            + " | "
            + Square._E2
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._E2).hashCode());

      System.out.println("_F2: "
            + zeroPrefix[Long.toBinaryString(
                  Square._F2).length() - 1]
            + Long.toBinaryString(Square._F2)
            + " | "
            + Square._F2
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._F2).hashCode());

      System.out.println("_G2: "
            + zeroPrefix[Long.toBinaryString(
                  Square._G2).length() - 1]
            + Long.toBinaryString(Square._G2)
            + " | "
            + Square._G2
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._G2).hashCode());

      System.out.println("_H2: "
            + zeroPrefix[Long.toBinaryString(
                  Square._H2).length() - 1]
            + Long.toBinaryString(Square._H2)
            + " | "
            + Square._H2
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._H2).hashCode());

      System.out.println();

      System.out.println("_A1: "
            + zeroPrefix[Long.toBinaryString(
                  Square._A1).length() - 1]
            + Long.toBinaryString(Square._A1)
            + " | "
            + Square._A1
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._A1).hashCode());

      System.out.println("_B1: "
            + zeroPrefix[Long.toBinaryString(
                  Square._B1).length() - 1]
            + Long.toBinaryString(Square._B1)
            + " | "
            + Square._B1
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._B1).hashCode());

      System.out.println("_C1: "
            + zeroPrefix[Long.toBinaryString(
                  Square._C1).length() - 1]
            + Long.toBinaryString(Square._C1)
            + " | "
            + Square._C1
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._C1).hashCode());

      System.out.println("_D1: "
            + zeroPrefix[Long.toBinaryString(
                  Square._D1).length() - 1]
            + Long.toBinaryString(Square._D1)
            + " | "
            + Square._D1
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._D1).hashCode());

      System.out.println("_E1: "
            + zeroPrefix[Long.toBinaryString(
                  Square._E1).length() - 1]
            + Long.toBinaryString(Square._E1)
            + " | "
            + Square._E1
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._E1).hashCode());

      System.out.println("_F1: "
            + zeroPrefix[Long.toBinaryString(
                  Square._F1).length() - 1]
            + Long.toBinaryString(Square._F1)
            + " | "
            + Square._F1
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._F1).hashCode());

      System.out.println("_G1: "
            + zeroPrefix[Long.toBinaryString(
                  Square._G1).length() - 1]
            + Long.toBinaryString(Square._G1)
            + " | "
            + Square._G1
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._G1).hashCode());

      System.out.println("_H1: "
            + zeroPrefix[Long.toBinaryString(
                  Square._H1).length() - 1]
            + Long.toBinaryString(Square._H1)
            + " | "
            + Square._H1
            + "\t Long hashcode: "
            + Long.valueOf(
                  Square._H1).hashCode());

      System.out.println();

      long x= 2000000000000000000L;

      System.out.println("                     x: "
            + zeroPrefix[Long.toBinaryString(
                  x).length() - 1]
            + Long.toBinaryString(x)
            + " | "
            + ((x)));

      System.out.println("                    -x: "
            + zeroPrefix[Long.toBinaryString(
                  -x).length() - 1]
            + Long.toBinaryString(-x)
            + " | "
            + ((-x)));

      System.out.println("lowest bit is (x & -x): "
            + zeroPrefix[Long.toBinaryString(
                  x
                        & -x).length() - 1]
            + Long.toBinaryString(x
                  & -x)
            + " | "
            + ((x & -x)));

   }
}