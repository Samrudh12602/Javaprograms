package com.samrudh.OOPS.GUI;

import java.awt.*;

class myframe extends Frame {
    myframe() {
        super("CAR");
    }
    public void paint(Graphics g)
    {
        int[] x={400,550,950,1100};
        int[] y={400,250,250,400};

        g.setColor(Color.RED);
        g.drawRect(300,400,1000,200);
        g.fillRect(300,400,1000,200);

        g.setColor(Color.white);
        g.fillOval(400,530,150,150);
        g.drawOval(400,530,150,150);

        g.setColor(Color.black);
        g.fillPolygon(x,y,4);
        g.drawPolyline(x,y,4);

        g.setColor(Color.green );
        g.fillOval(415,545,120,120);
        g.drawOval(415,545,120,120);

        g.setColor(Color.white);
        g.fillOval(435,565,80,80);
        g.drawOval(435,565,80,80);

        g.setColor(Color.white);
        g.fillOval(1000,530,150,150);
        g.drawOval(1000,530,150,150);

        g.setColor(Color.green);
        g.fillOval(1015,545,120,120);
        g.drawOval(1015,545,120,120);

        g.setColor(Color.white);
        g.fillOval(1035,565,80,80);
        g.drawOval(1035,565,80,80);

        g.setColor(Color.yellow);
        int[] x1={550,600,850,900};
        int[] y1={350,300,300,350};
        g.fillPolygon(x1,y1,4);
        g.drawPolygon(x1,y1,4);

        g.setColor(Color.white);
        g.fillRect(710,300,10,50);
        g.drawRect(710,300,10,50);
        g.fillRect(260,540,40,20);
        g.drawRect(260,540,40,20);
    }
}
class Output
{
    public static void main(String[] args)
    {
        myframe f=new myframe();
        f.setVisible(true);
        f.setSize(2000,2000);
    }
}
