package com.company;

public class Pc extends Computer implements Ikeyboard{


    public Pc(int ram, int disk, String modool) {
        super(ram, disk, modool);
    }

    @Override
    public int setMaxScreen() {
      return maxScreen=2400;
    }

    @Override
    public String[] langwethkeyboard() {
        return new String[]{"jj","rr","ff","tt"};
    }

    @Override
    public String toString() {
        return "Pc"+ super.toString();
    }

}
