package com.company;

public class Person {

    private String name;
    private String last;
    private Date date;
    private String ID;

    // constructor
    public Person(String name, String last, Date date, String ID) {
        this.name = name;
        this.last = last;
        this.date = date;
    }

    // default constructor
    public Person() {
    }

    //copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.last = other.last;
        this.date = new Date(other.date.getDay(), other.date.getMonth(), other.date.getYear());
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object obj) {
        return  this.ID.equals(((Person)obj).ID);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", last='" + last + '\'' +
                ", date=" + date +
                '}';
    }
}
