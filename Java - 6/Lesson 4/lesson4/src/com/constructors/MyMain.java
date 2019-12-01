package com.constructors;

public class MyMain {
    public static void main(String[] args) {
        Date d = new Date(1, 1, 1980);
        System.out.println(d);

        Person p = new Person("Avi", "Cohen", 900, d);

        Person p2 = new Person();

        new Date(1900);
        Person p9;
    }
}
