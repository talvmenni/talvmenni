package org.forritan.talvmenni.evaluation;

import java.io.Serializable;

import org.forritan.talvmenni.game.Position;

public interface Evaluation extends Serializable {
   
   public static final long serialVersionUID = 1L; 
         
// Standard values... 
   public static final int QUEEN= 980;
   public static final int ROOK= 520;
   public static final int BISHOP= 330;
   public static final int KNIGHT= 330;
   public static final int PAWN= 100;
   
   public static final int KING= 9 * QUEEN + 2 * ROOK + 2 * BISHOP + 2 * KNIGHT;
   public static final int CHECKMATE_SCORE = 2 * KING;

   public static final int POSITION_CORE= 20;
   public static final int POSITION_INNER_BORDER= 16;
   public static final int POSITION_MIDDLE_BORDER= 14;
   public static final int POSITION_OUTER_BORDER= 12;

   public static final int POSITION_GUARD_REWARD= 10;
   public static final int CHECK_REWARD = 30;

// Experimental values... powers of two... 
//   public static final int QUEEN= 1024;
//   public static final int ROOK= 512;
//   public static final int BISHOP= 256;
//   public static final int KNIGHT= 256;
//   public static final int PAWN= 128;
//   
//   public static final int KING= 9 * QUEEN + 2 * ROOK + 2 * BISHOP + 2 * KNIGHT;
//   public static final int CHECKMATE_SCORE = 2 * KING;
//
//   public static final int POSITION_CORE= 32;
//   public static final int POSITION_INNER_BORDER= 16;
//   public static final int POSITION_MIDDLE_BORDER= 8;
//   public static final int POSITION_OUTER_BORDER= 4;
//
//   public static final int POSITION_GUARD_REWARD= 16;
//   public static final int CHECK_REWARD = 32;

// Experimental values... only primes
//   public static final int QUEEN= 983;
//   public static final int ROOK= 521;
//   public static final int BISHOP= 331;
//   public static final int KNIGHT= 331;
//   public static final int PAWN= 101;
//   
//   public static final int KING= 9 * QUEEN + 2 * ROOK + 2 * BISHOP + 2 * KNIGHT + 1;
//   public static final int CHECKMATE_SCORE = 2 * KING + 3;
//
//   public static final int POSITION_CORE= 23;
//   public static final int POSITION_INNER_BORDER= 19;
//   public static final int POSITION_MIDDLE_BORDER= 13;
//   public static final int POSITION_OUTER_BORDER= 11;
//
//   public static final int POSITION_GUARD_REWARD= 17;
//   public static final int CHECK_REWARD = 31;
   
// Experimental freak values...          
//   public static final int QUEEN= 4;
//   public static final int ROOK= 3;
//   public static final int BISHOP= 2;
//   public static final int KNIGHT= 2;
//   public static final int PAWN= 1;
//
//   public static final int KING= 9 * QUEEN + 2 * ROOK + 2 * BISHOP + 2 * KNIGHT;
//   public static final int CHECKMATE_SCORE = 2 * KING;
//
//   public static final int POSITION_CORE= 20;
//   public static final int POSITION_INNER_BORDER= 18;
//   public static final int POSITION_MIDDLE_BORDER= 14;
//   public static final int POSITION_OUTER_BORDER= 12;
//
//   public static final int POSITION_GUARD_REWARD= 17;
//   public static final int CHECK_REWARD = 31;
   

   public int getScore(Position position);
   
}
