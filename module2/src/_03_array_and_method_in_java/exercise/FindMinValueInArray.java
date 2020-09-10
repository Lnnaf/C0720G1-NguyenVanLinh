package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class FindMinValueInArray {
    public static void main(String[] args) {
        int size = 4;
        int[]array;
        array = inputArray(size);
        for(int i =0; i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        findMinValue(array);
    }

    public static int[] inputArray(int size) {
        int [] array;
        Scanner sc =new Scanner(System.in);
        array = new int[size];
        for (int i = 0; i <size;i++){
            System.out.println("Enter element:");
            array[i]=sc.nextInt();
        }
        return array;
    }

    public static void findMinValue(int[]array) {
        int min = 0;
        for(int i = 1; i <array.length;i++){
            min = array[0];
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println();
        System.out.println("Min value is: "+min);
    }
}
