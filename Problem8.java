package Practice_4Pillars;

/*
Design a 'Shape' superclass with a method 'area'. Create subclasses 'Circle', 'Rectangle', and 'Triangle', each overriding the 'area' method.
Write a program to calculate and display the area of each shape using polymorphism.
 */

import java.util.Scanner;
import java.util.concurrent.TransferQueue;

class Shape{
    float area;
    Scanner sc=new Scanner(System.in);
    void Area(){
        System.out.println("Area Calculator");
    }
}

class Circle extends Shape{
    float radius;
    Circle(){
        System.out.println("Enter radius: ");
        radius = sc.nextFloat();
    }

    void Area(){
        super.Area();
        area = 3.14f*radius*radius;
        System.out.println("Area of Circle: "+area);
    }
}

class Rectangle extends Shape{
    float length;
    float width;
    Rectangle(){
        System.out.println("Enter length and width : ");
        length = sc.nextFloat();
        width = sc.nextFloat();
    }

    void Area(){
        area = length * width;
        System.out.println("Area of Rectangle: "+area);
    }

}

class Triangle extends Shape{
    float base;
    float height;
    Triangle(){
        System.out.println("Enter Base and Height: ");
        base = sc.nextFloat();
        height = sc.nextFloat();
    }

    void Area(){
        area = 0.5f*base*height;
        System.out.println("Area of Triangle: "+area);
    }
}


public class Problem8 {
    public static void main(String[] args) {
        Circle cr = new Circle();
        cr.Area();
        System.out.println();

        Rectangle rt = new Rectangle();
        rt.Area();
        System.out.println();

        Triangle tr = new Triangle();
        tr.Area();
    }
}
