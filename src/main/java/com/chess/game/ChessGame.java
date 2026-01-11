package com.chess.game;

import com.chess.Game;
import com.chess.GameStatus;
import com.chess.Move;

import java.util.List;

/**
 * Main class representing a chess game.
 * Controls game flow, players, and board state.
 */
public class ChessGame implements Game {
    private Board board;
    private Player whitePlayer;
    private Player blackPlayer;
    private Color turn;
    private GameStatus status;
    private List<Move> history;

    public ChessGame(Board board, Player whitePlayer, Player blackPlayer, List<Move> history) {
        this.board = board;
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
        this.history = history;
        this.turn = Color.WHITE;
        this.status = GameStatus.IN_PROGRESS;
    }

    /**
     * todo: Implementation
     */
    @Override
    public void start() {}

    /**
     * todo: Implementation
     */
    @Override
    public boolean makeMove(Move move) {return false;}

    /**
     * todo: Implementation
     */
    @Override
    public void resign(Color color) {}
}
