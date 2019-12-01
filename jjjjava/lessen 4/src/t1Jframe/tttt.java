package t1Jframe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tttt implements ActionListener {
 boolean b;



    @Override
    public void actionPerformed(ActionEvent e) {
       if (b)
             b=false;
       else{
           b=true;
           System.out.println("lllll");
       }

    }
}
