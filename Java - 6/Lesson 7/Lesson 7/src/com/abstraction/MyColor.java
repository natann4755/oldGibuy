package com.abstraction;

public class MyColor extends Color {
    public MyColor(int red, int green, int blue) {
        super(red, green, blue);
    }

    public MyColor(int red, int green, int blue, boolean canChange) {
        super(red, green, blue, canChange);
    }

}
