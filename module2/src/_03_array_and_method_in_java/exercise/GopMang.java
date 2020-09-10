package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] array1,array2,array3;
        array1=inputArray(3);
        array2=inputArray(3);
        displayArray(array1);
        displayArray(array2);


        array3=new int[array1.length+array2.length];
        for(int i = 0; i<array1.length; i++){
            array3[i]=array1[i];
        }
        for(int i = 0;i<array2.length;i++){
            array3[array1.length+i]=array2[i];
        }
        System.out.println("");
        displayArray(array3);
    }

    public static int[] inputArray(int size) {
        int[] array;
        array = new int[size];
        Scanner sc=new Scanner(System.in);

       for(int i =0; i<3;i++){
           System.out.println("enter element: "+(i+1));
           array[i] =sc.nextInt();
       }
        return array;
    }

    public static void displayArray(int[]array) {
        for(int i =0;i<array.length;i++){
            System.out.print(array[i]+"\t");
    }
        System.out.println(" ");
}
}
