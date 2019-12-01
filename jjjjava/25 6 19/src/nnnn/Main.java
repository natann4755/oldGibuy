package nnnn;


import nnnn.Cat.cat;

public class Main {
    public static void main(String[] args) {
        Animol a = new Animol();
        a.age=-10;
        a.setAge(-30);
        a.move();
        System.out.println(a);
        cow c =new cow();
        c.age =-8;
        c.setAge(-25);
        c.move();
        System.out.println(a.age);
        Dog d = new Dog();
        d.age = -6;
        d.move();
        d.setAge(-90);
        System.out.println(d);
        cat k = new cat();
        k.age=-4;
        k.move();
        k.setAge(-50);
        System.out.println(k);
    }
}
