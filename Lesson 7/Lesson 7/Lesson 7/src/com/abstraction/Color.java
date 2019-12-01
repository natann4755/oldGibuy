package com.abstraction;

public class Color {

    private final boolean canChange;
    private int red, green, blue;

    public static final Color WHITE = new Color(255, 255, 255, false);
    public static final Color BLACK = new Color(0, 0, 0, false);

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        canChange = true;
    }
    public Color(int red, int green, int blue, boolean canChange) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.canChange = canChange;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        if(!canChange) return;
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        if(!canChange) return;
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        if(!canChange) return;
        this.blue = blue;
    }
    public final void test() {

    }

    @Override
    public String toString() {
        return "Color{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }
}
