package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float rate = 23000;
        System.out.println("Enter number of money:");
        double result = rate*scanner.nextDouble();
        System.out.println(result + " VND");
    }
}
