package com.objectcreated;

public class Triangle extends Shape{

    int base, height;

    public Triangle (){
        shapeName="Triangle";
    }

    @Override
    public int getArea() {
        return base*height/2;
    }
}
