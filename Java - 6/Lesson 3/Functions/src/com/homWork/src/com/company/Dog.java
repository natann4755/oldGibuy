package com.company;

public class Dog extends Animal {

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Dog{");
        sb.append("age=").append(age);
        sb.append('}');
        return sb.toString();
    }




    public void move() {
        System.out.println("dog is barking");

        age=10;
//        K.age=5;

    }

}