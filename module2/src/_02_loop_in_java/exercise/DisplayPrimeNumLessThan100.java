package _02_loop_in_java.exercise;


public class DisplayPrimeNumLessThan100 {
    public static void main(String[] args) {
        int  n=2;
        while (n<100){
            if(checkPrimeNumber(n)){
                System.out.print(n+"\t");
            }
            n++;
        }
    }

    public static boolean checkPrimeNumber(int n) {
        if( n< 2 ){
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for(int i = 2; i <=sqrt; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}



