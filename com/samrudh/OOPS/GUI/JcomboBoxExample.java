package com.samrudh.OOPS.GUI;
import javax.swing.*;
import java.awt.event.*;
public class JcomboBoxExample {
    public static void main(String[] args) {
        JFrame f= new JFrame("Example");
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        String[] choices = new String[]{"Ponda","Panaji","Margao","Vasco","Mapusa"};
        JComboBox cities= new JComboBox(choices);
        cities.setBounds(100,100,100,30);
        f.add(cities);
        JLabel selection= new JLabel();
        selection.setBounds(200,150,75,40);
        f.add(selection);
        cities.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String item= String.valueOf(e.getItem());
                selection.setText(item);
            }
        });
        f.setVisible(true);
    }
}
