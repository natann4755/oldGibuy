package com.company;

import java.util.Arrays;

public class SomeClass {

    String str;

    public void setStr(String str) {
        this.str = str;
    }

    public static void main(String[] args) {
        B.staticBStr = "a";
        System.out.println();
        new B();
        System.out.println();
        new B();
        System.out.println(A.class.desiredAssertionStatus());

        Object obj = new A();
        System.out.println(obj.getClass() == A.class);

        Class c = Person.class;
        Person p = new Person();
        p.getClass();
        System.out.println(Arrays.toString(c.getDeclaredMethods()));
    }

    public static void printA(A a){
        if(a instanceof A){

        }
        System.out.println(a.aStr);
    }

    public static String print(String msg){
        System.out.println(msg);
        return msg;
    }
}

class A {
    String aStr = SomeClass.print("aStr");
    static String staticAStr = SomeClass.print("staticAStr");
    static int count = 0;
    int specCount;

    public A() {
        System.out.println("A constructor");
        count++;
        this.specCount = count;
    }
}

class B extends A {
    String bStr = SomeClass.print("bStr");
    static String staticBStr = SomeClass.print("staticBStr");
    static String staticBStr2 = SomeClass.print("staticBStr2");

    public B() {
        System.out.println("B constructor");
    }

}
