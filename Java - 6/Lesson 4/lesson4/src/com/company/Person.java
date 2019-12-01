package com.company;

public class Person {
    String name;
    String ID;
    Date date = new Date();


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", date=" + date +
                '}';
    }
}
