package com.chess.game.pieces;

import com.chess.BoardView;

public class Knight extends Piece {
    public Knight(Color color) {
        super(color, PieceType.KNIGHT);
    }

    @Override
    public boolean canMove(BoardView board, Square from, Square to) {
        return false;
    }
}
