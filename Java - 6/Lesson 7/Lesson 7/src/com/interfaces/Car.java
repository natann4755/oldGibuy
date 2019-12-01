package com.interfaces;

public class Car implements ColorInterface{
    Color color;

    public Color getColor() {
        return color;
    }


    public void setColor(Color c) {
        this.color = c;
    }


    public boolean canChangeColor() {
        return false;
    }
}
