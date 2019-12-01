package com.byreference;

public class Person {
    private String name;
    private String last;

    public Person(String name, String last) {
        this.name = name;
        this.last = last;
    }

    // copy constructor
    public Person(Person p) {
        this.name = p.name;
        this.last = p.last;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}

