package com.company;

public class Worker{

    String name;
    String ID;
    Float salaey;

    public Worker (String name,String ID,Float salaey){
        this.name=name;
        this.ID=ID;
        this.salaey=salaey;
    }
    public void print(){
        System.out.println("name + :" + this.name + "salary + :" + this.salaey);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Woeker{");
        sb.append("name='").append(name).append('\'');
        sb.append(", ID='").append(ID).append('\'');
        sb.append(", salaey=").append(salaey);
        sb.append('}');
        return sb.toString();
    }
}



