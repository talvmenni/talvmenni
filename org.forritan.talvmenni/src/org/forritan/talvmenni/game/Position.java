package org.forritan.talvmenni.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.forritan.talvmenni.bitboard.BitboardIterator;
import org.forritan.talvmenni.bitboard.Square;
import org.forritan.talvmenni.bitboard.Squares;
import org.forritan.talvmenni.bitboard.attacks.Bishop;
import org.forritan.talvmenni.bitboard.attacks.BlackPawn;
import org.forritan.talvmenni.bitboard.attacks.King;
import org.forritan.talvmenni.bitboard.attacks.Knight;
import org.forritan.talvmenni.bitboard.attacks.Queen;
import org.forritan.talvmenni.bitboard.attacks.Rook;
import org.forritan.talvmenni.bitboard.attacks.WhitePawn;


public interface Position {
   public Bitboard getBlack();

   public Bitboard getWhite();

   public Position getImmutable();

   public Position getMutable();

   public Position move(
         long from,
         long to);

   public Position move(
         long from,
         long to,
         int promotionPiece);

   public boolean isLegalMove(
         long from,
         long to);

   public Position pushMove(
         Bitboard white,
         Bitboard black);

   public Position popMove();

   public static interface PromotionPiece {
      public final static int      DEFAULT = 0;
      public final static int      QUEEN   = 0;
      public final static int      ROOK    = 1;
      public final static int      BISHOP  = 2;
      public final static int      KNIGHT  = 3;
      public final static String[] STRINGS = new String[] { "q", "r", "b", "n"};
   }

   public static class Move {
      public final long from;
      public final long to;

      public Move(
            long from,
            long to) {
         this.from= from;
         this.to= to;
      }

      public String toString() {
         Square sq= Squares.create();
         return sq.getSquareName(from)
               + sq.getSquareName(to);
      }

      public boolean equals(
            Move otherMove) {
         return (this.from == otherMove.from)
               && (this.to == otherMove.to);
      }

      public boolean equals(
            Object obj) {
         if (obj instanceof Move) {
            return this.equals((Move) obj);
         } else {
            return false;
         }
      }

   }

   public class Bitboard {
      
      public final static int SEED= 17;
      public final static int PRIME_FACTOR= 37;

      public final int     hashCode;

      public final boolean  whiteBoard;
      public final Position parent;

      public final long     kings;
      public final long     queens;
      public final long     rooks;
      public final long     bishops;
      public final long     knights;
      public final long     pawns;

      public final long     castling;
      public final long     enpassant;

      public final long     allPieces;

      private List<Move>    possibleMoves;
      private List<Move>    killerMoves;
      private long          allCaptureMovesAttackedSquares;
      private boolean       allCaptureMovesAttackedSquaresInitialized;
      private Boolean       kingsSideCastlingLegal;
      private Boolean       queensSideCastlingLegal;

      /**
       * @param white
       * @param parent
       * @param kings
       * @param queens
       * @param rooks
       * @param bishops
       * @param knights
       * @param pawns
       * @param castling
       * @param enpassant
       */
      public Bitboard(
            boolean whiteBoard,
            Position parent,
            long kings,
            long queens,
            long rooks,
            long bishops,
            long knights,
            long pawns,
            long castling,
            long enpassant) {
         this.whiteBoard= whiteBoard;
         this.parent= parent;
         this.kings= kings;
         this.queens= queens;
         this.rooks= rooks;
         this.bishops= bishops;
         this.knights= knights;
         this.pawns= pawns;

         this.castling= castling;
         this.enpassant= enpassant;

         this.allPieces= this.kings
               | this.queens
               | this.rooks
               | this.bishops
               | this.knights
               | this.pawns;

         int hash= SEED;
         hash= PRIME_FACTOR * hash + ((int) (this.kings ^ (this.kings >>> 32)));
         hash= PRIME_FACTOR * hash + ((int) (this.queens ^ (this.queens >>> 32)));
         hash= PRIME_FACTOR * hash + ((int) (this.rooks ^ (this.rooks >>> 32)));
         hash= PRIME_FACTOR * hash + ((int) (this.bishops ^ (this.bishops >>> 32)));
         hash= PRIME_FACTOR * hash + ((int) (this.knights ^ (this.knights >>> 32)));
         hash= PRIME_FACTOR * hash + ((int) (this.pawns ^ (this.pawns >>> 32)));
         hash= PRIME_FACTOR * hash + ((int) (this.enpassant ^ (this.enpassant >>> 32)));
         hash= PRIME_FACTOR * hash + ((int) (this.castling ^ (this.castling >>> 32)));
         hash= PRIME_FACTOR * hash + (whiteBoard ? 0 : 1);
         
         this.hashCode= hash;
      }

      public boolean equals(Object o) {
         if(o instanceof Bitboard) {
            return (this.whiteBoard == ((Bitboard) o).whiteBoard)
            && (this.kings == ((Bitboard) o).kings)
            && (this.queens == ((Bitboard) o).queens)
            && (this.rooks == ((Bitboard) o).rooks)
            && (this.bishops == ((Bitboard) o).bishops)
            && (this.knights == ((Bitboard) o).knights)
            && (this.pawns == ((Bitboard) o).pawns)
            && (this.castling == ((Bitboard) o).castling)
            && (this.enpassant == ((Bitboard) o).enpassant);
         } else {
            return false;
         }
      }
      
      public int hashCode() {
         return this.hashCode;
      }
      public void killerMove(
            Move move) {
         if (this.killerMoves == null) {
            this.killerMoves= new ArrayList<Move>();
         }
         this.killerMoves.add(
               0,
               move);
      }

      public void updatePossibleMovesOrdering() {
         if (this.possibleMoves != null
               && this.killerMoves != null) {
            List<Move> currentPossibleMoves= new ArrayList<Move>();
            currentPossibleMoves.addAll(this.possibleMoves);
            this.possibleMoves= new ArrayList<Move>();
            this.possibleMoves.addAll(this.killerMoves);
            currentPossibleMoves.removeAll(this.killerMoves);
            this.possibleMoves.addAll(currentPossibleMoves);
            this.killerMoves= null;
         }
      }

      public List<Move> getPossibleMoves() {
         if (this.possibleMoves == null) {
            this.possibleMoves= new ArrayList<Move>();

            BitboardIterator rooks= this.rooksIterator();
            while (rooks.hasNext()) {
               long fromSquare= rooks.nextBitboard();
               findMoves(
                     this.possibleMoves,
                     fromSquare,
                     new BitboardIterator(
                           Rook.attacksFrom(
                                 fromSquare,
                                 this.parent)));
            }

            BitboardIterator bishops= this.bishopsIterator();
            while (bishops.hasNext()) {
               long fromSquare= bishops.nextBitboard();
               findMoves(
                     this.possibleMoves,
                     fromSquare,
                     new BitboardIterator(
                           Bishop.attacksFrom(
                                 fromSquare,
                                 this.parent)));
            }

            BitboardIterator knights= this.knightsIterator();
            while (knights.hasNext()) {
               long fromSquare= knights.nextBitboard();
               findMoves(
                     this.possibleMoves,
                     fromSquare,
                     new BitboardIterator(
                           Knight.attacksFrom(
                                 fromSquare,
                                 this.parent)));
            }

            BitboardIterator queens= this.queensIterator();
            while (queens.hasNext()) {
               long fromSquare= queens.nextBitboard();
               findMoves(
                     this.possibleMoves,
                     fromSquare,
                     new BitboardIterator(
                           Queen.attacksFrom(
                                 fromSquare,
                                 this.parent)));
            }

            BitboardIterator pawns= this.pawnsIterator();
            while (pawns.hasNext()) {
               long fromSquare= pawns.nextBitboard();

               if (this.whiteBoard) {
                  findMoves(
                        this.possibleMoves,
                        fromSquare,
                        new BitboardIterator(
                              WhitePawn.captureMoveAttacksFrom(
                                    fromSquare,
                                    this.parent)
                                    | WhitePawn.moveAttacksFrom(
                                          fromSquare,
                                          this.parent)));
               } else {
                  findMoves(
                        this.possibleMoves,
                        fromSquare,
                        new BitboardIterator(
                              BlackPawn.captureMoveAttacksFrom(
                                    fromSquare,
                                    this.parent)
                                    | BlackPawn.moveAttacksFrom(
                                          fromSquare,
                                          this.parent)));
               }
            }
         }

         BitboardIterator kings= this.kingsIterator();
         while (kings.hasNext()) {
            long fromSquare= kings.nextBitboard();
            findMoves(
                  this.possibleMoves,
                  fromSquare,
                  new BitboardIterator(
                        King.attacksFrom(
                              fromSquare,
                              this.parent)));
         }

         if (this.isQueensSideCastlingLegal()) {
            if (this.whiteBoard) {
               this.possibleMoves.add(new Move(
                     Square._E1,
                     Square._C1));
            } else {
               this.possibleMoves.add(new Move(
                     Square._E8,
                     Square._C8));
            }
         }

         if (this.isKingsSideCastlingLegal()) {
            if (this.whiteBoard) {
               this.possibleMoves.add(new Move(
                     Square._E1,
                     Square._G1));
            } else {
               this.possibleMoves.add(new Move(
                     Square._E8,
                     Square._G8));
            }
         }

         return this.possibleMoves;
      }

      private void findMoves(
            List<Move> result,
            long fromSquare,
            BitboardIterator moves) {
         while (moves.hasNext()) {
            long toSquare= moves.nextBitboard();
            Position newPosition= this.parent.move(
                  fromSquare,
                  toSquare,
                  PromotionPiece.DEFAULT);
            if (this.whiteBoard) {
               if (!newPosition.getWhite().isChecked()) {
                  result.add(new Move(
                        fromSquare,
                        toSquare));
               }
            } else {
               if (!newPosition.getBlack().isChecked()) {
                  result.add(new Move(
                        fromSquare,
                        toSquare));
               }
            }
            this.parent.popMove();
            newPosition= null;
         }
      }

      /**
       * Is "castling kings side" (o-o) legal?
       */
      public boolean isKingsSideCastlingLegal() {

         if (this.kingsSideCastlingLegal == null) {

            boolean piecesNotMoved;

            if (whiteBoard) {
               piecesNotMoved= (this.castling & Square._E1) != Square._EMPTY_BOARD
                     && (this.castling & Square._H1) != Square._EMPTY_BOARD;
            } else {
               piecesNotMoved= (this.castling & Square._E8) != Square._EMPTY_BOARD
                     && (this.castling & Square._H8) != Square._EMPTY_BOARD;
            }

            boolean result= false;

            if (piecesNotMoved) {
               if (whiteBoard) {
                  result= ((this.parent.getBlack()
                        .getAllCaptureMovesAttackedSquares() & (Square._E1
                        | Square._F1 | Square._G1)) == Square._EMPTY_BOARD)
                        && (((this.allPieces | this.parent.getBlack().allPieces) & (Square._F1 | Square._G1)) == Square._EMPTY_BOARD);
               } else {
                  result= ((this.parent.getWhite()
                        .getAllCaptureMovesAttackedSquares() & (Square._E8
                        | Square._F8 | Square._G8)) == Square._EMPTY_BOARD)
                        && (((this.allPieces | this.parent.getWhite().allPieces) & (Square._F8 | Square._G8)) == Square._EMPTY_BOARD);
               }
            }
            this.kingsSideCastlingLegal= Boolean.valueOf(result);
         }
         return this.kingsSideCastlingLegal.booleanValue();
      }

      /**
       * Is "castling queens side" (o-o-o) legal?
       */
      public boolean isQueensSideCastlingLegal() {

         if (this.queensSideCastlingLegal == null) {

            boolean piecesNotMoved;

            if (whiteBoard) {
               piecesNotMoved= (this.castling & Square._A1) != Square._EMPTY_BOARD
                     && (this.castling & Square._E1) != Square._EMPTY_BOARD;
            } else {
               piecesNotMoved= (this.castling & Square._A8) != Square._EMPTY_BOARD
                     && (this.castling & Square._E8) != Square._EMPTY_BOARD;
            }

            boolean result= false;

            if (piecesNotMoved) {
               if (whiteBoard) {
                  result= ((this.parent.getBlack()
                        .getAllCaptureMovesAttackedSquares() & (Square._C1
                        | Square._D1 | Square._E1)) == Square._EMPTY_BOARD)
                        && (((this.allPieces | this.parent.getBlack().allPieces) & (Square._B1
                              | Square._C1 | Square._D1)) == Square._EMPTY_BOARD);
               } else {
                  result= ((this.parent.getWhite()
                        .getAllCaptureMovesAttackedSquares() & (Square._C8
                        | Square._D8 | Square._E8)) == Square._EMPTY_BOARD)
                        && (((this.allPieces | this.parent.getWhite().allPieces) & (Square._B8
                              | Square._C8 | Square._D8)) == Square._EMPTY_BOARD);
               }
            }
            this.queensSideCastlingLegal= Boolean.valueOf(result);
         }
         return this.queensSideCastlingLegal.booleanValue();
      }

      public long getAllPawnsReadyForPromotion() {
         //TODO: Implementation...
         return Square._EMPTY_BOARD;
      }

      public boolean isChecked() {
         long allSquaresUnderAttackByOppositionPieces;
         if (this.whiteBoard) {
            allSquaresUnderAttackByOppositionPieces= this.parent.getBlack()
                  .getAllCaptureMovesAttackedSquares();
         } else {
            allSquaresUnderAttackByOppositionPieces= this.parent.getWhite()
                  .getAllCaptureMovesAttackedSquares();
         }
         return (allSquaresUnderAttackByOppositionPieces & this.kings) != Squares._EMPTY_BOARD;
      }

      public BitboardIterator allPiecesIterator() {
         return new BitboardIterator(
               this.allPieces);
      }

      public BitboardIterator kingsIterator() {
         return new BitboardIterator(
               this.kings);
      }

      public BitboardIterator queensIterator() {
         return new BitboardIterator(
               this.queens);
      }

      public BitboardIterator rooksIterator() {
         return new BitboardIterator(
               this.rooks);
      }

      public BitboardIterator bishopsIterator() {
         return new BitboardIterator(
               this.bishops);
      }

      public BitboardIterator knightsIterator() {
         return new BitboardIterator(
               this.knights);
      }

      public BitboardIterator pawnsIterator() {
         return new BitboardIterator(
               this.pawns);
      }

      public boolean isAnyPieceOnPosition(
            long position) {
         return ((this.allPieces & position) != Square._EMPTY_BOARD);
      }

      public boolean isKing(
            long position) {
         return ((this.kings & position) != Square._EMPTY_BOARD);
      }

      public boolean isQueen(
            long position) {
         return ((this.queens & position) != Square._EMPTY_BOARD);
      }

      public boolean isRook(
            long position) {
         return ((this.rooks & position) != Square._EMPTY_BOARD);
      }

      public boolean isBishop(
            long position) {
         return ((this.bishops & position) != Square._EMPTY_BOARD);
      }

      public boolean isKnight(
            long position) {
         return ((this.knights & position) != Square._EMPTY_BOARD);
      }

      public boolean isPawn(
            long position) {
         return ((this.pawns & position) != Square._EMPTY_BOARD);
      }

      public boolean isEnpassant(
            long position) {
         return ((this.enpassant & position) != Square._EMPTY_BOARD);
      }

      public long getAllCaptureMovesAttackedSquares() {

         //         if(this.allCaptureMovesAttackedSquares == null) {
         if (!this.allCaptureMovesAttackedSquaresInitialized) {
            this.allCaptureMovesAttackedSquaresInitialized= true;

            long result= Square._EMPTY_BOARD;

            BitboardIterator kings= this.kingsIterator();
            while (kings.hasNext()) {
               long square= kings.nextBitboard();
               result|= King.attacksFrom(
                     square,
                     this.parent);
            }

            BitboardIterator queens= this.queensIterator();
            while (queens.hasNext()) {
               long square= queens.nextBitboard();
               result|= Queen.attacksFrom(
                     square,
                     this.parent);
            }

            BitboardIterator rooks= this.rooksIterator();
            while (rooks.hasNext()) {
               long square= rooks.nextBitboard();
               result|= Rook.attacksFrom(
                     square,
                     this.parent);
            }

            BitboardIterator bishops= this.bishopsIterator();
            while (bishops.hasNext()) {
               long square= bishops.nextBitboard();
               result|= Bishop.attacksFrom(
                     square,
                     this.parent);
            }

            BitboardIterator knights= this.knightsIterator();
            while (knights.hasNext()) {
               long square= knights.nextBitboard();
               result|= Knight.attacksFrom(
                     square,
                     this.parent);
            }

            BitboardIterator pawns= this.pawnsIterator();
            while (pawns.hasNext()) {
               if (this.whiteBoard) {
                  long square= pawns.nextBitboard();
                  result|= WhitePawn.captureMoveAttacksFrom(
                        square,
                        this.parent);
               } else {
                  long square= pawns.nextBitboard();
                  result|= BlackPawn.captureMoveAttacksFrom(
                        square,
                        this.parent);
               }
            }
            this.allCaptureMovesAttackedSquares= result;
            //         this.allCaptureMovesAttackedSquares= Long.valueOf(result);
         }
         return this.allCaptureMovesAttackedSquares;
         //         return this.allCaptureMovesAttackedSquares.longValue();
      }
   }

}