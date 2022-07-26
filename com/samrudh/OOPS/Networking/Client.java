package com.samrudh.OOPS.Networking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client extends JFrame implements ActionListener {
    static JTextArea msg_area;
    JTextField msg_text;
    JButton msg_send;
    JLabel jLabel1;
    Container c;

    static Socket s;
    static DataInputStream dis;
    static DataOutputStream dout;

    Client(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);

        jLabel1 = new JLabel("Client");
        jLabel1.setForeground(Color.white);
        jLabel1.setFont(new Font("Tahoma",Font.BOLD,18));
        jLabel1.setLocation(10, 10);
        jLabel1.setSize(90, 20);
        c.add(jLabel1);

        msg_area = new JTextArea();
        msg_area.setLocation(15, 40);
        msg_area.setEditable(false);
        msg_area.setSize(455,370);
        c.add(msg_area);

        msg_text = new JTextField();
        msg_text.setFont(new Font("Tahoma",Font.ITALIC,15));
        msg_text.setLocation(15, 420);
        msg_text.setSize(370, 30);
        c.add(msg_text);

        msg_send = new JButton("Send");
        msg_send.setLocation(395, 420);
        msg_send.setSize(70,30);
        msg_send.addActionListener(this);
        c.add(msg_send);

        setResizable(false);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == msg_send){
            try{
                String msg = "",temp = "";
                msg = temp = msg_text.getText();
                msg_area.setText(msg_area.getText() + "\n You : " + temp);
                dout.writeUTF(msg);
                msg_text.setText("");
            }
            catch(Exception excep){
                System.out.println(excep);
            }
        }
    }
    public static void main(String[] args) {
        Client GUI =  new Client();
        try {
            String msgin = "";

            s = new Socket(InetAddress.getByName(args[0]),Integer.valueOf(args[1]));
            dis = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());

            while (!msgin.equals("exit")) {
                msgin = dis.readUTF();
                msg_area.setText(msg_area.getText()+"\n Server : " + msgin);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
