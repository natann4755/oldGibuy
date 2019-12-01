package com.company;

public class Laptop extends Computer implements Ikeyboard {


    double kg;
    int timeplay;

    public Laptop(int ram, int disk, String modool, double kg) {
        super(ram, disk, modool);
        this.kg = kg;
    }

    @Override
    public int setMaxScreen() {
        return maxScreen=1200;
    }

    @Override
    public String[] langwethkeyboard() {
        return new String[]{"ea","ge"};
    }

    @Override
    public String toString() {
        return  "Laptop{" + super.toString() +
                " kg=" + kg +
                " timeplay"+timeplay+
                '}';
    }
}
