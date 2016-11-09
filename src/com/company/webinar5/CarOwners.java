package com.company.webinar5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

/**
 * Created by Anton on 09.11.2016.
 * Написать программу, которая будет выдавать имя владельца автомобиля по его номеру.
 * Программа должна быть умной: если у неё в памяти номера нет, она должна попросить ввести его имя и запомнить.
 */
public class CarOwners {
    public static void main(String[] args) throws IOException {
        TreeMap<String, String> cars = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number;
        for (; ; ) {
            System.out.println("Введите номер автомобиля:");
            number = reader.readLine().toUpperCase().trim();
            if (cars.size() == 0) {
                System.out.println("В базе нет ни одного автомобиля!");
            } else if (cars.containsKey(number)) {
            }
        }
    }
}
