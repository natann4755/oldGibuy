package com.company;

public class Main {

    public static void main(String[] args) {
//        Date d = new Date(1, 1, 1990);
//        String name = "A";
        Person p1 = new Person("A", "A", new Date(1, 1, 1990), "000223");
        Person p2 = new Person(p1);

        p1.getDate().setYear(2012);
        p1.setName("BBBBB");
        System.out.println(p2);
    }
}
