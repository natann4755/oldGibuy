package com.company.Gale;

public class Court {
    static Parisoner[] parisoners = new Parisoner[300];
    static int This_year = 1990;

    public static void count_Sentence(){
        Parisoner p1 = new Parisoner();
        parisoners[Parisoner.counter-1]=p1;
        Parisoner p2 = new Parisoner();
        parisoners[Parisoner.counter-1]=p2;
        Judger.Sentence(p1,p2);

    }


}
