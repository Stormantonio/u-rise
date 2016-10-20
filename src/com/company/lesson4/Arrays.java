package com.company.lesson4;

/**
 * Created by Asus on 20.10.2016.
 */
public class Arrays {
    public static void main(String[] args) {

        String[] raindow = {"Красный", "Оранжевый", "Желтый", "Зеленый", "Голубой", "Синий", "Фиолетовый"};

        for (int i = 0; raindow.length / 2 > i; i++) {
            String temp = raindow[i];
            raindow[i] = raindow[raindow.length - 1 - i];
            raindow[raindow.length - 1 - i] = temp;
        }

        for (int i = 0; i < raindow.length; i++) {
            System.out.println(raindow[i]);
        }

    }
}
