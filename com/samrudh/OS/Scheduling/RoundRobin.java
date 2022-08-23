package com.samrudh.OS.Scheduling;
import java.util.Scanner;
public class RoundRobin
{
    public static void main(String args[])
    {
        int n,i,qt,count,temp,sq=0,bt[],wt[],tat[],rem_bt[];
        float awt=0,atat=0;
        bt = new int[5];
        wt = new int[5];
        tat = new int[5];
        rem_bt = new int[5];
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of process (maximum 5) = ");
        n = s.nextInt();
        System.out.print("Enter the burst time of the process\n");
        for (i=0;i<n;i++)
        {
            System.out.print("P"+i+" = ");
            bt[i] = s.nextInt();
            rem_bt[i] = bt[i];
        }
        System.out.print("Enter the quantum time: ");
        qt = s.nextInt();
        while(true)
        {
            for (i=0,count=0;i<n;i++)
            {
                temp = qt;
                if(rem_bt[i] == 0)
                {
                    count++;
                    continue;
                }
                if(rem_bt[i]>qt)
                    rem_bt[i]= rem_bt[i] - qt;
                else if(rem_bt[i]>=0)
                {
                    temp = rem_bt[i];
                    rem_bt[i] = 0;
                }
                sq = sq + temp;
                tat[i] = sq;
                System.out.println("process "+ (i+1)+"executed for "+ sq +"seconds");
            }
            if(n == count)
                break;
        }
        System.out.print("\nProcess\tBurst Time\tTurnaround Time\tWaiting Time\n");
        for(i=0;i<n;i++)
        {
            wt[i]=tat[i]-bt[i];
            awt=awt+wt[i];
            atat=atat+tat[i];
            System.out.print("\n "+(i+1)+"\t\t\t"+bt[i]+"\t\t\t"+tat[i]+"\t\t\t "+wt[i]+"\n");
        }
        awt=awt/n;
        atat=atat/n;
        System.out.println("\nAverage waiting Time = "+awt+"\n");
        System.out.println("Average turnaround time = "+atat);
        System.out.println("-------------------------------------");
        System.out.println("|p1|p3|p1|p3|P2|P4|P1|P5|P3|P4|P1|P5|");
        System.out.println("-------------------------------------");
    }
}