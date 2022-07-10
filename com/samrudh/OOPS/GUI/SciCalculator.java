package com.samrudh.OOPS.GUI;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class SciCalculator extends JFrame implements ActionListener{
    Container c = getContentPane();
    JTextField input;
    String expression = "",op="";
    // All Buttons of the calculator
    String arr[] = {"Rad","10^","fact","(",")","%","clear",
            "asin","sin","sqrt","7","8","9","/",
            "acos","cos","ln","4","5","6","*",
            "atan","tan","log","1","2","3","-",
            "π","e","^","0",".","=","+"};
    int flag = 0; // Flag Variable for extracting operands from string expression
    boolean hasTwoOps = false;
    double num1 = 0,num2 = 0,ans=0; // Variables to store operands
    Vector<String> q = new Vector<String>(); // to store operations

    SciCalculator(){
        c = getContentPane();
        c.setLayout(null);

        input = new JTextField();
        input.setLocation(15, 5);
        input.setSize(540, 40);
        input.setEditable(false);
        input.setFont(new Font("Verdana", Font.PLAIN, 14));
        c.add(input);

        // Adding all buttons
        int x = 15, y = 15;
        for(int i=0;i<arr.length;i++){
            if(i % 7 == 0){
                y += 38;
                x = 15;
            }
            createButton(arr[i], x, y);
            x += 78;
        }
        c.setBackground(Color.BLACK);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(590, 280);
        setLocation(400, 200);
        setLayout(null);
        setResizable(false);
        setVisible(true);
    }
    public void createButton(String str,int x,int y){
        JButton btn = new JButton(str);
        btn.setSize(70,30);
        btn.setLocation(x,y);

        char ch = str.charAt(0);
        if(Character.isDigit(ch))
            btn.setBackground(Color.LIGHT_GRAY);
        else if(ch == '=')
            btn.setBackground(new Color(29, 111, 242));
        else
            btn.setBackground(Color.gray);
        btn.addActionListener(this);
        c.add(btn);
    }
    public boolean isOperator(char ch){
        if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^'||ch=='%')
            return true;
        return false;
    }
    public void calc(double n1,double n2,String ops){
        switch(ops){
            case "+":
                ans =  n1 + n2;
                break;
            case "-":
                ans =  n1 - n2;
                break;
            case "*":
                ans =  n1 * n2;
                break;
            case "/":
                ans =  n1 / n2;
                break;
            case "^":
                ans = Math.pow(num1, num2);
                break;
            case "%":
                ans = num1/100 * num2;
        }
    }
    public double solveTranscendental(double n,String s){
        switch(s){
            case "sin":
                return Math.sin(Math.toRadians(n));
            case "asin":
                return Math.asin(Math.toRadians(n));
            case "cos":
                return Math.cos(Math.toRadians(n));
            case "acos":
                return Math.acos(Math.toRadians(n));
            case "tan":
                return Math.tan(Math.toRadians(n));
            case "atan":
                return Math.atan(Math.toRadians(n));
            case "log":
                return Math.log10(n);
            case "ln":
                return Math.log(n);
            case "sqrt":
                return Math.sqrt(n);
            case "fact":
                double temp = n,res=1;
                while(temp!=0) res *= temp--;
                return res;
            default:
                return -0.1f;
        }
    }
    public void checkTranscendental(){
        if(q.size() == 1){
            String opr1 = q.firstElement();
            int index=0;
            for(int i=0;i<expression.length();i++){
                if(isOperator(expression.charAt(i))){
                    index = i; break;
                }
            }
            if(expression.substring(0, index).contains(opr1))
                num1 = solveTranscendental(num1,opr1);
            else
                num2 = solveTranscendental(num2, opr1);
        }
        else if(q.size()==2){
            String opr1 = q.firstElement();
            String opr2 = q.lastElement();
            num1 = solveTranscendental(num1,opr1);
            num2 = solveTranscendental(num2,opr2);
        }
    }
    public void actionPerformed(ActionEvent e){
        Object o = e.getSource();
        JButton b = null;
        String buttonText = "";

        if(o instanceof JButton)
            b = (JButton)o;
        if(b != null)
            buttonText = b.getText();

        if(buttonText == "clear"){
            expression = "";
            num1 = num2 = ans = 0;
            q.clear();
            hasTwoOps = false;
            input.setText(expression);
        }
        else if(isOperator(buttonText.charAt(0))){
            op = ""+buttonText.charAt(0);
            if(num1 >= 0.00001){
                expression = String.valueOf(num1);
                q.clear();
            }
            expression += ' '+ op +' ';
            input.setText(expression);
        }
        else if(buttonText == "="){
            String temp = "";
            Boolean pi = false,expo = false;
            for(int i=0;i<expression.length();i++){
                char ch = expression.charAt(i);
                if(isOperator(ch)){
                    flag = 1;
                    break;
                }
                if(ch == 'π') pi = true;
                if(ch =='e') expo = true;
                if(ch != ' ' && !Character.isAlphabetic(ch))
                    temp += ch;
            }
            num1 = Double.valueOf(temp);
            if(pi) num1 = num1 * 3.14159;
            if(expo) num1 = num1 * 2.7183;

            // To Extract 2nd operand if exists
            pi = expo = false;
            if(flag == 1){
                flag = 0;
                temp = "";
                hasTwoOps = true;
                for(int j=0;j<expression.length();j++){
                    char ch = expression.charAt(j);
                    if(isOperator(ch)){
                        flag = 1;
                        continue;
                    }
                    if(expression.charAt(j) == 'π' && flag == 1)
                        pi = true;
                    if(expression.charAt(j) == 'e' && flag == 1)
                        expo = true;
                    if(flag == 1 && ch != ' ' && !Character.isAlphabetic(ch))
                        temp += expression.charAt(j);
                }
                flag = 0;
                num2 = Double.valueOf(temp);
                if(pi) num2 = num2 * 3.14159;
                if(expo) num2 = num2 * 2.718281;
                pi = expo = false;
            }

            if(hasTwoOps){
                checkTranscendental();
                calc(num1, num2, op);
            }
            else
                ans = solveTranscendental(num1, q.firstElement());
            num1 = ans;
            expression += " = " + String.valueOf(ans);
            input.setText(expression);
        }
        else if (Character.isDigit(buttonText.charAt(0))){
            expression += buttonText;
            input.setText(expression);
        }
        else if(buttonText == "π" || buttonText == "e" || buttonText == "."){
            expression += buttonText;
            input.setText(expression);
        }
        else{
            expression += ' ' + buttonText + ' ';
            q.add(buttonText);
            input.setText(expression);
        }
    }
    public static void main(String argvs[])   {
        new SciCalculator();
    }
}