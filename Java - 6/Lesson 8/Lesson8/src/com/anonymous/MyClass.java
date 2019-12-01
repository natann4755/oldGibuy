package com.anonymous;

public class MyClass {

    public static void main(String[] args) {

        Person p = new Person(){
            String o;
            @Override
            public String toString() {
                return "$classname{" +
                        "name='" + name + '\'' +
                        ", last='" + last + '\'' +
                        '}';
            }
        };

        System.out.println(p.getClass());
    }
}
