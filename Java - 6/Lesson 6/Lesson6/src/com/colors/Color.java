package com.colors;

public class Color {
    private int red;
    private int green;
    private int blue;

    public static Color WHITE = new Color(255, 255, 255);
    public static Color RED = new Color(255, 0,0);
    public static Color BLACK = new Color(0, 0,0);
    public static Color GREEN = new Color(0, 255,0);
    public static Color BLUE = new Color(0, 0,255);

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Color() {
    }

    public static Color getColor(String color){
        if(color.toLowerCase().equals("white")){
            return new Color(255,255,255);
        }
        return new Color(0,0,0);
    }



    private boolean range(int color){
        return  color >= 0 && color <= 255;
    }
    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        if(range(red)){
            this.red = red;
        }
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        if(range(green))
            this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        if(range(blue))
            this.blue = blue;
    }
}
