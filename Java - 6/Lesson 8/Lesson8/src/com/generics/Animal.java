package com.generics;

public class Animal implements MyComparable<Animal> {
    @Override
    public int compareTo(Animal another) {
        return 0;
    }
}
