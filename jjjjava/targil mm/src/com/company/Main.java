package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("reait number 1");
        int x = Integer.parseInt(scan.nextLine());
        System.out.println("reait number 2");
        int y = Integer.parseInt(scan.nextLine());

        x *=y;
        System.out.println(x);
        y=x/y;

        x/=y;
        System.out.println(x+" "+y);
//        int t =7;
//        double d =t;
//        int a = (int) d;
    }
}
