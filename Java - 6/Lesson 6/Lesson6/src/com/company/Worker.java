package com.company;

public class Worker {
    private String name;
    private String last;
    private int salary;

    public Worker(String name, String last, int salary) {
        this.name = name;
        this.last = last;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void print() {
        System.out.println(getClass().getSimpleName() + " " + name + " " + last+" "+ salary);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", last='" + last + '\'' +
                ", salary=" + salary +
                '}';
    }
}
