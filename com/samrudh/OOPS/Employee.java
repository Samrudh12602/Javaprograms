package com.samrudh.OOPS;
import java.util.*;
class Employee{
    String name; long mob; int id; float bas;
    Scanner s= new Scanner(System.in); void getdata() {
        System.out.print("\nEnter the Employee name : "); name=s.next();
        System.out.print("\nEnter the Employee ID : "); id=s.nextInt();
        System.out.print("\nEnter the Employee phone no. : "); mob=s.nextLong();
        System.out.print("\nEnter the basic salary in Rs : "); bas=s.nextFloat();
    }
    void display() {
        double hra,da,ta,gross,gpf,tax; da=0.34*bas;
        hra=0.18*(da+bas); ta=3600+(0.34*3600);
        gross=bas+da+ta+hra; gpf=0.1*gross; tax=0.2*gross;
        System.out.print("\nEmployee Name : "+name); System.out.print("\nEmployee phone no. : "+mob); System.out.print("\nEmployee ID : "+id); System.out.print("\nEmployee Basic Salary : "+bas); System.out.print("\nDA : Rs "+da); System.out.print("\nHRA : Rs "+hra); System.out.print("\nTA : Rs "+ta); System.out.print("\nGross : Rs "+gross); System.out.print("\nGPF : Rs "+gpf); System.out.print("\nTax : Rs "+tax); System.out.print("\nDeduction : Rs "+(gpf+tax)); System.out.println("\nNet : Rs "+(gross-gpf-tax));
    }
}

class PaySlip {
    public static void main(String[] args) { Scanner s=new Scanner(System.in); Employee a[]=new Employee[10]; int n;
        System.out.print("\nEnter the no. of pay slips you want to generate :     ");
        n=s.nextInt();
        for(int i=0;i<n;i++) {
            System.out.print("\nEnter the details of employee "+(1+i)+" :\n");
            a[i]=new Employee();
            a[i].getdata();

            System.out.print("\n***************************************************"); System.out.print("\n	PAY SLIP"); System.out.print("\n***************************************************\n");
            a[i].display();
        }
        s.close();
    }

}

