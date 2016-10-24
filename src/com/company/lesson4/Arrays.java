package com.company.lesson4;

/**
 * Created by Asus on 20.10.2016.
 */
public class Arrays {
    public static void main(String[] args) {

        String[] rainbow = {"Красный", "Оранжевый", "Желтый", "Зеленый", "Голубой", "Синий", "Фиолетовый"};

        for (int i = 0; rainbow.length / 2 > i; i++) {
            String temp = rainbow[i];
            rainbow[i] = rainbow[rainbow.length - 1 - i];
            rainbow[rainbow.length - 1 - i] = temp;
        }

        for (int i = 0; i < rainbow.length; i++) {
            System.out.println(rainbow[i]);
        }

    }
}
