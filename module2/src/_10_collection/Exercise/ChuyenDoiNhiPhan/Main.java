package _09_Collection.Exercise.ChuyenDoiNhiPhan;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    static Stack<Integer> stack = new Stack<Integer>();
     static void decimalToBinary(int number){
        while (number!=0){
            int result = number%2;
            stack.push(result);
            number/=2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input decimal: ");
        decimalToBinary(scanner.nextInt());
        System.out.print("binary number is: ");
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
