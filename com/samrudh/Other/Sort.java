package com.samrudh.Other;

import java.util.Scanner;

public class Sort {
    static int counter=0;
    public static void main(String[] args) {
        int array[];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        array= new int[size];
        System.out.println("Enter "+size+" elements in Array:");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
            sc.nextLine();
        }
        display(array);
        bubblesort(array);
        selectionsort(array);
        insertionsort(array);
    }
    public static void display(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
    }
    public static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static void bubblesort(int[] array){
        for(int lastunsortedindex=array.length-1;lastunsortedindex>0;lastunsortedindex--){
            for(int i=0;i<lastunsortedindex;i++){
                if(array[i]>array[i+1]){
                   swap(array,i,i+1);
                }
            }
        }
        System.out.println("\nArray after Bubble sort is:");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
    }
    public static void selectionsort(int[] array){
        counter=0;
        for(int lastunsortedindex= array.length-1;lastunsortedindex>0;lastunsortedindex--){
            int largest=0;
            counter++;
            for(int i=1;i<=lastunsortedindex;i++){
                if(array[i]>array[largest]){
                    largest=i;
                }
            }
            swap(array,largest,lastunsortedindex);
            System.out.println("\nArray after iteration "+counter +":");
            display(array);
        }
        System.out.println("\nArray after Selection sort is:");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
    }
    public static void insertionsort(int[] array){
        counter=0;
        for(int firstunsortedindex=1;firstunsortedindex<array.length;firstunsortedindex++){
            int newElement= array[firstunsortedindex];
            int i;
            for(i=firstunsortedindex;i>0 && array[i-1]>newElement;i--){
                array[i]=array[i-1];
            }
            array[i]=newElement;
            counter++;
            System.out.println("\nArray after iteration "+counter +":");
            display(array);
        }
        System.out.println("\nArray after Insertion sort is:");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
    }
    public static void RadixSort(int[] array,int radix, int width){
        for(int i=0;i<radix;i++){
            radixSingleSort(array,i,radix);
        }
    }
    private static void radixSingleSort(int[] array, int pos, int rad) {

        int numitems=array.length;

        int[] countarray= new int[rad];

        for(int value: array){
            countarray[getDigit(pos,value,rad)]++;
        }
        for(int j=1;j<rad;j++){
            countarray[j]+=countarray[j-1];
        }

        int[] temp= new int[numitems];
        for(int tempIndex=numitems-1;tempIndex>=0;tempIndex--){
            temp[--countarray[getDigit(pos,array[tempIndex],rad)]]=array[tempIndex];
        }
    }

    private static int getDigit(int pos, int value, int rad) {
        return value/ (int) Math.pow(10,pos) % rad;
    }

}
