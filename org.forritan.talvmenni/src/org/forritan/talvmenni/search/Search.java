package org.forritan.talvmenni.search;

import java.util.List;
import java.util.Observable;

import org.forritan.talvmenni.evaluation.Evaluation;
import org.forritan.talvmenni.game.Position;

public interface Search {
   
   public List<Position.Move> getBestMoves(Position p, Evaluation e, boolean whiteMove);
   
   public Observable getObservable();

}
