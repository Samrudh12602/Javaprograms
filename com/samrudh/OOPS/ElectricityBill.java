package com.samrudh.OOPS;

import java.util.*; import java.time.*;
import java.time.format.DateTimeFormatter;

class Consumer{
    float pres,prev,units,bill; String name;
    long mob; int days,id;
    Scanner s=new Scanner(System.in);
    void getdata() {
        System.out.print("\nEnter the name of Consumer : "); name=s.next();
        System.out.print("\nEnter the Consumer ID : "); id=s.nextInt();
        System.out.print("\nEnter the consumer mobile no. : "); mob=s.nextLong();
        System.out.print("\nEnter the previous meter reading : "); prev=s.nextFloat();
        System.out.print("\nEnter the present meter reading : "); pres=s.nextFloat();
        System.out.print("\nEnter the bill period in days : "); days=s.nextInt();
    }
    void display() {
        units=pres-prev;
        System.out.print("\n***************************************************"); System.out.print("\n	ELECTRICITY BILL");
        System.out.print("\n***************************************************\n"); System.out.print("\nConsumer Name : "+name); System.out.print("\nConsumer ID : "+id);
        System.out.print("\nConsumer Mobile No. : "+mob); System.out.print("\nTotal units consumed in "+days+" days : "+units); LocalDate dt=LocalDate.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy"); System.out.print("\nBill date(dd-mm-yyyy) : "+dt.format(dtf)); Calendar c=Calendar.getInstance();
        c.add(Calendar.DATE,56);
        String ed=c.get(Calendar.DATE)+"-"+c.get(Calendar.MONTH)+"- "+c.get(Calendar.YEAR);
        System.out.print("\nLast date of payment(dd-mm-yyyy) : "+ed); if(units<=100)
            bill=units*10; else if(units<=200)
            bill=100*10+(units-100)*15;
        else
            bill=100*10+100*15+(units-200)*20;
        bill+=(0.15*bill); System.out.print("\nBill : Rs "+bill);
    }

}
class ElecBill {
    public static void main(String[] args) { Consumer a=new Consumer();
        char c;
        Scanner s=new Scanner(System.in); do {
            System.out.println("\nEnter the details"); a.getdata();
            a.display();
            System.out.print("\n\nDo you want to generate another bill y/n : "); c=s.next().charAt(0);
        }while(c=='y'); s.close();
    }
}
