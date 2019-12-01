package com.company;

public class MyClass {

    public static void main(String[] args) {
        Date d = new Date();
        d.day = 28;
        d.month = 2;
        d.year = 1990;

        d.incrementDay();

        Date d2 = new Date();
        d2.day = 4;
        d2.month = 12;
        d2.year = 1985;

        boolean later = d.isLater(d2);

        System.out.println(d.getDate());


        Person p = new Person();
        p.name = "Avi";
        p.ID = "00020202";
//        p.date = d;
//       p.date = new Date();
        p.date.day = 1;
        p.date.month = 10;
        p.date.year = 1999;


        System.out.println(p);
    }
}
