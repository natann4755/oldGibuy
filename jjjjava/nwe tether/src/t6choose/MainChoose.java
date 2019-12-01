package t6choose;

import java.util.Scanner;

public class MainChoose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n");
        int n = Integer.parseInt(scan.nextLine());
        System.out.println("enter k");
        int k = Integer.parseInt(scan.nextLine());
        System.out.println(choos(n,k));


    }
     public static int choos (int n ,int k){
       int nn =atzeret(n);
       int kk = atzeret(k);
       int k1 = atzeret(n-k);
       return nn/(kk*k1);

     }
     public static int atzeret(int o){
        int oo =1;
         for (int i = 1; i <=o ; i++) {
             oo*=i;
         }
         return oo;
     }


}
