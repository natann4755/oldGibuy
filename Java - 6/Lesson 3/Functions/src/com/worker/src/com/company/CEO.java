package com.company;

import java.util.Arrays;

public class CEO extends Manager {

    Manager[] Managers;

    public CEO(String name, String ID, Float salaey, Worker[] Workers, Manager[] Managers) {
        super(name, ID, salaey, Workers);
        Managers = Managers;
    }

    public void print() {
        System.out.println("name" + ":" + this.name + "salary" + ":" + this.salaey + "ID" + ":" + this.ID);
        for (int i=0; i<Managers.length; i++){
//            System.out.println(Managers[i]);
//            for (int z=0; z<Workers.length; z++){
//                System.out.println(Workers[z]);
            super.print();
            }
        }



    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CEO{");
        sb.append("Managers=").append(Managers == null ? "null" : Arrays.asList(Managers).toString());
        sb.append('}');
        return sb.toString();
    }

    public void Managers() {
        for (int i=0; i<Managers.length ; i++) {
            System.out.println(Managers[i]);
        }

    }
}