package _02_loop_in_java.pratice;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number =sc.nextInt();
        boolean check = true;
        if (number<2){
            System.out.println("is not a Prime number");
        }else {
            int i = 2;

            while (i<= Math.sqrt(number)){
                if (number % i == 0){
                    check = false;
                    break;
                }
            }i++;
        }
        if(check){
            System.out.println(number+" is a prime number");
        }else{
            System.out.println(number+ " is Not a prime number");
        }
    }

}
