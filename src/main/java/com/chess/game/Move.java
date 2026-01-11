package com.chess.game;

import com.chess.pieces.PieceType;

/**
 * Represents a single move in a chess game.
 */
public class Move {
    private final Square from;
    private final Square to;
    private final PieceType promotionTo;

    public Move(Square from, Square to, PieceType promotionTo) {
        this.from = from;
        this.to = to;
        this.promotionTo = promotionTo;
    }

    public Square getFrom() {
        return from;
    }

    public Square getTo() {
        return to;
    }

    public PieceType getPromotionTo() {
        return promotionTo;
    }
}