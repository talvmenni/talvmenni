package org.forritan.talvmenni.evaluation;

import org.forritan.talvmenni.game.ImmutablePosition;
import org.forritan.talvmenni.game.Position;

public interface Evaluation {
   
   public static final int KING= 11180;
   public static final int QUEEN= 980;
   public static final int ROOK= 520;
   public static final int BISHOP= 330;
   public static final int KNIGHT= 330;
   public static final int PAWN= 100;

   public static final int POSITION_CORE= 20;
   public static final int POSITION_INNER_BORDER= 16;
   public static final int POSITION_MIDDLE_BORDER= 14;
   public static final int POSITION_OUTER_BORDER= 12;

   public static final int POSITION_GUARD_REWARD= 10;
   public static final int CHECK_REWARD = 30;

   public int getScore(Position position);
   
}
