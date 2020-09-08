package introduction_to_java_01.pratice;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a*x+b=0'," +
                "please enter constants: ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();


        if (a!=0){
            double solution = -b/a;
            System.out.println("The solution is "+ solution);
        }else {
            if (b == 0){
                System.out.println("Equation pass with x =");
            }
        }
    }
}
