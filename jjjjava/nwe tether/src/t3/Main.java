package t3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int num = Integer.parseInt(scan.nextLine());
        for (int i = 0; i <num ; i++) {
            for (int j = 0; j <num ; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
