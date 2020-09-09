package _02_loop_in_java.pratice;

import java.util.Scanner;

public class DisplayPrimeNumLessThan100 {
    public static void main(String[] args) {
        int  N=2;
        while (N<100){
            if(checkPrimeNumber(N)){
                System.out.print(N+"\t");
            }
            N++;
        }
    }

    public static boolean checkPrimeNumber(int N) {
        if( N< 2 ){
            return false;
        }
        int sqrt = (int) Math.sqrt(N);
        for(int i = 2; i <=sqrt; i++){
            if (N%i == 0){
                return false;
            }
        }
        return true;
    }
}



