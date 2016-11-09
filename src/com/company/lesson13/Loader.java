package com.company.lesson13;

/**
 * Created by Anton on 09.11.2016.
 * - придумайте несколько методов у домашних животных, придумайте для этих методов общие  и различные части
 */
public class Loader {
    public static void main(String[] args) {
        Dog tuzik = new Dog();
        Cat murzik = new Cat();
        tuzik.size();
        tuzik.color();
        tuzik.sex();
        tuzik.weight();
        murzik.size();
        murzik.color();
        murzik.sex();
        murzik.weight();
    }
}
