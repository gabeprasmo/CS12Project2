// THE FRONT PAGE
// TO RON: add the other buttons

import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class GUI
{
    // declaring variable called interact
    public UserInteract interact;

    // constructor
    public GUI()
    {
        // initializing variable called interact
        interact = new UserInteract();

        // static int d1 = 200;

        JFrame f1 = new JFrame(" Store");
        JLabel l1;
        l1= new JLabel("The Greatest Store");
        l1.setBounds(580,50,250,35);
        final JTextField tf = new JTextField();
        tf.setBounds(580, 120, 253, 20);
        //frame and text


        JButton b1 = new JButton("Search");
        b1.setBounds(850, 120, 95, 30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("button 1 works");
                tf.setText("mog");

            }
        });

        JButton b2 = new JButton("CART");
        b2.setBounds(50, 100, 95, 75);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("button 2 works");
                tf.setText("see");// shows user the cart
            }
        }); // the shopping cart ( it dont do very much )


        JButton i1 = new JButton("item 1 "); // i swear you can use inheritance for the item buttons
        i1.setBounds(150,200,200,200);
        i1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("BUTTON 1 works");
                interact.add_to_catalog();


            }

        });
        JButton i2 = new JButton("item  2");
        i2.setBounds(400,200,200,200);
        i2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("BUTTON 2 works");
            }

        });
        JButton i3 = new JButton("item 3 ");
        i3.setBounds(650,200,200,200);
        i3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                tf.setText("BUTTON 3 works");
            }

        });


        f1.add(l1);

        f1.add(b1);
        f1.add(b2);

        f1.add(i1);
        f1.add(i2);
        f1.add(i3);

        f1.add(tf);

        f1.setSize(1500, 2000);
        f1.setLayout(null);
        f1.setVisible(true);
        //add all the cool and important things


    }
}
