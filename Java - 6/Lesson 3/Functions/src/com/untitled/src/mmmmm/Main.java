package mmmmm;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        for (int i = 0; 4 < 5; i++) {
            System.out.println("Please enter a number");
            int n = Integer.parseInt(Scan.nextLine());
            System.out.println(getRandom(n));
        }


    }
    public static int getRandom(int n){
            Random ran = new Random();
            int s = ran.nextInt(n) * -1;
            return s;

        }
     }