package org.forritan.talvmenni.bitboard.attacks;

import java.util.HashMap;
import java.util.Map;

import org.forritan.talvmenni.game.Position;


public class Rook {
   
   private static Rook instance;
   private Map[] attackMaps= new Map[64];
   
   public static Rook create() {
      if(Rook.instance == null) {
         Rook.instance= new Rook();
      }
      return Rook.instance;
   }
   
   private Rook() {
      for (int i= 0; i < attackMaps.length; i++) {
         attackMaps[i]= new HashMap();
      }
   }
   
   public static long attacksFrom(long square, Position p) {
      Rook instance= Rook.create();
      long result= 0L;

      Map attackMap= instance.attackMaps[Long.numberOfLeadingZeros(square)];
      
      //FIXME: !!!! Implementation missing...
      
      return result;
   }
}