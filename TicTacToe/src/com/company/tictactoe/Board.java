package com.company.tictactoe;

import com.company.tictactoe.piece.Piece;

public class Board {
    private int xSize;
    private int ySize;
    char[][] board;

    public Board(int xSize, int ySize) {
        this.xSize = xSize;
        this.ySize = ySize;
        board = new char[xSize][ySize];
    }

    public void put(int fieldIndex, Piece piece) {
        int index = 1;
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                if (index == fieldIndex) {
                    board[x][y] = piece.getSign();
                }
                index++;
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        int index = 1;
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                if(board[x][y] != '\u0000') {
                    result += "[" + board[x][y] + "]";
                } else {
                    result += "[" + index + "]";
                }
                index++;
            }
            result += "\n";
        }

        return result;
    }
}