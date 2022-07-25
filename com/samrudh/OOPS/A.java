package com.samrudh.OOPS;
public class A {
    public A() {
    }
}
interface D{
    public static final int value1=5;
}
interface E extends D{
    public static final int value2=10;
}
class B extends A implements E{
    public B() {
        super();
    }
}
class C extends B{
    static int result;
    public C() {
        super();
        calculateResult();
    }
    public void calculateResult(){
        result=value1*value2;
        System.out.println(result);
    }
    public static void main(String[] args) {
        C c= new C();
    }
}