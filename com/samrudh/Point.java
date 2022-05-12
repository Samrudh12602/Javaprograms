package com.samrudh;

public class Point {
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
interface Shape{
    float pi= (float) 22/7;
}
class Rectangle extends  Point{
    int l,b;

    public Rectangle(int x, int y, int l, int b) {
        super(x, y);
        this.l = l;
        this.b = b;
    }
}
class Circle extends Rectangle implements Shape{
    int r;

    public Circle(int x, int y, int l, int b, int r) {
        super(x, y, l, b);
        this.r = r;
    }
    float calculate(){
        return r*r*pi;
    }
}
class Execute{
    public static void main(String[] args) {
        Circle c= new Circle(1,2,5,10,7);
        System.out.println(c.calculate());
    }

}


