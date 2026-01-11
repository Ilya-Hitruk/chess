package com.chess.game;

import com.chess.Move;

/**
 * High-level interface for a board game.
 * Defines basic game operations.
 */
public interface Game {
    /**
     * Starts a new game.
     */
    void start();


    /**
     * Performs a move in the game.
     *
     * @param move move to be performed
     * @return true if the move was successful, false otherwise
     */
    boolean makeMove(Move move);


    /**
     * Ends the game due to player resignation.
     *
     * @param color color of the player who resigns
     */
    void resign(Color color);
}