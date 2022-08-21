package com.samrudh.OOPS.FileHandling;

import java.io.*;

public class FileCreation {
    public static void main(String[] args) {
        try {
            BufferedReader fileReader= new BufferedReader(new FileReader("input.txt"));
            int sum=0;
            while(true){
                String lineRead= fileReader.readLine();
                if(lineRead==null){
                    break;
                }
                int a= Integer.parseInt(lineRead);
                sum+=a;
            }
            System.out.println(sum);
            fileReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
