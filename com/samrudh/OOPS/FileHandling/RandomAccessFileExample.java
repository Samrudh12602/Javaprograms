package com.samrudh.OOPS.FileHandling;

import java.io.*;

public class RandomAccessFileExample {
    static final String FILEPATH ="myFile.txt";
    static File f= new File("myFile.txt");
    public static void main(String[] args) {
        try {
            for(int i=1;i<=10;i++)
                writeToFile(FILEPATH,String.valueOf(10*i)+"\n",Math.toIntExact(f.length()));
            System.out.println(new String(readFromFile(FILEPATH, 0, Math.toIntExact(f.length()))));
            for(int i=1;i<=10;i++)
            writeToFile(FILEPATH,String.valueOf(12*i)+"\n" , Math.toIntExact(f.length()));
            System.out.println(new String(readFromFile(FILEPATH, 0, Math.toIntExact(f.length()))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static byte[] readFromFile(String filePath, int position, int size)
            throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }
    private static void writeToFile(String filePath, String data, int position)
            throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }
}