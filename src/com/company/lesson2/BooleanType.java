package com.company.lesson2;

import java.nio.charset.MalformedInputException;

/**
 * Created by Asus on 19.10.2016.
 * Правильно определить возрасты людей не смотря на то, что они могут меняться
 */
public class BooleanType {

    public static void main(String[] args) {

        // Мой код
        /*int ageMisha = 21;
        int ageVasya = 25;
        int ageVadim = 17;

        int max = 0;
        int middle = 0;
        int mostYounger = 0;

        if (ageMisha > ageVasya && ageMisha > ageVadim) {
            max = ageMisha;
        } else if (ageVasya > ageMisha && ageVasya > ageVadim) {
            max = ageVasya;
        } else max = ageVadim;

        if (max == ageMisha) {
            if (ageVasya > ageVadim) {
                middle = ageVasya;
            } else middle = ageVadim;
        } else if (max == ageVasya) {
            if (ageMisha > ageVadim) {
                middle = ageMisha;
            } else middle = ageVadim;
        } else if (max == ageVadim) {
            if (ageMisha > ageVasya) {
                middle = ageMisha;
            } else middle = ageVasya;
        }

        if (ageMisha != max && ageMisha != middle) {
            mostYounger = ageMisha;
        } else if (ageVasya != max && ageVasya != middle) {
            mostYounger = ageVasya;
        } else mostYounger = ageVadim;

        System.out.println("Oldest man - " + max);
        System.out.println("Middle age man - " + middle);
        System.out.println("Most young man - " + mostYounger);/*/


        // код Стаса
        Integer dimaAge = 35;
        Integer mishaAge = 50;
        Integer vasyaAge = 65;

        Integer oldest = 0;
        Integer youngest = 0;
        Integer middle = 0;

        if (dimaAge <= mishaAge && dimaAge <= vasyaAge) {
            youngest = dimaAge;
            if (mishaAge <= vasyaAge) {
                middle = mishaAge;
                oldest = vasyaAge;
            } else {
                middle = vasyaAge;
                oldest = mishaAge;
            }
        }
        if (mishaAge <= dimaAge && mishaAge <= vasyaAge) {
            youngest = mishaAge;
            if (dimaAge <= vasyaAge) {
                middle = dimaAge;
                oldest = vasyaAge;
            } else {
                middle = vasyaAge;
                oldest = dimaAge;
            }
        }
        if (vasyaAge <= dimaAge && vasyaAge <= mishaAge) {
            youngest = vasyaAge;
            if (dimaAge <= mishaAge) {
                middle = dimaAge;
                oldest = mishaAge;
            } else {
                middle = mishaAge;
                oldest = dimaAge;
            }
        }
        System.out.println("Oldest man - " + oldest);
        System.out.println("Middle age man - " + middle);
        System.out.println("Most young man - " + youngest);
    }
}