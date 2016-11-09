package com.company.lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anton on 09.11.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        ResumeStorage resumeStorage = new ResumeStorage();
        Resume resume = new Resume(resumeStorage.toString());

        for (; ; ) {
            System.out.println("ResumeMenu");
            System.out.println("1 - Create");
            System.out.println("2 - Read");
            System.out.println("3 - Update");
            System.out.println("4 - Delete");
            System.out.println("5 - Exit");
            System.out.print("Select action: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            try {
                Integer choice = Integer.parseInt(reader.readLine());
                switch (choice) {
                    case 1:
                        resumeStorage.save(resume);
                        break;
                    case 2:
                        resumeStorage.get(resumeStorage.toString());
                        break;
                    case 3:
                        resumeStorage.update(resume);
                        break;
                    case 4:
                        resumeStorage.delete(resumeStorage.toString());
                        break;
                    case 5:
                        System.out.println("The program is closing");
                        break;
                    default:
                        System.out.println("Wrong selection");
                        break;
                }
                if (choice == 5) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("Wrong selection! Please, select right action!");
                System.out.println();
            }
        }
    }
}
