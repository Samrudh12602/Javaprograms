package com.samrudh.OOPS;
public class LL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head= null;

    public void addFirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head= new Node(data);
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head= newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printlist(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();
    }
}