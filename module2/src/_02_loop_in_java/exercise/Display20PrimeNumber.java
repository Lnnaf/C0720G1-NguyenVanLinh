package _02_loop_in_java.exercise;

import java.util.Scanner;

public class Display20PrimeNumber {
    public static void main(String[] args) {
        int  n=2, number;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        number= sc.nextInt();
        while (count<number){
            if(checkPrimeNumber(n)){

                System.out.print(n+"\t");
                count++;
            }
            n++;
        }
    }

    public static boolean checkPrimeNumber(int number) {
        if(number<2){
            return false;
        }
        int sqrt = (int) Math.sqrt(number);
        for(int i = 2; i <=sqrt; i++){
            if (number%i == 0){
                return false;
            }
        }
        return true;
    }
}


