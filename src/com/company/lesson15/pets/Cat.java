package com.company.lesson15.pets;

import com.company.lesson15.Pet;

/**
 * Created by Anton on 09.11.2016.
 */
public class Cat extends Pet {
    public Cat() {
        setWeight(1000 + Math.random() * 2000);
    }

    public void voice() {
        super.voice();
        System.out.println("Meow");
    }

    @Override
    public String status() {
        return "Cat";
    }

    @Override
    protected void sleep() {
        System.out.println("Mur");
    }
}
