package com.company.dddd;

import com.company.home.Parson;

public class Person {
      String name,last;
       Date date=new Date();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", last='" + last + '\'' +
                ", date=" + date +
                '}';
    }

    public Person (String name, String last, Date date){
        this.name= name;
        this.last=last;
        this.date=date;

    }
    public Person (Person kk){
        this.name=kk.name;
        this.last=kk.name;
        this.date=kk.date;

    }
}
