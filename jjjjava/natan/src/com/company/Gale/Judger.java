package com.company.Gale;

public class Judger {


    public static void Sentence(Parisoner p1,Parisoner p2){
        if (p1.Random_Admission()&&p2.Random_Admission()){
            p1.Sentence_year=3;
            p2.Sentence_year=3;}
        if (!p1.Random_Admission()&&!p2.Random_Admission()){
            p1.Sentence_year=7;
            p2.Sentence_year=7;
        }
            else {
                if(p1.Random_Admission())
                    p1.Sentence_year= 1 ;
                else p1.Sentence_year=10 ;
                if(p2.Random_Admission())
                p2.Sentence_year=1  ;
                else p2.Sentence_year=10 ;
        }


    }
}
