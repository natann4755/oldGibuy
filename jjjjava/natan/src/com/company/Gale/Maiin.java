package com.company.Gale;

import java.util.Random;

public class Maiin {
    public static void main(String[] args) {
        for (int i = 0; i <150 ; i++) {
            Court.count_Sentence();
                if (Parisoner.counter%20==0){
                    Court.This_year++;
                }
        }

        for (int i = 0; i <30 ; i++) {
            Random random =new Random();
            int j = random.nextInt(300);
            System.out.println(j);
            System.out.println(Court.parisoners[j]);
        }
    }
}
