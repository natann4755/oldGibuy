package com.company.Gale;

import java.time.Year;
import java.util.Random;

public class Parisoner {
    int Sentence_year;
    int start_year=Court.This_year;
    int Hew_mach_years =  get_Hew_mach_years(start_year) ;
   // int year =

    static int counter =0;

    public Parisoner() {
        counter++;
    }

    public int get_Hew_mach_years(int startYear){
        int yy ;
        if(Sentence_year<(2019-startYear) ) {
            yy = Sentence_year;
            System.out.println(yy);

        }
        else {
            yy = 2019 - startYear;
            System.out.println("lll");
        }

        return yy;
    }

    public boolean Random_Admission(){
        Random random=new Random();
        Boolean p1 = random.nextBoolean();
        return p1;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Parisoner{");
        sb.append("Sentence_year=").append(Sentence_year);
        sb.append(", start_year=").append(start_year);
        sb.append(", Hew_mach_years=").append(get_Hew_mach_years(start_year));
        sb.append('}');
        return sb.toString();
    }
}
