package _04_class_object_in_java.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b , double c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        return Math.pow(getB(),2)-4*getA()*getC();
    }
    public double getRoot1(){
        return (-getB()+Math.sqrt(Math.pow(getB(),2)-4*getA()*getC()))/2*getA();
    }
    public double getRoot2(){
        return (-b-Math.sqrt(Math.pow(getB(),2)-4*getA()*getC()))/2*getA();
    }

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(3,2,3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
         double numA= sc.nextDouble();
         quadraticEquation.setA(numA);
        System.out.println("Enter b: ");
        double numB = sc.nextDouble();
        quadraticEquation.setB(numB);
        System.out.println("Enter c: ");
        double numC = sc.nextDouble();
        quadraticEquation.setC(numC);

        System.out.println("Delta is: "+quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant()==0){
            System.out.println("Root is: "+(-quadraticEquation.getB())/(2*quadraticEquation.getA()));
        }else if (quadraticEquation.getDiscriminant()>0){
            System.out.println("Root 1 is: "+ quadraticEquation.getRoot1());
            System.out.println("Root 2 is: "+ quadraticEquation.getRoot2());
        }else{
            System.out.println("Has no root");
        }
    }
}
