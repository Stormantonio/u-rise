package com.company.lesson4;

/**
 * Created by Asus on 20.10.2016.
 */
public class Chess {
    public static void main(String[] args) {

        System.out.println("Мое решение:");
        String[] rows = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] columns = {"1", "2", "3", "4", "5", "6", "7", "8"};
        String[][] chessCells = new String[rows.length][columns.length];
        for (int i = columns.length - 1; i >= 0; i--) {
            for (int j = 0; j < rows.length; j++) {
                chessCells[j][i] = rows[j] + columns[i];
                System.out.print("|" + chessCells[j][i]);
                if (rows[j] == rows[rows.length - 1]) {
                    System.out.println("|");
                    System.out.println("________________________");
                }
            }
        }

        System.out.println();
        System.out.println("Решение с вебинара:");
        String[][] chessBoard = new String[8][8];
        String letters = "abcdefgh";
        for (int i = 0; i < chessBoard.length; i++) {
            System.out.print("|");
            for (int j = 0; j < chessBoard[i].length; j++) {
                chessBoard[i][j] = "" + letters.charAt(j) + (8 - i) + "|";
                System.out.print(chessBoard[i][j]);
            }
            System.out.println("\n-------------------------");
        }

        System.out.println();
        System.out.println("Решение с другого вебинара:");
        int boardSize = 8;
        String[] s = {"a", "b", "c", "d", "e", "f", "g", "h"};
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(s[j] + (boardSize - i) + "|");
            }
            System.out.println();
            System.out.println("------------------------");
        }

    }
}
