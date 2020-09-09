package introduction_to_java_01.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ReadNumberToWords {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        number = sc.nextInt();
        if (number <= 10 && number >= 0) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
            }
        } else if (number > 10 && number < 20) {
            int num = number - 10;
            switch (num) {
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }
        } else if (number < 100 && number >= 20) {
            int num1 = number / 10;
            int num2 = number - num1*10;
            switch (num1) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
                if (num2 == 1) {
                    System.out.print(" one");
                }else if(num2==2){
                    System.out.print(" two");
            }else if(num2==3){
                    System.out.print(" three");
            }else if(num2==4){
                    System.out.print(" four");
            }else if(num2==5){
                    System.out.print(" five");
            }else if(num2==6){
                    System.out.print(" six");
            }else if(num2==7){
                    System.out.print(" seven");
            }else if(num2==8){
                    System.out.print(" eight");
            }else if(num2==9){
                    System.out.print(" nine");
            }
            }else if(number>100 && number <1000){
                int num = number / 100;
                int num1 = (number-num*100)/10;
                int num2 = number-num*100-num1*10;
                int num4=number-num;
                switch (num){
                    case 1:
                        System.out.print("one hundred and ");
                        break;
                        case 2:
                        System.out.print("two hundred and ");
                        break;
                        case 3:
                        System.out.print("three hundred and ");
                        break;
                        case 4:
                        System.out.print("four hundred and ");
                        break;
                        case 5:
                        System.out.print("five hundred and ");
                        break;
                        case 6:
                        System.out.print("six hundred and ");
                        break;
                        case 7:
                        System.out.print("seven hundred and ");
                        break;
                        case 8:
                        System.out.print("eight hundred and ");
                        break;
                        case 9:
                        System.out.print("nine hundred and ");
                        break;
                }

        }
        }
    }

