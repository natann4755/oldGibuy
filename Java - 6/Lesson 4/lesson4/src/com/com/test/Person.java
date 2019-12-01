package com.com.test;

public class Person {


    public Person(String name) {
        this.name = name;
    }
    String name = MyClass.print("Avi");

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
