package com.statickeyword;

public class MyClass {

    public static void main(String[] args) {
        System.out.println(Person.getCounter());
        Person p = new Person("a" ,"b" , 123);
        System.out.println(Person.getCounter());
//        Person.counter++;
//        System.out.println(Person.counter);

    }
}
