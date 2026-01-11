package com.chess.game.pieces;

import com.chess.BoardView;
import com.chess.Color;
import com.chess.Square;

public class King extends Piece {
    public King(Color color) {
        super(color, PieceType.KING);
    }

    @Override
    public boolean canMove(BoardView board, Square from, Square to) {
        return false;
    }
}
