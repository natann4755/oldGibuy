package com.abstraction;

public class MyMain {
    public static void main(String[] args) {
        Person p = new Student("a", "b", "is", 0);
        Color c = new Color(100,100,100, true);
        c.setBlue(250);
        System.out.println(c);

        Color.WHITE.setRed(0);
        System.out.println(Color.WHITE);
    }
}
