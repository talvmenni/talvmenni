package org.forritan.talvmenni.bitboard.attacks;

import java.util.HashMap;
import java.util.Map;

import org.forritan.talvmenni.game.Position;


public class Queen {
   
   private static Map[] attackMaps= new Map[64];
   
   static {
      for (int i= 0; i < attackMaps.length; i++) {
         attackMaps[i]= new HashMap();
      }
   }
   
   public static long attacksFrom(long square, Position p) {
      long result= 0L;

      Map attackMap= attackMaps[Long.numberOfLeadingZeros(square)];
      
      
      
      return result;
   }
}