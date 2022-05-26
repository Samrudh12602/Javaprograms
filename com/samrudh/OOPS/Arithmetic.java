package com.samrudh.OOPS;

public class Arithmetic {
    void divide(int a, int b)
    {
        try{
            int res = a / b;
            System.out.println("Division process has been done successfully.");
            System.out.println("Result came after division is: " + res);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("Program execution Completed 1");
        }
    }
    void array(){
        int arr[]={1,2,3,4,5};
        try{
            System.out.println(arr[7]);
        }catch (ArrayIndexOutOfBoundsException e1){
            e1.printStackTrace();
        }finally {
            System.out.println("Program execution Completed 2");
        }
    }
    void nullp(){
        Object ref = null;

        try{
            ref.toString();
        }catch (NullPointerException e){
            e.printStackTrace();
        }finally {
            System.out.println("Program execution Completed 3");
        }
    }
    void num(){
        Object ref = null;
        try{
            int a = Integer.parseInt("sam");
        }catch (NumberFormatException e){
            e.printStackTrace();
        }finally {
            System.out.println("Program execution Completed 4");
        }
    }
    public static void main(String argvs[])
    {
        Arithmetic obj = new Arithmetic();
        obj.divide(1, 0);
        obj.array();
        obj.nullp();
        obj.num();
    }
}
