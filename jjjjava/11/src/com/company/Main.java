package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("rite here nomber");
        int nn = scan.nextInt();
        int i = (nn-1);
        String rr= "";

        if (nn<=0){
            System.out.println("plis rite agen");
        }
        if (nn==2){
            rr= "primary tax";
        }
        for (;i>1;i--){
            if(nn%i==0){
                 rr = "Non-primary tax, divisible in "+ i;
                break;
            }
            else {
                rr =  "primary tax";
            }
        }

             System.out.println(rr);




    }
}
