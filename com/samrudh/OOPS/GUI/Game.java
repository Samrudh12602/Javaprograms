package com.samrudh.OOPS.GUI;

import javax.swing.*;
import java.awt.*;

public class Game extends JPanel
{
    int x =0;
    int y =0;

    private void moveBall()
    {

        x+=1;
        y+=1;
    }

    public void paint (Graphics g)
    {
        super.paint(g);
        g.fillOval(x, y, 30, 30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animation");
        Game game = new Game();
        frame.add(game);
        frame.setVisible(true);
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        while (true)
        {
            game.moveBall();
            game.repaint();

        }
    }
}