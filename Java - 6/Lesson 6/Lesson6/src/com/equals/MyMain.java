package com.equals;

public class MyMain {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "P1";
        Person p2 = p1;
        p2.id = "id1";

        Animal animal = new Animal();

        Student s = new Student();
        s.name = "id1";
        //p1 = s;
        s.id = "id1";
        System.out.println(p1.equals(s));
    }
}
