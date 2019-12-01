package com.inheritance;

public class Person extends Object {
     private String name;
        private String last;
    private int age;



    public Person(String name, String last, int age) {
        this.name = name;
        this.last = last;
        this.age = age;
        System.out.println("Commands");
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age < 121) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", last='" + last + '\'' +
                ", age=" + age +
                '}';
    }

}
