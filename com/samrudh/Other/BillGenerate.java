package com.samrudh.Other;
import java.util.Scanner;
class Billgenerate {
    static Scanner s= new Scanner(System.in);
    private String name;
    private int quantity;
    private int n,item_no=0;
    private float total_amt =0,price=0;
    private static float final_amt=0;
    public Billgenerate(int item_no,String name,float price, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.item_no = item_no;
        this.price = price;
        this.total_amt=this.price*this.quantity;
        final_amt+=total_amt;
    }
    public void display() {
        System.out.println("  "+item_no+"\t\t "+name+"\t\t "+price+"\t\t "+quantity+"\t\t\t"+total_amt);
    }
    public static void main(String[] args) {
        int n=1000,num;
        String item_name;
        float item_price;
        int qty;
        Billgenerate b[]= new Billgenerate[n];
        System.out.println("Enter the number of items:");
        num=s.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println("Enter the name of item "+i);
            s.nextLine();
            item_name=s.nextLine();
            System.out.println("Enter the price of item "+i);
            item_price=s.nextFloat();
            System.out.println("Enter the Quantity of item "+i);
            qty=s.nextInt();
           b[i-1]=new Billgenerate(i,item_name,item_price,qty);
        }
        System.out.println("\n\t\t.........BILL REPORT........\t\t");
        System.out.println("It No \t Item Name \t Price \t Quantity \t Total Amount");
//        b[0]=new Billgenerate(1,"Sugar",40,4);
//        b[1]= new Billgenerate(2,"Tea",50,2);
//        b[2]= new Billgenerate(3,"Clove",10,3);
//        b[3]= new Billgenerate(4,"Ginger",15,5);
        for(int i=0;i<num;i++)
            b[i].display();
        System.out.println("\t\t\t\t\t\t\t  Final Amount: "+final_amt);
    }
}