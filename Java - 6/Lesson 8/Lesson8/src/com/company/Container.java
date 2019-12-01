package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Container {
    ArrayList<Clickable> clickables = new ArrayList<>();
//    Map<Clickable, Rect> map = new HashMap<>();
//    Clickable b = new Button();
//    Clickable image = new Image();

    public Container() {
        // add element to array
//        map.put(b, new Rect(new Point(100, 100), new Point(200, 200)));
//        map.put(image, new Rect(new Point(300, 100), new Point(450, 200)));
        clickables.add(new Image());
        clickables.add(new Button());
    }

    public void onUserClick(int x, int y){
        // check area
        if(x > 100 && x < 200){
//            Rect r = map.get(b);
//            b.click();
            clickables.get(0).click();
        } else  if(x > 300 && x < 450){
//            image.click();
            clickables.get(1).click();
        }
    }
}
