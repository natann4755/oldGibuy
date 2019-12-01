package com.singelton;

public class MyClass {

    public static void main(String[] args) {
        CEO ceo = CEO.getInstance("a");//new CEO();
        CEO ceo1 = CEO.getInstance("a");//new CEO();
        CEO ceo2 = CEO.getInstance("b");//new CEO();
        System.out.println(ceo);
        System.out.println(ceo1);
        System.out.println(ceo2);
    }
}
