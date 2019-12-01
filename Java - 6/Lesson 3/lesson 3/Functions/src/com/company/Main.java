package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name1 = scan.nextLine();
        System.out.println("Please enter your password");
        String password1 = scan.nextLine();

        System.out.println("Thanks \nUser 2");

        System.out.println("Please enter your name");
        String name2 = scan.nextLine();
        System.out.println("Please enter your password");
        String password2 = scan.nextLine();

        int x = 0;
        while(x < 3) {
            x++;
            System.out.println("Enter user name");
            String username = scan.nextLine();
            if(username.equals(name1) || username.equals(name2)) {
                System.out.println("Enter your password");
                String password = scan.nextLine();
                if(username.equals(name1) && password.equals(password1) ||
                        username.equals(name2) && password.equals(password2)) {
                    System.out.println("Welcome");
                    break;

                }
            }
            if(x == 3) {
                System.out.println("Try later");
            }
        }

    }
}
