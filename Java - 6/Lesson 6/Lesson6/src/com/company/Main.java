package com.company;

public class Main {

    public static void main(String[] args) {
        Worker[] workers = {
                new Worker("Worker 1", "Last 1", 1121),
                new Worker("Worker 2", "Last 1", 1123),
                new Worker("Worker 3", "Last 1", 1125)
                };

        Worker[] workers2 = {
                new Worker("Worker 22", "Last 12", 11232),
                new Worker("Worker 32", "Last 12", 11222)
        };

        Manager m1 = new Manager("Manager 1",
                "Manager 1" , 123000, workers);
        Manager m2 = new Manager("Manager 2",
                "Manager 2" , 125000, workers2);

        CEO ceo = new CEO("CEO", "CEO Last",
                900000, new Manager[]{m1, m2});

        ceo.print();



        Manager m = new Manager("", "" , 9 , new Worker[]{});
        Worker w = m;
        m.print();
        w.print();
        //System.out.println(m);

    }
}
