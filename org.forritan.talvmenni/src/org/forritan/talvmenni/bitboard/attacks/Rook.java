package org.forritan.talvmenni.bitboard.attacks;

import java.util.Map;


public class Rook {

   public static class Rank {
      
      private static Map rankAttacksFromA1;
      
      public static long attacksFromA1(long boardposition){
         return ((Long)Rank.rankAttacksFromA1.get(new Long(boardposition))).longValue();
      }

   }

   public static class File {

   }
}