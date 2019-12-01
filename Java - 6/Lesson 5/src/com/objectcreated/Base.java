package com.objectcreated;

public class Base {
    String baseStr = MyClass.print("init Base.baseStr var");

    public Base(String name) {
        System.out.println("Base.constructor command");
    }
}
