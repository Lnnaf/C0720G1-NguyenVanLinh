package _04_class_object_in_java.pratice;

import java.util.Scanner;

public class ClassRectangle {
     double width, height;
    public ClassRectangle(double width,double height) {
        this.width = width;
        this.height = height;

    }
    public double getArea(){
        return  this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
    public static class Ex14_1{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the width:");
            double width = scanner.nextDouble();
            System.out.print("Enter the height:");
            double height = scanner.nextDouble();
            ClassRectangle rectangle = new ClassRectangle(width, height);
            System.out.println(rectangle.display());
            System.out.println(rectangle.getArea());
            System.out.println(rectangle.getPerimeter());

        }
    }

}
