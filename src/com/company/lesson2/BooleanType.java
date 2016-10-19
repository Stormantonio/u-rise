package com.company.lesson2;

import java.nio.charset.MalformedInputException;

/**
 * Created by Asus on 19.10.2016.
 */
public class BooleanType {

    public static void main(String[] args) {

        int ageMisha = 21;
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
        System.out.println("Most young man - " + mostYounger);
    }

}
