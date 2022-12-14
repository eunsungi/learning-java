package com.eunsungi;

import java.time.LocalDate;

public class ReferenceDataTypes {
    public static void main(String[] args) {
        String name = new String("Eunsung");
        System.out.println(name.toUpperCase());

        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());

        // Differences
        int a = 10;
        int b = a; // copy
        a = 100;
        System.out.println("a = " + a + " - b = " + b);

        Person erin = new Person("erin");
        Person mary = erin;
        System.out.println("before changing erin");
        System.out.println(erin.name + "-" + mary.name);

        System.out.println("after changing erin");
        erin.name = "apple";
        System.out.println(erin.name + "-" + mary.name);
    }

    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }
    }

}
