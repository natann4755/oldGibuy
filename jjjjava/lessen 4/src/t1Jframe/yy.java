package t1Jframe;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class solution extends JFrame{

    // label to diaplay text
          JLabel l;

    // main class
    public static void main(String[] args)
    {
        // create a new frame to stor text field and button
        JFrame natan = new JFrame("botteuuun");

        tttt t = new tttt();
        // create a new buttons
       JButton b = new JButton("button");
        b.addActionListener(t);
        // create a panel to add buttons
        JPanel p = new JPanel();

        // add buttons and textfield to panel
        p.add(b);

        // setbackground of panel


        // add panel to frame
        natan.add(p);

        // set the size of frame
        natan.setSize(700, 300);
        natan.setVisible(true);
        //natan.show();
        while (true) {
            if (t.b) {
                p.setBackground(Color.blue);
            } else {
                p.setBackground(Color.yellow);
            }
        }
    }
}