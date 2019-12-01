package rrrrrrrrrrr.constructors;

public class person {
    String name;
    String last;
    int date;



    public  person(String name,String last,int date){
       this.name=name;
       this.last=last;
       this.date=date;
    }
    public person (person m){
        this.name =  m.name;
        this.last =  m.name;
        this.date =  m.date;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", last='" + last + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}


