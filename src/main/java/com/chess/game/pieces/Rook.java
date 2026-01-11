package com.chess.game.pieces;

import com.chess.BoardView;
import com.chess.Color;
import com.chess.Square;

public class Rook extends Piece {
    public Rook(Color color) {
        super(color, PieceType.ROOK);
    }

    @Override
    public boolean canMove(BoardView board, Square from, Square to) {
        return false;
    }
}
