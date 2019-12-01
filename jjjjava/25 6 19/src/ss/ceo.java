package ss;

import java.util.Random;

public class ceo extends Worker {
    Manager[] Managers;

    public ceo(String name, String id, int salary, Manager[] managers) {
        super(name, id, salary);
        Managers = managers;
    }

    //    public ceo(String name, String id, int salary, Manager[] managers) {
//        this.name = name;
//        this.id = id;
//        this.salary = salary;
//        Managers = managers;
//    }

    public void print() {
        super.print();
        for (int i = 0; i < Managers.length; i++) {
            Managers[i].print();
            }
        }
    public void printManeger(){
        for (int i = 0; i <Managers.length ; i++) {
            Managers[i].print1();
           // System.out.println(Managers[i].name+" " +Managers[i].id+" "+Managers[i].salary);

        }
    }
}
