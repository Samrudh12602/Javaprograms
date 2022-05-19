package com.samrudh.OOPS;

public class Patterns {
    public static void pattern1(int n)
    {
        int i, j,num;
        for(i=0; i<n; i++)
        {
            num=1;
            for(j=0; j<=i; j++)
            {
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern2(int rows)
    {
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if(j%2 == 0)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern3(int rows)
    {
        for (int i = 1; i <= rows; i++)
        {
            int num;
            if(i%2 == 0)
            {
                num = 0;
                for (int j = 1; j <= rows; j++)
                {
                    System.out.print(num);
                    num = (num == 0)? 1 : 0;
                }
            }
            else
            {
                num = 1;
                for (int j = 1; j <= rows; j++)
                {
                    System.out.print(num);
                    num = (num == 0)? 1 : 0;
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern4(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) { System.out.print(k+" "); } System.out.println(); } for (int i = n-1; i >= 1; i--)
    {
        for (int j = 1; j < i; j++)
        {
            System.out.print(" ");
        }
        for (int k = i; k <= n; k++)
        {
            System.out.print(k+" ");
        }
        System.out.println();
    }
        System.out.println();
    }
    public static void main(String args[])
    {
        pattern1(7);
        pattern2(7);
        pattern3(7);
        pattern4(7);
    }
}
