package _015_debug.pratice;

import java.util.Scanner;

public class CalculationExample {
    static boolean flag = true;

    public static void main(String[] args) {

        do {
            flag = true;
            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter x: ");
            int x = scanner.nextInt();
            System.out.println("Please enter y: ");
            int y = scanner.nextInt();
            CalculationExample calc = new CalculationExample();
            calc.calculate(x, y);
        } while (!flag);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("X+Y = " + a);
            System.out.println("X-Y = " + b);
            System.out.println("X*Y = " + c);
            System.out.println("X/Y = " + d);
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            flag = false;
        }
    }
}
