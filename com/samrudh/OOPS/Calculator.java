package com.samrudh.OOPS;

import java.util.*;
class Calculator{
    public static void main(String[] args) {
        int input;
        int a,b;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        while(!exit){
            System.out.println("1: arithmetic \n2: Relational \n3: logical\n4: Bitwise\n5: exit");
            input = sc.nextInt();
            if(input == 1){
                System.out.println("Enter number 1: ");
                a = sc.nextInt();
                System.out.println("Enter number 2: ");
                b=sc.nextInt();
                System.out.println("1 -> Addition\n2 -> Substraction\n3 -> Multiply\n4 ->division\n");
                        System.out.println(a+" + "+b+" = "+(a+b));
                System.out.println(a+" - "+b+" = "+(a-b));
                System.out.println(a+" * "+b+" = "+(a*b));
                System.out.println(a+" / "+b+" = "+(a/b));
            }
            if(input == 2){
                System.out.println("Enter number 1: ");
                a = sc.nextInt();
                System.out.println("Enter number 2: ");
                b=sc.nextInt();
                System.out.println("1: equal to \n2: not equal to\n3: greater than\n4: greater than equal to \n5: less than \n6: less than equal to\n");
                System.out.println(a+ " = "+b +" -> "+(a==b));
                System.out.println(a+ " != "+b +" -> "+(a!=b));
                System.out.println(a+ " >= "+b +" -> "+(a>=b));
                System.out.println(a+ " > "+b +" -> "+(a>=b));
                System.out.println(a+ " < "+b +" -> "+(a<b));
                System.out.println(a+ " <= "+b +" -> "+(a<=b));
            }
            if(input == 3){
                System.out.println("Set a 1/0? ");
                boolean c = sc.nextBoolean();
                System.out.println("Set b 1/0? ");
                boolean d = sc.nextBoolean();
                System.out.println("1: AND \n2: OR\n3: NOT");
                System.out.println(c+" AND "+d+" => "+(c&&d));
                System.out.println(c+" OR "+d+" => "+(c||d));
                System.out.println(c+" NOT => "+(!c));
                System.out.println(d+" NOT => "+(!d));
            }
            if(input == 4){
                System.out.println("Enter number 1: ");
                a = sc.nextInt();
                System.out.println("Enter number 2: ");
                b=sc.nextInt();
                System.out.println("1: AND \n2: OR\n3: XOR\n4: Compliment");
                System.out.println(a+" & "+b+" -> "+(a&b));
                System.out.println(a+" | "+b+" -> "+(a|b));
                System.out.println(a+" ^ "+b+" -> "+(a^b));
                System.out.println(a+" ~ -> "+(~a));
                System.out.println(b+" ~ -> "+(~b));
            }
            if(input == 5){
                break;
            }
            System.out.println();
        }
    }
}