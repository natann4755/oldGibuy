package com.company;

public class Otobus extends Vehicle implements ParcingInterfice {

    public Otobus(int maxkm) {
        super(maxkm);
    }

    @Override
    public int getLength(Vehicle c) {
        return 9;
    }

    @Override
    public void park(Vehicle c) {

    }
}
