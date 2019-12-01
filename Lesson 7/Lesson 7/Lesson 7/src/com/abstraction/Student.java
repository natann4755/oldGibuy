package com.abstraction;

public class Student extends Person {

    String teacherName;

    public Student(String name, String last,
                   String id, int age, String teacherName) {
        super(name, last, id, age);
        this.teacherName = teacherName;
    }

    public Student(String name, String last, String id, int age) {
        super(name, last, id, age);
    }

    @Override
    public void setAge(int age) {
        if(age > 18 && age < 60){
            this.age = age;
        }
    }
}
