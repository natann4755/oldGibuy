package com.company.dddd;

public class Main {
    public static void main(String[] args) {
        Date dd = new Date();
        dd.day=6;
        dd.month=10;
        dd.yaer=2000;
        Person ee = new Person("natan","nuyman",new Date(1,10,2000));

        Person o = ee;
        o.name="yshrael";
        Person ii = new Person("natan","nuyman",dd);
        Person j = new Person(ii);
        j.name="ysrael";
        System.out.println(ee);
        System.out.println(o);
        System.out.println(ii);
        System.out.println(j);

    }
}
