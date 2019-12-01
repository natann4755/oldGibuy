package com.objectcreated;

public class Shape {

    String shapeName;

    public int getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return shapeName + " " + getArea();
    }
}
