package javam.button;

import javam.button.Button;
import java.util.ArrayList;
import java.util.Scanner;

public class Screen {

    ArrayList<Button> list = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public Screen() {
    }

    public void addButton(Button b) {
        list.add(b);
    }

    public void listen(){
        while (true) {
            System.out.println("Click x:");
            int x = Integer.parseInt(scan.nextLine());

//            for (int i = 0; i < list.size(); i++) {
//                if(list.get(i).start.x > x) {
//
//                }
//            }

            if(x > 100 && x < 200){
                list.get(0).click(x, 0);
            } else if(x > 300 && x < 450){
                list.get(1).click(x, 0);
            }
        }
    }

}
