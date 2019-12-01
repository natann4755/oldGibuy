package com.company;

public class Button implements Clickable {

    int bgColor;
    String text;
    int textColor;

    @Override
    public void click() {
        System.out.println("Button clicked");
    }

    @Override
    public void setOnClickListener(ClickListener listener) {

    }
}
