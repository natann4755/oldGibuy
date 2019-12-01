package com.company;

public class Person {
    String name;
    int year;
    static int test;

    public static int getAge(Person p){
        return  2019 - p.year;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() == Person.class){

        }
        return super.equals(obj);
    }
}
