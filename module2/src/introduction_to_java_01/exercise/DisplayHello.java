package introduction_to_java_01.exercise;

import java.util.Scanner;

public class DisplayHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Hello: "+name);
    }
}
