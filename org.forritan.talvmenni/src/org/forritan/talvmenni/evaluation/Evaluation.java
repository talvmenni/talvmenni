package org.forritan.talvmenni.evaluation;

import org.forritan.talvmenni.game.Position;

public interface Evaluation {
   
   public static final int KING= 0;
   public static final int QUEEN= 900;
   public static final int ROOK= 500;
   public static final int BISHOP= 300;
   public static final int KNIGHT= 300;
   public static final int PAWN= 100;

   public int getScore(Position position);
   
}
