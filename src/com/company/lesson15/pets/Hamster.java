package com.company.lesson15.pets;

import com.company.lesson15.Pet;

/**
 * Created by Anton on 09.11.2016.
 */
public class Hamster extends Pet {
    public Hamster() {
        setWeight(50 + Math.random() * 100);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("chik-chirik-chik-chik");
    }

    @Override
    public String status() {
        return "Hamster";
    }

    @Override
    protected void sleep() {
        System.out.println("fr-fr-fr");
    }
}
