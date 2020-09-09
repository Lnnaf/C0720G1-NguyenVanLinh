package _02_loop_in_java.pratice;

import java.util.Scanner;

public class Display20PrimeNumber {
    public static void main(String[] args) {
        int count=0, N=2, number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        number= sc.nextInt();
        while (N<100){
            if(checkPrimeNumber(N)){
                System.out.print(N+"\t");
                count++;
            }
            N++;
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


