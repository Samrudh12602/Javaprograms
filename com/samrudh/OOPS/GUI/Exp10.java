package com.samrudh.OOPS.GUI;

import javax.swing.*; import java.awt.*; import java.awt.event.*;
import javax.swing.event.*;
class AboutDial extends JPanel{
    JDialog jd=new JDialog();
    public AboutDial() {
        jd.setTitle("About me");
        jd.setLocationRelativeTo(null);
        jd.getContentPane().setLayout(null);
        setBounds(194, 30, 150, 200);
        setBackground(Color.red);
        setLayout(null);
        jd.getContentPane().add(this);
        jd.setSize(560, 335);

        JLabel head = new JLabel("About");
        head.setFont(new Font("Rockwell", Font.BOLD, 16));
        head.setHorizontalAlignment(SwingConstants.CENTER);
        head.setBounds(121, 0, 301, 32);
        jd.getContentPane().add(head);

        JLabel abt1 = new JLabel("Developed by Samrudh Dhaimodkar currently pursuing B.E. in Information Technology from");
        abt1.setBounds(10, 241, 550, 21);
        jd.getContentPane().add(abt1);

        JLabel abt2 = new JLabel("Goa College of Engineering for the purpose of Experiment 10 to demonstrate the use of ");
        abt2.setBounds(10, 258, 550, 21);
        jd.getContentPane().add(abt2);
        JLabel abt3 = new JLabel("JSlider, JOptionPane, JDialog, JMenu, JMenuItem and JMenuBar.");
        abt3.setBounds(10, 273, 500, 21);
        jd.getContentPane().add(abt3);
        setVisible(true);
        jd.setVisible(true);
    }
    public void paint (Graphics g){
        Image i = Toolkit.getDefaultToolkit().getImage("C:\\Users\\samdh\\OneDrive\\Desktop\\sam.jpg");
        g.drawImage(i, 0, 0, 150, 200, this);
    }
}
class TELite implements ActionListener{ public String s="",dfont="Arial";
    public String[] sfont= {"Plain","Bold","Italic"};
    public String[] fonts= {"Arial","Calibri","Cambria","Consolas","Seoge UI","Tahoma"};
    public int fsize=15,stfont=0;
    Font defFont=new Font(dfont,stfont,fsize); JFrame frame;
    JMenuItem Copy,cut,clear,Paste,style,size;
    JCheckBoxMenuItem Wordwrap; JMenu Edit,Format,Fonts,About; JMenuBar menuBar;
    JTextArea ta;
    JDialog jd;
    public static void main(String[] args) { new TELite();
    }
    public TELite() {
        frame = new JFrame("Experiment 11"); frame.setBounds(100, 100, 729, 401);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 713, 340);
        frame.getContentPane().add(scrollPane);
        ta = new JTextArea();
        ta.setFont(defFont);
        scrollPane.setViewportView(ta);
        Copy=new JMenuItem("Copy");
        Copy.addActionListener(this);
        Paste=new JMenuItem("Paste");
        Paste.addActionListener(this);
        cut=new JMenuItem("Cut");
        cut.addActionListener(this);
        clear=new JMenuItem("Clear all");
        clear.addActionListener(this);
        Wordwrap=new JCheckBoxMenuItem("Word Wrap"); Wordwrap.addActionListener(this);
        style=new JMenuItem("Style"); style.addActionListener(this); size=new JMenuItem("Size"); size.addActionListener(this);
        Fonts=new JMenu("Font");
        Fonts.add(style);
        Fonts.add(size);
        Edit=new JMenu("Edit"); Edit.add(cut); Edit.add(Copy);
        Edit.add(clear);
        Edit.add(Paste);
        Format=new JMenu("Format");
        Format.add(Wordwrap);
        Format.add(Fonts);

        About=new JMenu("About"); About.addMenuListener(new MenuListener() {
            public void menuSelected(MenuEvent e) { new AboutDial();
            }
            public void menuDeselected(MenuEvent e) {
            }
            public void menuCanceled(MenuEvent e) {
            }
        });
        menuBar = new JMenuBar();
        menuBar.add(Edit);
        menuBar.add(Format);
        menuBar.add(About);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) { if(e.getSource()==size) {
        jd=new JDialog(frame,"Font Size"); jd.setLocationRelativeTo(null);
        jd.getContentPane().setLayout(null);
        frame.disable();
        jd.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        JLabel lbl = new JLabel("Size");
        lbl.setFont(new Font("Consolas",Font.BOLD, 14));
        lbl.setBounds(10, 11, 41, 25); jd.getContentPane().add(lbl);
        JSlider slider = new JSlider(JSlider.HORIZONTAL,0,30,fsize); slider.setMinorTickSpacing(1); slider.setMajorTickSpacing(2);
        slider.setPaintTicks(true); slider.setPaintLabels(true); slider.setBounds(20, 47, 427, 50);
        jd.getContentPane().add(slider);
        jd.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.enable();
                jd.dispose();
            }
        });
        JButton btn = new JButton("Ok"); btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { fsize=slider.getValue();
                defFont=new Font(dfont,stfont,fsize); ta.setFont(defFont);
                frame.enable(); jd.dispose();
            }
        });
        btn.setBounds(199, 107, 89, 23); jd.getContentPane().add(btn);
        jd.setSize(500,180);
        jd.setVisible(true);
    }else if(e.getSource()==style) {
        jd=new JDialog(frame,"Font Size");
        jd.setLocationRelativeTo(null); jd.getContentPane().setLayout(null);
        frame.disable();
        jd.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        jd.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.enable();
                jd.dispose();
            }
        });
        JLabel lbl = new JLabel("Font");
        lbl.setFont(new Font("Consolas", Font.BOLD, 14));
        lbl.setBounds(40, 15, 41, 25);
        jd.getContentPane().add(lbl);
        JLabel lblStyle = new JLabel("Style"); lblStyle.setFont(new Font("Consolas", Font.BOLD, 14));
        lblStyle.setBounds(237, 15, 41, 25);
        jd.getContentPane().add(lblStyle);
        JComboBox cb = new JComboBox(fonts); cb.setBounds(40, 43, 108, 22);
        jd.getContentPane().add(cb);
        JComboBox cb1 = new JComboBox(sfont); cb1.setBounds(237, 43, 87, 22);
        jd.getContentPane().add(cb1);
        JButton btn = new JButton("Ok"); btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dfont=(String)cb.getSelectedItem();
                stfont=cb1.getSelectedIndex();
                defFont=new Font(dfont,stfont,fsize);
            }
        });
        ta.setFont(defFont); frame.enable(); jd.dispose();
        btn.setBounds(146, 166, 89, 23); jd.getContentPane().add(btn); jd.setSize(400,250); jd.setVisible(true);
    }else if(e.getSource()==Copy) { s=ta.getText();
    }else if(e.getSource()==Paste) { String g=ta.getText(); g+=s;
        ta.setText(g); s="";
    }else if(e.getSource()==cut) { s=ta.getText(); ta.setText(null);
    }else if(e.getSource()==clear) {
        int i=JOptionPane.showConfirmDialog(frame,"Do you want to clear?");
        if(i==JOptionPane.YES_OPTION) ta.setText(null);
    }else if(Wordwrap.isSelected()) { ta.setLineWrap(true);
    }else if(!Wordwrap.isSelected()) { ta.setLineWrap(false);
    }
    }
}
