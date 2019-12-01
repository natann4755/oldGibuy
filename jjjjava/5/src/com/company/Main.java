package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arrr = new int[10];
        int [] narr = new int[10];
        for (int i=1;i<11;i++){
            System.out.println("plis write namber timse " + i);
                arrr [i-1] = scan.nextInt();
        }

        for (int i=0;i<10;i++){
            narr[arrr[i]]++;
        }

        for (int i=0;i<10;i++){
            System.out.println(i + "=" + narr[i]);

        }


    }
}
//
//    let mm = [];
//        for (i=0;i<10;i++){
//        var nn = prompt ("plis rite number","0")
//        mm.push(nn)
//        }
//        let nmm = [0,0,0,0,0,0,0,0,0,0];
//        for (i=0;i<10;i++){
//        nmm[mm[i]] ++
//        }
//        for (i=0;i<10;i++){
//        document.write(i + "=" + nmm[i] + "<br/>" )
//        }



