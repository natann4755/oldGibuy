package com.inheritance;

public class MyMain {
    public static void main(String[] args) {

        Person p = new Person("");
        p.setName("Avi");
        p.setLast("Cohen");
        p.setAge(30);


        System.out.println("p age " + p.getAge());

        Student s = new Student();
        s.setName("Moshe");
        s.setLast("Levy");
        s.setAge(19);
        s.className = "Class 7";
        int age = s.getAge();
        System.out.println("s age " + s.getAge());

        new Worker();
                new Student("avi","chone",30,"6");

        //        Person p1 = new Person();
//        Student s1 = new Student();
//        s1.name = "Avi";
//
//        Person[] arr = new Person[3];
//        arr[0] = new Person();
//        arr[1] = new Student();
//        arr[2] = s1;
//
//        Person p = new Student();
////        Student s = new Person();
    }
}
