package com.samrudh.OOPS;

public class SingleInheritance {
    int a;
    String b;
    SingleInheritance(int a,String b){
        this.a=a;
        this.b=b;
    }
}
class B1 extends SingleInheritance{
    int a1;
    String b1;
    B1(int a, String b,int a1, String b1) {
        super(a, b);
        this.a1=a1;
        this.b1=b1;
    }
    void display(){
        System.out.println(super.a+" "+super.b+" "+a1+" "+b1+" ");
    }
    public static void main(String[] args) {
        B1 bit= new B1(10,"Sam",20,"Samrudh");
        bit.display();
    }
}
