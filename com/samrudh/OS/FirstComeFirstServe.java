package com.samrudh.OS;
public class FirstComeFirstServe {
    public static void main(String[] args) {
        int at = 0;
        float atat = 0, awt = 0;
        int ct[] = new int[5];
        int wt[] = new int[5];
        int rt[] = new int[5];
        int[] bt = new int[]{25, 03, 05, 07, 04};
        String[] table = {"p1", "p2", "p3", "p4", "p5"};
        for (int i = 0; i < bt.length; i++) {
            for (int j = 0; j <= i; j++) {
                ct[i] += bt[j];
            }
        }
        for (int i = 0; i < ct.length; i++) {
            wt[i] = ct[i] - bt[i];
        }
        int tat[];
        tat = ct;
        rt = wt;
        for (int i = 0; i < ct.length; i++) {
            atat += tat[i];
            awt += wt[i];
        }
        atat /= table.length;
        awt /= table.length;
        System.out.println("Process  BT   CT   TAT  WT  RT");
        for (int i = 0; i < bt.length; i++) {
            System.out.println("   " + table[i] + "    " + bt[i] + "   " + ct[i] + "   " + tat[i] + "   " + wt[i] + "   " + rt[i]);
        }
        System.out.println("");
        System.out.println("Average Turnaround Time: " + atat);
        System.out.println("Average Waiting Time: " + awt);
        System.out.println("");
        System.out.println("--------------------");
        for (int i = 0; i < bt.length; i++) {
            System.out.print("|" + table[i] + "|");
        }
        System.out.println("");
        System.out.println("--------------------");
    }
}


