package com.company;

public class Image implements Clickable, Comparable{

    String imageSrc;

    @Override
    public void click() {
        System.out.println("image clicked");
    }

    @Override
    public void setOnClickListener(ClickListener listener) {

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
