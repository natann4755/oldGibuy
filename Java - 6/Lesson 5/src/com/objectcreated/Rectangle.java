package com.objectcreated;

public class Rectangle extends Shape {

    int width, height;

    public Rectangle() {
        shapeName = "Rectangle";
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
