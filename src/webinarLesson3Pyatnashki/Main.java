package webinarLesson3Pyatnashki;

import java.util.Scanner;

/**
 * Created by Anton on 25.10.2016.
 */
public class Main {
    static int maxElem;
    static int[][] tag;

    public static void main(String[] args) {

        int tagEdge = 6;
        int tagPole = tagEdge*tagEdge;
        maxElem = tagPole;
        tag = new int[tagPole][tagPole];
        int[] tags = new int[tagPole];
        int numCounter = 0;
        for (int i = 0; i < tag.length; i++) {
            for (int j = 0; j < tag[i].length; j++) {
                int randNum = 0;
                do {
                    randNum = 1 + (int)(Math.random() * tagPole);
                } while (elementExist(randNum, tags));
                tags[numCounter++] = randNum;
                tag[i][j] = randNum;
            }
        }
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("Введите число ;)");
            int num = Integer.parseInt(reader.nextLine());
            //shiftArr(tag, num);
        } while (true);

    }
    public static boolean elementExist(int elem, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem)
                return true;
        }
        return false;
    }

    public static void printTag(int[][] array) {

    }
}
