package _02_loop_in_java.pratice;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a: ");
        a = sc.nextInt();
        System.out.println("enter b: ");
        b = sc.nextInt();

        a=Math.abs(a);
        b=Math.abs(b);

        if (a == 0 || b == 0){
            System.out.println("No greatest common factor");
        }
        while (a != b){
            if(a > b){
                a = a - b;
            }else{
                b = b - a;
            }

        }
        System.out.println("Result: "+a);
    }
}
