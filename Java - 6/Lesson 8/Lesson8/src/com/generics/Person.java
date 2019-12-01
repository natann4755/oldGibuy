package com.generics;

public class Person implements MyComparable<Person> {
    @Override
    public int compareTo(Person another) {
        return 0;
    }
}
