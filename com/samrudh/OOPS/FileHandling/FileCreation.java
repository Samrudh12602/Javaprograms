package com.samrudh.OOPS.FileHandling;

import java.io.*;

public class FileCreation {
    public static void main(String[] args) throws IOException {
//        try {
//            File f= new File("input.txt");
//            FileWriter fileWriter= new FileWriter("input.txt");
//            fileWriter.write("this is my first file contents\nThis is Sams second line");
//            fileWriter.close();
//            FileReader fileReader= new FileReader("input.txt");
//            int i;
//            while ((i=fileReader.read())!=-1){
//                System.out.print((char)i);
//            }
//            System.out.println("");
//            Scanner s= new Scanner(f);
//            while(s.hasNextLine()){
//                System.out.println(s.nextLine());
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        try {
            FileWriter fileWriter= new FileWriter("output.txt");
            BufferedReader fileReader= new BufferedReader(new FileReader("input.txt"));
            int sum=0;
            int i;
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
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
