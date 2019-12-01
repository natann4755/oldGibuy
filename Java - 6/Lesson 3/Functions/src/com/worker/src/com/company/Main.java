package com.company;

import javafx.concurrent.Worker;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Manager[] Managers = new Manager[2];
        for (int i = 0; i < 3; i++) {
            Random MyRandom = new Random();
            int x = (int) MyRandom.nextInt(5) + 1;
            String W = gatLine("Please enter your name");
            String G = gatLine("Please enter your ID");
            float B = Integer.parseInt(gatLine("Please enter your salary"));

            Managers[i] = new Manager(W, G, B, T);

            Worker[] Workers = new Worker[x];
            for (int z = 0; z < x; x++) {
                String D = gatLine("Please enter your name");
                String E = gatLine("Please enter your ID");
                float S = Integer.parseInt(gatLine("Please enter your salary"));
                Workers[z] = new Worker();


            }


        public static String gatLine(String msg){
            Scanner scan = new Scanner(System.in);
            System.out.println(msg);
            return scan.nextLine();


    }
}