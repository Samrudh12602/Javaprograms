package com.samrudh.OOPS;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int num,fact=1;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number to find Factorial of:");
        num=s.nextInt();
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+num+" is : "+ fact);
    }
}
