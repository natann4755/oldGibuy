package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String namm1 = "avi";
        int code1 = 111;
        String namm2 = "tzvi";
        int code2 = 222;



        System.out.println("plis rwit here name");
        String nname = scan.nextLine();

        if (nname .equals(namm1) ||nname .equals(namm2)) {

            for (int i =0;i<3;i++){
                System.out.println("plis rwit here code");
                int code = scan.nextInt();
                if (nname .equals(namm1) && code ==code1||nname .equals(namm2) &&code==code2) {
                    System.out.println("well come");
                    break;

                }
                else {
                    System.out.println("try egn, you have more" + (3-i) +" tyms" );

          }
        //  if (i==3){
          //          System.out.println("go home");
            //    }
                }

    }



        }

     }






//        if(nammmm==namm1&&passs==code1||nammmm==namm2&&passs==code2){
//        alert ("wellcome")
//        break
//        }
//        else {
//        alert ("plis write agen")
//        }
//        }
//        if (i==5){
//        alert ("plis try liter")
//        }
//
//
//        }