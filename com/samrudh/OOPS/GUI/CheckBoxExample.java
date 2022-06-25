package com.samrudh.OOPS.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxExample extends JFrame implements ActionListener, ItemListener {
    JCheckBox male= new JCheckBox("Male");
    JCheckBox female= new JCheckBox("Female");
    String gender;
    String animal;
    CheckBoxExample(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        male.setBounds(50,100,70,30);
        male.setVisible(true);
        add(male);
        male.addItemListener(this);

        female.setBounds(160,100,700,30);
        female.setVisible(true);
        add(female);
        female.addItemListener(this);

        JRadioButton cat = new JRadioButton("Cat");
        cat.setBounds(50,150,60,30);
        add(cat);

        JRadioButton bat = new JRadioButton("Bat");
        bat.setBounds(110,150,60,30);
        add(bat);

        JRadioButton dog = new JRadioButton("Dog");
        dog.setBounds(170,150,60,30);
        add(dog);

        JRadioButton rat = new JRadioButton("Rat");
        rat.setBounds(230,150,60,30);
        add(rat);

        ButtonGroup g= new ButtonGroup();
        g.add(cat);
        g.add(rat);
        g.add(dog);
        g.add(bat);

        ButtonGroup g1= new ButtonGroup();
        g1.add(male);
        g1.add(female);

        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(cat.isSelected()){
                    animal= cat.getActionCommand();
                }else if(rat.isSelected()){
                    animal=rat.getActionCommand();
                }else if(bat.isSelected()){
                    animal=bat.getActionCommand();
                }else if(dog.isSelected()){
                    animal= dog.getActionCommand();
                }
            }
        };

        cat.addItemListener(itemListener);
        dog.addItemListener(itemListener);
        bat.addItemListener(itemListener);
        rat.addItemListener(itemListener);

        Button b= new Button("Submit");
        b.setBounds(150,200,100,50);
        b.setVisible(true);
        add(b);
        b.addActionListener(this);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CheckBoxExample();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("Submit")){
            JDialog d= new JDialog(this,"Confirmation Dialog");
            d.setSize(200,200);
            d.setVisible(true);
            JLabel l= new JLabel("Gender : "+gender+" Animal : "+animal);
            d.add(l);
        }
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        Object item= e.getItem();
        if(item==male){
            gender="Male";
        }else if(item==female){
            gender="Female";
        }
    }
}
