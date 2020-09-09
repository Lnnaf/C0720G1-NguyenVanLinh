package _01_introduction_to_java.pratice;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a*x+b=0'," +
                "please enter constants: ");
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("a: ");
        a = scanner.nextDouble();
        System.out.println("b: ");
        b = scanner.nextDouble();
        System.out.println("c: ");
        c = scanner.nextDouble();


        if (a!=0){
            double answer = (c-b)/a;
            System.out.println("Equation pass with x = "+ answer);
        }else {
            if (b == 0){
                System.out.println("The solution is all x!");
            }else{
                System.out.println("No solution!");
            }
        }
    }
}
