package com.abstraction;

public abstract class Person {

    private String name = "";
    private String last = "";
    final String id;
    int age;

    public Person(String name, String last, String id, int age) {
        setName(name);
        this.last = last;
        this.id = id;
        this.age = age;
    }

    public Person() {
        //this("", "" , "", 0);
        id = "";
    }

    public void setName(String name) {
        if(name != null)
            this.name = name;
    }


    public abstract void setAge(int age);
}
