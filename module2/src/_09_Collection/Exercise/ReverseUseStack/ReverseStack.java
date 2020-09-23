package _09_Collection.Exercise.ReverseUseStack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public ReverseStack() {
    }

    public static void reverseStack(){
        Scanner scanner = new Scanner(System.in);
        Stack stackBegin = new Stack();
        System.out.println("Enter quantum of Number  ");
        int quantumOfNumber = scanner.nextInt();
        for(int index = 0; index < quantumOfNumber; index++){
            System.out.println("enter number "+"at "+ (index+1)+ ": " );
            stackBegin.push(scanner.nextInt());
        }



        System.out.println("Stack begin: "+stackBegin);
        Stack stackEnd = new Stack();
        while (!stackBegin.isEmpty()){
            stackEnd.push(stackBegin.pop());
        }
        System.out.println("Stack End: "+stackEnd);
    }
    public static void reverseWordStack(){
        Scanner scanner = new Scanner(System.in);
        Stack wStackBegin = new Stack();
        System.out.println("Enter String: ");
        String[] inputStringArray = scanner.nextLine().split(" ");
        for(int index = 0;index< inputStringArray.length; index++){
            wStackBegin.push(inputStringArray[index]);
        }
        System.out.println("Stack begin: "+wStackBegin);
        Stack wStackEnd = new Stack();
        while (!wStackBegin.isEmpty()){
            wStackEnd.push(wStackBegin.pop());
        }
        System.out.println("Stack end: "+wStackEnd);

    }

    public static class RunSystem {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Reverse Integer: ");
            System.out.println("2. Reverse String: ");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    reverseStack();
                    break;
                case 2:
                    reverseWordStack();
                    break;
            }

            }

    }
}

