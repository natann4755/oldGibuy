package com.company;

public class Main {

    public static void main(String[] args) {
        math(8,-9);

    }
    public static void math (int b, int c){
        int mul = 4;
        double d = Math.sqrt(b*b-mul*c);
        double d1 = (-b+d)/2;
        double d2 = (-b-d)/2;
        System.out.println(d1);
        System.out.println(d2);
    }
    }

