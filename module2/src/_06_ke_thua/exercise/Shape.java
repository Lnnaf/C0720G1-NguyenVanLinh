package _06_ke_thua.exercise;

import java.util.Scanner;

public class Shape {
    String color= "Black";

    public Shape() {
    }
    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
class Triangle extends Shape{
    private double side1 =1.0, side2 = 1.0, side3 = 1.0;
    public Triangle(){
    }
    private Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
    double getArea(){
        double p = (side1+side2+side3)/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    @Override
    public String toString() {
        return "Triangle color= " + color + '\'' +
                ", side1 = " + side1 +
                ", side2 = " + side2 +
                ", side3 = " + side3 +
        " area is: "+getArea();
    }
}
class TestShape{
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1: ");
        triangle.setSide1(sc.nextDouble());
        System.out.println("Enter side 2: ");
        triangle.setSide2(sc.nextDouble());
        System.out.println("Enter side 3: ");
        triangle.setSide3(sc.nextDouble());
        System.out.println("Enter Color");
        sc.nextLine();
        triangle.setColor(sc.nextLine());
        System.out.println(triangle);
    }
}