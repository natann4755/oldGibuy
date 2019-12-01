package com.company;

public class Bus extends Car implements Parkable {
    int location;
    public Bus(double price, int age) {
        super(price, age);
        location = -1;
    }

    @Override
    public int getSize() {
        return 6;
    }

    @Override
    public void setLocation(int location) {
        this.location = location;

    }

    @Override
    public int getLocation() {
        return  location;
    }

}
