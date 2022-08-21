package com.samrudh.myPack;
public class TheatreApp {
    static int seat_cap=20;
    static synchronized  void bookSeat(String name,int seats){
        if(seat_cap>=seats){
            System.out.println(name+" Booked "+seats+" seats succesfully");
            seat_cap-=seats;
            System.out.println("Available Seats = "+ seat_cap);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(name+" Could not book seats");
            System.out.println("Available Seats =" +seat_cap);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class BookSeat extends Thread{
    TheatreApp theatre;
    String name;
    int seats;

    BookSeat(TheatreApp theatre,String name,int seats){
        this.theatre=theatre;
        this.name=name;
        this.seats=seats;
    }
    public void run(){theatre.bookSeat(name,seats);}
}
class Book{
    public static void main(String[] args) {
        TheatreApp t= new TheatreApp();
        BookSeat b= new BookSeat(t,"Samrudh",10);
        BookSeat b1= new BookSeat(t,"Edgar",6);
        BookSeat b2= new BookSeat(t,"Abhinav",2);
        BookSeat b3= new BookSeat(t,"Shantaksh",7);
        b.start();
        b1.start();
        b2.start();
        b3.start();
    }
}
