package com.interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class MyMain {

    public static void main(String[] args) {
        ColorInterface colorInterface = new Car();

        ArrayList<Comparable> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("a" , 90));
        personArrayList.add(new Person("c" , 70));
        personArrayList.add(new Person("b" , 80));


        System.out.println(personArrayList);
        Collections.sort(personArrayList);
        System.out.println(personArrayList);
    }
}
