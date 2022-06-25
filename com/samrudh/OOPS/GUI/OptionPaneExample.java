package com.samrudh.OOPS.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionPaneExample {
    public static void main(String[] args) {
        JFrame f= new JFrame("Example of Option pane");
        f.setSize(600,600);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b= new JButton("Click for Input Pane");
        b.setBounds(50,50,150,50);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str= JOptionPane.showInputDialog("Enter your name:");
                if(str.length()>0){
                    System.out.println("Name is: "+str);
                }
            }
        });
        JButton b1= new JButton("Click for Text Pane");
        b1.setBounds(50,110,150,50);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Plain message","Message",JOptionPane.PLAIN_MESSAGE);
            }
        });
        JButton b2= new JButton("Click for Info Pane");
        b2.setBounds(50,170,150,50);
        f.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Info message","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        JButton b3= new JButton("Click for Warning Pane");
        b3.setBounds(50,230,150,50);
        f.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Warning message","Warning",JOptionPane.WARNING_MESSAGE);
            }
        });
        JButton b4= new JButton("Click for Question Pane");
        b4.setBounds(50,290,150,50);
        f.add(b4);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Question?","Question",JOptionPane.QUESTION_MESSAGE);
            }
        });
        JButton b5= new JButton("Click for Error Pane");
        b5.setBounds(50,350,150,50);
        f.add(b5);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Error message","Error",JOptionPane.ERROR_MESSAGE);
            }
        });
        JButton b6= new JButton("Click for Confirmation");
        b6.setBounds(50,410,150,50);
        f.add(b6);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sel= JOptionPane.showConfirmDialog(JOptionPane.getRootFrame(),"Are you sure?","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(sel==JOptionPane.YES_OPTION){
                    System.out.println("YES");
                }else if(sel==JOptionPane.NO_OPTION){
                    System.out.println("NO");
                }else{
                    System.out.println("Cancel");
                }
            }
        });
        f.setVisible(true);
    }
}