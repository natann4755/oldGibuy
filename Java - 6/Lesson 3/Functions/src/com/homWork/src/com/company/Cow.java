package com.company;

public class Cow extends Animal {
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cow{");
        sb.append('}');
        return sb.toString();
    }

    public void move(){
        System.out.println("Cow is moo");
    }
}
