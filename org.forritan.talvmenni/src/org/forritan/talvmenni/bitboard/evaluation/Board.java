package org.forritan.talvmenni.bitboard.evaluation;

import java.io.Serializable;

import org.forritan.talvmenni.bitboard.File;
import org.forritan.talvmenni.bitboard.Rank;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.Squares;


public interface Board extends Serializable {

   public static final long serialVersionUID     = 1L;

   public static final long _CORE                = (Rank._4 | Rank._5)
                                                       & (File._D | File._E);
   public static final long _INNER_BORDER        = (Rank._3
                                                       | Rank._4
                                                       | Rank._5 | Rank._6)
                                                       & (File._C
                                                             | File._D
                                                             | File._E | File._F)
                                                       & ~Board._CORE;
   public static final long _MIDDLE_BORDER       = (Rank._2
                                                       | Rank._7
                                                       | File._B | File._G)
                                                       & ~Board._OUTER_BORDER;
   public static final long _OUTER_BORDER        = Rank._1
                                                       | Rank._8
                                                       | File._A
                                                       | File._H;

   //   public static final long _KING_CENTER_SQUARES = Squares._D1 | Squares._D2
   // | Squares._E1 | Squares._E2 | Squares._F1 | Squares._F2 | Squares._D8 |
   // Squares._D7 | Squares._E8 | Squares._E7 | Squares._F8 | Squares._F7;
   public static final long _KING_CENTER_SQUARES = File._D
                                                       | File._E
                                                       | File._F;
}