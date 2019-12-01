package com.company.Other;

import com.company.Animal;

public class Cat extends Animal{


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cat{");
        sb.append("age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public void move(){
        System.out.println("cat is doing meow");
        age=32;


    }

}
