package com.samrudh.OOPS.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPassword  {
    static int counter=0;
    public static void main(String[] args) {
        int pass=123456;
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);

        JLabel name_label = new JLabel("Name:");
        name_label.setBounds(40,40,100,50);
        frame.add(name_label);

        JLabel pass_label = new JLabel();
        pass_label.setText("Password:");
        pass_label.setBounds(30,100,100,50);
        frame.add(pass_label);

        JTextField name= new JTextField();
        name.setBounds(100,40,200,50);
        frame.add(name);

        JPasswordField passwordField= new JPasswordField();
        passwordField.setBounds(100,100,200,50);
        frame.add(passwordField);

        Button b = new Button();
        b.setBounds(320,100,75,50);
        b.setLabel("View");
        frame.add(b);


        Button login = new Button();
        login.setBounds(175,200,100,50);
        login.setLabel("Login");
        frame.add(login);


        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("View")){
                    counter++;
                    if(counter%2==0)
                        passwordField.setEchoChar('*');
                    else
                        passwordField.setEchoChar((char)0);
                }else if(e.getActionCommand().equalsIgnoreCase("Login")){
                    if((passwordField.getText().toString().equalsIgnoreCase(String.valueOf(pass)))&&name.getText().toString().equalsIgnoreCase("samrudh")){
                        JDialog dialog= new JDialog(frame,"Dialogue 1");
                        dialog.setSize(400,400);
                        dialog.setVisible(true);
                        Label l = new Label("Login Successful \n Username: "+name.getText().toString() +"\n Password:"+passwordField.getText().toString());
                        dialog.add(l);
                    }else{
                        JDialog dialog= new JDialog(frame,"Dialogue 1");
                        dialog.setSize(300,300);
                        dialog.setVisible(true);
                        Label l= null;
                        if((!passwordField.getText().toString().equalsIgnoreCase(String.valueOf(pass)))&&(!name.getText().toString().equalsIgnoreCase("samrudh"))){
                            l = new Label("Login Failed");
                        }else if(!name.getText().toString().equalsIgnoreCase("samrudh")){
                            l = new Label("Login Failed due to incorrect Name");
                        }else if(!passwordField.getText().toString().equalsIgnoreCase(String.valueOf(pass))){
                            l = new Label("Login Failed due to incorrect Password");
                        }
                        dialog.add(l);
                    }
                }
            }
        };
        b.addActionListener(actionListener);
        login.addActionListener(actionListener);
        frame.setVisible(true);
    }
}
