package com.company.lesson6;

import com.sun.corba.se.spi.ior.IdentifiableFactory;

/**
 * Created by Asus on 24.10.2016.
 */
public class Delivery {
    public static void main(String[] args) {

        int boxes = 3000;
        int boxesInContainer = 34;
        int containersInShip = 11;

        int containers = boxes / boxesInContainer;
        int boxesBalance = boxes % boxesInContainer;
        int ships = containers / containersInShip;
        int containerBalance = containers % containersInShip;

        for (int i = 1; i <= ships; i++) {
            System.out.println();
            System.out.println("Ship " + i);
            for (int j = 1; j <= containersInShip; j++) {
                System.out.println("Container " + j);
                for (int k = 1; k <= boxesInContainer; k++) {
                    System.out.println("Box " + k);
                }
            }
        }

        if (boxesBalance != 0) {
            System.out.println();
            System.out.println("Ship " + ++ships);
            for (int i = 1; i <= containerBalance; i++) {
                System.out.println("Container " + i);
                for (int j = 1; j <= boxesInContainer; j++) {
                    System.out.println("Box " + j);
                }
            }
        }

        if (boxesBalance != 0) {
            System.out.println("Container " + ++containerBalance);
            for (int i = 1; i <= boxesBalance; i++) {
                System.out.println("Box " + i);
            }
        }
    }
}
