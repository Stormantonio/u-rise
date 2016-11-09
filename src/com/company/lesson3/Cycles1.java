package com.company.lesson3;

/**
 * Created by Anton on 19.10.2016.
 * Выяснить возраст всех 4-х братьев, сумма 3 - х  из которых поочередно,  - 30, 32, 32, 35
 * <p>
 * Была семья, в ней жило 4 брата. Известны 4 суммы возрастов любых трех из них (то есть если сложить возраст:
 * 1-го, 2-го и 3-го, то получится 30;
 * 2-го, 3-го и 4-го, то получится 32;
 * 3-го, 4-го, 1-го, то получится 32;
 * 1-го, 2-го 4-го, то получится 35.
 * Нужно установить, сколько кому лет?
 */
public class Cycles1 {
    public static void main(String[] args) {
        /*int minAge = 5;
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
        }*/

        // какой-то человек очень классно решил задачу
        double[] otvmas = {30, 32, 32, 35};
        int min = 5;
        int max = 15;
        int sum123 = 0, sum234 = 0, sum341 = 0, sum412 = 0;

        for (int i = min; i < max; i++) {
            for (int j = min; j < max; j++) {
                for (int k = min; k < max; k++) {
                    for (int l = min; l < max; l++) {
                        sum123 = i + j + k;
                        sum234 = j + k + l;
                        sum341 = k + l + i;
                        sum412 = l + i + j;
                        if (sum123 == otvmas[0] && sum234 == otvmas[1] && sum341 == otvmas[2] && sum412 == otvmas[3]) {
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
