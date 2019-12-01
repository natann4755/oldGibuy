package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array;

        int r = 5;
        int[] r2;
        long[] r3;
        String[] r4;


        int[] arr = new int[10]; // [0,0,0,0,0,0,0,0,0,0,0,0,0]
        arr[0] = 2;
        arr[3] = 4;
        int[] arr2 = {2,0,0,4,0,0,0,0,0,0};
        int[] arr3 = new int[]{2,0,0,4,0,0,0,0,0,0};

        array = new int[]{2,0,0,4,0,0,0,0,0,0};

        int[] inputArray = new int[10];
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number " + (i));
            inputArray[i-1] = Integer.parseInt(scan.nextLine());
        }

        int[] counterArray = new int[10];
        for (int i = 0; i < inputArray.length; i++) {
            counterArray[inputArray[i]] ++;
        }

        // print array
        for (int i = 0; i < counterArray.length; i++) {
            System.out.println(i + " = " + counterArray[i]);
        }
    }
}
