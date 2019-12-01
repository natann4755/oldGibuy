package com.avratech;

import javam.button.Button;
import javam.button.OnClickListener;
import javam.button.Screen;

public class Main implements OnClickListener {

    public static void main(String[] args) {
        Screen screen = new Screen();
        Button b1 = new Button("b1");
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");

//        b1.setListener(new Person("Avi", "Levy"));
//        b2.setListener(new CloseWindow());

        OnClickListener m = new Main();
        b1.setListener(m);
        b2.setListener(m);
        b3.setListener(m);

        screen.addButton(b1);
        screen.addButton(b2);
        screen.addButton(b3);
        screen.listen();
    }

    Person p = new Person("A", "B");
    @Override
    public void onClick(Button b) {
       switch (b.getId()){

           case 1:
               System.out.println(p);
               break;
           case 2:
               Runtime.getRuntime().exit(0);
               break;
           case 3:
               System.out.println("Button 3 listener");
               break;
       }
    }
}
