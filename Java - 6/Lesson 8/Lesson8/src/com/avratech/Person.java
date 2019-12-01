package com.avratech;

import javam.button.Button;
import javam.button.OnClickListener;

public class Person implements OnClickListener {
    String name;
    String last;

    public Person(String name, String last) {
        this.name = name;
        this.last = last;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", last='" + last + '\'' +
                '}';
    }

    @Override
    public void onClick(Button b) {
        System.out.println(this);
    }
}
