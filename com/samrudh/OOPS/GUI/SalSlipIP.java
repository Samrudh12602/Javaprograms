package com.samrudh.OOPS.GUI;
import java.awt.*; import javax.swing.*;
import javax.swing.border.EmptyBorder; import java.awt.event.*;
import java.util.Calendar; import java.util.Random;
class SalSlipOP extends JFrame { private JPanel f;
    private String[] Months=
            {"January","February","March","April","May","June","July","August","September","Octob er","November","December"};
    private JTable table,table1;

    public SalSlipOP(String a,String b,String c,float d) { float da,h,t,gr,gp,ta,dd,n;
        da=0.34f*d; h=0.18f*(da+d); t=3600+(0.34f*3600);
        gr=d+t+h+da; gp=0.1f*gr; ta=0.2f*gr; dd=gp+ta; n=gr-dd;
        String data[][]= {{"Basic",Float.toString(d),"GPF",Float.toString(gp)},
                {"HRA",Float.toString(h),"Tax",Float.toString(ta)},
                {"TA",Float.toString(t),"",""},
                {"DA",Float.toString(da),"",""},
                {"","","",""},
                {"Total Addition",Float.toString(gr),"Total Deduction",Float.toString(dd)},
                {"","","",""},
                {"","","NET SALARY",Float.toString(n)}};

        String[][] col1= {{"Earnings","Amount","Deductions","Amount"}};
        String[] col= {"","","",""};

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); setTitle("Salary Slip");
        setBounds(100, 100, 800, 570);
        f = new JPanel();
        f.setBorder(new EmptyBorder(5, 5, 5, 5)); setContentPane(f);
        f.setLayout(null);

        JLabel lblTit = new JLabel("GEC Solutions Pvt. Ltd"); lblTit.setFont(new Font("Tahoma", Font.BOLD, 25));

        lblTit.setBounds(245, 0, 284, 49); f.add(lblTit);

        JLabel lblAdd = new JLabel("Pharmagudi,Ponda,Goa"); lblAdd.setFont(new Font("Tahoma", Font.PLAIN, 14)); lblAdd.setBounds(308, 40, 153, 21);
        f.add(lblAdd);

        JLabel lblSlp = new JLabel("Salary Slip");
        lblSlp.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20)); lblSlp.setBounds(318, 84, 114, 21);
        f.add(lblSlp);

        JLabel lblName = new JLabel();
        lblName.setFont(new Font("Arial", Font.PLAIN, 16)); lblName.setText("Employee Name : "+a); lblName.setBounds(198, 116, 365, 27); f.add(lblName);

        JLabel lblDes = new JLabel();
        lblDes.setFont(new Font("Arial", Font.PLAIN, 16)); lblDes.setText("Designation : "+b); lblDes.setBounds(198, 155, 365, 27); f.add(lblDes);

        JLabel lblPhone = new JLabel();
        lblPhone.setFont(new Font("Arial", Font.PLAIN, 16)); lblPhone.setText("Phone No. : "+c); lblPhone.setBounds(198, 196, 365, 27); f.add(lblPhone);

        JLabel lblMon = new JLabel();
        lblMon.setFont(new Font("Arial", Font.PLAIN, 16)); lblMon.setBounds(198, 234, 365, 27);
        Calendar cal=Calendar.getInstance();
        lblMon.setText("Month : "+Months[cal.get(Calendar.MONTH)]); f.add(lblMon);

        table = new JTable(data,col);
        table.setFont(new Font("SansSerif", Font.PLAIN, 17)); table.setBounds(81, 296, 620, 130);
        f.add(table);

        JLabel lblChq = new JLabel();
        lblChq.setFont(new Font("Arial", Font.PLAIN, 16)); Random ran=new Random();
        lblChq.setText("Cheque No. : "+ran.nextInt(1000)); lblChq.setBounds(81, 437, 128, 21); f.add(lblChq);

        JLabel lblDate = new JLabel();
        lblDate.setFont(new Font("Arial", Font.PLAIN, 16));
        lblDate.setBounds(584, 437, 135, 21);
        String date=cal.get(Calendar.DATE)+"-"+(cal.get(Calendar.MONTH)+1)+"- "+cal.get(Calendar.YEAR);

        lblDate.setText("Date : "+date); f.add(lblDate);

        JLabel lblSignr = new JLabel("Signature of Employer"); lblSignr.setFont(new Font("Tahoma", Font.BOLD, 13)); lblSignr.setBounds(548, 499, 153, 21); f.add(lblSignr);

        JLabel lblSigne = new JLabel("Signature of Employee"); lblSigne.setFont(new Font("Tahoma", Font.BOLD, 13)); lblSigne.setBounds(81, 499, 153, 21);
        f.add(lblSigne);

        table1 = new JTable(col1,col); table1.setBackground(SystemColor.activeCaption); table1.setFont(new Font("Tahoma", Font.BOLD, 15)); table1.setBounds(81, 280, 620, 16);
        f.add(table1);
}
    }

    public class SalSlipIP implements ActionListener{ private JFrame f;
        private JTextField tfSal,tfPhn,tfDes,tfName; private JButton btnGen,btnRes;

        public static void main(String[] args) {
            SalSlipIP p = new SalSlipIP();
        }

        public SalSlipIP() {
            f=new JFrame("Pay Slip");

            JLabel Title = new JLabel("PAY SLIP");
            Title.setFont(new Font("Tahoma", Font.PLAIN, 22)); Title.setBounds(180, 0, 95, 25);
            f.getContentPane().add(Title); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); f.getContentPane().setLayout(null);

            btnGen = new JButton("Generate");
            btnGen.setFont(new Font("Tahoma", Font.BOLD, 11)); btnGen.setBounds(240, 207, 95, 23);
            btnGen.addActionListener(this); f.getContentPane().add(btnGen);

            btnRes = new JButton("Reset");
            btnRes.setFont(new Font("Tahoma", Font.BOLD, 11)); btnRes.setBounds(103, 207, 95, 23);
            btnRes.addActionListener(this); f.getContentPane().add(btnRes);

            JLabel lblName = new JLabel("Employee Name");
            lblName.setFont(new Font("Tahoma", Font.BOLD, 11)); lblName.setBounds(20, 47, 95, 25);

            f.getContentPane().add(lblName);

            tfName = new JTextField();
            tfName.setBounds(203, 49, 192, 20); f.getContentPane().add(tfName);

            JLabel lblDes=new JLabel("Employee Designation");
            lblDes.setFont(new Font("Tahoma", Font.BOLD, 11)); lblDes.setBounds(20, 83, 132, 25);
            f.getContentPane().add(lblDes);

            tfDes = new JTextField();
            tfDes.setBounds(203, 85, 192, 20);
            f.getContentPane().add(tfDes);

            JLabel lblPhn = new JLabel("Employee Phone No.");
            lblPhn.setFont(new Font("Tahoma", Font.BOLD, 11)); lblPhn.setBounds(20, 119, 119, 25);
            f.getContentPane().add(lblPhn);

            tfPhn = new JTextField();
            tfPhn.setBounds(203, 121, 192, 20);
            f.getContentPane().add(tfPhn);

            JLabel lblSal=new JLabel("Employee Basic Salary(in Rs)");
            lblSal.setFont(new Font("Tahoma", Font.BOLD, 11));
            lblSal.setBounds(20, 155, 163, 25); f.getContentPane().add(lblSal);

            tfSal = new JTextField();
            tfSal.setBounds(203, 157, 192, 20);
            f.getContentPane().add(tfSal);

            f.setBounds(100, 100, 450, 280); f.setVisible(true);
        }

        public void actionPerformed(ActionEvent e){
            if(e.getSource()== btnGen) {
                String a=tfName.getText();
                String b=tfDes.getText();
                String c=tfPhn.getText();
                Float d=Float.parseFloat(tfSal.getText());
                SalSlipOP gen=new SalSlipOP(a,b,c,d);
                gen.setVisible(true);
            }
            else if (e.getSource()==btnRes) {
                tfName.setText(null);
                tfDes.setText(null);
                tfPhn.setText(null);
                tfSal.setText(null);
            }

        }
    }
