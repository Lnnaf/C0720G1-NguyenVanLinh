package introduction_to_java_01.pratice;

import java.util.Scanner;

public class CaculatedWeight {
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner sc = new Scanner(System.in);

        System.out.println("Your weight (Kilogram): ");
        weight = sc.nextDouble();
        System.out.println("Your height (Meter): ");
        height = sc.nextDouble();

        bmi = weight/Math.pow(height,2);

        System.out.printf("%-20s%s","bmi","Interpretation\n");

        if(bmi <18) {
            System.out.printf("%-20s%s",bmi, "Underweight");
        }else if (bmi< 25.0){
            System.out.printf("%-20s%s",bmi, "Normal");
        }else if (bmi < 30.0){
            System.out.printf("%-20s%s",bmi,"Overweight");
        }else{
            System.out.printf("%-20s%s", bmi,"Obese");
        }
    }
}
