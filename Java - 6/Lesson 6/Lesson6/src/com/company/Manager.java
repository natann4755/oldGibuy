package com.company;

public class Manager extends Worker {

    Worker[] workers;

    public Manager(String name, String last, int salary, Worker[] workers) {
        super(name, last, salary);
        this.workers = workers;
    }

    @Override
    public void print() {
        //System.out.println(getName() + " " + getLast());
        super.print();
        for (int i = 0; i < workers.length; i++) {
            workers[i].print();
        }
    }
}
