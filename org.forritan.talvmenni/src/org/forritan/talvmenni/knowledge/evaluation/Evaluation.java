package org.forritan.talvmenni.knowledge.evaluation;

import java.io.Serializable;

import org.forritan.talvmenni.bitboard.attacks.Bishop;
import org.forritan.talvmenni.knowledge.Position;


public interface Evaluation extends Serializable {

   public static final long serialVersionUID                       = 1L;

   public static final int  DRAW_BY_THREE_TIMES_REPETITION         = 0;

   // Standard values...
   public static final int  QUEEN_IN_OPENING_GAME                  = 980;
   public static final int  QUEEN_IN_MIDDLE_GAME                   = 980;
   public static final int  QUEEN_IN_END_GAME                      = 980;

   public static final int  ROOK_IN_OPENING_GAME                   = 520;
   public static final int  ROOK_IN_MIDDLE_GAME                    = 520;
   public static final int  ROOK_IN_END_GAME                       = 520;

   public static final int  BISHOP_IN_OPENING_GAME                 = 330;
   public static final int  BISHOP_IN_MIDDLE_GAME                  = 330;
   public static final int  BISHOP_IN_END_GAME                     = 330;

   public static final int  KNIGHT_IN_OPENING_GAME                 = 330;
   public static final int  KNIGHT_IN_MIDDLE_GAME                  = 330;
   public static final int  KNIGHT_IN_END_GAME                     = 330;

   public static final int  PAWN_IN_OPENING_GAME                   = 100;
   public static final int  PAWN_IN_MIDDLE_GAME                    = 100;
   public static final int  PAWN_IN_END_GAME                       = 100;

   public static final int  KING_IN_OPENING_GAME                   = 9
                                                                         * QUEEN_IN_OPENING_GAME
                                                                         + 2
                                                                         * ROOK_IN_OPENING_GAME
                                                                         + 2
                                                                         * BISHOP_IN_OPENING_GAME
                                                                         + 2
                                                                         * KNIGHT_IN_OPENING_GAME;
   public static final int  KING_IN_MIDDLE_GAME                    = 9
                                                                         * QUEEN_IN_MIDDLE_GAME
                                                                         + 2
                                                                         * ROOK_IN_MIDDLE_GAME
                                                                         + 2
                                                                         * BISHOP_IN_MIDDLE_GAME
                                                                         + 2
                                                                         * KNIGHT_IN_MIDDLE_GAME;
   public static final int  KING_IN_END_GAME                       = 9
                                                                         * QUEEN_IN_END_GAME
                                                                         + 2
                                                                         * ROOK_IN_END_GAME
                                                                         + 2
                                                                         * BISHOP_IN_END_GAME
                                                                         + 2
                                                                         * KNIGHT_IN_END_GAME;

   public static final int  CHECKMATE_SCORE                        = 2 * KING_IN_OPENING_GAME;
   public static final int  CHECKMATE_SCORE_IN_OPENING_GAME        = 2 * KING_IN_OPENING_GAME;
   public static final int  CHECKMATE_SCORE_IN_MIDDLE_GAME         = 2 * KING_IN_MIDDLE_GAME;
   public static final int  CHECKMATE_SCORE_IN_END_GAME            = 2 * KING_IN_END_GAME;

   public static final int  POSITION_CORE_IN_OPENING_GAME          = 20;
   public static final int  POSITION_CORE_IN_MIDDLE_GAME           = 20;
   public static final int  POSITION_CORE_IN_END_GAME              = 20;

   public static final int  POSITION_INNER_BORDER_IN_OPENING_GAME  = 16;
   public static final int  POSITION_INNER_BORDER_IN_MIDDLE_GAME   = 16;
   public static final int  POSITION_INNER_BORDER_IN_END_GAME      = 16;

   public static final int  POSITION_MIDDLE_BORDER_IN_OPENING_GAME = 14;
   public static final int  POSITION_MIDDLE_BORDER_IN_MIDDLE_GAME  = 14;
   public static final int  POSITION_MIDDLE_BORDER_IN_END_GAME     = 14;

   public static final int  POSITION_OUTER_BORDER_IN_OPENING_GAME  = 12;
   public static final int  POSITION_OUTER_BORDER_IN_MIDDLE_GAME   = 12;
   public static final int  POSITION_OUTER_BORDER_IN_END_GAME      = 12;

   public static final int  POSITION_GUARD_REWARD_IN_OPENING_GAME  = 10;
   public static final int  POSITION_GUARD_REWARD_IN_MIDDLE_GAME   = 10;
   public static final int  POSITION_GUARD_REWARD_IN_END_GAME      = 10;

   public static final int  CHECK_REWARD_IN_OPENING_GAME           = 30;
   public static final int  CHECK_REWARD_IN_MIDDLE_GAME            = 30;
   public static final int  CHECK_REWARD_IN_END_GAME               = 30;

   public static final int  KING_CENTER_REWARD_IN_OPENING_GAME    = -60;
   public static final int  KING_CENTER_REWARD_IN_MIDDLE_GAME     = -30;
   public static final int  KING_CENTER_REWARD_IN_END_GAME        = 50;

   public static final int  ALL_PIECES_INITIAL_KING_EXCLUSIVE      = QUEEN_IN_OPENING_GAME
                                                                         + 2
                                                                         * ROOK_IN_OPENING_GAME
                                                                         + 2
                                                                         * BISHOP_IN_OPENING_GAME
                                                                         + 2
                                                                         * KNIGHT_IN_OPENING_GAME
                                                                         + 8
                                                                         * PAWN_IN_OPENING_GAME;

   public static final int  MIDDLE_GAME_WHEN_BELOW                 = ALL_PIECES_INITIAL_KING_EXCLUSIVE - 1000;
   public static final int  END_GAME_WHEN_BELOW                    = ALL_PIECES_INITIAL_KING_EXCLUSIVE - 2000;

   // Experimental values... powers of two...
   //   public static final int QUEEN= 1024;
   //   public static final int ROOK= 512;
   //   public static final int BISHOP= 256;
   //   public static final int KNIGHT= 256;
   //   public static final int PAWN= 128;
   //   
   //   public static final int KING= 9 * QUEEN + 2 * ROOK + 2 * BISHOP + 2 *
   // KNIGHT;
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
   //   public static final int KING= (9 * QUEEN) + (2 * ROOK) + (2 * BISHOP) + (2
   // * KNIGHT) + 2;
   //   public static final int CHECKMATE_SCORE = (2 * KING) + 3;
   //
   //   public static final int POSITION_CORE= 23;
   //   public static final int POSITION_INNER_BORDER= 19;
   //   public static final int POSITION_MIDDLE_BORDER= 13;
   //   public static final int POSITION_OUTER_BORDER= 11;
   //
   //   public static final int POSITION_GUARD_REWARD= 17;
   //   public static final int CHECK_REWARD = 31;
   //
   //   public static final int KING_CENTER_PENALTY = -30;

   // Experimental freak values...
   //   public static final int QUEEN= 4;
   //   public static final int ROOK= 3;
   //   public static final int BISHOP= 2;
   //   public static final int KNIGHT= 2;
   //   public static final int PAWN= 1;
   //
   //   public static final int KING= 9 * QUEEN + 2 * ROOK + 2 * BISHOP + 2 *
   // KNIGHT;
   //   public static final int CHECKMATE_SCORE = 2 * KING;
   //
   //   public static final int POSITION_CORE= 20;
   //   public static final int POSITION_INNER_BORDER= 18;
   //   public static final int POSITION_MIDDLE_BORDER= 14;
   //   public static final int POSITION_OUTER_BORDER= 12;
   //
   //   public static final int POSITION_GUARD_REWARD= 17;
   //   public static final int CHECK_REWARD = 31;

   public int getScore(
         Position position, boolean whiteToMove);

   public int getGameFase(
         Position position, boolean whiteToMove);
  
   public static interface GameFase {
      public static final int OPENING_GAME= 1;
      public static final int MIDDLE_GAME= 2;
      public static final int END_GAME= 3;
   }
}