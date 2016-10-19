package com.company.lesson3;

/**
 * Created by Anton on 19.10.2016.
 *
 * Была семья, в ней жило 4 брата. Известны 4 суммы возрастов любых трех из них (то есть если сложить возраст:
 * 1-го, 2-го и 3-го, то получится 30;
 * 2-го, 3-го и 4-го, то получится 32;
 * 3-го, 4-го, 1-го, то получится 32;
 * 1-го, 2-го 4-го, то получится 35.
 * Нужно установить, сколько кому лет?
 */
public class Cycles1 {
    public static void main(String[] args) {
        int minAge = 5;
        int maxAge = 15;

        for (int i = minAge; i < maxAge; i++) {
            for (int j = minAge; j < maxAge; j++) {
                for (int k = minAge; k < maxAge; k++) {
                    for (int l = minAge; l < maxAge; l++) {
                        int sum123 = i + j + k;
                        int minus23 = sum123 - i + l;
                        int minus2 = minus23 - j + i;
                        int minus3 = sum123 - k + l;
                        if (sum123 == 30 && minus23 == 32 && minus2 == 32 && minus3 == 35) {
                            System.out.println("Возраст первого брата " + i);
                            System.out.println("Возраст второго брата " + j);
                            System.out.println("Возраст третьего брата " + k);
                            System.out.println("Возраст четвертого брата " + l);
                        }
                    }
                }
            }


        }
    }
}
