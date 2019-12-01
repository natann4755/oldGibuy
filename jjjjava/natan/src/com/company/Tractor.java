package com.company;

public class Tractor extends Vehicle implements ParcingInterfice {

    public Tractor(int maxkm) {
        super(maxkm);
    }

    @Override
    public int getLength(Vehicle c) {
        return 5;
    }

    @Override
    public void park(Vehicle c) {

    }
}
