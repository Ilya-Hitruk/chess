package com.chess.game.pieces;

import com.chess.BoardView;
import com.chess.Color;
import com.chess.Movable;
import com.chess.Square;

/**
 * Base abstract class for all chess pieces.
 */
public abstract class Piece implements Movable {
    private final Color color;
    private final PieceType type;

    protected Piece(Color color, PieceType type) {
        this.color = color;
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public PieceType getType() {
        return type;
    }

    /**
     * Checks whether the piece can move from one square to another.
     */
    @Override
    public abstract boolean canMove(BoardView board, Square from, Square to);
}
