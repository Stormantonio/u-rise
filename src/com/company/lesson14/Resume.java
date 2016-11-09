package com.company.lesson14;

/**
 * Created by Anton on 09.11.2016.
 */
public class Resume {
    // unique identifier
    private String uuid;

    /*private String fio;
        private boolean sex;
        private int age;*/

    public Resume(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return uuid;
    }
}
