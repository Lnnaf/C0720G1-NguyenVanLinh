package _03_array_and_method_in_java.practice;

import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {
        double F, C;
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Menu");
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter F");
                    F=sc.nextDouble();
                    System.out.println("Result F to C: "+fToC(F));
                    break;
                case 2:
                    System.out.println("Enter C");
                    C=sc.nextDouble();
                    System.out.println("Result C to F "+cToF(C) );
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }while (choice!=0);
    }

    public static double cToF(double C) {
    double F = (9.0/5)*C+32;
    return F;
    }

    public static double fToC(double F) {
    double C = (5.0/9)*(F-32);
    return C;
    }
}
