package com.samrudh.OOPS.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputOutputOperations {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream fis= new FileInputStream("input.txt");
            int data;
            while((data=fis.read())!=-1){
                System.out.print((char)data);
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
