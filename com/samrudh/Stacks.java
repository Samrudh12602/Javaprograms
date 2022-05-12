package com.samrudh;
public class Stacks {
        private Employee[] stack;
        private int top=0;

    public Stacks( int capacity) {
        stack= new Employee[capacity];
    }
    public void push(Employee employee){
        if(top==stack.length){
            System.out.println("Stack Full, resizing Stack");
            Employee[] newStack= new Employee[2*stack.length];
            System.arraycopy(stack,0,newStack,0,stack.length);
            stack= newStack;
        }
        stack[top++]=employee;
    }
    public Employee pop(){
        if(isEmpty()) {
            System.out.println("Stack Empty");
            return null;
        }
        else{
            Employee employee= stack[--top];
            stack[top]=null;
            return employee;
        }
    }
    public boolean isEmpty(){
        if(top==0)
            return true;
        else return false;
    }
    public int size(){
        return stack.length;
    }
    public void printStack(){
        for(int i=top-1;i>0;i--){
            System.out.println(stack[i]);
        }
    }
}
