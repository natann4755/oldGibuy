package com.interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class MyMain {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(70));
        people.add(new Person(90));
        people.add(new Person(80));

        System.out.println(people);
        Collections.sort(people);

        System.out.println(people);
    }
}
