package com.chess.game;

/**
 * Represents a single square on a chessboard.
 * Uses standard chess notation: file (a-h) and rank (1-8).
 */
public class Square {
    private final char file;
    private final int rank;

    public Square(char file, int rank) {
        this.file = file;
        this.rank = rank;
    }

    public char getFile() {
        return file;
    }

    public int getRank() {
        return rank;
    }
}
