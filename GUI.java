// THE FRONT PAGE


import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class GUI
{
    // declaring variable called interact
    public UserInteract interact;

    // constructor
    public GUI() {
        // initializing variable called interact
        interact = new UserInteract();

        // static int d1 = 200;

        JFrame f1 = new JFrame(" Store");
        JLabel l1;
        l1 = new JLabel("The Greatest Store");
        l1.setBounds(580, 50, 250, 35);
        final JTextField tf = new JTextField();
        tf.setBounds(530, 120, 253, 20);
        //frame and text


        JButton b1 = new JButton("Search");
        b1.setBounds(850, 120, 95, 30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("button 1 works");
                tf.setText("mog");
            }
        });

        JButton i1 = new JButton("add item "); // i swear you can use inheritance for the item buttons
        i1.setBounds(150, 200, 180, 70);
        i1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("BUTTON 1 works");
                interact.add_to_catalog();
            }
        });

        JButton i2 = new JButton("add item "); // i swear you can use inheritance for the item buttons
        i2.setBounds(150, 330, 180, 70);
        i2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("BUTTON 1 works");
                interact.add_to_catalog();
            }
        });

        DefaultListModel<String> li = new DefaultListModel<>();// the list
        li.addElement("Item1");
        li.addElement("Item2");
        li.addElement("Item3");
        li.addElement("Item4");
        JList<String> list = new JList<>(li);
        list.setBounds(520, 200, 230,200);

        f1.add(list);
        f1.add(b1);
        f1.add(i2);
        f1.add(i1);

        f1.add(l1);
        f1.add(tf);

        f1.setSize(1500, 2000);
        f1.setLayout(null);
        f1.setVisible(true);
        //add all the cool and important things


    }
}
