package org.forritan.talvmenni.bitboard.attacks;

import java.util.HashMap;
import java.util.Map;

import org.forritan.talvmenni.knowledge.ImmutablePosition;
import org.forritan.talvmenni.knowledge.Position;


public class Queen {

   public static long attacksFrom(
         long square,
         Position p) {

      return Rook.attacksFrom(
            square,
            p)
            | Bishop.attacksFrom(
                  square,
                  p);
   }
}