package com.objects;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
//        Person p = new Person();
//        p.name = "Izik";
//        p.last = "Cohen";
//        p.year = 1985;
//        System.out.println(p.name);

        Person[] persons = new Person[2];

        for (int i = 0; i < persons.length; i++) {
            String name = getLine("Enter name for user index " + i);
            Person p = new Person();
            p.name = name;
            p.last = getLine("Enter last name for user index " + i);
//            p.year = Integer.parseInt(getLine("Enter year of birth for user index " + i));
            Date d = new Date();
            d.day = Integer.parseInt(getLine("Enter day of birth for user index " + i));
            d.month = Integer.parseInt(getLine("Enter month of birth for user index " + i));
            d.year = Integer.parseInt(getLine("Enter year of birth for user index " + i));
            p.date = d;
            persons[i] = p;
        }

        int varFromUser = Integer.parseInt(getLine("Choose person (1 - 2)"));
        Person p = persons[varFromUser - 1];
        persons[varFromUser - 1].last = "Cohen";
        persons[varFromUser - 1].date.year = 2000;
        System.out.println(p);

        Date d = new Date();
        d.day = 12;
        d.year = 3000;
        d.month = 9;
        System.out.println("is date valid? " + persons[1].date.isValid());

    }

    public static String getLine(String msg){
        Scanner scan = new Scanner(System.in);
        System.out.println(msg);
        return scan.nextLine();
    }
}
