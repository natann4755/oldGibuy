package com.objects;

public class Person {
    String name, last;
    Date date;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", last='" + last + '\'' +
                ", date=" + date +
                '}';
    }
}
