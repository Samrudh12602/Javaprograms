package com.samrudh.OOPS.GUI;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreadGuiExample extends Thread{
    @Override
    public void run(){
        System.out.println("task performed by "+ Thread.currentThread().getName());
    }
}
class Example extends JFrame implements ActionListener {
    Example(){
        setSize(400,400);
        setLayout(null);

        JButton b1 = new JButton("Start 1 Thread");
        JButton b2 = new JButton("Start 2 Threads");
        JButton b3 = new JButton("Start 3 Threads");
       b1.setBounds(10,100,120,30);
       b2.setBounds(140,100,120,30);
       b3.setBounds(270,100,120,30);
       add(b1);
       add(b2);
       add(b3);
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       setVisible(true);
    }
    public static void main(String[] args) {
        new Example();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        ThreadGuiExample t[];
        switch (e.getActionCommand()){
            case "Start 1 Thread":
                t= new ThreadGuiExample[1];
                for(int i=0;i<1;i++){
                    t[i]= new ThreadGuiExample();
                    t[i].start();
                }
                break;
            case "Start 2 Threads":
                t= new ThreadGuiExample[2];
                for(int i=0;i<2;i++){
                    t[i]= new ThreadGuiExample();
                    t[i].start();
                }
                break;
            case "Start 3 Threads":
                t= new ThreadGuiExample[3];
                for(int i=0;i<3;i++){
                    t[i]= new ThreadGuiExample();
                    t[i].start();
                }
                break;
        }
    }
}
