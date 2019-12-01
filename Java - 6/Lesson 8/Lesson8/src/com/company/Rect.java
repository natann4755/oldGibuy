package com.company;

import java.awt.Point;

public class Rect {
    Point start, end;

    public Rect(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
