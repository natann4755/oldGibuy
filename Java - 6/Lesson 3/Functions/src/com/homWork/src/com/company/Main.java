package com.company;

import com.company.Other.Cat;

public class Main {

    public static void main(String[] args) {
        Animal A=new  Animal();
        A.age=7;
        A.move();
        Dog D= new Dog();
        D.age=7;
        D.move();
        Cow C=new Cow();
        C.age=4;
        C.move();
        Cat K=new Cat();
        K.age=2;
        K.move();
//        K.setAge(-5);
//        System.out.println(K);

    }

}
