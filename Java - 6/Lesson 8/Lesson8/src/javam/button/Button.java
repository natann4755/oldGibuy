package javam.button;

import java.awt.*;
import java.awt.Color;

public class Button {

    Point start;
    Point end;
    String text;
    Color textColor;
    Color textClickColor;
    Color bgColor;
    Color bgClickColor;
    int id;
    private OnClickListener listener; // null

    public void setListener(OnClickListener listener) {
        this.listener = listener;
    }

    static int idCount = 1;

    public Button(String text) {
        this.text = text;
        id = idCount++;
    }

    public void click(int x, int y) {
        System.out.println("button " + id  + " clicked (" + x + ", " + y +")");
        if(listener != null){
            listener.onClick(this);
        }
    }

    public int getId() {
        return id;
    }
}
