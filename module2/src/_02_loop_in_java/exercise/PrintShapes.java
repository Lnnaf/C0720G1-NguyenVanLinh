package _02_loop_in_java.exercise;

import java.util.Scanner;

public class PrintShapes {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the triangle");
        System.out.println("3. Draw the isosceles triangle ");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("This is RECTANGLE");
                for(int i = 0; i < 3; i++){
                    for (int j = 0; j < 5; j++){
                        System.out.print("* ");
                    }
                    System.out.println("*");
                }
                break;
            case 2:
                for(int i = 1 ; i <=5 ; i++){
                    for(int j=1; j<i; j++){
                        System.out.print("* ");
                    }
                    System.out.println("*");
                }
                break;
            case 3:
                for (int i = 5; i >= 0; i--){
                    for (int j = 1; j<=i; j++){
                        System.out.print("* ");
                    }
                    System.out.println("*");
                }
                break;
            case 4:
                break;
        }

    }
}
