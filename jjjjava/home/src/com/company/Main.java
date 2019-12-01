package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i=1; 5<6;i++){
            System.out.println("enter namber "+i);
            int namm = Integer.parseInt(scan.nextLine());
            System.out.println(getRdn(namm));
        }
    }
    public  static int getRdn(int max){
        Random rand = new Random();
        return rand.nextInt(max);
    }

}
