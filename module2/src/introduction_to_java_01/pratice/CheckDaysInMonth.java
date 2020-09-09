package introduction_to_java_01.pratice;

import java.util.Scanner;

public class CheckDaysInMonth {
    public static void main(String[] args) {
        int month;
        Scanner sc =new Scanner(System.in);
        System.out.println("which month that you want to count days?");
        month = sc.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("this month: "+month+ " ->>"+"have 31 days");
                break;
            case 2:
                System.out.println("this month: "+month+" ->>"+"have 28 or 29 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("this month: "+month+" ->>"+"have 30 days");
                break;
            default:
                System.out.println("Your input may wrong, please try from 1 to 12");

        }
    }
}
