package com.lists;

//import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyClass {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(1);
        integers.add(9);
        integers.add(4);

        Collections.sort(integers);
        Collections.shuffle(integers);
        Collections.swap(integers, 0, 2);
        System.out.println(integers);

        integers.remove(2);
        System.out.println(integers);
    }

    public static void main(String[] args) {
        String[] array = {"", ""};
        array = new String[5];

        ArrayList<String> list = new ArrayList<>();
        list.add("Avi");
        list.add("Shalal");
//        list.set(0, "Haim");
        list.add(0, "Haim");
        list.add("MS R");

        System.out.println(list.size());
        System.out.println(list.get(list.size() - 1));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toLowerCase());
        }

        String i3 = list.remove(3);
        System.out.println("list size: " + list.size());

        int aviIndex = list.indexOf("Aviv");

        String[] toRegArray =  new String[list.size()];
        list.toArray(toRegArray);

        System.out.println(toRegArray[1]);

//        ArrayList<String> fromArray = (ArrayList<String>) Arrays.<String>asList("", "");

        System.out.println();
        System.out.println();
        ArrayList<Person> personArrayList = new ArrayList<>();
        Person p = new Person();
        personArrayList.add(new Person());
        personArrayList.get(0).name = "Avi";


        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        System.out.println(intList.get(0));
        int i = intList.get(0);

        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(90.0);

        for (Double aDouble : doubles) {

        }

        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < 5000; j++) {
            builder.append("line " + j);
        }
        System.out.println(builder);
        builder.replace(2, 5, "");
        int find = builder.indexOf("abc");
        System.out.println();
    }
}
