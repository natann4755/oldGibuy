package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("ples enter the yeer");
        String ye = scan.nextLine();
        int yer = Integer.parseInt(ye);
        System.out.println("ples enter the month");
        String mo = scan.next();
        int month = Integer.parseInt(mo);// write your code2000

        int mm;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 deys");
                mm = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 deys");
                mm = 30;
                break;
            default:
                if (yer % 4 == 0 && yer % 100 != 0 || yer % 400 == 0) {
                    System.out.println("29 deys");
                    mm = 29;
                } else {
                    System.out.println("28 deys");
                    mm = 28;

                }
                System.out.println(mm+" deys");



        }


    }

}
