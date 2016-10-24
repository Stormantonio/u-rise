package com.company.lesson6;

/**
 * Created by Asus on 24.10.2016.
 */
public class Primes {
    public static void main(String[] args) {
        for (int i = 1; i < 10000; i++) {
            if (i == 1 || i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                if (i == 2 || i == 3 || i == 5 || i == 7) {
                    System.out.println(i);
                }
                continue;
            }
            System.out.println(i);
        }
    }
}