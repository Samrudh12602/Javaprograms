package com.samrudh.OOPS.GUI;

import java.awt.event.*; import java.util.Calendar; import java.util.Random; import java.awt.*;
import javax.swing.JFrame; import javax.swing.JLabel; import javax.swing.JPanel; import javax.swing.JTable; import javax.swing.JTextField;
import javax.swing.border.EmptyBorder; import javax.swing.JButton;

class ElBillOP extends JFrame { private JPanel cp;
    private JTable table,table1,table2,table3;

    public ElBillOP(String a,String b,String c,int prev,int pres,int days) { int units=pres-prev;
        float bill,metc; if(units<=100)
            bill=10*units; else if(units<=200)
            bill=10*100+(units-100)*15;
        else
            bill=10*100+100*15+(units-200)*20;
        metc=(0.15f*bill);

        String[][] data= {{"Meter Number","Unit","Current date","Current reading","Previous date","Previous reading","Consumption","Reading Remark"}};
        Random ran=new Random();
        Calendar cal=Calendar.getInstance();
        String curdate=cal.get(Calendar.DATE)+"-"+(cal.get(Calendar.MONTH)+1)+"- "+cal.get(Calendar.YEAR);
        cal.add(Calendar.DATE,-days);
        String predate=cal.get(Calendar.DATE)+"-"+(cal.get(Calendar.MONTH)+1)+"- "+cal.get(Calendar.YEAR);
        cal.add(Calendar.DATE,days+56); String[][] data1=
                {{Integer.toString(ran.nextInt(1000)),"KWH",curdate,Integer.toString(pres),predate,Integer.toString(prev),Integer.toString(units),"OK"}};
        String col[]= {"","","","","","","",""};
        String[][] data2= {{"Energy Charges",Float.toString(bill)},
                {"Meter rent",Float.toString(metc)},
                {"",""},
                {"Amount Payable",Float.toString(bill+metc)}}; String[][] data3= {{"Particulars","Amount"}};
        String col1[]= {"",""};

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); setTitle("Electricity Department"); setBounds(100, 100, 830, 535);

        cp = new JPanel();
        cp.setBorder(new EmptyBorder(5, 5, 5, 5)); setContentPane(cp);
        cp.setLayout(null);

        JLabel Title = new JLabel("ELECTRICITY DEPARTMENT"); Title.setFont(new Font("Tahoma", Font.BOLD, 20)); Title.setBounds(257, 0, 285, 43);
        cp.add(Title);


        JLabel lblAdd = new JLabel("Division Div 03 : Mapusa Sub Division SD 1 : Porvorim");
        lblAdd.setFont(new Font("Tahoma", Font.PLAIN, 14)); lblAdd.setBounds(229, 31, 366, 22);
        cp.add(lblAdd);

        JLabel lblname = new JLabel(); lblname.setText("Consumer Name : "+a); lblname.setFont(new Font("Arial", Font.PLAIN, 14)); lblname.setBounds(245, 83, 308, 32); cp.add(lblname);

        JLabel lblID = new JLabel(); lblID.setText("Consumer ID : "+b); lblID.setFont(new Font("Arial", Font.PLAIN, 14)); lblID.setBounds(245, 126, 308, 32); cp.add(lblID);

        JLabel lblPhn = new JLabel(); lblPhn.setText("Phone No. : "+c); lblPhn.setFont(new Font("Arial", Font.PLAIN, 14)); lblPhn.setBounds(245, 169, 308, 32); cp.add(lblPhn);

        table = new JTable(data1,col);
        table.setFont(new Font("Tahoma", Font.PLAIN, 13)); table.setBounds(10, 272, 799, 14);
        cp.add(table);

        table1 = new JTable(data,col); table1.setBackground(SystemColor.activeCaption); table1.setFont(new Font("Arial", Font.BOLD, 12)); table1.setBounds(10, 258, 799, 14); cp.add(table1);

        JLabel lblsignr = new JLabel("Meter readers Sign"); lblsignr.setFont(new Font("Tahoma", Font.BOLD, 12)); lblsignr.setBounds(107, 473, 120, 14); cp.add(lblsignr);

        JLabel lblsignc = new JLabel("CEE's Sign"); lblsignc.setFont(new Font("Tahoma", Font.BOLD, 12)); lblsignc.setBounds(620, 473, 66, 14); cp.add(lblsignc);

        table2= new JTable(data2,col1);
        table2.setFont(new Font("Tahoma", Font.PLAIN, 14)); table2.setBounds(195, 336, 370, 64); cp.add(table2);

        JLabel lbldue = new JLabel();
        String duedate=cal.get(Calendar.DATE)+"-"+(cal.get(Calendar.MONTH))+"- "+cal.get(Calendar.YEAR);
        lbldue.setText("Due Date : "+duedate); lbldue.setForeground(Color.RED); lbldue.setFont(new Font("Tahoma", Font.BOLD, 14)); lbldue.setBounds(195, 415, 171, 22); cp.add(lbldue);

        JLabel lblper = new JLabel(); lblper.setText("Billing period in days : "+days); lblper.setFont(new Font("Arial", Font.PLAIN, 14)); lblper.setBounds(245, 212, 308, 32); cp.add(lblper);

        table3 = new JTable(data3,col1); table3.setBackground(SystemColor.activeCaptionBorder); table3.setFont(new Font("Tahoma", Font.BOLD, 12)); table3.setBounds(195, 322, 370, 14);
        cp.add(table3);
    }
}

class ElBillIP implements ActionListener{

    private JFrame frame;
    private JTextField tfname,tfid,tfphn,tfprev,tfpres,tfper; private JButton btnGen,btnres;

    public ElBillIP() {
        frame = new JFrame("Electricity Bill"); frame.setBounds(100, 100, 525, 375); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.getContentPane().setLayout(null);

        JLabel Title = new JLabel("ELECTRICITY BILL"); Title.setFont(new Font("Tahoma", Font.BOLD, 22)); Title.setBounds(147, 0, 215, 35); frame.getContentPane().add(Title);

        JLabel lblName = new JLabel("Consumer Name");
        lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblName.setBounds(55, 56, 115, 25);
        frame.getContentPane().add(lblName);

        tfname = new JTextField();
        tfname.setBounds(224, 59, 188, 20);
        frame.getContentPane().add(tfname);
        tfname.setColumns(10);

        JLabel lblID = new JLabel("Consumer ID");
        lblID.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblID.setBounds(55, 92, 88, 25);
        frame.getContentPane().add(lblID);

        tfid = new JTextField();
        tfid.setBounds(224, 95, 188, 20);
        frame.getContentPane().add(tfid);

        JLabel lblPhn = new JLabel("Phone No.");
        lblPhn.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblPhn.setBounds(55, 128, 70, 25);
        frame.getContentPane().add(lblPhn);

        tfphn = new JTextField();
        tfphn.setBounds(224, 131, 188, 20);
        frame.getContentPane().add(tfphn);

        JLabel lblprev=new JLabel("Previous meter reading");
        lblprev.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblprev.setBounds(55, 164, 159, 25);
        frame.getContentPane().add(lblprev);

        tfprev = new JTextField();
        tfprev.setBounds(224, 167, 188, 20);
        frame.getContentPane().add(tfprev);

        JLabel lblpres=new JLabel("Present meter reading");
        lblpres.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblpres.setBounds(55, 200, 157, 25);
        frame.getContentPane().add(lblpres);

        tfpres = new JTextField();
        tfpres.setBounds(224, 203, 188, 20);
        frame.getContentPane().add(tfpres);

        JLabel lblper=new JLabel("Bill period(in days)");
        lblper.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblper.setBounds(55, 236, 127, 25);
        frame.getContentPane().add(lblper);

        tfper = new JTextField();
        tfper.setBounds(224, 239, 188, 20);
        frame.getContentPane().add(tfper);

        btnres = new JButton("Reset");
        btnres.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnres.setBounds(132, 291, 102, 23);
        btnres.addActionListener(this);
        frame.getContentPane().add(btnres);

        btnGen = new JButton("Generate");
        btnGen.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnGen.setBounds(273, 291, 102, 23);
        btnGen.addActionListener(this);
        frame.getContentPane().add(btnGen);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()== btnGen) {
            String a=tfname.getText();
            String b=tfid.getText(); String c=tfphn.getText();
            int prev=Integer.parseInt(tfprev.getText());
            int pres=Integer.parseInt(tfpres.getText());
            int days=Integer.parseInt(tfper.getText());
            ElBillOP n=new ElBillOP(a,b,c,prev,pres,days);
            n.setVisible(true);
        }
        else if (e.getSource()==btnres) {
            tfname.setText(null);
            tfid.setText(null);
            tfphn.setText(null);
            tfprev.setText(null);
            tfpres.setText(null);
            tfper.setText(null);
        }

    }
    public static void main(String[] args) {
        ElBillIP e= new ElBillIP();
    }
}

