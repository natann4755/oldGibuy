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
        Comparable b = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
        ColorInterface colorInterface1 = new ColorInterface() {
            @Override
            public Color getColor() {
                return null;
            }

            @Override
            public void setColor(Color c) {

            }

            @Override
            public boolean canChangeColor() {
                return false;
            }
        };


        System.out.println(personArrayList);
        Collections.sort(personArrayList);
        System.out.println(personArrayList);
    }
}
