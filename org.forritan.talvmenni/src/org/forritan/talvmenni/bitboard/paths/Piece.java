package org.forritan.talvmenni.bitboard.paths;

import java.io.Serializable;

public interface Piece extends Serializable {
   
   public static final long serialVersionUID = 1L; 
   
   public long getPathsFrom(
         long square);
}