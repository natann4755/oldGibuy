package com.interfaces;

public class Person implements Comparable<Person> {
    int age;
    String name ="";

    public Person(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return  age - o.age ;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
