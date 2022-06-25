package com.samrudh.OOPS.FileHandling;
import java.io.*;

public class CopyFileContents {
    public static void main(String[] args){
        try {
            FileWriter fileWriter= new FileWriter("output.txt");
            FileReader fileReader= new FileReader("input.txt");
            int i;
            while((i=fileReader.read())!=-1){
                fileWriter.write((char)i);
            }
            fileReader.close();
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
