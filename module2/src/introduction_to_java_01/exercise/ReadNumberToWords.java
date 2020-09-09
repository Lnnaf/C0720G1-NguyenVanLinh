package introduction_to_java_01.exercise;

import java.util.Scanner;

public class ReadNumberToWords {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        number=sc.nextInt();
         if(number <= 10 && number >= 0){
             switch (number){
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
         }else if(number >10 && number <99){

         }
    }
}
