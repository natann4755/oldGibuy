package com.statickeyword;

public class Person {
    String name;
    String last;
    int id;

    static Person king = new Person("B" , "B", 0000000);

    private static int counter;

    public Person(String name, String last, int id) {
        this.name = name;
        this.last = last;
        this.id = id;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }


}
