package com.inheritance;

public class Worker extends Person {

    public Worker(String name, String last, int age) {
        super(name, last, age);
        System.out.println();
    }

    public Worker(String name) {
        super(name);
    }

    public Worker(){
        super("Worker1");
        System.out.println("Hi");
    }
}
