package com.company.lesson3;

/**
 * Created by Anton on 19.10.2016.
 */
public class Cycles {
    public static void main(String[] args) {
        int count = 10;
        for (int i = 1; i <= count; i++) {
            System.out.println(i + " негритят из-за стола вышло");
            System.out.println(count - i + " негритят за столом осталось");
        }
    }
}
