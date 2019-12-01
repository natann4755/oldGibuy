package com.functions;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        int x = 4;
        long l = 5;
        double d = 9.8;
        float f = 9.8;

        char c = 'a';
        boolean b = "".equals("a");

        String str = "123";
        int castToInt = Integer.parseInt(str);

//        String castToString = "" + x;
        String castToString = String.valueOf(x);


//        String name1 = getStringFromUser("Enter your user name");

        int[] array = getIntArrayFromUser(3);
        String line = getStringFromUser("Enter Y for one line");
        printArray(array, line.equals("Y"));

    }

    public static int[] getIntArrayFromUser(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getIntegerFromUser();
        }
        return arr;
    }


    public static void printNumberToUser(int x){
        if(9 > 0){
            return;
        }
    }

    public static int getIntegerFromUser() {
        return Integer.parseInt(getStringFromUser("Please enter number"));
    }

    public static String getStringFromUser(String msg) {
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        return str;
    }

    public static void print(){
        System.out.println("print()");
    }

    public static void print(long l){
        System.out.println("print(long l)");
    }

    public static void print(double d){
        System.out.println("print(double d)");
    }

    public static void print(float f){
        System.out.println("print(float f)");
    }
    public static int print(int x) {
        System.out.println("print(int x)");

        return 0;
    }

    public static void print(int y,  int[] arr, boolean r){

    }

    public static void printArray(int[] arr, boolean oneLine) {
        String str = oneLine ? " " : "\n";

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + str);
        }
    }



}