package com.interfaces;

public class Person implements Comparable{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        System.out.println(name + " " + ((Person) o).name);
        if(o instanceof Person){
            return ((Person) o).age - this.age;
        }
        return 0;
    }
}
