package org.forritan.talvmenni.bitboard.evaluation;

import org.forritan.talvmenni.bitboard.File;
import org.forritan.talvmenni.bitboard.Rank;

public interface Board {
   
   public static final long _CORE = (Rank._4 | Rank._5) & (File._D | File._E);
   public static final long _INNER_BORDER = (Rank._3 | Rank._4 | Rank._5 | Rank._6 ) & (File._C | File._D | File._E | File._F) & ~Board._CORE;
   public static final long _MIDDLE_BORDER = (Rank._2 | Rank._7 | File._B | File._G ) & ~Board._OUTER_BORDER;
   public static final long _OUTER_BORDER = Rank._1 | Rank._8 | File._A | File._H;

}
