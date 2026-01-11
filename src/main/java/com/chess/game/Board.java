package com.chess.game;

import com.chess.BoardView;
import com.chess.Square;
import com.chess.pieces.Piece;

/**
 * Represents a chessboard.
 * Stores and manages chess pieces.
 */
public class Board implements BoardView {
    private Piece[][] cells;

    public Board() {
        this.cells = new Piece[8][8];
    }

    /**
     * todo: Implementation
     */
    @Override
    public Piece getPiece(Square square) {return null;}

    /**
     * todo: Implementation
     */
    @Override
    public boolean isEmpty(Square square) {return false;}

    /**
     * todo: Implementation
     */
    public void setPiece(Square square, Piece piece) {

    }

    /**
     * todo: Implementation
     */
    public void movePiece(Square from, Square to) {}
}
