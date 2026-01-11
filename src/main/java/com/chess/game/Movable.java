package com.chess.game;

import com.chess.BoardView;

/**
 * Interface for objects that can perform movement on a board.
 */
public interface Movable {

    /**
     * Checks whether a move is allowed for the object.
     *
     * @param board board state
     * @param from  source square
     * @param to    destination square
     * @return true if the move is allowed
     */
    boolean canMove(BoardView board, Square from, Square to);
}
