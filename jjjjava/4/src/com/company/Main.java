package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] rrr = new int[10];
        int tt = 0;
        for (int i=1;i<11;i++){
            System.out.println("plis write namber, timse " + i);
            rrr [i-1] = scan.nextInt();
        }
        for (int g=0;g<9;g++){
            for (int i=0;i<9;i++){
                if(rrr[i]>rrr[i+1]){
                    tt=rrr[i+1];
                    rrr[i+1]=rrr[i];
                    rrr[i]=tt;
                }
            }

        }

        for (int i=0;i<rrr.length;i++){
            System.out.println(rrr[i]);

        }


    }
}





//        for (iw=0;iw<mm.length;iw++){
//        document.write(mm[iw]+"<br/>")
//        }