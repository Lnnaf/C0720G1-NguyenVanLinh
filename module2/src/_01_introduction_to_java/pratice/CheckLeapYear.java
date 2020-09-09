package _01_introduction_to_java.pratice;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter a year");
        year=sc.nextInt();

        if (year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(year+ " is a leap year");
                }else{
                    System.out.println(year+" is NOT a leap year");
                }
            }else{
                System.out.println(year+ " is a leap year");
            }
        }else{
            System.out.println(year+" is NOT a leap year");
        }
    }
}
