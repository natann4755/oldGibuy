package com.objectcreated;

public class Circle extends Shape{

    int radius;

    public Circle() {
        shapeName = "Circle";
    }

    @Override
    public int getArea() {
        return (int) (radius * radius * Math.PI);
    }
}
