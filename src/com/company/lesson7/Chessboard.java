package com.company.lesson7;

/**
 * Created by Anton on 25.10.2016.
 */
public class Chessboard {
    public static void main(String[] args) {
        int whiteCell = 9989;
        int blackCell = 9724;
        int rows = 8;
        int columns = 8;

        for (int j = 0; j < rows / 2; j++) {
            for (int i = 0; i < columns; i++) {
                if (i % 2 == 0) {
                    System.out.print((char) whiteCell + " ");
                } else {
                    System.out.print((char) blackCell + " ");
                }
            }
            System.out.println();
            for (int i = 0; i < columns; i++) {
                if (i % 2 == 0) {
                    System.out.print((char) blackCell + " ");
                } else {
                    System.out.print((char) whiteCell + " ");
                }
            }
            System.out.println();
        }
    }
}
