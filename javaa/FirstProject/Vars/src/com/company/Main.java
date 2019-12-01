package com.company;

public class Main {

    public static void main(String[] args) {
        double d = 8886666.24445;
        float f = 9.2f;
        f = 9.0f;
        int x =  (int)d;
        int r = 9;
        System.out.println(x);
        System.out.println(890);

        char c = 'א';
        int charX = c;
        System.out.println(charX);

        String myString = "abcdefg";
        for (int i = 0; i < myString.length(); i++) {
            char charAtI = myString.charAt(i);
            System.out.println(charAtI);
        }

        String sub1 = myString.substring(0, 3);
        System.out.println("sub1 " + sub1);

        String sub2  = myString.substring(2,3);
        System.out.println("sub2 = " + sub2);

        String str1 = myString.replace("a", "");
        System.out.println("str1 = " + str1);

        myString = myString.toUpperCase();
        myString.indexOf("a");
        myString.indexOf("a", 9);


        boolean b = true;
        b = !b;
        b = 9 > 0;
        b = true || false;
    }

}
