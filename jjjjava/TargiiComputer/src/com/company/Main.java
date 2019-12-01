package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

       Pc pc = new Pc(512,1024,"3");
       pc.screen=999;
       Laptop l =new Laptop(1024,2048,"7",4.4);
       Smartphone s =new Smartphone(512,1024,"9",true);
       Pc p2 = new Pc(1024,1024,"10");
        Smartphone s2 = new Smartphone(512,2048,"3",false);
        Computer c [] = new Computer[]{pc,l,s,p2,s2};

        ArrayList<Ikeyboard> Ikeyboards = new ArrayList<>();
        for (int u = 0; u <c.length ; u++) {
            if(c[u] instanceof Ikeyboard){
                Ikeyboards.add((Ikeyboard)c[u]);
            }
        }

        for (int i = 0; i <Ikeyboards.size() ; i++) {
            System.out.println(Ikeyboards.get(i)+ " Languages " +Ikeyboards.get(i).langwethkeyboard().length);
        }

        System.out.println("not instanceof Ikeyboard");

        for (int i = 0; i <c.length ; i++) {
            if (!(c[i] instanceof Ikeyboard)){
                System.out.println(c[i]);
            }
        }
    }
}
