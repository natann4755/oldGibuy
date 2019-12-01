package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Please enter your last name");
        String lastName = scan.nextLine();
        System.out.println("Hello " + firstName + " " + lastName );
        int currentYear = 2019;
        System.out.println(firstName +", Please enter your year of birth");
        String yob = scan.nextLine();
        int year = Integer.parseInt(yob);

        int x = 10;
//        String xString = "" + x;
//        String xString = String.valueOf(x);

        System.out.println("Your age is: " + (currentYear - year));
    }


}
