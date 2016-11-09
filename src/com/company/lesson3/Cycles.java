package com.company.lesson3;

/**
 * Created by Anton on 19.10.2016.
 * Вывести в консоль количество негритят оставшихся за столом от 10, и уменьшающееся в цикле.
 */
public class Cycles {
    public static void main(String[] args) {
        /*int count = 10;
        for (int i = 1; i <= count; i++) {
            System.out.println(i + " негритят из-за стола вышло");
            System.out.println(count - i + " негритят за столом осталось");
        }*/

        int blackCount = 10;
        int blackSize = blackCount;
        for (int i = 0; i < blackSize; i++) {
            System.out.println("Вышло из-за стола " + i + " За столом сидело " + blackCount--);
        }
    }
}
