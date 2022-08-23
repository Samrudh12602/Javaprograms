package com.samrudh.OOPS.FileHandling;
import java.io.*;
public class FrequencyOfFile {
    public static void main(String[] args) throws IOException {
        String input = "";
        File f= new File("X.txt");
        BufferedReader br= new BufferedReader(new FileReader(f));
        while(true){
            String lineRead= br.readLine();
            if(lineRead==null){
                break;
            }
            input+=lineRead;
        }
        int count=1;
        String[] s= input.split(" ");
        for(int i=0;i<s.length;i++){
            for(int j=i+1;j<s.length;j++){
                if(s[i].equals(s[j]) && s[i]!="-1")
                {
                    s[j]="-1";
                    count++;
                }
            }
            if(count>=1 && s[i]!="-1"){
                System.out.println(s[i]+" = "+count);
                s[i]="-1";
            }
            count =1;
        }
    }
}