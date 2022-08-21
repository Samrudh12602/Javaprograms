package com.samrudh.myPack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class Server extends JFrame implements ActionListener {
    static JTextArea msg_area;
    JTextField msg_txt;
    JButton send;
    JLabel label1;
    Container c;
    static DataInputStream dis;
    static DataOutputStream dout;
    static Socket s;
    static ServerSocket ss;
    Server(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        c= getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);

        label1= new JLabel("Server");
        label1.setForeground(Color.WHITE);
        label1.setBounds(10,10,90,20);
        c.add(label1);

        msg_area= new JTextArea();
        msg_area.setBounds(15,40,455,370);
        msg_area.setEditable(false);
        c.add(msg_area);

        msg_txt = new JTextField();
        msg_txt.setBounds(15,420,370,30);
        c.add(msg_txt);

        send= new JButton("Send");
        send.setBounds(395,420,70,30);
        send.addActionListener(this);
        c.add(send);

        setResizable(false);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==send){
            try{
                String msg="",temp="";
                msg=temp= msg_txt.getText();
                msg_area.setText(msg_area.getText()+"\n You : "+temp);
                dout.writeUTF(msg);
                msg_txt.setText("");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Server GUI= new Server();
        try{
            String msgin="";
            ss= new ServerSocket(Integer.valueOf(args[0]));
            s= ss.accept();
            dis= new DataInputStream(s.getInputStream());
            dout=new DataOutputStream(s.getOutputStream());
            while(!msgin.equals("exit")){
                msgin= dis.readUTF();
                msg_area.setText(msg_area.getText()+"\n Client : "+msgin);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
