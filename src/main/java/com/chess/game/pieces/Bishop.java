package com.chess.game.pieces;

import com.chess.BoardView;

public class Bishop extends Piece {
    public Bishop(Color color) {
        super(color, PieceType.BISHOP);
    }

    @Override
    public boolean canMove(BoardView board, Square from, Square to) {
        return false;
    }
}
