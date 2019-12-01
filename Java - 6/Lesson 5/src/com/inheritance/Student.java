package com.inheritance;

public class Student extends Person{

    String className = "class 7";

    public Student() {
        super("Default", "Student", 40);
        System.out.println("command");
    }

    public Student(String name, String last, int age, String className) {
        super(name, last, age);
        this.className = className;
    }

    @Override
    public void setAge(int age) {
        if(age >= 16 && age < 59){
//            super.setAge(age);

        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                ", name='" + getName() + '\'' +
                ", last='" + getLast() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
