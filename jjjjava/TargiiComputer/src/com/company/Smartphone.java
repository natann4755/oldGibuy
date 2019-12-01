package com.company;

public class Smartphone extends Computer{

    boolean isToutch;

    public Smartphone(int ram, int disk, String modool, boolean isToutch) {
        super(ram, disk, modool);
        this.isToutch = isToutch;
    }

    @Override
    public String toString() {
        return "Smartphone{" + super.toString() +
                " isToutch=" + isToutch +
                '}';
    }

    @Override
    public int setMaxScreen() {
        return maxScreen = 1000;


    }
}
