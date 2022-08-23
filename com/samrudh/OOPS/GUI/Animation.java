package com.samrudh.OOPS.GUI;
import java.awt.*; import javax.swing.*; import java.awt.event.*;

@SuppressWarnings("serial")
class Pan extends JPanel implements ActionListener{
    Timer tim;
    int xvel=1,yvel=1,x1vel=1,y1vel=1,x=450,y=0,x1=0,y1=450;
    Color c1=Color.blue,c2=Color.cyan,c3=Color.magenta,c4=Color.pink;
    static int i1=0,i2=2,i3=4,i4=6,k=10;
    Pan(){
        this.setPreferredSize(new Dimension(500,500)); this.setBackground(Color.black);
        tim=new Timer(10,this); tim.start();
    }
    public void paint(Graphics g) { super.paint(g);
        Graphics2D g2d=(Graphics2D)g;

        g2d.setColor(c1); g2d.fillOval(0, y,50,50);

        g2d.setColor(c2); g2d.fillOval(x,0,50,50);

        g2d.setColor(c3); g2d.fillOval(x1,450,50,50);

        g2d.setColor(c4); g2d.fillOval(450,y1,50,50);
    }
    public void actionPerformed(ActionEvent e) { if(x<0 || x>=450) {
        xvel*=-1; c1=colormaker(++i1);
    }
        x+=xvel;
        if(x1<0 || x1>=450) {
            x1vel*=-1; c3=colormaker(++i3);
        }
        x1+=x1vel;
        if(y>=(500-50)|| y<0) {
            yvel*=-1; c2=colormaker(++i2);
        }
        y+=yvel;
        if(y1>=(500-50)||y1<0) {
            y1vel*=-1; c4=colormaker(++i4);
        }
        y1+=y1vel; k+=2;
        repaint();
    }
    public Color colormaker(int i) { Color[] c=
            {Color.blue,Color.cyan,Color.green,Color.magenta,Color.orange,Color.pink,Color.red,Color.yellow};
        return c[(i+1)%c.length];
    }
    public static void main(String[] args) {
        new Animation();
    }
}
class Animation{
    Pan panel;
    JFrame f=new JFrame();
    Animation(){
        panel=new Pan(); f.add(panel);
        f.pack(); f.setLocationRelativeTo(null); f.setVisible(true);
    }
}
