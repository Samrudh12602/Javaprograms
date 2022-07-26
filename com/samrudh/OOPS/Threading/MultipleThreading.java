package com.samrudh.OOPS.Threading;

public class MultipleThreading implements Runnable{
    @Override
    public void run(){
        System.out.println("Task 1");
        System.out.println(Thread.currentThread().getName());
    }
}
class Thread2 extends Thread{
    @Override
    public void run(){
        System.out.println("Task 2");
        System.out.println(Thread.currentThread().getName());
    }
}
class T {
    public static void main(String[] args) {
        MultipleThreading t1= new MultipleThreading();
        Thread t= new Thread(t1);
        t.start();
        Thread2 t2= new Thread2();
        t2.start();
        Thread2 t4= new Thread2();
        t4.start();
        MultipleThreading t3= new MultipleThreading();
        Thread thread = new Thread(t3);
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }
}