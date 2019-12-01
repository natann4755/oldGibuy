package com.company;

public class Car extends Vehicle implements ParcingInterfice {


    public Car(int maxkm) {
        super(maxkm);
    }

    @Override
    public int getLength(Vehicle c) {
        return 3;
    }

    @Override
    public void park(Vehicle c) {

    }
}
