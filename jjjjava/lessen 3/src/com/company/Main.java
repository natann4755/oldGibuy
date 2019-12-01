package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] arrr = {1,2,3,4,5};
        int [] aarr = {6,7,8,9,10};
        System.out.println(Arrays.toString(arrr));
        System.out.println(Arrays.toString(aarr));
         System.arraycopy(arrr,0,aarr,1,aarr.length-1);
        System.out.println(Arrays.toString(arrr));
        System.out.println(Arrays.toString(aarr));
	// write your code here
    }
}
