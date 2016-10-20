package com.company.lesson4;

/**
 * Created by Asus on 20.10.2016.
 */
public class Chess {
    public static void main(String[] args) {

        String[] rows = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] columns = {"1", "2", "3", "4", "5", "6", "7"};

        String[][] chessCells = new String[8][8];


        for (int i = 0; i < rows.length; i++) {

            for (int j = 0; j < columns.length; j++) {
                chessCells[i][j] = rows[i] + columns[j];

                System.out.print(chessCells[i][j]);

                break;
            }
                /*if (columns[j] == columns[columns.length - 1]) {
                    System.out.println();
                    System.out.println("_____");*/
                if (rows[i] == rows[rows.length - 1]) {
                    System.out.println();
                    System.out.println("________________");
                }

            }
        }

    }
//}
