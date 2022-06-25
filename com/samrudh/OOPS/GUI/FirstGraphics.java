package com.samrudh.OOPS.GUI;

import javax.swing.*;
import java.awt.*;

public class FirstGraphics extends JFrame {
    FirstGraphics(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dra d = new Dra();
        add(d);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        FirstGraphics f= new FirstGraphics();
    }
}
class Dra extends JPanel{
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.red);
//        g.drawOval(150,150,100,100);
//        g.drawOval(120,125,50,50);
//        g.drawOval(230,125,50,50);
//        g.drawOval(185,205,30,30);
//        g.drawOval(175,175,20,20);
//        g.drawOval(205,175,20,20);

        g.drawRect(100,100,80,50);
        int [] x = {50,100,0};
        int [] y = {50,100,100};
        g.drawPolygon(x, y, 3);
    }
}
