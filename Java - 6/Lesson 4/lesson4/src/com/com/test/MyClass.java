package com.com.test;

public class MyClass {

    public static void main(String[] args) {
        Person p = new Person("Lea");
//        Person p = new Person();
        System.out.println(p);
    }


    public static String print(String msg){
        System.out.println(msg);
        return msg;
    }
}
