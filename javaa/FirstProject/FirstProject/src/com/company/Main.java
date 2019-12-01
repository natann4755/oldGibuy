package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 5;
        String str = "10";

        byte b1 = Byte.MAX_VALUE;
        byte b2 = Byte.MIN_VALUE;
        String s =  "" +  b1;

        b1+=3;

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println();

        int x1 = Integer.MAX_VALUE;
        int x2 = Integer.MIN_VALUE;


        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println();

        int t1 = 200;
        byte t2 = (byte) t1; // casting


        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println();


        long l1 = Long.MAX_VALUE;
        long l2 = Long.MIN_VALUE;

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);
        System.out.println();

        int test1 = Integer.MAX_VALUE; //2147483647
        long test2 = test1 + 1L;
        System.out.println("test2 = " + test2);

        //byte
        //int
        //long
        //float
        //double
        //char
        //String
        //boolean

        System.out.println("Hello java ");

    }
}
