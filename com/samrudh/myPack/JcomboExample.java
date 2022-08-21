package com.samrudh.myPack;

import com.samrudh.OOPS.GUI.JcomboBoxExample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JcomboExample extends JFrame implements ActionListener {
    JLabel choice = new JLabel();
    JComboBox comboBox ;
    JcomboExample(){
        setSize(400,400);
        setLayout(null);
        String choices[]= new String[]{"IT1","IT2","IT3"};
        comboBox= new JComboBox(choices);
        comboBox.setBounds(100,100,100,50);
        choice.setBounds(100,175,100,30);
        add(comboBox);
        add(choice);
        comboBox.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        choice.setText((String) comboBox.getSelectedItem());
    }
    public static void main(String[] args) {
        JcomboExample j= new JcomboExample();
    }
}
