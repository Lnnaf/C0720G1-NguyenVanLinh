package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int x, index;
        int[] array;
        array = new int[]{10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        x = sc.nextInt();
        do {
            System.out.println("Enter index");
            index = sc.nextInt();
        } while (index <= 1 || index >= array.length-1);

        //push element
        for(int j=array.length-1;j>index;j--){
            array[j]=array[j-1];
        }
        //replace element x

        array[index]=x;

        for(int k = 0; k <array.length;k++){
            System.out.print(array[k]+"\t");
        }

}
}
