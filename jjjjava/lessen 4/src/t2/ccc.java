package t2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ccc implements ActionListener {
    JFrame j = new JFrame();
    JButton b = new JButton("title");
    boolean k;

    public ccc() {
      jj();
      bb();
    }
    public void jj (){
        j.setTitle("tytelll");
        j.setVisible(true);
        j.setBounds(650,490,500,700);

        j.getContentPane().setBackground(Color.red);
        j.add(b);
        j.setLayout(new FlowLayout());
    }

    public void bb(){
        b.setBounds(1,2,4,6);
        b.setVisible(true);
        b.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (k){
            k=false;
            j.getContentPane().setBackground(Color.red);
        }
        else {
            k=true;
            j.getContentPane().setBackground(Color.pink);
        }


    }

}
