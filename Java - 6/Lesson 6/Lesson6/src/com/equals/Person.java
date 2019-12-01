package com.equals;

public class Person {
    String name;
    String id;

    @Override
    public boolean equals(Object obj) {
        //cast obj to Person
//        Person p = (Person) obj;

        if(obj instanceof Person){
            Person p = (Person) obj;
            return p.id.equals(this.id);
        }
        return false;
    }
}
