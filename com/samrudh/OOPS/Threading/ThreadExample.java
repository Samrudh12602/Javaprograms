package com.samrudh.OOPS.Threading;

public class ThreadExample extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread "+i+" running iteration "+ i);
        }
    }

    public static void main(String[] args) {
        ThreadExample t1= new ThreadExample();
        ThreadExample t2= new ThreadExample();
        t1.start();
        t2.start();
    }
}
