package com.company;

public abstract class Computer {
    private int ram,disk;
    static int maxScreen;
    int screen;
    String modool;

     public abstract int setMaxScreen();

    public Computer(int ram, int disk, String modool) {
        setRam(ram);
        setDisk(disk);
        this.modool = modool;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
         if (ram%512==0)
        this.ram = ram;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        if(disk%1024==0)
        this.disk = disk;
    }

    public static int getMaxScreen() {
        return maxScreen;
    }

    @Override
    public String toString() {
        return "{" +
                "ram=" + ram +
                ", disk=" + disk +
                ", screen=" + screen +
                ", maxScreen ="+ setMaxScreen()+
                ", modool='" + modool + '\'' +
                '}';
    }
}
