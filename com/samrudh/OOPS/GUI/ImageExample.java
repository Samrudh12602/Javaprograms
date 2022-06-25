package com.samrudh.OOPS.GUI;
import javax.swing.*;
import java.awt.*;
public class ImageExample extends Canvas{
    public void paint(Graphics g){
        Toolkit t= Toolkit.getDefaultToolkit();
        Image i= t.getImage("/Users/samrudhdhaimodkar/Downloads/tree-736885__480.jpeg");
        g.drawImage(i,0,0,this);
    }
    public static void main(String[] args) {
        ImageExample m= new ImageExample();
        JFrame f= new JFrame("Image");
        f.setSize(800,550);
        f.add(m);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
