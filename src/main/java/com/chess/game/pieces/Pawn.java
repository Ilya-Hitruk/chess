package com.chess.game.pieces;

import com.chess.BoardView;

public class Pawn extends Piece {
    public Pawn(Color color) {
        super(color, PieceType.PAWN);
    }

    @Override
    public boolean canMove(BoardView board, Square from, Square to) {
        return false;
    }
}
