package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class ReadNumberToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        short num = sc.nextShort();
        String str = Short.toString(num);
        String a, b, c, bc;
        int num2 = num % 100;
        switch (str.charAt(str.length() - 1)) {
            case '1':
                c = "one";
                break;
            case '2':
                c = "two";
                break;
            case '3':
                c = "three";
                break;
            case '4':
                c = "four";
                break;
            case '5':
                c = "five";
                break;
            case '6':
                c = "six";
                break;
            case '7':
                c = "seven";
                break;
            case '8':
                c = "eight";
                break;
            case '9':
                c = "nine";
                break;
            default:
                c = "";
        }
        if (num > 999) {
            System.out.println("out of ability");
        } else if (num == 0) {
            System.out.println("Zero");
        } else if (num >= 1 && num <= 9) {
            System.out.println(c);
        } else if (num >= 10 && num <= 99) {
            switch (str.charAt(str.length() - 2)) {
                case '2':
                    b = "twenty ";
                    break;
                case '3':
                    b = "thirty ";
                    break;
                case '4':
                    b = "forty ";
                    break;
                case '5':
                    b = "fifty ";
                    break;
                case '6':
                    b = "sixty ";
                    break;
                case '7':
                    b = "seventy ";
                    break;
                case '8':
                    b = "eighty ";
                    break;
                case '9':
                    b = "ninety ";
                    break;
                default:
                    b = "";
            }
            switch (num) {
                case 10:
                    bc = "Ten";
                    break;
                case 11:
                    bc = "Eleven";
                    break;
                case 12:
                    bc = "Twelve";
                    break;
                case 13:
                    bc = "Thirteen";
                    break;
                case 14:
                    bc = "fourteen";
                    break;
                case 15:
                    bc = "fifteen";
                    break;
                case 16:
                    bc = "sixteen";
                    break;
                case 17:
                    bc = "Seventeen";
                    break;
                case 18:
                    bc = "Eighteen";
                    break;
                case 19:
                    bc = "Nineteen";
                    break;
                default:
                    bc = b + c;
            }
            System.out.println(bc);
        } else if (num >= 100) {
            switch (str.charAt(str.length() - 3)) {
                case '1':
                    a = "One ";
                    break;
                case '2':
                    a = "Two ";
                    break;
                case '3':
                    a = "Three ";
                    break;
                case '4':
                    a = "Four ";
                    break;
                case '5':
                    a = "Five ";
                    break;
                case '6':
                    a = "Six ";
                    break;
                case '7':
                    a = "Seven ";
                    break;
                case '8':
                    a = "Eight ";
                    break;
                case '9':
                    a = "Nine ";
                    break;
                default:
                    a = "";
            }
            if (num % 100 == 0) {
                System.out.println(a + "hundred");
            } else {
                if (num2 >= 1 && num2 <= 9) {
                    System.out.println(a + "hundred and " + c);
                } else if (num2 >= 10) {
                    switch (str.charAt(str.length() - 2)) {
                        case '2':
                            b = "twenty ";
                            break;
                        case '3':
                            b = "thirty ";
                            break;
                        case '4':
                            b = "forty ";
                            break;
                        case '5':
                            b = "fifty ";
                            break;
                        case '6':
                            b = "sixty ";
                            break;
                        case '7':
                            b = "seventy ";
                            break;
                        case '8':
                            b = "eighty ";
                            break;
                        case '9':
                            b = "ninety ";
                            break;
                        default:
                            b = "";
                    }
                    switch (num2) {
                        case 10:
                            bc = "Ten";
                            break;
                        case 11:
                            bc = "Eleven";
                            break;
                        case 12:
                            bc = "Twelve";
                            break;
                        case 13:
                            bc = "Thirteen";
                            break;
                        case 14:
                            bc = "fourteen";
                            break;
                        case 15:
                            bc = "fifteen";
                            break;
                        case 16:
                            bc = "sixteen";
                            break;
                        case 17:
                            bc = "Seventeen";
                            break;
                        case 18:
                            bc = "Eighteen";
                            break;
                        case 19:
                            bc = "Nineteen";
                            break;
                        default:
                            bc = b + c;
                    }
                    System.out.println(a + "hundred and " + bc);
                }
            }
        }
    }
}