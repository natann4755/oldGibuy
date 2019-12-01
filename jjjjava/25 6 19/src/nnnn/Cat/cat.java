package nnnn.Cat;

import nnnn.Animol;

public class cat extends Animol {

    public void move(){
        System.out.println("cat is doing meow");
        age=-3;
    }

    @Override
    public void setAge(int age) {
        this.age=age;
    }
    //    @Override
//    public String toString() {
//        return "cat{}";
//    }
}
