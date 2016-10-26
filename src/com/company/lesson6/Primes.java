package com.company.lesson6;

/**
 * Created by Asus on 24.10.2016.
 */
public class Primes {
    public static void main(String[] args) {

        // Неправильное решение
        /*for (int i = 1; i < 10000; i++) {
            if (i == 1 || i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                if (i == 2 || i == 3 || i == 5 || i == 7) {
                    System.out.println(i);
                }
                continue;
            }
            System.out.println(i);
        }*/

        int min = 2;
        int max = 10000;
        boolean kr;
        int count = 0;

        for (int i = min; i < max; i ++) {
            kr = true;
            for (int j = min; j < (i - 1); j++) {
                if (i % j == 0) {
                    kr = false;
                    continue;
                }
            }
            if (kr) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Всего простых чисел в диапазоне от " + min + " - " + max + ": " + count);
    }
}