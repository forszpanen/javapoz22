package com.company.tictactoe;

import com.company.tictactoe.board.Board;
import com.company.tictactoe.board.InvalidFieldIndex;

public class Judge {
    private Board board;

    public Judge(Board board) {
        this.board = board;
    }

    public boolean checkMove(int fieldIndex) {
        try {
            return board.getField(fieldIndex).isEmpty();
        } catch (InvalidFieldIndex e) {
            return false;
        }
    }

    public boolean isGameOver() {
        return isWin() || board.isFull();
    }

    private boolean isWin() {

    }
}