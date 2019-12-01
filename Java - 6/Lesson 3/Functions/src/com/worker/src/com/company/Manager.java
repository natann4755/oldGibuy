package com.company;

import java.util.Arrays;

public class Manager extends Worker {
    Worker Workers[]  ;

    public Manager(String name, String ID, Float salaey, Worker[]Workers) {
        super(name, ID, salaey);
        Workers = Workers;
    }
    public void print(){
        System.out.println("name" + ":" + this.name + "salary" + ":" + this.salaey);
        System.out.println("Workers number + :" + Workers.length);
        for (int i=0; i<Workers.length; i++){
//            super.print();
            System.out.println(Workers [i]);

        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Manager{");
        sb.append("Workers=").append(Workers == null ? "null" : Arrays.asList(Workers).toString());
        sb.append('}');
        return sb.toString();
    }
}

