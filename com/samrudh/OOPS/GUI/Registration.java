package com.samrudh.OOPS.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Registration extends Frame implements ActionListener {
    Label l, l1, l2, l3, l4, l5;
    TextField t, t1, t2, t3, t4, t5;
    JComboBox day, month, year;
    JCheckBox term;
    JTextArea screen;
    Button b;
    JRadioButton r1, r2, r3;
    public Registration() {
        super("registration form");
        super.setBackground(Color.YELLOW);
        setLayout(null);
        l = new Label("Name : ");
        l.setBounds(40, 80, 50, 30);
        t = new TextField(20);
        t.setBounds(100, 80, 200, 30);
        l1 = new Label("Address:");
        l1.setBounds(35, 130, 65, 30);
        t1 = new TextField(20);
        t1.setBounds(100, 130, 200, 60);
        l2 = new Label("Phone : ");
        l2.setBounds(40, 210, 70, 30);
        t2 = new TextField(20);
        t2.setBounds(110, 210, 200, 30);
        l3 = new Label("Email : ");
        l3.setBounds(40, 260, 60, 30);
        t3 = new TextField(20);
        t3.setBounds(110, 260, 200, 30);
        l4 = new Label("Gender : ");
        l4.setBounds(40, 320, 70, 30);
        add(l4);
        r1 = new JRadioButton("Male");
        r1.setBounds(110, 320, 70, 30);
        add(r1);
        r2 = new JRadioButton("Female");
        r2.setBounds(200, 320, 80, 30);
        r3 = new JRadioButton("Others");
        r3.setBounds(300, 320, 80, 30);
        r1.setSelected(true);
        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);
        add(r2);
        add(r3);
        l5 = new Label("Birth date : ");
        l5.setBounds(40, 380, 100, 30);
        add(l5);
        String days[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31",};
        String months[] = {"Jan", "feb", "march", "april", "may", "june", "july", "august", "sep", "oct", "nov", "dec"};
        String years[] = {"2022", "2021", "2020", "2019", "2018", "2017", "2002"};
        day = new JComboBox(days);
        month = new JComboBox(months);
        year = new JComboBox(years);
        day.setBounds(140, 380, 70, 30);
        add(day);
        month.setBounds(210, 380, 80, 30);
        add(month);
        year.setBounds(290, 380, 90, 30);
        add(year);
        term = new JCheckBox(" I accept the terms and conditions ");
        term.setBounds(40, 430, 320, 30);
        add(term);
        b = new Button("SUBMIT");
        b.setBounds(150, 500, 100, 50);
        b.addActionListener(this);
        b.setFont(new Font("Courier", Font.BOLD | Font.BOLD, 15));
        l.setFont(new Font("Courier", Font.BOLD | Font.BOLD, 12));
        l1.setFont(new Font("Courier", Font.BOLD | Font.BOLD, 12));
        l2.setFont(new Font("Courier", Font.BOLD | Font.BOLD, 12));
        l3.setFont(new Font("Courier", Font.BOLD | Font.BOLD, 12));
        l4.setFont(new Font("Courier", Font.BOLD | Font.BOLD, 12));
        l5.setFont(new Font("Courier", Font.BOLD | Font.BOLD, 12));
        screen = new JTextArea(50, 50);
        screen.setBounds(350, 80, 250, 200);
        screen.setFont(new Font("Courier", Font.BOLD | Font.BOLD, 14));
        add(screen);
        add(b);
        add(l);
        add(t);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (term.isSelected()) {
            String name = t.getText();
            String addr = t1.getText();
            String phone = t2.getText();
            String email = t3.getText();
            String gender = "male";
            if (r2.isSelected()) {
                gender = "female";
            }
            if (r3.isSelected()) {
                gender = "Others";
            }
            String dob = day.getSelectedItem() + "-" + month.getSelectedItem() + "-" + year.getSelectedItem();
            screen.setText("Name : " + name + "\n" + "Address : " + addr + "\n" + "Phone No: " + phone + "\n" + "Email: " + email + "\n" + "Gender : " + gender + "\n" + "DOB : " + dob + "\n");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Registration f = new Registration();
        f.setVisible(true);
        f.setSize(650, 600);
    }
}