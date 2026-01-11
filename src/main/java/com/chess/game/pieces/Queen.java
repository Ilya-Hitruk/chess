package com.chess.game.pieces;

import com.chess.BoardView;

public class Queen extends Piece {
    public Queen(Color color) {
        super(color, PieceType.QUEEN);
    }

    @Override
    public boolean canMove(BoardView board, Square from, Square to) {
        return false;
    }
}
