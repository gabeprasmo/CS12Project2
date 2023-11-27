/* //note you can use the Jpanel to make the navBar
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PG2 {
    public static void main(String[] args) {
        JFrame f=new JFrame("ITEM ###");
        final JTextField tf=new JTextField();
        tf.setBounds(750,120, 150,20);
        //frame and text
        JButton b1=new JButton("Click Here");
        b1.setBounds(750,180,95,30);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("THE GREATEST STORE");
                System.out.println("page2");
            }

        });


        f.add(b1);f.add(tf);
        f.setSize(1500,2000);
        f.setLayout(null);
        f.setVisible(true);
    }


}
//walmart look

*/


// qik save

/*

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

    public class PG2  extends Canvas {

        public  void paint(Graphics g) {

            g.drawString("Hello", 250, 50);
            setBackground(Color.RED);
            setForeground(Color.RED);
        }
        // graphics ie. navboard

        public static void main(String[] args) {

        JFrame f=new JFrame("ITEM ###");
        final JTextField tf=new JTextField();
        //tf.setBounds(750,100, 150,20);
        JButton bb =new JButton("i am here");
        bb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    System.out.println("it works");
                    tf.setText("i work");
                }
            });
        bb.setBounds(100,80,600,680);
        bb.setBackground(Color.blue);

        JPanel pp = new JPanel();
        pp.setBounds(750,120,150,150);



        f.setSize(1500,2000);
        f.add(bb);
        //f.add(tf);
        f.add(pp);
        f.setLayout(null);
        f.setVisible(true);
        System.out.println(" I WOK");
        // the important things
    }


}
*/