package com.samrudh.Other;
class Billgenerate {
    String name;
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
        Billgenerate b[]= new Billgenerate[3];
        System.out.println("\n\t\t.........BILL REPORT........\t\t");
        System.out.println("It No \t Item Name \t Price \t Quantity \t Total Amount");
        b[0]=new Billgenerate(1,"Sugar",40,4);
        b[1]= new Billgenerate(2,"Tea",50,2);
        b[2]= new Billgenerate(3,"Salt",25,3);
        for(int i=0;i<b.length;i++)
            b[i].display();
        System.out.println("github succesfully updated and executed");
        System.out.println("github ran succesfuly on MacBook");
        System.out.println("\t\t\t\t\t\t\t  Final Amount: "+final_amt);
    }
}