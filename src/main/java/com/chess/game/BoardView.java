package com.chess.game;

import com.chess.pieces.Piece;

/**
 * Read-only view of the chess board.
 * Used to prevent modification of the board state by pieces.
 */
public interface BoardView {

    /**
     * Returns the piece located on the given square.
     *
     * @param square board square
     * @return piece on the square or null if empty
     */
    Piece getPiece(Square square);

    /**
     * Checks whether a square is empty.
     *
     * @param square board square
     * @return true if no piece is located on the square
     */
    boolean isEmpty(Square square);
}
